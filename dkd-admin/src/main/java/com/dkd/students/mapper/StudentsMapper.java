package com.dkd.students.mapper;

import java.util.List;
import com.dkd.students.domain.Students;

/**
 * 学生信息表Mapper接口
 * 
 * @author oldj
 * @date 2024-08-26
 */
public interface StudentsMapper 
{
    /**
     * 查询学生信息表
     * 
     * @param studentId 学生信息表主键
     * @return 学生信息表
     */
    public Students selectStudentsByStudentId(Long studentId);

    /**
     * 查询学生信息表列表
     * 
     * @param students 学生信息表
     * @return 学生信息表集合
     */
    public List<Students> selectStudentsList(Students students);

    /**
     * 新增学生信息表
     * 
     * @param students 学生信息表
     * @return 结果
     */
    public int insertStudents(Students students);

    /**
     * 修改学生信息表
     * 
     * @param students 学生信息表
     * @return 结果
     */
    public int updateStudents(Students students);

    /**
     * 删除学生信息表
     * 
     * @param studentId 学生信息表主键
     * @return 结果
     */
    public int deleteStudentsByStudentId(Long studentId);

    /**
     * 批量删除学生信息表
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentsByStudentIds(Long[] studentIds);
}
