pipeline{
    agent {
        docker {
            image 'robedevops/node-app:1.0'
            registryUrl 'https://hub.docker.com/'
            registryCredentialsId 'DockerHubCredsId'
        }
    }
    stages{
        stage("Build"){
            steps{
                sh "node --version"
            }
        }
    }
}