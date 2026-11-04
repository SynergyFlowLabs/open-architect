package com.superwall.sdk.store.abstractions.product;

import java.math.BigDecimal;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface StoreProductType {
    @Nullable
    String getCurrencyCode();

    @Nullable
    String getCurrencySymbol();

    @NotNull
    String getDailyPrice();

    @NotNull
    String getFullIdentifier();

    boolean getHasFreeTrial();

    @Nullable
    String getLanguageCode();

    @NotNull
    String getLocale();

    @NotNull
    String getLocalizedPrice();

    @NotNull
    String getLocalizedSubscriptionPeriod();

    @NotNull
    String getLocalizedTrialPeriodPrice();

    @NotNull
    String getMonthlyPrice();

    @NotNull
    String getPeriod();

    int getPeriodDays();

    @NotNull
    String getPeriodDaysString();

    int getPeriodMonths();

    @NotNull
    String getPeriodMonthsString();

    int getPeriodWeeks();

    @NotNull
    String getPeriodWeeksString();

    int getPeriodYears();

    @NotNull
    String getPeriodYearsString();

    @NotNull
    String getPeriodly();

    @NotNull
    BigDecimal getPrice();

    @NotNull
    String getProductIdentifier();

    @Nullable
    String getRegionCode();

    @Nullable
    SubscriptionPeriod getSubscriptionPeriod();

    int getTrialPeriodDays();

    @NotNull
    String getTrialPeriodDaysString();

    @Nullable
    Date getTrialPeriodEndDate();

    @NotNull
    String getTrialPeriodEndDateString();

    int getTrialPeriodMonths();

    @NotNull
    String getTrialPeriodMonthsString();

    @NotNull
    BigDecimal getTrialPeriodPrice();

    @NotNull
    String getTrialPeriodText();

    int getTrialPeriodWeeks();

    @NotNull
    String getTrialPeriodWeeksString();

    int getTrialPeriodYears();

    @NotNull
    String getTrialPeriodYearsString();

    @NotNull
    String getWeeklyPrice();

    @NotNull
    String getYearlyPrice();

    @NotNull
    String trialPeriodPricePerUnit(@NotNull SubscriptionPeriod.Unit unit);
}
