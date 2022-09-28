package com.example.demodvega.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String body;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
}
