package com.superwall.sdk.models.config;

import androidx.media3.exoplayer.a5;
import com.superwall.sdk.models.SerializableEntity;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.paywall.Paywall$$serializer;
import com.superwall.sdk.models.postback.PostbackRequest;
import com.superwall.sdk.models.postback.PostbackRequest$$serializer;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.product.ProductItemSerializer;
import com.superwall.sdk.models.triggers.Trigger;
import com.superwall.sdk.models.triggers.Trigger$$serializer;
import com.superwall.sdk.models.triggers.TriggerRule;
import io.sentry.k4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@SourceDebugExtension({"SMAP\nConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Config.kt\ncom/superwall/sdk/models/config/Config\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1557#2:86\n1628#2,3:87\n1368#2:90\n1454#2,2:91\n1368#2:93\n1454#2,5:94\n1456#2,3:99\n1628#2,3:103\n1#3:102\n*S KotlinDebug\n*F\n+ 1 Config.kt\ncom/superwall/sdk/models/config/Config\n*L\n29#1:86\n29#1:87,3\n34#1:90\n34#1:91,2\n35#1:93\n35#1:94,5\n34#1:99,3\n29#1:103,3\n*E\n"})
public final class Config implements SerializableEntity {
    private long appSessionTimeout;

    @NotNull
    private final String buildId;

    @NotNull
    private transient Set<String> locales;

    @NotNull
    private LocalizationConfig localizationConfig;
    private int logLevel;

    @NotNull
    private List<Paywall> paywalls;

    @NotNull
    private PostbackRequest postback;

    @NotNull
    private PreloadingDisabled preloadingDisabled;

    @NotNull
    private final List<ProductItem> products;

    @NotNull
    private List<RawFeatureFlag> rawFeatureFlags;

    @Nullable
    private String requestId;

    @NotNull
    private Set<Trigger> triggers;

