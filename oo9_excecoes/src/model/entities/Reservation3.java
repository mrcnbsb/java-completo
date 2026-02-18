package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation3 {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;

	public Reservation3() {
	}

	public Reservation3(Integer roomNumber, LocalDate checkIn, LocalDate checkOut){
		if (!checkOut.isAfter(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getChechOut() {
		return checkOut;
	}

	public long duration() {
		return Duration.between(checkIn.atTime(0, 0), checkOut.atTime(0, 0)).toDays();
	}

	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
			throw new DomainException("Reservation dates must be future dates");
		}		
		if (!checkOut.isAfter(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}		
		this.checkIn = checkIn;
		this.checkOut = checkOut;		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room ");
		sb.append(this.roomNumber + ", check-in: ");
		sb.append(dtf.format(this.checkIn) + ", check-out: ");
		sb.append(dtf.format(this.checkOut) + ", ");
		sb.append(this.duration() + " nights");
		return sb.toString();
	}
}
