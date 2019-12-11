pipeline {
    agent any
    stages {
        stage('Performance Tests') {
            when { 
                branch 'master' 
                // expression { BRANCH_NAME ==~ /(master|staging)/ }
                // branch pattern: "release-\\d+", comparator: "REGEXP"
            }
            steps {
                echo 'Testing...'
            }
        }
    }
}