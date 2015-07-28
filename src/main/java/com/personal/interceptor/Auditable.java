package com.personal.interceptor;

import java.util.Date;

/**
 * Created by Beauclair-Papix on 7/27/2015.
 */
public interface Auditable {

    Date getCreated();
    void setCreated(Date created);
    Date getLastUpdate();
    void setLastUpdate(Date lastUpdate);
}
