package binary.manager.controller;

import binary.manager.service.BinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BinaryController {

    @Autowired
    BinaryService binaryService;

    @RequestMapping(value = "/landingpage", method = RequestMethod.GET)
    public String getLandingPage() {
        return "/landingpage";
    }



    @RequestMapping(value = "/firstresult", method = RequestMethod.POST)
    public String decimalToBinaryPost(@RequestParam() int number,
                                                        Model model){
        int providedNumber = number;
        String newresult = binaryService.decimalToBinaryConverter(providedNumber);
        model.addAttribute("inputNumber", providedNumber);
        model.addAttribute("binaryResult", newresult);
        return "firstresult";

    }

    @RequestMapping(value = "/secondresult", method = RequestMethod.POST)
    public String gapCalculatorPost(@RequestParam() int secondNumber,
                                                        Model model){
        int input2 = secondNumber;
        int result2 = binaryService.binaryGapCalculator(secondNumber);
        model.addAttribute("input2", input2);
        model.addAttribute("binaryGapResult", result2);

        return "secondresult";

    }


    }


