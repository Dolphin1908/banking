package com.example.banking.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "source_account_id", nullable = false)
    private Integer sourceAccountId;

    @Column(name = "destination_account_id")
    private Integer destinationAccountId;

    @Column(name = "bank_code")
    private String bankCode;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "fee", nullable = false)
    private BigDecimal fee;

    @Column(name = "fee_payer", nullable = false)
    private String feePayer;

    @Column(name = "message")
    private String message;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "otp_verified", nullable = false)
    private Boolean otpVerified;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public Boolean getOtpVerified() {
        return otpVerified;
    }

    public Integer getDestinationAccountId() {
        return destinationAccountId;
    }

    public Integer getSourceAccountId() {
        return sourceAccountId;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeePayer() {
        return feePayer;
    }

    public String getMessage() {
        return message;
    }

    public void setSourceAccountId(Integer sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public void setDestinationAccountId(Integer destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public void setFeePayer(String feePayer) {
        this.feePayer = feePayer;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setOtpVerified(Boolean otpVerified) {
        this.otpVerified = otpVerified;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }
}
