package com.example.demo.chemicals.repository

import io.kotlintest.shouldNotBe
import io.kotlintest.specs.AnnotationSpec
import javax.persistence.EntityManager
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
internal class ElementAnnotaionTest(
    val testEntityManager: EntityManager
) : AnnotationSpec() {

    @Test
    fun testIt() {
        val element = Element(
            name = "hydrogen"
        )

        val saved = testEntityManager.persist(element)

        element.id shouldNotBe null
    }
}
