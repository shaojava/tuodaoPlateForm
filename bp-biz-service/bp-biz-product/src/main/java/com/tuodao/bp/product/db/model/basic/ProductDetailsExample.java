package com.tuodao.bp.product.db.model.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDetailsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ProductDetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdIsNull() {
            addCriterion("orginal_id is null");
            return (Criteria) this;
        }

        public Criteria andOrginalIdIsNotNull() {
            addCriterion("orginal_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrginalIdEqualTo(Integer value) {
            addCriterion("orginal_id =", value, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdNotEqualTo(Integer value) {
            addCriterion("orginal_id <>", value, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdGreaterThan(Integer value) {
            addCriterion("orginal_id >", value, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orginal_id >=", value, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdLessThan(Integer value) {
            addCriterion("orginal_id <", value, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdLessThanOrEqualTo(Integer value) {
            addCriterion("orginal_id <=", value, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdIn(List<Integer> values) {
            addCriterion("orginal_id in", values, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdNotIn(List<Integer> values) {
            addCriterion("orginal_id not in", values, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdBetween(Integer value1, Integer value2) {
            addCriterion("orginal_id between", value1, value2, "orginalId");
            return (Criteria) this;
        }

        public Criteria andOrginalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orginal_id not between", value1, value2, "orginalId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNull() {
            addCriterion("borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNotNull() {
            addCriterion("borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdEqualTo(Integer value) {
            addCriterion("borrow_id =", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotEqualTo(Integer value) {
            addCriterion("borrow_id <>", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThan(Integer value) {
            addCriterion("borrow_id >", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_id >=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThan(Integer value) {
            addCriterion("borrow_id <", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_id <=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIn(List<Integer> values) {
            addCriterion("borrow_id in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotIn(List<Integer> values) {
            addCriterion("borrow_id not in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id not between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleIsNull() {
            addCriterion("borrow_title is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleIsNotNull() {
            addCriterion("borrow_title is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleEqualTo(String value) {
            addCriterion("borrow_title =", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleNotEqualTo(String value) {
            addCriterion("borrow_title <>", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleGreaterThan(String value) {
            addCriterion("borrow_title >", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_title >=", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleLessThan(String value) {
            addCriterion("borrow_title <", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleLessThanOrEqualTo(String value) {
            addCriterion("borrow_title <=", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleLike(String value) {
            addCriterion("borrow_title like", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleNotLike(String value) {
            addCriterion("borrow_title not like", value, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleIn(List<String> values) {
            addCriterion("borrow_title in", values, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleNotIn(List<String> values) {
            addCriterion("borrow_title not in", values, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleBetween(String value1, String value2) {
            addCriterion("borrow_title between", value1, value2, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowTitleNotBetween(String value1, String value2) {
            addCriterion("borrow_title not between", value1, value2, "borrowTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIsNull() {
            addCriterion("borrow_amount is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIsNotNull() {
            addCriterion("borrow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountEqualTo(BigDecimal value) {
            addCriterion("borrow_amount =", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotEqualTo(BigDecimal value) {
            addCriterion("borrow_amount <>", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThan(BigDecimal value) {
            addCriterion("borrow_amount >", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_amount >=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThan(BigDecimal value) {
            addCriterion("borrow_amount <", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_amount <=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIn(List<BigDecimal> values) {
            addCriterion("borrow_amount in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotIn(List<BigDecimal> values) {
            addCriterion("borrow_amount not in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_amount between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_amount not between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNull() {
            addCriterion("borrow_type is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNotNull() {
            addCriterion("borrow_type is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeEqualTo(Integer value) {
            addCriterion("borrow_type =", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotEqualTo(Integer value) {
            addCriterion("borrow_type <>", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThan(Integer value) {
            addCriterion("borrow_type >", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_type >=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThan(Integer value) {
            addCriterion("borrow_type <", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_type <=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIn(List<Integer> values) {
            addCriterion("borrow_type in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotIn(List<Integer> values) {
            addCriterion("borrow_type not in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type not between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}