package guru.springframework.spring6di.services.enviroments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("Environment")
public class DatasourceServiceDevelopment implements DatasourceService {
    @Override
    public String getDatasource() {
        return "development datasource";
    }
}
