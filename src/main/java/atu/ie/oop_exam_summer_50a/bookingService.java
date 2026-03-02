package atu.ie.oop_exam_summer_50a;


import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class bookingService {
    public bookingService(@Valid @RequestBody bookingService bookingService) {

    }
}
