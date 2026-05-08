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
                sh 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
    }
}