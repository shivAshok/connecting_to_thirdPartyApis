package connect_to_thirdParty.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/get-the-movie")
    public Movie GettheMovie(@RequestParam Integer id){
        return  movieService.getThemovie(id);
    }
}
