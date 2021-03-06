package com.rest.conferencedemo.models;

import com.rest.conferencedemo.repositories.TicketTypeJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TicketTypeTest {

    @Autowired
    private TicketTypeJpaRepository jpaRepository;

    @Test
    public void testJpaTrue() throws Exception {
        List<TicketType> types = jpaRepository.findByIncludesWorkshopTrue();
        assertTrue(types.size() > 0);
    }
}
