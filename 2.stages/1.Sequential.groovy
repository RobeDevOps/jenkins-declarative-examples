pipeline {
    agent any
    stages{
        stage('Test for ubuntu') {
            steps {
                echo "Test ubuntu"
                sleep 10
            }
        }
        stage('Test for windows') {
            steps {
                echo "Test windows"
                sleep 20
            }
        }
        stage('Test extra OS') {
            steps {
                echo "Test extra OS"
                sleep 5
            }
        }
    }
}
