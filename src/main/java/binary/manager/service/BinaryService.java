package binary.manager.service;

import org.springframework.stereotype.Service;

@Service
public class BinaryService {

    public String decimalToBinaryConverter(int number){

        Integer processedNumber = number;
        String binary = Integer.toBinaryString(processedNumber);
        return binary;
    }

    public int binaryGapCalculator(int number){

        int binaryGap = 0;

        if (number == 0){
            return 0;
        }

        while (number%2 == 0){
            number /= 2;
        }

        for (int i = 0; number > 0; number /= 2){
            if (number%2 == 0){
                i++;
            }else {
                if (i > binaryGap){
                    binaryGap = i;
                }
                    i = 0;
            }

        }

        return binaryGap;


    }



}
