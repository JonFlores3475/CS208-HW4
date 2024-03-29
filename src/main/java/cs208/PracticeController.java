package cs208;

import org.springframework.web.bind.annotation.*;
import java.util.Random;

@RestController
public class PracticeController {
    // TODO: create a GET route with two query parameters
    @GetMapping("/display_name")
    String getSearchWithTwoParameters(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name
    ) {
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
    String getProfileWithStringPathVariableCalledBSUUsername(@PathVariable("userName") String userName) {
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
    @PostMapping("/create_user")
    String postIssuesWithTwoFormParameters(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
    ) {
        System.out.println("PracticeController.postIssuesWithTwoFormParameters - START");
        System.out.println("Parameters received in the body of the POST request:");
        System.out.println("firstName       = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("PracticeController.postIssuesWithTwoFormParameters - END");

        String valueReturnedToClient =
                "Parameters received in the body of the POST request:\n" +
                        "firstName       = " + firstName + "\n" +
                        "lastName = " + lastName + "\n\n" +
                        "This REST API route would create a new issue with the firstName and lastName specified in the parameters.\n\n" +
                        "<hr>" +
                        "Find me in the PracticeController.postIssuesWithTwoFormParameters() method";

        return valueReturnedToClient;
    }


    // TODO: create a PATCH route
    @PatchMapping("/user/{userName}/update_profile")
    String patchUserWithOnePathVariableAndOneFormParameter(
            @PathVariable("userName") String userName,
            @RequestParam("theme") String theme,
            @RequestParam("language_code") String language_code
    ) {
        System.out.println("PracticeController.patchUserWithOnePathVariableAndOneFormParameter - START");
        System.out.println("Parameter received in the path of the URL: " + userName);
        System.out.println("Parameter received in the body of the PATCH request:");
        System.out.println("theme = " + theme);
        System.out.println("language_code    = " + language_code);
        System.out.println("PracticeController.patchUserWithOnePathVariableAndOneFormParameter - END");

        String valueReturnedToClient =
                "Parameter received in the path of the URL:\n" +
                        "userName = " + userName + "\n\n" +
                        "Parameter received in the body of the PATCH request:\n" +
                        "theme = " + theme + "\n\n" +
                        "language_code    = " + language_code + "\n\n" +
                        "This REST API route would update user with userName " + userName + " with the " +
                        "new language_code and new theme value passed in the body of the PATCH request.\n\n" +
                        "<hr>" +
                        "Find me in the PracticeController.patchUserWithOnePathVariableAndOneFormParameter() method";

        return valueReturnedToClient;
    }


    // TODO: create a DELETE route

    @DeleteMapping("/resource/{resourceId}")
    String deleteResourceWithOnePathVariable(@PathVariable("resourceId") String resourceId) {
        System.out.println("PracticeController.deleteResourceWithOnePathVariable - START");
        System.out.println("Parameter received in the path of the URL:");
        System.out.println("resourceId = " + resourceId);
        System.out.println("TutorialController.deleteResourceWithOnePathVariable - END");

        String valueReturnedToClient =
                "Parameter received in the path of the URL:\n" +
                        "resourceId = " + resourceId + "\n\n" +
                        "This REST API route would delete the issue with id " + resourceId + ".\n\n" +
                        "<hr>" +
                        "Find me in the PracticeController.deleteResourceWithOnePathVariable() method";

        return valueReturnedToClient;
    }


    // TODO: create a GET API that returns a random resource
    @GetMapping("/api/random_rock_fact")
    String getRandomRockFact() {
        Random rand = new Random();
        int fact = rand.nextInt(3);
        String[] rockFacts = new String[]{
                "If you soak a raisin in grape juice, it becomes a grape.",
                "Dinosaurs had big ears, but everyone forgot this because dinosaur ears don't have bones.",
                "Greg stole this rock from old lady Daniel's yard."
        };
        System.out.println("PracticeController.getRandomRockFact - START");
        System.out.println("randomInt = " + fact);
        System.out.println("TutorialController.getRandomRockFact - END");

        String valueReturnedtoClient = rockFacts[fact];
        return valueReturnedtoClient;
    }
}