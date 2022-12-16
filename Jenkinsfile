pipeline 
{
    agent any

    stages 
    {
        stage('Hello') 
        {
            steps 
            {
                echo 'Hello World'
            }
        }
        
        stage('Test') 
        {
            steps 
            {
                echo 'Test App'
            }
        }
        
        stage('Deploye') 
        {
            steps 
            {
                echo 'Deploye App'
            }
        }
    }
    post {
        always {
            emailext body: 'Summary', subject: 'Pipeline Result Status', to: 'ritish.inexture@gmail.com'
        }
    }
  
}
