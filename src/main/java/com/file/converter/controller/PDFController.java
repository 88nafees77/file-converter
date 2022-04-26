package com.file.converter.controller;


import com.file.converter.service.FileConverterService;
import com.file.converter.service.IFileConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController()
@RequestMapping("/uploadFile")
public class PDFController implements IFileConverter {

    @Autowired
    private IFileConverter fileConverter;
    private static final Logger log = LoggerFactory.getLogger(PDFController.class);

    @Override
    @PostMapping("/word-to-pdf")
    public String wordToPdfConverter(@RequestParam("file") MultipartFile file) {
        return fileConverter.wordToPdfConverter(file);
    }

    @Override
    @PostMapping("/text-to-pdf")
    public String textToPdfConverter(MultipartFile file) {
        return fileConverter.textToPdfConverter(file);
    }

    @Override
    @PostMapping("/excel-to-pdf")
    public String excelToPdfConverter(@RequestParam("file") MultipartFile file) {
       return fileConverter.excelToPdfConverter(file);
    }

    @Override
    @PostMapping("/ppt-to-pdf")
    public String pptToPdfConverter(@RequestParam("file") MultipartFile file) {
        return fileConverter.pptToPdfConverter(file);
    }

    @Override
    @PostMapping("/jpg-to-pdf")
    public String jpgToPdfConverter(@RequestParam("file") MultipartFile file) {
        return fileConverter.jpgToPdfConverter(file);
    }
}