package com.study.board.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    @Column(name = "filename")
    private String fileName;
    @Column(name = "filepath")
    private String filePath;
}
