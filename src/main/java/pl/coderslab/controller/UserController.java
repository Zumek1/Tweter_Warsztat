package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.Repositories.UserRepo;
import pl.coderslab.model.Tweet;
import pl.coderslab.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@Transactional
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/tweeter")
    public String sign(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "homepage";
    }

    @PostMapping("/tweeter")
    public String zaloguj(@ModelAttribute User user, Model model){
        userRepo.save(user);
        model.addAttribute("user", user);
        return "userPage";

    }

//    @ModelAttribute("tweets")
//    public List<Tweet> getAllTweets() {
//
//        return userRepo.fin;
//    }

//    @GetMapping("/add")
//    public String addUser(Model model){
//        User user= new User();
//        model.addAttribute("user", user);
//        return "addUser";
//    }
//
//    @PostMapping("/add")
//    public String addUser(@ModelAttribute User user, Model model) {
//        userRepo.save(user);
//        model.addAttribute("users", getAllUsers());
//        return "allUsers";
//    }
//
//    @ModelAttribute("users")
//    public List<User> getAllUsers() {
//
//        return userRepo.findAll();
//    }
//    @GetMapping("/allUsers")
//    public String showAllUsers() {
//        return "allUsers";
//    }
//
//}
}
