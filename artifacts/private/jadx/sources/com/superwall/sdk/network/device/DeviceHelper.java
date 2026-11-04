package com.superwall.sdk.network.device;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.app.w;
import com.facebook.internal.z0;
import com.superwall.sdk.BuildConfig;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.DefaultClassifierDataFactory;
import com.superwall.sdk.analytics.DeviceClassifier;
import com.superwall.sdk.dependencies.ExperimentalPropertiesFactory;
import com.superwall.sdk.dependencies.IdentityInfoFactory;
import com.superwall.sdk.dependencies.IdentityManagerFactory;
import com.superwall.sdk.dependencies.LocaleIdentifierFactory;
import com.superwall.sdk.dependencies.OptionsFactory;
import com.superwall.sdk.dependencies.StoreTransactionFactory;
import com.superwall.sdk.identity.IdentityInfo;
import com.superwall.sdk.identity.IdentityManager;
import com.superwall.sdk.identity.PublicIdentityKt;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.models.enrichment.EnrichmentRequest;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.network.JsonFactory;
import com.superwall.sdk.network.NetworkError;
import com.superwall.sdk.network.SuperwallAPI;
import com.superwall.sdk.paywall.view.webview.templating.models.DeviceTemplate;
import com.superwall.sdk.storage.LastPaywallView;
import com.superwall.sdk.storage.LatestEnrichment;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.storage.TotalPaywallViews;
import com.superwall.sdk.storage.core_data.ConvertersKt;
import com.superwall.sdk.utilities.DateUtils;
import com.superwall.sdk.utilities.DateUtilsKt;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import io.sentry.k4;
import io.sentry.p9;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDeviceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceHelper.kt\ncom/superwall/sdk/network/device/DeviceHelper\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Either.kt\ncom/superwall/sdk/misc/EitherKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,642:1\n136#2,10:643\n136#2,2:653\n138#2,8:667\n1557#3:655\n1628#3,3:656\n1557#3:659\n1628#3,3:660\n1557#3:663\n1628#3,3:664\n1246#3,4:688\n1246#3,4:694\n1246#3,4:700\n122#4,4:675\n503#5,7:679\n462#5:686\n412#5:687\n462#5:692\n412#5:693\n462#5:698\n412#5:699\n*S KotlinDebug\n*F\n+ 1 DeviceHelper.kt\ncom/superwall/sdk/network/device/DeviceHelper\n*L\n301#1:643,10\n452#1:653,2\n452#1:667,8\n500#1:655\n500#1:656,3\n503#1:659\n503#1:660,3\n519#1:663\n519#1:664,3\n536#1:688,4\n576#1:694,4\n581#1:700,4\n527#1:675,4\n535#1:679,7\n536#1:686\n536#1:687\n576#1:692\n576#1:693\n581#1:698\n581#1:699\n*E\n"})
public final class DeviceHelper {

    @NotNull
    private final Locale _locale;
    private final PackageInfo appInfo;

    @NotNull
    private final Date appInstallDate;

    @NotNull
    private final DeviceClassifier classifier;

    @NotNull
    private final ConnectivityManager connectivityManager;

    @NotNull
    private final Context context;

    @NotNull
    private final Factory factory;

    @Nullable
    private InterfaceStyle interfaceStyleOverride;

    @NotNull
    private final Json json;

    @NotNull
    private final k0<Enrichment> lastEnrichment;

    @NotNull
    private final SuperwallAPI network;

    @NotNull
    private String platformWrapper;

    @NotNull
    private String platformWrapperVersion;

    @NotNull
    private final LocalStorage storage;

    public interface Factory extends IdentityInfoFactory, LocaleIdentifierFactory, JsonFactory, StoreTransactionFactory, IdentityManagerFactory, ExperimentalPropertiesFactory, OptionsFactory {

