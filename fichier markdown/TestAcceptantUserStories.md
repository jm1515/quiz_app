## User stories

### Gestion de la connexion des utilisateurs :

Lorsque l'utilisateur se connecte au serveur :

- il doit saisir son **pseudo**
- si deux pseudos sont identiques, celui qui a choisit le pseudo en dernier se voit concaténé un ```1``` pour le différencier
- l'utilisateur est ajouté a la session en cours et doit attendre la fin de la question en cours pour commencer a jouer

**Test d'acceptance pour la connexion des utilisateurs :**

- En tant que **user**, je veux pouvoir créer une session avec le pseudo de mon choix.
- En tant que **user**, je veux pouvoir rejoindre la session en cours.

### Création d'une session :

Création d'une session de quizz avec :

- "**n**" nombre de questions
- "**n**" nombre d'utilisateurs max
- gestion de l'arrêt de la session

**Test d’acceptance pour la création d’une session de quizz :**

- En tant que **serveur**, je veux pouvoir créer des sessions de questions qui s’enchaînent.
- En tant que **serveur**, je veux pouvoir terminer une session automatiquement.

### Affichage des questions et réponses :

- récupérer et afficher les questions depuis la base de données à la création d'une sessions
- affichage de la bonne réponse et des 3 autres mauvaises réponses pour chaque question
- affichage du classement

**Test d’acceptance pour l’affichage des questions/réponses :**

- En tant que **serveur**, je veux pouvoir envoyer les questions choisies.
- En tant que **user**, je veux savoir si j’ai bien répondu en premier.
- En tant que **user**, je veux connaître mon classement sur la session en cours.

### Gestion des réponses des utilisateurs du Quizz :

- vérification des réponses de chaque user
- incrémentation des points à chaque bonne réponse pour chaque utilisateur
- mise à jour du classement

**Test d’acceptance pour la gestion des utilisateurs du Quizz :**

- En tant que **serveur**, je veux savoir qui a répondu bon.
- En tant que **serveur**, je veux donner des points aux utilisateurs qui ont eu bon.
- En tant que **serveur**, je veux mettre à jour le classement en fonction des points.

### Classement :

- vérifier le nombre de points de chaque utilisateur de la session puis mettre à jour le classement
- lorsqu'un utilisateur est créé on l'ajoute au classement

**Test d’acceptance pour la gestion des utilisateurs du Quizz :**

- En tant que **serveur**, je veux ajouter les joueurs qui rejoignent la session à n’importe quel moment au classement.
- En tant que **user**, je veux pouvoir rejoindre la session à n’importe quel moment.


### Gestion du temps :

- un *timer* va gérer le changement de questions
- le temps pour chaque question sera de ```n``` secondes

### Gestion de la sortie d'un utilisateur en cours de partie :

- suppression de ses données
- retirer l'utilisateur du classement

### Création des vues :

- création de la page de connexion (pseudo, boutton *play*)
- la page de quizz (question, réponses, timer, classement, button *quitter*)
- la page classement final (**écrasée à chaque fin de session**)

### Session terminée :

- Affichage du **classement**
- Affichage du **vainqueur**
