**Annexe 2 : Dossier d’analyse des besoins**
============================================

#***Introduction***
-------------------

Ce document est destiné à présenter l'analyse des besoins du client pour le projet Quizz.io. Nous allons à travers ce document effectuer une lecture du cahier des charges afin d'en tirer les différentes exigences ou besoins afin que ce projet se réalise. Puis nous allons réaliser la spécification des cas d'utilisations et leurs interactions.

#***Lecture du cahier des charges***
-------------------------------------

Nous allons commencer par voir les domaines du problème puis les différents acteurs de celui-ci ensuite leurs actions et finalement les informations échangées.
Dans l’expression du besoin nous avons remarqué la volonté d’avoir une interface où plusieurs personnes peuvent se connecter quand ils le souhaitent et sans contraintes géographiques. De plus, les questions doivent se charger automatiquement et les sessions s’enchaîner naturellement. 

De ce besoin ressort 2 domaines : Une partie front-end web et un serveur. 
Dans le domaine du site Web, on retrouve l’interface des joueurs et le classement.
Dans le domaine du serveur, on retrouve la partie de création de sessions, choix des questions et interactions avec la base de données.

#***Identification des objets, acteurs, actions***
--------------------------------------------------

__**Domaine du problème**__

- Site Web
- Serveur

__**Objets**__

- Questions
- Réponses
- Joueurs
- Acteurs

__**Joueur :**__ Un joueur est une personne qui a entré son pseudo sur le site et qui est connecté à une session de jeu.

__**Serveur :**__ Il créait les sessions, classe les joueurs, enchaîne les questions de manière autonome.

__**Actions**__

- Se connecter à une session
- Quitter une session
- Consulter le classement actuel
- Choisir une réponse
- Continuer à jouer
- Identification et description des exigences

Nous allons lister les exigences, dans un premier temps, les exigences fonctionnelles ou les cas d’utilisations et ensuite les exigences non-fonctionnelles correspondants aux diverses contraintes imposés par le client ou le développeur pour réaliser le projet.

#***Exigences :***
------------------

__**Exigences du site web :**__

- Choisir un pseudo
- Se connecter à une session
- Répondre aux questions (Choisir une réponse)
- Voir le classement à un instant T
- Voir le classement final
- Rejouer à la session suivante
- Quitter la session en cours
- Ajouter des questions/réponses

__**Exigences du serveur :**__

- Lancer une nouvelle session
- Passer à la question suivante après un intervalle de temps X
- Attribuer les points
- Définir le classement général
- Afficher le classement

[Lien vers la liste des Cas d'Utilisation](./Cas d'utilisation)