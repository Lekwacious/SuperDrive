package com.lekwacious.cloudstorage.data.repository;

import com.lekwacious.cloudstorage.data.models.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential, Integer> {
}
