package com.personal.interceptor;

import org.hibernate.EmptyInterceptor;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Date;

/**
 * Created by Beauclair-Papix on 7/27/2015.
 */
public class AuditInterceptor extends EmptyInterceptor{

   public  boolean onSave(Object entity, Serializable id, Object[] state,
                   String[] propertyNames, Type[] types) {
        if (entity instanceof Auditable) {
            for ( int i=0; i < propertyNames.length; i++ ) {
                if ( "created".equals( propertyNames[i] ) ) {
                    state[i] = new Date();
                    return true;
                }
            }
            return true;
        }
        return false;
    }


    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState,
                                Object[] previousState, String[] propertyNames, Type[] types) {
        if (entity instanceof Auditable) {
            for ( int i=0; i < propertyNames.length; i++ ) {
                if ( "lastUpdate".equals( propertyNames[i] ) ) {
                    currentState[i] = new Date();
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
