pipeline{
    
            agent any
            stages{
                stage('checkout'){
                    
                    steps{
                            echo "code checkout"
                            git branch: 'PIBC_Branch_One', url: 'https://github.com/yashashree07/PIBC.git'
                    }
                
                
                }
                stage('test'){
                    
                    steps{
                            echo "code test"
                            bat  "mvn test"
                    }
                
                
                }
                 stage('Publish Report'){
                    
                    steps{
                            echo "Report Publish"
                           cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: 'Cucumber.json', jsonReportDirectory: 'C:\\Users\\Lenovo\\.jenkins\\workspace\\PIBC_PROJECT_PIPELINE\\target\\cucumber-reports', pendingStepsNumber: -1, reportTitle: 'CucumberPipelineReports', skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
                    }
                
                
                }
                
            }    
                
}
