package com.ding.async;

import java.util.List;

/**
 * Created by ding on 2018/02/01.
 */
public interface EventHandler {
    void doHandle(EventModel model);
    List<EventType> getSupportEventTypes();
}
