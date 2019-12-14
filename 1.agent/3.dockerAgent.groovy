pipeline {
    agent none 
    stages{
        stage("Build for 7"){
            agent { docker 'openjdk:7' }
            steps {
                sh "java -version"
            }
        }
        stage("Build for 8"){
            agent { docker 'openjdk:8' }
            steps {
                sh "java -version"
            }
        }
    }
}