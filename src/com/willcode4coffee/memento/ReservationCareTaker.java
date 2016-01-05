package com.willcode4coffee.memento;

import java.util.ArrayList;
import java.util.List;

public class ReservationCareTaker {
	
	private List<ReservationMemento> reservationStates = new ArrayList<ReservationMemento>();
	
	public void addResMemento(ReservationMemento reservationMemento) { 
		reservationStates.add(reservationMemento);
	}
	
	public ReservationMemento getReservationMemento(int index) { 
		return reservationStates.get(index);
	}

}
