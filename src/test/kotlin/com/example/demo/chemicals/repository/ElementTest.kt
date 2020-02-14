package com.example.demo.chemicals.repository

import io.kotlintest.IsolationMode
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.BehaviorSpec
import javax.persistence.EntityManager
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
internal class ElementTest(
    val testEntityManager: EntityManager
) : BehaviorSpec() {

    override fun isolationMode(): IsolationMode? = IsolationMode.InstancePerTest

    init {
        Given("An empty database") {

            val element = Element(
                name = "hydrogen"
            )
            When("It's saved") {
                val saved = testEntityManager.persist(element)
                Then("There are no errors") {
                    element.id shouldNotBe null
                }
            }
        }
    }
}
