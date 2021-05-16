package com.lekwacious.cloudstorage.services;

import com.lekwacious.cloudstorage.data.models.Note;
import com.lekwacious.cloudstorage.data.payloads.request.NoteRequest;
import com.lekwacious.cloudstorage.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface NoteService {
    MessageResponse createNote(NoteRequest note);
    MessageResponse updateNote(Integer noteId, NoteRequest note);
    void deleteNote(Integer noteId);
    Note readNote(Integer noteId);
    List<Note> getAllNote();
}
