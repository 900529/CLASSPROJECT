package com.app.manager.mapper;

import com.app.manager.domain.DeptDTO;
import com.app.manager.domain.DeptSearchOption;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper2 {

    // 전체 부서 리스트
  @Select("select * from dept")
    List<DeptDTO> selectAll();

    // 검색 타입과 키워드를 받아서 검색 결과를 반환
    List<DeptDTO> selectByOption(DeptSearchOption searchOption);

    List<DeptDTO> selectByDeptnos(List<Integer> deptnos);

    // 수정 / 상세 페이지
    @Select("select * from dept where deptno=#{deptno}")
    DeptDTO selectBydeptno(int deptno);

    // 수정(변경) 처리
    @Update( "update dept set dname=#{dname}, loc=#{loc} where deptno=#{deptno}")
    int updateDept(DeptDTO deptDTO);

    // 삭제
    @Delete("delete from dept where deptno =#{no}")
    int deleteByDeptno(int deptno);

    // 입력
    @Insert("insert into dept values (#{deptno}, #{dname}, #{loc})")
    int insertDept(DeptDTO deptDTO);



}