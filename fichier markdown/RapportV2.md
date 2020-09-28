# **Synthèse de Projet**
## **(Table des matières)**
* Introduction
* Lien entre la théorie et la pratique
* Organisation mise en place
* Problèmes rencontrés, solutions trouvées
* Points perfectibles, restes à faire, points non solutionnés
* Retours personnels sur le module
 * Alex Bournadet
 * Alice Mondja
 * Ashharoudine Abdoulrahmane
 * Corentin Cloarec
 * Jean-Mikaël Champeval

### **Introduction**
---------------------

A la suite de la première séance de Génie Logiciel nous étions un peu perdu sur le choix du sujet, nous n’avions même pas une idée directrice. On a donc donné à chacun la mission de trouver des idées assez simples à mettre en place. 
Le seul point sur lequel nous étions fixé : Faire notre application en Java.
En conséquence les choix portaient soit sur une application Web avec le back-end en java, soit sur une application qui puisse tourner sur la console car nous avions peu de connaissances en interface Java (JavaFX).
Suite au BrainStorming plusieurs idées sont ressorties : 
* Un jeu comme Reigns : Vous êtes un roi, vous devenir subvenir au bonheur des habitants de votre royaume. Vous avez 4 jauges : 1 de citoyen, 1 de richesse, 1 de religion et 1 de militaire. Des interlocuteurs de différents partis vont vous demander des actions qui affectent positivement ou négativement vos jauges. Le but est de garder les jauges à un niveau stable sans qu’aucune n'arrive trop haut ou trop bas. Par exemple, si la religion devient trop importante vous serez écarté du trône par la papauté, ou si vous êtes trop pauvre vous ne pourrez plus entretenir le royaume qui sera détruit et ainsi de suite….
* Un jeu de Quizz comme 4 Images, 1 mot ou le Nope quizz : Un joueur lance l’application, des questions ou images vont défiler, il doit trouver le mot en lien avec les images ou répondre à la question le plus vite possible. Le joueur emmagasine un score au fur et à mesure qu’il avance, plus il va loin, plus les questions sont dures et plus le temps pour répondre est court.
* Une liste non exhaustive de jeux en tout genre comme Pac-Man, Mario etc… 
Comme vous l’aurez compris ce sont les deux premières idées qui ont le plus attisé la curiosité. Au final, c’est le quizz qui a gagné car il était plus simple à imaginer niveau interface et permettait une intégration web plus logique.

### **Choix des outils**
---------------------------------

Comme dit précédemment, l’une de nos contrainte principale dans le choix des outils était le Java. C’est le langage que nous maîtrisons le mieux et donc il était assez simple de concevoir l’application et d’imaginer son fonctionnement avec une partie front-end en html/css et un back-end en Java. Nous avions aussi réalisé plusieurs projets de Java et donc perfectionné nos outils sur ce langage. 

Nous avions imaginé une conception autour des EJB initialement car on avait le socle technique pour utiliser cette technologie et qu’elle semblait répondre au besoin. Par la suite nous avons vu des technologies plus pertinentes comme Hibernate qui permettait aussi de gérer la base de données en passant par des Entities mais d’une manière plus simple.
 
Au niveau de la base de données nous avions le choix mais nous avons décidé d'utiliser MySQL pour la simple raison que nous avions déjà une version fournie par l’IUT et une version configurée sur une VM en ligne d’Outscale (Reste de la nuit de l’info). C’était donc un choix de facilité mais aussi d’habitude car on utilise souvent MySQL ici, à l’IUT.

Nous connaissions OutScale car nous l’avions utilisé lors de la nuit de l’info, nous pouvions donc le configurer vite pour avoir la base de données et le serveur stocké et accessible en ligne directement. Cela nous aurait permis d'éviter les problèmes de versions et de devoir lancer une BDD locale à chaque test. La volonté derrière ce choix était de nous faciliter la vie.
Nous avions rencontré plusieurs obstacles, par exemple, nous voulions au départ utiliser une BDD en ligne sur le site d'Outscale permettant d'accéder à des VMs en ligne qui nous permettaient de configurer complètement un serveur web et base de données. Cela aurait permis d'utiliser une BDD commune qui aurait la même version et qui serait compatible avec toutes les versions du logiciel.
Nous voulions utiliser BootStrap pour faire une interface graphique jolie et surtout rapidement. 
Pour le serveur nous avions pensé à GlassFish pour les EJB initialement mais avec l’abandon de cette technologie il n’était plus nécessaire d’utiliser ce type de serveur.

Nous nous sommes alors tourné vers un autre type de serveur sur lequel nous avions eu de bons retours : SpringBoot. Nous avions eu l’occasion de voir ce type de serveur à l’oeuvre lors de la nuit de l’info mais aussi sur les projets de nos camarades en Java. C’est la réputation de l’outil au sein de la classe qui nous a poussé vers ce choix. Il répond à notre besoin et est simple d’utilisation.

