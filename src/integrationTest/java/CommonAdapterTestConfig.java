import com.mahesh.movies.api.moviesapi.CommonConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CommonConfig.class})
public class CommonAdapterTestConfig {

}
