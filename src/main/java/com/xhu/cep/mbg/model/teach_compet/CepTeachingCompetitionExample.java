package com.xhu.cep.mbg.model.teach_compet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CepTeachingCompetitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CepTeachingCompetitionExample() {
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

        public Criteria andTcNameIdIsNull() {
            addCriterion("tc_name_id is null");
            return (Criteria) this;
        }

        public Criteria andTcNameIdIsNotNull() {
            addCriterion("tc_name_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcNameIdEqualTo(Integer value) {
            addCriterion("tc_name_id =", value, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdNotEqualTo(Integer value) {
            addCriterion("tc_name_id <>", value, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdGreaterThan(Integer value) {
            addCriterion("tc_name_id >", value, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc_name_id >=", value, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdLessThan(Integer value) {
            addCriterion("tc_name_id <", value, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdLessThanOrEqualTo(Integer value) {
            addCriterion("tc_name_id <=", value, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdIn(List<Integer> values) {
            addCriterion("tc_name_id in", values, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdNotIn(List<Integer> values) {
            addCriterion("tc_name_id not in", values, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdBetween(Integer value1, Integer value2) {
            addCriterion("tc_name_id between", value1, value2, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andTcNameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tc_name_id not between", value1, value2, "tcNameId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdIsNull() {
            addCriterion("organizer_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdIsNotNull() {
            addCriterion("organizer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdEqualTo(Integer value) {
            addCriterion("organizer_id =", value, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdNotEqualTo(Integer value) {
            addCriterion("organizer_id <>", value, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdGreaterThan(Integer value) {
            addCriterion("organizer_id >", value, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organizer_id >=", value, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdLessThan(Integer value) {
            addCriterion("organizer_id <", value, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdLessThanOrEqualTo(Integer value) {
            addCriterion("organizer_id <=", value, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdIn(List<Integer> values) {
            addCriterion("organizer_id in", values, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdNotIn(List<Integer> values) {
            addCriterion("organizer_id not in", values, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdBetween(Integer value1, Integer value2) {
            addCriterion("organizer_id between", value1, value2, "organizerId");
            return (Criteria) this;
        }

        public Criteria andOrganizerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organizer_id not between", value1, value2, "organizerId");
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

        public Criteria andRewardLevelIdIsNull() {
            addCriterion("reward_level_id is null");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdIsNotNull() {
            addCriterion("reward_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdEqualTo(Integer value) {
            addCriterion("reward_level_id =", value, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdNotEqualTo(Integer value) {
            addCriterion("reward_level_id <>", value, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdGreaterThan(Integer value) {
            addCriterion("reward_level_id >", value, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_level_id >=", value, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdLessThan(Integer value) {
            addCriterion("reward_level_id <", value, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("reward_level_id <=", value, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdIn(List<Integer> values) {
            addCriterion("reward_level_id in", values, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdNotIn(List<Integer> values) {
            addCriterion("reward_level_id not in", values, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("reward_level_id between", value1, value2, "rewardLevelId");
            return (Criteria) this;
        }

        public Criteria andRewardLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_level_id not between", value1, value2, "rewardLevelId");
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

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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

        public Criteria andCrateTimeIsNull() {
            addCriterion("crate_time is null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNotNull() {
            addCriterion("crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeEqualTo(Date value) {
            addCriterion("crate_time =", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotEqualTo(Date value) {
            addCriterion("crate_time <>", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThan(Date value) {
            addCriterion("crate_time >", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crate_time >=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThan(Date value) {
            addCriterion("crate_time <", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("crate_time <=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIn(List<Date> values) {
            addCriterion("crate_time in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotIn(List<Date> values) {
            addCriterion("crate_time not in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeBetween(Date value1, Date value2) {
            addCriterion("crate_time between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("crate_time not between", value1, value2, "crateTime");
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