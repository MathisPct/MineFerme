# MineFerme

![header.png](doc%2Fheader.png)

## Liste des fonctionnalités

- Culture de plantes
    - Sélectionner une plante parmis les 8 proposés
    - Planter une graine sélectionnée
    - Paiement des graines planté
    - Gestion de la croissance des plantes
    - Booster la croissance de la plante via un clic
    - Récolter la plante prête
    - Défricher les plante pourries

- Gestion de la météo
    - Simulation de l'ensoleillement selon l’heure de la journée
    - Simulation du niveau d’humidité avec une variation fluide
    - Accélérer la croissance des plantes via le ratio soleil*humidité
- Gestion de l’inventaire
    - Ajout des légumes récolté dans l’inventaire
    - Suivie du nombre de légumes en temps réel
- Gestion des ventes
    - Modification des prix des plantes au cours du temps
    - Popup de validation des ventes avec le prix de vente total
    - Ajout de l’argent
- Musique
    - Musique de fond (en mode rotation)
    - Sons d'interactions avec les pots
- Gestion de la vitesse
- Mode de vitesse lent (1 cycle par seconde)
- Mode de vitesse Rapide (10 cycles par seconde)
- Thème graphique complet
    - Fond d’application changeant selon l’heure de la journée
    - Respect du thème graphique pour l’ensemble des boutons et images
    - Indicateur de sélection de la plante cohérente
    - Stade de croissance clairement différencié pour une meilleure compréhension
    - Positionnement des composants adapté au jeu
- Sauvegarde
    - Sauvegarde automatique à la fermeture
    - Ouverture automatique au lancement si le fichier de sauvegarde existe
    - Fichier de sauvegarde non modifiable

## Captures du jeu

| Image du jeu                                          | Description                                                        |
|-------------------------------------------------------|--------------------------------------------------------------------|
| ![jour.png](doc%2Fjour.png)                           | Jour (10h à 15h)                                                   |
| ![soir.png](doc%2Fsoir.png)                           | Soir(16h à 21h)                                                    |
| ![nuit.png](doc%2Fnuit.png)                           | Nuit (22h à 3h)                                                    |
| ![matin.png](doc%2Fmatin.png)                         | Matin (4h à 9h)                                                    |
| ![croissance_plante.png](doc%2Fcroissance_plante.png) | 5 états de croissance (graine, bourgeon, fleurie, mature, pourrie) |
| ![cout_plante.png](doc%2Fcout_plante.png)             | Valeur des plantes                                                 |
| ![potions.png](doc%2Fpotions.png)                     | Vitesse rapide/lent                                                |
| ![inventaire.png](doc%2Finventaire.png)               | Coffre de l’inventaire                                             |
| ![argent.png](doc%2Fargent.png)                       | Indicateur de l’agent                                              |
| ![meteo.png](doc%2Fmeteo.png)                         | Indicateur de la météo                                             |
| ![magasin_graine.png](doc%2Fmagasin_graine.png)       | Indicateur des graînes                                             |

## Conception

### Maquettes

On a fait des maquettes afin d’étudier les composants que l’on devait développer. Au début
du développement, nous avons tout de suite décidé d’avoir un cycle de jour, un solde pour
acheter des légumes.

![maquette.png](doc%2Fconception%2Fmaquette.png)

### Diagramme UML

Les particularités de notre architecture sont que les légumes héritent d’une classe abstraite
Legume qui porte les fonctionnalités communes de ces derniers: le prix, la gestion de l’état
courant, etc. Chaque type de Legume va gérer le seuil de croissance entre chaque état
(GRAINE, BOURGEON, FLEUR, MATURE, POURRIE). Le jardin contient une liste de
cases. Les cases ont une instance de légume afin de faire évoluer le légume associé quand
il est planté.

![uml.png](doc%2Fconception%2Fuml.png)
