package com.superwall.sdk.models.paywall;

import android.graphics.Color;
import androidx.media3.common.j;
import com.google.api.client.googleapis.media.a;
import com.superwall.sdk.config.models.OnDeviceCaching;
import com.superwall.sdk.config.models.OnDeviceCachingSerializer;
import com.superwall.sdk.config.models.Survey;
import com.superwall.sdk.config.models.Survey$$serializer;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.SerializableEntity;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.config.ComputedPropertyRequest$$serializer;
import com.superwall.sdk.models.config.FeatureGatingBehavior;
import com.superwall.sdk.models.config.FeatureGatingBehaviorSerializer;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.product.ProductItemsDeserializer;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.models.product.ProductVariableSerializer;
import com.superwall.sdk.models.serialization.DateSerializer;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.paywall.presentation.PaywallCloseReason;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import io.sentry.k4;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.s0;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@SourceDebugExtension({"SMAP\nPaywall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paywall.kt\ncom/superwall/sdk/models/paywall/Paywall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1#2:273\n1557#3:274\n1628#3,3:275\n*S KotlinDebug\n*F\n+ 1 Paywall.kt\ncom/superwall/sdk/models/paywall/Paywall\n*L\n132#1:274\n132#1:275,3\n*E\n"})
public final class Paywall implements SerializableEntity {

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private List<ProductItem> _productItems;

    @NotNull
    private List<ProductItem> _products;

    @NotNull
    private final f0 backgroundColor$delegate;

    @NotNull
    private final String backgroundColorHex;

    @NotNull
    private final String buildId;

    @NotNull
    private final String cacheKey;

    @NotNull
    private PaywallCloseReason closeReason;

    @NotNull
    private List<ComputedPropertyRequest> computedPropertyRequests;

    @NotNull
    private final f0 darkBackgroundColor$delegate;

    @Nullable
    private final String darkBackgroundColorHex;

    @NotNull
    private final String databaseId;

    @Nullable
    private Experiment experiment;

    @NotNull
    private FeatureGatingBehavior featureGating;

    @NotNull
    private final String htmlSubstitutions;

    @NotNull
    private String identifier;
    private boolean isFreeTrialAvailable;

    @Nullable
    private final Boolean isScrollEnabled;

    @NotNull
    private List<LocalNotification> localNotifications;

    @NotNull
    private final String name;

    @NotNull
    private OnDeviceCaching onDeviceCache;

    @Nullable
    private String paywalljsVersion;

    @NotNull
    private PaywallPresentationInfo presentation;

    @NotNull
    private final String presentationCondition;
    private final long presentationDelay;

    @Nullable
    private String presentationSourceType;

    @NotNull
    private final String presentationStyle;

    @NotNull
    private List<String> productIds;

    @Nullable
    private List<ProductVariable> productVariables;

    @NotNull
    private LoadingInfo productsLoadingInfo;

    @NotNull
    private LoadingInfo responseLoadingInfo;

    @NotNull
    private LoadingInfo shimmerLoadingInfo;

    @NotNull
    private List<Survey> surveys;

    @Nullable
    private List<ProductVariable> swProductVariablesTemplate;

    @NotNull
    private final String url;

    @Nullable
    private final PaywallWebviewUrl.Config urlConfig;

    @NotNull
    private LoadingInfo webviewLoadingInfo;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Paywall> serializer() {
            return Paywall$$serializer.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Paywall stub() {
            String strM47constructorimpl = PaywallURL.m47constructorimpl("https://google.com");
            PaywallPresentationInfo paywallPresentationInfo = new PaywallPresentationInfo(PaywallPresentationStyle.MODAL, 300L);
            ArrayList arrayList = new ArrayList();
            List listEmptyList = CollectionsKt.emptyList();
            List listEmptyList2 = CollectionsKt.emptyList();
            Date date = null;
            LoadingInfo loadingInfo = new LoadingInfo((Date) null, date, (Date) null, 7, (DefaultConstructorMarker) null);
            Date date2 = null;
            LoadingInfo loadingInfo2 = new LoadingInfo(date, (Date) (0 == true ? 1 : 0), date2, 7, (DefaultConstructorMarker) null);
            Date date3 = null;
            Object[] objArr = 0 == true ? 1 : 0;
            String str = "";
            boolean z10 = false;
            String str2 = null;
            List list = null;
            OnDeviceCaching onDeviceCaching = null;
            Experiment experiment = null;
            PaywallCloseReason paywallCloseReason = null;
            String str3 = "123";
            String str4 = "test";
            List list2 = null;
            int i10 = 490864640;
            return new Paywall("id", "identifier", "abac", strM47constructorimpl, "", "MODAL", 300L, "CHECK_USER_SUBSCRIPTION", paywallPresentationInfo, "000000", null, listEmptyList2, listEmptyList, arrayList, loadingInfo, loadingInfo2, new LoadingInfo((Date) objArr, date2, date3, 7, (DefaultConstructorMarker) null), 0 == true ? 1 : 0, new ArrayList(), new ArrayList(), str, z10, str2, FeatureGatingBehavior.NonGated.INSTANCE, list, new ArrayList(), onDeviceCaching, experiment, paywallCloseReason, new PaywallWebviewUrl.Config(3, CollectionsKt.listOf(new PaywallWebviewUrl("https://google.com", 1000L, 1))), str3, str4, list2, Boolean.TRUE, i10, 1, null);
        }

        private Companion() {
        }
    }

    @b0
    public static final class LoadingInfo {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private Date endAt;

        @Nullable
        private Date failAt;

        @Nullable
        private Date startAt;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<LoadingInfo> serializer() {
                return Paywall$LoadingInfo$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public LoadingInfo() {
            this((Date) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ LoadingInfo copy$default(LoadingInfo loadingInfo, Date date, Date date2, Date date3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                date = loadingInfo.startAt;
            }
            if ((i10 & 2) != 0) {
                date2 = loadingInfo.endAt;
            }
            if ((i10 & 4) != 0) {
                date3 = loadingInfo.failAt;
            }
            return loadingInfo.copy(date, date2, date3);
        }

        @b0(with = DateSerializer.class)
        public static /* synthetic */ void getEndAt$annotations() {
        }

        @b0(with = DateSerializer.class)
        public static /* synthetic */ void getFailAt$annotations() {
        }

        @b0(with = DateSerializer.class)
        public static /* synthetic */ void getStartAt$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(LoadingInfo loadingInfo, e eVar, SerialDescriptor serialDescriptor) {
            if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || loadingInfo.startAt != null) {
                eVar.encodeNullableSerializableElement(serialDescriptor, 0, DateSerializer.INSTANCE, loadingInfo.startAt);
            }
            if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || loadingInfo.endAt != null) {
                eVar.encodeNullableSerializableElement(serialDescriptor, 1, DateSerializer.INSTANCE, loadingInfo.endAt);
            }
            if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || loadingInfo.failAt != null) {
                eVar.encodeNullableSerializableElement(serialDescriptor, 2, DateSerializer.INSTANCE, loadingInfo.failAt);
            }
        }

