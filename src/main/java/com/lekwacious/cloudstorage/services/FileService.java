package com.lekwacious.cloudstorage.services;

import com.lekwacious.cloudstorage.data.models.File;
import com.lekwacious.cloudstorage.data.models.Note;
import com.lekwacious.cloudstorage.data.payloads.request.FileRequest;
import com.lekwacious.cloudstorage.data.payloads.request.NoteRequest;
import com.lekwacious.cloudstorage.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FileService {
    MessageResponse createFile(FileRequest file);
    MessageResponse updateFile(Integer fileId, FileRequest file);
    void deleteFile(Integer fileId);
    File readFile(Integer fileId);
    List<File> getAllFile();
}
