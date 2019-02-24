package com.github.gazilabs.kpq;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class KafkaPriorityQueueConsumerTest {

  @Test
  public void can_instantiate_consumer() {
    assertNotNull(new KafkaPriorityQueueConsumer());
  }

}