En ce qui concerne l’IDE, le choix était séparé entre Eclipse et IntelliJ. 
Eclipse par habitude. Nous connaissions l’outil, nous savions où chercher les informations et nous avions donc de nombreuses facilités dans son utilisation.

IntelliJ pour découvrir. Certains d’entre nous travaillaient sur IntelliJ en entreprise, il y avait donc une question de facilité d’utilisation qui restait en avant. 

Le choix s’est porté par IntelliJ qui semble apporter plus d’opportunités pour le code, de plus les fonctionnalités sont plus importantes et sa réputation nous a poussé à vouloir nous perfectionner sur cet IDE qui a déjà su montrer ses qualités et qui est aussi présent qu’Eclipse en entreprise.

Nous avons aussi choisi d'utiliser SonarCube pour savoir si notre code était bien rédigé, sans redondance etc.... 

**Problèmes inhérents aux outils**

* Base de données :
 
Le choix d’OutScale était pertinent, une simple adresse publique suffisait à se connecter à la base de données stockée en ligne, chacun avait donc accès aux mêmes données. C’était simple et efficace tout se passait pour le mieux. Malheureusement, notre version gratuite d’OutScale héritée de la nuit de l’info a été coupée du jour au lendemain, nous avons donc dû revoir la Base de données. Au final, le choix s’est tourné vers une base de données locale. Chacun a donc une base de même organisation (car générée par Hibernate) mais avec des données différentes. 

Côté hibernate tout s’est bien passé, nous avons pu voir avec Mohammed qui avait l’habitude de l’utiliser et qui a pu fortement nous aider dans sa mise en place et sa compréhension.

* Java :

Hormis la compréhension des websockets qui est une partie de Java que nous n’avions pas eu l’occasion d’utiliser et que nous avons dû apprendre sur le tas. Nous connaissions déja le langage.

* IntelliJ :

Certains ont été assez réfractaire au changement et ont préféré continuer sur Ecplise. Le problème venait surtout de SpringBoot, habitué à l’utilisation de SpringTools qui est dérivée d’Eclipse, ils ont préféré se tourner vers cet IDE plutôt qu’IntelliJ. D'autres ont choisit d'utiliser d'IntelliJ  car  il permettait d'utiliser de git de manière très simplifiée, ce qui a été appréciable pour le développement en équipe

* SonarQube : 

En soit il n'y a aucun problème à remonter sur cet outil, il remplit très bien son objectif : Connaître la qualité de notre code.
Nous avons cependant rencontré quelques difficultées pour le mettre en place

**Contraintes du projet**

* Tests :

Les test sont peu nombreux car nous avons manqués de temps pour les réaliser, en effet nous avons privilégié la réalisation d'un livrable fonctionnel à la rédactions de test, cependant nous en 
avons tout de même réalisé pour les fonctionnalitées principales. Il n'y a pas, d'un autre coté, énormement de fonctionnalitées a tester, le projet possédant un concept très simple, la compléxité résidant dans la gestion des différents thread et le dialogue en WS avec le client

* Markdown :

Certains ont trouvé le markdown pour la rédaction des documents long à prendre en main. Ils passaient donc par Word pour avoir une idée visuelle du rendu souhaité puis on passaient en markdown pour obtenir le rendu souhaité. D'autres l'utilisaient déja au travail et s'y sont habitué.

* Autre :

Dans notre projet nous avons du recourir a du multi-threading pour gérer l'envoi des questions aux différents clients, ainsi que l'avancement de la barre du timer. Nous avons donc eu quelques erreurs suite a cela, mais grâce aux notions que nous avons acquises dans les modules précédents, nous avons pu le gérer de manière a ne pas avoir d'erreurs et que tout les clients reçoivent les données au même moment.

### **Application de la Méthodologie (/Lien Théorie ou Pratique)**
--------------------------------------------------------------------

Nous aurions voulu réaliser différentes options:
* Inscription et création d'un compte
* Ajout d'images dans les questions
* Création de session de jeu par niveau de difficulté
* Temps variable par niveaux
* Joker pour supprimer deux réponses fausses

Mais encore une fois nous avons privilégié le livrable final complet à l'implémentation de ces fonctionnalitées annexes.

##### Traduire le besoin :
---------------------------

Rédaction du cahier des charges et réalisation des critères d'acceptations dès le début du projet pour avoir une idée de ligne directrice.

##### Qualité du produit :
---------------------------

Le produit répond bien aux spécifications du cahier des charges.

##### Réponse aux contraintes du projet :
------------------------------------------

* Markdown : OK
* Java : OK
* Git : OK
* Spring : OK
* Maven : OK
* Tests unitaires : Quelques uns
* Rédaction des besoins : OK
* Documentation : OK
* Livrables : OK
* Dépot Git complet : OK
* Synthèse : OK

##### Organisation :
---------------------

Nous avons tenté de nous organiser au début en réalisant chaque partie du projet tous ensemble dans le but d’avancer plus vite. Toutefois, on a réalisé assez rapidement qu’il fallait se répartir les différentes tâches dans le but de finir à temps.

