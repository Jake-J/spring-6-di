package guru.springframework.spring6di.services.enviroments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("Environment")
public class DatasourceServicePROD implements DatasourceService {
    @Override
    public String getDatasource() {

        return "PROD datasource";
    }
}
