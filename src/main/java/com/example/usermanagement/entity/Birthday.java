package com.example.usermanagement.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday {
    @NotBlank
    @Past
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate birthday;

    public Birthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        int duration = (int) ChronoUnit.YEARS.between(birthday, today);
        return duration;
    }
}
