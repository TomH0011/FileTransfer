package com.example.FileTransferProject.service;

import com.example.FileTransferProject.model.File;

import javax.naming.NameNotFoundException;

public interface FileService {

    public File findByFileName(String fileName) throws NameNotFoundException;

    public File findByHashCode(String hashCode) throws NameNotFoundException;
}
