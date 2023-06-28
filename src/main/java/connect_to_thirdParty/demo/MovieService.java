package connect_to_thirdParty.demo;

public class MovieService {
    MovieClient movieclient=new MovieClient();
    public Movie getThemovie(Integer id) {
        return movieclient.getIt(id);
    }
}
