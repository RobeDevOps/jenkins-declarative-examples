pipeline {
    agent { label 'linux-slave' }
    stages {
        stage('LinuxBuild') {
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