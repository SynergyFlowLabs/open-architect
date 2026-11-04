package com.facebook.internal;

import android.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f100073b = "com.facebook.internal.FEATURE_MANAGER";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f100072a = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<b, String[]> f100074c = new HashMap();

    public interface a {
        void a(boolean z10);
    }

    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(androidx.profileinstaller.n.c.f73814m),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(androidx.profileinstaller.n.c.f73816o),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(com.google.api.client.googleapis.media.a.f115410j);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f100075b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f100104a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final b a(int i10) {
                b[] bVarArrValuesCustom = b.valuesCustom();
                int length = bVarArrValuesCustom.length;
                int i11 = 0;
                while (i11 < length) {
                    b bVar = bVarArrValuesCustom[i11];
                    i11++;
                    if (bVar.f100104a == i10) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.facebook.internal.t$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0912b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f100105a;

            static {
                int[] iArr = new int[b.valuesCustom().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ModelRequest.ordinal()] = 16;
                iArr[b.EventDeactivation.ordinal()] = 17;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 18;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 19;
                iArr[b.IapLogging.ordinal()] = 20;
                iArr[b.IapLoggingLib2.ordinal()] = 21;
                iArr[b.Monitoring.ordinal()] = 22;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 23;
                iArr[b.Megatron.ordinal()] = 24;
                iArr[b.Elora.ordinal()] = 25;
                iArr[b.Login.ordinal()] = 26;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 27;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 28;
                iArr[b.BypassAppSwitch.ordinal()] = 29;
                iArr[b.Share.ordinal()] = 30;
                f100105a = iArr;
            }
        }

        b(int i10) {
            this.f100104a = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
        }

        @NotNull
        public final b n() {
            int i10 = this.f100104a;
            if ((i10 & 255) > 0) {
                return f100075b.a(i10 & (-256));
            }
            if ((65280 & i10) > 0) {
                return f100075b.a(i10 & l1.a.f316127c);
            }
            return (16711680 & i10) > 0 ? f100075b.a(i10 & (-16777216)) : f100075b.a(0);
        }

        @NotNull
        public final String o() {
            return Intrinsics.stringPlus("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            switch (C0912b.f100105a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ModelRequest";
                case 17:
                    return "EventDeactivation";
                case 18:
                    return "OnDeviceEventProcessing";
                case 19:
                    return "OnDevicePostInstallEventProcessing";
                case 20:
                    return "IAPLogging";
                case 21:
                    return "IAPLoggingLib2";
                case 22:
                    return "Monitoring";
                case 23:
                    return "ServiceUpdateCompliance";
                case 24:
                    return "Megatron";
                case 25:
                    return "Elora";
                case 26:
                    return "LoginKit";
                case 27:
                    return "ChromeCustomTabsPrefetching";
                case 28:
                    return "IgnoreAppSwitchToLoggedOut";
                case 29:
                    return "BypassAppSwitch";
                case 30:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100106a;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 19;
            iArr[b.Monitoring.ordinal()] = 20;
            iArr[b.Megatron.ordinal()] = 21;
            iArr[b.Elora.ordinal()] = 22;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 23;
            iArr[b.BypassAppSwitch.ordinal()] = 24;
            f100106a = iArr;
        }
    }

    public static final class d implements w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f100107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f100108b;

        d(a aVar, b bVar) {
            this.f100107a = aVar;
            this.f100108b = bVar;
        }

        @Override // com.facebook.internal.w.a
        public void onCompleted() {
            a aVar = this.f100107a;
            t tVar = t.f100072a;
            aVar.a(t.g(this.f100108b));
        }
    }

    private t() {
    }

    @oj.n
    public static final void a(@NotNull b feature, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        w wVar = w.f100131a;
        w.h(new d(callback, feature));
    }

    private final boolean b(b bVar) {
        switch (c.f100106a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return false;
            default:
                return true;
        }
    }

    @oj.n
    public static final void c(@NotNull b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        com.facebook.g0.n().getSharedPreferences(f100073b, 0).edit().putString(feature.o(), com.facebook.g0.I()).apply();
    }

    @oj.n
    @NotNull
    public static final b d(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        f100072a.f();
        for (Map.Entry<b, String[]> entry : f100074c.entrySet()) {
            b key = entry.getKey();
            String[] value = entry.getValue();
            int length = value.length;
            int i10 = 0;
            while (i10 < length) {
                String str = value[i10];
                i10++;
                if (StringsKt.u2(className, str, false, 2, null)) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    private final boolean e(b bVar) {
        boolean zB = b(bVar);
        w wVar = w.f100131a;
        String strO = bVar.o();
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        return w.d(strO, com.facebook.g0.o(), zB);
    }

    private final synchronized void f() {
        try {
            Map<b, String[]> map = f100074c;
            if (map.isEmpty()) {
                map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
                map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
                map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @oj.n
    public static final boolean g(@NotNull b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String string = com.facebook.g0.n().getSharedPreferences(f100073b, 0).getString(feature.o(), null);
        if (string != null && Intrinsics.areEqual(string, com.facebook.g0.I())) {
            return false;
        }
        b bVarN = feature.n();
        if (bVarN == feature) {
            return f100072a.e(feature);
        }
        return g(bVarN) && f100072a.e(feature);
    }
}
