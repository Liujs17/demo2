package com.example2.demo2.service;

import com.example2.demo2.entity.Stu;
import java.util.List;

/**
 * (Stu)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 17:24:18
 */
public interface StuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stu queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Stu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    Stu insert(Stu stu);

    /**
     * 修改数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    Stu update(Stu stu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}