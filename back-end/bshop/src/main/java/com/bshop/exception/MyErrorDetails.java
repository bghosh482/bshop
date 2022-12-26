package com.bshop.exception;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MyErrorDetails {
	LocalDate timeStamp;
	String message;
	String description;
}
