package xu.yingcheng.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xu.yingcheng.springboot.mapper.NoticeMapper;
import xu.yingcheng.springboot.pojo.Notice;
import xu.yingcheng.springboot.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		/** 创建Map集合封装响应数据 */
		Map<String,Object> data = new HashMap<>();
		Long count = noticeMapper.count();
		data.put("total", count);
		List<Notice> notices = noticeMapper.findByPage((page-1)*rows,rows);
		data.put("rows", notices);
		return data;
	}
}
