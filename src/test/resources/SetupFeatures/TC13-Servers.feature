#Author: Suvarna
Feature: Servers feature
@TC_13_01_Servers
  Scenario: Servers feature Test Scenario
    Then User goes to Environment and Open Run menu
    Then Check envEventServer
    Then Check emailServer
    Then Check AutoSODServer	
    Then Check AutoEODServer
    
    #VIP Server
    Then Check Vip_Cheque_Acceptance_Server
    
    #Payment Creation Server
    Then Check BatchChequePaymentCreationServer
    Then Check Batch_Modification_Server
    Then Check Cheque_Outward_Payment_Creation_Server
    Then Check Return_Creation_Server
    
    #EGPS
    Then Check ACH_Clearing_File_Input_Server
    Then Check ACH_Clearing_Inward_Payment_Creation_Server
    Then Check ACH_Response_Process_Server
    
    #ACH File Server
    Then Check File_Routing_Server
    
    #ActiveMQ Servers
    #Then Check AchClearingMQOutputServer
    #Then Check AchClearingMQInputServer
    
    #QR Generation Servers
    Then Check Cheque_Leaf_Creation_Server	
    Then Check Cheque_Inventory_File_Download_Server	
    
    #Data Migration Servers
    Then Check PDC_Data_Migration_Server	
    Then Check PDC_FileBean_ChequeData_Server
    Then Check Cheque_Migration_Image_Tagging_Server
    
    #CBS Servers
    #Then Check Account_Verification_Server	
    #Then Check Out_Present_Cheque_Server
    #Then Check Out_Reply_Cheque_Server
    #Then Check Add_PDC_Server
    #Then Check Delete_PDC_Server
    #Then Check Initial_Posting_Server
    #Then Check Final_Posting_Server
    #Then Check PDC_Commission_Server
    
    
    #Onus CBS Servers
    #Then Check Onus_Add_PDC_Server
    #Then Check Onus_Delete_PDC_Server
    #Then Check Onus_Initial_Posting_Server
    #Then Check Onus_Final_Posting_Server
    
    #Israeli Servers
    Then Check Israeli_Inward_Cheque_Server
    Then Check Israeli_Inward_ImageMapping_Server
    Then Check Israeli_Inward_Return_Server
    Then Check Israeli_Cheque_Outfile_Creation_Server
    Then Check Israeli_Outward_ImageIdMapping_Server
    Then Check Israeli_Outward_Return_Server
    
    #Israeli Data Migration Servers
    Then Check Israeli_PDC_Data_Migration_Server
    Then Check Israeli_Cheque_Migration_Image_Tagging_Server
    
    
    
    
    
    
    