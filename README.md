
# TP13 - OAuth2 + OpenID Connect avec Google

Ce projet est une application **Spring Boot** qui implémente l'authentification via **OAuth2** et **OpenID Connect** en utilisant **Google** comme fournisseur d'identité.

## 🎯 Objectifs du TP

- Configurer Spring Security avec OAuth2 Client
- Authentification avec Google (OpenID Connect)
- Récupérer les informations de l'utilisateur (nom, email, photo de profil)
- Protéger les routes de l'application
- Gestion de la connexion et de la déconnexion

## 🛠 Technologies utilisées

- **Spring Boot 3.3.0**
- **Spring Security**
- **Spring Boot Starter OAuth2 Client**
- **Thymeleaf** + **Tailwind CSS**
- **Java 21**

## 📋 Prérequis

- Java 21 ou supérieur
- Maven 3.8+
- Compte Google
- Accès à [Google Cloud Console](https://console.cloud.google.com/)

## ⚙️ Configuration

### 1. Configuration Google OAuth2

1. Aller sur [Google Cloud Console](https://console.cloud.google.com/)
2. Créer ou sélectionner un projet
3. Aller dans **APIs & Services > Credentials**
4. Créer un **OAuth 2.0 Client ID** de type **Web application**
5. Dans **Authorized redirect URIs**, ajouter :
   ```
   http://localhost:8081/login/oauth2/code/google
   ```
6. Dans **OAuth consent screen** :
   - Choisir **External**
   - Mettre en mode **Testing**
   - Ajouter votre email comme **Test User**




```bash
mvn spring-boot:run -Dspring-boot.run.profiles=local
```

## 🚀 Comment lancer le projet

```bash
# Cloner le repository
git clone https://github.com/Mokhtar-Ben-laghlagh/Spring_13.git
cd Spring_13

# Lancer l'application (méthode recommandée)
mvn spring-boot:run -Dspring-boot.run.profiles=local
```

L'application est accessible sur : **http://localhost:8081**

## 📁 Structure du projet

```
src/main/java/
├── Spring/TP13/
│   ├── Tp13Application.java
│   ├── config/SecurityConfig.java
│   └── web/HomeController.java
src/main/resources/
├── templates/
│   ├── index.html
│   └── profile.html
├── application.yaml
└── application-local.yaml (non versionné)
```

## ✨ Fonctionnalités

- Page d'accueil publique avec bouton de connexion Google
- Authentification sécurisée via Google
- Affichage du profil utilisateur (nom, email, photo)
- Déconnexion sécurisée
- Design moderne avec Tailwind CSS
- Protection des routes avec Spring Security

## 🔐 Gestion des Secrets

- Les `client-id` et `client-secret` Google **ne doivent jamais** être committés.
- Utilisation de variables d'environnement + profil `local`.
- GitHub bloque automatiquement les pushes contenant des secrets.

## 📝 Notes

- Ce TP utilise le flux **Authorization Code + OpenID Connect**.
- Le design des pages (`index.html` et `profile.html`) utilise Tailwind CSS via CDN.
- L'application est configurée pour tourner sur le port **8081**.

## 📷Créarion d'étulisateur

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-28 110403" src="https://github.com/user-attachments/assets/2d02b513-02e1-49d5-8521-0d9d923055ec" />


## 📽️Démonstration 



https://github.com/user-attachments/assets/84ec454e-84d6-43f4-a8b5-c50395eecbee



---

**TP13 - Authentification OAuth2 avec Google**  
Développé avec Spring Boot & Spring Security

Si vous avez des questions ou des suggestions, n'hésitez pas à ouvrir une issue !
```

Tu peux copier tout le bloc ci-dessus et le coller directement dans ton fichier `README.md`.

Veux-tu que je modifie quelque chose (ajouter ton nom, changer le titre, ajouter des captures d'écran, etc.) avant de l'utiliser ?
