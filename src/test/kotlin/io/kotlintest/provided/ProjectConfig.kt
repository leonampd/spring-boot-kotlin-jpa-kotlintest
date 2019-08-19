package io.kotlintest.provided

import io.kotlintest.AbstractProjectConfig
import io.kotlintest.extensions.ProjectLevelExtension
import io.kotlintest.spring.SpringAutowireConstructorExtension
import io.kotlintest.spring.SpringListener

object ProjectConfig : AbstractProjectConfig() {
    override fun listeners() = listOf(SpringListener)
    override fun extensions(): List<ProjectLevelExtension> = listOf(SpringAutowireConstructorExtension)
}
