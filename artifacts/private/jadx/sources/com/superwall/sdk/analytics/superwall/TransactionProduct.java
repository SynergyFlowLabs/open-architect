package com.superwall.sdk.analytics.superwall;

import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.abstractions.product.SubscriptionPeriod;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TransactionProduct {

    @NotNull
    private final Currency currency;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267357id;

    @Nullable
    private final String languageCode;

    @NotNull
    private final String locale;

    @Nullable
    private final Period period;

    @NotNull
    private final Price price;

    @Nullable
    private final TrialPeriod trialPeriod;

    public static final class Currency {

        @Nullable
        private final String code;

        @Nullable
        private final String symbol;

        public Currency(@Nullable String str, @Nullable String str2) {
            this.code = str;
            this.symbol = str2;
        }

        public static /* synthetic */ Currency copy$default(Currency currency, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = currency.code;
            }
            if ((i10 & 2) != 0) {
                str2 = currency.symbol;
            }
            return currency.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.code;
        }

        @Nullable
        public final String component2() {
            return this.symbol;
        }

        @NotNull
        public final Currency copy(@Nullable String str, @Nullable String str2) {
            return new Currency(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Currency)) {
                return false;
            }
            Currency currency = (Currency) obj;
            return Intrinsics.areEqual(this.code, currency.code) && Intrinsics.areEqual(this.symbol, currency.symbol);
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.symbol;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Currency(code=" + this.code + ", symbol=" + this.symbol + ")";
        }
    }

    public static final class Period {

        @NotNull
        private final String alt;
        private final int days;

        @NotNull
        private final String ly;
        private final int months;

        @NotNull
        private final SubscriptionPeriod.Unit unit;
        private final int weeks;
        private final int years;

        public Period(@NotNull String alt, @NotNull String ly, @NotNull SubscriptionPeriod.Unit unit, int i10, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(alt, "alt");
            Intrinsics.checkNotNullParameter(ly, "ly");
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.alt = alt;
            this.ly = ly;
            this.unit = unit;
            this.days = i10;
            this.weeks = i11;
            this.months = i12;
            this.years = i13;
        }

        public static /* synthetic */ Period copy$default(Period period, String str, String str2, SubscriptionPeriod.Unit unit, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = period.alt;
            }
            if ((i14 & 2) != 0) {
                str2 = period.ly;
            }
            if ((i14 & 4) != 0) {
                unit = period.unit;
            }
            if ((i14 & 8) != 0) {
                i10 = period.days;
            }
            if ((i14 & 16) != 0) {
                i11 = period.weeks;
            }
            if ((i14 & 32) != 0) {
                i12 = period.months;
            }
            if ((i14 & 64) != 0) {
                i13 = period.years;
            }
            int i15 = i12;
            int i16 = i13;
            int i17 = i11;
            SubscriptionPeriod.Unit unit2 = unit;
            return period.copy(str, str2, unit2, i10, i17, i15, i16);
        }

        @NotNull
        public final String component1() {
            return this.alt;
        }

        @NotNull
        public final String component2() {
            return this.ly;
        }

        @NotNull
        public final SubscriptionPeriod.Unit component3() {
            return this.unit;
        }

        public final int component4() {
            return this.days;
        }

        public final int component5() {
            return this.weeks;
        }

        public final int component6() {
            return this.months;
        }

        public final int component7() {
            return this.years;
        }

        @NotNull
        public final Period copy(@NotNull String alt, @NotNull String ly, @NotNull SubscriptionPeriod.Unit unit, int i10, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(alt, "alt");
            Intrinsics.checkNotNullParameter(ly, "ly");
            Intrinsics.checkNotNullParameter(unit, "unit");
            return new Period(alt, ly, unit, i10, i11, i12, i13);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Period)) {
                return false;
            }
            Period period = (Period) obj;
            return Intrinsics.areEqual(this.alt, period.alt) && Intrinsics.areEqual(this.ly, period.ly) && this.unit == period.unit && this.days == period.days && this.weeks == period.weeks && this.months == period.months && this.years == period.years;
        }

        @NotNull
        public final String getAlt() {
            return this.alt;
        }

        public final int getDays() {
            return this.days;
        }

        @NotNull
        public final String getLy() {
            return this.ly;
        }

        public final int getMonths() {
            return this.months;
        }

        @NotNull
        public final SubscriptionPeriod.Unit getUnit() {
            return this.unit;
        }

        public final int getWeeks() {
            return this.weeks;
        }

        public final int getYears() {
            return this.years;
        }

        public int hashCode() {
            return (((((((((((this.alt.hashCode() * 31) + this.ly.hashCode()) * 31) + this.unit.hashCode()) * 31) + Integer.hashCode(this.days)) * 31) + Integer.hashCode(this.weeks)) * 31) + Integer.hashCode(this.months)) * 31) + Integer.hashCode(this.years);
        }

        @NotNull
        public String toString() {
            return "Period(alt=" + this.alt + ", ly=" + this.ly + ", unit=" + this.unit + ", days=" + this.days + ", weeks=" + this.weeks + ", months=" + this.months + ", years=" + this.years + ")";
        }
    }

    public static final class Price {

        @NotNull
        private final String daily;

        @NotNull
        private final String localized;

        @NotNull
        private final String monthly;

        @NotNull
        private final BigDecimal raw;

        @NotNull
        private final String weekly;

        @NotNull
        private final String yearly;

        public Price(@NotNull BigDecimal raw, @NotNull String localized, @NotNull String daily, @NotNull String weekly, @NotNull String monthly, @NotNull String yearly) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            Intrinsics.checkNotNullParameter(localized, "localized");
            Intrinsics.checkNotNullParameter(daily, "daily");
            Intrinsics.checkNotNullParameter(weekly, "weekly");
            Intrinsics.checkNotNullParameter(monthly, "monthly");
            Intrinsics.checkNotNullParameter(yearly, "yearly");
            this.raw = raw;
            this.localized = localized;
            this.daily = daily;
            this.weekly = weekly;
            this.monthly = monthly;
            this.yearly = yearly;
        }

        public static /* synthetic */ Price copy$default(Price price, BigDecimal bigDecimal, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bigDecimal = price.raw;
            }
            if ((i10 & 2) != 0) {
                str = price.localized;
            }
            if ((i10 & 4) != 0) {
                str2 = price.daily;
            }
            if ((i10 & 8) != 0) {
                str3 = price.weekly;
            }
            if ((i10 & 16) != 0) {
                str4 = price.monthly;
            }
            if ((i10 & 32) != 0) {
                str5 = price.yearly;
            }
            String str6 = str4;
            String str7 = str5;
            return price.copy(bigDecimal, str, str2, str3, str6, str7);
        }

        @NotNull
        public final BigDecimal component1() {
            return this.raw;
        }

        @NotNull
        public final String component2() {
            return this.localized;
        }

        @NotNull
        public final String component3() {
            return this.daily;
        }

        @NotNull
        public final String component4() {
            return this.weekly;
        }

        @NotNull
        public final String component5() {
            return this.monthly;
        }

        @NotNull
        public final String component6() {
            return this.yearly;
        }

        @NotNull
        public final Price copy(@NotNull BigDecimal raw, @NotNull String localized, @NotNull String daily, @NotNull String weekly, @NotNull String monthly, @NotNull String yearly) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            Intrinsics.checkNotNullParameter(localized, "localized");
            Intrinsics.checkNotNullParameter(daily, "daily");
            Intrinsics.checkNotNullParameter(weekly, "weekly");
            Intrinsics.checkNotNullParameter(monthly, "monthly");
            Intrinsics.checkNotNullParameter(yearly, "yearly");
            return new Price(raw, localized, daily, weekly, monthly, yearly);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            return Intrinsics.areEqual(this.raw, price.raw) && Intrinsics.areEqual(this.localized, price.localized) && Intrinsics.areEqual(this.daily, price.daily) && Intrinsics.areEqual(this.weekly, price.weekly) && Intrinsics.areEqual(this.monthly, price.monthly) && Intrinsics.areEqual(this.yearly, price.yearly);
        }

        @NotNull
        public final String getDaily() {
            return this.daily;
        }

        @NotNull
        public final String getLocalized() {
            return this.localized;
        }

        @NotNull
        public final String getMonthly() {
            return this.monthly;
        }

        @NotNull
        public final BigDecimal getRaw() {
            return this.raw;
        }

        @NotNull
        public final String getWeekly() {
            return this.weekly;
        }

        @NotNull
        public final String getYearly() {
            return this.yearly;
        }

        public int hashCode() {
            return (((((((((this.raw.hashCode() * 31) + this.localized.hashCode()) * 31) + this.daily.hashCode()) * 31) + this.weekly.hashCode()) * 31) + this.monthly.hashCode()) * 31) + this.yearly.hashCode();
        }

        @NotNull
        public String toString() {
            return "Price(raw=" + this.raw + ", localized=" + this.localized + ", daily=" + this.daily + ", weekly=" + this.weekly + ", monthly=" + this.monthly + ", yearly=" + this.yearly + ")";
        }
    }

    public static final class TrialPeriod {
        private final int days;

        @Nullable
        private final Date endAt;
        private final int months;

        @NotNull
        private final String text;
        private final int weeks;
        private final int years;

        public TrialPeriod(int i10, int i11, int i12, int i13, @NotNull String text, @Nullable Date date) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.days = i10;
            this.weeks = i11;
            this.months = i12;
            this.years = i13;
            this.text = text;
            this.endAt = date;
        }

        public static /* synthetic */ TrialPeriod copy$default(TrialPeriod trialPeriod, int i10, int i11, int i12, int i13, String str, Date date, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = trialPeriod.days;
            }
            if ((i14 & 2) != 0) {
                i11 = trialPeriod.weeks;
            }
            if ((i14 & 4) != 0) {
                i12 = trialPeriod.months;
            }
            if ((i14 & 8) != 0) {
                i13 = trialPeriod.years;
            }
            if ((i14 & 16) != 0) {
                str = trialPeriod.text;
            }
            if ((i14 & 32) != 0) {
                date = trialPeriod.endAt;
            }
            String str2 = str;
            Date date2 = date;
            return trialPeriod.copy(i10, i11, i12, i13, str2, date2);
        }

        public final int component1() {
            return this.days;
        }

        public final int component2() {
            return this.weeks;
        }

        public final int component3() {
            return this.months;
        }

        public final int component4() {
            return this.years;
        }

        @NotNull
        public final String component5() {
            return this.text;
        }

        @Nullable
        public final Date component6() {
            return this.endAt;
        }

        @NotNull
        public final TrialPeriod copy(int i10, int i11, int i12, int i13, @NotNull String text, @Nullable Date date) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TrialPeriod(i10, i11, i12, i13, text, date);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrialPeriod)) {
                return false;
            }
            TrialPeriod trialPeriod = (TrialPeriod) obj;
            return this.days == trialPeriod.days && this.weeks == trialPeriod.weeks && this.months == trialPeriod.months && this.years == trialPeriod.years && Intrinsics.areEqual(this.text, trialPeriod.text) && Intrinsics.areEqual(this.endAt, trialPeriod.endAt);
        }

        public final int getDays() {
            return this.days;
        }

        @Nullable
        public final Date getEndAt() {
            return this.endAt;
        }

        public final int getMonths() {
            return this.months;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final int getWeeks() {
            return this.weeks;
        }

        public final int getYears() {
            return this.years;
        }

        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.days) * 31) + Integer.hashCode(this.weeks)) * 31) + Integer.hashCode(this.months)) * 31) + Integer.hashCode(this.years)) * 31) + this.text.hashCode()) * 31;
            Date date = this.endAt;
            return iHashCode + (date == null ? 0 : date.hashCode());
        }

        @NotNull
        public String toString() {
            return "TrialPeriod(days=" + this.days + ", weeks=" + this.weeks + ", months=" + this.months + ", years=" + this.years + ", text=" + this.text + ", endAt=" + this.endAt + ")";
        }
    }

    public TransactionProduct(@NotNull String id2, @NotNull Price price, @Nullable TrialPeriod trialPeriod, @Nullable Period period, @NotNull String locale, @Nullable String str, @NotNull Currency currency) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f267357id = id2;
        this.price = price;
        this.trialPeriod = trialPeriod;
        this.period = period;
        this.locale = locale;
        this.languageCode = str;
        this.currency = currency;
    }

    public static /* synthetic */ TransactionProduct copy$default(TransactionProduct transactionProduct, String str, Price price, TrialPeriod trialPeriod, Period period, String str2, String str3, Currency currency, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transactionProduct.f267357id;
        }
        if ((i10 & 2) != 0) {
            price = transactionProduct.price;
        }
        if ((i10 & 4) != 0) {
            trialPeriod = transactionProduct.trialPeriod;
        }
        if ((i10 & 8) != 0) {
            period = transactionProduct.period;
        }
        if ((i10 & 16) != 0) {
            str2 = transactionProduct.locale;
        }
        if ((i10 & 32) != 0) {
            str3 = transactionProduct.languageCode;
        }
        if ((i10 & 64) != 0) {
            currency = transactionProduct.currency;
        }
        String str4 = str3;
        Currency currency2 = currency;
        String str5 = str2;
        TrialPeriod trialPeriod2 = trialPeriod;
        return transactionProduct.copy(str, price, trialPeriod2, period, str5, str4, currency2);
    }

    @NotNull
    public final String component1() {
        return this.f267357id;
    }

    @NotNull
    public final Price component2() {
        return this.price;
    }

    @Nullable
    public final TrialPeriod component3() {
        return this.trialPeriod;
    }

    @Nullable
    public final Period component4() {
        return this.period;
    }

    @NotNull
    public final String component5() {
        return this.locale;
    }

    @Nullable
    public final String component6() {
        return this.languageCode;
    }

    @NotNull
    public final Currency component7() {
        return this.currency;
    }

    @NotNull
    public final TransactionProduct copy(@NotNull String id2, @NotNull Price price, @Nullable TrialPeriod trialPeriod, @Nullable Period period, @NotNull String locale, @Nullable String str, @NotNull Currency currency) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TransactionProduct(id2, price, trialPeriod, period, locale, str, currency);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionProduct)) {
            return false;
        }
        TransactionProduct transactionProduct = (TransactionProduct) obj;
        return Intrinsics.areEqual(this.f267357id, transactionProduct.f267357id) && Intrinsics.areEqual(this.price, transactionProduct.price) && Intrinsics.areEqual(this.trialPeriod, transactionProduct.trialPeriod) && Intrinsics.areEqual(this.period, transactionProduct.period) && Intrinsics.areEqual(this.locale, transactionProduct.locale) && Intrinsics.areEqual(this.languageCode, transactionProduct.languageCode) && Intrinsics.areEqual(this.currency, transactionProduct.currency);
    }

    @NotNull
    public final Currency getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getId() {
        return this.f267357id;
    }

    @Nullable
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final Period getPeriod() {
        return this.period;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    @Nullable
    public final TrialPeriod getTrialPeriod() {
        return this.trialPeriod;
    }

    public int hashCode() {
        int iHashCode = ((this.f267357id.hashCode() * 31) + this.price.hashCode()) * 31;
        TrialPeriod trialPeriod = this.trialPeriod;
        int iHashCode2 = 0;
        int i10 = 2 << 0;
        int iHashCode3 = (iHashCode + (trialPeriod == null ? 0 : trialPeriod.hashCode())) * 31;
        Period period = this.period;
        int iHashCode4 = (((iHashCode3 + (period == null ? 0 : period.hashCode())) * 31) + this.locale.hashCode()) * 31;
        String str = this.languageCode;
        if (str != null) {
            iHashCode2 = str.hashCode();
        }
        return ((iHashCode4 + iHashCode2) * 31) + this.currency.hashCode();
    }

    @NotNull
    public String toString() {
        return "TransactionProduct(id=" + this.f267357id + ", price=" + this.price + ", trialPeriod=" + this.trialPeriod + ", period=" + this.period + ", locale=" + this.locale + ", languageCode=" + this.languageCode + ", currency=" + this.currency + ")";
    }

    public TransactionProduct(@NotNull StoreProduct product) {
        Period period;
        Intrinsics.checkNotNullParameter(product, "product");
        String productIdentifier = product.getProductIdentifier();
        Price price = new Price(product.getPrice(), product.getLocalizedPrice(), product.getDailyPrice(), product.getWeeklyPrice(), product.getMonthlyPrice(), product.getYearlyPrice());
        Date trialPeriodEndDate = product.getTrialPeriodEndDate();
        TrialPeriod trialPeriod = trialPeriodEndDate != null ? new TrialPeriod(product.getTrialPeriodDays(), product.getTrialPeriodWeeks(), product.getTrialPeriodMonths(), product.getTrialPeriodYears(), product.getTrialPeriodText(), trialPeriodEndDate) : null;
        SubscriptionPeriod subscriptionPeriod = product.getSubscriptionPeriod();
        if (subscriptionPeriod != null) {
            period = new Period(product.getLocalizedSubscriptionPeriod(), product.getPeriod() + "ly", subscriptionPeriod.getUnit(), product.getPeriodDays(), product.getPeriodWeeks(), product.getPeriodMonths(), product.getPeriodYears());
        } else {
            period = null;
        }
        this(productIdentifier, price, trialPeriod, period, product.getLocale(), product.getLanguageCode(), new Currency(product.getCurrencyCode(), product.getCurrencySymbol()));
    }
}
