pipeline {
    agent any
    tools {
        maven 'Maven3' 
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/chandni-melwani/hotel-booking-system.git'
            }
        }
        stage('Build & Test') {
            steps {
                // This tells Jenkins to move into the sub-directory where pom.xml is
                dir('hotel-booking-system') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
    post {
        success {
            echo "CI Success: Code compiled and JUnit tests passed on Jenkins Port 8085"
        }
    }
}