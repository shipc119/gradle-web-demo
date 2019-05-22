import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/**
 * @ClassName StartSwagger
 * @Description
 * @Author shipc
 * @Date 2019/5/7 19:58
 * @Version 1.0
 */
@SpringBootApplication
public class StartSwagger {

    private static Logger logger = LoggerFactory.getLogger(StartSwagger.class);

    public static void main(String[] args) {
        try {
            SpringApplicationBuilder builder = new SpringApplicationBuilder(StartSwagger.class);
            builder.web(WebApplicationType.SERVLET).run(args);
            logger.info("--------Start Swagger-------");
        } catch (Exception e) {
            logger.error("启动异常：", e);
        }
    }
}
