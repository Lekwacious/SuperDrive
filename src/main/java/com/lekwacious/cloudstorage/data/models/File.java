package com.lekwacious.cloudstorage.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer fileId;

    private String fileName;

    private String contentType;

    private String fileSize;

    @Lob
    private Blob fileData;

    @ManyToOne
    private User user;

}
