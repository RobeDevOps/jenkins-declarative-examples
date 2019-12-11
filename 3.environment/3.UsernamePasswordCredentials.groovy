pipeline {
    agent any
    environment { 
        ACCESS_CREDS = credentials('username-password') 
    }
    stages {
        stage('Authentication') {
            steps {
                // This will have the format USERNAME:PASSWORD
                echo "${ACCESS_CREDS}"
                
                // This will show only the username value 
                echo "${ACCESS_CREDS_USR}"

                // This will show only the password value
                echo "${ACCESS_CREDS_PSW}"
            }
        }
    }
}