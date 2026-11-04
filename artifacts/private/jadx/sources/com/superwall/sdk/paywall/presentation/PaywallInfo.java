package com.superwall.sdk.paywall.presentation;

import androidx.core.app.w;
import androidx.media3.common.j;
import com.superwall.sdk.config.models.Survey;
import com.superwall.sdk.config.models.Survey$$serializer;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.String_Helpers_ktKt;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.config.ComputedPropertyRequest$$serializer;
import com.superwall.sdk.models.config.FeatureGatingBehavior;
import com.superwall.sdk.models.config.FeatureGatingBehaviorSerializer;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.paywall.LocalNotification;
import com.superwall.sdk.models.paywall.LocalNotification$$serializer;
import com.superwall.sdk.models.paywall.PaywallPresentationInfo;
import com.superwall.sdk.models.paywall.PaywallPresentationInfo$$serializer;
import com.superwall.sdk.models.paywall.PaywallPresentationStyle;
import com.superwall.sdk.models.paywall.PaywallURL;
import com.superwall.sdk.models.paywall.PaywallURL$$serializer;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.product.ProductItemSerializer;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.models.triggers.Experiment$$serializer;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.utilities.DateUtilsKt;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@SourceDebugExtension({"SMAP\nPaywallInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallInfo.kt\ncom/superwall/sdk/paywall/presentation/PaywallInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,331:1\n1#2:332\n1872#3,3:333\n535#4:336\n520#4,6:337\n*S KotlinDebug\n*F\n+ 1 PaywallInfo.kt\ncom/superwall/sdk/paywall/presentation/PaywallInfo\n*L\n273#1:333,3\n283#1:336\n283#1:337,6\n*E\n"})
public final class PaywallInfo {

    @NotNull
    private final String buildId;

    @NotNull
    private final String cacheKey;

    @NotNull
    private final PaywallCloseReason closeReason;

    @NotNull
    private final List<ComputedPropertyRequest> computedPropertyRequests;

    @NotNull
    private final String databaseId;

    @Nullable
    private final Experiment experiment;

    @NotNull
    private final FeatureGatingBehavior featureGatingBehavior;

    @NotNull
    private final String identifier;
    private final boolean isFreeTrialAvailable;
    private final boolean isScrollEnabled;

    @NotNull
    private final List<LocalNotification> localNotifications;

    @NotNull
    private final String name;

    @Nullable
    private final String paywalljsVersion;

    @NotNull
    private final PaywallPresentationInfo presentation;

    @Nullable
    private final String presentationSourceType;

    @NotNull
    private final String presentedBy;

    @Nullable
    private final String presentedByEventAt;

    @Nullable
    private final String presentedByEventWithId;

    @Nullable
    private final String presentedByEventWithName;

    @NotNull
    private final List<String> productIds;

    @NotNull
    private final List<ProductItem> products;

    @Nullable
    private final String productsLoadCompleteTime;

    @Nullable
    private final Double productsLoadDuration;

    @Nullable
    private final String productsLoadFailTime;

    @Nullable
    private final String productsLoadStartTime;

    @Nullable
    private final String responseLoadCompleteTime;

    @Nullable
    private final Double responseLoadDuration;

    @Nullable
    private final String responseLoadFailTime;

    @Nullable
    private final String responseLoadStartTime;

    @Nullable
    private final String shimmerLoadCompleteTime;

    @Nullable
    private final String shimmerLoadStartTime;

    @NotNull
    private final List<Survey> surveys;

    @NotNull
    private final String url;

    @Nullable
    private final String webViewLoadCompleteTime;

    @Nullable
    private final Double webViewLoadDuration;

    @Nullable
    private final String webViewLoadFailTime;

    @Nullable
    private final String webViewLoadStartTime;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new kotlinx.serialization.internal.f(ProductItemSerializer.INSTANCE), new kotlinx.serialization.internal.f(b3.f315897a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, PaywallCloseReason.Companion.serializer(), new kotlinx.serialization.internal.f(LocalNotification$$serializer.INSTANCE), new kotlinx.serialization.internal.f(ComputedPropertyRequest$$serializer.INSTANCE), new kotlinx.serialization.internal.f(Survey$$serializer.INSTANCE), null, null, null, null};

