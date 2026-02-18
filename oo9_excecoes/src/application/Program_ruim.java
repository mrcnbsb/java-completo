package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation2;

public class Program_ruim {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(), dtf);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(), dtf);		
		Reservation2 reservation = null;
		if (!checkOut.isAfter(checkIn)) {
			System.out.println("Error in reservation: check-out date must be after check-in date");			
		} else {
			reservation = new Reservation2(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), dtf);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), dtf);
			String error = reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println(reservation);
			}
		}				
		
		sc.close();
	}

}
