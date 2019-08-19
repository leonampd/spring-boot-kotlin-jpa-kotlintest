package com.example.demo.chemicals.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ElementRepository : JpaRepository<Element, String>
