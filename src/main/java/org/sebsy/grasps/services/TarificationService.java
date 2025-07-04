package org.sebsy.grasps.services;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.TypeReservation;

public class TarificationService {

    public double calculerMontant(Client client, TypeReservation type, int nbPlaces) {
        double montant = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            montant *= (1 - type.getReductionPourcent() / 100.0);
        }
        return montant;
    }
}
