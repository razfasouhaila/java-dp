# TP - Application des principes GRASP

Ce projet Java illustre l'application des principes GRASP (General Responsibility Assignment Software Patterns) à travers un cas de réservation client.

---

## Objectif pédagogique

L’objectif de ce TP est de :
- Refactorer un code initial trop centré sur un seul contrôleur
- Appliquer les principes GRASP pour mieux répartir les responsabilités
- Introduire des classes de service, de fabrique, et des utilitaires
- Ajouter des tests unitaires

---

## Architecture adoptée

### 1. `ReservationController`
Responsable de la réception des paramètres et de l'appel au service de réservation.

### 2. `ReservationService`
Gère la logique métier principale : extraction des entités, création de la réservation, calcul du montant total.

### 3. `ReservationFactory`
Responsable de la création d'une instance de `Reservation`. Applique le principe **Creator**.

### 4. `TarificationService`
Calcule le montant d'une réservation en fonction du type et du statut du client. Applique le principe **Information Expert**.

### 5. `DateUtils`
Classe utilitaire pour la conversion des dates. Principe **Pure Fabrication**.

---

##  Tests

Des tests unitaires sont disponibles pour valider le bon fonctionnement de l'application :
- `ReservationControllerTest`
- `ReservationServiceTest`

Les tests couvrent :
- La création de réservations
- Le calcul du montant avec ou sans réduction
- Le comportement selon le type de client (premium ou non)

---

##  Données simulées

Les DAO (`ClientDao`, `TypeReservationDao`) simulent une base de données avec des données statiques :
- Clients (avec ou sans statut premium)
- Types de réservations (montant et pourcentage de réduction)

---

## ✔ Principes GRASP appliqués

| Principe GRASP         | Application concrète                        |
|------------------------|---------------------------------------------|
| Controller             | `ReservationController`                    |
| Creator                | `ReservationFactory`                       |
| Information Expert     | `TarificationService`                      |
| Pure Fabrication       | `DateUtils`, `ReservationFactory`          |
| High Cohesion          | Chaque classe a une responsabilité claire  |
| Low Coupling           | Faible dépendance entre les couches        |

---

## ▶ Exécution

Projet Java simple, exécutable avec :
- IntelliJ / Eclipse
- Maven ou JUnit pour les tests

---

## 🙋‍♀️ Auteure

RAZFA Souhaila – Étudiante en M2 DEV

---

