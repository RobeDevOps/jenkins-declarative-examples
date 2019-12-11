pipeline {
    agent none
    stages {
        stage('LinuxBuild') {
            agent { label 'linux-slave' }
            steps {
                echo 'Linux build command'
            }
        }
        stage('WindowsBuild') {
            agent { label 'windows-slave' }
            steps {
                echo 'Windows build command'
            }
        }
    }
}