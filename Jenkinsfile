pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('SonarQube') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }

        stage('Deploy') {
            steps {
                sh 'cp target/whiteboard.war /tomcat/webapps/'
            }
        }
    }
}