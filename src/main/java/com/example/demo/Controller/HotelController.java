package com.example.demo.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Hotel;
import com.example.demo.Model.Tourist;
import com.example.demo.Repo.HotelRepo;
import com.example.demo.Repo.TouristRepo;
@CrossOrigin("*")
@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelRepo hotelRepo;
    @Autowired
    private TouristRepo touristRepo;
    @PostMapping("/post")
    public Hotel postData(@RequestBody Hotel hotel){
        return hotelRepo.save(hotel);
    }
    @GetMapping("/get")
    public ResponseEntity<?> getData(){
        List<Hotel> hotel=hotelRepo.findAll();
        if(!hotel.isEmpty()){
            return ResponseEntity.ok(hotel);
        }
        else{
            String errorMessage = "Unable to get Counselor data";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getNyID(@PathVariable Long id) {
        Optional<Hotel> hotel = hotelRepo.findById(id);

        if (hotel != null) {
            return ResponseEntity.ok(hotel);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel not found");
        }
    }
    @PostMapping("/T_post")
    public Tourist postTourist(@RequestBody Tourist tourist){
        return touristRepo.save(tourist);
    }
  }
