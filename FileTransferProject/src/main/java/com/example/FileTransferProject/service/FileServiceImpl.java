package com.example.FileTransferProject.service;

import com.example.FileTransferProject.model.File;
import com.example.FileTransferProject.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NameNotFoundException;

@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private FileRepository fileRepository;

    @Override
    public File findByFileName(String fileName) throws NameNotFoundException {
        File file = fileRepository.findByFileName(fileName);

        if (file == null) {
            throw new NameNotFoundException("File name was not found");
        }
        return file;
    }

    @Override
    public File findByHashCode(String hashCode) throws NameNotFoundException {
        File file = fileRepository.findByHashCode(hashCode);

        if (file == null) {
            throw new NameNotFoundException("File name was not found");
        }
        return file;
    }
}
