package com.superwall.sdk.store.abstractions.product;

import androidx.constraintlayout.core.motion.utils.v;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.remoteconfig.e0;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class StoreProduct implements StoreProductType {

    @NotNull
    private final RawStoreProduct rawStoreProduct;

    public StoreProduct(@NotNull RawStoreProduct rawStoreProduct) {
        Intrinsics.checkNotNullParameter(rawStoreProduct, "rawStoreProduct");
        this.rawStoreProduct = rawStoreProduct;
    }

    @NotNull
    public final Map<String, String> getAttributes() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rawPrice", getPrice().toString());
        linkedHashMap.put("price", getLocalizedPrice());
        linkedHashMap.put("periodAlt", getLocalizedSubscriptionPeriod());
        linkedHashMap.put("localizedPeriod", getLocalizedSubscriptionPeriod());
        linkedHashMap.put(v.c.Q, getPeriod());
        linkedHashMap.put("periodly", getPeriodly());
        linkedHashMap.put("weeklyPrice", getWeeklyPrice());
        linkedHashMap.put("dailyPrice", getDailyPrice());
        linkedHashMap.put("monthlyPrice", getMonthlyPrice());
        linkedHashMap.put("yearlyPrice", getYearlyPrice());
        linkedHashMap.put("rawTrialPeriodPrice", getTrialPeriodPrice().toString());
        linkedHashMap.put("trialPeriodPrice", getLocalizedTrialPeriodPrice());
        linkedHashMap.put("trialPeriodDailyPrice", trialPeriodPricePerUnit(SubscriptionPeriod.Unit.day));
        linkedHashMap.put("trialPeriodWeeklyPrice", trialPeriodPricePerUnit(SubscriptionPeriod.Unit.week));
        linkedHashMap.put("trialPeriodMonthlyPrice", trialPeriodPricePerUnit(SubscriptionPeriod.Unit.month));
        linkedHashMap.put("trialPeriodYearlyPrice", trialPeriodPricePerUnit(SubscriptionPeriod.Unit.year));
        linkedHashMap.put("trialPeriodDays", getTrialPeriodDaysString());
        linkedHashMap.put("trialPeriodWeeks", getTrialPeriodWeeksString());
        linkedHashMap.put("trialPeriodMonths", getTrialPeriodMonthsString());
        linkedHashMap.put("trialPeriodYears", getTrialPeriodYearsString());
        linkedHashMap.put("trialPeriodText", getTrialPeriodText());
        linkedHashMap.put("trialPeriodEndDate", getTrialPeriodEndDateString());
        linkedHashMap.put("periodDays", getPeriodDaysString());
        linkedHashMap.put("periodWeeks", getPeriodWeeksString());
        linkedHashMap.put("periodMonths", getPeriodMonthsString());
        linkedHashMap.put("periodYears", getPeriodYearsString());
        linkedHashMap.put("locale", getLocale());
        String languageCode = getLanguageCode();
        String str = "n/a";
        if (languageCode == null) {
            languageCode = "n/a";
        }
        linkedHashMap.put(e0.b.f124455p2, languageCode);
        String currencyCode = getCurrencyCode();
        if (currencyCode == null) {
            currencyCode = "n/a";
        }
        linkedHashMap.put(AppsFlyerProperties.CURRENCY_CODE, currencyCode);
        String currencySymbol = getCurrencySymbol();
        if (currencySymbol != null) {
            str = currencySymbol;
        }
        linkedHashMap.put("currencySymbol", str);
        linkedHashMap.put("identifier", getProductIdentifier());
        return linkedHashMap;
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getCurrencyCode() {
        return this.rawStoreProduct.getCurrencyCode();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getCurrencySymbol() {
        return this.rawStoreProduct.getCurrencySymbol();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getDailyPrice() {
        return this.rawStoreProduct.getDailyPrice();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getFullIdentifier() {
        return this.rawStoreProduct.getFullIdentifier();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public boolean getHasFreeTrial() {
        return this.rawStoreProduct.getHasFreeTrial();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getLanguageCode() {
        return this.rawStoreProduct.getLanguageCode();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocale() {
        return this.rawStoreProduct.getLocale();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocalizedPrice() {
        return this.rawStoreProduct.getLocalizedPrice();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocalizedSubscriptionPeriod() {
        return this.rawStoreProduct.getLocalizedSubscriptionPeriod();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocalizedTrialPeriodPrice() {
        return this.rawStoreProduct.getLocalizedTrialPeriodPrice();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getMonthlyPrice() {
        return this.rawStoreProduct.getMonthlyPrice();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriod() {
        return this.rawStoreProduct.getPeriod();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodDays() {
        return this.rawStoreProduct.getPeriodDays();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodDaysString() {
        return this.rawStoreProduct.getPeriodDaysString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodMonths() {
        return this.rawStoreProduct.getPeriodMonths();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodMonthsString() {
        return this.rawStoreProduct.getPeriodMonthsString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodWeeks() {
        return this.rawStoreProduct.getPeriodWeeks();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodWeeksString() {
        return this.rawStoreProduct.getPeriodWeeksString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodYears() {
        return this.rawStoreProduct.getPeriodYears();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodYearsString() {
        return this.rawStoreProduct.getPeriodYearsString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodly() {
        return this.rawStoreProduct.getPeriodly();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public BigDecimal getPrice() {
        BigDecimal price = this.rawStoreProduct.getPrice();
        Intrinsics.checkNotNullExpressionValue(price, "<get-price>(...)");
        return price;
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getProductIdentifier() {
        return this.rawStoreProduct.getProductIdentifier();
    }

    @NotNull
    public final RawStoreProduct getRawStoreProduct() {
        return this.rawStoreProduct;
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getRegionCode() {
        return this.rawStoreProduct.getRegionCode();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public SubscriptionPeriod getSubscriptionPeriod() {
        return this.rawStoreProduct.getSubscriptionPeriod();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodDays() {
        return this.rawStoreProduct.getTrialPeriodDays();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodDaysString() {
        return this.rawStoreProduct.getTrialPeriodDaysString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public Date getTrialPeriodEndDate() {
        return this.rawStoreProduct.getTrialPeriodEndDate();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodEndDateString() {
        return this.rawStoreProduct.getTrialPeriodEndDateString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodMonths() {
        return this.rawStoreProduct.getTrialPeriodMonths();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodMonthsString() {
        return this.rawStoreProduct.getTrialPeriodMonthsString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public BigDecimal getTrialPeriodPrice() {
        BigDecimal trialPeriodPrice = this.rawStoreProduct.getTrialPeriodPrice();
        Intrinsics.checkNotNullExpressionValue(trialPeriodPrice, "<get-trialPeriodPrice>(...)");
        return trialPeriodPrice;
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodText() {
        return this.rawStoreProduct.getTrialPeriodText();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodWeeks() {
        return this.rawStoreProduct.getTrialPeriodWeeks();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodWeeksString() {
        return this.rawStoreProduct.getTrialPeriodWeeksString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodYears() {
        return this.rawStoreProduct.getTrialPeriodYears();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodYearsString() {
        return this.rawStoreProduct.getTrialPeriodYearsString();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getWeeklyPrice() {
        return this.rawStoreProduct.getWeeklyPrice();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getYearlyPrice() {
        return this.rawStoreProduct.getYearlyPrice();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String trialPeriodPricePerUnit(@NotNull SubscriptionPeriod.Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.rawStoreProduct.trialPeriodPricePerUnit(unit);
    }
}
