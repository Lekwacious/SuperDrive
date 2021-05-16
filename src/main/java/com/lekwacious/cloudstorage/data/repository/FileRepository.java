package com.lekwacious.cloudstorage.data.repository;

import com.lekwacious.cloudstorage.data.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Integer> {
}
