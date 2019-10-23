package cn.edu.ncst.car.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class LicenseImagePersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LicenseImagePersonExample() {
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

        public Criteria andLicenseFrontIsNull() {
            addCriterion("license_front is null");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontIsNotNull() {
            addCriterion("license_front is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontEqualTo(String value) {
            addCriterion("license_front =", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontNotEqualTo(String value) {
            addCriterion("license_front <>", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontGreaterThan(String value) {
            addCriterion("license_front >", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontGreaterThanOrEqualTo(String value) {
            addCriterion("license_front >=", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontLessThan(String value) {
            addCriterion("license_front <", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontLessThanOrEqualTo(String value) {
            addCriterion("license_front <=", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontLike(String value) {
            addCriterion("license_front like", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontNotLike(String value) {
            addCriterion("license_front not like", value, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontIn(List<String> values) {
            addCriterion("license_front in", values, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontNotIn(List<String> values) {
            addCriterion("license_front not in", values, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontBetween(String value1, String value2) {
            addCriterion("license_front between", value1, value2, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseFrontNotBetween(String value1, String value2) {
            addCriterion("license_front not between", value1, value2, "licenseFront");
            return (Criteria) this;
        }

        public Criteria andLicenseBackIsNull() {
            addCriterion("license_back is null");
            return (Criteria) this;
        }

        public Criteria andLicenseBackIsNotNull() {
            addCriterion("license_back is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseBackEqualTo(String value) {
            addCriterion("license_back =", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackNotEqualTo(String value) {
            addCriterion("license_back <>", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackGreaterThan(String value) {
            addCriterion("license_back >", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackGreaterThanOrEqualTo(String value) {
            addCriterion("license_back >=", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackLessThan(String value) {
            addCriterion("license_back <", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackLessThanOrEqualTo(String value) {
            addCriterion("license_back <=", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackLike(String value) {
            addCriterion("license_back like", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackNotLike(String value) {
            addCriterion("license_back not like", value, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackIn(List<String> values) {
            addCriterion("license_back in", values, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackNotIn(List<String> values) {
            addCriterion("license_back not in", values, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackBetween(String value1, String value2) {
            addCriterion("license_back between", value1, value2, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andLicenseBackNotBetween(String value1, String value2) {
            addCriterion("license_back not between", value1, value2, "licenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontIsNull() {
            addCriterion("velicense_front is null");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontIsNotNull() {
            addCriterion("velicense_front is not null");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontEqualTo(String value) {
            addCriterion("velicense_front =", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontNotEqualTo(String value) {
            addCriterion("velicense_front <>", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontGreaterThan(String value) {
            addCriterion("velicense_front >", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontGreaterThanOrEqualTo(String value) {
            addCriterion("velicense_front >=", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontLessThan(String value) {
            addCriterion("velicense_front <", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontLessThanOrEqualTo(String value) {
            addCriterion("velicense_front <=", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontLike(String value) {
            addCriterion("velicense_front like", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontNotLike(String value) {
            addCriterion("velicense_front not like", value, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontIn(List<String> values) {
            addCriterion("velicense_front in", values, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontNotIn(List<String> values) {
            addCriterion("velicense_front not in", values, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontBetween(String value1, String value2) {
            addCriterion("velicense_front between", value1, value2, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseFrontNotBetween(String value1, String value2) {
            addCriterion("velicense_front not between", value1, value2, "velicenseFront");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackIsNull() {
            addCriterion("velicense_back is null");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackIsNotNull() {
            addCriterion("velicense_back is not null");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackEqualTo(String value) {
            addCriterion("velicense_back =", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackNotEqualTo(String value) {
            addCriterion("velicense_back <>", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackGreaterThan(String value) {
            addCriterion("velicense_back >", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackGreaterThanOrEqualTo(String value) {
            addCriterion("velicense_back >=", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackLessThan(String value) {
            addCriterion("velicense_back <", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackLessThanOrEqualTo(String value) {
            addCriterion("velicense_back <=", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackLike(String value) {
            addCriterion("velicense_back like", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackNotLike(String value) {
            addCriterion("velicense_back not like", value, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackIn(List<String> values) {
            addCriterion("velicense_back in", values, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackNotIn(List<String> values) {
            addCriterion("velicense_back not in", values, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackBetween(String value1, String value2) {
            addCriterion("velicense_back between", value1, value2, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andVelicenseBackNotBetween(String value1, String value2) {
            addCriterion("velicense_back not between", value1, value2, "velicenseBack");
            return (Criteria) this;
        }

        public Criteria andCarFrontIsNull() {
            addCriterion("car_front is null");
            return (Criteria) this;
        }

        public Criteria andCarFrontIsNotNull() {
            addCriterion("car_front is not null");
            return (Criteria) this;
        }

        public Criteria andCarFrontEqualTo(String value) {
            addCriterion("car_front =", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontNotEqualTo(String value) {
            addCriterion("car_front <>", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontGreaterThan(String value) {
            addCriterion("car_front >", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontGreaterThanOrEqualTo(String value) {
            addCriterion("car_front >=", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontLessThan(String value) {
            addCriterion("car_front <", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontLessThanOrEqualTo(String value) {
            addCriterion("car_front <=", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontLike(String value) {
            addCriterion("car_front like", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontNotLike(String value) {
            addCriterion("car_front not like", value, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontIn(List<String> values) {
            addCriterion("car_front in", values, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontNotIn(List<String> values) {
            addCriterion("car_front not in", values, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontBetween(String value1, String value2) {
            addCriterion("car_front between", value1, value2, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarFrontNotBetween(String value1, String value2) {
            addCriterion("car_front not between", value1, value2, "carFront");
            return (Criteria) this;
        }

        public Criteria andCarBackIsNull() {
            addCriterion("car_back is null");
            return (Criteria) this;
        }

        public Criteria andCarBackIsNotNull() {
            addCriterion("car_back is not null");
            return (Criteria) this;
        }

        public Criteria andCarBackEqualTo(String value) {
            addCriterion("car_back =", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackNotEqualTo(String value) {
            addCriterion("car_back <>", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackGreaterThan(String value) {
            addCriterion("car_back >", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackGreaterThanOrEqualTo(String value) {
            addCriterion("car_back >=", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackLessThan(String value) {
            addCriterion("car_back <", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackLessThanOrEqualTo(String value) {
            addCriterion("car_back <=", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackLike(String value) {
            addCriterion("car_back like", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackNotLike(String value) {
            addCriterion("car_back not like", value, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackIn(List<String> values) {
            addCriterion("car_back in", values, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackNotIn(List<String> values) {
            addCriterion("car_back not in", values, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackBetween(String value1, String value2) {
            addCriterion("car_back between", value1, value2, "carBack");
            return (Criteria) this;
        }

        public Criteria andCarBackNotBetween(String value1, String value2) {
            addCriterion("car_back not between", value1, value2, "carBack");
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