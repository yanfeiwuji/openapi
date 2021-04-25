package com.yfwj.entity;

import com.yfwj.conf.horm.SnowIdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 11:00 下午
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "depart")
public class DepartEntity extends SnowIdEntity {
  String name;
}
