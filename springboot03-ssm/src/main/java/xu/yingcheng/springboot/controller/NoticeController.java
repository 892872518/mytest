package xu.yingcheng.springboot.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xu.yingcheng.springboot.pojo.Notice;
import xu.yingcheng.springboot.service.NoticeService;

@RestController
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@GetMapping("/findAll")
	public List<Notice> item(Model model){
		return noticeService.findAll();
	}
	@PostMapping("/findByPage")
	public Map<String, Object> findByPage(@RequestParam("page")Integer page,@RequestParam("rows")Integer rows) {
		return noticeService.findByPage(page,rows);
	}
}
