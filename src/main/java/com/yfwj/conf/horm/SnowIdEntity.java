package com.yfwj.conf.horm;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 12:39 下午
 */
@MappedSuperclass
public class SnowIdEntity {
  @Id
  @GeneratedValue(generator = "snowFlakeId")
  @GenericGenerator(name = "snowFlakeId", strategy = "com.yfwj.conf.horm.SnowFlakeIdGenerator")
  @Getter
  @Setter
  private Long id;


}
