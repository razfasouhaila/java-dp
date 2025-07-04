package org.sebsy.grasps.services;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;
import org.sebsy.grasps.factories.ReservationFactory;
import org.sebsy.grasps.utils.DateUtils;

import java.time.LocalDateTime;

public class ReservationService {

    private ClientDao clientDao = new ClientDao();
    private TypeReservationDao typeDao = new TypeReservationDao();
    private TarificationService tarificationService = new TarificationService();

    public Reservation traiterReservation(String idClient, String dateStr, String typeStr, int nbPlaces) {
        Client client = clientDao.extraireClient(idClient);
        TypeReservation type = typeDao.extraireTypeReservation(typeStr);
        LocalDateTime date = DateUtils.toDate(dateStr);

        Reservation reservation = ReservationFactory.creerReservation(client, date, nbPlaces);
        double montant = tarificationService.calculerMontant(client, type, nbPlaces);
        reservation.setTotal(montant);

        return reservation;
    }
}
