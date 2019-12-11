pipeline {
    agent none
    stages {
        stage('LinuxBuild') {
            agent { label 'linux-agent' }
            steps {
                echo 'Linux build command'
            }
        }
        stage('WindowsBuild') {
            agent { label 'windows-agent' }
            steps {
                echo 'Windows build command'
            }
        }
    }
}