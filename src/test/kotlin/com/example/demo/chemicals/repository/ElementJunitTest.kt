package com.example.demo.chemicals.repository

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@DataJpaTest
internal class ElementJunitTest(@Autowired val testEntityManager: TestEntityManager) {

    @Test
    fun `saving an element`() {
        val element = Element(name = "Carbon")
        val saved = testEntityManager.persist(element)
        assertThat(saved.id).isNotNull()
    }
}
