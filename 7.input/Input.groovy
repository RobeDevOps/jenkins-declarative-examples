pipeline {
    agent any
    stages {
        stage('Release') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "Yoda"
                parameters {
                    string(name: 'TARGET_ENV', 
                           defaultValue: 'PROD', 
                           description: 'This deploy, should we trust?')
                }
            }
            steps {
                echo "Deploying to ${TARGET_ENV}"
            }
        }
    }
}