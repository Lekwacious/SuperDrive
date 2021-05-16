package com.lekwacious.cloudstorage.services;

import com.lekwacious.cloudstorage.data.models.Credential;
import com.lekwacious.cloudstorage.data.payloads.request.CredentialRequest;
import com.lekwacious.cloudstorage.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CredentialService {
    MessageResponse createCredential(CredentialRequest credential);
    MessageResponse updateCredential(Integer credentialId, CredentialRequest credential);
    void deleteCredential(Integer credentialId);
    Credential readCredential(Integer credentialId);
    List<Credential> getAllCredentials();
}
