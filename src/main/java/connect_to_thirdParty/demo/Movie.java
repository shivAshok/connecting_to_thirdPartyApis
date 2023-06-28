package connect_to_thirdParty.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String imdb_id;
    private String original_language;
    private String original_title;
}
