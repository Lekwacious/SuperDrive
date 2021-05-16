package com.lekwacious.cloudstorage.data.payloads.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CredentialRequest {
    private String url;

    private String username;
    private String password;
}
