package connect_to_thirdParty.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MovieClient {
    private String url="https://api.themoviedb.org/3/movie/%s?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e";
    private String post_url="https://api.themoviedb.org/3/movie/?api_key=%s";
    private String Key="cd46fe13f1442cfa663d94a7d3ed7e5e";
    RestTemplate restTemplate=new RestTemplate();
    public Movie getIt(Integer id) {
        String url2=String.format(url,id);
        return restTemplate.getForObject(url2,Movie.class);
    }
    public String PostIt(Movie movie){
        String posturl=String.format(post_url,this.Key);
        HttpEntity entity=new HttpEntity(movie);
        ResponseEntity<String> response=restTemplate.exchange(posturl, HttpMethod.POST,entity,String.class);
        if(response.getStatusCode().is2xxSuccessful()){
            return "added Successfully";
        }
        return "not added";
    }
}
