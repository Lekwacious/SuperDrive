package com.lekwacious.cloudstorage.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer noteId;

    @NotBlank
    @NotBlank
    private String noteTitle;

    @Size(max = 400)
    private String  noteDescription;

    @ManyToOne
    private User user;


    public Note(String noteTitle, String noteDescription) {
        this.noteTitle = noteTitle;
        this.noteDescription =  noteDescription;
    }
}
