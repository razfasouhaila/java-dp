package org.sebsy.grasps;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.sebsy.grasps.beans.Reservation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ReservationControllerTest {

    @Test
    public void testCreerReservation() {
        Params params = new Params();
        params.setIdentifiantClient("1");
        params.setDateReservation("01/01/2024 20:30:00");
        params.setTypeReservation("CI");
        params.setNbPlaces(2);

        ReservationController controller = new ReservationController();
        Reservation reservation = controller.creerReservation(params);

        assertNotNull(reservation);
        Assert.assertEquals(2, reservation.getNbPlaces());
    }
}
