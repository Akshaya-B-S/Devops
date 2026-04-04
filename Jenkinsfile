pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
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