package com.example.duchps.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator",
            strategy = "com.example.duchps.utils.MyGenerator")
    @Column(name = "id")
    private Long id;
    @Column(name = "en_id")
    private Long enId;
    @Column(name = "text_en")
    private String textEn;
    @Column(name = "url")
    private String url;
    @Column(name = "vn_id")
    private Long vnId;
    @Column(name = "text_vi")
    private String textVi;
}
