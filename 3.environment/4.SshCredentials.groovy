pipeline {
    agent any
    environment { 
        SSH_CREDS = credentials('username-ssh-creds')
    }
    stages {
        stage('Authentication') {
            steps {
                // This will have the format USERNAME:PASSWORD
                echo "${SSH_CREDS}"
                
                // This will show only the username value 
                echo "${SSH_CREDS_USR}"

                // This will show only the password value
                echo "${SSH_CREDS_PSW}"
            }
        }
    }
}