# seg2505-tutorial6

Tutoriels Android réalisés pour le laboratoire de la semaine 5 du cours SEG2505 (IHM Android). Chaque tutoriel est dans son propre sous-répertoire.

| Répertoire | Tutoriel |
| --- | --- |
| [`mdc-102-java`](mdc-102-java) | MDC-102 Android: Material Structure and Layout (Java) |

## mdc-102-java

Application Shrine du codelab MDC-102. À partir du code de départ (`102-starter`), j'ai ajouté :

- une barre d'application (`AppBarLayout` + `Toolbar`) avec une icône de navigation et deux actions (recherche et filtre) ;
- une carte `MaterialCardView` ;
- une grille de cartes à deux colonnes avec un `RecyclerView` et un `GridLayoutManager` ;
- l'image, le titre et le prix de chaque produit dans `ProductCardViewHolder` et `ProductCardRecyclerViewAdapter`.

Il y a un commit par étape du codelab.

### Différences avec le codelab

- Le code de départ date de 2018 (Gradle 4, AGP 3.3). Les fichiers de build ont été mis à jour pour qu'il compile avec la version actuelle d'Android Studio.
- Les images des produits étaient hébergées par Google sur un bucket qui n'existe plus. Elles sont maintenant dans `mdc-102-java/product-images` (copiées du paquet `shrine_images` de Google, licence Apache 2.0) et l'application les télécharge depuis ce dépôt.

### Exécution

Ouvrir le dossier `mdc-102-java` dans Android Studio et lancer le module `app` sur un émulateur ou un appareil (minSdk 24). Sur la page de connexion, entrer un mot de passe d'au moins 8 caractères puis appuyer sur NEXT.