    @Nullable
    private WebToAppConfig webToAppConfig;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new g1(Trigger$$serializer.INSTANCE), new kotlinx.serialization.internal.f(Paywall$$serializer.INSTANCE), null, null, null, new kotlinx.serialization.internal.f(RawFeatureFlag$$serializer.INSTANCE), new kotlinx.serialization.internal.f(ProductItemSerializer.INSTANCE), null, null, null, new g1(b3.f315897a), null, null};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Config> serializer() {
            return Config$$serializer.INSTANCE;
        }

        @NotNull
        public final Config stub() {
            return new Config(SetsKt.setOf(Trigger.Companion.stub()), CollectionsKt.listOf(Paywall.Companion.stub()), 0, PostbackRequest.Companion.stub(), 3600000L, CollectionsKt.emptyList(), CollectionsKt.emptyList(), PreloadingDisabled.Companion.stub(), new LocalizationConfig(CollectionsKt.emptyList()), (String) null, (Set) null, (WebToAppConfig) null, "stub-build-id", a5.W0, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    static {
        int i10 = 2 | 1;
    }

    public /* synthetic */ Config(int i10, Set set, List list, int i11, PostbackRequest postbackRequest, long j10, List list2, List list3, PreloadingDisabled preloadingDisabled, LocalizationConfig localizationConfig, String str, Set set2, WebToAppConfig webToAppConfig, String str2, v2 v2Var) {
        if (4607 != (i10 & 4607)) {
            g2.b(i10, 4607, Config$$serializer.INSTANCE.getDescriptor());
        }
        this.triggers = set;
        this.paywalls = list;
        this.logLevel = i11;
        this.postback = postbackRequest;
        this.appSessionTimeout = j10;
        this.rawFeatureFlags = list2;
        this.products = list3;
        this.preloadingDisabled = preloadingDisabled;
        this.localizationConfig = localizationConfig;
        if ((i10 & 512) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str;
        }
        if ((i10 & 1024) == 0) {
            this.locales = SetsKt.emptySet();
        } else {
            this.locales = set2;
        }
        if ((i10 & 2048) == 0) {
            this.webToAppConfig = null;
        } else {
            this.webToAppConfig = webToAppConfig;
        }
        this.buildId = str2;
        List<LocalizationConfig.LocaleConfig> locales = this.localizationConfig.getLocales();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(locales, 10));
        Iterator<T> it = locales.iterator();
        while (it.hasNext()) {
            arrayList.add(((LocalizationConfig.LocaleConfig) it.next()).getLocale());
        }
        this.locales = CollectionsKt.toSet(arrayList);
    }

    @a0("appSessionTimeoutMs")
    public static /* synthetic */ void getAppSessionTimeout$annotations() {
    }

    @a0(k4.c.f305757m)
    public static /* synthetic */ void getBuildId$annotations() {
    }

    @a0("localization")
    public static /* synthetic */ void getLocalizationConfig$annotations() {
    }

    @a0("paywallResponses")
    public static /* synthetic */ void getPaywalls$annotations() {
    }

    @a0("postback")
    public static /* synthetic */ void getPostback$annotations() {
    }

    @a0("disablePreload")
    public static /* synthetic */ void getPreloadingDisabled$annotations() {
    }

    @a0("products")
    public static /* synthetic */ void getProducts$annotations() {
    }

    @a0("toggles")
    public static /* synthetic */ void getRawFeatureFlags$annotations() {
    }

    @a0("triggerOptions")
    public static /* synthetic */ void getTriggers$annotations() {
    }

    @a0("web2app_config")
    public static /* synthetic */ void getWebToAppConfig$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Config config, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], config.triggers);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], config.paywalls);
        eVar.encodeIntElement(serialDescriptor, 2, config.logLevel);
        eVar.encodeSerializableElement(serialDescriptor, 3, PostbackRequest$$serializer.INSTANCE, config.postback);
        eVar.encodeLongElement(serialDescriptor, 4, config.appSessionTimeout);
        eVar.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], config.rawFeatureFlags);
        eVar.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], config.products);
        eVar.encodeSerializableElement(serialDescriptor, 7, PreloadingDisabled$$serializer.INSTANCE, config.preloadingDisabled);
        eVar.encodeSerializableElement(serialDescriptor, 8, LocalizationConfig$$serializer.INSTANCE, config.localizationConfig);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 9) || config.requestId != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 9, b3.f315897a, config.requestId);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.areEqual(config.locales, SetsKt.emptySet())) {
            eVar.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], config.locales);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 11) || config.webToAppConfig != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 11, WebToAppConfig$$serializer.INSTANCE, config.webToAppConfig);
        }
        eVar.encodeStringElement(serialDescriptor, 12, config.buildId);
    }

    @NotNull
    public final Set<Trigger> component1() {
        return this.triggers;
    }

    @Nullable
    public final String component10() {
        return this.requestId;
    }

    @NotNull
    public final Set<String> component11() {
        return this.locales;
    }

    @Nullable
    public final WebToAppConfig component12() {
        return this.webToAppConfig;
    }

    @NotNull
    public final String component13() {
        return this.buildId;
    }

    @NotNull
    public final List<Paywall> component2() {
        return this.paywalls;
    }

    public final int component3() {
        return this.logLevel;
    }

    @NotNull
    public final PostbackRequest component4() {
        return this.postback;
    }

    public final long component5() {
        return this.appSessionTimeout;
    }

    @NotNull
    public final List<RawFeatureFlag> component6() {
        return this.rawFeatureFlags;
    }

    @NotNull
    public final List<ProductItem> component7() {
        return this.products;
    }

    @NotNull
    public final PreloadingDisabled component8() {
        return this.preloadingDisabled;
    }

    @NotNull
    public final LocalizationConfig component9() {
        return this.localizationConfig;
    }

    @NotNull
    public final Config copy(@NotNull Set<Trigger> triggers, @NotNull List<Paywall> paywalls, int i10, @NotNull PostbackRequest postback, long j10, @NotNull List<RawFeatureFlag> rawFeatureFlags, @NotNull List<ProductItem> products, @NotNull PreloadingDisabled preloadingDisabled, @NotNull LocalizationConfig localizationConfig, @Nullable String str, @NotNull Set<String> locales, @Nullable WebToAppConfig webToAppConfig, @NotNull String buildId) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        Intrinsics.checkNotNullParameter(paywalls, "paywalls");
        Intrinsics.checkNotNullParameter(postback, "postback");
        Intrinsics.checkNotNullParameter(rawFeatureFlags, "rawFeatureFlags");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(preloadingDisabled, "preloadingDisabled");
        Intrinsics.checkNotNullParameter(localizationConfig, "localizationConfig");
        Intrinsics.checkNotNullParameter(locales, "locales");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        return new Config(triggers, paywalls, i10, postback, j10, rawFeatureFlags, products, preloadingDisabled, localizationConfig, str, locales, webToAppConfig, buildId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return Intrinsics.areEqual(this.triggers, config.triggers) && Intrinsics.areEqual(this.paywalls, config.paywalls) && this.logLevel == config.logLevel && Intrinsics.areEqual(this.postback, config.postback) && this.appSessionTimeout == config.appSessionTimeout && Intrinsics.areEqual(this.rawFeatureFlags, config.rawFeatureFlags) && Intrinsics.areEqual(this.products, config.products) && Intrinsics.areEqual(this.preloadingDisabled, config.preloadingDisabled) && Intrinsics.areEqual(this.localizationConfig, config.localizationConfig) && Intrinsics.areEqual(this.requestId, config.requestId) && Intrinsics.areEqual(this.locales, config.locales) && Intrinsics.areEqual(this.webToAppConfig, config.webToAppConfig) && Intrinsics.areEqual(this.buildId, config.buildId);
    }

    @NotNull
    public final List<ComputedPropertyRequest> getAllComputedProperties() {
        Set<Trigger> set = this.triggers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            List<TriggerRule> rules = ((Trigger) it.next()).getRules();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = rules.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((TriggerRule) it2.next()).getComputedPropertyRequests());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public final long getAppSessionTimeout() {
        return this.appSessionTimeout;
    }

    @NotNull
    public final String getBuildId() {
        return this.buildId;
    }

    @NotNull
    public final FeatureFlags getFeatureFlags() {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Iterator<T> it = this.rawFeatureFlags.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next).getKey(), "enable_multiple_paywall_urls"));
        RawFeatureFlag rawFeatureFlag = (RawFeatureFlag) next;
        boolean enabled = rawFeatureFlag != null ? rawFeatureFlag.getEnabled() : false;
        Iterator<T> it2 = this.rawFeatureFlags.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next2).getKey(), "enable_config_refresh_v2"));
        RawFeatureFlag rawFeatureFlag2 = (RawFeatureFlag) next2;
        boolean enabled2 = rawFeatureFlag2 != null ? rawFeatureFlag2.getEnabled() : false;
        Iterator<T> it3 = this.rawFeatureFlags.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next3).getKey(), "enable_session_events"));
        RawFeatureFlag rawFeatureFlag3 = (RawFeatureFlag) next3;
        boolean enabled3 = rawFeatureFlag3 != null ? rawFeatureFlag3.getEnabled() : false;
        Iterator<T> it4 = this.rawFeatureFlags.iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next4).getKey(), "enable_postback"));
        RawFeatureFlag rawFeatureFlag4 = (RawFeatureFlag) next4;
        boolean enabled4 = rawFeatureFlag4 != null ? rawFeatureFlag4.getEnabled() : false;
        Iterator<T> it5 = this.rawFeatureFlags.iterator();
        do {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next5).getKey(), "enable_userid_seed"));
        RawFeatureFlag rawFeatureFlag5 = (RawFeatureFlag) next5;
        boolean enabled5 = rawFeatureFlag5 != null ? rawFeatureFlag5.getEnabled() : false;
        Iterator<T> it6 = this.rawFeatureFlags.iterator();
        do {
            if (!it6.hasNext()) {
                next6 = null;
                break;
            }
            next6 = it6.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next6).getKey(), "disable_verbose_events"));
        RawFeatureFlag rawFeatureFlag6 = (RawFeatureFlag) next6;
        boolean enabled6 = rawFeatureFlag6 != null ? rawFeatureFlag6.getEnabled() : false;
        Iterator<T> it7 = this.rawFeatureFlags.iterator();
        do {
            if (!it7.hasNext()) {
                next7 = null;
                break;
            }
            next7 = it7.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next7).getKey(), "enable_cel_logging"));
        RawFeatureFlag rawFeatureFlag7 = (RawFeatureFlag) next7;
        boolean enabled7 = rawFeatureFlag7 != null ? rawFeatureFlag7.getEnabled() : false;
        for (Object obj2 : this.rawFeatureFlags) {
            if (Intrinsics.areEqual(((RawFeatureFlag) obj2).getKey(), "web_2_app")) {
                obj = obj2;
                break;
            }
        }
        RawFeatureFlag rawFeatureFlag8 = (RawFeatureFlag) obj;
        return new FeatureFlags(enabled2, enabled3, enabled4, enabled5, enabled6, enabled, enabled7, rawFeatureFlag8 != null ? rawFeatureFlag8.getEnabled() : false);
    }

    @NotNull
    public final Set<String> getLocales() {
        return this.locales;
    }

    @NotNull
    public final LocalizationConfig getLocalizationConfig() {
        return this.localizationConfig;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final List<Paywall> getPaywalls() {
        return this.paywalls;
    }

    @NotNull
    public final PostbackRequest getPostback() {
        return this.postback;
    }

    @NotNull
    public final PreloadingDisabled getPreloadingDisabled() {
        return this.preloadingDisabled;
    }

    @NotNull
    public final List<ProductItem> getProducts() {
        return this.products;
    }

    @NotNull
    public final List<RawFeatureFlag> getRawFeatureFlags() {
        return this.rawFeatureFlags;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final Set<Trigger> getTriggers() {
        return this.triggers;
    }

    @Nullable
    public final WebToAppConfig getWebToAppConfig() {
        return this.webToAppConfig;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.triggers.hashCode() * 31) + this.paywalls.hashCode()) * 31) + Integer.hashCode(this.logLevel)) * 31) + this.postback.hashCode()) * 31) + Long.hashCode(this.appSessionTimeout)) * 31) + this.rawFeatureFlags.hashCode()) * 31) + this.products.hashCode()) * 31) + this.preloadingDisabled.hashCode()) * 31) + this.localizationConfig.hashCode()) * 31;
        String str = this.requestId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.locales.hashCode()) * 31;
        WebToAppConfig webToAppConfig = this.webToAppConfig;
        return ((iHashCode2 + (webToAppConfig != null ? webToAppConfig.hashCode() : 0)) * 31) + this.buildId.hashCode();
    }

    public final void setAppSessionTimeout(long j10) {
        this.appSessionTimeout = j10;
    }

    public final void setLocales(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.locales = set;
    }

    public final void setLocalizationConfig(@NotNull LocalizationConfig localizationConfig) {
        Intrinsics.checkNotNullParameter(localizationConfig, "<set-?>");
        this.localizationConfig = localizationConfig;
    }

    public final void setLogLevel(int i10) {
        this.logLevel = i10;
    }

    public final void setPaywalls(@NotNull List<Paywall> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.paywalls = list;
    }

    public final void setPostback(@NotNull PostbackRequest postbackRequest) {
        Intrinsics.checkNotNullParameter(postbackRequest, "<set-?>");
        this.postback = postbackRequest;
    }

    public final void setPreloadingDisabled(@NotNull PreloadingDisabled preloadingDisabled) {
        Intrinsics.checkNotNullParameter(preloadingDisabled, "<set-?>");
        this.preloadingDisabled = preloadingDisabled;
    }

    public final void setRawFeatureFlags(@NotNull List<RawFeatureFlag> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.rawFeatureFlags = list;
    }

    public final void setRequestId(@Nullable String str) {
        this.requestId = str;
    }

    public final void setTriggers(@NotNull Set<Trigger> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.triggers = set;
    }

    public final void setWebToAppConfig(@Nullable WebToAppConfig webToAppConfig) {
        this.webToAppConfig = webToAppConfig;
    }

    @NotNull
    public String toString() {
        return "Config(triggers=" + this.triggers + ", paywalls=" + this.paywalls + ", logLevel=" + this.logLevel + ", postback=" + this.postback + ", appSessionTimeout=" + this.appSessionTimeout + ", rawFeatureFlags=" + this.rawFeatureFlags + ", products=" + this.products + ", preloadingDisabled=" + this.preloadingDisabled + ", localizationConfig=" + this.localizationConfig + ", requestId=" + this.requestId + ", locales=" + this.locales + ", webToAppConfig=" + this.webToAppConfig + ", buildId=" + this.buildId + ")";
    }

    public Config(@NotNull Set<Trigger> triggers, @NotNull List<Paywall> paywalls, int i10, @NotNull PostbackRequest postback, long j10, @NotNull List<RawFeatureFlag> rawFeatureFlags, @NotNull List<ProductItem> products, @NotNull PreloadingDisabled preloadingDisabled, @NotNull LocalizationConfig localizationConfig, @Nullable String str, @NotNull Set<String> locales, @Nullable WebToAppConfig webToAppConfig, @NotNull String buildId) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        Intrinsics.checkNotNullParameter(paywalls, "paywalls");
        Intrinsics.checkNotNullParameter(postback, "postback");
        Intrinsics.checkNotNullParameter(rawFeatureFlags, "rawFeatureFlags");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(preloadingDisabled, "preloadingDisabled");
        Intrinsics.checkNotNullParameter(localizationConfig, "localizationConfig");
        Intrinsics.checkNotNullParameter(locales, "locales");
        Intrinsics.checkNotNullParameter(buildId, "buildId");
        this.triggers = triggers;
        this.paywalls = paywalls;
        this.logLevel = i10;
        this.postback = postback;
        this.appSessionTimeout = j10;
        this.rawFeatureFlags = rawFeatureFlags;
        this.products = products;
        this.preloadingDisabled = preloadingDisabled;
        this.localizationConfig = localizationConfig;
        this.requestId = str;
        this.locales = locales;
        this.webToAppConfig = webToAppConfig;
        this.buildId = buildId;
        List<LocalizationConfig.LocaleConfig> locales2 = localizationConfig.getLocales();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(locales2, 10));
        Iterator<T> it = locales2.iterator();
        while (it.hasNext()) {
            arrayList.add(((LocalizationConfig.LocaleConfig) it.next()).getLocale());
        }
        this.locales = CollectionsKt.toSet(arrayList);
    }

    public /* synthetic */ Config(Set set, List list, int i10, PostbackRequest postbackRequest, long j10, List list2, List list3, PreloadingDisabled preloadingDisabled, LocalizationConfig localizationConfig, String str, Set set2, WebToAppConfig webToAppConfig, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, list, i10, postbackRequest, j10, list2, list3, preloadingDisabled, localizationConfig, (i11 & 512) != 0 ? null : str, (i11 & 1024) != 0 ? SetsKt.emptySet() : set2, (i11 & 2048) != 0 ? null : webToAppConfig, str2);
    }
}
