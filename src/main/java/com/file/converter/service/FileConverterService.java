package com.file.converter.service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Component
public class FileConverterService implements IFileConverter{

    private static final Logger log = LoggerFactory.getLogger(FileConverterService.class);


    @Override
    public String wordToPdfConverter(MultipartFile file) {
        return null;
    }

    @Override
    public String textToPdfConverter(MultipartFile file) {
        return null;
    }

    @Override
    public String excelToPdfConverter(MultipartFile file) {
        return null;
    }

    @Override
    public String pptToPdfConverter(MultipartFile file) {
        return null;
    }

    @Override
    public String jpgToPdfConverter(MultipartFile file) {
        return null;
    }
}


