pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning repository...'
                git branch: 'main', url: 'https://github.com/2317039-nec/DEVOPS.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java code...'
                bat 'javac Calculator.java'
            }
        }

        stage('Run Calculator') {
            steps {
                echo 'Running Calculator program...'
                // Use non-interactive input for Jenkins
                bat 'echo 10 + 20 | java Calculator'
            }
        }
    }

    post {
        success {
            echo '✅ Build and run successful!'
        }
        failure {
            echo '❌ Build failed! Check the console output.'
        }
    }
}
