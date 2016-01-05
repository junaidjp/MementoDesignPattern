package com.willcode4coffee.memento;

public class ReservationOriginator {

	private String reservationState;

	public String getReservationState() {
		return reservationState;
	}

	public void setReservationState(String reservationState) {
		this.reservationState = reservationState;
	}
	
	
	public ReservationMemento createMemento() { 
		
		return new ReservationMemento(reservationState);
	}

	
	
	public void setMemento(ReservationMemento reservationMemento) {
		reservationState = reservationMemento.getReservationState();
	}
}
