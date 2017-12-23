package xu.yingcheng.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;

@SpringBootApplication // 代表为SpringBoot应用的运行主类
public class Application {
	
	public static void main(String[] args) {
		/** 创建SpringApplication应用对象 */
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		/** 设置横幅模式(设置关闭) */
		springApplication.setBannerMode(Banner.Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}
