package estudos.java.services.projetoEstudoJava.resources.database.config.database;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;

public class FlywayConfigure {
    @Autowired
    private Flyway flyway;

    public void migrateDatabase() {
        flyway.migrate();
    }
}
