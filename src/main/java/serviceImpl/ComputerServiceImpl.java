package serviceImpl;

import entity.Computer;
import mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ComputerService;

@Service
public class ComputerServiceImpl implements ComputerService {
    @Autowired
    ComputerMapper cp;//自动注入mapper
    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return cp.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(Computer record) {
        return cp.insert(record);
    }

    @Override
    public int insertSelective(Computer record) {
        return cp.insertSelective(record);
    }

    @Override
    public Computer selectByPrimaryKey(Integer pid) {
        return cp.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Computer record) {
        return cp.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Computer record) {
        return cp.updateByPrimaryKey(record);
    }
}
