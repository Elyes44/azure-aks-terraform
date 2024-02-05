pipeline {
  tools {
        maven 'maven'
    }
    agent any
        environment {
        registryName = "spring:latest"
        registryCredential = 'acr_creds'
        dockerImage = ''
        registryUrl = 'justelyes44.azurecr.io'
    }
    
    stages {
        stage('checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Elyes44/azure-aks-terraform.git']]])
            }
        }
        
        stage ('Build') {
        steps {
            sh 'mvn clean install'           
        }
     }
     
    stage ('Build Docker image') {
        steps {
                script {
                    dockerImage = docker.build registryName
                }
            }
        }
        
        stage('Upload Image to ACR') {
         steps{   
             script {
                docker.withRegistry( "http://${registryUrl}", registryCredential ) {
                dockerImage.push()
                }
            }
          }
        }
        
        stage ('K8S Deploy') {
          steps {
            script {
                withKubeConfig([credentialsId: 'aks', serverUrl: '']) {
                sh ('kubectl apply -f spring.yaml')
                }
            }
        }
     }
    }
}