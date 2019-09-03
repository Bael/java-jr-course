package io.github.bael.spring.data.data;

import io.github.bael.spring.data.entity.Book;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class BookSpecifications {

    public static Specification<Book> byYearRange(int startYear, int finishYear) {
        return yearLessThan(finishYear).and(yearGreaterThan(startYear));
    }

    public static Specification<Book> yearLessThan(int finishYear) {
        return (root, query, criteriaBuilder) ->
            criteriaBuilder.lessThanOrEqualTo(root.get("year"), finishYear);
    }

    public static Specification<Book> yearGreaterThan(int startYear) {
        return (root, query, criteriaBuilder) ->
            criteriaBuilder.greaterThanOrEqualTo(root.get("year"), startYear);
    }

    public static Specification<Book> titleStartsWith(String titleStart) {
        return (root, query, criteriaBuilder) ->
            criteriaBuilder.like(root.get("title"), titleStart);
    }




}
