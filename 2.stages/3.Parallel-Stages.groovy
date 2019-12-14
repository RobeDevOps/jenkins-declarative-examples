pipeline {
    agent any
    stages{
        stage('Tests') {
            parallel {
                stage("Tests ubuntu"){
                    steps {
                        echo "Tests ubuntu"
                        sleep 10
                    }
                }
                stage("Tests windows"){
                    steps {
                        echo "Tests windows"
                        sleep 20
                    }
                }
                stage("Tests ectra OS"){
                    steps {
                        echo "Tests ectra OS"
                        sleep 10
                    }
                }
            }
        }
    }
}
