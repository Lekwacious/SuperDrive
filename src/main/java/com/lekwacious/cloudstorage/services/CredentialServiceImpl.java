package com.lekwacious.cloudstorage.services;

import com.lekwacious.cloudstorage.data.models.Credential;
import com.lekwacious.cloudstorage.data.models.File;
import com.lekwacious.cloudstorage.data.payloads.request.CredentialRequest;
import com.lekwacious.cloudstorage.data.payloads.response.MessageResponse;
import com.lekwacious.cloudstorage.data.repository.CredentialRepository;
import com.lekwacious.cloudstorage.exceptions.CredentialsException;
import com.lekwacious.cloudstorage.exceptions.NoteException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredentialServiceImpl implements CredentialService{
    private CredentialRepository credentialRepository;

    public CredentialServiceImpl(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    @Override
    public MessageResponse createCredential(CredentialRequest credential) {
        Credential newCredential = new Credential();
        newCredential.setUrl(credential.getUrl());
        newCredential.setUsername(credential.getUsername());
        newCredential.setPassword(credential.getPassword());
        credentialRepository.save(newCredential);

        return new MessageResponse("File created successfully");
    }

    @Override
    public MessageResponse updateCredential(Integer credentialId, CredentialRequest credential) throws CredentialsException {
        Credential newCredential = credentialRepository.findById(credentialId).orElseThrow(() -> new NoteException("No credential with " + credentialId + "ID found"));
        if (newCredential != null) {
            newCredential.setUrl(credential.getUrl());
            newCredential.setUsername(credential.getUsername());
            newCredential.setPassword(credential.getPassword());
            credentialRepository.save(newCredential);
        }
        return new MessageResponse("credential with "+ credentialId+ " updated successfully");
    }

    @Override
    public void deleteCredential(Integer credentialId) throws CredentialsException {
        Credential newCredential = credentialRepository.findById(credentialId).orElseThrow(() -> new NoteException("No credential with " + credentialId + "ID found"));
        if (newCredential!=null){
            credentialRepository.deleteById(credentialId);
        }

    }

    @Override
    public Credential readCredential(Integer credentialId) {
        return credentialRepository.findById(credentialId)
                .orElseThrow(() -> new NoteException("No Credential with " + credentialId + "ID found"));

    }

    @Override
    public List<Credential> getAllCredentials() {
        return credentialRepository.findAll();
    }
}
