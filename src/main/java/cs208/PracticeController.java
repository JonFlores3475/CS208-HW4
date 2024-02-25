package cs208;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController
{
    // TODO: create a GET route with two query parameters
    @GetMapping("/display_name")
    String getSearchWithTwoParameters(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name
    )
    {
        System.out.println("PracticeController.getSearchWithTwoParameters - START");
        System.out.println("parameter1 sent in the browser URL = " + first_name);
        System.out.println("parameter2 sent in the browser URL = " + last_name);
        System.out.println("PracticeController.getSearchWithTwoParameters - END");

        String valueReturnedToBrowser =
                "These are the values of parameters passed in the URL:<br>" +
                        "parameter1 = " + first_name + "<br>" +
                        "parameter2 = " + last_name + "<br><br>" +
                        "NOTE: the parameters are separated in the URL by an ampersand (&amp;) character.<br><br>" +
                        "<hr>" +
                        "Find me in the PracticeController.getSearchWithTwoParameters() method";

        return valueReturnedToBrowser;
    }


    // TODO: create a GET route with a path parameter
    @GetMapping("/user/{userName}/profile")
    String getProfileWithStringPathVariableCalledBSUUsername(@PathVariable("userName") String userName)
    {
        System.out.println("PracticeController.getIssuesWithStringPathVariableCalledIssueId - START");
        System.out.println("Parameter received in the path of the URL:");
        System.out.println("BSUUsername = " + userName);
        System.out.println("PracticeController.getIssuesWithStringPathVariableCalledBSUUsername - END");

        String valueReturnedToBrowser =
                "Parameter received in the path of the URL:<br>" +
                        "userName = " + userName + "<br><br>" +
                        "<hr>" +
                        "Find me in the PracticeController.getProfileWithStringPathVariableCalledBSUUsername() method";

        return valueReturnedToBrowser;
    }


    // TODO: create a POST route with two form parameters


    // TODO: create a PATCH route


    // TODO: create a DELETE route


    // TODO: create a GET API that returns a random resource

}
