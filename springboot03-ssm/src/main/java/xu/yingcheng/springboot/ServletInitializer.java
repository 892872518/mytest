package xu.yingcheng.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * war包项目的入口
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 下午5:01:37
 * @version 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		System.out.println("===ServletInitializer===");
		/** 设置启动类 */
		builder.sources(Application.class);
		/** 设置Banner为关闭 */
		builder.bannerMode(Mode.OFF);
		return builder;
	}
}
