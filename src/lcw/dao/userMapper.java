package lcw.dao;

import java.util.List;
import lcw.model.user;
import lcw.model.userExample;
import org.apache.ibatis.annotations.Param;

public interface userMapper {
    long countByExample(userExample example);

    int deleteByExample(userExample example);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userExample example);

    int updateByExampleSelective(@Param("record") user record, @Param("example") userExample example);

    int updateByExample(@Param("record") user record, @Param("example") userExample example);
}