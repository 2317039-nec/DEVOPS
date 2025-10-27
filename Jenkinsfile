pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'javac Calculator.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'java Calculator'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                echo 'Deployment successful! ✅'
            }
        }
    }
}
