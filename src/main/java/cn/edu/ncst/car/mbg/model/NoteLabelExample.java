package cn.edu.ncst.car.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class NoteLabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteLabelExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLabel1IsNull() {
            addCriterion("label1 is null");
            return (Criteria) this;
        }

        public Criteria andLabel1IsNotNull() {
            addCriterion("label1 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel1EqualTo(String value) {
            addCriterion("label1 =", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotEqualTo(String value) {
            addCriterion("label1 <>", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1GreaterThan(String value) {
            addCriterion("label1 >", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1GreaterThanOrEqualTo(String value) {
            addCriterion("label1 >=", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1LessThan(String value) {
            addCriterion("label1 <", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1LessThanOrEqualTo(String value) {
            addCriterion("label1 <=", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1Like(String value) {
            addCriterion("label1 like", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotLike(String value) {
            addCriterion("label1 not like", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1In(List<String> values) {
            addCriterion("label1 in", values, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotIn(List<String> values) {
            addCriterion("label1 not in", values, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1Between(String value1, String value2) {
            addCriterion("label1 between", value1, value2, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotBetween(String value1, String value2) {
            addCriterion("label1 not between", value1, value2, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel2IsNull() {
            addCriterion("label2 is null");
            return (Criteria) this;
        }

        public Criteria andLabel2IsNotNull() {
            addCriterion("label2 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel2EqualTo(String value) {
            addCriterion("label2 =", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotEqualTo(String value) {
            addCriterion("label2 <>", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2GreaterThan(String value) {
            addCriterion("label2 >", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2GreaterThanOrEqualTo(String value) {
            addCriterion("label2 >=", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2LessThan(String value) {
            addCriterion("label2 <", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2LessThanOrEqualTo(String value) {
            addCriterion("label2 <=", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2Like(String value) {
            addCriterion("label2 like", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotLike(String value) {
            addCriterion("label2 not like", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2In(List<String> values) {
            addCriterion("label2 in", values, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotIn(List<String> values) {
            addCriterion("label2 not in", values, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2Between(String value1, String value2) {
            addCriterion("label2 between", value1, value2, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotBetween(String value1, String value2) {
            addCriterion("label2 not between", value1, value2, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel3IsNull() {
            addCriterion("label3 is null");
            return (Criteria) this;
        }

        public Criteria andLabel3IsNotNull() {
            addCriterion("label3 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel3EqualTo(String value) {
            addCriterion("label3 =", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotEqualTo(String value) {
            addCriterion("label3 <>", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3GreaterThan(String value) {
            addCriterion("label3 >", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3GreaterThanOrEqualTo(String value) {
            addCriterion("label3 >=", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3LessThan(String value) {
            addCriterion("label3 <", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3LessThanOrEqualTo(String value) {
            addCriterion("label3 <=", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3Like(String value) {
            addCriterion("label3 like", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotLike(String value) {
            addCriterion("label3 not like", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3In(List<String> values) {
            addCriterion("label3 in", values, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotIn(List<String> values) {
            addCriterion("label3 not in", values, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3Between(String value1, String value2) {
            addCriterion("label3 between", value1, value2, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotBetween(String value1, String value2) {
            addCriterion("label3 not between", value1, value2, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel4IsNull() {
            addCriterion("label4 is null");
            return (Criteria) this;
        }

        public Criteria andLabel4IsNotNull() {
            addCriterion("label4 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel4EqualTo(String value) {
            addCriterion("label4 =", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotEqualTo(String value) {
            addCriterion("label4 <>", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4GreaterThan(String value) {
            addCriterion("label4 >", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4GreaterThanOrEqualTo(String value) {
            addCriterion("label4 >=", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4LessThan(String value) {
            addCriterion("label4 <", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4LessThanOrEqualTo(String value) {
            addCriterion("label4 <=", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4Like(String value) {
            addCriterion("label4 like", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotLike(String value) {
            addCriterion("label4 not like", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4In(List<String> values) {
            addCriterion("label4 in", values, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotIn(List<String> values) {
            addCriterion("label4 not in", values, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4Between(String value1, String value2) {
            addCriterion("label4 between", value1, value2, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotBetween(String value1, String value2) {
            addCriterion("label4 not between", value1, value2, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel5IsNull() {
            addCriterion("label5 is null");
            return (Criteria) this;
        }

        public Criteria andLabel5IsNotNull() {
            addCriterion("label5 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel5EqualTo(String value) {
            addCriterion("label5 =", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotEqualTo(String value) {
            addCriterion("label5 <>", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5GreaterThan(String value) {
            addCriterion("label5 >", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5GreaterThanOrEqualTo(String value) {
            addCriterion("label5 >=", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5LessThan(String value) {
            addCriterion("label5 <", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5LessThanOrEqualTo(String value) {
            addCriterion("label5 <=", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5Like(String value) {
            addCriterion("label5 like", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotLike(String value) {
            addCriterion("label5 not like", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5In(List<String> values) {
            addCriterion("label5 in", values, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotIn(List<String> values) {
            addCriterion("label5 not in", values, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5Between(String value1, String value2) {
            addCriterion("label5 between", value1, value2, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotBetween(String value1, String value2) {
            addCriterion("label5 not between", value1, value2, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel6IsNull() {
            addCriterion("label6 is null");
            return (Criteria) this;
        }

        public Criteria andLabel6IsNotNull() {
            addCriterion("label6 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel6EqualTo(String value) {
            addCriterion("label6 =", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotEqualTo(String value) {
            addCriterion("label6 <>", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6GreaterThan(String value) {
            addCriterion("label6 >", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6GreaterThanOrEqualTo(String value) {
            addCriterion("label6 >=", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6LessThan(String value) {
            addCriterion("label6 <", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6LessThanOrEqualTo(String value) {
            addCriterion("label6 <=", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6Like(String value) {
            addCriterion("label6 like", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotLike(String value) {
            addCriterion("label6 not like", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6In(List<String> values) {
            addCriterion("label6 in", values, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotIn(List<String> values) {
            addCriterion("label6 not in", values, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6Between(String value1, String value2) {
            addCriterion("label6 between", value1, value2, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotBetween(String value1, String value2) {
            addCriterion("label6 not between", value1, value2, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel7IsNull() {
            addCriterion("label7 is null");
            return (Criteria) this;
        }

        public Criteria andLabel7IsNotNull() {
            addCriterion("label7 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel7EqualTo(String value) {
            addCriterion("label7 =", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7NotEqualTo(String value) {
            addCriterion("label7 <>", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7GreaterThan(String value) {
            addCriterion("label7 >", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7GreaterThanOrEqualTo(String value) {
            addCriterion("label7 >=", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7LessThan(String value) {
            addCriterion("label7 <", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7LessThanOrEqualTo(String value) {
            addCriterion("label7 <=", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7Like(String value) {
            addCriterion("label7 like", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7NotLike(String value) {
            addCriterion("label7 not like", value, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7In(List<String> values) {
            addCriterion("label7 in", values, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7NotIn(List<String> values) {
            addCriterion("label7 not in", values, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7Between(String value1, String value2) {
            addCriterion("label7 between", value1, value2, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel7NotBetween(String value1, String value2) {
            addCriterion("label7 not between", value1, value2, "label7");
            return (Criteria) this;
        }

        public Criteria andLabel8IsNull() {
            addCriterion("label8 is null");
            return (Criteria) this;
        }

        public Criteria andLabel8IsNotNull() {
            addCriterion("label8 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel8EqualTo(String value) {
            addCriterion("label8 =", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8NotEqualTo(String value) {
            addCriterion("label8 <>", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8GreaterThan(String value) {
            addCriterion("label8 >", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8GreaterThanOrEqualTo(String value) {
            addCriterion("label8 >=", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8LessThan(String value) {
            addCriterion("label8 <", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8LessThanOrEqualTo(String value) {
            addCriterion("label8 <=", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8Like(String value) {
            addCriterion("label8 like", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8NotLike(String value) {
            addCriterion("label8 not like", value, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8In(List<String> values) {
            addCriterion("label8 in", values, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8NotIn(List<String> values) {
            addCriterion("label8 not in", values, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8Between(String value1, String value2) {
            addCriterion("label8 between", value1, value2, "label8");
            return (Criteria) this;
        }

        public Criteria andLabel8NotBetween(String value1, String value2) {
            addCriterion("label8 not between", value1, value2, "label8");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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