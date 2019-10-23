package cn.edu.ncst.car.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LicenseApplyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LicenseApplyinfoExample() {
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

        public Criteria andImageConpanyIdIsNull() {
            addCriterion("image_conpany_id is null");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdIsNotNull() {
            addCriterion("image_conpany_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdEqualTo(Integer value) {
            addCriterion("image_conpany_id =", value, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdNotEqualTo(Integer value) {
            addCriterion("image_conpany_id <>", value, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdGreaterThan(Integer value) {
            addCriterion("image_conpany_id >", value, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_conpany_id >=", value, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdLessThan(Integer value) {
            addCriterion("image_conpany_id <", value, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("image_conpany_id <=", value, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdIn(List<Integer> values) {
            addCriterion("image_conpany_id in", values, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdNotIn(List<Integer> values) {
            addCriterion("image_conpany_id not in", values, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdBetween(Integer value1, Integer value2) {
            addCriterion("image_conpany_id between", value1, value2, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImageConpanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("image_conpany_id not between", value1, value2, "imageConpanyId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdIsNull() {
            addCriterion("image_person_id is null");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdIsNotNull() {
            addCriterion("image_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdEqualTo(Integer value) {
            addCriterion("image_person_id =", value, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdNotEqualTo(Integer value) {
            addCriterion("image_person_id <>", value, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdGreaterThan(Integer value) {
            addCriterion("image_person_id >", value, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_person_id >=", value, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdLessThan(Integer value) {
            addCriterion("image_person_id <", value, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("image_person_id <=", value, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdIn(List<Integer> values) {
            addCriterion("image_person_id in", values, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdNotIn(List<Integer> values) {
            addCriterion("image_person_id not in", values, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdBetween(Integer value1, Integer value2) {
            addCriterion("image_person_id between", value1, value2, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andImagePersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("image_person_id not between", value1, value2, "imagePersonId");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNull() {
            addCriterion("plate_no is null");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNotNull() {
            addCriterion("plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNoEqualTo(String value) {
            addCriterion("plate_no =", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotEqualTo(String value) {
            addCriterion("plate_no <>", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThan(String value) {
            addCriterion("plate_no >", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("plate_no >=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThan(String value) {
            addCriterion("plate_no <", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThanOrEqualTo(String value) {
            addCriterion("plate_no <=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLike(String value) {
            addCriterion("plate_no like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotLike(String value) {
            addCriterion("plate_no not like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoIn(List<String> values) {
            addCriterion("plate_no in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotIn(List<String> values) {
            addCriterion("plate_no not in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoBetween(String value1, String value2) {
            addCriterion("plate_no between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotBetween(String value1, String value2) {
            addCriterion("plate_no not between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIsNull() {
            addCriterion("plate_type is null");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIsNotNull() {
            addCriterion("plate_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlateTypeEqualTo(String value) {
            addCriterion("plate_type =", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotEqualTo(String value) {
            addCriterion("plate_type <>", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeGreaterThan(String value) {
            addCriterion("plate_type >", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plate_type >=", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeLessThan(String value) {
            addCriterion("plate_type <", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeLessThanOrEqualTo(String value) {
            addCriterion("plate_type <=", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeLike(String value) {
            addCriterion("plate_type like", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotLike(String value) {
            addCriterion("plate_type not like", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIn(List<String> values) {
            addCriterion("plate_type in", values, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotIn(List<String> values) {
            addCriterion("plate_type not in", values, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeBetween(String value1, String value2) {
            addCriterion("plate_type between", value1, value2, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotBetween(String value1, String value2) {
            addCriterion("plate_type not between", value1, value2, "plateType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeIsNull() {
            addCriterion("pass_license_type is null");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeIsNotNull() {
            addCriterion("pass_license_type is not null");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeEqualTo(String value) {
            addCriterion("pass_license_type =", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeNotEqualTo(String value) {
            addCriterion("pass_license_type <>", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeGreaterThan(String value) {
            addCriterion("pass_license_type >", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pass_license_type >=", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeLessThan(String value) {
            addCriterion("pass_license_type <", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeLessThanOrEqualTo(String value) {
            addCriterion("pass_license_type <=", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeLike(String value) {
            addCriterion("pass_license_type like", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeNotLike(String value) {
            addCriterion("pass_license_type not like", value, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeIn(List<String> values) {
            addCriterion("pass_license_type in", values, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeNotIn(List<String> values) {
            addCriterion("pass_license_type not in", values, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeBetween(String value1, String value2) {
            addCriterion("pass_license_type between", value1, value2, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andPassLicenseTypeNotBetween(String value1, String value2) {
            addCriterion("pass_license_type not between", value1, value2, "passLicenseType");
            return (Criteria) this;
        }

        public Criteria andApplyPositIsNull() {
            addCriterion("apply_posit is null");
            return (Criteria) this;
        }

        public Criteria andApplyPositIsNotNull() {
            addCriterion("apply_posit is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPositEqualTo(String value) {
            addCriterion("apply_posit =", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositNotEqualTo(String value) {
            addCriterion("apply_posit <>", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositGreaterThan(String value) {
            addCriterion("apply_posit >", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositGreaterThanOrEqualTo(String value) {
            addCriterion("apply_posit >=", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositLessThan(String value) {
            addCriterion("apply_posit <", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositLessThanOrEqualTo(String value) {
            addCriterion("apply_posit <=", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositLike(String value) {
            addCriterion("apply_posit like", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositNotLike(String value) {
            addCriterion("apply_posit not like", value, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositIn(List<String> values) {
            addCriterion("apply_posit in", values, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositNotIn(List<String> values) {
            addCriterion("apply_posit not in", values, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositBetween(String value1, String value2) {
            addCriterion("apply_posit between", value1, value2, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyPositNotBetween(String value1, String value2) {
            addCriterion("apply_posit not between", value1, value2, "applyPosit");
            return (Criteria) this;
        }

        public Criteria andApplyRouteIsNull() {
            addCriterion("apply_route is null");
            return (Criteria) this;
        }

        public Criteria andApplyRouteIsNotNull() {
            addCriterion("apply_route is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRouteEqualTo(String value) {
            addCriterion("apply_route =", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteNotEqualTo(String value) {
            addCriterion("apply_route <>", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteGreaterThan(String value) {
            addCriterion("apply_route >", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteGreaterThanOrEqualTo(String value) {
            addCriterion("apply_route >=", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteLessThan(String value) {
            addCriterion("apply_route <", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteLessThanOrEqualTo(String value) {
            addCriterion("apply_route <=", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteLike(String value) {
            addCriterion("apply_route like", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteNotLike(String value) {
            addCriterion("apply_route not like", value, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteIn(List<String> values) {
            addCriterion("apply_route in", values, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteNotIn(List<String> values) {
            addCriterion("apply_route not in", values, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteBetween(String value1, String value2) {
            addCriterion("apply_route between", value1, value2, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyRouteNotBetween(String value1, String value2) {
            addCriterion("apply_route not between", value1, value2, "applyRoute");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNull() {
            addCriterion("idcard_no is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNotNull() {
            addCriterion("idcard_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoEqualTo(String value) {
            addCriterion("idcard_no =", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotEqualTo(String value) {
            addCriterion("idcard_no <>", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThan(String value) {
            addCriterion("idcard_no >", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_no >=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThan(String value) {
            addCriterion("idcard_no <", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("idcard_no <=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLike(String value) {
            addCriterion("idcard_no like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotLike(String value) {
            addCriterion("idcard_no not like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIn(List<String> values) {
            addCriterion("idcard_no in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotIn(List<String> values) {
            addCriterion("idcard_no not in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoBetween(String value1, String value2) {
            addCriterion("idcard_no between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotBetween(String value1, String value2) {
            addCriterion("idcard_no not between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeIsNull() {
            addCriterion("apply_createtime is null");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeIsNotNull() {
            addCriterion("apply_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeEqualTo(Date value) {
            addCriterion("apply_createtime =", value, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeNotEqualTo(Date value) {
            addCriterion("apply_createtime <>", value, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeGreaterThan(Date value) {
            addCriterion("apply_createtime >", value, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_createtime >=", value, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeLessThan(Date value) {
            addCriterion("apply_createtime <", value, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_createtime <=", value, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeIn(List<Date> values) {
            addCriterion("apply_createtime in", values, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeNotIn(List<Date> values) {
            addCriterion("apply_createtime not in", values, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeBetween(Date value1, Date value2) {
            addCriterion("apply_createtime between", value1, value2, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andApplyCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_createtime not between", value1, value2, "applyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("deal_time is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("deal_time is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("deal_time =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("deal_time <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("deal_time >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deal_time >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("deal_time <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("deal_time <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("deal_time in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("deal_time not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("deal_time between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("deal_time not between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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

        public Criteria andHandlerIdIsNull() {
            addCriterion("handler_id is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIdIsNotNull() {
            addCriterion("handler_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerIdEqualTo(Integer value) {
            addCriterion("handler_id =", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotEqualTo(Integer value) {
            addCriterion("handler_id <>", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdGreaterThan(Integer value) {
            addCriterion("handler_id >", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("handler_id >=", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLessThan(Integer value) {
            addCriterion("handler_id <", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLessThanOrEqualTo(Integer value) {
            addCriterion("handler_id <=", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdIn(List<Integer> values) {
            addCriterion("handler_id in", values, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotIn(List<Integer> values) {
            addCriterion("handler_id not in", values, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdBetween(Integer value1, Integer value2) {
            addCriterion("handler_id between", value1, value2, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("handler_id not between", value1, value2, "handlerId");
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