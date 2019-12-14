pipeline {
    agent any
    stages{
        stage('Build') {
            parallel {
                stage("Comiling ubuntu"){
                    steps {
                        echo "Comiling ubuntu"
                        sleep 10
                    }
                }
                stage("Comiling windows"){
                    steps {
                        echo "Comiling windows"
                        sleep 20
                    }
                }
                stage("Comiling ectra OS"){
                    steps {
                        echo "Comiling ectra OS"
                        sleep 10
                    }
                }
            }
        }
    }
}
