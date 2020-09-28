# Fiche de test : 
=================

## Test de connexion :
----------------------

L'objectif de ce test est de se connecter avec le pseudo de notre choix sur le site internet.

<table>
   <tr>
       <th>Etape</th>
       <th>Description</th>
       <th>Résultat attendu</th>
       <th>Résultat obtenu</th>
       <th>Conclusion du test</th>
   </tr>
   <tr>
       <td>1</td>
       <td>L'utilisateur entre l'url : http://localhost:8082</td>
       <td>Il arrive sur la page de choix du pseudo</td>
       <td>Ok</td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>2</td>
       <td>L'utilisateur entre le pseudo de son choix</td>
       <td>Il arrive sur la page de question et son pseudo est présent dans le tableau des scores</td>
       <td>Pseudo utilisé : Alex 
<br/> Pseudo affiché : Alex
       </td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>3</td>
       <td>On essaie de connecter un deuxième user à la session
           Ouvrir une deuxième fenêtre et répéter les étapes précédentes</td>
       <td>Il arrive sur la page de question et son pseudo est présent dans le tableau des scores avec un 1 à la fin</td>
       <td> * Pseudo utilisé : Alex <br/>
            * Pseudo affiché : Alex1 <br/>
           Sur la page de l'utilisateur 1, le pseudo Alex1 est ajouté au classement aussi.
       </td>
       <td>Passed</td>
   </tr>
</table>

## Test de réponse :
----------------------

L'objectif de ce test est de répondre à une question

<table>
   <tr>
       <th>Etape</th>
       <th>Description</th>
       <th>Résultat attendu</th>
       <th>Résultat obtenu</th>
       <th>Conclusion du test</th>
   </tr>
   <tr>
       <td>1</td>
       <td>L'utilisateur entre l'url : http://localhost:8082</td>
       <td>Il arrive sur la page de choix du pseudo</td>
       <td>Ok</td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>2</td>
       <td>L'utilisateur entre le pseudo de son choix</td>
       <td>Il arrive sur la page de question et son pseudo est présent dans le tableau des scores</td>
       <td> * Pseudo utilisé : Alex <br/>
            * Pseudo affiché : Alex
       </td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>3</td>
       <td>L'utilisateur attend de pouvoir répondre et choisit une mauvaise réponse</td>
       <td>Aucun point n'est ajouté à son score, Incorrect est affiché en bas de la fenêtre</td>
       <td> * Choix d'une mauvaise réponse à la question : Quelle est la couleur du cheval blanc d'Henry IV <br/>
            * Réponse choisie : Bleu <br/>
            * Incorrect est bien affiché en bas, le score est toujours de 0.
       </td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>4</td>
       <td>L'utilisateur choisi de cliquer sur une la bonne réponse avant le changement de question</td>
       <td>Aucun point n'est ajouté à son score, Incorrect est affiché en bas de la fenêtre</td>
       <td> * Réponse choisie : Blanc <br/>
            * Incorrect est bien affiché en bas, le score est toujours de 0.
       </td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>5</td>
       <td>L'utilisateur attend la prochaine question est choisi la bonne réponse</td>
       <td>Son score est mis à jour avec 10 + nombre de secondes restantes</td>
       <td> * Quel est le film d animation japonaise ayant eu le plus grand succes au monde ? <br/>
            * Réponse choisie : Le voyage de Chihiro <br/>
            * Correct est bien affiché en bas, le score est de 27.
       </td>
       <td>Passed</td>
   </tr>
</table>

## Test de jeu :
----------------------

L'objectif de ce test est de voir la mise à jour du score et la position des joueurs dans le classement

