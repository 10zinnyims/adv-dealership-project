package com.yearup.dealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
    private String contractsFile;

    public ContractDataManager(String contractsFile) {
        this.contractsFile = "contract.csv";
    }

    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(contractsFile, true))) {
            if (contract instanceof SalesContract) {
                
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}