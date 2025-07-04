package org.sebsy.grasps;

import org.junit.jupiter.api.Test;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.services.ReservationService;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationServiceTest {

    @Test
    public void testTraiterReservationClientNormal() {

        ReservationService service = new ReservationService();

        String idClient = "1";
        String date = "01/01/2024 20:30:00";
        String type = "CI";
        int nbPlaces = 3;

        Reservation reservation = service.traiterReservation(idClient, date, type, nbPlaces);

        assertNotNull(reservation);
        assertEquals(nbPlaces, reservation.getNbPlaces());
        assertTrue(reservation.getTotal() > 0);
    }

    @Test
    public void testTraiterReservationClientPremium() {
        ReservationService service = new ReservationService();

        String idClient = "2";
        String date = "01/01/2024 20:30:00";
        String type = "CI";
        int nbPlaces = 4;

        Reservation reservation = service.traiterReservation(idClient, date, type, nbPlaces);

        assertNotNull(reservation);
        assertEquals(4, reservation.getNbPlaces());
        assertEquals(36.0, reservation.getTotal());

    }
}
