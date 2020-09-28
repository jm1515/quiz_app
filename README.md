# Projet Quizz.io

### Comment utiliser notre site

- Notre site est un jeu de quizz en ligne. 
- Les utilisateurs se connectent au site et sont amenés à rentrer leur pseudo.
- Si celui-ci est déjà pris, un 1 est concaténé au pseudo.
- Ils rejoignent la session de jeu en cours et doivent attendre la prochaine question pour commencer à jouer.
- Pour jouer ils doivent choisir la bonne réponse parmis 4 propositions.
- Si ils ont raison ils gagnent 10 points + le nombre de secondes restantes.
- Leur score est mis à jour automatiquement.
- Les questions s'enchainent l'une après l'autre sans interruption.
- Une fois qu'elles sont toutes défilées le classement final s'affiche pour tous les utilisateurs encore connectés.
- Ils sont amenés à retourner à l'accueil pour rejouer.

## Technologies utilisées :

### Base de donnée :

**MySQL** Pour conserver les questions et et les réponses aux questions.
Les utilisateurs ne sont pas stockés pour l'avenir.
Accès par entities grâce à **Hibernate**.

### Serveur :

- **Spring** Le serveur gère le choix des questions et les envoient au site pour affichage.
- Utilisation de **Tomcat**.
- ```WebSockets``` pour gérer l'accès dynamique et concurrentiel au site web.

### User Interface :

Interface WEB (**HTML, CSS et JS**)

## DCU :

![](Pictures/Pictures/DCU%20quizz.png)
