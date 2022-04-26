package com.file.converter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface IFileConverter {

    public String wordToPdfConverter(MultipartFile file);

    public String textToPdfConverter(MultipartFile file);

    public String excelToPdfConverter(MultipartFile file);

    public String pptToPdfConverter(MultipartFile file);

    public String jpgToPdfConverter(MultipartFile file);

}
