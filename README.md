# Project 4 - * Nom de l'application ici *

** Nom de votre application ** est une application Android qui permet à un utilisateur de voir la maison et mentionne les délais, afficher les profils d'utilisateur avec les horaires de l'utilisateur, ainsi que composer et poster un nouveau tweet. L'application utilise [Twitter REST API] (https://developer.twitter.com/fr/docs/api-reference-index).

Temps passé: ** X ** heures passées au total

## Histoires d'utilisateurs

La fonctionnalité ** requise ** suivante est terminée:

* [] L'application inclut ** toutes les user stories requises ** à partir du client Twitter de la semaine 3
* [] L'utilisateur peut ** basculer entre les modes Chronologie et Mention à l'aide des onglets **
  * [] L'utilisateur peut afficher les tweets de sa timeline à domicile.
  * [] L'utilisateur peut voir les mentions récentes de son nom d'utilisateur.
* [] L'utilisateur peut naviguer jusqu'à ** afficher son propre profil **
  * [] L'utilisateur peut voir l'image, le slogan, le nombre de suiveurs, le nombre de suiveurs et les tweets sur leur profil.
* [] L'utilisateur peut ** cliquer sur l'image du profil ** dans n'importe quel tweet pour voir ** le profil d'un autre utilisateur **.
 * [] L'utilisateur peut voir l'image, le slogan, le nombre de suiveurs, le nombre de suiveurs et les tweets de l'utilisateur cliqué.
 * [] La vue du profil inclut la chronologie de cet utilisateur
* [] L'utilisateur peut [infiniment paginer] (http://guides.codepath.com/android/Endless-Scrolling-with-AdapterViews-and-RecyclerView) l'une de ces chronologies (maison, mentions, utilisateur) en faisant défiler vers le bas

Les fonctionnalités ** optionnelles ** suivantes sont implémentées:

* [] L'utilisateur peut voir la liste suivante / suiveur à travers le profil
* [] Implémente la gestion robuste des erreurs, [vérifier si Internet est disponible] (http://guides.codepath.com/android/Sending-and-Managing-Network-Requests#checking-for-network-connectivity), gérer les cas d'erreur , les pannes de réseau
* [] Lorsqu'une requête réseau est envoyée, l'utilisateur voit un [indicateur de progression indéterminé] (http://guides.codepath.com/android/Handling-ProgressBars#progress-within-actionbar)
* [] L'utilisateur peut ** "répondre" à n'importe quel tweet sur son timeline à la maison **
  * [] L'utilisateur qui a écrit le tweet d'origine est automatiquement "@" répondu dans le
* [] L'utilisateur peut cliquer sur un tweet pour être ** amené à une "vue détaillée" ** de ce tweet
 * [] L'utilisateur peut prendre des actions favorites (ou non) ou retweeter sur un tweet
* [] L'utilisateur peut ** rechercher des tweets correspondant à une requête particulière ** et voir les résultats
* [] Les noms d'utilisateur et les hashtags sont stylés et cliquables dans les tweets [en utilisant des liens cliquables] (http://guides.codepath.com/android/Working-with-the-TextView#creating-clickable-styled-spans)

Les fonctionnalités ** bonus ** suivantes sont implémentées:

* [] Utilisez Parcelable au lieu de Serializable en utilisant la populaire [bibliothèque Parceler] (http://guides.codepath.com/android/Using-Parceler).
* [] Utilise le [module de prise en charge de la liaison de données] (http://guides.codepath.com/android/Applying-Data-Binding-for-Views) pour lier des données dans des modèles de présentation.
* [] Sur l'écran du profil, utilisez [CoordinatorLayout] (http://guides.codepath.com/android/Handling-Scrolls-with-CoordinatorLayout#responding-to-scroll-events) pour [appliquer le comportement de défilement] (https : //hackmd.io/s/SJyDOCgU) lorsque l'utilisateur fait défiler la chronologie du profil.
* [] L'utilisateur peut voir ses messages directs (ou en envoyer de nouveaux)

Les fonctionnalités ** supplémentaires ** suivantes sont implémentées:

* [] Liste toute autre chose que vous pouvez faire pour améliorer la fonctionnalité de l'application!

## Procédure pas à pas vidéo

Voici une présentation des user stories implémentées:

<img src = 'http: //i.imgur.com/link/to/your/gif/file.gif' title = 'Vidéo Procédure pas à pas' width = '' alt = 'Vidéo Procédure pas à pas' />

GIF créé avec [LiceCap] (http://www.cockos.com/licecap/).

## Remarques

Décrivez les problèmes rencontrés lors de la création de l'application.

## Bibliothèques open-source utilisées

- [HTTP asynchrone Android] (https://github.com/loopj/android-async-http) - Requêtes HTTP asynchrones simples avec analyse JSON
- [Picasso] (http://square.github.io/picasso/) - Bibliothèque de chargement et de mise en cache d'images pour Android

## Licence

    Droit d'auteur [yyyy] [nom du titulaire du droit d'auteur]

    Sous licence Apache, Version 2.0 (la "Licence");
    Vous ne pouvez pas utiliser ce fichier sauf en conformité avec la licence.
    Vous pouvez obtenir une copie de la licence à

        http://www.apache.org/licenses/LICENSE-2.0

    Sauf si requis par la loi applicable ou accepté par écrit, logiciel
    distribué sous licence est distribué "TEL QUEL",
    SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
    Voir la licence pour la langue spécifique régissant les autorisations et
    limitations en vertu de la licence.