        public static final class DefaultImpls {
            @NotNull
            public static Json json(@NotNull Factory factory) {
                return JsonFactory.DefaultImpls.json(factory);
            }
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.device.DeviceHelper$getComputedDevicePropertiesSinceEvent$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.device.DeviceHelper", f = "DeviceHelper.kt", i = {0, 0, 0, 0}, l = {439}, m = "getComputedDevicePropertiesSinceEvent", n = {"this", w.I0, "output", "computedPropertyRequest"}, s = {"L$0", "L$1", "L$2", "L$4"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceHelper.this.getComputedDevicePropertiesSinceEvent(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.device.DeviceHelper$getDeviceAttributes$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.device.DeviceHelper", f = "DeviceHelper.kt", i = {0, 0, 0, 1}, l = {421, v.c.f44021v}, m = "getDeviceAttributes", n = {"this", "sinceEvent", "computedPropertyRequests", "dictionary"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C26701 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C26701(kotlin.coroutines.d<? super C26701> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceHelper.this.getDeviceAttributes(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.device.DeviceHelper$getEnrichment$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.device.DeviceHelper", f = "DeviceHelper.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 3}, l = {576, 581, 585, 586, 588}, m = "getEnrichment-8Mi8wO0", n = {"this", "maxRetry", k4.f305718l3, "this", "userAttributes", "maxRetry", k4.f305718l3, "this", "this"}, s = {"L$0", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$0"})
    static final class C26711 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26711(kotlin.coroutines.d<? super C26711> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceHelper.this.m65getEnrichment8Mi8wO0(0, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.device.DeviceHelper$getEnrichment$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.device.DeviceHelper$getEnrichment$2", f = "DeviceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<Enrichment, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = DeviceHelper.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Enrichment enrichment, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(enrichment, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            DeviceHelper.this.lastEnrichment.setValue((Enrichment) this.L$0);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.device.DeviceHelper$getEnrichment$3, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.device.DeviceHelper$getEnrichment$3", f = "DeviceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<Enrichment, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = DeviceHelper.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Enrichment enrichment, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(enrichment, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Enrichment enrichment = (Enrichment) this.L$0;
            DeviceHelper.this.getStorage().write(LatestEnrichment.INSTANCE, enrichment);
            PublicIdentityKt.setUserAttributes(Superwall.Companion.getInstance(), enrichment.getUser());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.device.DeviceHelper$getTemplateDevice$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.device.DeviceHelper", f = "DeviceHelper.kt", i = {0, 1, 1, 1}, l = {453, 512}, m = "getTemplateDevice", n = {"this", "this", "aliases", "capabilities"}, s = {"L$0", "L$0", "L$1", "L$3"})
    static final class C26721 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$17;
        Object L$18;
        Object L$19;
        Object L$2;
        Object L$20;
        Object L$21;
        Object L$22;
        Object L$23;
        Object L$24;
        Object L$25;
        Object L$26;
        Object L$27;
        Object L$28;
        Object L$29;
        Object L$3;
        Object L$30;
        Object L$31;
        Object L$32;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C26721(kotlin.coroutines.d<? super C26721> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceHelper.this.getTemplateDevice(this);
        }
    }

    public DeviceHelper(@NotNull Context context, @NotNull LocalStorage storage, @NotNull SuperwallAPI network, @NotNull Factory factory, @NotNull DeviceClassifier classifier) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.context = context;
        this.storage = storage;
        this.network = network;
        this.factory = factory;
        this.classifier = classifier;
        this.json = JsonKt.Json$default(null, new Function1() { // from class: com.superwall.sdk.network.device.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceHelper.json$lambda$1((JsonBuilder) obj);
            }
        }, 1, null);
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        this.appInfo = packageInfo;
        this.appInstallDate = new Date(packageInfo.firstInstallTime);
        this.lastEnrichment = b1.a(storage.read(LatestEnrichment.INSTANCE));
        this.platformWrapper = "";
        this.platformWrapperVersion = "";
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        this._locale = locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context _init_$lambda$0(Context context) {
        return context;
    }

    private final String getAppVersionPadded() {
        return DeviceHelperKt.asPadded(getAppVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:21:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getComputedDevicePropertiesSinceEvent(com.superwall.sdk.models.events.EventData r10, java.util.List<com.superwall.sdk.models.config.ComputedPropertyRequest> r11, kotlin.coroutines.d<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.network.device.DeviceHelper.getComputedDevicePropertiesSinceEvent(com.superwall.sdk.models.events.EventData, java.util.List, kotlin.coroutines.d):java.lang.Object");
    }

    private final int getDaysSinceInstall() {
        return (int) org.threeten.bp.e.l(org.threeten.bp.f.Y(this.appInstallDate.getTime()), org.threeten.bp.f.W()).o0();
    }

    private final Integer getDaysSinceLastPaywallView() {
        org.threeten.bp.f fVarY;
        Date date = (Date) this.storage.read(LastPaywallView.INSTANCE);
        if (date != null && (fVarY = org.threeten.bp.f.Y(date.getTime())) != null) {
            return Integer.valueOf((int) org.threeten.bp.e.l(fVarY, org.threeten.bp.f.W()).o0());
        }
        return null;
    }

    private final Enrichment getEnrichment() {
        return this.lastEnrichment.getValue();
    }

    private final SimpleDateFormat getLocalDateFormat() {
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getYyyy_MM_dd());
        simpleDateFormatDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormatDateFormat;
    }

    private final String getLocalDateString() {
        String str = getLocalDateFormat().format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final SimpleDateFormat getLocalDateTimeFormat() {
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getISO_SECONDS());
        simpleDateFormatDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormatDateFormat;
    }

    private final String getLocalDateTimeString() {
        String str = getLocalDateTimeFormat().format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final SimpleDateFormat getLocalTimeFormat() {
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getHH_mm_ss());
        simpleDateFormatDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormatDateFormat;
    }

    private final String getLocalTimeString() {
        String str = getLocalTimeFormat().format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final int getMinutesSinceInstall() {
        return (int) org.threeten.bp.e.l(org.threeten.bp.f.Y(this.appInstallDate.getTime()), org.threeten.bp.f.W()).u0();
    }

    private final Integer getMinutesSinceLastPaywallView() {
        org.threeten.bp.f fVarY;
        Date date = (Date) this.storage.read(LastPaywallView.INSTANCE);
        if (date == null || (fVarY = org.threeten.bp.f.Y(date.getTime())) == null) {
            return null;
        }
        return Integer.valueOf((int) org.threeten.bp.e.l(fVarY, org.threeten.bp.f.W()).u0());
    }

    private final String getRegionCode() {
        String country = this._locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }

    private final String getSdkVersionPadded() {
        return DeviceHelperKt.asPadded(getSdkVersion());
    }

    private final int getTotalPaywallViews() {
        Integer num = (Integer) this.storage.read(TotalPaywallViews.INSTANCE);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final SimpleDateFormat getUtcDateFormat() {
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getYyyy_MM_dd());
        simpleDateFormatDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormatDateFormat;
    }

    private final String getUtcDateString() {
        String str = getUtcDateFormat().format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final SimpleDateFormat getUtcDateTimeFormat() {
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getISO_SECONDS());
        simpleDateFormatDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormatDateFormat;
    }

    private final String getUtcDateTimeString() {
        String str = getUtcDateTimeFormat().format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final SimpleDateFormat getUtcTimeFormat() {
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getHH_mm_ss());
        simpleDateFormatDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormatDateFormat;
    }

    private final String getUtcTimeString() {
        String str = getUtcTimeFormat().format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final Currency get_currency() {
        try {
            return Currency.getInstance(this._locale);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$1(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setExplicitNulls(true);
        return Unit.f312394a;
    }

    public final int daysSince(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return (int) org.threeten.bp.e.l(org.threeten.bp.f.Y(date.getTime()), org.threeten.bp.f.W()).o0();
    }

    @NotNull
    public final String getAppBuildString() {
        return String.valueOf(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionCode);
    }

    @NotNull
    public final String getAppInstalledAtString() {
        Either failure;
        try {
            failure = new Either.Success(new Date(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).firstInstallTime));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getSIMPLE());
        Date date = (Date) failure.getSuccess();
        if (date == null) {
            date = new Date();
        }
        String str = simpleDateFormatDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getAppVersion() {
        try {
            String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
            return str == null ? com.facebook.internal.a.f99697t : str;
        } catch (Throwable th2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.device, "DeviceHelper: Failed to load version info - " + th2, null, null, 24, null);
            return "";
        }
    }

    @NotNull
    public final String getBuildTime() {
        return BuildConfig.BUILD_TIME;
    }

    @NotNull
    public final String getBundleId() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    @NotNull
    public final String getCurrencyCode() {
        String currencyCode;
        Currency currency = get_currency();
        if (currency != null && (currencyCode = currency.getCurrencyCode()) != null) {
            return currencyCode;
        }
        return "";
    }

    @NotNull
    public final String getCurrencySymbol() {
        String symbol;
        Currency currency = get_currency();
        if (currency != null && (symbol = currency.getSymbol()) != null) {
            return symbol;
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object getDeviceAttributes(@Nullable EventData eventData, @NotNull List<ComputedPropertyRequest> list, @NotNull kotlin.coroutines.d<? super Map<String, ? extends Object>> dVar) {
        C26701 c26701;
        Map map;
        if (dVar instanceof C26701) {
            c26701 = (C26701) dVar;
            int i10 = c26701.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26701.label = i10 - Integer.MIN_VALUE;
            } else {
                c26701 = new C26701(dVar);
            }
        } else {
            c26701 = new C26701(dVar);
        }
        Object templateDevice = c26701.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26701.label;
        if (i11 == 0) {
            ResultKt.m(templateDevice);
            c26701.L$0 = this;
            c26701.L$1 = eventData;
            c26701.L$2 = list;
            c26701.label = 1;
            templateDevice = getTemplateDevice(c26701);
            if (templateDevice != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            list = (List) c26701.L$2;
            eventData = (EventData) c26701.L$1;
            this = (DeviceHelper) c26701.L$0;
            ResultKt.m(templateDevice);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c26701.L$0;
            ResultKt.m(templateDevice);
        }
        return MapsKt.plus(map, (Map) templateDevice);
        Map map2 = (Map) templateDevice;
        c26701.L$0 = map2;
        c26701.L$1 = null;
        c26701.L$2 = null;
        c26701.label = 2;
        Object computedDevicePropertiesSinceEvent = this.getComputedDevicePropertiesSinceEvent(eventData, list, c26701);
        if (computedDevicePropertiesSinceEvent != objL) {
            templateDevice = computedDevicePropertiesSinceEvent;
            map = map2;
            return MapsKt.plus(map, (Map) templateDevice);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0114 A[LOOP:0: B:37:0x010d->B:39:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0143 A[PHI: r11 r15
      0x0143: PHI (r11v3 'this' com.superwall.sdk.network.device.DeviceHelper) = 
      (r11v2 'this' com.superwall.sdk.network.device.DeviceHelper)
      (r11v11 'this' com.superwall.sdk.network.device.DeviceHelper)
     binds: [B:41:0x0140, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r15v19 java.lang.Object) = (r15v14 java.lang.Object), (r15v1 java.lang.Object) binds: [B:41:0x0140, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    /* JADX INFO: renamed from: getEnrichment-8Mi8wO0, reason: not valid java name */
    public final Object m65getEnrichment8Mi8wO0(int i10, long j10, @NotNull kotlin.coroutines.d<? super Either<Enrichment, NetworkError>> dVar) {
        C26711 c26711;
        int i11;
        long j11;
        Map map;
        LinkedHashMap linkedHashMap;
        Object objThen;
        if (dVar instanceof C26711) {
            c26711 = (C26711) dVar;
            int i12 = c26711.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c26711.label = i12 - Integer.MIN_VALUE;
            } else {
                c26711 = new C26711(dVar);
            }
        } else {
            c26711 = new C26711(dVar);
        }
        C26711 c26712 = c26711;
        Object objMakeIdentityManager = c26712.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = c26712.label;
        if (i13 == 0) {
            ResultKt.m(objMakeIdentityManager);
            Factory factory = this.factory;
            c26712.L$0 = this;
            c26712.I$0 = i10;
            c26712.J$0 = j10;
            c26712.label = 1;
            objMakeIdentityManager = factory.makeIdentityManager(c26712);
            if (objMakeIdentityManager != objL) {
            }
            return objL;
        }
        if (i13 == 1) {
            j10 = c26712.J$0;
            i10 = c26712.I$0;
            this = (DeviceHelper) c26712.L$0;
            ResultKt.m(objMakeIdentityManager);
        } else {
            if (i13 == 2) {
                long j12 = c26712.J$0;
                int i14 = c26712.I$0;
                map = (Map) c26712.L$1;
                DeviceHelper deviceHelper = (DeviceHelper) c26712.L$0;
                ResultKt.m(objMakeIdentityManager);
                j11 = j12;
                i11 = i14;
                this = deviceHelper;
                Map map2 = (Map) objMakeIdentityManager;
                linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ConvertersKt.convertToJsonElement(entry.getValue()));
                }
                SuperwallAPI superwallAPI = this.network;
                EnrichmentRequest enrichmentRequest = new EnrichmentRequest(map, linkedHashMap);
                c26712.L$0 = this;
                c26712.L$1 = null;
                c26712.label = 3;
                objMakeIdentityManager = superwallAPI.mo60getEnrichmentexY8QGI(enrichmentRequest, i11, j11, c26712);
                if (objMakeIdentityManager != objL) {
                    AnonymousClass2 anonymousClass2 = this.new AnonymousClass2(null);
                    c26712.L$0 = this;
                    c26712.label = 4;
                    objMakeIdentityManager = EitherKt.then((Either) objMakeIdentityManager, anonymousClass2, c26712);
                    if (objMakeIdentityManager != objL) {
                    }
                }
                return objL;
            }
            if (i13 == 3) {
                this = (DeviceHelper) c26712.L$0;
                ResultKt.m(objMakeIdentityManager);
                AnonymousClass2 anonymousClass3 = this.new AnonymousClass2(null);
                c26712.L$0 = this;
                c26712.label = 4;
                objMakeIdentityManager = EitherKt.then((Either) objMakeIdentityManager, anonymousClass3, c26712);
                if (objMakeIdentityManager != objL) {
                }
                return objL;
            }
            if (i13 != 4) {
                if (i13 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objMakeIdentityManager);
                return objMakeIdentityManager;
            }
            this = (DeviceHelper) c26712.L$0;
            ResultKt.m(objMakeIdentityManager);
        }
        AnonymousClass3 anonymousClass4 = this.new AnonymousClass3(null);
        c26712.L$0 = null;
        c26712.label = 5;
        objThen = EitherKt.then((Either) objMakeIdentityManager, anonymousClass4, c26712);
        if (objThen != objL) {
            return objThen;
        }
        return objL;
        Map<String, Object> userAttributes = ((IdentityManager) objMakeIdentityManager).getUserAttributes();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(userAttributes.size()));
        Iterator<T> it = userAttributes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap2.put(entry2.getKey(), ConvertersKt.convertToJsonElement(entry2.getValue()));
        }
        c26712.L$0 = this;
        c26712.L$1 = linkedHashMap2;
        c26712.I$0 = i10;
        c26712.J$0 = j10;
        c26712.label = 2;
        objMakeIdentityManager = this.getTemplateDevice(c26712);
        if (objMakeIdentityManager != objL) {
            i11 = i10;
            j11 = j10;
            map = linkedHashMap2;
            Map map3 = (Map) objMakeIdentityManager;
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map3.size()));
            while (r13.hasNext()) {
                linkedHashMap.put(entry.getKey(), ConvertersKt.convertToJsonElement(entry.getValue()));
            }
            SuperwallAPI superwallAPI2 = this.network;
            EnrichmentRequest enrichmentRequest2 = new EnrichmentRequest(map, linkedHashMap);
            c26712.L$0 = this;
            c26712.L$1 = null;
            c26712.label = 3;
            objMakeIdentityManager = superwallAPI2.mo60getEnrichmentexY8QGI(enrichmentRequest2, i11, j11, c26712);
            if (objMakeIdentityManager != objL) {
                AnonymousClass2 anonymousClass5 = this.new AnonymousClass2(null);
                c26712.L$0 = this;
                c26712.label = 4;
                objMakeIdentityManager = EitherKt.then((Either) objMakeIdentityManager, anonymousClass5, c26712);
                if (objMakeIdentityManager != objL) {
                    AnonymousClass3 anonymousClass6 = this.new AnonymousClass3(null);
                    c26712.L$0 = null;
                    c26712.label = 5;
                    objThen = EitherKt.then((Either) objMakeIdentityManager, anonymousClass6, c26712);
                    if (objThen != objL) {
                        return objThen;
                    }
                }
            }
        }
        return objL;
    }

    @NotNull
    public final Factory getFactory() {
        return this.factory;
    }

    @NotNull
    public final String getGitSha() {
        return BuildConfig.GIT_SHA;
    }

    @NotNull
    public final String getInterfaceStyle() {
        String rawValue;
        InterfaceStyle interfaceStyle = this.interfaceStyleOverride;
        if (interfaceStyle != null && (rawValue = interfaceStyle.getRawValue()) != null) {
            return rawValue;
        }
        int i10 = this.context.getResources().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            return i10 != 32 ? "Unspecified" : "Dark";
        }
        return "Light";
    }

    @Nullable
    public final InterfaceStyle getInterfaceStyleOverride() {
        return this.interfaceStyleOverride;
    }

    @NotNull
    public final String getLanguageCode() {
        String language = this._locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @NotNull
    public final String getLocale() {
        String strMakeLocaleIdentifier = this.factory.makeLocaleIdentifier();
        if (strMakeLocaleIdentifier == null) {
            strMakeLocaleIdentifier = Locale.getDefault().toString();
            Intrinsics.checkNotNullExpressionValue(strMakeLocaleIdentifier, "toString(...)");
        }
        return strMakeLocaleIdentifier;
    }

    @NotNull
    public final String getModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @NotNull
    public final SuperwallAPI getNetwork() {
        return this.network;
    }

    @NotNull
    public final String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPlatformWrapper() {
        return this.platformWrapper;
    }

    @NotNull
    public final String getPlatformWrapperVersion() {
        return this.platformWrapperVersion;
    }

    @e.a({"MissingPermission"})
    @NotNull
    public final String getRadioType() {
        if (androidx.core.content.d.a(this.context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return "";
        }
        ConnectivityManager connectivityManager = this.connectivityManager;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null || !networkCapabilities.hasTransport(0)) {
            return (networkCapabilities == null || !networkCapabilities.hasTransport(1)) ? "" : "Wifi";
        }
        return "Cellular";
    }

    @NotNull
    public final String getSdkVersion() {
        return BuildConfig.SDK_VERSION;
    }

    @NotNull
    public final String getSecondsFromGMT() {
        return String.valueOf(TimeZone.getDefault().getRawOffset() / 1000);
    }

    @NotNull
    public final LocalStorage getStorage() {
        return this.storage;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:104:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:107:0x060c  */
    /* JADX WARN: Code duplicated, block: B:108:0x060f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0623  */
    /* JADX WARN: Code duplicated, block: B:59:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x04cf A[Catch: all -> 0x0184, LOOP:0: B:63:0x04c9->B:65:0x04cf, LOOP_END, TryCatch #0 {all -> 0x0184, blocks: (B:57:0x048e, B:62:0x04b6, B:63:0x04c9, B:65:0x04cf, B:66:0x04dd, B:20:0x017e, B:28:0x019d, B:31:0x01ce, B:32:0x02b7, B:34:0x02bd, B:35:0x02cb, B:36:0x02ec, B:38:0x02f2, B:39:0x0322, B:41:0x0334, B:53:0x0352, B:44:0x033b, B:47:0x0342, B:50:0x034b, B:51:0x0350, B:25:0x018e), top: B:112:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0536  */
    /* JADX WARN: Code duplicated, block: B:77:0x0543  */
    /* JADX WARN: Code duplicated, block: B:79:0x0547  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x055d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0571  */
    /* JADX WARN: Code duplicated, block: B:99:0x05e3  */
    @Nullable
    public final Object getTemplateDevice(@NotNull kotlin.coroutines.d<? super Map<String, ? extends Object>> dVar) {
        C26721 c26721;
        Either failure;
        Object objM785constructorimpl;
        Object objM785constructorimpl2;
        boolean zH;
        Object objPlus;
        Object objM785constructorimpl3;
        Throwable thD;
        Enrichment enrichment;
        Map mapEmptyMap;
        Map mapPlus;
        JsonObject device;
        Object objMakeIdentityInfo;
        List listListOf;
        String str;
        Object objActiveProductIds;
        String str2;
        String str3;
        List list;
        int i10;
        Integer num;
        Integer num2;
        int i11;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        List list2;
        String str13;
        String str14;
        String str15;
        String str16;
        int i12;
        String str17;
        String str18;
        boolean z10;
        String str19;
        String str20;
        String str21;
        int i13;
        String str22;
        List list3;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        ArrayList arrayList;
        Iterator it;
        DeviceHelper deviceHelper = this;
        if (dVar instanceof C26721) {
            c26721 = (C26721) dVar;
            int i14 = c26721.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c26721.label = i14 - Integer.MIN_VALUE;
            } else {
                c26721 = deviceHelper.new C26721(dVar);
            }
        } else {
            c26721 = deviceHelper.new C26721(dVar);
        }
        Object obj = c26721.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i15 = c26721.label;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    deviceHelper = (DeviceHelper) c26721.L$0;
                    ResultKt.m(obj);
                    objMakeIdentityInfo = obj;
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = c26721.I$3;
                    int i17 = c26721.I$2;
                    int i18 = c26721.I$1;
                    boolean z11 = c26721.Z$0;
                    int i19 = c26721.I$0;
                    List list4 = (List) c26721.L$32;
                    String str29 = (String) c26721.L$31;
                    List list5 = (List) c26721.L$30;
                    String str30 = (String) c26721.L$29;
                    String str31 = (String) c26721.L$28;
                    String str32 = (String) c26721.L$27;
                    String str33 = (String) c26721.L$26;
                    String str34 = (String) c26721.L$25;
                    String str35 = (String) c26721.L$24;
                    String str36 = (String) c26721.L$23;
                    Integer num3 = (Integer) c26721.L$22;
                    Integer num4 = (Integer) c26721.L$21;
                    String str37 = (String) c26721.L$20;
                    String str38 = (String) c26721.L$19;
                    String str39 = (String) c26721.L$18;
                    String str40 = (String) c26721.L$17;
                    String str41 = (String) c26721.L$16;
                    String str42 = (String) c26721.L$15;
                    String str43 = (String) c26721.L$14;
                    String str44 = (String) c26721.L$13;
                    String str45 = (String) c26721.L$12;
                    str15 = (String) c26721.L$11;
                    String str46 = (String) c26721.L$10;
                    String str47 = (String) c26721.L$9;
                    String str48 = (String) c26721.L$8;
                    String str49 = (String) c26721.L$7;
                    String str50 = (String) c26721.L$6;
                    String str51 = (String) c26721.L$5;
                    String str52 = (String) c26721.L$4;
                    List list6 = (List) c26721.L$3;
                    String str53 = (String) c26721.L$2;
                    List list7 = (List) c26721.L$1;
                    DeviceHelper deviceHelper2 = (DeviceHelper) c26721.L$0;
                    try {
                        ResultKt.m(obj);
                        str16 = str42;
                        str25 = str49;
                        str13 = str43;
                        str26 = str48;
                        str9 = str44;
                        str27 = str47;
                        str12 = str45;
                        str14 = str46;
                        str4 = str36;
                        i11 = i16;
                        deviceHelper = deviceHelper2;
                        i10 = i17;
                        i13 = i18;
                        str6 = str34;
                        str5 = str35;
                        list2 = list4;
                        str2 = str29;
                        list = list5;
                        str11 = str30;
                        str10 = str31;
                        str8 = str32;
                        str7 = str33;
                        num2 = num3;
                        num = num4;
                        str21 = str37;
                        str20 = str38;
                        str22 = str51;
                        listListOf = list6;
                        str3 = str53;
                        list3 = list7;
                        z10 = z11;
                        i12 = i19;
                        objActiveProductIds = obj;
                        str19 = str39;
                        str23 = str52;
                        str18 = str40;
                        str24 = str50;
                        str17 = str41;
                    } catch (Throwable th2) {
                        th = th2;
                        deviceHelper = deviceHelper2;
                        if (ErrorTrackingKt.shouldLog(th)) {
                            Superwall.Companion companion = Superwall.Companion;
                            if (companion.getInitialized()) {
                                ErrorTrackingKt.trackError(companion.getInstance(), th);
                            }
                        }
                        failure = new Either.Failure(th);
                    }
                }
                List list8 = (List) objActiveProductIds;
                boolean zIsFirstAppOpen = deviceHelper.isFirstAppOpen();
                String sdkVersion = deviceHelper.getSdkVersion();
                String sdkVersionPadded = deviceHelper.getSdkVersionPadded();
                String appBuildString = deviceHelper.getAppBuildString();
                int i20 = Integer.parseInt(deviceHelper.getAppBuildString());
                if (deviceHelper.interfaceStyleOverride == null) {
                    str28 = "automatic";
                } else {
                    str28 = p9.f306037s;
                }
                String str54 = str28;
                List list9 = listListOf;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
                it = list9.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Capability) it.next()).getName());
                }
                failure = new Either.Success(new DeviceTemplate(str3, "Android", str22, list3, str23, str24, deviceHelper.getAppVersionPadded(), str25, str26, str27, str14, str15, str12, str9, str13, str16, str17, i12, str18, str19, z10, str20, str21, false, i13, i10, num, num2, i11, str4, str5, str6, str7, str8, str10, str11, list2, list, str2, list8, zIsFirstAppOpen, sdkVersion, sdkVersionPadded, appBuildString, kotlin.coroutines.jvm.internal.b.f(i20), str54, arrayList, CapabilityKt.toJson(listListOf, deviceHelper.factory.json()), deviceHelper.platformWrapper, deviceHelper.platformWrapperVersion, deviceHelper.classifier.deviceTier().getRaw()));
                if (failure instanceof Either.Success) {
                    Result.a aVar = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(((Either.Success) failure).getValue());
                } else {
                    if (failure instanceof Either.Failure) {
                        throw new kotlin.k0();
                    }
                    Result.a aVar2 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
                }
                if (Result.h(objM785constructorimpl)) {
                    Result.a aVar3 = Result.Companion;
                    objM785constructorimpl = ((DeviceTemplate) objM785constructorimpl).toDictionary(deviceHelper.json);
                }
                objM785constructorimpl2 = Result.m785constructorimpl(objM785constructorimpl);
                zH = Result.h(objM785constructorimpl2);
                objPlus = objM785constructorimpl2;
                if (zH) {
                    Result.a aVar4 = Result.Companion;
                    Map map = (Map) objM785constructorimpl2;
                    enrichment = deviceHelper.getEnrichment();
                    if (enrichment != null || (device = enrichment.getDevice()) == null) {
                        mapEmptyMap = null;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, JsonElement> entry : device.entrySet()) {
                            if (entry.getValue() != null) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        mapEmptyMap = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            mapEmptyMap.put(entry2.getKey(), ConvertersKt.convertFromJsonElement((JsonElement) entry2.getValue()));
                        }
                    }
                    if (mapEmptyMap == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    mapPlus = MapsKt.plus(mapEmptyMap, map);
                    objPlus = mapPlus;
                    if (deviceHelper.factory.makeSuperwallOptions().getEnableExperimentalDeviceVariables()) {
                        objPlus = MapsKt.plus(mapPlus, deviceHelper.latestExperimentalDeviceProperties());
                    }
                }
                objM785constructorimpl3 = Result.m785constructorimpl(objPlus);
                thD = Result.d(objM785constructorimpl3);
                if (thD == null) {
                    return (Map) objM785constructorimpl3;
                }
                Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.device, "Failed to get device template", null, thD, 8, null);
                return MapsKt.emptyMap();
            }
            ResultKt.m(obj);
            Factory factory = deviceHelper.factory;
            c26721.L$0 = deviceHelper;
            c26721.label = 1;
            objMakeIdentityInfo = factory.makeIdentityInfo(c26721);
            if (objMakeIdentityInfo == objL) {
                return objL;
            }
            IdentityInfo identityInfo = (IdentityInfo) objMakeIdentityInfo;
            List listListOf2 = CollectionsKt.listOf(identityInfo.getAliasId());
            listListOf = CollectionsKt.listOf((Object[]) new Capability[]{new Capability.PaywallEventReceiver(), Capability.MultiplePaywallUrls.INSTANCE, Capability.ConfigCaching.INSTANCE});
            String apiKey = deviceHelper.storage.getApiKey();
            String appUserId = identityInfo.getAppUserId();
            if (appUserId == null) {
                appUserId = "";
            }
            String vendorId = deviceHelper.getVendorId();
            String appVersion = deviceHelper.getAppVersion();
            String osVersion = deviceHelper.getOsVersion();
            String model = deviceHelper.getModel();
            String locale = deviceHelper.getLocale();
            String locale2 = deviceHelper.getLocale();
            String languageCode = deviceHelper.getLanguageCode();
            String languageCode2 = deviceHelper.getLanguageCode();
            String regionCode = deviceHelper.getRegionCode();
            String regionCode2 = deviceHelper.getRegionCode();
            String currencyCode = deviceHelper.getCurrencyCode();
            String currencySymbol = deviceHelper.getCurrencySymbol();
            int rawOffset = TimeZone.getDefault().getRawOffset() / 1000;
            String radioType = deviceHelper.getRadioType();
            String interfaceStyle = deviceHelper.getInterfaceStyle();
            boolean z12 = Boolean.parseBoolean(deviceHelper.isLowPowerModeEnabled());
            String bundleId = deviceHelper.getBundleId();
            String appInstalledAtString = deviceHelper.getAppInstalledAtString();
            int daysSinceInstall = deviceHelper.getDaysSinceInstall();
            int minutesSinceInstall = deviceHelper.getMinutesSinceInstall();
            Integer daysSinceLastPaywallView = deviceHelper.getDaysSinceLastPaywallView();
            Integer minutesSinceLastPaywallView = deviceHelper.getMinutesSinceLastPaywallView();
            int totalPaywallViews = deviceHelper.getTotalPaywallViews();
            String utcDateString = deviceHelper.getUtcDateString();
            String localDateString = deviceHelper.getLocalDateString();
            String utcTimeString = deviceHelper.getUtcTimeString();
            String localTimeString = deviceHelper.getLocalTimeString();
            String utcDateTimeString = deviceHelper.getUtcDateTimeString();
            String localDateTimeString = deviceHelper.getLocalDateTimeString();
            String strValueOf = String.valueOf(deviceHelper.isSandbox());
            Set<Entitlement> active = Superwall.Companion.getInstance().getEntitlements().getActive();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(active, 10));
            Iterator<T> it2 = active.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Entitlement) it2.next()).getId());
            }
            Set<Entitlement> active2 = Superwall.Companion.getInstance().getEntitlements().getActive();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(active2, 10));
            for (Iterator it3 = active2.iterator(); it3.hasNext(); it3 = it3) {
                Entitlement entitlement = (Entitlement) it3.next();
                arrayList3.add(MapsKt.mapOf(TuplesKt.to("identifier", entitlement.getId()), TuplesKt.to("type", entitlement.getType().getRaw())));
            }
            SubscriptionStatus value = Superwall.Companion.getInstance().getSubscriptionStatus().getValue();
            if (value == null) {
                str = null;
            } else if (value instanceof SubscriptionStatus.Active) {
                str = "ACTIVE";
            } else if (value instanceof SubscriptionStatus.Inactive) {
                str = "INACTIVE";
            } else {
                if (!(value instanceof SubscriptionStatus.Unknown)) {
                    throw new kotlin.k0();
                }
                str = "UNKNOWN";
            }
            Factory factory2 = deviceHelper.factory;
            c26721.L$0 = deviceHelper;
            c26721.L$1 = listListOf2;
            c26721.L$2 = apiKey;
            c26721.L$3 = listListOf;
            c26721.L$4 = vendorId;
            c26721.L$5 = appUserId;
            c26721.L$6 = appVersion;
            c26721.L$7 = osVersion;
            c26721.L$8 = model;
            c26721.L$9 = locale;
            c26721.L$10 = locale2;
            c26721.L$11 = languageCode;
            String str55 = appUserId;
            c26721.L$12 = languageCode2;
            c26721.L$13 = regionCode;
            c26721.L$14 = regionCode2;
            c26721.L$15 = currencyCode;
            c26721.L$16 = currencySymbol;
            c26721.L$17 = radioType;
            c26721.L$18 = interfaceStyle;
            c26721.L$19 = bundleId;
            c26721.L$20 = appInstalledAtString;
            c26721.L$21 = daysSinceLastPaywallView;
            c26721.L$22 = minutesSinceLastPaywallView;
            c26721.L$23 = utcDateString;
            c26721.L$24 = localDateString;
            c26721.L$25 = utcTimeString;
            c26721.L$26 = localTimeString;
            c26721.L$27 = utcDateTimeString;
            c26721.L$28 = localDateTimeString;
            c26721.L$29 = strValueOf;
            c26721.L$30 = arrayList3;
            c26721.L$31 = str;
            c26721.L$32 = arrayList2;
            c26721.I$0 = rawOffset;
            c26721.Z$0 = z12;
            c26721.I$1 = daysSinceInstall;
            c26721.I$2 = minutesSinceInstall;
            c26721.I$3 = totalPaywallViews;
            c26721.label = 2;
            objActiveProductIds = factory2.activeProductIds(c26721);
            if (objActiveProductIds == objL) {
                return objL;
            }
            str2 = str;
            str3 = apiKey;
            list = arrayList3;
            i10 = minutesSinceInstall;
            num = daysSinceLastPaywallView;
            num2 = minutesSinceLastPaywallView;
            i11 = totalPaywallViews;
            str4 = utcDateString;
            str5 = localDateString;
            str6 = utcTimeString;
            str7 = localTimeString;
            str8 = utcDateTimeString;
            str9 = regionCode;
            str10 = localDateTimeString;
            str11 = strValueOf;
            str12 = languageCode2;
            list2 = arrayList2;
            str13 = regionCode2;
            str14 = locale2;
            str15 = languageCode;
            str16 = currencyCode;
            i12 = rawOffset;
            str17 = currencySymbol;
            str18 = radioType;
            z10 = z12;
            str19 = interfaceStyle;
            str20 = bundleId;
            str21 = appInstalledAtString;
            i13 = daysSinceInstall;
            str22 = str55;
            list3 = listListOf2;
            str23 = vendorId;
            str24 = appVersion;
            str25 = osVersion;
            str26 = model;
            str27 = locale;
            List list10 = (List) objActiveProductIds;
            boolean zIsFirstAppOpen2 = deviceHelper.isFirstAppOpen();
            String sdkVersion2 = deviceHelper.getSdkVersion();
            String sdkVersionPadded2 = deviceHelper.getSdkVersionPadded();
            String appBuildString2 = deviceHelper.getAppBuildString();
            int i21 = Integer.parseInt(deviceHelper.getAppBuildString());
            if (deviceHelper.interfaceStyleOverride == null) {
                str28 = "automatic";
            } else {
                str28 = p9.f306037s;
            }
            String str56 = str28;
            List list11 = listListOf;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11, 10));
            it = list11.iterator();
            while (it.hasNext()) {
                arrayList.add(((Capability) it.next()).getName());
            }
            failure = new Either.Success(new DeviceTemplate(str3, "Android", str22, list3, str23, str24, deviceHelper.getAppVersionPadded(), str25, str26, str27, str14, str15, str12, str9, str13, str16, str17, i12, str18, str19, z10, str20, str21, false, i13, i10, num, num2, i11, str4, str5, str6, str7, str8, str10, str11, list2, list, str2, list10, zIsFirstAppOpen2, sdkVersion2, sdkVersionPadded2, appBuildString2, kotlin.coroutines.jvm.internal.b.f(i21), str56, arrayList, CapabilityKt.toJson(listListOf, deviceHelper.factory.json()), deviceHelper.platformWrapper, deviceHelper.platformWrapperVersion, deviceHelper.classifier.deviceTier().getRaw()));
            if (failure instanceof Either.Success) {
                Result.a aVar5 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(((Either.Success) failure).getValue());
            } else {
                if (failure instanceof Either.Failure) {
                    throw new kotlin.k0();
                }
                Result.a aVar6 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
            }
            if (Result.h(objM785constructorimpl)) {
                Result.a aVar7 = Result.Companion;
                objM785constructorimpl = ((DeviceTemplate) objM785constructorimpl).toDictionary(deviceHelper.json);
            }
            objM785constructorimpl2 = Result.m785constructorimpl(objM785constructorimpl);
            zH = Result.h(objM785constructorimpl2);
            objPlus = objM785constructorimpl2;
            if (zH) {
                Result.a aVar8 = Result.Companion;
                Map map2 = (Map) objM785constructorimpl2;
                enrichment = deviceHelper.getEnrichment();
                if (enrichment != null) {
                    mapEmptyMap = null;
                } else {
                    mapEmptyMap = null;
                }
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                mapPlus = MapsKt.plus(mapEmptyMap, map2);
                objPlus = mapPlus;
                if (deviceHelper.factory.makeSuperwallOptions().getEnableExperimentalDeviceVariables()) {
                    objPlus = MapsKt.plus(mapPlus, deviceHelper.latestExperimentalDeviceProperties());
                }
            }
            objM785constructorimpl3 = Result.m785constructorimpl(objPlus);
            thD = Result.d(objM785constructorimpl3);
            if (thD == null) {
                return (Map) objM785constructorimpl3;
            }
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.device, "Failed to get device template", null, thD, 8, null);
            return MapsKt.emptyMap();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @NotNull
    public final String getUrlScheme() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    @NotNull
    public final String getVendorId() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final int hoursSince(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return (int) org.threeten.bp.e.l(org.threeten.bp.f.Y(date.getTime()), org.threeten.bp.f.W()).q0();
    }

    public final boolean isEmulator() {
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        int i10 = 4 & 0;
        if (StringsKt.V2(DEVICE, "generic", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        return StringsKt.V2(DEVICE, "emulator", false, 2, null);
    }

    public final boolean isFirstAppOpen() {
        return !this.storage.getDidTrackFirstSession();
    }

    @NotNull
    public final String isLowPowerModeEnabled() {
        Object systemService = this.context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? z0.P : "false";
    }

    public final boolean isSandbox() {
        return (this.context.getApplicationInfo().flags & 2) != 0;
    }

    @NotNull
    public final Map<String, Object> latestExperimentalDeviceProperties() {
        return this.factory.experimentalProperties();
    }

    public final int minutesSince(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return (int) org.threeten.bp.e.l(org.threeten.bp.f.Y(date.getTime()), org.threeten.bp.f.W()).u0();
    }

    public final int monthsSince(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return ((int) org.threeten.bp.e.l(org.threeten.bp.f.Y(date.getTime()), org.threeten.bp.f.W()).o0()) / 30;
    }

    public final void setEnrichment$superwall_release(@NotNull Enrichment enrichment) {
        Intrinsics.checkNotNullParameter(enrichment, "enrichment");
        this.lastEnrichment.setValue(enrichment);
    }

    public final void setInterfaceStyleOverride(@Nullable InterfaceStyle interfaceStyle) {
        this.interfaceStyleOverride = interfaceStyle;
    }

    public final void setPlatformWrapper(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platformWrapper = str;
    }

    public final void setPlatformWrapperVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platformWrapperVersion = str;
    }

    public /* synthetic */ DeviceHelper(final Context context, LocalStorage localStorage, SuperwallAPI superwallAPI, Factory factory, DeviceClassifier deviceClassifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, localStorage, superwallAPI, factory, (i10 & 16) != 0 ? new DeviceClassifier(new DefaultClassifierDataFactory(new Function0() { // from class: com.superwall.sdk.network.device.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceHelper._init_$lambda$0(context);
            }
        })) : deviceClassifier);
    }
}
