package com.lekwacious.cloudstorage.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credentials")
public class Credential {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer credentialId;

    private String url;

    private String username;
    private String password;

    @ManyToOne
    private User user;
}
