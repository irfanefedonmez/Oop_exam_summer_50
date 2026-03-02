package atu.ie.oop_exam_summer_50a;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class Controller {
    private bookingService bookingService;
    public Controller(bookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping
    public ResponseEntity<String> bookingService(@Valid @RequestBody String studentEmail) {

    }
}
