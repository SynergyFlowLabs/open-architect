package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.l1;
import androidx.annotation.w0;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFetchAdvertisingIdTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n39#2:397\n1#3:398\n*S KotlinDebug\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n*L\n202#1:397\n*E\n"})
public final class AFe1eSDK extends AFe1sSDK<AFh1oSDK> {

    @NotNull
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);

    @NotNull
    private final AFc1iSDK areAllFieldsValid;

    @NotNull
    private final AFh1oSDK component1;

    @NotNull
    private final AFc1kSDK component2;

    @NotNull
    private final AFc1pSDK component3;

    @NotNull
    private final kotlin.f0 component4;

    @NotNull
    private final kotlin.f0 equals;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.jvm.internal.l0 implements Function0<Boolean> {
        AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.component3.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.l0 implements Function0<Long> {
        AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            Long lC1;
            String currencyIso4217Code = AFe1eSDK.this.component3.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (lC1 = StringsKt.c1(currencyIso4217Code)) == null) ? 1000L : lC1.longValue());
        }
    }

    public static final class AFa1tSDK {
        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1tSDK() {
        }
    }

    static final class AFa1ySDK {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public AFa1ySDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1ySDK copy$default(AFa1ySDK aFa1ySDK, String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aFa1ySDK.advertisingId;
            }
            if ((i10 & 2) != 0) {
                bool = aFa1ySDK.isLimitAdTrackingEnabled;
            }
            if ((i10 & 4) != 0) {
                z10 = aFa1ySDK.advertisingIdWithGps;
            }
            if ((i10 & 8) != 0) {
                sb2 = aFa1ySDK.gaidError;
            }
            return aFa1ySDK.copy(str, bool, z10, sb2);
        }

        @Nullable
        public final String component1() {
            return this.advertisingId;
        }

        @Nullable
        public final Boolean component2() {
            return this.isLimitAdTrackingEnabled;
        }

        public final boolean component3() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder component4() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1ySDK copy(@Nullable String str, @Nullable Boolean bool, boolean z10, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1ySDK(str, bool, z10, gaidError);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) obj;
            return Intrinsics.areEqual(this.advertisingId, aFa1ySDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1ySDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1ySDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1ySDK.gaidError);
        }

        @oj.i(name = "getAdvertisingId")
        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @oj.i(name = "getAdvertisingIdWithGps")
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @oj.i(name = "getGaidError")
        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = 0;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            if (bool != null) {
                iHashCode = bool.hashCode();
            }
            int i10 = (iHashCode2 + iHashCode) * 31;
            boolean z10 = this.advertisingIdWithGps;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return ((i10 + r10) * 31) + this.gaidError.hashCode();
        }

        @oj.i(name = "isLimitAdTrackingEnabled")
        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @oj.i(name = "setAdvertisingId")
        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        @oj.i(name = "setAdvertisingIdWithGps")
        public final void setAdvertisingIdWithGps(boolean z10) {
            this.advertisingIdWithGps = z10;
        }

        @oj.i(name = "setLimitAdTrackingEnabled")
        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1ySDK(@Nullable String str, @Nullable Boolean bool, boolean z10, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z10;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1ySDK(String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ AFa1ySDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1zSDK(AFa1ySDK aFa1ySDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1ySDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFg1gSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(@NotNull AFc1dSDK aFc1dSDK) {
        super(AFe1mSDK.FETCH_ADVERTISING_ID, new AFe1mSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        AFc1iSDK aFc1iSDKAFInAppEventType = aFc1dSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFInAppEventType, "");
        this.areAllFieldsValid = aFc1iSDKAFInAppEventType;
        AFc1pSDK revenue = aFc1dSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.component3 = revenue;
        AFc1kSDK aFc1kSDKAfInfoLog = aFc1dSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(aFc1kSDKAfInfoLog, "");
        this.component2 = aFc1kSDKAfInfoLog;
        this.component1 = new AFh1oSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component4 = kotlin.g0.c(new AnonymousClass4());
        this.equals = kotlin.g0.c(new AnonymousClass3());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    private final boolean AFAdRevenueData(int i10) {
        boolean z10;
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
        Context context = this.areAllFieldsValid.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        int currencyIso4217Code = getCurrencyIso4217Code(context);
        Context context2 = this.areAllFieldsValid.getMonetizationNetwork;
        Intrinsics.checkNotNull(context2);
        if (!getCurrencyIso4217Code(context2, aFa1ySDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.areAllFieldsValid.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                if (AFAdRevenueData(context3, aFa1ySDK)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            String string = aFa1ySDK.getGaidError().toString();
            if (string != null && !StringsKt.w3(string)) {
                string = currencyIso4217Code + ": " + StringsKt.E5(string).toString();
            }
            AFAdRevenueData(this.component1, string);
            if (!z10) {
                return false;
            }
        }
        AFh1oSDK aFh1oSDK = this.component1;
        aFh1oSDK.AFAdRevenueData = aFa1ySDK.getAdvertisingId();
        aFh1oSDK.getRevenue = aFa1ySDK.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = aFa1ySDK.isLimitAdTrackingEnabled();
        aFh1oSDK.getMonetizationNetwork = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        aFh1oSDK.getMediationNetwork = Boolean.valueOf(aFa1ySDK.getAdvertisingIdWithGps());
        aFh1oSDK.getCurrencyIso4217Code = Boolean.FALSE;
        aFh1oSDK.component2 = Boolean.valueOf(i10 != 2);
        return true;
    }

    @oj.i(name = "component1")
    private final boolean component1() {
        return ((Boolean) this.equals.getValue()).booleanValue();
    }

    @oj.i(name = "component3")
    private static boolean component3() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            if (th2 instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th2.getMessage();
            }
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th2, true, false, false, false, com.planner5d.library.engine.input.f.b.B, null);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b A[LOOP:0: B:3:0x0008->B:15:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x004e A[EDGE_INSN: B:19:0x004e->B:16:0x004e BREAK  A[LOOP:0: B:3:0x0008->B:15:0x004b], SYNTHETIC] */
    private final boolean equals() {
        boolean z10 = false;
        for (int i10 = 2; i10 > 0; i10--) {
            if (component1() && getMediationNetwork(i10)) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                if (AFAdRevenueData(i10)) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
            }
            z10 = true;
            if (!z10) {
                break;
                break;
            }
        }
        this.component2.component3 = this.component1;
        return z10;
    }

    @w0(23)
    private final boolean getMonetizationNetwork(int i10) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component3()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.areAllFieldsValid.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.areAllFieldsValid.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1zSDK(aFa1ySDK, countDownLatch));
                    countDownLatch.await(((Number) this.component4.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1ySDK.getGaidError().length() > 0) {
                        AFAdRevenueData(this.component1, aFa1ySDK.getGaidError().toString());
                    }
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th2 instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th2.getMessage();
                        }
                        AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th2, true, false, false, false, com.planner5d.library.engine.input.f.b.B, null);
                        StringBuilder gaidError = aFa1ySDK.getGaidError();
                        gaidError.append(th2.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1ySDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th3) {
                        if (aFa1ySDK.getGaidError().length() > 0) {
                            AFAdRevenueData(this.component1, aFa1ySDK.getGaidError().toString());
                        }
                        throw th3;
                    }
                }
                String advertisingId = aFa1ySDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1oSDK aFh1oSDK = this.component1;
                aFh1oSDK.AFAdRevenueData = aFa1ySDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1oSDK.getRevenue = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1oSDK.getMonetizationNetwork = bool2;
                aFh1oSDK.getMediationNetwork = bool;
                aFh1oSDK.getCurrencyIso4217Code = bool2;
                aFh1oSDK.component2 = Boolean.valueOf(i10 != 2);
                return true;
            }
        }
        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @l1(otherwise = 4)
    @NotNull
    public final AFe1rSDK getCurrencyIso4217Code() {
        if (this.component2.getMonetizationNetwork()) {
            int i10 = 0 << 0;
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1rSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(equals());
        Boolean bool = Boolean.FALSE;
        AFe1rSDK aFe1rSDK = CollectionsKt.listOf((Object[]) new Boolean[]{boolValueOf, bool, bool}).contains(Boolean.TRUE) ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
        AFc1kSDK aFc1kSDK = this.component2;
        AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1hSDK.getRevenue + "ms", false, 4, null);
        aFc1kSDK.getRevenue(aFd1hSDK);
        return aFe1rSDK;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    private final boolean getMediationNetwork(int i10) {
        return getMonetizationNetwork(i10);
    }

    private static int getCurrencyIso4217Code(Context context) {
        try {
            return com.google.android.gms.common.f.x().j(context);
        } catch (Throwable th2) {
            boolean z10 = false | false;
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th2, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getCurrencyIso4217Code(Context context, AFa1ySDK aFa1ySDK) throws IllegalStateException {
        Unit unit;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                aFa1ySDK.setAdvertisingId(advertisingIdInfo.getId());
                aFa1ySDK.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                aFa1ySDK.setAdvertisingIdWithGps(true);
                String advertisingId = aFa1ySDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    aFa1ySDK.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.f312394a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            aFa1ySDK.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            int i10 = (0 >> 0) >> 0;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, "Google Play Services is missing " + th2.getMessage(), th2, false, false, false, false, 88, null);
            StringBuilder gaidError = aFa1ySDK.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private final boolean AFAdRevenueData(Context context, AFa1ySDK aFa1ySDK) throws IllegalStateException {
        try {
            AFb1vSDK.AFa1vSDK aFa1vSDKAFAdRevenueData = AFb1vSDK.AFAdRevenueData(context);
            aFa1ySDK.setAdvertisingId(aFa1vSDKAFAdRevenueData.AFAdRevenueData);
            aFa1ySDK.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1vSDKAFAdRevenueData.getCurrencyIso4217Code()));
            String advertisingId = aFa1ySDK.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                aFa1ySDK.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.f312394a != null) {
                return true;
            }
            aFa1ySDK.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, "Failed to fetch GAID: " + th2.getMessage(), th2, true, false, false, false, 64, null);
            StringBuilder gaidError = aFa1ySDK.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @l1(otherwise = 4)
    public final long getMonetizationNetwork() {
        return ((Number) this.component4.getValue()).longValue();
    }

    private static void AFAdRevenueData(AFh1oSDK aFh1oSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1oSDK.areAllFieldsValid;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        aFh1oSDK.areAllFieldsValid = str;
    }
}
