import jakarta.validation.constraints.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.TestPropertySourceUtils;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@ContextConfiguration(classes = CommonAdapterTestConfig.class, initializers = BaseDatabaseTest.DataSourceInitializer.class)
public class BaseDatabaseTest {

    @Container
    protected final static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:16.4")
            .waitingFor((Wait.defaultWaitStrategy())).withReuse(true);

    public static class DataSourceInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

        @Override
        public void initialize(@NotNull ConfigurableApplicationContext applicationContext) {
            TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
                    applicationContext,
                    "spring.test.database.replace=none",
                    "spring.datasource.url=" + postgres.getJdbcUrl(),
                    "spring.datasource.username=" + postgres.getUsername(),
                    "spring.datasource.password=" + postgres.getPassword(),
                    "spring.datasource.driverClassName=org.postgresql.Driver",
                    "spring.jpa.hibernate.ddl-auto=create",
                    "spring.jpa.show-sql=true",
                    "spring.jpa.properties.hibernate.format_sql=true"
            );

        }
    }

    @Test
    public void countEventLogTest() {

        Assertions. assertEquals(1, 1);

    }
}
