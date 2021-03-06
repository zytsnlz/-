package cn.edu.ncst.car.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountIdentifyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountIdentifyinfoExample() {
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

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1IsNull() {
            addCriterion("id_card_image1 is null");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1IsNotNull() {
            addCriterion("id_card_image1 is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1EqualTo(String value) {
            addCriterion("id_card_image1 =", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1NotEqualTo(String value) {
            addCriterion("id_card_image1 <>", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1GreaterThan(String value) {
            addCriterion("id_card_image1 >", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1GreaterThanOrEqualTo(String value) {
            addCriterion("id_card_image1 >=", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1LessThan(String value) {
            addCriterion("id_card_image1 <", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1LessThanOrEqualTo(String value) {
            addCriterion("id_card_image1 <=", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1Like(String value) {
            addCriterion("id_card_image1 like", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1NotLike(String value) {
            addCriterion("id_card_image1 not like", value, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1In(List<String> values) {
            addCriterion("id_card_image1 in", values, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1NotIn(List<String> values) {
            addCriterion("id_card_image1 not in", values, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1Between(String value1, String value2) {
            addCriterion("id_card_image1 between", value1, value2, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage1NotBetween(String value1, String value2) {
            addCriterion("id_card_image1 not between", value1, value2, "idCardImage1");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2IsNull() {
            addCriterion("id_card_image2 is null");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2IsNotNull() {
            addCriterion("id_card_image2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2EqualTo(String value) {
            addCriterion("id_card_image2 =", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2NotEqualTo(String value) {
            addCriterion("id_card_image2 <>", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2GreaterThan(String value) {
            addCriterion("id_card_image2 >", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2GreaterThanOrEqualTo(String value) {
            addCriterion("id_card_image2 >=", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2LessThan(String value) {
            addCriterion("id_card_image2 <", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2LessThanOrEqualTo(String value) {
            addCriterion("id_card_image2 <=", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2Like(String value) {
            addCriterion("id_card_image2 like", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2NotLike(String value) {
            addCriterion("id_card_image2 not like", value, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2In(List<String> values) {
            addCriterion("id_card_image2 in", values, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2NotIn(List<String> values) {
            addCriterion("id_card_image2 not in", values, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2Between(String value1, String value2) {
            addCriterion("id_card_image2 between", value1, value2, "idCardImage2");
            return (Criteria) this;
        }

        public Criteria andIdCardImage2NotBetween(String value1, String value2) {
            addCriterion("id_card_image2 not between", value1, value2, "idCardImage2");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNull() {
            addCriterion("license_no is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNotNull() {
            addCriterion("license_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoEqualTo(String value) {
            addCriterion("license_no =", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotEqualTo(String value) {
            addCriterion("license_no <>", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThan(String value) {
            addCriterion("license_no >", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("license_no >=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThan(String value) {
            addCriterion("license_no <", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("license_no <=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLike(String value) {
            addCriterion("license_no like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotLike(String value) {
            addCriterion("license_no not like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIn(List<String> values) {
            addCriterion("license_no in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotIn(List<String> values) {
            addCriterion("license_no not in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoBetween(String value1, String value2) {
            addCriterion("license_no between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotBetween(String value1, String value2) {
            addCriterion("license_no not between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseImageIsNull() {
            addCriterion("license_image is null");
            return (Criteria) this;
        }

        public Criteria andLicenseImageIsNotNull() {
            addCriterion("license_image is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseImageEqualTo(String value) {
            addCriterion("license_image =", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageNotEqualTo(String value) {
            addCriterion("license_image <>", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageGreaterThan(String value) {
            addCriterion("license_image >", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageGreaterThanOrEqualTo(String value) {
            addCriterion("license_image >=", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageLessThan(String value) {
            addCriterion("license_image <", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageLessThanOrEqualTo(String value) {
            addCriterion("license_image <=", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageLike(String value) {
            addCriterion("license_image like", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageNotLike(String value) {
            addCriterion("license_image not like", value, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageIn(List<String> values) {
            addCriterion("license_image in", values, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageNotIn(List<String> values) {
            addCriterion("license_image not in", values, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageBetween(String value1, String value2) {
            addCriterion("license_image between", value1, value2, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andLicenseImageNotBetween(String value1, String value2) {
            addCriterion("license_image not between", value1, value2, "licenseImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageIsNull() {
            addCriterion("auth_image is null");
            return (Criteria) this;
        }

        public Criteria andAuthImageIsNotNull() {
            addCriterion("auth_image is not null");
            return (Criteria) this;
        }

        public Criteria andAuthImageEqualTo(String value) {
            addCriterion("auth_image =", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageNotEqualTo(String value) {
            addCriterion("auth_image <>", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageGreaterThan(String value) {
            addCriterion("auth_image >", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageGreaterThanOrEqualTo(String value) {
            addCriterion("auth_image >=", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageLessThan(String value) {
            addCriterion("auth_image <", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageLessThanOrEqualTo(String value) {
            addCriterion("auth_image <=", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageLike(String value) {
            addCriterion("auth_image like", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageNotLike(String value) {
            addCriterion("auth_image not like", value, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageIn(List<String> values) {
            addCriterion("auth_image in", values, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageNotIn(List<String> values) {
            addCriterion("auth_image not in", values, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageBetween(String value1, String value2) {
            addCriterion("auth_image between", value1, value2, "authImage");
            return (Criteria) this;
        }

        public Criteria andAuthImageNotBetween(String value1, String value2) {
            addCriterion("auth_image not between", value1, value2, "authImage");
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