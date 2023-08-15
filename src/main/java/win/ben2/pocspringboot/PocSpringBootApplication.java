package win.ben2.pocspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@MapperScan()
public class PocSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocSpringBootApplication.class, args);
    }
    private final CityMapper cityMapper;

    public PocSpringBootApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return args -> {
            City city = new City();
            city.setName("San Francisco");
            city.setState("CA");
            city.setCountry("US");
            cityMapper.insert(city);
            System.out.println(this.cityMapper.findById(city.getId()));
        };
    }


}
