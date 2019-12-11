pipeline {
    agent any
    stages {
        stage('Performance Tests') {
            when { not { branch 'master' } }

            // All the nested elements need to return true
            when { 
                allOf { 
                    branch 'master'; 
                    environment name: 'DEPLOY_TO', value: 'production' 
                } 
            }

            // At least one of the nested elements is true
            when { anyOf { branch 'master'; branch 'staging' } }

            steps {
                echo 'Testing...'
            }
        }
    }
}