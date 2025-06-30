package com.smartedu.service;

import com.smartedu.entity.Clazz;
import com.smartedu.mapper.ClazzMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClazzService {

    @Resource
    ClazzMapper clazzMapper;

    @Cacheable(value = "clazzListCache")
   public List<Clazz> getAllclasses(){
       return  clazzMapper.getAllclasses();
    }

    public List<Clazz> selectAll(Clazz clazz) {
        return clazzMapper.selectAll(clazz);
    }

   public Clazz selectById(Long id){
        return clazzMapper.selectById(id);
    };

    /** 新增班级，成功返回插入后带主键的对象 */
    public void addClazz(Clazz clazz){
        clazzMapper.insert(clazz);
    };

    /** 更新班级信息，成功返回 true */
    public void updateClazz(Clazz clazz){
        clazzMapper.update(clazz);
    };

    /** 根据 ID 删除班级，成功返回 true */
    public void deleteById(Long id){
        clazzMapper.deleteById(id);
    };


}
