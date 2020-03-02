package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.coderslab.Repositories.TweetRepo;
import pl.coderslab.model.Tweet;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Controller
public class TweetController {

    @Autowired
    TweetRepo tweetRepo;



}
