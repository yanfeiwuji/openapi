package com.yfwj.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yfwj.conf.horm.SnowIdATPEntity;
import com.yfwj.conf.horm.SnowIdEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 11:11 下午
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "depart_attr")
@NoArgsConstructor
public class DepartAttrEntity extends SnowIdATPEntity {


  @Column
  private String name;

  @Column
  private String value;

  @Column
  private Long departId;

  public DepartAttrEntity(String name, String value, Long departId) {
    this.name = name;
    this.value = value;
    this.departId = departId;
  }
}
