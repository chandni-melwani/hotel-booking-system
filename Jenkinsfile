pipeline {
    agent any

    tools {
        // Updated to match your Jenkins configuration
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
                // 'bat' for Windows, use 'sh' if Jenkins is on Linux
                bat 'mvn clean test package'
            }
        }
    }

    post {
        success {
            echo "CI Success: Code compiled and JUnit tests passed on Jenkins Port 8085"
        }
    }
}