package com.facebook.devicerequests.internal;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.g0;
import com.facebook.internal.a1;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.instrument.crashshield.b;
import com.facebook.internal.x;
import com.google.zxing.g;
import com.google.zxing.l;
import com.google.zxing.w;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f99536c = "device_info";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f99537d = "target_user_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f99538e = "device";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f99539f = "model";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f99540g = "fbsdk";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f99541h = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f99542i = "_fb._tcp.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f99534a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99535b = a.class.getCanonicalName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, NsdManager.RegistrationListener> f99543j = new HashMap<>();

    /* JADX INFO: renamed from: com.facebook.devicerequests.internal.a$a, reason: collision with other inner class name */
    public static final class C0908a implements NsdManager.RegistrationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f99544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f99545b;

        C0908a(String str, String str2) {
            this.f99544a = str;
            this.f99545b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(@NotNull NsdServiceInfo serviceInfo, int i10) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
            a aVar = a.f99534a;
            a.a(this.f99545b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(@NotNull NsdServiceInfo NsdServiceInfo) {
            Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
            if (!Intrinsics.areEqual(this.f99544a, NsdServiceInfo.getServiceName())) {
                a aVar = a.f99534a;
                a.a(this.f99545b);
            }
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(@NotNull NsdServiceInfo serviceInfo) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(@NotNull NsdServiceInfo serviceInfo, int i10) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }
    }

    private a() {
    }

    @n
    public static final void a(@Nullable String str) {
        if (b.e(a.class)) {
            return;
        }
        try {
            f99534a.b(str);
        } catch (Throwable th2) {
            b.c(th2, a.class);
        }
    }

    @e.b(16)
    private final void b(String str) {
        if (!b.e(this)) {
            try {
                NsdManager.RegistrationListener registrationListener = f99543j.get(str);
                if (registrationListener != null) {
                    g0 g0Var = g0.f99617a;
                    Object systemService = g0.n().getSystemService("servicediscovery");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                    }
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException e10) {
                        e1 e1Var = e1.f99794a;
                        e1.f0(f99535b, e10);
                    }
                    f99543j.remove(str);
                }
            } catch (Throwable th2) {
                b.c(th2, this);
            }
        }
    }

    @n
    @Nullable
    public static final Bitmap c(@Nullable String str) {
        if (b.e(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(g.class);
            enumMap.put(g.MARGIN, 2);
            try {
                com.google.zxing.common.b bVarA = new l().a(str, com.google.zxing.a.QR_CODE, 200, 200, enumMap);
                int iH = bVarA.h();
                int iL = bVarA.l();
                int[] iArr = new int[iH * iL];
                if (iH > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * iL;
                        if (iL > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                iArr[i12 + i13] = bVarA.e(i13, i10) ? -16777216 : -1;
                                if (i14 >= iL) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (i11 >= iH) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iL, iH, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.setPixels(iArr, 0, iL, 0, 0, iL, iH);
                    return bitmapCreateBitmap;
                } catch (w unused) {
                    return bitmapCreateBitmap;
                }
            } catch (w unused2) {
                return null;
            }
        } catch (Throwable th2) {
            b.c(th2, a.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final String d() {
        if (b.e(a.class)) {
            return null;
        }
        try {
            return e(null);
        } catch (Throwable th2) {
            b.c(th2, a.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final String e(@Nullable Map<String, String> map) {
        if (b.e(a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th2) {
                b.c(th2, a.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        map.put("model", MODEL);
        String string = new JSONObject(map).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    @n
    public static final boolean f() {
        if (b.e(a.class)) {
            return false;
        }
        try {
            b0 b0Var = b0.f99725a;
            g0 g0Var = g0.f99617a;
            x xVarF = b0.f(g0.o());
            return xVarF != null && xVarF.q().contains(a1.Enabled);
        } catch (Throwable th2) {
            b.c(th2, a.class);
            return false;
        }
    }

    @n
    public static final boolean g(@Nullable String str) {
        if (b.e(a.class)) {
            return false;
        }
        try {
            if (f()) {
                return f99534a.h(str);
            }
            return false;
        } catch (Throwable th2) {
            b.c(th2, a.class);
            return false;
        }
    }

    @e.b(16)
    private final boolean h(String str) {
        if (b.e(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> map = f99543j;
            if (map.containsKey(str)) {
                return true;
            }
            g0 g0Var = g0.f99617a;
            String str2 = "fbsdk_" + Intrinsics.stringPlus("android-", StringsKt.j2(g0.I(), '.', '|', false, 4, null)) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType(f99542i);
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = g0.n().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            C0908a c0908a = new C0908a(str2, str);
            map.put(str, c0908a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0908a);
            return true;
        } catch (Throwable th2) {
            b.c(th2, this);
            return false;
        }
    }
}
