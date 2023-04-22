package com.xhu.cep.mbg.model.guide_stu_compe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuideStuCompeJExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuideStuCompeJExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdIsNull() {
            addCriterion("identification_level_id is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdIsNotNull() {
            addCriterion("identification_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdEqualTo(Integer value) {
            addCriterion("identification_level_id =", value, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdNotEqualTo(Integer value) {
            addCriterion("identification_level_id <>", value, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdGreaterThan(Integer value) {
            addCriterion("identification_level_id >", value, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("identification_level_id >=", value, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdLessThan(Integer value) {
            addCriterion("identification_level_id <", value, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("identification_level_id <=", value, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdIn(List<Integer> values) {
            addCriterion("identification_level_id in", values, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdNotIn(List<Integer> values) {
            addCriterion("identification_level_id not in", values, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("identification_level_id between", value1, value2, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentificationLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("identification_level_id not between", value1, value2, "identificationLevelId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdIsNull() {
            addCriterion("team_indiv_large_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdIsNotNull() {
            addCriterion("team_indiv_large_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdEqualTo(Long value) {
            addCriterion("team_indiv_large_id =", value, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdNotEqualTo(Long value) {
            addCriterion("team_indiv_large_id <>", value, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdGreaterThan(Long value) {
            addCriterion("team_indiv_large_id >", value, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("team_indiv_large_id >=", value, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdLessThan(Long value) {
            addCriterion("team_indiv_large_id <", value, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdLessThanOrEqualTo(Long value) {
            addCriterion("team_indiv_large_id <=", value, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdIn(List<Long> values) {
            addCriterion("team_indiv_large_id in", values, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdNotIn(List<Long> values) {
            addCriterion("team_indiv_large_id not in", values, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdBetween(Long value1, Long value2) {
            addCriterion("team_indiv_large_id between", value1, value2, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andTeamIndivLargeIdNotBetween(Long value1, Long value2) {
            addCriterion("team_indiv_large_id not between", value1, value2, "teamIndivLargeId");
            return (Criteria) this;
        }

        public Criteria andJIsNull() {
            addCriterion("j is null");
            return (Criteria) this;
        }

        public Criteria andJIsNotNull() {
            addCriterion("j is not null");
            return (Criteria) this;
        }

        public Criteria andJEqualTo(String value) {
            addCriterion("j =", value, "j");
            return (Criteria) this;
        }

        public Criteria andJNotEqualTo(String value) {
            addCriterion("j <>", value, "j");
            return (Criteria) this;
        }

        public Criteria andJGreaterThan(String value) {
            addCriterion("j >", value, "j");
            return (Criteria) this;
        }

        public Criteria andJGreaterThanOrEqualTo(String value) {
            addCriterion("j >=", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLessThan(String value) {
            addCriterion("j <", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLessThanOrEqualTo(String value) {
            addCriterion("j <=", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLike(String value) {
            addCriterion("j like", value, "j");
            return (Criteria) this;
        }

        public Criteria andJNotLike(String value) {
            addCriterion("j not like", value, "j");
            return (Criteria) this;
        }

        public Criteria andJIn(List<String> values) {
            addCriterion("j in", values, "j");
            return (Criteria) this;
        }

        public Criteria andJNotIn(List<String> values) {
            addCriterion("j not in", values, "j");
            return (Criteria) this;
        }

        public Criteria andJBetween(String value1, String value2) {
            addCriterion("j between", value1, value2, "j");
            return (Criteria) this;
        }

        public Criteria andJNotBetween(String value1, String value2) {
            addCriterion("j not between", value1, value2, "j");
            return (Criteria) this;
        }

        public Criteria andDescripationIsNull() {
            addCriterion("descripation is null");
            return (Criteria) this;
        }

        public Criteria andDescripationIsNotNull() {
            addCriterion("descripation is not null");
            return (Criteria) this;
        }

        public Criteria andDescripationEqualTo(String value) {
            addCriterion("descripation =", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationNotEqualTo(String value) {
            addCriterion("descripation <>", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationGreaterThan(String value) {
            addCriterion("descripation >", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationGreaterThanOrEqualTo(String value) {
            addCriterion("descripation >=", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationLessThan(String value) {
            addCriterion("descripation <", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationLessThanOrEqualTo(String value) {
            addCriterion("descripation <=", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationLike(String value) {
            addCriterion("descripation like", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationNotLike(String value) {
            addCriterion("descripation not like", value, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationIn(List<String> values) {
            addCriterion("descripation in", values, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationNotIn(List<String> values) {
            addCriterion("descripation not in", values, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationBetween(String value1, String value2) {
            addCriterion("descripation between", value1, value2, "descripation");
            return (Criteria) this;
        }

        public Criteria andDescripationNotBetween(String value1, String value2) {
            addCriterion("descripation not between", value1, value2, "descripation");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andCreteTimeIsNull() {
            addCriterion("crete_time is null");
            return (Criteria) this;
        }

        public Criteria andCreteTimeIsNotNull() {
            addCriterion("crete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreteTimeEqualTo(Date value) {
            addCriterion("crete_time =", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeNotEqualTo(Date value) {
            addCriterion("crete_time <>", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeGreaterThan(Date value) {
            addCriterion("crete_time >", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crete_time >=", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeLessThan(Date value) {
            addCriterion("crete_time <", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeLessThanOrEqualTo(Date value) {
            addCriterion("crete_time <=", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeIn(List<Date> values) {
            addCriterion("crete_time in", values, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeNotIn(List<Date> values) {
            addCriterion("crete_time not in", values, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeBetween(Date value1, Date value2) {
            addCriterion("crete_time between", value1, value2, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeNotBetween(Date value1, Date value2) {
            addCriterion("crete_time not between", value1, value2, "creteTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIsNull() {
            addCriterion("updata_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIsNotNull() {
            addCriterion("updata_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeEqualTo(Date value) {
            addCriterion("updata_time =", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotEqualTo(Date value) {
            addCriterion("updata_time <>", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThan(Date value) {
            addCriterion("updata_time >", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updata_time >=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThan(Date value) {
            addCriterion("updata_time <", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThanOrEqualTo(Date value) {
            addCriterion("updata_time <=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIn(List<Date> values) {
            addCriterion("updata_time in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotIn(List<Date> values) {
            addCriterion("updata_time not in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeBetween(Date value1, Date value2) {
            addCriterion("updata_time between", value1, value2, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotBetween(Date value1, Date value2) {
            addCriterion("updata_time not between", value1, value2, "updataTime");
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