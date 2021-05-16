package com.lekwacious.cloudstorage.web;

import com.lekwacious.cloudstorage.data.models.Note;
import com.lekwacious.cloudstorage.data.payloads.request.NoteRequest;
import com.lekwacious.cloudstorage.data.payloads.response.MessageResponse;
import com.lekwacious.cloudstorage.services.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller

public class NoteController {
    private NoteService  noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    @RequestMapping("/home")
    public String getHomePage(ModelMap modelMap){
        List<Note> allNotes = noteService.getAllNote();
        modelMap.put("allNotes", allNotes);
        return "home";
    }


    @PostMapping("/home")
    public String createNote(@ModelAttribute("newNote") NoteRequest newNote, Model model) {
        noteService.createNote(newNote);
        model.addAttribute("allNotes", noteService.getAllNote());
        newNote.setNoteTitle("");
        newNote.setNoteDescription("");
        return "home";
    }

}
