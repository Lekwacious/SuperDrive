package com.lekwacious.cloudstorage.data.payloads.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteRequest {
    @NotBlank
    @NotBlank
    @Size(max = 50)
    private String noteTitle;

    @Size(max = 400)
    private String  noteDescription;
}
