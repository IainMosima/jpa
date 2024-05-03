package com.springjpa.jpa.specification;

import org.springframework.data.jpa.domain.Specification;

import com.springjpa.jpa.models.Author;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class AuthorSpecification {
    public static Specification<Author> hasAge(int age) {
        return (
                Root<Author> root,
                CriteriaQuery<?> query,
                CriteriaBuilder builder) -> {
            if (age < 0) {
                return null;
            } else {
                return builder.equal(root.get("age"), age);
            }
        };
    }
}
