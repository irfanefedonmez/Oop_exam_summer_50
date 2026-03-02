package atu.ie.oop_exam_summer_50a;
import atu.ie.oop_exam_summer_50a.bookingService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class Controller {
    private bookingService bookingService;
    public Controller(bookingService bookingService) {
        this.bookingService = bookingService;

    }
    @PostMapping
    public ResponseEntity <bookingService>bookingService(@Valid @RequestBody bookingService bookingService) {
        return ResponseEntity.ok(bookingService);
    }
    @GetMapping("/no1"){
        public ResponseEntity<?>add(@RequestParam int no1   , @RequestParam int no2){
            int result = service.add(no1,no2);
        }

    }
}


