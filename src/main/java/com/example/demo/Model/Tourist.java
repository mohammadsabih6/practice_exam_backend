package com.example.demo.Model;

import java.sql.Date;

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
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String name;
    private String EmailAddress;
    private String Address;
    private String totalprice;
    private Date StartDate;
    private Date EndDate; 
    
}
