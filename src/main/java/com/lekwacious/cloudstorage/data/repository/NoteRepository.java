package com.lekwacious.cloudstorage.data.repository;

import com.lekwacious.cloudstorage.data.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
