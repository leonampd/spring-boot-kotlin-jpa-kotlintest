# Kotlintest and Spring Data JPA

`@DataJpaTest` does not appear to work with kotlintest. 
The tests fail with the error:

    javax.persistence.TransactionRequiredException: No EntityManager with actual transaction available for current thread - cannot reliably process 'persist' call
    
Note that the standard JUnit 5 test works.

See tests:

 * [ElementAnnotationTest](src/test/kotlin/com/example/demo/chemicals/repository/ElementAnnotaionTest.kt) (fails)
 * [ElementJunitTest](src/test/kotlin/com/example/demo/chemicals/repository/ElementJunitTest.kt) (passes)
 * [ElementTest](src/test/kotlin/com/example/demo/chemicals/repository/ElementTest.kt) (fails)
 
Run the tests with:

    $ ./mvnw test
