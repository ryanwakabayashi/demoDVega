package com.example.demodvega;

import com.example.demodvega.model.Comment;
import com.example.demodvega.model.Link;
import com.example.demodvega.repository.CommentRepository;
import com.example.demodvega.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoDVegaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDVegaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting started SB2", "http://localhost/sb2");
            linkRepository.save(link);

            Comment comment = new Comment("SB2 is cool", link);
            commentRepository.save(comment);
            link.addComment(comment);
        };
    }
}
