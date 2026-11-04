package com.superwall.sdk.billing;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
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
    String getSubscriptionGroupIdentifier();

    @NotNull
    Map<String, Object> getSwProductTemplateVariablesJson();

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
}
