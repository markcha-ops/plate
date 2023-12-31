package com.bood.ordering.system.domain.event.publisher;

import com.bood.ordering.system.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
