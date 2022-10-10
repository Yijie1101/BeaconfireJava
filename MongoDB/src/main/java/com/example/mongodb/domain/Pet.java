package com.example.mongodb.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pet {
  private String id;
  private String name;
  private String species;
}
