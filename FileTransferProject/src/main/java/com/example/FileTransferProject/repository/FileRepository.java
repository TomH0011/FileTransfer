package com.example.FileTransferProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FileTransferProject.model.File;

public interface FileRepository extends JpaRepository<File, String> {
    File findByFileName(String fileName);
    File findByHashCode(String hashCode);
}
