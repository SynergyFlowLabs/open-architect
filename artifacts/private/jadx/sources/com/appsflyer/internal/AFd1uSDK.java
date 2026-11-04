package com.appsflyer.internal;

import android.os.Build;
import android.widget.ExpandableListView;
import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import com.devtodev.core.data.consts.RequestParams;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1uSDK implements AFd1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int copydefault;

    @NotNull
    private final kotlin.f0 AFAdRevenueData;

    @NotNull
    private final kotlin.f0 areAllFieldsValid;

    @NotNull
    private final String component1;

    @Nullable
    private AFd1vSDK.AFa1ySDK component2;

    @NotNull
    private final kotlin.f0 component3;

    @NotNull
    private final kotlin.f0 component4;

    @NotNull
    private final kotlin.f0 getCurrencyIso4217Code;

    @NotNull
    private AFc1dSDK getMediationNetwork;

    @NotNull
    private final kotlin.f0 getMonetizationNetwork;

    @NotNull
    private final kotlin.f0 getRevenue;
    private static char[] hashCode = {8636, 8652, 8639, 8648, 8626};
    private static int equals = -771284898;
    private static boolean toString = true;
    private static boolean copy = true;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.jvm.internal.l0 implements Function0<AFc1bSDK> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFc1bSDK invoke() {
            AFc1iSDK aFc1iSDKAFInAppEventType = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFInAppEventType, "");
            return new AFc1bSDK(aFc1iSDKAFInAppEventType);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$10, reason: invalid class name */
    static final class AnonymousClass10 extends kotlin.jvm.internal.l0 implements Function0<AFf1gSDK> {
        AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1gSDK invoke() {
            AFf1gSDK aFf1gSDKRegisterClient = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).registerClient();
            Intrinsics.checkNotNullExpressionValue(aFf1gSDKRegisterClient, "");
            return aFf1gSDKRegisterClient;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.jvm.internal.l0 implements Function0<AFc1pSDK> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1pSDK invoke() {
            AFc1pSDK revenue = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            return revenue;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.jvm.internal.l0 implements Function0<ExecutorService> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService monetizationNetwork = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.l0 implements Function0<AFc1qSDK> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFc1qSDK invoke() {
            AFc1qSDK aFc1qSDKComponent2 = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component2();
            Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent2, "");
            return aFc1qSDKComponent2;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.l0 implements Function0<AFf1oSDK> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFf1oSDK invoke() {
            AFf1oSDK aFf1oSDKComponent1 = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component1();
            Intrinsics.checkNotNullExpressionValue(aFf1oSDKComponent1, "");
            return aFf1oSDKComponent1;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$6, reason: invalid class name */
    static final class AnonymousClass6 extends kotlin.jvm.internal.l0 implements Function0<AFd1ySDK> {
        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            return new AFd1ySDK(AFd1uSDK.this.getRevenue());
        }
    }

    public AFd1uSDK(@NotNull AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.getMediationNetwork = aFc1dSDK;
        this.AFAdRevenueData = kotlin.g0.c(new AnonymousClass5());
        this.getMonetizationNetwork = kotlin.g0.c(new AnonymousClass2());
        this.getRevenue = kotlin.g0.c(new AnonymousClass4());
        this.getCurrencyIso4217Code = kotlin.g0.c(new AnonymousClass10());
        this.areAllFieldsValid = kotlin.g0.c(new AnonymousClass3());
        this.component1 = "6.17.0";
        this.component4 = kotlin.g0.c(new AnonymousClass1());
        this.component3 = kotlin.g0.c(new AnonymousClass6());
    }

    private final ExecutorService areAllFieldsValid() {
        AFLogger = (copydefault + 47) % 128;
        ExecutorService executorService = (ExecutorService) this.areAllFieldsValid.getValue();
        AFLogger = (copydefault + 37) % 128;
        return executorService;
    }

    private final AFh1dSDK component1() {
        return (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
    }

    private final AFc1qSDK component2() {
        int i10 = copydefault + 19;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) this.getRevenue.getValue();
        if (i11 != 0) {
            return aFc1qSDK;
        }
        throw null;
    }

    @NotNull
    private AFd1xSDK component3() {
        return (AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this));
    }

    private final AFf1gSDK component4() {
        int i10 = AFLogger + 17;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        AFf1gSDK aFf1gSDK = (AFf1gSDK) this.getCurrencyIso4217Code.getValue();
        if (i11 != 0) {
            throw null;
        }
        AFLogger = (copydefault + me.relex.circleindicator.a.f332619e) % 128;
        return aFf1gSDK;
    }

    private final synchronized void copy() {
        boolean monetizationNetwork;
        try {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if (aFh1dSDK != null) {
                int i10 = copydefault + 57;
                AFLogger = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = aFh1dSDK.AFAdRevenueData;
                    throw null;
                }
                int i12 = 5 | (-1);
                if (aFh1dSDK.AFAdRevenueData == -1) {
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                } else if (component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L) == -1) {
                    AFLogger = (copydefault + 119) % 128;
                    getRevenue(aFh1dSDK);
                }
                monetizationNetwork = getMonetizationNetwork(aFh1dSDK);
            } else {
                monetizationNetwork = false;
            }
            AFd1vSDK.AFa1ySDK aFa1ySDK = this.component2;
            if (aFa1ySDK == null) {
                copydefault = (AFLogger + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
            } else {
                copydefault = (AFLogger + 73) % 128;
                aFa1ySDK.onConfigurationChanged(monetizationNetwork);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d9 A[Catch: all -> 0x001e, PHI: r0
      0x00d9: PHI (r0v26 java.lang.String) = (r0v25 java.lang.String), (r0v39 java.lang.String) binds: [B:38:0x00d7, B:33:0x00d0] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x0126 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0135 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0144 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:64:0x0181 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x018d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:86:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ee A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0210 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0230 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0024, B:12:0x0037, B:14:0x0043, B:18:0x006a, B:22:0x008b, B:24:0x009e, B:26:0x00a6, B:28:0x00bd, B:30:0x00c9, B:39:0x00d9, B:41:0x00f2, B:43:0x00fc, B:45:0x0103, B:47:0x0111, B:49:0x0117, B:51:0x0126, B:53:0x0135, B:55:0x0144, B:57:0x0154, B:59:0x0165, B:61:0x016c, B:63:0x0173, B:65:0x018b, B:67:0x018f, B:69:0x0195, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01c4, B:79:0x01c9, B:85:0x01db, B:93:0x0258, B:95:0x025c, B:97:0x026d, B:98:0x027b, B:88:0x01ee, B:90:0x0210, B:91:0x0230, B:82:0x01d1, B:64:0x0181, B:36:0x00d4, B:37:0x00d5, B:92:0x0244, B:32:0x00ce), top: B:107:0x0002, inners: #0 }] */
    private final synchronized void copydefault() {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        MatchResult matchResultJ;
        int i10;
        MatchGroup matchGroup;
        int iIntValue;
        MatchGroup matchGroup2;
        int iIntValue2;
        MatchGroup matchGroup3;
        int iIntValue3;
        String strF;
        Integer intOrNull;
        String strF2;
        Integer intOrNull2;
        String strF3;
        try {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if ((aFh1dSDK != null ? aFh1dSDK.getMediationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                int i11 = AFLogger + 47;
                copydefault = i11 % 128;
                if (i11 % 2 != 0) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                    return;
                } else {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                    return;
                }
            }
            AFh1dSDK aFh1dSDK2 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            boolean monetizationNetwork = false;
            if (aFh1dSDK2 == null || !getMediationNetwork(aFh1dSDK2)) {
                component2().getMonetizationNetwork("af_send_exc_to_server_window");
                getRevenue().getMonetizationNetwork();
            } else {
                AFh1dSDK aFh1dSDK3 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                Pair<Integer, Integer> mediationNetwork = null;
                if (aFh1dSDK3 != null) {
                    int i12 = AFLogger + com.rabbitmq.client.impl.k.b.p.f265340a;
                    copydefault = i12 % 128;
                    if (i12 % 2 != 0) {
                        str3 = aFh1dSDK3.getRevenue;
                        int i13 = 76 / 0;
                        if (str3 != null) {
                            Intrinsics.checkNotNullParameter(str3, "");
                            matchResultJ = new Regex("(\\d+).(\\d+).(\\d+).*").j(str3);
                            if (matchResultJ != null) {
                                matchGroup = matchResultJ.b().get(1);
                                if (matchGroup != null || (strF3 = matchGroup.f()) == null) {
                                    iIntValue = 0;
                                } else {
                                    AFLogger = (copydefault + 119) % 128;
                                    Integer intOrNull3 = StringsKt.toIntOrNull(strF3);
                                    if (intOrNull3 != null) {
                                        iIntValue = intOrNull3.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                }
                                int i14 = iIntValue * 1000000;
                                matchGroup2 = matchResultJ.b().get(2);
                                if (matchGroup2 != null) {
                                    AFLogger = (copydefault + 95) % 128;
                                    strF2 = matchGroup2.f();
                                    if (strF2 != null) {
                                        AFLogger = (copydefault + 113) % 128;
                                        intOrNull2 = StringsKt.toIntOrNull(strF2);
                                        if (intOrNull2 != null) {
                                            iIntValue2 = intOrNull2.intValue();
                                            copydefault = (AFLogger + 87) % 128;
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                } else {
                                    iIntValue2 = 0;
                                }
                                int i15 = i14 + (iIntValue2 * 1000);
                                matchGroup3 = matchResultJ.b().get(3);
                                if (matchGroup3 != null || (strF = matchGroup3.f()) == null || (intOrNull = StringsKt.toIntOrNull(strF)) == null) {
                                    AFLogger = (copydefault + 85) % 128;
                                    iIntValue3 = 0;
                                } else {
                                    AFLogger = (copydefault + 123) % 128;
                                    iIntValue3 = intOrNull.intValue();
                                }
                                i10 = i15 + iIntValue3;
                            } else {
                                i10 = -1;
                            }
                            numValueOf = Integer.valueOf(i10);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        str3 = aFh1dSDK3.getRevenue;
                        if (str3 != null) {
                            Intrinsics.checkNotNullParameter(str3, "");
                            matchResultJ = new Regex("(\\d+).(\\d+).(\\d+).*").j(str3);
                            if (matchResultJ != null) {
                                matchGroup = matchResultJ.b().get(1);
                                if (matchGroup != null) {
                                    iIntValue = 0;
                                } else {
                                    iIntValue = 0;
                                }
                                int i16 = iIntValue * 1000000;
                                matchGroup2 = matchResultJ.b().get(2);
                                if (matchGroup2 != null) {
                                    AFLogger = (copydefault + 95) % 128;
                                    strF2 = matchGroup2.f();
                                    if (strF2 != null) {
                                        AFLogger = (copydefault + 113) % 128;
                                        intOrNull2 = StringsKt.toIntOrNull(strF2);
                                        if (intOrNull2 != null) {
                                            iIntValue2 = intOrNull2.intValue();
                                            copydefault = (AFLogger + 87) % 128;
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                } else {
                                    iIntValue2 = 0;
                                }
                                int i17 = i16 + (iIntValue2 * 1000);
                                matchGroup3 = matchResultJ.b().get(3);
                                if (matchGroup3 != null) {
                                    AFLogger = (copydefault + 85) % 128;
                                    iIntValue3 = 0;
                                } else {
                                    AFLogger = (copydefault + 85) % 128;
                                    iIntValue3 = 0;
                                }
                                i10 = i17 + iIntValue3;
                            } else {
                                i10 = -1;
                            }
                            numValueOf = Integer.valueOf(i10);
                        } else {
                            numValueOf = null;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                AFh1dSDK aFh1dSDK4 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                Pair<Integer, Integer> revenue = (aFh1dSDK4 == null || (str2 = aFh1dSDK4.getRevenue) == null) ? null : AFd1rSDK.getRevenue(str2);
                AFh1dSDK aFh1dSDK5 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                if (aFh1dSDK5 != null && (str = aFh1dSDK5.getRevenue) != null) {
                    mediationNetwork = AFd1rSDK.getMediationNetwork(str);
                }
                if (numValueOf != null && numValueOf.intValue() == -1) {
                    if (revenue != null) {
                        getRevenue().AFAdRevenueData(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                    } else if (mediationNetwork != null) {
                        getRevenue().AFAdRevenueData(mediationNetwork.getFirst().intValue(), mediationNetwork.getSecond().intValue());
                    } else {
                        component2().getMonetizationNetwork("af_send_exc_to_server_window");
                        getRevenue().getMonetizationNetwork();
                    }
                } else if (revenue == null) {
                    getRevenue().getRevenue(this.component1);
                } else if (revenue != null) {
                    getRevenue().AFAdRevenueData(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                } else if (mediationNetwork != null) {
                    getRevenue().AFAdRevenueData(mediationNetwork.getFirst().intValue(), mediationNetwork.getSecond().intValue());
                } else {
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                }
            }
            AFd1vSDK.AFa1ySDK aFa1ySDK = this.component2;
            if (aFa1ySDK != null) {
                AFh1dSDK aFh1dSDK6 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                if (aFh1dSDK6 != null) {
                    copydefault = (AFLogger + 71) % 128;
                    monetizationNetwork = getMonetizationNetwork(aFh1dSDK6);
                }
                aFa1ySDK.onConfigurationChanged(monetizationNetwork);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void equals() {
        AFh1dSDK aFh1dSDK;
        int i10 = copydefault + 119;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            int i11 = 59 / 0;
            if (aFh1dSDK == null) {
                return;
            }
        } else {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if (aFh1dSDK == null) {
                return;
            }
        }
        if (!getCurrencyIso4217Code(aFh1dSDK)) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            return;
        }
        int i12 = AFLogger + 33;
        copydefault = i12 % 128;
        if (i12 % 2 != 0) {
            component4().getMediationNetwork();
            throw null;
        }
        String mediationNetwork = component4().getMediationNetwork();
        if (mediationNetwork != null) {
            String string = new JSONObject((Map) getMediationNetwork(new Object[]{AFAdRevenueData(aFh1dSDK), getRevenue().getMediationNetwork()}, -1072478634, 1072478634, (int) System.currentTimeMillis())).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            getCurrencyIso4217Code(string, mediationNetwork);
        }
    }

    public static final /* synthetic */ AFc1dSDK getCurrencyIso4217Code(AFd1uSDK aFd1uSDK) {
        int i10 = AFLogger + me.relex.circleindicator.a.f332619e;
        int i11 = i10 % 128;
        copydefault = i11;
        int i12 = i10 % 2;
        AFc1dSDK aFc1dSDK = aFd1uSDK.getMediationNetwork;
        if (i12 != 0) {
            throw null;
        }
        AFLogger = (i11 + 47) % 128;
        return aFc1dSDK;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i10 * (-344)) + (i11 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        int i17 = i13 + (((~i16) | (~(i14 | i12))) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + ((~(i16 | i12)) * 345);
        if (i17 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i17 == 2) {
            return AFAdRevenueData(objArr);
        }
        if (i17 == 3) {
            return getRevenue(objArr);
        }
        if (i17 == 4) {
            AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
            copydefault = (AFLogger + 59) % 128;
            AFd1xSDK aFd1xSDK = (AFd1xSDK) aFd1uSDK.component3.getValue();
            AFLogger = (copydefault + 5) % 128;
            return aFd1xSDK;
        }
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        int i18 = AFLogger + 43;
        copydefault = i18 % 128;
        if (i18 % 2 == 0) {
            return MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1tSDK.getCurrencyIso4217Code(list)));
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("deviceInfo", map);
        pairArr[0] = TuplesKt.to("excs", AFd1tSDK.getCurrencyIso4217Code(list));
        return MapsKt.mapOf(pairArr);
    }

    private final AFf1oSDK getMonetizationNetwork() {
        AFLogger = (copydefault + 99) % 128;
        AFf1oSDK aFf1oSDK = (AFf1oSDK) this.AFAdRevenueData.getValue();
        copydefault = (AFLogger + 11) % 128;
        return aFf1oSDK;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        AFLogger = (copydefault + 29) % 128;
        AFi1wSDK aFi1wSDK = aFd1uSDK.getMonetizationNetwork().getMediationNetwork.getCurrencyIso4217Code;
        int i10 = 2 >> 0;
        if (aFi1wSDK != null) {
            int i11 = AFLogger + 37;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
                throw null;
            }
            AFh1cSDK aFh1cSDK2 = aFi1wSDK.getMonetizationNetwork;
            if (aFh1cSDK2 != null) {
                return aFh1cSDK2.getRevenue;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData(@Nullable AFd1vSDK.AFa1ySDK aFa1ySDK) {
        int i10 = AFLogger + 21;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            this.component2 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMediationNetwork(this.f89734a);
                }
            });
        } else {
            this.component2 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMediationNetwork(this.f89734a);
                }
            });
            throw null;
        }
    }

    private static void a(String str, int[] iArr, String str2, int i10, Object[] objArr) throws UnsupportedEncodingException {
        int length;
        char[] cArr;
        int i11;
        Object charArray = str2;
        if (str2 != null) {
            $10 = ($11 + 39) % 128;
            charArray = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr3 = hashCode;
        if (cArr3 != null) {
            int i12 = $11 + 61;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
                i11 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i11 = 0;
            }
            while (i11 < length) {
                $10 = ($11 + 97) % 128;
                cArr[i11] = (char) (((long) cArr3[i11]) ^ (-5879130172463570806L));
                i11++;
            }
            cArr3 = cArr;
        }
        int i13 = (int) ((-5879130172463570806L) ^ ((long) equals));
        if (copy) {
            int length2 = bArr.length;
            aFk1nSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i14 = aFk1nSDK.AFAdRevenueData;
                int i15 = aFk1nSDK.getMonetizationNetwork;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    $11 = ($10 + 19) % 128;
                    cArr4[i14] = (char) (cArr3[bArr[(i15 - 1) - i14] + i10] - i13);
                    aFk1nSDK.AFAdRevenueData = i14 + 1;
                }
            }
        } else {
            if (toString) {
                int length3 = cArr2.length;
                aFk1nSDK.getMonetizationNetwork = length3;
                char[] cArr5 = new char[length3];
                aFk1nSDK.AFAdRevenueData = 0;
                while (true) {
                    int i16 = aFk1nSDK.AFAdRevenueData;
                    int i17 = aFk1nSDK.getMonetizationNetwork;
                    if (i16 >= i17) {
                        break;
                    }
                    cArr5[i16] = (char) (cArr3[cArr2[(i17 - 1) - i16] - i10] - i13);
                    aFk1nSDK.AFAdRevenueData = i16 + 1;
                }
                String str3 = new String(cArr5);
                int i18 = $11 + 27;
                $10 = i18 % 128;
                if (i18 % 2 == 0) {
                    objArr[0] = str3;
                    return;
                } else {
                    int i19 = 15 / 0;
                    objArr[0] = str3;
                    return;
                }
            }
            int length4 = iArr.length;
            aFk1nSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i20 = aFk1nSDK.AFAdRevenueData;
                int i21 = aFk1nSDK.getMonetizationNetwork;
                if (i20 >= i21) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i20] = (char) (cArr3[iArr[(i21 - 1) - i20] - i10] - i13);
                    aFk1nSDK.AFAdRevenueData = i20 + 1;
                }
            }
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        copydefault = (AFLogger + 43) % 128;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.equals();
        int i10 = copydefault + 69;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 22 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1uSDK aFd1uSDK) {
        AFLogger = (copydefault + 9) % 128;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.copy();
        AFLogger = (copydefault + 51) % 128;
    }

    @m1
    private final void getCurrencyIso4217Code(String str, String str2) {
        AFLogger = (copydefault + 53) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        ((AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this))).getMediationNetwork(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFj1cSDK.getRevenue(str, str2))), 2000);
        int i10 = copydefault + 95;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 81 / 0;
        }
    }

    private final AFc1pSDK getMediationNetwork() {
        copydefault = (AFLogger + 87) % 128;
        AFc1pSDK aFc1pSDK = (AFc1pSDK) this.getMonetizationNetwork.getValue();
        AFLogger = (copydefault + 59) % 128;
        return aFc1pSDK;
    }

    private final boolean getMonetizationNetwork(AFh1dSDK aFh1dSDK) {
        copydefault = (AFLogger + 67) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            copydefault = (AFLogger + 25) % 128;
            return false;
        }
        if (currencyIso4217Code == -1 || currencyIso4217Code < jCurrentTimeMillis) {
            return false;
        }
        return getMediationNetwork(aFh1dSDK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK, Throwable th2, String str) {
        AFh1dSDK aFh1dSDK;
        int i10 = copydefault + 101;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{aFd1uSDK}, 855295870, -855295867, System.identityHashCode(aFd1uSDK));
            int i11 = 90 / 0;
            if (aFh1dSDK == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{aFd1uSDK}, 855295870, -855295867, System.identityHashCode(aFd1uSDK));
            if (aFh1dSDK == null) {
                return;
            }
        }
        if (aFd1uSDK.getMonetizationNetwork(aFh1dSDK)) {
            aFd1uSDK.getRevenue().AFAdRevenueData(th2, str);
            AFLogger = (copydefault + 91) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData() {
        int i10 = copydefault + 61;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(this.f89733a);
                }
            });
            copydefault = (AFLogger + 81) % 128;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(this.f89733a);
                }
            });
            throw null;
        }
    }

    @NotNull
    public final AFc1aSDK getRevenue() {
        int i10 = copydefault + 41;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        AFc1aSDK aFc1aSDK = (AFc1aSDK) this.component4.getValue();
        if (i11 != 0) {
            return aFc1aSDK;
        }
        throw null;
    }

    private final void getRevenue(AFh1dSDK aFh1dSDK) {
        int i10;
        long jCurrentTimeMillis;
        int i11 = copydefault + 115;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            i10 = aFh1dSDK.getCurrencyIso4217Code;
            jCurrentTimeMillis = System.currentTimeMillis() ^ TimeUnit.DAYS.toMillis(aFh1dSDK.AFAdRevenueData);
        } else {
            i10 = aFh1dSDK.getCurrencyIso4217Code;
            jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1dSDK.AFAdRevenueData);
        }
        AFc1qSDK aFc1qSDKComponent2 = component2();
        aFc1qSDKComponent2.getMonetizationNetwork("af_send_exc_to_server_window", jCurrentTimeMillis);
        aFc1qSDKComponent2.getMediationNetwork("af_send_exc_min", i10);
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        final AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        int i10 = AFLogger + 79;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            aFd1uSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMonetizationNetwork(this.f89735a);
                }
            });
            int i11 = 76 / 0;
        } else {
            aFd1uSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMonetizationNetwork(this.f89735a);
                }
            });
        }
        int i12 = copydefault + 21;
        AFLogger = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 93 / 0;
        }
        return null;
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK aFh1dSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            return false;
        }
        if (currencyIso4217Code != -1) {
            copydefault = (AFLogger + 27) % 128;
            if (currencyIso4217Code >= jCurrentTimeMillis) {
                int iAFAdRevenueData = component2().AFAdRevenueData("af_send_exc_min", -1);
                if (iAFAdRevenueData != -1 && getRevenue().getCurrencyIso4217Code() >= iAFAdRevenueData) {
                    return getMediationNetwork(aFh1dSDK);
                }
                return false;
            }
        }
        copydefault = (AFLogger + 13) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork(@NotNull final Throwable th2, @NotNull final String str) {
        copydefault = (AFLogger + 75) % 128;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.q
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getMediationNetwork(this.f89728a, th2, str);
            }
        });
        AFLogger = (copydefault + 53) % 128;
    }

    private final Map<String, String> AFAdRevenueData(AFh1dSDK aFh1dSDK) throws UnsupportedEncodingException {
        Object[] objArr = new Object[1];
        a("\u0085\u0084\u0083\u0082\u0081", null, null, ExpandableListView.getPackedPositionType(0L) + 127, objArr);
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", getMediationNetwork().getRevenue.getMonetizationNetwork.getPackageName()), TuplesKt.to("p_ex", new AFa1vSDK().getMonetizationNetwork()), TuplesKt.to(MetricTracker.Place.API, String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", this.component1), TuplesKt.to(RequestParams.UID, AFb1iSDK.getRevenue(getMediationNetwork().getMonetizationNetwork)), TuplesKt.to("exc_config", aFh1dSDK.getMonetizationNetwork()));
        int i10 = copydefault + 125;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            return mapMapOf;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK) {
        copydefault = (AFLogger + 83) % 128;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.copydefault();
        AFLogger = (copydefault + 105) % 128;
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        new AFd1sSDK();
        String str = this.component1;
        String str2 = aFh1dSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean mediationNetwork = AFd1sSDK.getMediationNetwork(str, str2);
        AFLogger = (copydefault + 79) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getCurrencyIso4217Code() {
        getMediationNetwork(new Object[]{this}, 58037992, -58037990, System.identityHashCode(this));
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<AFc1cSDK> list) {
        return (Map) getMediationNetwork(new Object[]{map, list}, -1072478634, 1072478634, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        getMediationNetwork(new Object[]{aFd1uSDK}, 801406437, -801406436, (int) System.currentTimeMillis());
    }
}
