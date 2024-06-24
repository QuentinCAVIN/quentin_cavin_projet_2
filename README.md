# Projet 2 OC : Société Heme Biotech

Correction et complétion d'un programme d'analyse des tendances de symptômes à destination de médecins et de vétérinaires.

## Objectif

Compléter un programme Java dysfonctionnel en le corrigeant et en le complétant. Le programme va prendre en entrée un fichier texte qui contient une liste de symptômes qui peuvent se répéter. On retrouvera en sortie une liste des symptômes rencontrés avec leur nombre d’occurrences.

## Travail Réalisé

- Création de classes.
- Implémentation d'interfaces.
- Lecture des données à partir d’un fichier.
- Écriture des résultats dans un fichier.
- Compréhension du langage de programmation Java.
- Construction d'un projet de code collaboratif.

## Technologies Utilisées

- Java
- Interfaces Java
- Lecture et écriture de fichiers en Java


## Utilisation

### Entrée et Sortie

Le programme prend en entrée un fichier texte (`symptoms.txt`) qui contient une liste de symptômes, chaque ligne représentant un symptôme. Le programme génère en sortie un fichier texte (`result.out`) qui liste les symptômes rencontrés avec leur nombre d’occurrences.

### Exemple d'Utilisation

1. Placer le fichier `symptoms.txt` dans le répertoire `src/main/resources`.
2. Lancer l'application :
    ```bash
    mvn exec:java -Dexec.mainClass="com.hemebiotech.analytics.Main"
    ```
3. Le fichier de sortie `result.out` sera généré dans le répertoire `src/main/resources`.
