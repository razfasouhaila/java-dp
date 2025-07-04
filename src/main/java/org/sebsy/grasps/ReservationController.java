package org.sebsy.grasps;

import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.services.ReservationService;

public class ReservationController {

    private ReservationService service = new ReservationService();

    public Reservation creerReservation(Params params) {
        return service.traiterReservation(
                params.getIdentifiantClient(),
                params.getDateReservation(),
                params.getTypeReservation(),
                params.getNbPlaces()
        );
    }
}
