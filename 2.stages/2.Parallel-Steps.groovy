pipeline {
    agent any
    stages{
        stage('Test') {
            steps {
                parallel(
                ubuntu: {
                    echo "Test Minor"
                    sleep 10
                }
                windows: {
                    echo "Test Major"
                    sleep 20
                },
                extraOS: {
                    echo "Test Critical"
                    sleep 5
                }
                )
            }
        }
    }
}
