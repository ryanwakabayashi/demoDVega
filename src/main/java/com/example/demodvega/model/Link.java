package com.example.demodvega.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Link {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String url;

    @ManyToOne
    private Link link;
}
