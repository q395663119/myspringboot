package mapper;

import entity.Computer;

public interface ComputerMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}