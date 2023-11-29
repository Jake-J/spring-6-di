package guru.springframework.spring6di.services.enviroments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("Environment")
public class DatasourceServiceQA implements DatasourceService {
    @Override
    public String getDatasource() {

        return "QA datasource";
    }
}