    @NotNull
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.superwall.sdk.paywall.presentation.c
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PaywallInfo.json$lambda$26((JsonBuilder) obj);
        }
    }, 1, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PaywallInfo empty() {
            return new PaywallInfo("", "", "", PaywallURL.m47constructorimpl(""), null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, FeatureGatingBehavior.NonGated.INSTANCE, PaywallCloseReason.None.INSTANCE, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), new PaywallPresentationInfo(PaywallPresentationStyle.NONE, 0L), "", "", true, null);
        }

        @NotNull
        public final KSerializer<PaywallInfo> serializer() {
            return PaywallInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaywallInfo(int i10, int i11, String str, String str2, String str3, String str4, Experiment experiment, List list, List list2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d10, String str13, String str14, String str15, Double d11, String str16, String str17, String str18, String str19, String str20, Double d12, String str21, boolean z10, FeatureGatingBehavior featureGatingBehavior, PaywallCloseReason paywallCloseReason, List list3, List list4, List list5, PaywallPresentationInfo paywallPresentationInfo, String str22, String str23, boolean z11, v2 v2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, str, str2, str3, str4, experiment, list, list2, str5, str6, str7, str8, str9, str10, str11, str12, d10, str13, str14, str15, d11, str16, str17, str18, str19, str20, d12, str21, z10, featureGatingBehavior, paywallCloseReason, list3, list4, list5, paywallPresentationInfo, str22, str23, z11, v2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-a1Is-Vg$default, reason: not valid java name */
    public static /* synthetic */ PaywallInfo m66copya1IsVg$default(PaywallInfo paywallInfo, String str, String str2, String str3, String str4, Experiment experiment, List list, List list2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d10, String str13, String str14, String str15, Double d11, String str16, String str17, String str18, String str19, String str20, Double d12, String str21, boolean z10, FeatureGatingBehavior featureGatingBehavior, PaywallCloseReason paywallCloseReason, List list3, List list4, List list5, PaywallPresentationInfo paywallPresentationInfo, String str22, String str23, boolean z11, int i10, int i11, Object obj) {
        boolean z12;
        String str24;
        String str25 = (i10 & 1) != 0 ? paywallInfo.databaseId : str;
        String str26 = (i10 & 2) != 0 ? paywallInfo.identifier : str2;
        String str27 = (i10 & 4) != 0 ? paywallInfo.name : str3;
        String str28 = (i10 & 8) != 0 ? paywallInfo.url : str4;
        Experiment experiment2 = (i10 & 16) != 0 ? paywallInfo.experiment : experiment;
        List list6 = (i10 & 32) != 0 ? paywallInfo.products : list;
        List list7 = (i10 & 64) != 0 ? paywallInfo.productIds : list2;
        String str29 = (i10 & 128) != 0 ? paywallInfo.presentedByEventWithName : str5;
        String str30 = (i10 & 256) != 0 ? paywallInfo.presentedByEventWithId : str6;
        String str31 = (i10 & 512) != 0 ? paywallInfo.presentedByEventAt : str7;
        String str32 = (i10 & 1024) != 0 ? paywallInfo.presentedBy : str8;
        String str33 = (i10 & 2048) != 0 ? paywallInfo.presentationSourceType : str9;
        String str34 = (i10 & 4096) != 0 ? paywallInfo.responseLoadStartTime : str10;
        String str35 = (i10 & 8192) != 0 ? paywallInfo.responseLoadCompleteTime : str11;
        String str36 = str25;
        String str37 = (i10 & 16384) != 0 ? paywallInfo.responseLoadFailTime : str12;
        Double d13 = (i10 & 32768) != 0 ? paywallInfo.responseLoadDuration : d10;
        String str38 = (i10 & 65536) != 0 ? paywallInfo.webViewLoadStartTime : str13;
        String str39 = (i10 & 131072) != 0 ? paywallInfo.webViewLoadCompleteTime : str14;
        String str40 = (i10 & 262144) != 0 ? paywallInfo.webViewLoadFailTime : str15;
        Double d14 = (i10 & 524288) != 0 ? paywallInfo.webViewLoadDuration : d11;
        String str41 = (i10 & 1048576) != 0 ? paywallInfo.productsLoadStartTime : str16;
        String str42 = (i10 & 2097152) != 0 ? paywallInfo.productsLoadCompleteTime : str17;
        String str43 = (i10 & 4194304) != 0 ? paywallInfo.productsLoadFailTime : str18;
        String str44 = (i10 & 8388608) != 0 ? paywallInfo.shimmerLoadStartTime : str19;
        String str45 = (i10 & 16777216) != 0 ? paywallInfo.shimmerLoadCompleteTime : str20;
        Double d15 = (i10 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? paywallInfo.productsLoadDuration : d12;
        String str46 = (i10 & 67108864) != 0 ? paywallInfo.paywalljsVersion : str21;
        boolean z13 = (i10 & j.W0) != 0 ? paywallInfo.isFreeTrialAvailable : z10;
        FeatureGatingBehavior featureGatingBehavior2 = (i10 & 268435456) != 0 ? paywallInfo.featureGatingBehavior : featureGatingBehavior;
        PaywallCloseReason paywallCloseReason2 = (i10 & 536870912) != 0 ? paywallInfo.closeReason : paywallCloseReason;
        List list8 = (i10 & 1073741824) != 0 ? paywallInfo.localNotifications : list3;
        List list9 = (i10 & Integer.MIN_VALUE) != 0 ? paywallInfo.computedPropertyRequests : list4;
        List list10 = (i11 & 1) != 0 ? paywallInfo.surveys : list5;
        PaywallPresentationInfo paywallPresentationInfo2 = (i11 & 2) != 0 ? paywallInfo.presentation : paywallPresentationInfo;
        String str47 = (i11 & 4) != 0 ? paywallInfo.buildId : str22;
        String str48 = (i11 & 8) != 0 ? paywallInfo.cacheKey : str23;
        if ((i11 & 16) != 0) {
            str24 = str48;
            z12 = paywallInfo.isScrollEnabled;
        } else {
            z12 = z11;
            str24 = str48;
        }
        return paywallInfo.m68copya1IsVg(str36, str26, str27, str28, experiment2, list6, list7, str29, str30, str31, str32, str33, str34, str35, str37, d13, str38, str39, str40, d14, str41, str42, str43, str44, str45, d15, str46, z13, featureGatingBehavior2, paywallCloseReason2, list8, list9, list10, paywallPresentationInfo2, str47, str24, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map eventParams$default(PaywallInfo paywallInfo, StoreProduct storeProduct, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storeProduct = null;
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        return paywallInfo.eventParams(storeProduct, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eventParams$lambda$18(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$26(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        return Unit.f312394a;
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PaywallInfo paywallInfo, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, paywallInfo.databaseId);
        eVar.encodeStringElement(serialDescriptor, 1, paywallInfo.identifier);
        eVar.encodeStringElement(serialDescriptor, 2, paywallInfo.name);
        eVar.encodeSerializableElement(serialDescriptor, 3, PaywallURL$$serializer.INSTANCE, PaywallURL.m46boximpl(paywallInfo.url));
        eVar.encodeNullableSerializableElement(serialDescriptor, 4, Experiment$$serializer.INSTANCE, paywallInfo.experiment);
        eVar.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], paywallInfo.products);
        int i10 = 1 >> 6;
        eVar.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], paywallInfo.productIds);
        b3 b3Var = b3.f315897a;
        eVar.encodeNullableSerializableElement(serialDescriptor, 7, b3Var, paywallInfo.presentedByEventWithName);
        eVar.encodeNullableSerializableElement(serialDescriptor, 8, b3Var, paywallInfo.presentedByEventWithId);
        eVar.encodeNullableSerializableElement(serialDescriptor, 9, b3Var, paywallInfo.presentedByEventAt);
        eVar.encodeStringElement(serialDescriptor, 10, paywallInfo.presentedBy);
        eVar.encodeNullableSerializableElement(serialDescriptor, 11, b3Var, paywallInfo.presentationSourceType);
        eVar.encodeNullableSerializableElement(serialDescriptor, 12, b3Var, paywallInfo.responseLoadStartTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 13, b3Var, paywallInfo.responseLoadCompleteTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 14, b3Var, paywallInfo.responseLoadFailTime);
        e0 e0Var = e0.f315908a;
        eVar.encodeNullableSerializableElement(serialDescriptor, 15, e0Var, paywallInfo.responseLoadDuration);
        eVar.encodeNullableSerializableElement(serialDescriptor, 16, b3Var, paywallInfo.webViewLoadStartTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 17, b3Var, paywallInfo.webViewLoadCompleteTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 18, b3Var, paywallInfo.webViewLoadFailTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 19, e0Var, paywallInfo.webViewLoadDuration);
        eVar.encodeNullableSerializableElement(serialDescriptor, 20, b3Var, paywallInfo.productsLoadStartTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 21, b3Var, paywallInfo.productsLoadCompleteTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 22, b3Var, paywallInfo.productsLoadFailTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 23, b3Var, paywallInfo.shimmerLoadStartTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 24, b3Var, paywallInfo.shimmerLoadCompleteTime);
        eVar.encodeNullableSerializableElement(serialDescriptor, 25, e0Var, paywallInfo.productsLoadDuration);
        eVar.encodeNullableSerializableElement(serialDescriptor, 26, b3Var, paywallInfo.paywalljsVersion);
        eVar.encodeBooleanElement(serialDescriptor, 27, paywallInfo.isFreeTrialAvailable);
        eVar.encodeSerializableElement(serialDescriptor, 28, FeatureGatingBehaviorSerializer.INSTANCE, paywallInfo.featureGatingBehavior);
        eVar.encodeSerializableElement(serialDescriptor, 29, kSerializerArr[29], paywallInfo.closeReason);
        eVar.encodeSerializableElement(serialDescriptor, 30, kSerializerArr[30], paywallInfo.localNotifications);
        eVar.encodeSerializableElement(serialDescriptor, 31, kSerializerArr[31], paywallInfo.computedPropertyRequests);
        eVar.encodeSerializableElement(serialDescriptor, 32, kSerializerArr[32], paywallInfo.surveys);
        eVar.encodeSerializableElement(serialDescriptor, 33, PaywallPresentationInfo$$serializer.INSTANCE, paywallInfo.presentation);
        eVar.encodeStringElement(serialDescriptor, 34, paywallInfo.buildId);
        eVar.encodeStringElement(serialDescriptor, 35, paywallInfo.cacheKey);
        eVar.encodeBooleanElement(serialDescriptor, 36, paywallInfo.isScrollEnabled);
    }

    @NotNull
    public final Map<String, Object> audienceFilterParams() {
        String strEncodeToString = json.encodeToString(FeatureGatingBehavior.Companion.serializer(), this.featureGatingBehavior);
        Pair pair = TuplesKt.to("paywall_id", this.databaseId);
        Pair pair2 = TuplesKt.to("paywall_name", this.name);
        String str = this.presentedByEventWithName;
        if (str == null) {
            str = "";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to("presented_by_event_name", str), TuplesKt.to("paywall_product_ids", CollectionsKt.joinToString$default(this.productIds, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("is_free_trial_available", Boolean.valueOf(this.isFreeTrialAvailable)), TuplesKt.to("feature_gating", strEncodeToString), TuplesKt.to("presented_by", this.presentedBy));
        mapMutableMapOf.put("primary_product_id", "");
        mapMutableMapOf.put("secondary_product_id", "");
        mapMutableMapOf.put("tertiary_product_id", "");
        int i10 = 0;
        for (Object obj : this.products) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProductItem productItem = (ProductItem) obj;
            if (i10 == 0) {
                mapMutableMapOf.put("primary_product_id", productItem.getFullProductId());
            } else if (i10 == 1) {
                mapMutableMapOf.put("secondary_product_id", productItem.getFullProductId());
            } else if (i10 == 2) {
                mapMutableMapOf.put("tertiary_product_id", productItem.getFullProductId());
            }
            mapMutableMapOf.put(productItem.getName() + "_product_id", productItem.getFullProductId());
            i10 = i11;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMutableMapOf.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return r1.k(linkedHashMap);
    }

    @NotNull
    public final String component1() {
        return this.databaseId;
    }

    @Nullable
    public final String component10() {
        return this.presentedByEventAt;
    }

    @NotNull
    public final String component11() {
        return this.presentedBy;
    }

    @Nullable
    public final String component12() {
        return this.presentationSourceType;
    }

    @Nullable
    public final String component13() {
        return this.responseLoadStartTime;
    }

    @Nullable
    public final String component14() {
        return this.responseLoadCompleteTime;
    }

    @Nullable
    public final String component15() {
        return this.responseLoadFailTime;
    }

    @Nullable
    public final Double component16() {
        return this.responseLoadDuration;
    }

    @Nullable
    public final String component17() {
        return this.webViewLoadStartTime;
    }

    @Nullable
    public final String component18() {
        return this.webViewLoadCompleteTime;
    }

    @Nullable
    public final String component19() {
        return this.webViewLoadFailTime;
    }

    @NotNull
    public final String component2() {
        return this.identifier;
    }

    @Nullable
    public final Double component20() {
        return this.webViewLoadDuration;
    }

    @Nullable
    public final String component21() {
        return this.productsLoadStartTime;
    }

    @Nullable
    public final String component22() {
        return this.productsLoadCompleteTime;
    }

    @Nullable
    public final String component23() {
        return this.productsLoadFailTime;
    }

    @Nullable
    public final String component24() {
        return this.shimmerLoadStartTime;
    }

    @Nullable
    public final String component25() {
        return this.shimmerLoadCompleteTime;
    }

    @Nullable
    public final Double component26() {
        return this.productsLoadDuration;
    }

    @Nullable
    public final String component27() {
        return this.paywalljsVersion;
    }

    public final boolean component28() {
        return this.isFreeTrialAvailable;
    }

    @NotNull
    public final FeatureGatingBehavior component29() {
        return this.featureGatingBehavior;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final PaywallCloseReason component30() {
        return this.closeReason;
    }

    @NotNull
    public final List<LocalNotification> component31() {
        return this.localNotifications;
    }

    @NotNull
    public final List<ComputedPropertyRequest> component32() {
        return this.computedPropertyRequests;
    }

    @NotNull
    public final List<Survey> component33() {
        return this.surveys;
    }

    @NotNull
    public final PaywallPresentationInfo component34() {
        return this.presentation;
    }

    @NotNull
    public final String component35() {
        return this.buildId;
    }

    @NotNull
    public final String component36() {
        return this.cacheKey;
    }

    public final boolean component37() {
        return this.isScrollEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component4-24UBhI0, reason: not valid java name */
    public final String m67component424UBhI0() {
        return this.url;
    }

    @Nullable
    public final Experiment component5() {
        return this.experiment;
    }

    @NotNull
    public final List<ProductItem> component6() {
        return this.products;
    }

    @NotNull
    public final List<String> component7() {
        return this.productIds;
    }

    @Nullable
    public final String component8() {
        return this.presentedByEventWithName;
    }

    @Nullable
    public final String component9() {
        return this.presentedByEventWithId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-a1Is-Vg, reason: not valid java name */
    public final PaywallInfo m68copya1IsVg(@NotNull String databaseId, @NotNull String identifier, @NotNull String name, @NotNull String url, @Nullable Experiment experiment, @NotNull List<ProductItem> products, @NotNull List<String> productIds, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String presentedBy, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Double d10, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Double d11, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable Double d12, @Nullable String str16, boolean z10, @NotNull FeatureGatingBehavior featureGatingBehavior, @NotNull PaywallCloseReason closeReason, @NotNull List<LocalNotification> localNotifications, @NotNull List<ComputedPropertyRequest> computedPropertyRequests, @NotNull List<Survey> surveys, @NotNull PaywallPresentationInfo presentation, @NotNull String buildId, @NotNull String cacheKey, boolean z11) {
        Intrinsics.checkNotNullParameter(databaseId, "databaseId");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(presentedBy, "presentedBy");
        Intrinsics.checkNotNullParameter(featureGatingBehavior, "featureGatingBehavior");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        Intrinsics.checkNotNullParameter(localNotifications, "localNotifications");
        Intrinsics.checkNotNullParameter(computedPropertyRequests, "computedPropertyRequests");
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return new PaywallInfo(databaseId, identifier, name, url, experiment, products, productIds, str, str2, str3, presentedBy, str4, str5, str6, str7, d10, str8, str9, str10, d11, str11, str12, str13, str14, str15, d12, str16, z10, featureGatingBehavior, closeReason, localNotifications, computedPropertyRequests, surveys, presentation, buildId, cacheKey, z11, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallInfo)) {
            return false;
        }
        PaywallInfo paywallInfo = (PaywallInfo) obj;
        return Intrinsics.areEqual(this.databaseId, paywallInfo.databaseId) && Intrinsics.areEqual(this.identifier, paywallInfo.identifier) && Intrinsics.areEqual(this.name, paywallInfo.name) && PaywallURL.m49equalsimpl0(this.url, paywallInfo.url) && Intrinsics.areEqual(this.experiment, paywallInfo.experiment) && Intrinsics.areEqual(this.products, paywallInfo.products) && Intrinsics.areEqual(this.productIds, paywallInfo.productIds) && Intrinsics.areEqual(this.presentedByEventWithName, paywallInfo.presentedByEventWithName) && Intrinsics.areEqual(this.presentedByEventWithId, paywallInfo.presentedByEventWithId) && Intrinsics.areEqual(this.presentedByEventAt, paywallInfo.presentedByEventAt) && Intrinsics.areEqual(this.presentedBy, paywallInfo.presentedBy) && Intrinsics.areEqual(this.presentationSourceType, paywallInfo.presentationSourceType) && Intrinsics.areEqual(this.responseLoadStartTime, paywallInfo.responseLoadStartTime) && Intrinsics.areEqual(this.responseLoadCompleteTime, paywallInfo.responseLoadCompleteTime) && Intrinsics.areEqual(this.responseLoadFailTime, paywallInfo.responseLoadFailTime) && Intrinsics.areEqual((Object) this.responseLoadDuration, (Object) paywallInfo.responseLoadDuration) && Intrinsics.areEqual(this.webViewLoadStartTime, paywallInfo.webViewLoadStartTime) && Intrinsics.areEqual(this.webViewLoadCompleteTime, paywallInfo.webViewLoadCompleteTime) && Intrinsics.areEqual(this.webViewLoadFailTime, paywallInfo.webViewLoadFailTime) && Intrinsics.areEqual((Object) this.webViewLoadDuration, (Object) paywallInfo.webViewLoadDuration) && Intrinsics.areEqual(this.productsLoadStartTime, paywallInfo.productsLoadStartTime) && Intrinsics.areEqual(this.productsLoadCompleteTime, paywallInfo.productsLoadCompleteTime) && Intrinsics.areEqual(this.productsLoadFailTime, paywallInfo.productsLoadFailTime) && Intrinsics.areEqual(this.shimmerLoadStartTime, paywallInfo.shimmerLoadStartTime) && Intrinsics.areEqual(this.shimmerLoadCompleteTime, paywallInfo.shimmerLoadCompleteTime) && Intrinsics.areEqual((Object) this.productsLoadDuration, (Object) paywallInfo.productsLoadDuration) && Intrinsics.areEqual(this.paywalljsVersion, paywallInfo.paywalljsVersion) && this.isFreeTrialAvailable == paywallInfo.isFreeTrialAvailable && Intrinsics.areEqual(this.featureGatingBehavior, paywallInfo.featureGatingBehavior) && Intrinsics.areEqual(this.closeReason, paywallInfo.closeReason) && Intrinsics.areEqual(this.localNotifications, paywallInfo.localNotifications) && Intrinsics.areEqual(this.computedPropertyRequests, paywallInfo.computedPropertyRequests) && Intrinsics.areEqual(this.surveys, paywallInfo.surveys) && Intrinsics.areEqual(this.presentation, paywallInfo.presentation) && Intrinsics.areEqual(this.buildId, paywallInfo.buildId) && Intrinsics.areEqual(this.cacheKey, paywallInfo.cacheKey) && this.isScrollEnabled == paywallInfo.isScrollEnabled;
    }

    @NotNull
    public final Map<String, Object> eventParams(@Nullable StoreProduct storeProduct, @Nullable Map<String, ? extends Object> map) {
        Object obj;
        Experiment.Variant variant;
        Map<String, Object> mapAudienceFilterParams = audienceFilterParams();
        Pair[] pairArr = new Pair[20];
        Pair pair = TuplesKt.to("paywalljs_version", this.paywalljsVersion);
        if (pair == null) {
            pair = "";
        }
        pairArr[0] = pair;
        pairArr[1] = TuplesKt.to("paywall_identifier", this.identifier);
        pairArr[2] = TuplesKt.to("paywall_url", PaywallURL.m51toStringimpl(this.url));
        pairArr[3] = TuplesKt.to("presented_by_event_id", this.presentedByEventWithId);
        pairArr[4] = TuplesKt.to("presented_by_event_timestamp", this.presentedByEventAt);
        pairArr[5] = TuplesKt.to("presentation_source_type", this.presentationSourceType);
        pairArr[6] = TuplesKt.to("paywall_response_load_start_time", this.responseLoadStartTime);
        pairArr[7] = TuplesKt.to("paywall_response_load_complete_time", this.responseLoadCompleteTime);
        pairArr[8] = TuplesKt.to("paywall_response_load_duration", this.responseLoadDuration);
        pairArr[9] = TuplesKt.to("paywall_webview_load_start_time", this.webViewLoadStartTime);
        pairArr[10] = TuplesKt.to("paywall_webview_load_complete_time", this.webViewLoadCompleteTime);
        pairArr[11] = TuplesKt.to("paywall_webview_load_duration", this.webViewLoadDuration);
        pairArr[12] = TuplesKt.to("paywall_products_load_start_time", this.productsLoadStartTime);
        pairArr[13] = TuplesKt.to("paywall_products_load_complete_time", this.productsLoadCompleteTime);
        pairArr[14] = TuplesKt.to("paywall_products_load_fail_time", this.productsLoadFailTime);
        pairArr[15] = TuplesKt.to("paywall_products_load_duration", this.productsLoadDuration);
        pairArr[16] = TuplesKt.to("trigger_session_id", "");
        Experiment experiment = this.experiment;
        pairArr[17] = TuplesKt.to("experiment_id", experiment != null ? experiment.getId() : null);
        Experiment experiment2 = this.experiment;
        pairArr[18] = TuplesKt.to("variant_id", (experiment2 == null || (variant = experiment2.getVariant()) == null) ? null : variant.getId());
        pairArr[19] = TuplesKt.to("is_scroll_enabled", Boolean.valueOf(this.isScrollEnabled));
        Map mapMutableMapOf = MapsKt.mutableMapOf(pairArr);
        CollectionsKt.removeAll(mapMutableMapOf.values(), new Function1() { // from class: com.superwall.sdk.paywall.presentation.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(PaywallInfo.eventParams$lambda$18(obj2));
            }
        });
        Intrinsics.checkNotNull(mapMutableMapOf, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
        mapAudienceFilterParams.putAll(r1.k(mapMutableMapOf));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : mapAudienceFilterParams.keySet()) {
            if (StringsKt.V2(str, "_load_", false, 2, null) && (obj = mapAudienceFilterParams.get(str)) != null) {
                linkedHashMap.put(str, obj);
            }
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallEvents, "Paywall loading timestamps", linkedHashMap, null, 16, null);
        if (storeProduct != null) {
            mapAudienceFilterParams.put(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, storeProduct.getFullIdentifier());
            for (String str2 : storeProduct.getAttributes().keySet()) {
                String str3 = storeProduct.getAttributes().get(str2);
                if (str3 != null) {
                    mapAudienceFilterParams.put("product_" + String_Helpers_ktKt.camelCaseToSnakeCase(str2), str3);
                }
            }
        }
        if (map != null) {
            for (String str4 : map.keySet()) {
                Object obj2 = map.get(str4);
                if (obj2 != null) {
                    mapAudienceFilterParams.put(str4, obj2);
                }
            }
        }
        return mapAudienceFilterParams;
    }

    @NotNull
    public final String getBuildId() {
        return this.buildId;
    }

    @NotNull
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final PaywallCloseReason getCloseReason() {
        return this.closeReason;
    }

    @NotNull
    public final List<ComputedPropertyRequest> getComputedPropertyRequests() {
        return this.computedPropertyRequests;
    }

    @NotNull
    public final String getDatabaseId() {
        return this.databaseId;
    }

    @Nullable
    public final Experiment getExperiment() {
        return this.experiment;
    }

    @NotNull
    public final FeatureGatingBehavior getFeatureGatingBehavior() {
        return this.featureGatingBehavior;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final List<LocalNotification> getLocalNotifications() {
        return this.localNotifications;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPaywalljsVersion() {
        return this.paywalljsVersion;
    }

    @NotNull
    public final PaywallPresentationInfo getPresentation() {
        return this.presentation;
    }

    @Nullable
    public final String getPresentationSourceType() {
        return this.presentationSourceType;
    }

    @NotNull
    public final String getPresentedBy() {
        return this.presentedBy;
    }

    @Nullable
    public final String getPresentedByEventAt() {
        return this.presentedByEventAt;
    }

    @Nullable
    public final String getPresentedByEventWithId() {
        return this.presentedByEventWithId;
    }

    @Nullable
    public final String getPresentedByEventWithName() {
        return this.presentedByEventWithName;
    }

    @NotNull
    public final List<String> getProductIds() {
        return this.productIds;
    }

    @NotNull
    public final List<ProductItem> getProducts() {
        return this.products;
    }

    @Nullable
    public final String getProductsLoadCompleteTime() {
        return this.productsLoadCompleteTime;
    }

    @Nullable
    public final Double getProductsLoadDuration() {
        return this.productsLoadDuration;
    }

    @Nullable
    public final String getProductsLoadFailTime() {
        return this.productsLoadFailTime;
    }

    @Nullable
    public final String getProductsLoadStartTime() {
        return this.productsLoadStartTime;
    }

    @Nullable
    public final String getResponseLoadCompleteTime() {
        return this.responseLoadCompleteTime;
    }

    @Nullable
    public final Double getResponseLoadDuration() {
        return this.responseLoadDuration;
    }

    @Nullable
    public final String getResponseLoadFailTime() {
        return this.responseLoadFailTime;
    }

    @Nullable
    public final String getResponseLoadStartTime() {
        return this.responseLoadStartTime;
    }

    @Nullable
    public final String getShimmerLoadCompleteTime() {
        return this.shimmerLoadCompleteTime;
    }

    @Nullable
    public final String getShimmerLoadStartTime() {
        return this.shimmerLoadStartTime;
    }

    @NotNull
    public final List<Survey> getSurveys() {
        return this.surveys;
    }

    @NotNull
    /* JADX INFO: renamed from: getUrl-24UBhI0, reason: not valid java name */
    public final String m69getUrl24UBhI0() {
        return this.url;
    }

    @Nullable
    public final String getWebViewLoadCompleteTime() {
        return this.webViewLoadCompleteTime;
    }

    @Nullable
    public final Double getWebViewLoadDuration() {
        return this.webViewLoadDuration;
    }

    @Nullable
    public final String getWebViewLoadFailTime() {
        return this.webViewLoadFailTime;
    }

    @Nullable
    public final String getWebViewLoadStartTime() {
        return this.webViewLoadStartTime;
    }

    public int hashCode() {
        int iHashCode = ((((((this.databaseId.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.name.hashCode()) * 31) + PaywallURL.m50hashCodeimpl(this.url)) * 31;
        Experiment experiment = this.experiment;
        int iHashCode2 = (((((iHashCode + (experiment == null ? 0 : experiment.hashCode())) * 31) + this.products.hashCode()) * 31) + this.productIds.hashCode()) * 31;
        String str = this.presentedByEventWithName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.presentedByEventWithId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.presentedByEventAt;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.presentedBy.hashCode()) * 31;
        String str4 = this.presentationSourceType;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.responseLoadStartTime;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.responseLoadCompleteTime;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.responseLoadFailTime;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d10 = this.responseLoadDuration;
        int iHashCode10 = (iHashCode9 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str8 = this.webViewLoadStartTime;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.webViewLoadCompleteTime;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.webViewLoadFailTime;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Double d11 = this.webViewLoadDuration;
        int iHashCode14 = (iHashCode13 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str11 = this.productsLoadStartTime;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.productsLoadCompleteTime;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.productsLoadFailTime;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.shimmerLoadStartTime;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.shimmerLoadCompleteTime;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Double d12 = this.productsLoadDuration;
        int iHashCode20 = (iHashCode19 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str16 = this.paywalljsVersion;
        return ((((((((((((((((((((iHashCode20 + (str16 != null ? str16.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFreeTrialAvailable)) * 31) + this.featureGatingBehavior.hashCode()) * 31) + this.closeReason.hashCode()) * 31) + this.localNotifications.hashCode()) * 31) + this.computedPropertyRequests.hashCode()) * 31) + this.surveys.hashCode()) * 31) + this.presentation.hashCode()) * 31) + this.buildId.hashCode()) * 31) + this.cacheKey.hashCode()) * 31) + Boolean.hashCode(this.isScrollEnabled);
    }

    public final boolean isFreeTrialAvailable() {
        return this.isFreeTrialAvailable;
    }

    public final boolean isScrollEnabled() {
        return this.isScrollEnabled;
    }

    @NotNull
    public String toString() {
        return "PaywallInfo(databaseId=" + this.databaseId + ", identifier=" + this.identifier + ", name=" + this.name + ", url=" + PaywallURL.m51toStringimpl(this.url) + ", experiment=" + this.experiment + ", products=" + this.products + ", productIds=" + this.productIds + ", presentedByEventWithName=" + this.presentedByEventWithName + ", presentedByEventWithId=" + this.presentedByEventWithId + ", presentedByEventAt=" + this.presentedByEventAt + ", presentedBy=" + this.presentedBy + ", presentationSourceType=" + this.presentationSourceType + ", responseLoadStartTime=" + this.responseLoadStartTime + ", responseLoadCompleteTime=" + this.responseLoadCompleteTime + ", responseLoadFailTime=" + this.responseLoadFailTime + ", responseLoadDuration=" + this.responseLoadDuration + ", webViewLoadStartTime=" + this.webViewLoadStartTime + ", webViewLoadCompleteTime=" + this.webViewLoadCompleteTime + ", webViewLoadFailTime=" + this.webViewLoadFailTime + ", webViewLoadDuration=" + this.webViewLoadDuration + ", productsLoadStartTime=" + this.productsLoadStartTime + ", productsLoadCompleteTime=" + this.productsLoadCompleteTime + ", productsLoadFailTime=" + this.productsLoadFailTime + ", shimmerLoadStartTime=" + this.shimmerLoadStartTime + ", shimmerLoadCompleteTime=" + this.shimmerLoadCompleteTime + ", productsLoadDuration=" + this.productsLoadDuration + ", paywalljsVersion=" + this.paywalljsVersion + ", isFreeTrialAvailable=" + this.isFreeTrialAvailable + ", featureGatingBehavior=" + this.featureGatingBehavior + ", closeReason=" + this.closeReason + ", localNotifications=" + this.localNotifications + ", computedPropertyRequests=" + this.computedPropertyRequests + ", surveys=" + this.surveys + ", presentation=" + this.presentation + ", buildId=" + this.buildId + ", cacheKey=" + this.cacheKey + ", isScrollEnabled=" + this.isScrollEnabled + ")";
    }

    public /* synthetic */ PaywallInfo(String str, String str2, String str3, String str4, Experiment experiment, List list, List list2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d10, String str13, String str14, String str15, Double d11, String str16, String str17, String str18, String str19, String str20, Double d12, String str21, boolean z10, FeatureGatingBehavior featureGatingBehavior, PaywallCloseReason paywallCloseReason, List list3, List list4, List list5, PaywallPresentationInfo paywallPresentationInfo, String str22, String str23, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, experiment, list, list2, str5, str6, str7, str8, str9, str10, str11, str12, d10, str13, str14, str15, d11, str16, str17, str18, str19, str20, d12, str21, z10, featureGatingBehavior, paywallCloseReason, list3, list4, list5, paywallPresentationInfo, str22, str23, z11);
    }

    public /* synthetic */ PaywallInfo(String str, String str2, String str3, String str4, List list, List list2, EventData eventData, Date date, Date date2, Date date3, Date date4, Date date5, Date date6, Date date7, Date date8, Date date9, Date date10, Date date11, Experiment experiment, String str5, boolean z10, String str6, FeatureGatingBehavior featureGatingBehavior, List list3, List list4, PaywallCloseReason paywallCloseReason, List list5, PaywallPresentationInfo paywallPresentationInfo, String str7, String str8, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, list2, eventData, date, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, experiment, str5, z10, str6, featureGatingBehavior, list3, list4, paywallCloseReason, list5, paywallPresentationInfo, str7, str8, z11);
    }

    private /* synthetic */ PaywallInfo(int i10, int i11, String str, String str2, String str3, String str4, Experiment experiment, List list, List list2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d10, String str13, String str14, String str15, Double d11, String str16, String str17, String str18, String str19, String str20, Double d12, String str21, boolean z10, FeatureGatingBehavior featureGatingBehavior, PaywallCloseReason paywallCloseReason, List list3, List list4, List list5, PaywallPresentationInfo paywallPresentationInfo, String str22, String str23, boolean z11, v2 v2Var) {
        if ((31 != (i11 & 31)) | (-1 != i10)) {
            g2.a(new int[]{i10, i11}, new int[]{-1, 31}, PaywallInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.databaseId = str;
        this.identifier = str2;
        this.name = str3;
        this.url = str4;
        this.experiment = experiment;
        this.products = list;
        this.productIds = list2;
        this.presentedByEventWithName = str5;
        this.presentedByEventWithId = str6;
        this.presentedByEventAt = str7;
        this.presentedBy = str8;
        this.presentationSourceType = str9;
        this.responseLoadStartTime = str10;
        this.responseLoadCompleteTime = str11;
        this.responseLoadFailTime = str12;
        this.responseLoadDuration = d10;
        this.webViewLoadStartTime = str13;
        this.webViewLoadCompleteTime = str14;
        this.webViewLoadFailTime = str15;
        this.webViewLoadDuration = d11;
        this.productsLoadStartTime = str16;
        this.productsLoadCompleteTime = str17;
        this.productsLoadFailTime = str18;
        this.shimmerLoadStartTime = str19;
        this.shimmerLoadCompleteTime = str20;
        this.productsLoadDuration = d12;
        this.paywalljsVersion = str21;
        this.isFreeTrialAvailable = z10;
        this.featureGatingBehavior = featureGatingBehavior;
        this.closeReason = paywallCloseReason;
        this.localNotifications = list3;
        this.computedPropertyRequests = list4;
        this.surveys = list5;
        this.presentation = paywallPresentationInfo;
        this.buildId = str22;
        this.cacheKey = str23;
        this.isScrollEnabled = z11;
    }

    private PaywallInfo(String databaseId, String identifier, String name, String url, Experiment experiment, List<ProductItem> products, List<String> productIds, String str, String str2, String str3, String presentedBy, String str4, String str5, String str6, String str7, Double d10, String str8, String str9, String str10, Double d11, String str11, String str12, String str13, String str14, String str15, Double d12, String str16, boolean z10, FeatureGatingBehavior featureGatingBehavior, PaywallCloseReason closeReason, List<LocalNotification> localNotifications, List<ComputedPropertyRequest> computedPropertyRequests, List<Survey> surveys, PaywallPresentationInfo presentation, String buildId, String cacheKey, boolean z11) {
        Intrinsics.checkNotNullParameter(databaseId, "databaseId");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(presentedBy, "presentedBy");
        Intrinsics.checkNotNullParameter(featureGatingBehavior, "featureGatingBehavior");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        Intrinsics.checkNotNullParameter(localNotifications, "localNotifications");
        Intrinsics.checkNotNullParameter(computedPropertyRequests, "computedPropertyRequests");
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.databaseId = databaseId;
        this.identifier = identifier;
        this.name = name;
        this.url = url;
        this.experiment = experiment;
        this.products = products;
        this.productIds = productIds;
        this.presentedByEventWithName = str;
        this.presentedByEventWithId = str2;
        this.presentedByEventAt = str3;
        this.presentedBy = presentedBy;
        this.presentationSourceType = str4;
        this.responseLoadStartTime = str5;
        this.responseLoadCompleteTime = str6;
        this.responseLoadFailTime = str7;
        this.responseLoadDuration = d10;
        this.webViewLoadStartTime = str8;
        this.webViewLoadCompleteTime = str9;
        this.webViewLoadFailTime = str10;
        this.webViewLoadDuration = d11;
        this.productsLoadStartTime = str11;
        this.productsLoadCompleteTime = str12;
        this.productsLoadFailTime = str13;
        this.shimmerLoadStartTime = str14;
        this.shimmerLoadCompleteTime = str15;
        this.productsLoadDuration = d12;
        this.paywalljsVersion = str16;
        this.isFreeTrialAvailable = z10;
        this.featureGatingBehavior = featureGatingBehavior;
        this.closeReason = closeReason;
        this.localNotifications = localNotifications;
        this.computedPropertyRequests = computedPropertyRequests;
        this.surveys = surveys;
        this.presentation = presentation;
        this.buildId = buildId;
        this.cacheKey = cacheKey;
        this.isScrollEnabled = z11;
    }

    public /* synthetic */ PaywallInfo(String str, String str2, String str3, String str4, List list, List list2, EventData eventData, Date date, Date date2, Date date3, Date date4, Date date5, Date date6, Date date7, Date date8, Date date9, Date date10, Date date11, Experiment experiment, String str5, boolean z10, String str6, FeatureGatingBehavior featureGatingBehavior, List list3, List list4, PaywallCloseReason paywallCloseReason, List list5, PaywallPresentationInfo paywallPresentationInfo, String str7, String str8, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, list2, eventData, date, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, (i10 & 262144) != 0 ? null : experiment, (i10 & 524288) != 0 ? null : str5, z10, (i10 & 2097152) != 0 ? null : str6, (i10 & 4194304) != 0 ? FeatureGatingBehavior.NonGated.INSTANCE : featureGatingBehavior, list3, list4, paywallCloseReason, list5, paywallPresentationInfo, str7, str8, z11, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private PaywallInfo(String databaseId, String identifier, String name, String url, List<ProductItem> products, List<String> productIds, EventData eventData, Date date, Date date2, Date date3, Date date4, Date date5, Date date6, Date date7, Date date8, Date date9, Date date10, Date date11, Experiment experiment, String str, boolean z10, String str2, FeatureGatingBehavior featureGatingBehavior, List<LocalNotification> localNotifications, List<ComputedPropertyRequest> computedPropertyRequests, PaywallCloseReason closeReason, List<Survey> surveys, PaywallPresentationInfo presentation, String buildId, String cacheKey, boolean z11) {
        String str3;
        Double d10;
        Double d11;
        Double d12;
        String str4;
        String str5;
        Double dValueOf;
        String str6;
        String str7;
        String str8;
        Double dValueOf2;
        String str9;
        String str10;
        String str11;
        Double dValueOf3;
        String str12;
        String str13;
        String str14;
        String id2;
        Date createdAt;
        Intrinsics.checkNotNullParameter(databaseId, "databaseId");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(featureGatingBehavior, "featureGatingBehavior");
        Intrinsics.checkNotNullParameter(localNotifications, "localNotifications");
        Intrinsics.checkNotNullParameter(computedPropertyRequests, "computedPropertyRequests");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        String name2 = eventData != null ? eventData.getName() : null;
        String string = (eventData == null || (createdAt = eventData.getCreatedAt()) == null) ? null : createdAt.toString();
        if (eventData == null || (id2 = eventData.getId()) == null) {
            str3 = null;
        } else {
            String lowerCase = id2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str3 = lowerCase;
        }
        String str15 = eventData != null ? w.I0 : "programmatically";
        String str16 = "";
        String str17 = (date == null || (str14 = DateUtilsKt.getDateFormatterUtil().format(date)) == null) ? "" : str14;
        String str18 = (date == null || (str13 = DateUtilsKt.getDateFormatterUtil().format(date)) == null) ? "" : str13;
        String str19 = (date3 == null || (str12 = DateUtilsKt.getDateFormatterUtil().format(date3)) == null) ? "" : str12;
        if (date != null) {
            if (date2 != null) {
                long j10 = 1000;
                dValueOf3 = Double.valueOf((date2.getTime() / j10) - (date.getTime() / j10));
            } else {
                dValueOf3 = null;
            }
            d10 = dValueOf3;
        } else {
            str16 = "";
            d10 = null;
        }
        String str20 = (date4 == null || (str11 = DateUtilsKt.getDateFormatterUtil().format(date4)) == null) ? str16 : str11;
        String str21 = (date5 == null || (str10 = DateUtilsKt.getDateFormatterUtil().format(date5)) == null) ? str16 : str10;
        String str22 = (date6 == null || (str9 = DateUtilsKt.getDateFormatterUtil().format(date6)) == null) ? str16 : str9;
        if (date4 != null) {
            if (date5 != null) {
                long j11 = 1000;
                dValueOf2 = Double.valueOf((date5.getTime() / j11) - (date4.getTime() / j11));
            } else {
                dValueOf2 = null;
            }
            d11 = dValueOf2;
        } else {
            d11 = null;
        }
        String str23 = (date7 == null || (str8 = DateUtilsKt.getDateFormatterUtil().format(date7)) == null) ? str16 : str8;
        String str24 = (date9 == null || (str7 = DateUtilsKt.getDateFormatterUtil().format(date9)) == null) ? str16 : str7;
        String str25 = (date8 == null || (str6 = DateUtilsKt.getDateFormatterUtil().format(date8)) == null) ? str16 : str6;
        if (date7 != null) {
            if (date9 != null) {
                long j12 = 1000;
                dValueOf = Double.valueOf((date9.getTime() / j12) - (date7.getTime() / j12));
            } else {
                dValueOf = null;
            }
            d12 = dValueOf;
        } else {
            d12 = null;
        }
        this(databaseId, identifier, name, url, experiment, products, productIds, name2, str3, string, str15, str2, str17, str18, str19, d10, str20, str21, str22, d11, str23, str24, str25, (date4 == null || (str5 = DateUtilsKt.getDateFormatterUtil().format(date4)) == null) ? str16 : str5, (date4 == null || (str4 = DateUtilsKt.getDateFormatterUtil().format(date4)) == null) ? str16 : str4, d12, str, z10, featureGatingBehavior, closeReason, localNotifications, computedPropertyRequests, surveys, presentation, buildId, cacheKey, z11, null);
    }
}
