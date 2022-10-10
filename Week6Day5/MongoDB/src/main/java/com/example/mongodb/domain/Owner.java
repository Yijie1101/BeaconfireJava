package com.example.mongodb.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Document(collection = "Owner")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Owner {
  @Id
  private String id;

  private String name;

  private List<Pet> pets;

}
