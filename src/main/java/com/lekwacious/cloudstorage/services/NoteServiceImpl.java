package com.lekwacious.cloudstorage.services;

import com.lekwacious.cloudstorage.data.models.Note;
import com.lekwacious.cloudstorage.data.payloads.request.NoteRequest;
import com.lekwacious.cloudstorage.data.payloads.response.MessageResponse;
import com.lekwacious.cloudstorage.data.repository.NoteRepository;
import com.lekwacious.cloudstorage.exceptions.NoteException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteServiceImpl implements NoteService {
    private NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public MessageResponse createNote(NoteRequest note) {
        Note newNote = new Note(note.getNoteTitle(), note.getNoteDescription());
        noteRepository.save(newNote);
        return new MessageResponse("Note created successully");
    }

    @Override
    public MessageResponse updateNote(Integer noteId, NoteRequest note) throws NoteException {
        Note newNote = noteRepository.findById(noteId).orElseThrow(() -> new NoteException("No Note with such Id"));
        if (newNote != null) {
            newNote.setNoteTitle(note.getNoteTitle());
            newNote.setNoteDescription(note.getNoteDescription());
            noteRepository.save(newNote);
        }
        return new MessageResponse("Note updated successfully");
    }

    @Override
    public void deleteNote(Integer noteId) {
        noteRepository.deleteById(noteId);

    }

    @Override
    public Note readNote(Integer noteId) throws NoteException {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new NoteException("No Note with such Id"));


    }

    @Override
    public List<Note> getAllNote() throws NoteException {
        return noteRepository.findAll();
    }
}