        @Nullable
        public final Date component1() {
            return this.startAt;
        }

        @Nullable
        public final Date component2() {
            return this.endAt;
        }

        @Nullable
        public final Date component3() {
            return this.failAt;
        }

        @NotNull
        public final LoadingInfo copy(@Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
            return new LoadingInfo(date, date2, date3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingInfo)) {
                return false;
            }
            LoadingInfo loadingInfo = (LoadingInfo) obj;
            return Intrinsics.areEqual(this.startAt, loadingInfo.startAt) && Intrinsics.areEqual(this.endAt, loadingInfo.endAt) && Intrinsics.areEqual(this.failAt, loadingInfo.failAt);
        }

        @Nullable
        public final Date getEndAt() {
            return this.endAt;
        }

        @Nullable
        public final Date getFailAt() {
            return this.failAt;
        }

        @Nullable
        public final Date getStartAt() {
            return this.startAt;
        }

        public int hashCode() {
            Date date = this.startAt;
            int iHashCode = 0;
            int iHashCode2 = (date == null ? 0 : date.hashCode()) * 31;
            Date date2 = this.endAt;
            int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
            Date date3 = this.failAt;
            if (date3 != null) {
                iHashCode = date3.hashCode();
            }
            return iHashCode3 + iHashCode;
        }

        public final void setEndAt(@Nullable Date date) {
            this.endAt = date;
        }

        public final void setFailAt(@Nullable Date date) {
            this.failAt = date;
        }

        public final void setStartAt(@Nullable Date date) {
            this.startAt = date;
        }

        @NotNull
        public String toString() {
            return "LoadingInfo(startAt=" + this.startAt + ", endAt=" + this.endAt + ", failAt=" + this.failAt + ")";
        }

        public /* synthetic */ LoadingInfo(int i10, Date date, Date date2, Date date3, v2 v2Var) {
            if ((i10 & 1) == 0) {
                this.startAt = null;
            } else {
                this.startAt = date;
            }
            if ((i10 & 2) == 0) {
                this.endAt = null;
            } else {
                this.endAt = date2;
            }
            if ((i10 & 4) == 0) {
                this.failAt = null;
            } else {
                this.failAt = date3;
            }
        }

        public LoadingInfo(@Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
            this.startAt = date;
            this.endAt = date2;
            this.failAt = date3;
        }

        public /* synthetic */ LoadingInfo(Date date, Date date2, Date date3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : date, (i10 & 2) != 0 ? null : date2, (i10 & 4) != 0 ? null : date3);
        }
    }

    static {
        ProductVariableSerializer productVariableSerializer = ProductVariableSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, new kotlinx.serialization.internal.f(productVariableSerializer), new kotlinx.serialization.internal.f(productVariableSerializer), null, null, null, null, new kotlinx.serialization.internal.f(ComputedPropertyRequest$$serializer.INSTANCE), new kotlinx.serialization.internal.f(LocalNotification$$serializer.INSTANCE), null, null, null, null, new kotlinx.serialization.internal.f(Survey$$serializer.INSTANCE), null};
    }

    public /* synthetic */ Paywall(int i10, String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, String str8, String str9, List list, List list2, List list3, String str10, boolean z10, String str11, FeatureGatingBehavior featureGatingBehavior, List list4, List list5, OnDeviceCaching onDeviceCaching, PaywallWebviewUrl.Config config, String str12, String str13, List list6, Boolean bool, v2 v2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, str5, str6, j10, str7, str8, str9, list, list2, list3, str10, z10, str11, featureGatingBehavior, list4, list5, onDeviceCaching, config, str12, str13, list6, bool, v2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$7(Paywall paywall) {
        try {
            return Color.parseColor(paywall.backgroundColorHex);
        } catch (Throwable unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.paywallView, "Invalid paywall background color: " + paywall.backgroundColorHex + ". Defaulting to white.", null, null, 24, null);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$8(Paywall paywall) {
        try {
            return Integer.valueOf(Color.parseColor(paywall.darkBackgroundColorHex));
        } catch (Throwable unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.paywallView, "Invalid paywall background color: " + paywall.darkBackgroundColorHex + ". Defaulting to white.", null, null, 24, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundColor_delegate$lambda$3(Paywall paywall) {
        try {
            return Color.parseColor(paywall.backgroundColorHex);
        } catch (Throwable unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.paywallView, "Invalid paywall background color: " + paywall.backgroundColorHex + ". Defaulting to white.", null, null, 24, null);
            return -1;
        }
    }

    private final List<ProductItem> component12() {
        return this._products;
    }

    private final List<ProductItem> component13() {
        return this._productItems;
    }

    private final String component6() {
        return this.presentationStyle;
    }

    private final long component7() {
        return this.presentationDelay;
    }

    private final String component8() {
        return this.presentationCondition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-irgJXp4$default, reason: not valid java name */
    public static /* synthetic */ Paywall m41copyirgJXp4$default(Paywall paywall, String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, PaywallPresentationInfo paywallPresentationInfo, String str8, String str9, List list, List list2, List list3, LoadingInfo loadingInfo, LoadingInfo loadingInfo2, LoadingInfo loadingInfo3, LoadingInfo loadingInfo4, List list4, List list5, String str10, boolean z10, String str11, FeatureGatingBehavior featureGatingBehavior, List list6, List list7, OnDeviceCaching onDeviceCaching, Experiment experiment, PaywallCloseReason paywallCloseReason, PaywallWebviewUrl.Config config, String str12, String str13, List list8, Boolean bool, int i10, int i11, Object obj) {
        Boolean bool2;
        List list9;
        String str14 = (i10 & 1) != 0 ? paywall.databaseId : str;
        String str15 = (i10 & 2) != 0 ? paywall.identifier : str2;
        String str16 = (i10 & 4) != 0 ? paywall.name : str3;
        String str17 = (i10 & 8) != 0 ? paywall.url : str4;
        String str18 = (i10 & 16) != 0 ? paywall.htmlSubstitutions : str5;
        String str19 = (i10 & 32) != 0 ? paywall.presentationStyle : str6;
        long j11 = (i10 & 64) != 0 ? paywall.presentationDelay : j10;
        String str20 = (i10 & 128) != 0 ? paywall.presentationCondition : str7;
        PaywallPresentationInfo paywallPresentationInfo2 = (i10 & 256) != 0 ? paywall.presentation : paywallPresentationInfo;
        String str21 = (i10 & 512) != 0 ? paywall.backgroundColorHex : str8;
        String str22 = (i10 & 1024) != 0 ? paywall.darkBackgroundColorHex : str9;
        List list10 = (i10 & 2048) != 0 ? paywall._products : list;
        List list11 = (i10 & 4096) != 0 ? paywall._productItems : list2;
        String str23 = str14;
        List list12 = (i10 & 8192) != 0 ? paywall.productIds : list3;
        LoadingInfo loadingInfo5 = (i10 & 16384) != 0 ? paywall.responseLoadingInfo : loadingInfo;
        LoadingInfo loadingInfo6 = (i10 & 32768) != 0 ? paywall.webviewLoadingInfo : loadingInfo2;
        LoadingInfo loadingInfo7 = (i10 & 65536) != 0 ? paywall.productsLoadingInfo : loadingInfo3;
        LoadingInfo loadingInfo8 = (i10 & 131072) != 0 ? paywall.shimmerLoadingInfo : loadingInfo4;
        List list13 = (i10 & 262144) != 0 ? paywall.productVariables : list4;
        List list14 = (i10 & 524288) != 0 ? paywall.swProductVariablesTemplate : list5;
        String str24 = (i10 & 1048576) != 0 ? paywall.paywalljsVersion : str10;
        boolean z11 = (i10 & 2097152) != 0 ? paywall.isFreeTrialAvailable : z10;
        String str25 = (i10 & 4194304) != 0 ? paywall.presentationSourceType : str11;
        FeatureGatingBehavior featureGatingBehavior2 = (i10 & 8388608) != 0 ? paywall.featureGating : featureGatingBehavior;
        List list15 = (i10 & 16777216) != 0 ? paywall.computedPropertyRequests : list6;
        List list16 = (i10 & a.f115410j) != 0 ? paywall.localNotifications : list7;
        OnDeviceCaching onDeviceCaching2 = (i10 & 67108864) != 0 ? paywall.onDeviceCache : onDeviceCaching;
        Experiment experiment2 = (i10 & j.W0) != 0 ? paywall.experiment : experiment;
        PaywallCloseReason paywallCloseReason2 = (i10 & 268435456) != 0 ? paywall.closeReason : paywallCloseReason;
        PaywallWebviewUrl.Config config2 = (i10 & 536870912) != 0 ? paywall.urlConfig : config;
        String str26 = (i10 & 1073741824) != 0 ? paywall.cacheKey : str12;
        String str27 = (i10 & Integer.MIN_VALUE) != 0 ? paywall.buildId : str13;
        List list17 = (i11 & 1) != 0 ? paywall.surveys : list8;
        if ((i11 & 2) != 0) {
            list9 = list17;
            bool2 = paywall.isScrollEnabled;
        } else {
            bool2 = bool;
            list9 = list17;
        }
        return paywall.m44copyirgJXp4(str23, str15, str16, str17, str18, str19, j11, str20, paywallPresentationInfo2, str21, str22, list10, list11, list12, loadingInfo5, loadingInfo6, loadingInfo7, loadingInfo8, list13, list14, str24, z11, str25, featureGatingBehavior2, list15, list16, onDeviceCaching2, experiment2, paywallCloseReason2, config2, str26, str27, list9, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer darkBackgroundColor_delegate$lambda$4(Paywall paywall) {
        try {
            return Integer.valueOf(Color.parseColor(paywall.darkBackgroundColorHex));
        } catch (Throwable unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.paywallView, "Invalid paywall background color: " + paywall.darkBackgroundColorHex + ". Defaulting to white.", null, null, 24, null);
            return null;
        }
    }

    @a0("background_color_hex")
    public static /* synthetic */ void getBackgroundColorHex$annotations() {
    }

    @b0
    @a0(k4.c.f305757m)
    public static /* synthetic */ void getBuildId$annotations() {
    }

    @b0
    @a0("cache_key")
    public static /* synthetic */ void getCacheKey$annotations() {
    }

    @s0
    public static /* synthetic */ void getCloseReason$annotations() {
    }

    @a0("computed_properties")
    public static /* synthetic */ void getComputedPropertyRequests$annotations() {
    }

    @a0("dark_background_color_hex")
    public static /* synthetic */ void getDarkBackgroundColorHex$annotations() {
    }

    @a0("id")
    public static /* synthetic */ void getDatabaseId$annotations() {
    }

    @s0
    public static /* synthetic */ void getExperiment$annotations() {
    }

    @a0("feature_gating")
    public static /* synthetic */ void getFeatureGating$annotations() {
    }

    @a0("paywalljs_event")
    public static /* synthetic */ void getHtmlSubstitutions$annotations() {
    }

    @a0("identifier")
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @a0("local_notifications")
    public static /* synthetic */ void getLocalNotifications$annotations() {
    }

    @a0("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @a0("on_device_cache")
    public static /* synthetic */ void getOnDeviceCache$annotations() {
    }

    @s0
    public static /* synthetic */ void getPresentation$annotations() {
    }

    @a0("presentation_condition")
    private static /* synthetic */ void getPresentationCondition$annotations() {
    }

    @a0("presentation_delay")
    private static /* synthetic */ void getPresentationDelay$annotations() {
    }

    @a0("presentation_style_v2")
    private static /* synthetic */ void getPresentationStyle$annotations() {
    }

    @s0
    public static /* synthetic */ void getProductIds$annotations() {
    }

    @s0
    public static /* synthetic */ void getProductsLoadingInfo$annotations() {
    }

    @s0
    public static /* synthetic */ void getResponseLoadingInfo$annotations() {
    }

    @s0
    public static /* synthetic */ void getShimmerLoadingInfo$annotations() {
    }

    @a0("surveys")
    public static /* synthetic */ void getSurveys$annotations() {
    }

    @a0("url")
    /* JADX INFO: renamed from: getUrl-24UBhI0$annotations, reason: not valid java name */
    public static /* synthetic */ void m42getUrl24UBhI0$annotations() {
    }

    @a0("url_config")
    public static /* synthetic */ void getUrlConfig$annotations() {
    }

    @s0
    public static /* synthetic */ void getWebviewLoadingInfo$annotations() {
    }

    @b0(with = ProductItemsDeserializer.class)
    @a0("products_v2")
    private static /* synthetic */ void get_productItems$annotations() {
    }

    @s0
    private static /* synthetic */ void get_products$annotations() {
    }

    @a0("is_scroll_enabled")
    public static /* synthetic */ void isScrollEnabled$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Paywall paywall, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, paywall.databaseId);
        eVar.encodeStringElement(serialDescriptor, 1, paywall.identifier);
        eVar.encodeStringElement(serialDescriptor, 2, paywall.name);
        eVar.encodeSerializableElement(serialDescriptor, 3, PaywallURL$$serializer.INSTANCE, PaywallURL.m46boximpl(paywall.url));
        eVar.encodeStringElement(serialDescriptor, 4, paywall.htmlSubstitutions);
        int i10 = 0 >> 5;
        eVar.encodeStringElement(serialDescriptor, 5, paywall.presentationStyle);
        eVar.encodeLongElement(serialDescriptor, 6, paywall.presentationDelay);
        eVar.encodeStringElement(serialDescriptor, 7, paywall.presentationCondition);
        eVar.encodeStringElement(serialDescriptor, 8, paywall.backgroundColorHex);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 9) || paywall.darkBackgroundColorHex != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 9, b3.f315897a, paywall.darkBackgroundColorHex);
        }
        eVar.encodeSerializableElement(serialDescriptor, 10, ProductItemsDeserializer.INSTANCE, paywall._productItems);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 11) || paywall.productVariables != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], paywall.productVariables);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 12) || paywall.swProductVariablesTemplate != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], paywall.swProductVariablesTemplate);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 13) || paywall.paywalljsVersion != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 13, b3.f315897a, paywall.paywalljsVersion);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 14) || paywall.isFreeTrialAvailable) {
            eVar.encodeBooleanElement(serialDescriptor, 14, paywall.isFreeTrialAvailable);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 15) || paywall.presentationSourceType != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 15, b3.f315897a, paywall.presentationSourceType);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.areEqual(paywall.featureGating, FeatureGatingBehavior.NonGated.INSTANCE)) {
            eVar.encodeSerializableElement(serialDescriptor, 16, FeatureGatingBehaviorSerializer.INSTANCE, paywall.featureGating);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.areEqual(paywall.computedPropertyRequests, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], paywall.computedPropertyRequests);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.areEqual(paywall.localNotifications, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], paywall.localNotifications);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.areEqual(paywall.onDeviceCache, OnDeviceCaching.Disabled.INSTANCE)) {
            eVar.encodeSerializableElement(serialDescriptor, 19, OnDeviceCachingSerializer.INSTANCE, paywall.onDeviceCache);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 20) || paywall.urlConfig != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 20, PaywallWebviewUrl$Config$$serializer.INSTANCE, paywall.urlConfig);
        }
        eVar.encodeStringElement(serialDescriptor, 21, paywall.cacheKey);
        eVar.encodeStringElement(serialDescriptor, 22, paywall.buildId);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.areEqual(paywall.surveys, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], paywall.surveys);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.areEqual(paywall.isScrollEnabled, Boolean.TRUE)) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 24, i.f315935a, paywall.isScrollEnabled);
        }
    }

    @NotNull
    public final String component1() {
        return this.databaseId;
    }

    @NotNull
    public final String component10() {
        return this.backgroundColorHex;
    }

    @Nullable
    public final String component11() {
        return this.darkBackgroundColorHex;
    }

    @NotNull
    public final List<String> component14() {
        return this.productIds;
    }

    @NotNull
    public final LoadingInfo component15() {
        return this.responseLoadingInfo;
    }

    @NotNull
    public final LoadingInfo component16() {
        return this.webviewLoadingInfo;
    }

    @NotNull
    public final LoadingInfo component17() {
        return this.productsLoadingInfo;
    }

    @NotNull
    public final LoadingInfo component18() {
        return this.shimmerLoadingInfo;
    }

    @Nullable
    public final List<ProductVariable> component19() {
        return this.productVariables;
    }

    @NotNull
    public final String component2() {
        return this.identifier;
    }

    @Nullable
    public final List<ProductVariable> component20() {
        return this.swProductVariablesTemplate;
    }

    @Nullable
    public final String component21() {
        return this.paywalljsVersion;
    }

    public final boolean component22() {
        return this.isFreeTrialAvailable;
    }

    @Nullable
    public final String component23() {
        return this.presentationSourceType;
    }

    @NotNull
    public final FeatureGatingBehavior component24() {
        return this.featureGating;
    }

    @NotNull
    public final List<ComputedPropertyRequest> component25() {
        return this.computedPropertyRequests;
    }

    @NotNull
    public final List<LocalNotification> component26() {
        return this.localNotifications;
    }

    @NotNull
    public final OnDeviceCaching component27() {
        return this.onDeviceCache;
    }

    @Nullable
    public final Experiment component28() {
        return this.experiment;
    }

    @NotNull
    public final PaywallCloseReason component29() {
        return this.closeReason;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final PaywallWebviewUrl.Config component30() {
        return this.urlConfig;
    }

    @NotNull
    public final String component31() {
        return this.cacheKey;
    }

    @NotNull
    public final String component32() {
        return this.buildId;
    }

    @NotNull
    public final List<Survey> component33() {
        return this.surveys;
    }

    @Nullable
    public final Boolean component34() {
        return this.isScrollEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component4-24UBhI0, reason: not valid java name */
    public final String m43component424UBhI0() {
        return this.url;
    }

    @NotNull
    public final String component5() {
        return this.htmlSubstitutions;
    }

    @NotNull
    public final PaywallPresentationInfo component9() {
        return this.presentation;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-irgJXp4, reason: not valid java name */
    public final Paywall m44copyirgJXp4(@NotNull String databaseId, @NotNull String identifier, @NotNull String name, @NotNull String url, @NotNull String htmlSubstitutions, @NotNull String presentationStyle, long j10, @NotNull String presentationCondition, @NotNull PaywallPresentationInfo presentation, @NotNull String backgroundColorHex, @Nullable String str, @NotNull List<ProductItem> _products, @NotNull List<ProductItem> _productItems, @NotNull List<String> productIds, @NotNull LoadingInfo responseLoadingInfo, @NotNull LoadingInfo webviewLoadingInfo, @NotNull LoadingInfo productsLoadingInfo, @NotNull LoadingInfo shimmerLoadingInfo, @Nullable List<ProductVariable> list, @Nullable List<ProductVariable> list2, @Nullable String str2, boolean z10, @Nullable String str3, @NotNull FeatureGatingBehavior featureGating, @NotNull List<ComputedPropertyRequest> computedPropertyRequests, @NotNull List<LocalNotification> localNotifications, @NotNull OnDeviceCaching onDeviceCache, @Nullable Experiment experiment, @NotNull PaywallCloseReason closeReason, @Nullable PaywallWebviewUrl.Config config, @NotNull String cacheKey, @NotNull String buildId, @NotNull List<Survey> surveys, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(databaseId, "databaseId");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(htmlSubstitutions, "htmlSubstitutions");
        Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
        Intrinsics.checkNotNullParameter(presentationCondition, "presentationCondition");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        Intrinsics.checkNotNullParameter(backgroundColorHex, "backgroundColorHex");
        Intrinsics.checkNotNullParameter(_products, "_products");
        Intrinsics.checkNotNullParameter(_productItems, "_productItems");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(responseLoadingInfo, "responseLoadingInfo");
        Intrinsics.checkNotNullParameter(webviewLoadingInfo, "webviewLoadingInfo");
        Intrinsics.checkNotNullParameter(productsLoadingInfo, "productsLoadingInfo");
        Intrinsics.checkNotNullParameter(shimmerLoadingInfo, "shimmerLoadingInfo");
        Intrinsics.checkNotNullParameter(featureGating, "featureGating");
        Intrinsics.checkNotNullParameter(computedPropertyRequests, "computedPropertyRequests");
        Intrinsics.checkNotNullParameter(localNotifications, "localNotifications");
        Intrinsics.checkNotNullParameter(onDeviceCache, "onDeviceCache");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        return new Paywall(databaseId, identifier, name, url, htmlSubstitutions, presentationStyle, j10, presentationCondition, presentation, backgroundColorHex, str, _products, _productItems, productIds, responseLoadingInfo, webviewLoadingInfo, productsLoadingInfo, shimmerLoadingInfo, list, list2, str2, z10, str3, featureGating, computedPropertyRequests, localNotifications, onDeviceCache, experiment, closeReason, config, cacheKey, buildId, surveys, bool, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paywall)) {
            return false;
        }
        Paywall paywall = (Paywall) obj;
        return Intrinsics.areEqual(this.databaseId, paywall.databaseId) && Intrinsics.areEqual(this.identifier, paywall.identifier) && Intrinsics.areEqual(this.name, paywall.name) && PaywallURL.m49equalsimpl0(this.url, paywall.url) && Intrinsics.areEqual(this.htmlSubstitutions, paywall.htmlSubstitutions) && Intrinsics.areEqual(this.presentationStyle, paywall.presentationStyle) && this.presentationDelay == paywall.presentationDelay && Intrinsics.areEqual(this.presentationCondition, paywall.presentationCondition) && Intrinsics.areEqual(this.presentation, paywall.presentation) && Intrinsics.areEqual(this.backgroundColorHex, paywall.backgroundColorHex) && Intrinsics.areEqual(this.darkBackgroundColorHex, paywall.darkBackgroundColorHex) && Intrinsics.areEqual(this._products, paywall._products) && Intrinsics.areEqual(this._productItems, paywall._productItems) && Intrinsics.areEqual(this.productIds, paywall.productIds) && Intrinsics.areEqual(this.responseLoadingInfo, paywall.responseLoadingInfo) && Intrinsics.areEqual(this.webviewLoadingInfo, paywall.webviewLoadingInfo) && Intrinsics.areEqual(this.productsLoadingInfo, paywall.productsLoadingInfo) && Intrinsics.areEqual(this.shimmerLoadingInfo, paywall.shimmerLoadingInfo) && Intrinsics.areEqual(this.productVariables, paywall.productVariables) && Intrinsics.areEqual(this.swProductVariablesTemplate, paywall.swProductVariablesTemplate) && Intrinsics.areEqual(this.paywalljsVersion, paywall.paywalljsVersion) && this.isFreeTrialAvailable == paywall.isFreeTrialAvailable && Intrinsics.areEqual(this.presentationSourceType, paywall.presentationSourceType) && Intrinsics.areEqual(this.featureGating, paywall.featureGating) && Intrinsics.areEqual(this.computedPropertyRequests, paywall.computedPropertyRequests) && Intrinsics.areEqual(this.localNotifications, paywall.localNotifications) && Intrinsics.areEqual(this.onDeviceCache, paywall.onDeviceCache) && Intrinsics.areEqual(this.experiment, paywall.experiment) && Intrinsics.areEqual(this.closeReason, paywall.closeReason) && Intrinsics.areEqual(this.urlConfig, paywall.urlConfig) && Intrinsics.areEqual(this.cacheKey, paywall.cacheKey) && Intrinsics.areEqual(this.buildId, paywall.buildId) && Intrinsics.areEqual(this.surveys, paywall.surveys) && Intrinsics.areEqual(this.isScrollEnabled, paywall.isScrollEnabled);
    }

    public final int getBackgroundColor() {
        return ((Number) this.backgroundColor$delegate.getValue()).intValue();
    }

    @NotNull
    public final String getBackgroundColorHex() {
        return this.backgroundColorHex;
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

    @Nullable
    public final Integer getDarkBackgroundColor() {
        return (Integer) this.darkBackgroundColor$delegate.getValue();
    }

    @Nullable
    public final String getDarkBackgroundColorHex() {
        return this.darkBackgroundColorHex;
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
    public final FeatureGatingBehavior getFeatureGating() {
        return this.featureGating;
    }

    @NotNull
    public final String getHtmlSubstitutions() {
        return this.htmlSubstitutions;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final PaywallInfo getInfo(@Nullable EventData eventData) {
        String str = this.databaseId;
        String str2 = this.identifier;
        String str3 = this.name;
        String str4 = this.url;
        List<ProductItem> products = getProducts();
        List<String> list = this.productIds;
        Date startAt = this.responseLoadingInfo.getStartAt();
        Date endAt = this.responseLoadingInfo.getEndAt();
        Date failAt = this.responseLoadingInfo.getFailAt();
        Date startAt2 = this.webviewLoadingInfo.getStartAt();
        Date endAt2 = this.webviewLoadingInfo.getEndAt();
        Date failAt2 = this.webviewLoadingInfo.getFailAt();
        Date startAt3 = this.productsLoadingInfo.getStartAt();
        Date failAt3 = this.productsLoadingInfo.getFailAt();
        Date endAt3 = this.productsLoadingInfo.getEndAt();
        Date startAt4 = this.shimmerLoadingInfo.getStartAt();
        Date endAt4 = this.shimmerLoadingInfo.getEndAt();
        Experiment experiment = this.experiment;
        String str5 = this.paywalljsVersion;
        boolean z10 = this.isFreeTrialAvailable;
        String str6 = this.presentationSourceType;
        FeatureGatingBehavior featureGatingBehavior = this.featureGating;
        PaywallCloseReason paywallCloseReason = this.closeReason;
        List<LocalNotification> list2 = this.localNotifications;
        List<ComputedPropertyRequest> list3 = this.computedPropertyRequests;
        List<Survey> list4 = this.surveys;
        PaywallPresentationInfo paywallPresentationInfo = this.presentation;
        String str7 = this.cacheKey;
        String str8 = this.buildId;
        Boolean bool = this.isScrollEnabled;
        return new PaywallInfo(str, str2, str3, str4, products, list, eventData, startAt, endAt, failAt, startAt2, endAt2, failAt2, startAt3, failAt3, endAt3, startAt4, endAt4, experiment, str5, z10, str6, featureGatingBehavior, list2, list3, paywallCloseReason, list4, paywallPresentationInfo, str8, str7, bool != null ? bool.booleanValue() : true, null);
    }

    @NotNull
    public final List<LocalNotification> getLocalNotifications() {
        return this.localNotifications;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final OnDeviceCaching getOnDeviceCache() {
        return this.onDeviceCache;
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
    public final List<String> getProductIds() {
        return this.productIds;
    }

    @NotNull
    public final List<ProductItem> getProductItems() {
        return this._productItems;
    }

    @Nullable
    public final List<ProductVariable> getProductVariables() {
        return this.productVariables;
    }

    @NotNull
    public final List<ProductItem> getProducts() {
        return this._products;
    }

    @NotNull
    public final LoadingInfo getProductsLoadingInfo() {
        return this.productsLoadingInfo;
    }

    @NotNull
    public final LoadingInfo getResponseLoadingInfo() {
        return this.responseLoadingInfo;
    }

    @NotNull
    public final LoadingInfo getShimmerLoadingInfo() {
        return this.shimmerLoadingInfo;
    }

    @NotNull
    public final List<Survey> getSurveys() {
        return this.surveys;
    }

    @Nullable
    public final List<ProductVariable> getSwProductVariablesTemplate() {
        return this.swProductVariablesTemplate;
    }

    @NotNull
    /* JADX INFO: renamed from: getUrl-24UBhI0, reason: not valid java name */
    public final String m45getUrl24UBhI0() {
        return this.url;
    }

    @Nullable
    public final PaywallWebviewUrl.Config getUrlConfig() {
        return this.urlConfig;
    }

    @NotNull
    public final LoadingInfo getWebviewLoadingInfo() {
        return this.webviewLoadingInfo;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.databaseId.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.name.hashCode()) * 31) + PaywallURL.m50hashCodeimpl(this.url)) * 31) + this.htmlSubstitutions.hashCode()) * 31) + this.presentationStyle.hashCode()) * 31) + Long.hashCode(this.presentationDelay)) * 31) + this.presentationCondition.hashCode()) * 31) + this.presentation.hashCode()) * 31) + this.backgroundColorHex.hashCode()) * 31;
        String str = this.darkBackgroundColorHex;
        int iHashCode2 = (((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this._products.hashCode()) * 31) + this._productItems.hashCode()) * 31) + this.productIds.hashCode()) * 31) + this.responseLoadingInfo.hashCode()) * 31) + this.webviewLoadingInfo.hashCode()) * 31) + this.productsLoadingInfo.hashCode()) * 31) + this.shimmerLoadingInfo.hashCode()) * 31;
        List<ProductVariable> list = this.productVariables;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProductVariable> list2 = this.swProductVariablesTemplate;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.paywalljsVersion;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isFreeTrialAvailable)) * 31;
        String str3 = this.presentationSourceType;
        int iHashCode6 = (((((((((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.featureGating.hashCode()) * 31) + this.computedPropertyRequests.hashCode()) * 31) + this.localNotifications.hashCode()) * 31) + this.onDeviceCache.hashCode()) * 31;
        Experiment experiment = this.experiment;
        int iHashCode7 = (((iHashCode6 + (experiment == null ? 0 : experiment.hashCode())) * 31) + this.closeReason.hashCode()) * 31;
        PaywallWebviewUrl.Config config = this.urlConfig;
        int iHashCode8 = (((((((iHashCode7 + (config == null ? 0 : config.hashCode())) * 31) + this.cacheKey.hashCode()) * 31) + this.buildId.hashCode()) * 31) + this.surveys.hashCode()) * 31;
        Boolean bool = this.isScrollEnabled;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isFreeTrialAvailable() {
        return this.isFreeTrialAvailable;
    }

    @Nullable
    public final Boolean isScrollEnabled() {
        return this.isScrollEnabled;
    }

    public final void setCloseReason(@NotNull PaywallCloseReason paywallCloseReason) {
        Intrinsics.checkNotNullParameter(paywallCloseReason, "<set-?>");
        this.closeReason = paywallCloseReason;
    }

    public final void setComputedPropertyRequests(@NotNull List<ComputedPropertyRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.computedPropertyRequests = list;
    }

    public final void setExperiment(@Nullable Experiment experiment) {
        this.experiment = experiment;
    }

    public final void setFeatureGating(@NotNull FeatureGatingBehavior featureGatingBehavior) {
        Intrinsics.checkNotNullParameter(featureGatingBehavior, "<set-?>");
        this.featureGating = featureGatingBehavior;
    }

    public final void setFreeTrialAvailable(boolean z10) {
        this.isFreeTrialAvailable = z10;
    }

    public final void setIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identifier = str;
    }

    public final void setLocalNotifications(@NotNull List<LocalNotification> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.localNotifications = list;
    }

    public final void setOnDeviceCache(@NotNull OnDeviceCaching onDeviceCaching) {
        Intrinsics.checkNotNullParameter(onDeviceCaching, "<set-?>");
        this.onDeviceCache = onDeviceCaching;
    }

    public final void setPaywalljsVersion(@Nullable String str) {
        this.paywalljsVersion = str;
    }

    public final void setPresentation(@NotNull PaywallPresentationInfo paywallPresentationInfo) {
        Intrinsics.checkNotNullParameter(paywallPresentationInfo, "<set-?>");
        this.presentation = paywallPresentationInfo;
    }

    public final void setPresentationSourceType(@Nullable String str) {
        this.presentationSourceType = str;
    }

    public final void setProductIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.productIds = list;
    }

    public final void setProductItems(@NotNull List<ProductItem> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._productItems = value;
        List<ProductItem> list = value;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductItem) it.next()).getFullProductId());
        }
        this.productIds = arrayList;
        this._products = value;
    }

    public final void setProductVariables(@Nullable List<ProductVariable> list) {
        this.productVariables = list;
    }

    public final void setProductsLoadingInfo(@NotNull LoadingInfo loadingInfo) {
        Intrinsics.checkNotNullParameter(loadingInfo, "<set-?>");
        this.productsLoadingInfo = loadingInfo;
    }

    public final void setResponseLoadingInfo(@NotNull LoadingInfo loadingInfo) {
        Intrinsics.checkNotNullParameter(loadingInfo, "<set-?>");
        this.responseLoadingInfo = loadingInfo;
    }

    public final void setShimmerLoadingInfo(@NotNull LoadingInfo loadingInfo) {
        Intrinsics.checkNotNullParameter(loadingInfo, "<set-?>");
        this.shimmerLoadingInfo = loadingInfo;
    }

    public final void setSurveys(@NotNull List<Survey> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.surveys = list;
    }

    public final void setSwProductVariablesTemplate(@Nullable List<ProductVariable> list) {
        this.swProductVariablesTemplate = list;
    }

    public final void setWebviewLoadingInfo(@NotNull LoadingInfo loadingInfo) {
        Intrinsics.checkNotNullParameter(loadingInfo, "<set-?>");
        this.webviewLoadingInfo = loadingInfo;
    }

    @NotNull
    public String toString() {
        return "Paywall(databaseId=" + this.databaseId + ", identifier=" + this.identifier + ", name=" + this.name + ", url=" + PaywallURL.m51toStringimpl(this.url) + ", htmlSubstitutions=" + this.htmlSubstitutions + ", presentationStyle=" + this.presentationStyle + ", presentationDelay=" + this.presentationDelay + ", presentationCondition=" + this.presentationCondition + ", presentation=" + this.presentation + ", backgroundColorHex=" + this.backgroundColorHex + ", darkBackgroundColorHex=" + this.darkBackgroundColorHex + ", _products=" + this._products + ", _productItems=" + this._productItems + ", productIds=" + this.productIds + ", responseLoadingInfo=" + this.responseLoadingInfo + ", webviewLoadingInfo=" + this.webviewLoadingInfo + ", productsLoadingInfo=" + this.productsLoadingInfo + ", shimmerLoadingInfo=" + this.shimmerLoadingInfo + ", productVariables=" + this.productVariables + ", swProductVariablesTemplate=" + this.swProductVariablesTemplate + ", paywalljsVersion=" + this.paywalljsVersion + ", isFreeTrialAvailable=" + this.isFreeTrialAvailable + ", presentationSourceType=" + this.presentationSourceType + ", featureGating=" + this.featureGating + ", computedPropertyRequests=" + this.computedPropertyRequests + ", localNotifications=" + this.localNotifications + ", onDeviceCache=" + this.onDeviceCache + ", experiment=" + this.experiment + ", closeReason=" + this.closeReason + ", urlConfig=" + this.urlConfig + ", cacheKey=" + this.cacheKey + ", buildId=" + this.buildId + ", surveys=" + this.surveys + ", isScrollEnabled=" + this.isScrollEnabled + ")";
    }

    public final void update(@NotNull Paywall paywall) {
        Intrinsics.checkNotNullParameter(paywall, "paywall");
        setProductItems(paywall.getProductItems());
        this.productVariables = paywall.productVariables;
        this.swProductVariablesTemplate = paywall.swProductVariablesTemplate;
        this.isFreeTrialAvailable = paywall.isFreeTrialAvailable;
        this.productsLoadingInfo = paywall.productsLoadingInfo;
        this.presentationSourceType = paywall.presentationSourceType;
        this.experiment = paywall.experiment;
    }

    public /* synthetic */ Paywall(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, PaywallPresentationInfo paywallPresentationInfo, String str8, String str9, List list, List list2, List list3, LoadingInfo loadingInfo, LoadingInfo loadingInfo2, LoadingInfo loadingInfo3, LoadingInfo loadingInfo4, List list4, List list5, String str10, boolean z10, String str11, FeatureGatingBehavior featureGatingBehavior, List list6, List list7, OnDeviceCaching onDeviceCaching, Experiment experiment, PaywallCloseReason paywallCloseReason, PaywallWebviewUrl.Config config, String str12, String str13, List list8, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, j10, str7, paywallPresentationInfo, str8, str9, list, list2, list3, loadingInfo, loadingInfo2, loadingInfo3, loadingInfo4, list4, list5, str10, z10, str11, featureGatingBehavior, list6, list7, onDeviceCaching, experiment, paywallCloseReason, config, str12, str13, list8, bool);
    }

    private /* synthetic */ Paywall(int i10, String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, String str8, String str9, List list, List list2, List list3, String str10, boolean z10, String str11, FeatureGatingBehavior featureGatingBehavior, List list4, List list5, OnDeviceCaching onDeviceCaching, PaywallWebviewUrl.Config config, String str12, String str13, List list6, Boolean bool, v2 v2Var) {
        PaywallPresentationStyle next;
        String rawValue;
        String upperCase;
        if (6292991 != (i10 & 6292991)) {
            g2.b(i10, 6292991, Paywall$$serializer.INSTANCE.getDescriptor());
        }
        this.databaseId = str;
        this.identifier = str2;
        this.name = str3;
        this.url = str4;
        this.htmlSubstitutions = str5;
        this.presentationStyle = str6;
        this.presentationDelay = j10;
        this.presentationCondition = str7;
        Iterator<PaywallPresentationStyle> it = PaywallPresentationStyle.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            rawValue = next.getRawValue();
            upperCase = this.presentationStyle.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } while (!Intrinsics.areEqual(rawValue, upperCase));
        PaywallPresentationStyle paywallPresentationStyle = next;
        if (paywallPresentationStyle == null) {
            paywallPresentationStyle = PaywallPresentationStyle.NONE;
            Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.paywallPresentation, "Unknown or unsupported presentation style: " + this.presentationStyle, null, null, 24, null);
        }
        this.presentation = new PaywallPresentationInfo(paywallPresentationStyle, this.presentationDelay);
        this.backgroundColorHex = str8;
        if ((i10 & 512) == 0) {
            this.darkBackgroundColorHex = null;
        } else {
            this.darkBackgroundColorHex = str9;
        }
        this._products = CollectionsKt.emptyList();
        this._productItems = list;
        this.productIds = new ArrayList();
        int i11 = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        this.responseLoadingInfo = new LoadingInfo(date, date2, date3, i11, defaultConstructorMarker);
        this.webviewLoadingInfo = new LoadingInfo(date, date2, date3, i11, defaultConstructorMarker);
        this.productsLoadingInfo = new LoadingInfo(date, date2, date3, i11, defaultConstructorMarker);
        this.shimmerLoadingInfo = new LoadingInfo(date, date2, date3, i11, defaultConstructorMarker);
        if ((i10 & 2048) == 0) {
            this.productVariables = null;
        } else {
            this.productVariables = list2;
        }
        if ((i10 & 4096) == 0) {
            this.swProductVariablesTemplate = null;
        } else {
            this.swProductVariablesTemplate = list3;
        }
        if ((i10 & 8192) == 0) {
            this.paywalljsVersion = null;
        } else {
            this.paywalljsVersion = str10;
        }
        this.isFreeTrialAvailable = (i10 & 16384) == 0 ? false : z10;
        if ((32768 & i10) == 0) {
            this.presentationSourceType = null;
        } else {
            this.presentationSourceType = str11;
        }
        this.featureGating = (65536 & i10) == 0 ? FeatureGatingBehavior.NonGated.INSTANCE : featureGatingBehavior;
        this.computedPropertyRequests = (131072 & i10) == 0 ? CollectionsKt.emptyList() : list4;
        this.localNotifications = (262144 & i10) == 0 ? CollectionsKt.emptyList() : list5;
        this.onDeviceCache = (524288 & i10) == 0 ? OnDeviceCaching.Disabled.INSTANCE : onDeviceCaching;
        this.experiment = null;
        this.closeReason = PaywallCloseReason.None.INSTANCE;
        if ((1048576 & i10) == 0) {
            this.urlConfig = null;
        } else {
            this.urlConfig = config;
        }
        this.cacheKey = str12;
        this.buildId = str13;
        this.surveys = (8388608 & i10) == 0 ? CollectionsKt.emptyList() : list6;
        this.isScrollEnabled = (i10 & 16777216) == 0 ? Boolean.TRUE : bool;
        this.backgroundColor$delegate = g0.c(new Function0() { // from class: zf.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Paywall._init_$lambda$7(this.f413512a));
            }
        });
        this.darkBackgroundColor$delegate = g0.c(new Function0() { // from class: zf.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Paywall._init_$lambda$8(this.f413513a);
            }
        });
        setProductItems(this._productItems);
    }

    private Paywall(String databaseId, String identifier, String name, String url, String htmlSubstitutions, String presentationStyle, long j10, String presentationCondition, PaywallPresentationInfo presentation, String backgroundColorHex, String str, List<ProductItem> _products, List<ProductItem> _productItems, List<String> productIds, LoadingInfo responseLoadingInfo, LoadingInfo webviewLoadingInfo, LoadingInfo productsLoadingInfo, LoadingInfo shimmerLoadingInfo, List<ProductVariable> list, List<ProductVariable> list2, String str2, boolean z10, String str3, FeatureGatingBehavior featureGating, List<ComputedPropertyRequest> computedPropertyRequests, List<LocalNotification> localNotifications, OnDeviceCaching onDeviceCache, Experiment experiment, PaywallCloseReason closeReason, PaywallWebviewUrl.Config config, String cacheKey, String buildId, List<Survey> surveys, Boolean bool) {
        Intrinsics.checkNotNullParameter(databaseId, "databaseId");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(htmlSubstitutions, "htmlSubstitutions");
        Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
        Intrinsics.checkNotNullParameter(presentationCondition, "presentationCondition");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        Intrinsics.checkNotNullParameter(backgroundColorHex, "backgroundColorHex");
        Intrinsics.checkNotNullParameter(_products, "_products");
        Intrinsics.checkNotNullParameter(_productItems, "_productItems");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(responseLoadingInfo, "responseLoadingInfo");
        Intrinsics.checkNotNullParameter(webviewLoadingInfo, "webviewLoadingInfo");
        Intrinsics.checkNotNullParameter(productsLoadingInfo, "productsLoadingInfo");
        Intrinsics.checkNotNullParameter(shimmerLoadingInfo, "shimmerLoadingInfo");
        Intrinsics.checkNotNullParameter(featureGating, "featureGating");
        Intrinsics.checkNotNullParameter(computedPropertyRequests, "computedPropertyRequests");
        Intrinsics.checkNotNullParameter(localNotifications, "localNotifications");
        Intrinsics.checkNotNullParameter(onDeviceCache, "onDeviceCache");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        this.databaseId = databaseId;
        this.identifier = identifier;
        this.name = name;
        this.url = url;
        this.htmlSubstitutions = htmlSubstitutions;
        this.presentationStyle = presentationStyle;
        this.presentationDelay = j10;
        this.presentationCondition = presentationCondition;
        this.presentation = presentation;
        this.backgroundColorHex = backgroundColorHex;
        this.darkBackgroundColorHex = str;
        this._products = _products;
        this._productItems = _productItems;
        this.productIds = productIds;
        this.responseLoadingInfo = responseLoadingInfo;
        this.webviewLoadingInfo = webviewLoadingInfo;
        this.productsLoadingInfo = productsLoadingInfo;
        this.shimmerLoadingInfo = shimmerLoadingInfo;
        this.productVariables = list;
        this.swProductVariablesTemplate = list2;
        this.paywalljsVersion = str2;
        this.isFreeTrialAvailable = z10;
        this.presentationSourceType = str3;
        this.featureGating = featureGating;
        this.computedPropertyRequests = computedPropertyRequests;
        this.localNotifications = localNotifications;
        this.onDeviceCache = onDeviceCache;
        this.experiment = experiment;
        this.closeReason = closeReason;
        this.urlConfig = config;
        this.cacheKey = cacheKey;
        this.buildId = buildId;
        this.surveys = surveys;
        this.isScrollEnabled = bool;
        this.backgroundColor$delegate = g0.c(new Function0() { // from class: zf.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Paywall.backgroundColor_delegate$lambda$3(this.f413510a));
            }
        });
        this.darkBackgroundColor$delegate = g0.c(new Function0() { // from class: zf.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Paywall.darkBackgroundColor_delegate$lambda$4(this.f413511a);
            }
        });
        setProductItems(this._productItems);
    }

    public /* synthetic */ Paywall(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, PaywallPresentationInfo paywallPresentationInfo, String str8, String str9, List list, List list2, List list3, LoadingInfo loadingInfo, LoadingInfo loadingInfo2, LoadingInfo loadingInfo3, LoadingInfo loadingInfo4, List list4, List list5, String str10, boolean z10, String str11, FeatureGatingBehavior featureGatingBehavior, List list6, List list7, OnDeviceCaching onDeviceCaching, Experiment experiment, PaywallCloseReason paywallCloseReason, PaywallWebviewUrl.Config config, String str12, String str13, List list8, Boolean bool, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        long j11;
        PaywallPresentationInfo paywallPresentationInfo2;
        PaywallPresentationStyle next;
        String rawValue;
        String upperCase;
        if ((i10 & 256) != 0) {
            Iterator<PaywallPresentationStyle> it = PaywallPresentationStyle.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                rawValue = next.getRawValue();
                upperCase = str6.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } while (!Intrinsics.areEqual(rawValue, upperCase));
            PaywallPresentationStyle paywallPresentationStyle = next;
            if (paywallPresentationStyle == null) {
                paywallPresentationStyle = PaywallPresentationStyle.NONE;
                Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.paywallPresentation, "Unknown or unsupported presentation style: " + str6, null, null, 24, null);
            }
            j11 = j10;
            paywallPresentationInfo2 = new PaywallPresentationInfo(paywallPresentationStyle, j11);
        } else {
            j11 = j10;
            paywallPresentationInfo2 = paywallPresentationInfo;
        }
        this(str, str2, str3, str4, str5, str6, j11, str7, paywallPresentationInfo2, str8, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? CollectionsKt.emptyList() : list, list2, (i10 & 8192) != 0 ? new ArrayList() : list3, (i10 & 16384) != 0 ? new LoadingInfo((Date) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null) : loadingInfo, (32768 & i10) != 0 ? new LoadingInfo((Date) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null) : loadingInfo2, (65536 & i10) != 0 ? new LoadingInfo((Date) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null) : loadingInfo3, (131072 & i10) != 0 ? new LoadingInfo((Date) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null) : loadingInfo4, (262144 & i10) != 0 ? null : list4, (524288 & i10) != 0 ? null : list5, (1048576 & i10) != 0 ? null : str10, (2097152 & i10) != 0 ? false : z10, (4194304 & i10) != 0 ? null : str11, (8388608 & i10) != 0 ? FeatureGatingBehavior.NonGated.INSTANCE : featureGatingBehavior, (16777216 & i10) != 0 ? CollectionsKt.emptyList() : list6, (33554432 & i10) != 0 ? CollectionsKt.emptyList() : list7, (67108864 & i10) != 0 ? OnDeviceCaching.Disabled.INSTANCE : onDeviceCaching, (134217728 & i10) != 0 ? null : experiment, (268435456 & i10) != 0 ? PaywallCloseReason.None.INSTANCE : paywallCloseReason, (i10 & 536870912) != 0 ? null : config, str12, str13, (i11 & 1) != 0 ? CollectionsKt.emptyList() : list8, (i11 & 2) != 0 ? Boolean.TRUE : bool, null);
    }
}
