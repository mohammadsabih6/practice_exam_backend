package com.example.demo.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String name;
    private String shortDesc;
    @Column(length=1500)
    private String longDesc;
    private String imgLink;
    private String location;
    private String experience;
    private boolean pool;
    private Integer price;
}
