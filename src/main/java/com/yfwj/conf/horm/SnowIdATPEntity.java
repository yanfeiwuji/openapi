package com.yfwj.conf.horm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 11:17 下午
 */
@MappedSuperclass
public class SnowIdATPEntity {

  @Id
  @GeneratedValue(generator = "snowFlakeId")
  @GenericGenerator(name = "snowFlakeId", strategy = "com.yfwj.conf.horm.SnowFlakeIdGenerator")
  @Getter
  @Setter
  @Access(AccessType.PROPERTY)
  @JsonIgnore
  private Long id;
}
