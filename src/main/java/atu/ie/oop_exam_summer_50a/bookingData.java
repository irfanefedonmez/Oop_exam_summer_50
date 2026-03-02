package atu.ie.oop_exam_summer_50a;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class bookingData {
    @NotBlank(message = "Booking id required")
    private int bookingId;
    @NotBlank(message = "room number required")
    private int roomNumber;
    @NotBlank(message = "booking date required")
    private String bookingDate;
    @NotBlank(message = "start hour required")
    private String startHour;
    @NotBlank(message = "duration hour required")
    private String durationHours;
    @NotBlank(message = "Student mail required")
    private String studentEmail;



}
