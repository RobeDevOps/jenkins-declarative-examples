pipeline {
    agent any
    stages{
        stage('Test') {
            steps {
                parallel(
                ubuntu: {
                    echo "Test ubuntu"
                    sleep 10
                }
                windows: {
                    echo "Test windows"
                    sleep 20
                },
                extraOS: {
                    echo "Test extra OS "
                    sleep 5
                }
                )
            }
        }
    }
}
