package com.lekwacious.cloudstorage.services;

import com.lekwacious.cloudstorage.data.models.File;
import com.lekwacious.cloudstorage.data.models.Note;
import com.lekwacious.cloudstorage.data.payloads.request.FileRequest;
import com.lekwacious.cloudstorage.data.payloads.request.NoteRequest;
import com.lekwacious.cloudstorage.data.payloads.response.MessageResponse;
import com.lekwacious.cloudstorage.data.repository.FileRepository;
import com.lekwacious.cloudstorage.exceptions.NoteException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService{
    private FileRepository fileRepository;

    public FileServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public MessageResponse createFile(FileRequest file) {
        File newFile = new File();
        newFile.setFileName(file.getFileName());
        newFile.setContentType(file.getContentType());
        newFile.setFileSize(file.getFileSize());
        newFile.setFileData(file.getFileData());
        fileRepository.save(newFile);

        return new MessageResponse("File created successfully");
    }

    @Override
    public MessageResponse updateFile(Integer fileId, FileRequest file)  throws NoteException {
        File newFile = fileRepository.findById(fileId).orElseThrow(() -> new NoteException("No Note with " + fileId + "not found"));
        if (newFile != null) {
            newFile.setFileName(file.getFileName());
            newFile.setContentType(file.getContentType());
            newFile.setFileSize(file.getFileSize());
            newFile.setFileData(file.getFileData());
            fileRepository.save(newFile);
        }
        return new MessageResponse("Note updated successfully");
    }

    @Override
    public void deleteFile(Integer fileId) {
        fileRepository.deleteById(fileId);

    }

    @Override
    public File readFile(Integer fileId) {
        return fileRepository.findById(fileId)
                .orElseThrow(() -> new NoteException("No Note with " + fileId + "not found"));

    }

    @Override
    public List<File> getAllFile() {
        return fileRepository.findAll();
    }
}
