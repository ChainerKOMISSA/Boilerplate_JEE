# 📦 Backend Java JEE avec Jakarta EE & Maven
Ce projet est une application web RESTful construite avec Jakarta EE (Java JEE). Il est conçu selon une architecture modulaire MVC et peut être déployé sur un serveur d'applications comme Payara Server ou WildFly. Il constitue un point de départ propre, évolutif et adapté à des projets d’entreprise.

## 🚀 Fonctionnalités
- Architecture MVC (Servlets, Services, DAO)
- Connexion à une base de données relationnelle (via JPA ou JDBC)
- API RESTful avec JSON (via JAX-RS ou Servlets)
- Gestion des erreurs
- Packaging ```.war``` pour déploiement


## 🧾 Technologies utilisées
- Jakarta EE (JEE)
- Servlets & JSP
- JPA (EclipseLink ou Hibernate)
- Maven
- Payara Server ou WildFly
- JUnit pour les tests unitaires
- H2 ou MySQL comme base de données


## ⚙️ Installation & Configuration
### 1. Cloner le projet
```
git clone https://github.com/ChainerKOMISSA/Boilerplate_JEE.git 
cd boilerplate_JEE
```
### 2. Importer dans IntelliJ
- Ouvrir IntelliJ
- Importer le dossier comme un projet Maven
- Ajouter un serveur d'application (Payara ou WildFly) via Settings > Application Servers
- Configurer le Run Configuration pour le déploiement du ```.war```

### 3. Créer la base de données
Si tu veux utiliser MySQL ou une autre BDD, créez le schéma requis et configures la connexion dans ```persistence.xml``` ou via JDBC.

## 🛠️ Fichier .env équivalent (via web.xml ou fichier de config Java)
Si tu veux simuler un ```.env```, tu peux configurer tes variables dans :
```web.xml``` comme paramètres de contexte ou via ```application.properties``` si tu utilises MicroProfile

### 🚀 Lancer l’application
- Déployer l’archive .war générée par Maven sur le serveur (Payara, WildFly)
- Accéder à l’application sur : http://localhost:8080/boilerplate-jee

### ✅ Tests unitaires
Lancer les tests avec :
```
mvn test
```
Les tests sont disponibles dans le dossier ```src/test/java```.

### 📝 Licence
Ce projet est open source. Tu peux l’utiliser, le modifier et le distribuer librement.

### 👨‍💻 Auteure
Développé avec ❤️ par Essi Chainer KOMISSA ZOTSU

N'hésite pas à ⭐ le dépôt si ce projet t’a aidé !




