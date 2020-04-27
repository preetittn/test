package com.springdata.idgenerators.employee.entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class CustomidGenerator implements IdentifierGenerator {

    public Serializable generate(SessionImplementor sessionImplementor,Object object) throws HibernateException
    {
        Random random=null;
        int id=0;

        random=new Random();
        id=random.nextInt(10000);
        return new int[id];
    }
}
