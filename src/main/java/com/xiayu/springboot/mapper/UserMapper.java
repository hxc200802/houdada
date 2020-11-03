package com.xiayu.springboot.mapper;

import com.xiayu.springboot.domain.UserPo;
import com.xiayu.springboot.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * Description: 
 * 
 * @Author xiayu
 * @Date 2020/11/3 14:27
 * @version v1.0.0
 */
@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UserPo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserPo record);

    List<UserPo> selectByExample(UserExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UserPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserPo record, @Param("example") UserExample example);

    int updateByExample(@Param("record") UserPo record, @Param("example") UserExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserPo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserPo record);

    int updateBatch(List<UserPo> list);

    int updateBatchSelective(List<UserPo> list);

    int batchInsert(@Param("list") List<UserPo> list);

    @Select("SELECT login_name,id,tel FROM user WHERE login_name = #{userName} ")
    UserPo selectByUserName(@Param("userName") String userName);
}