package com.elhouti.compositekey.service.dto;

import java.io.Serializable;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;


import io.github.jhipster.service.filter.LocalDateFilter;



/**
 * Criteria class for the EmployeeSkillCertificate entity. This class is used in EmployeeSkillCertificateResource to
 * receive all the possible filtering options from the Http GET request parameters.
 * For example the following could be a valid requests:
 * <code> /employee-skill-certificates?id.greaterThan=5&amp;attr1.contains=something&amp;attr2.specified=false</code>
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class EmployeeSkillCertificateCriteria implements Serializable {
    private static final long serialVersionUID = 1L;


    private LongFilter id;

    private IntegerFilter grade;

    private LocalDateFilter date;

    private LongFilter certificateTypeId;

    public EmployeeSkillCertificateCriteria() {
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public IntegerFilter getGrade() {
        return grade;
    }

    public void setGrade(IntegerFilter grade) {
        this.grade = grade;
    }

    public LocalDateFilter getDate() {
        return date;
    }

    public void setDate(LocalDateFilter date) {
        this.date = date;
    }

    public LongFilter getCertificateTypeId() {
        return certificateTypeId;
    }

    public void setCertificateTypeId(LongFilter certificateTypeId) {
        this.certificateTypeId = certificateTypeId;
    }

    @Override
    public String toString() {
        return "EmployeeSkillCertificateCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (grade != null ? "grade=" + grade + ", " : "") +
                (date != null ? "date=" + date + ", " : "") +
                (certificateTypeId != null ? "certificateTypeId=" + certificateTypeId + ", " : "") +
            "}";
    }

}
