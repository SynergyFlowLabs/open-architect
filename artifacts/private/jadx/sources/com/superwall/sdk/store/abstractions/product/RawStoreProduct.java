package com.superwall.sdk.store.abstractions.product;

import com.android.billingclient.api.z;
import com.superwall.sdk.billing.DecomposedProductIds;
import com.superwall.sdk.contrib.threeteen.AmountFormats;
import com.superwall.sdk.store.abstractions.product.RawStoreProduct;
import com.superwall.sdk.utilities.DateUtils;
import com.superwall.sdk.utilities.DateUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.serialization.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nRawStoreProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawStoreProduct.kt\ncom/superwall/sdk/store/abstractions/product/RawStoreProduct\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n295#2,2:624\n774#2:626\n865#2,2:627\n295#2,2:629\n295#2,2:631\n774#2:633\n865#2,2:634\n774#2:636\n865#2,2:637\n774#2:639\n865#2:640\n1755#2,3:641\n866#2:644\n1611#2,9:645\n1863#2:654\n295#2,2:655\n1864#2:658\n1620#2:659\n1971#2,14:660\n1611#2,9:674\n1863#2:683\n295#2,2:684\n1864#2:687\n1620#2:688\n2341#2,14:689\n295#2,2:704\n295#2,2:706\n295#2,2:708\n295#2,2:710\n1#3:657\n1#3:686\n1#3:703\n*S KotlinDebug\n*F\n+ 1 RawStoreProduct.kt\ncom/superwall/sdk/store/abstractions/product/RawStoreProduct\n*L\n286#1:624,2\n290#1:626\n290#1:627,2\n294#1:629,2\n304#1:631,2\n324#1:633\n324#1:634,2\n329#1:636\n329#1:637,2\n331#1:639\n331#1:640\n331#1:641,3\n331#1:644\n338#1:645,9\n338#1:654\n341#1:655,2\n338#1:658\n338#1:659\n348#1:660,14\n354#1:674,9\n354#1:683\n357#1:684,2\n354#1:687\n354#1:688\n362#1:689,14\n67#1:704,2\n70#1:706,2\n267#1:708,2\n271#1:710,2\n338#1:657\n354#1:686\n*E\n"})
public final class RawStoreProduct implements StoreProductType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final String basePlanId;

    @NotNull
    private final f0 basePriceForSelectedOffer$delegate;

    @NotNull
    private final f0 currencyCode$delegate;

    @NotNull
    private final f0 currencySymbol$delegate;

    @NotNull
    private final f0 dailyPrice$delegate;

    @NotNull
    private final String fullIdentifier;

    @NotNull
    private final f0 hasFreeTrial$delegate;

    @NotNull
    private final f0 languageCode$delegate;

    @NotNull
    private final f0 locale$delegate;

    @NotNull
    private final f0 localizedPrice$delegate;

    @NotNull
    private final f0 localizedSubscriptionPeriod$delegate;

    @NotNull
    private final f0 localizedTrialPeriodPrice$delegate;

    @NotNull
    private final f0 monthlyPrice$delegate;

    @NotNull
    private final f0 offerId$delegate;

    @Nullable
    private final OfferType offerType;

    @NotNull
    private final f0 period$delegate;

    @NotNull
    private final f0 periodDays$delegate;

    @NotNull
    private final f0 periodDaysString$delegate;

    @NotNull
    private final f0 periodMonths$delegate;

    @NotNull
    private final f0 periodMonthsString$delegate;

    @NotNull
    private final f0 periodWeeks$delegate;

    @NotNull
    private final f0 periodWeeksString$delegate;

    @NotNull
    private final f0 periodYears$delegate;

    @NotNull
    private final f0 periodYearsString$delegate;

    @NotNull
    private final f0 periodly$delegate;

    @NotNull
    private final f0 price$delegate;

    @NotNull
    private final f0 priceFormatter$delegate;

    @NotNull
    private final PriceFormatterProvider priceFormatterProvider;

    @NotNull
    private final f0 productIdentifier$delegate;

    @NotNull
    private final f0 regionCode$delegate;

    @NotNull
    private final f0 selectedOffer$delegate;

    @NotNull
    private final f0 selectedOfferPricingPhase$delegate;

    @NotNull
    private final f0 subscriptionPeriod$delegate;

    @NotNull
    private final f0 trialPeriodDays$delegate;

    @NotNull
    private final f0 trialPeriodDaysString$delegate;

    @NotNull
    private final f0 trialPeriodEndDate$delegate;

    @NotNull
    private final f0 trialPeriodEndDateString$delegate;

    @NotNull
    private final f0 trialPeriodMonths$delegate;

    @NotNull
    private final f0 trialPeriodMonthsString$delegate;

    @NotNull
    private final f0 trialPeriodPrice$delegate;

    @NotNull
    private final f0 trialPeriodText$delegate;

    @NotNull
    private final f0 trialPeriodWeeks$delegate;

    @NotNull
    private final f0 trialPeriodWeeksString$delegate;

    @NotNull
    private final f0 trialPeriodYears$delegate;

    @NotNull
    private final f0 trialPeriodYearsString$delegate;

    @NotNull
    private final f0 trialSubscriptionPeriod$delegate;

    @NotNull
    private final z underlyingProductDetails;

    @NotNull
    private final f0 weeklyPrice$delegate;

    @NotNull
    private final f0 yearlyPrice$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RawStoreProduct from(@NotNull z details) {
            Intrinsics.checkNotNullParameter(details, "details");
            DecomposedProductIds.Companion companion = DecomposedProductIds.Companion;
            String strD = details.d();
            Intrinsics.checkNotNullExpressionValue(strD, "getProductId(...)");
            DecomposedProductIds decomposedProductIdsFrom = companion.from(strD);
            String strD2 = details.d();
            Intrinsics.checkNotNullExpressionValue(strD2, "getProductId(...)");
            return new RawStoreProduct(details, strD2, decomposedProductIdsFrom.getBasePlanId(), decomposedProductIdsFrom.getOfferType());
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionPeriod.Unit.values().length];
            try {
                iArr[SubscriptionPeriod.Unit.day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionPeriod.Unit.week.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionPeriod.Unit.month.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionPeriod.Unit.year.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RawStoreProduct(@NotNull z underlyingProductDetails, @NotNull String fullIdentifier, @Nullable String str, @Nullable OfferType offerType) {
        Intrinsics.checkNotNullParameter(underlyingProductDetails, "underlyingProductDetails");
        Intrinsics.checkNotNullParameter(fullIdentifier, "fullIdentifier");
        this.underlyingProductDetails = underlyingProductDetails;
        this.fullIdentifier = fullIdentifier;
        this.basePlanId = str;
        this.offerType = offerType;
        this.priceFormatterProvider = new PriceFormatterProvider();
        this.priceFormatter$delegate = g0.c(new Function0() { // from class: dg.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.priceFormatter_delegate$lambda$1(this.f274559a);
            }
        });
        this.offerId$delegate = g0.c(new Function0() { // from class: dg.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.offerId_delegate$lambda$2(this.f274563a);
            }
        });
        this.selectedOffer$delegate = g0.c(new Function0() { // from class: dg.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f274586a.getSelectedOfferDetails();
            }
        });
        this.basePriceForSelectedOffer$delegate = g0.c(new Function0() { // from class: dg.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.basePriceForSelectedOffer_delegate$lambda$4(this.f274560a);
            }
        });
        this.selectedOfferPricingPhase$delegate = g0.c(new Function0() { // from class: dg.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.selectedOfferPricingPhase_delegate$lambda$7(this.f274569a);
            }
        });
        this.productIdentifier$delegate = g0.c(new Function0() { // from class: dg.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.productIdentifier_delegate$lambda$8(this.f274571a);
            }
        });
        this.price$delegate = g0.c(new Function0() { // from class: dg.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.price_delegate$lambda$10(this.f274575a);
            }
        });
        this.localizedPrice$delegate = g0.c(new Function0() { // from class: dg.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.localizedPrice_delegate$lambda$11(this.f274577a);
            }
        });
        this.localizedSubscriptionPeriod$delegate = g0.c(new Function0() { // from class: dg.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.localizedSubscriptionPeriod_delegate$lambda$13(this.f274579a);
            }
        });
        this.period$delegate = g0.c(new Function0() { // from class: dg.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.period_delegate$lambda$15(this.f274581a);
            }
        });
        this.periodly$delegate = g0.c(new Function0() { // from class: dg.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.periodly_delegate$lambda$17(this.f274580a);
            }
        });
        this.periodWeeks$delegate = g0.c(new Function0() { // from class: dg.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.periodWeeks_delegate$lambda$19(this.f274598a));
            }
        });
        this.periodWeeksString$delegate = g0.c(new Function0() { // from class: dg.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.periodWeeksString_delegate$lambda$20(this.f274573a);
            }
        });
        this.periodMonths$delegate = g0.c(new Function0() { // from class: dg.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.periodMonths_delegate$lambda$22(this.f274583a));
            }
        });
        this.periodMonthsString$delegate = g0.c(new Function0() { // from class: dg.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.periodMonthsString_delegate$lambda$23(this.f274585a);
            }
        });
        this.periodYears$delegate = g0.c(new Function0() { // from class: dg.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.periodYears_delegate$lambda$25(this.f274587a));
            }
        });
        this.periodYearsString$delegate = g0.c(new Function0() { // from class: dg.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.periodYearsString_delegate$lambda$26(this.f274589a);
            }
        });
        this.periodDays$delegate = g0.c(new Function0() { // from class: dg.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.periodDays_delegate$lambda$28(this.f274591a));
            }
        });
        this.periodDaysString$delegate = g0.c(new Function0() { // from class: dg.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.periodDaysString_delegate$lambda$29(this.f274593a);
            }
        });
        this.dailyPrice$delegate = g0.c(new Function0() { // from class: dg.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.dailyPrice_delegate$lambda$30(this.f274561a);
            }
        });
        this.weeklyPrice$delegate = g0.c(new Function0() { // from class: dg.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.weeklyPrice_delegate$lambda$31(this.f274564a);
            }
        });
        this.monthlyPrice$delegate = g0.c(new Function0() { // from class: dg.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.monthlyPrice_delegate$lambda$32(this.f274566a);
            }
        });
        this.yearlyPrice$delegate = g0.c(new Function0() { // from class: dg.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.yearlyPrice_delegate$lambda$33(this.f274568a);
            }
        });
        this.hasFreeTrial$delegate = g0.c(new Function0() { // from class: dg.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(RawStoreProduct.hasFreeTrial_delegate$lambda$34(this.f274570a));
            }
        });
        this.localizedTrialPeriodPrice$delegate = g0.c(new Function0() { // from class: dg.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.localizedTrialPeriodPrice_delegate$lambda$35(this.f274572a);
            }
        });
        this.trialPeriodPrice$delegate = g0.c(new Function0() { // from class: dg.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodPrice_delegate$lambda$39(this.f274574a);
            }
        });
        this.trialPeriodEndDate$delegate = g0.c(new Function0() { // from class: dg.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodEndDate_delegate$lambda$57(this.f274576a);
            }
        });
        this.trialPeriodEndDateString$delegate = g0.c(new Function0() { // from class: dg.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodEndDateString_delegate$lambda$59(this.f274578a);
            }
        });
        this.trialPeriodDays$delegate = g0.c(new Function0() { // from class: dg.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.trialPeriodDays_delegate$lambda$61(this.f274582a));
            }
        });
        this.trialPeriodDaysString$delegate = g0.c(new Function0() { // from class: dg.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodDaysString_delegate$lambda$62(this.f274584a);
            }
        });
        this.trialPeriodWeeks$delegate = g0.c(new Function0() { // from class: dg.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.trialPeriodWeeks_delegate$lambda$63(this.f274588a));
            }
        });
        this.trialPeriodWeeksString$delegate = g0.c(new Function0() { // from class: dg.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodWeeksString_delegate$lambda$64(this.f274590a);
            }
        });
        this.trialPeriodMonths$delegate = g0.c(new Function0() { // from class: dg.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.trialPeriodMonths_delegate$lambda$66(this.f274592a));
            }
        });
        this.trialPeriodMonthsString$delegate = g0.c(new Function0() { // from class: dg.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodMonthsString_delegate$lambda$67(this.f274594a);
            }
        });
        this.trialPeriodYears$delegate = g0.c(new Function0() { // from class: dg.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(RawStoreProduct.trialPeriodYears_delegate$lambda$69(this.f274595a));
            }
        });
        this.trialPeriodYearsString$delegate = g0.c(new Function0() { // from class: dg.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodYearsString_delegate$lambda$70(this.f274596a);
            }
        });
        this.trialPeriodText$delegate = g0.c(new Function0() { // from class: dg.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialPeriodText_delegate$lambda$71(this.f274597a);
            }
        });
        this.locale$delegate = g0.c(new Function0() { // from class: dg.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.locale_delegate$lambda$72();
            }
        });
        this.languageCode$delegate = g0.c(new Function0() { // from class: dg.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.languageCode_delegate$lambda$73();
            }
        });
        this.currencyCode$delegate = g0.c(new Function0() { // from class: dg.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.currencyCode_delegate$lambda$74(this.f274558a);
            }
        });
        this.currencySymbol$delegate = g0.c(new Function0() { // from class: dg.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.currencySymbol_delegate$lambda$76(this.f274562a);
            }
        });
        this.regionCode$delegate = g0.c(new Function0() { // from class: dg.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.regionCode_delegate$lambda$77();
            }
        });
        this.subscriptionPeriod$delegate = g0.c(new Function0() { // from class: dg.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.subscriptionPeriod_delegate$lambda$78(this.f274565a);
            }
        });
        this.trialSubscriptionPeriod$delegate = g0.c(new Function0() { // from class: dg.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RawStoreProduct.trialSubscriptionPeriod_delegate$lambda$81(this.f274567a);
            }
        });
    }

    private final z.f automaticallySelectOffer() {
        List<z.f> listF = this.underlyingProductDetails.f();
        if (listF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (Intrinsics.areEqual(((z.f) obj).a(), this.basePlanId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((z.f) obj2).f().a().size() != 1) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            List<String> listD = ((z.f) obj3).d();
            Intrinsics.checkNotNullExpressionValue(listD, "getOfferTags(...)");
            List<String> list = listD;
            boolean z10 = false;
            int i10 = 1 >> 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    Intrinsics.checkNotNull(str);
                    if (StringsKt.V2(str, "-ignore-offer", false, 2, null)) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                arrayList3.add(obj3);
            }
        }
        z.f fVarFindLongestFreeTrial = findLongestFreeTrial(arrayList3);
        return fVarFindLongestFreeTrial == null ? findLowestNonFreeOffer(arrayList3) : fVarFindLongestFreeTrial;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal basePriceForSelectedOffer_delegate$lambda$4(RawStoreProduct rawStoreProduct) {
        z.f selectedOffer = rawStoreProduct.getSelectedOffer();
        if (selectedOffer == null) {
            return BigDecimal.ZERO;
        }
        List<z.c> listA = selectedOffer.f().a();
        Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
        return new BigDecimal(((z.c) CollectionsKt.last((List) listA)).d()).divide(new BigDecimal(1000000), 2, RoundingMode.DOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String currencyCode_delegate$lambda$74(RawStoreProduct rawStoreProduct) {
        if (rawStoreProduct.underlyingProductDetails.c() != null) {
            z.b bVarC = rawStoreProduct.underlyingProductDetails.c();
            if (bVarC != null) {
                return bVarC.c();
            }
            return null;
        }
        z.f selectedOffer = rawStoreProduct.getSelectedOffer();
        if (selectedOffer == null) {
            return null;
        }
        List<z.c> listA = selectedOffer.f().a();
        Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
        return ((z.c) CollectionsKt.last((List) listA)).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String currencySymbol_delegate$lambda$76(RawStoreProduct rawStoreProduct) {
        String currencyCode = rawStoreProduct.getCurrencyCode();
        if (currencyCode != null) {
            return Currency.getInstance(currencyCode).getSymbol();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dailyPrice_delegate$lambda$30(RawStoreProduct rawStoreProduct) {
        String str;
        String str2;
        BigDecimal basePriceForSelectedOffer = rawStoreProduct.getBasePriceForSelectedOffer();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (Intrinsics.areEqual(basePriceForSelectedOffer, bigDecimal)) {
            NumberFormat priceFormatter = rawStoreProduct.getPriceFormatter();
            return (priceFormatter == null || (str2 = priceFormatter.format(bigDecimal)) == null) ? "$0.00" : str2;
        }
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return "n/a";
        }
        Intrinsics.checkNotNull(basePriceForSelectedOffer);
        BigDecimal bigDecimalPricePerDay = subscriptionPeriod.pricePerDay(basePriceForSelectedOffer);
        NumberFormat priceFormatter2 = rawStoreProduct.getPriceFormatter();
        return (priceFormatter2 == null || (str = priceFormatter2.format(bigDecimalPricePerDay)) == null) ? "n/a" : str;
    }

    private final z.f findLongestFreeTrial(List<z.f> list) {
        Object next;
        Object next2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            z.f fVar = (z.f) it.next();
            List<z.c> listA = fVar.f().a();
            Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
            Iterator it2 = CollectionsKt.dropLast(listA, 1).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((z.c) next2).d() != 0);
            z.c cVar = (z.c) next2;
            if (cVar != null) {
                n nVarE = n.E(cVar.b());
                pair = new Pair(fVar, Long.valueOf((nVarE.K() * ((long) 30)) + ((long) nVarE.p())));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long jLongValue = ((Number) ((Pair) next).getSecond()).longValue();
                do {
                    Object next3 = it3.next();
                    long jLongValue2 = ((Number) ((Pair) next3).getSecond()).longValue();
                    if (jLongValue < jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair2 = (Pair) next;
        if (pair2 != null) {
            return (z.f) pair2.getFirst();
        }
        return null;
    }

    private final z.f findLowestNonFreeOffer(List<z.f> list) {
        Object next;
        Object next2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            z.f fVar = (z.f) it.next();
            List<z.c> listA = fVar.f().a();
            Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
            Iterator it2 = CollectionsKt.dropLast(listA, 1).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((z.c) next2).d() <= 0);
            z.c cVar = (z.c) next2;
            Pair pair = cVar != null ? new Pair(fVar, Long.valueOf(cVar.d())) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long jLongValue = ((Number) ((Pair) next).getSecond()).longValue();
                do {
                    Object next3 = it3.next();
                    long jLongValue2 = ((Number) ((Pair) next3).getSecond()).longValue();
                    if (jLongValue > jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair2 = (Pair) next;
        if (pair2 != null) {
            return (z.f) pair2.getFirst();
        }
        return null;
    }

    private final BigDecimal getBasePriceForSelectedOffer() {
        return (BigDecimal) this.basePriceForSelectedOffer$delegate.getValue();
    }

    private final NumberFormat getPriceFormatter() {
        return (NumberFormat) this.priceFormatter$delegate.getValue();
    }

    @s0
    private static /* synthetic */ void getPriceFormatterProvider$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z.f getSelectedOfferDetails() {
        List<z.f> listF;
        Object next;
        Object obj = null;
        if (this.underlyingProductDetails.c() != null || (listF = this.underlyingProductDetails.f()) == null) {
            return null;
        }
        String str = this.basePlanId;
        if (str != null && str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listF) {
                if (Intrinsics.areEqual(((z.f) obj2).a(), this.basePlanId)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((z.f) next).f().a().size() != 1);
            z.f fVar = (z.f) next;
            if (fVar == null) {
                return null;
            }
            OfferType offerType = this.offerType;
            if (offerType instanceof OfferType.Auto) {
                z.f fVarAutomaticallySelectOffer = automaticallySelectOffer();
                if (fVarAutomaticallySelectOffer != null) {
                    return fVarAutomaticallySelectOffer;
                }
            } else if (offerType instanceof OfferType.Offer) {
                for (Object obj3 : arrayList) {
                    if (Intrinsics.areEqual(((z.f) obj3).c(), ((OfferType.Offer) this.offerType).getId())) {
                        obj = obj3;
                        break;
                    }
                }
                z.f fVar2 = (z.f) obj;
                if (fVar2 != null) {
                    return fVar2;
                }
            } else if (offerType != null) {
                throw new k0();
            }
            return fVar;
        }
        for (Object obj4 : listF) {
            if (((z.f) obj4).f().a().size() == 1) {
                obj = obj4;
                break;
            }
        }
        return (z.f) obj;
    }

    private final z.c getSelectedOfferPricingPhase() {
        return (z.c) this.selectedOfferPricingPhase$delegate.getValue();
    }

    private final SubscriptionPeriod getTrialSubscriptionPeriod() {
        return (SubscriptionPeriod) this.trialSubscriptionPeriod$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasFreeTrial_delegate$lambda$34(RawStoreProduct rawStoreProduct) {
        z.f selectedOffer;
        if (rawStoreProduct.underlyingProductDetails.c() != null || (selectedOffer = rawStoreProduct.getSelectedOffer()) == null) {
            return false;
        }
        List<z.c> listA = selectedOffer.f().a();
        Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
        return !CollectionsKt.dropLast(listA, 1).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String languageCode_delegate$lambda$73() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String locale_delegate$lambda$72() {
        return Locale.getDefault().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String localizedPrice_delegate$lambda$11(RawStoreProduct rawStoreProduct) {
        String str;
        NumberFormat priceFormatter = rawStoreProduct.getPriceFormatter();
        if (priceFormatter != null && (str = priceFormatter.format(rawStoreProduct.getPrice())) != null) {
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String localizedSubscriptionPeriod_delegate$lambda$13(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod != null) {
            AmountFormats amountFormats = AmountFormats.INSTANCE;
            n period = subscriptionPeriod.toPeriod();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String strWordBased = amountFormats.wordBased(period, locale);
            if (strWordBased != null) {
                return strWordBased;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String localizedTrialPeriodPrice_delegate$lambda$35(RawStoreProduct rawStoreProduct) {
        String str;
        NumberFormat priceFormatter = rawStoreProduct.getPriceFormatter();
        return (priceFormatter == null || (str = priceFormatter.format(rawStoreProduct.getTrialPeriodPrice())) == null) ? "$0.00" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String monthlyPrice_delegate$lambda$32(RawStoreProduct rawStoreProduct) {
        String str;
        String str2;
        BigDecimal basePriceForSelectedOffer = rawStoreProduct.getBasePriceForSelectedOffer();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (Intrinsics.areEqual(basePriceForSelectedOffer, bigDecimal)) {
            NumberFormat priceFormatter = rawStoreProduct.getPriceFormatter();
            return (priceFormatter == null || (str2 = priceFormatter.format(bigDecimal)) == null) ? "$0.00" : str2;
        }
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return "n/a";
        }
        Intrinsics.checkNotNull(basePriceForSelectedOffer);
        BigDecimal bigDecimalPricePerMonth = subscriptionPeriod.pricePerMonth(basePriceForSelectedOffer);
        NumberFormat priceFormatter2 = rawStoreProduct.getPriceFormatter();
        return (priceFormatter2 == null || (str = priceFormatter2.format(bigDecimalPricePerMonth)) == null) ? "n/a" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String offerId_delegate$lambda$2(RawStoreProduct rawStoreProduct) {
        z.f selectedOffer = rawStoreProduct.getSelectedOffer();
        if (selectedOffer != null) {
            return selectedOffer.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String periodDaysString_delegate$lambda$29(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getPeriodDays());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int periodDays_delegate$lambda$28(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return 0;
        }
        int value = subscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[subscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value;
        }
        if (i10 == 2) {
            return value * 7;
        }
        if (i10 == 3) {
            return value * 30;
        }
        if (i10 == 4) {
            return value * 365;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String periodMonthsString_delegate$lambda$23(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getPeriodMonths());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int periodMonths_delegate$lambda$22(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return 0;
        }
        int value = subscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[subscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value / 30;
        }
        if (i10 == 2) {
            return value / 4;
        }
        if (i10 == 3) {
            return value;
        }
        if (i10 == 4) {
            return value * 12;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String periodWeeksString_delegate$lambda$20(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getPeriodWeeks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int periodWeeks_delegate$lambda$19(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return 0;
        }
        int value = subscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[subscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value / 7;
        }
        if (i10 == 2) {
            return value;
        }
        if (i10 == 3) {
            return value * 4;
        }
        if (i10 == 4) {
            return value * 52;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String periodYearsString_delegate$lambda$26(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getPeriodYears());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int periodYears_delegate$lambda$25(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return 0;
        }
        int value = subscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[subscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value / 365;
        }
        if (i10 == 2) {
            return value / 52;
        }
        if (i10 == 3) {
            return value / 12;
        }
        if (i10 == 4) {
            return value;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String period_delegate$lambda$15(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return "";
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[subscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return subscriptionPeriod.getValue() == 7 ? "week" : "day";
        }
        if (i10 == 2) {
            return "week";
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "year";
            }
            throw new k0();
        }
        int value = subscriptionPeriod.getValue();
        if (value == 2) {
            return "2 months";
        }
        if (value != 3) {
            return value != 6 ? "month" : "6 months";
        }
        return "quarter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String periodly_delegate$lambda$17(RawStoreProduct rawStoreProduct) {
        String str;
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod != null) {
            if (WhenMappings.$EnumSwitchMapping$0[subscriptionPeriod.getUnit().ordinal()] == 3) {
                int value = subscriptionPeriod.getValue();
                if (value == 2 || value == 6) {
                    str = "every " + rawStoreProduct.getPeriod();
                } else {
                    str = rawStoreProduct.getPeriod() + "ly";
                }
            } else {
                str = rawStoreProduct.getPeriod() + "ly";
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    private final BigDecimal periodsPerUnit(SubscriptionPeriod.Unit unit) {
        SubscriptionPeriod.Unit unit2;
        int i10;
        BigDecimal bigDecimalDivide;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[unit.ordinal()];
        if (i11 == 1) {
            SubscriptionPeriod trialSubscriptionPeriod = getTrialSubscriptionPeriod();
            unit2 = trialSubscriptionPeriod != null ? trialSubscriptionPeriod.getUnit() : null;
            i10 = unit2 != null ? iArr[unit2.ordinal()] : -1;
            if (i10 == 1) {
                return new BigDecimal(1);
            }
            if (i10 == 2) {
                return new BigDecimal(7);
            }
            if (i10 == 3) {
                return new BigDecimal(30);
            }
            if (i10 == 4) {
                return new BigDecimal(365);
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        if (i11 == 2) {
            SubscriptionPeriod trialSubscriptionPeriod2 = getTrialSubscriptionPeriod();
            unit2 = trialSubscriptionPeriod2 != null ? trialSubscriptionPeriod2.getUnit() : null;
            i10 = unit2 != null ? iArr[unit2.ordinal()] : -1;
            if (i10 == 1) {
                BigDecimal bigDecimalDivide2 = new BigDecimal(1).divide(new BigDecimal(7), 6, RoundingMode.DOWN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
                return bigDecimalDivide2;
            }
            if (i10 == 2) {
                return new BigDecimal(1);
            }
            if (i10 == 3) {
                return new BigDecimal(4);
            }
            if (i10 == 4) {
                return new BigDecimal(52);
            }
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            return ZERO2;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new k0();
            }
            SubscriptionPeriod trialSubscriptionPeriod3 = getTrialSubscriptionPeriod();
            unit2 = trialSubscriptionPeriod3 != null ? trialSubscriptionPeriod3.getUnit() : null;
            i10 = unit2 != null ? iArr[unit2.ordinal()] : -1;
            if (i10 == 1) {
                bigDecimalDivide = new BigDecimal(1).divide(new BigDecimal(365), 6, RoundingMode.DOWN);
            } else if (i10 == 2) {
                bigDecimalDivide = new BigDecimal(1).divide(new BigDecimal(52), 6, RoundingMode.DOWN);
            } else if (i10 != 3) {
                bigDecimalDivide = i10 != 4 ? BigDecimal.ZERO : BigDecimal.ONE;
            } else {
                bigDecimalDivide = new BigDecimal(1).divide(new BigDecimal(12), 6, RoundingMode.DOWN);
            }
            Intrinsics.checkNotNull(bigDecimalDivide);
            return bigDecimalDivide;
        }
        SubscriptionPeriod trialSubscriptionPeriod4 = getTrialSubscriptionPeriod();
        unit2 = trialSubscriptionPeriod4 != null ? trialSubscriptionPeriod4.getUnit() : null;
        i10 = unit2 != null ? iArr[unit2.ordinal()] : -1;
        if (i10 == 1) {
            BigDecimal bigDecimalDivide3 = new BigDecimal(1).divide(new BigDecimal(30), 6, RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide3, "divide(...)");
            return bigDecimalDivide3;
        }
        if (i10 == 2) {
            BigDecimal bigDecimalDivide4 = new BigDecimal(1).divide(new BigDecimal(4), 6, RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide4, "divide(...)");
            return bigDecimalDivide4;
        }
        if (i10 == 3) {
            return new BigDecimal(1);
        }
        if (i10 == 4) {
            return new BigDecimal(12);
        }
        BigDecimal ZERO3 = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
        return ZERO3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NumberFormat priceFormatter_delegate$lambda$1(RawStoreProduct rawStoreProduct) {
        String currencyCode = rawStoreProduct.getCurrencyCode();
        if (currencyCode != null) {
            return rawStoreProduct.priceFormatterProvider.priceFormatter(currencyCode);
        }
        return null;
    }

    private final BigDecimal pricePerUnit(SubscriptionPeriod.Unit unit, z.c cVar) {
        if (cVar.d() == 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalMultiply = new BigDecimal(cVar.d()).divide(new BigDecimal(1000000), 6, RoundingMode.DOWN).multiply(new BigDecimal(cVar.a()));
        z.c selectedOfferPricingPhase = getSelectedOfferPricingPhase();
        SubscriptionPeriod subscriptionPeriodFrom = null;
        String strB = selectedOfferPricingPhase != null ? selectedOfferPricingPhase.b() : null;
        if (strB != null) {
            try {
                subscriptionPeriodFrom = SubscriptionPeriod.Companion.from(strB);
            } catch (Throwable unused) {
            }
        }
        BigDecimal bigDecimalMultiply2 = periodsPerUnit(unit).multiply(new BigDecimal(cVar.a())).multiply(new BigDecimal(subscriptionPeriodFrom != null ? subscriptionPeriodFrom.getValue() : 0));
        if (bigDecimalMultiply2.compareTo(BigDecimal.ONE) < 0) {
            Intrinsics.checkNotNull(bigDecimalMultiply);
            return bigDecimalMultiply;
        }
        BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalMultiply2, 2, RoundingMode.DOWN);
        Intrinsics.checkNotNull(bigDecimalDivide);
        return bigDecimalDivide;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal price_delegate$lambda$10(RawStoreProduct rawStoreProduct) {
        BigDecimal bigDecimalDivide;
        z.b bVarC = rawStoreProduct.underlyingProductDetails.c();
        if (bVarC != null && (bigDecimalDivide = new BigDecimal(bVarC.b()).divide(new BigDecimal(1000000), 2, RoundingMode.DOWN)) != null) {
            return bigDecimalDivide;
        }
        return rawStoreProduct.getBasePriceForSelectedOffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String productIdentifier_delegate$lambda$8(RawStoreProduct rawStoreProduct) {
        return rawStoreProduct.underlyingProductDetails.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String regionCode_delegate$lambda$77() {
        return Locale.getDefault().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z.c selectedOfferPricingPhase_delegate$lambda$7(RawStoreProduct rawStoreProduct) {
        Object next;
        z.f selectedOffer = rawStoreProduct.getSelectedOffer();
        Object obj = null;
        if (selectedOffer == null) {
            return null;
        }
        List<z.c> listA = selectedOffer.f().a();
        Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
        Iterator<T> it = listA.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z.c) next).d() != 0);
        z.c cVar = (z.c) next;
        if (cVar != null) {
            return cVar;
        }
        List<z.c> listA2 = selectedOffer.f().a();
        Intrinsics.checkNotNullExpressionValue(listA2, "getPricingPhaseList(...)");
        for (Object obj2 : CollectionsKt.dropLast(listA2, 1)) {
            if (((z.c) obj2).d() != 0) {
                obj = obj2;
                break;
            }
        }
        return (z.c) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubscriptionPeriod subscriptionPeriod_delegate$lambda$78(RawStoreProduct rawStoreProduct) {
        z.f selectedOffer;
        if (rawStoreProduct.underlyingProductDetails.c() != null || (selectedOffer = rawStoreProduct.getSelectedOffer()) == null) {
            return null;
        }
        List<z.c> listA = selectedOffer.f().a();
        Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
        String strB = ((z.c) CollectionsKt.last((List) listA)).b();
        Intrinsics.checkNotNullExpressionValue(strB, "getBillingPeriod(...)");
        try {
            return SubscriptionPeriod.Companion.from(strB);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trialPeriodDaysString_delegate$lambda$62(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getTrialPeriodDays());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int trialPeriodDays_delegate$lambda$61(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod trialSubscriptionPeriod = rawStoreProduct.getTrialSubscriptionPeriod();
        if (trialSubscriptionPeriod == null) {
            return 0;
        }
        int value = trialSubscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[trialSubscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value;
        }
        if (i10 == 2) {
            return value * 7;
        }
        if (i10 == 3) {
            return value * 30;
        }
        if (i10 == 4) {
            return value * 365;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trialPeriodEndDateString_delegate$lambda$59(RawStoreProduct rawStoreProduct) {
        String str;
        Date trialPeriodEndDate = rawStoreProduct.getTrialPeriodEndDate();
        return (trialPeriodEndDate == null || (str = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getMMM_dd_yyyy()).format(trialPeriodEndDate)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date trialPeriodEndDate_delegate$lambda$57(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod trialSubscriptionPeriod = rawStoreProduct.getTrialSubscriptionPeriod();
        if (trialSubscriptionPeriod == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        int i10 = WhenMappings.$EnumSwitchMapping$0[trialSubscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            calendar.add(6, trialSubscriptionPeriod.getValue());
        } else if (i10 == 2) {
            calendar.add(3, trialSubscriptionPeriod.getValue());
        } else if (i10 == 3) {
            calendar.add(2, trialSubscriptionPeriod.getValue());
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            calendar.add(1, trialSubscriptionPeriod.getValue());
        }
        return calendar.getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trialPeriodMonthsString_delegate$lambda$67(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getTrialPeriodMonths());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int trialPeriodMonths_delegate$lambda$66(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod trialSubscriptionPeriod = rawStoreProduct.getTrialSubscriptionPeriod();
        if (trialSubscriptionPeriod == null) {
            return 0;
        }
        int value = trialSubscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[trialSubscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value / 30;
        }
        if (i10 == 2) {
            return value / 4;
        }
        if (i10 == 3) {
            return value;
        }
        if (i10 == 4) {
            return value * 12;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal trialPeriodPrice_delegate$lambda$39(RawStoreProduct rawStoreProduct) {
        z.f selectedOffer;
        Object obj;
        Object next;
        BigDecimal bigDecimalDivide;
        if (rawStoreProduct.underlyingProductDetails.c() == null && (selectedOffer = rawStoreProduct.getSelectedOffer()) != null) {
            List<z.c> listA = selectedOffer.f().a();
            Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
            List listDropLast = CollectionsKt.dropLast(listA, 1);
            if (listDropLast.isEmpty()) {
                return BigDecimal.ZERO;
            }
            List list = listDropLast;
            Iterator it = list.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((z.c) next).d() != 0);
            if (((z.c) next) != null) {
                return BigDecimal.ZERO;
            }
            for (Object obj2 : list) {
                if (((z.c) obj2).d() > 0) {
                    obj = obj2;
                    break;
                }
            }
            z.c cVar = (z.c) obj;
            return (cVar == null || (bigDecimalDivide = new BigDecimal(cVar.d()).divide(new BigDecimal(1000000), 2, RoundingMode.DOWN)) == null) ? BigDecimal.ZERO : bigDecimalDivide;
        }
        return BigDecimal.ZERO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trialPeriodText_delegate$lambda$71(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod trialSubscriptionPeriod = rawStoreProduct.getTrialSubscriptionPeriod();
        if (trialSubscriptionPeriod == null) {
            return "";
        }
        int value = trialSubscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[trialSubscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value + "-day";
        }
        if (i10 == 2) {
            return (value * 7) + "-day";
        }
        if (i10 == 3) {
            return (value * 30) + "-day";
        }
        if (i10 != 4) {
            throw new k0();
        }
        return (value * 365) + "-day";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trialPeriodWeeksString_delegate$lambda$64(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getTrialPeriodWeeks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int trialPeriodWeeks_delegate$lambda$63(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod trialSubscriptionPeriod = rawStoreProduct.getTrialSubscriptionPeriod();
        if (trialSubscriptionPeriod == null) {
            boolean z10 = true & false;
            return 0;
        }
        int value = trialSubscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[trialSubscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value / 7;
        }
        if (i10 == 2) {
            return value;
        }
        if (i10 == 3) {
            return value * 4;
        }
        if (i10 == 4) {
            return value * 52;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trialPeriodYearsString_delegate$lambda$70(RawStoreProduct rawStoreProduct) {
        return String.valueOf(rawStoreProduct.getTrialPeriodYears());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int trialPeriodYears_delegate$lambda$69(RawStoreProduct rawStoreProduct) {
        SubscriptionPeriod trialSubscriptionPeriod = rawStoreProduct.getTrialSubscriptionPeriod();
        if (trialSubscriptionPeriod == null) {
            return 0;
        }
        int value = trialSubscriptionPeriod.getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[trialSubscriptionPeriod.getUnit().ordinal()];
        if (i10 == 1) {
            return value / 365;
        }
        if (i10 == 2) {
            return value / 52;
        }
        if (i10 == 3) {
            return value / 12;
        }
        if (i10 == 4) {
            return value;
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubscriptionPeriod trialSubscriptionPeriod_delegate$lambda$81(RawStoreProduct rawStoreProduct) {
        if (rawStoreProduct.underlyingProductDetails.c() != null) {
            return null;
        }
        z.c selectedOfferPricingPhase = rawStoreProduct.getSelectedOfferPricingPhase();
        String strB = selectedOfferPricingPhase != null ? selectedOfferPricingPhase.b() : null;
        if (strB != null) {
            try {
                return SubscriptionPeriod.Companion.from(strB);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String weeklyPrice_delegate$lambda$31(RawStoreProduct rawStoreProduct) {
        String str;
        String str2;
        BigDecimal basePriceForSelectedOffer = rawStoreProduct.getBasePriceForSelectedOffer();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (Intrinsics.areEqual(basePriceForSelectedOffer, bigDecimal)) {
            NumberFormat priceFormatter = rawStoreProduct.getPriceFormatter();
            if (priceFormatter != null && (str2 = priceFormatter.format(bigDecimal)) != null) {
                return str2;
            }
            return "$0.00";
        }
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return "n/a";
        }
        Intrinsics.checkNotNull(basePriceForSelectedOffer);
        BigDecimal bigDecimalPricePerWeek = subscriptionPeriod.pricePerWeek(basePriceForSelectedOffer);
        NumberFormat priceFormatter2 = rawStoreProduct.getPriceFormatter();
        return (priceFormatter2 == null || (str = priceFormatter2.format(bigDecimalPricePerWeek)) == null) ? "n/a" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String yearlyPrice_delegate$lambda$33(RawStoreProduct rawStoreProduct) {
        String str;
        String str2;
        BigDecimal basePriceForSelectedOffer = rawStoreProduct.getBasePriceForSelectedOffer();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (Intrinsics.areEqual(basePriceForSelectedOffer, bigDecimal)) {
            NumberFormat priceFormatter = rawStoreProduct.getPriceFormatter();
            return (priceFormatter == null || (str2 = priceFormatter.format(bigDecimal)) == null) ? "$0.00" : str2;
        }
        SubscriptionPeriod subscriptionPeriod = rawStoreProduct.getSubscriptionPeriod();
        if (subscriptionPeriod == null) {
            return "n/a";
        }
        Intrinsics.checkNotNull(basePriceForSelectedOffer);
        BigDecimal bigDecimalPricePerYear = subscriptionPeriod.pricePerYear(basePriceForSelectedOffer);
        NumberFormat priceFormatter2 = rawStoreProduct.getPriceFormatter();
        return (priceFormatter2 == null || (str = priceFormatter2.format(bigDecimalPricePerYear)) == null) ? "n/a" : str;
    }

    @Nullable
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getCurrencyCode() {
        return (String) this.currencyCode$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getCurrencySymbol() {
        return (String) this.currencySymbol$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getDailyPrice() {
        return (String) this.dailyPrice$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getFullIdentifier() {
        return this.fullIdentifier;
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public boolean getHasFreeTrial() {
        return ((Boolean) this.hasFreeTrial$delegate.getValue()).booleanValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getLanguageCode() {
        return (String) this.languageCode$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocale() {
        return (String) this.locale$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocalizedPrice() {
        return (String) this.localizedPrice$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocalizedSubscriptionPeriod() {
        return (String) this.localizedSubscriptionPeriod$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getLocalizedTrialPeriodPrice() {
        return (String) this.localizedTrialPeriodPrice$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getMonthlyPrice() {
        return (String) this.monthlyPrice$delegate.getValue();
    }

    @Nullable
    public final String getOfferId$superwall_release() {
        return (String) this.offerId$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriod() {
        return (String) this.period$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodDays() {
        return ((Number) this.periodDays$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodDaysString() {
        return (String) this.periodDaysString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodMonths() {
        return ((Number) this.periodMonths$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodMonthsString() {
        return (String) this.periodMonthsString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodWeeks() {
        return ((Number) this.periodWeeks$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodWeeksString() {
        return (String) this.periodWeeksString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getPeriodYears() {
        return ((Number) this.periodYears$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodYearsString() {
        return (String) this.periodYearsString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getPeriodly() {
        return (String) this.periodly$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public BigDecimal getPrice() {
        return (BigDecimal) this.price$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getProductIdentifier() {
        return (String) this.productIdentifier$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public String getRegionCode() {
        return (String) this.regionCode$delegate.getValue();
    }

    @Nullable
    public final z.f getSelectedOffer() {
        return (z.f) this.selectedOffer$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public SubscriptionPeriod getSubscriptionPeriod() {
        return (SubscriptionPeriod) this.subscriptionPeriod$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodDays() {
        return ((Number) this.trialPeriodDays$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodDaysString() {
        return (String) this.trialPeriodDaysString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @Nullable
    public Date getTrialPeriodEndDate() {
        return (Date) this.trialPeriodEndDate$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodEndDateString() {
        return (String) this.trialPeriodEndDateString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodMonths() {
        return ((Number) this.trialPeriodMonths$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodMonthsString() {
        return (String) this.trialPeriodMonthsString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public BigDecimal getTrialPeriodPrice() {
        return (BigDecimal) this.trialPeriodPrice$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodText() {
        return (String) this.trialPeriodText$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodWeeks() {
        return ((Number) this.trialPeriodWeeks$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodWeeksString() {
        return (String) this.trialPeriodWeeksString$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    public int getTrialPeriodYears() {
        return ((Number) this.trialPeriodYears$delegate.getValue()).intValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getTrialPeriodYearsString() {
        return (String) this.trialPeriodYearsString$delegate.getValue();
    }

    @NotNull
    public final z getUnderlyingProductDetails() {
        return this.underlyingProductDetails;
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getWeeklyPrice() {
        return (String) this.weeklyPrice$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String getYearlyPrice() {
        return (String) this.yearlyPrice$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.abstractions.product.StoreProductType
    @NotNull
    public String trialPeriodPricePerUnit(@NotNull SubscriptionPeriod.Unit unit) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(unit, "unit");
        z.c selectedOfferPricingPhase = getSelectedOfferPricingPhase();
        if (selectedOfferPricingPhase == null) {
            NumberFormat priceFormatter = getPriceFormatter();
            return (priceFormatter == null || (str3 = priceFormatter.format(0L)) == null) ? "$0.00" : str3;
        }
        if (selectedOfferPricingPhase.d() == 0) {
            NumberFormat priceFormatter2 = getPriceFormatter();
            return (priceFormatter2 == null || (str2 = priceFormatter2.format(0L)) == null) ? "$0.00" : str2;
        }
        BigDecimal bigDecimalPricePerUnit = pricePerUnit(unit, selectedOfferPricingPhase);
        NumberFormat priceFormatter3 = getPriceFormatter();
        return (priceFormatter3 == null || (str = priceFormatter3.format(bigDecimalPricePerUnit)) == null) ? "$0.00" : str;
    }
}