Nous avons décidé que Jean-Mickaël, Corentin et Ashharoudine allaient s'occuper du développement du jeu en lui-même et qu’Alice et Alex gèreraient la rédaction des livrables et des tests. Alex se chargerait aussi de la mise en place de la base de données par l'utilisation d'Hibernate. Alice quant à elle s'est chargé de la configuration de Sonarcube.

##### Cahier des charges :
---------------------------

C'est une partie importante d'un vrai projet dans la mesure où le besoin n'est pas exprimé par les développeurs. Ici, nous étions la MOA et la MOE, chacun connaissait le besoin. Il n'était donc pas nécessaire de mettre en place le cahier des charges d'une manière aussi détaillée qu'en entreprise dans la mesure où nous n'avions pas la nécessité de traduire le besoin pour les développeurs.

##### Intégration Continue :
----------------------------

L’intégration Continue est gérée par la fonction Gitlab CI/CD de Gitlab.com. Celle-ci permet de lancer l’ensemble des tests et des applications permettant de vérifier le code et de trouver des manières de l’améliorer.

##### Tests :
---------------------------

Quelques test unitaires sous Junit on été réalisés pour les fonctionnalitées suivantes :

 - On vérifie que lorsqu'un utilisateur rejoint la session il est bien enregistré au niveau du serveur
 - On vérifié que lorsque deux utilisateurs choisissent le même pseudo, le deuxieme se voit concatenné un "1"
 - On vérifié les method `joinSession()` et `finishSession()` pour s'assurer que la session est initialisée correctement et supprimée correctement
 - On vérifie que le classement fonctionne bien en testant si le joueur avec le plus de points est le joueur en tête


##### Retours personnels sur le module :
---------------------------

* **Ashharoudine** : Je trouve que le projet c'est bien déroulé dans l'ensemble. Le groupe a été solidaire et collaboratif. Nous avons pu concevoir, organiser et réaliser un projet intéressant et j'ai pu apprendre beaucoup de chose. 
J'ai pu utiliser Spring, html, java et le javascript également. Je trouvais que les cours était intéressants, le faite de faire des pitchs et de partager le savoir etait quelque chose que j'ai bien apprécié.
Par ailleur, j'aurais aimé que l'on fasse le cour sur Docker que l'on a pas pu faire même si je l'ai regardé de mon coté.

* **Alex** : Les cours dans l'ensemble étaient interessants, les exemples utilisés en java 
et le fait de montrer les outils était vraiment bien et cela aidait à comprendre
mieux l'utilité de telle ou telle application. Le seul reproche que je pourrais faire est le fait que les cours étaient fait en meme temps que le projet.
J'aurais préféré avoir X séances de cours puis le reste en projet. Cela nous aurait laissé plus de temps pour trouver un sujet et préparer la répartition du travail.
De plus, on aurait vu tout avant d'entamer les projets, une vision plus globale des outils donc.

* **Jean-Mikaël** : Grâce à ce module, j'ai pu manipuler toutes les fonctionnalités offertes par Git, découvrir un nouveau framework ainsi qu'un nouvel IDE. Dans l'ensemble, ce projet me servira dans la poursuite de ma carrière en informatique, puisque j'ai pu avoir un aperçu de ce que l'on peut retrouver en entreprise. Cependant, je trouve que l'on avait trop de contraintes demandées dans la conception de notre application, et cela ne m'a pas forcement très motivé à l'idée de devoir tout apprendre dans un laps de temps assez court.
Concernant les cours appris, il aurait fallu une partie sur la répartition des tâches dans un projet. En effet, nous avons toujours du mal à nous coordonner dans la majorité de nos projets, et un retour d'expérience aurait été très utile pour nous améliorer dans ce domaine.
Enfin, je suis quand même satisfait des points vus dans cette matière, et je sais maintenant sur quoi je dois travailler pour devenir un bon développeur. 

* **Corentin** : Ce projet m'a permis de me remémorer les bases en js, en html et au niveau des pages jsp. Il aura été très complet et m'aura en plus permis de découvrir le framework spring et les websocket. J'ai vraiment apprécié travailler avec ces outils car ils permettent de gérer facilement l'accès aux données et le dialogue entre le serveur et le client web. D'autant plus que ce n'était pas trop complexe et que j'ai pris en main très rapidement les websocket et la manière d'envoyer des données aux différents clients. J'ai cependant eu quelques problèmes avec la synchronisation entre l'ide (intellij) et gitlab, mais cela s'est corrigé avant que ça ne me face perdre du temps. 
J'ai trouvé le cours très dynamique et complet, mais je préfère la pratique à la théorique et je pense que la partie sur les design pattern aurait pu faire un bon sujet pour un TP. Les outils qui nous ont été présentés sont très intéressants et utiles que ce soit en entreprise ou dans les projet en cours. Il aurait peut-être fallut insister plus sur comment mettre en applications les méthodes de gestions de projet dans le projet du module, mais dans sa globalité le cours est très appréciable.
 