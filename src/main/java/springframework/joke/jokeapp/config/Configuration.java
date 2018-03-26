package springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;

/**
 * @author Kevin Neag
 */

/**
 * Configuration class for use by external jar
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
