package com.yfwj.conf.horm;

import com.yfwj.conf.util.SnowFlake;
import com.yfwj.conf.util.SnowFlakeUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 12:34 下午
 */
public class SnowFlakeIdGenerator implements IdentifierGenerator {

  @Override
  public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
    return SnowFlakeUtil.nextId();
  }


}
