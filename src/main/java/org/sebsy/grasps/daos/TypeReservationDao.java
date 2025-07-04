package org.sebsy.grasps.daos;

import org.sebsy.grasps.beans.TypeReservation;

import java.util.List;
import java.util.Optional;

public class TypeReservationDao {

    private static TypeReservation[] types = {new TypeReservation("TH", 150.0, 15.0), new TypeReservation("CI", 10.9, 0.0)};

    public TypeReservation extraireTypeReservation(String type) {

        Optional<TypeReservation> opt = List.of(types).stream().filter(t -> t.getType().equals(type)).findAny();
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }
}
