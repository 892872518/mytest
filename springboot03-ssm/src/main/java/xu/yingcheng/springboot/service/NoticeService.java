package xu.yingcheng.springboot.service;

import java.util.List;
import java.util.Map;

import xu.yingcheng.springboot.pojo.Notice;

public interface NoticeService {
	public List<Notice> findAll();
	Map<String, Object> findByPage(Integer page,Integer rows);
}
