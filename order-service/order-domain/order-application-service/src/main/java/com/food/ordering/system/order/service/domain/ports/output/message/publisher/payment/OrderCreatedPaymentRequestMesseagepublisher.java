package com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment;

import com.bood.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.evnet.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMesseagepublisher extends DomainEventPublisher<OrderCreatedEvent> {
}