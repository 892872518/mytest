package xu.yingcheng.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import xu.yingcheng.springboot.pojo.Notice;

@Mapper
public interface NoticeMapper {
	@Select("select * from notice")
	public List<Notice> findAll();
	Long count();
	List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);
}
