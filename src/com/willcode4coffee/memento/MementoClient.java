package com.willcode4coffee.memento;

public class MementoClient {
	
	public static void main(String args[]) { 
		
		ReservationOriginator reservationphaseOrig = new ReservationOriginator();
		
		
		
		reservationphaseOrig.setReservationState("Booking Phase");
		ReservationMemento reservationMemento = reservationphaseOrig.createMemento();
		ReservationCareTaker reservationCareTaker = new ReservationCareTaker();
		reservationCareTaker.addResMemento(reservationMemento);
		
		
		
		
		reservationphaseOrig.setReservationState("Payment Phase");
		reservationMemento = reservationphaseOrig.createMemento();
		reservationCareTaker.addResMemento(reservationMemento);
		
		System.out.println("Current state of the reservation is " + reservationphaseOrig.getReservationState());
		
	
		
		reservationMemento = reservationCareTaker.getReservationMemento(0);
		reservationphaseOrig.setMemento(reservationMemento);
		
		 System.out.println("Previous State  of the reservation is " + reservationphaseOrig.getReservationState());
		
		
		
		
		
		
		
	}

}
