# Cas d'utilisation du Jeu

## Cas 1 : Choisir un pseudo 

<span>
**Nom** : Choisir un pseudo <br/>
**Contexte d'utilisation** : Un utilisateur souhaite participer à une session <br/>
**Portée** : Site Web <br/>
**Acteur principal** : Utilisateur qui se connecte <br/>
**Précondition** : L’utilisateur est connecté au site <br/>
**Déclencheur** : Connexion au site <br/>

**Scénario nominal** :

* L’utilisateur se connecte au site web
* L’utilisateur entre son pseudo
* L’utilisateur devient un joueur et apparaît avec le pseudo choisi

**Garantie en cas de succès** : L’utilisateur peut participer à la session en cours avec le pseudo choisit

**Cas d’échecs** : L’utilisateur n’a pas le pseudo choisi ou n’est pas connecté à la session.

**Scénario alternatif** : <br/>
* **Scénario 1** : Un utilisateur portant le pseudo choisi est déjà dans la session.<br/>
* **Solution du scénario 1** : Un nombre est concaténé au pseudo du dernier joueur inscrit avec ce pseudo.
</span>

-------------------------------------

## Cas 2 : Se connecter à une session
<span>
**Nom** : Se Connecter à une Session <br/>
**Contexte d'utilisation** : L’utilisateur est connecté au site web<br/>
**Portée** : Site Web <br/>
**Niveau** : Utilisateur
**Acteur principal** : Utilisateur <br/>
**Précondition** : Choisir un pseudo <br/>
**Déclencheur** : Connexion au Site <br/>
**Scénario nominal** :
* Le Système récupère les informations de l’Utilisateur
* Le Système cherche une session avec des places libres
* Le Système relie l’Utilisateur et la Session

**Garantie en cas de succès** : L’utilisateur peut jouer.
</span>

-------------------------------------

## Cas 3 : Répondre aux questions 
<span>
**Nom** : Répondre aux questions <br/>
**Contexte d'utilisation** : Un joueur veut répondre à la question en cours<br/>
**Portée** : Site Web <br/>
**Acteur principal** : Joueur connecté à la session <br/>
**Précondition** : Le joueur est connecté à la session de jeu en cours <br/>
**Déclencheur** : Le serveur a envoyé une nouvelle question <br/>
**Scénario nominal** :
* Le joueur clique sur une réponse parmi celles proposées

**Garantie en cas de succès** : C’est la bonne réponse, elle clignote vert et un point est accordé au joueur dans le classement.

**Cas d’échecs** : L’utilisateur ne clique sur aucune réponse, il n’a pas de point.

**Scénario alternatif**:

**Scénario 1**: C’est la mauvaise réponse, la bonne réponse clignote en vert et la réponse choisie par l’utilisateur en rouge, il n’a pas de point.

</span>

-------------------------------------

## Cas 4 : Voir le classement à un instant T 
<span>
**Nom** : Voir le classement à un instant T <br/>
**Contexte d'utilisation** : Un utilisateur souhaite voir l’évolution du classement <br/>
**Portée** : Site Web <br/>
**Acteur principal** : Utilisateur <br/>
**Précondition** :  L’utilisateur est connecté à une session <br/>
**Déclencheur** : Un nouvel utilisateur se connecte, un joueur marque un point <br/>
**Scénario nominal** :
* Le Système charge le classement de la Session
* L’Interface affiche le classement de la Session de l’Utilisateur

**Garantie en cas de succès** : L’utilisateur peut voir le nombre de points obtenus par tous les joueurs et le détenteur de la première place

**Cas d’échecs** : L’utilisateur n’est pas connecté à la session.

</span>

-------------------------------------

## Cas 5 : Voir le classement final
<span>
**Nom** : Voir le classement final <br/>
**Contexte d'utilisation** : Un utilisateur est connecté à une session<br/>
**Portée** : Site Web <br/>
**Acteur principal** : Utilisateur connecté à la session <br/>
**Précondition** : L’utilisateur était connecté à la session qui se termine <br/>
**Déclencheur** : La session se termine <br/>
**Scénario nominal** :
* Le Système établi le classement final de la session
* Le Système redirige les utilisateurs de la session vers la page de classement

**Garantie en cas de succès** : L’utilisateur peut voir le nombre de points obtenus par tous les joueurs et le détenteur de la première place

**Cas d’échecs** : Il n’est pas redirigé vers le site. Il est redirigé vers la page d’accueil.

**Scénario alternatif** : <br/>
* **Scénario 1** : Le joueur quitte la session avant la fin de la dernière question.<br/>
* **Solution du scénario 1** :  Son score disparait de la session. <br/>
</span>

-------------------------------------

## Cas 6 : Rejouer à la session suivante
<span>
**Nom** : Rejouer à la session suivante <br/>
**Contexte d'utilisation** : Un utilisateur est connecté à la session en cours <br/>
**Portée** : Site Web <br/>
**Acteur principal** : Utilisateur connecté à la session <br/>
**Précondition** : L’utilisateur est connecté au site <br/>
**Déclencheur** : La session se termine <br/>
**Scénario nominal** :
* Le Système affiche le classement final 
* Le Système propose aux joueurs précédemment connectés de retourner à l'accueil
* Le joueur clique sur Accueil

**Garantie en cas de succès** : Le joueur à la possibilité de choisir un pseudo à nouveau. Son score et son pseudo sont encore enregistrés dans la session en cours

**Scénario alternatif** : <br/>
* **Scénario 1** : Le joueur choisi de ne pas se reconnecter.<br/>
* **Solution du scénario 1** :  Il reste sur la page du classement final.
</span>

-------------------------------------

## Cas 7 : Quitter la session en cours
<span>
**Nom** : Quitter la session en cours <br/>
**Contexte d'utilisation** : Un utilisateur souhaite quitter la session en cours<br/>
**Portée** : Site Web <br/>
**Acteur principal** : Utilisateur connecté à la session <br/>
**Précondition** : L’utilisateur est connecté au site<br/>
**Déclencheur** : Le joueur ferme la fenêtre<br/>

**Scénario nominal** :
* L’utilsateur quitte la page

**Garantie en cas de succès** : Si le joueur se reconnecte il est invité à remettre un nouveau pseudo. Son score a disparu du classement
</span>

-------------------------------------
