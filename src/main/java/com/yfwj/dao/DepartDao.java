package com.yfwj.dao;


import com.yfwj.entity.DepartEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author yanfeiwuji
 * @date 2021/2/6 9:26 上午
 */
public interface DepartDao extends CrudRepository<DepartEntity,Long > {
}
