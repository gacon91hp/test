package com.example.duchps.service;

import com.example.duchps.model.Document;
import com.example.duchps.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private DocumentRepository documentRepository;
    public DocumentService(DocumentRepository documentRepository) {
    }

    public List<Document> Documents(){
        return documentRepository.findAll();
    }
}
