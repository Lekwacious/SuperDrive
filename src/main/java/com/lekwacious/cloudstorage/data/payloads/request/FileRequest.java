package com.lekwacious.cloudstorage.data.payloads.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;
import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileRequest {

    private String fileName;

    private String contentType;

    private String fileSize;

    @Lob
    private Blob fileData;
}
