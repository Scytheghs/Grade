pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Clone'){
            steps{
                echo "Cloning in process"
            }
        }
        stage('Build'){
            steps{
                bat 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
    }
}