<table>
   <tr>
       <th>Etape</th>
       <th>Description</th>
       <th>Résultat attendu</th>
       <th>Résultat obtenu</th>
       <th>Conclusion du test</th>
   </tr>
   <tr>
       <td>1</td>
       <td>L'utilisateur entre l'url : http://localhost:8082</td>
       <td>Il arrive sur la page de choix du pseudo</td>
       <td>Ok</td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>2</td>
       <td>L'utilisateur entre le pseudo de son choix</td>
       <td>Il arrive sur la page de question et son pseudo est présent dans le tableau des scores</td>
       <td> * Pseudo utilisé : Alex <br/>
            * Pseudo affiché : Alex
       </td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>3</td>
       <td>On essaie de connecter un deuxième user à la session
           Ouvrir une deuxième fenêtre et répéter les étapes précédentes</td>
       <td>Il arrive sur la page de question et son pseudo est présent dans le tableau des scores avec un 1 à la fin</td>
       <td> * Pseudo utilisé : Alex <br/>
            * Pseudo affiché : Alex1
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>4</td>
       <td>Aller sur la fenêtre du premier utilisateur, choisir la bonne réponse</td>
       <td>Son score est mis à jour avec 10 + nombre de secondes restantes, il est en haut du classement</td>
       <td> * Choix d'une bonne réponse à la question : Quelle est la couleur du cheval blanc d'Henry IV <br/>
            * Réponse choisie : Blanc <br/>
            * Correct est bien affiché en bas, il est en haut du classement, 27points.
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>5</td>
       <td>Aller sur la fenêtre du deuxième utilisateur, choisir la bonne réponse</td>
       <td>Son score est mis à jour avec 10 + nombre de secondes restantes, il est deuxième au classement</td>
       <td> * Choix d'une bonne réponse à la question : Quelle est la couleur du cheval blanc d'Henry IV <br/>
            * Réponse choisie : Blanc <br/>
            * Correct est bien affiché en bas, il est deuxième du classement 18points.
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>6</td>
       <td>Aller sur la fenêtre du deuxième utilisateur, choisir la bonne réponse</td>
       <td>Son score est mis à jour avec 10 + nombre de secondes restantes, il est en haut du classement</td>
       <td> * Quel est le film d animation japonaise ayant eu le plus grand succes au monde ? <br/>
            * Réponse choisie : Le voyage de Chihiro <br/>
            * Correct est bien affiché en bas, le score est de 40, il est premier du classement.
       </td>
       <td>Passed</td>
   </tr>
</table>

## Test du classement :
----------------------

L'objectif de ce test est de voir la position des joueurs dans le classement final

<table>
   <tr>
       <th>Etape</th>
       <th>Description</th>
       <th>Résultat attendu</th>
       <th>Résultat obtenu</th>
       <th>Conclusion du test</th>
   </tr>
   <tr>
       <td>1</td>
       <td>L'utilisateur entre l'url : http://localhost:8082</td>
       <td>Il arrive sur la page de choix du pseudo</td>
       <td>Ok</td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>2</td>
       <td>L'utilisateur entre le pseudo de son choix</td>
       <td>Il arrive sur la page de question et son pseudo est présent dans le tableau des scores</td>
       <td> * Pseudo utilisé : Alex <br/>
            * Pseudo affiché : Alex
       </td>
       <td>Passed</td>
   </tr>
   <tr>
       <td>3</td>
       <td> * On essaie de connecter un deuxième user à la session <br/>
            * Ouvrir une deuxième fenêtre et répéter les étapes précédentes</td>
       <td>Il arrive sur la page de question et son pseudo est présent dans le tableau des scores avec un 1 à la fin</td>
       <td> * Pseudo utilisé : Alex <br/>
            * Pseudo affiché : Alex1
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>4</td>
       <td>Aller sur la fenêtre du premier utilisateur, choisir la bonne réponse</td>
       <td>Son score est mis à jour avec 10 + nombre de secondes restantes, il est en haut du classement</td>
       <td> * Choix d'une bonne réponse à la question : Quelle est la couleur du cheval blanc d'Henry IV <br/>
            * Réponse choisie : Blanc <br/>
            * Correct est bien affiché en bas, il est en haut du classement, 27points.
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>5</td>
       <td>Aller sur la fenêtre du deuxième utilisateur, choisir la bonne réponse</td>
       <td>Son score est mis à jour avec 10 + nombre de secondes restantes, il est deuxième au classement</td>
       <td> * Choix d'une bonne réponse à la question : Quelle est la couleur du cheval blanc d'Henry IV <br/>
            * Réponse choisie : Blanc <br/>
            * Correct est bien affiché en bas, il est deuxième du classement 18points.
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>6</td>
       <td>Aller sur la fenêtre du deuxième utilisateur, choisir la bonne réponse</td>
       <td>Son score est mis à jour avec 10 + nombre de secondes restantes, il est en haut du classement</td>
       <td> * Quel est le film d animation japonaise ayant eu le plus grand succes au monde ? <br/>
            * Réponse choisie : Le voyage de Chihiro <br/>
            * Correct est bien affiché en bas, le score est de 40, il est premier du classement.
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>7</td>
       <td>Attendre la fin du défilé des questions</td>
       <td>Les utilisateurs sont redirigés vers le classement final</td>
       <td>Les utilisateurs sont à l'URL : http://localhost:8082/leaderboard
       </td>
       <td>Passed</td>
   </tr>
<tr>
       <td>8</td>
       <td>Vérifier la position des joueurs</td>
       <td>Le joueur 2 est en haut du classement avec son nombre de point, le joueur 1 est en dessous</td>
       <td> * Joueur 2 : 40points <br/>
            * Joueur 1 : 27points
       </td>
       <td>Passed</td>
   </tr>
</table>
