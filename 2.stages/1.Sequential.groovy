pipeline {
    agent any
    stages{
        stage('Comiling for ubuntu') {
            steps {
                echo "Comiling ubuntu"
                sleep 10
            }
        }
        stage('Comiling for windows') {
            steps {
                echo "Comiling windows"
                sleep 20
            }
        }
        stage('Comiling extra OS') {
            steps {
                echo "Comiling extra OS"
                sleep 5
            }
        }
    }
}
