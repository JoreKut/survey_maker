package com.petproject.surveymaker.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sharedLink;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;
}
