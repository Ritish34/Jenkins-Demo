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
            echo "Post Action Called!!!"
        }
    }
  
}
