package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TryingTests {

    @Test
    void fillStudentRegistrationForm() {

        //open page
        open("https://demoqa.com/automation-practice-form");

        //fill name
        $("#firstName").setValue("Tony");

        //fill last name
        $x("//*[@id='lastName']").setValue("Stark");

        //fill email
        Selenide.sleep(Long.parseLong("3000"));

        //check gender

        //fill mobile number

        //choose birthdate

        //fill subjects

        //check hobbies

        //select picture

        //fill address

        //choose state

        //choose city

        //click submit

        //check submitting form name

        //check submitting form email

        //check submitting form gender

        //check submitting form mobile

        //check submitting form birthdate

        //check submitting form subjects

        //check submitting form hobbies

        //check submitting form address

        //check submitting form state and city

        //close submitting form
    }

}
