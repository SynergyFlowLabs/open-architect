package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f88209a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f88210b = "LOTTIE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f88211c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f88212d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f88213e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f88214f = a.AUTOMATIC;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static com.airbnb.lottie.network.f f88215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static com.airbnb.lottie.network.e f88216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.h f88217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.g f88218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static ThreadLocal<com.airbnb.lottie.utils.f> f88219k;

    private f() {
    }

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f88211c) {
            f().a(str);
        }
    }

    public static float c(String str) {
        if (f88211c) {
            return f().b(str);
        }
        return 0.0f;
    }

    public static a d() {
        return f88214f;
    }

    public static boolean e() {
        return f88213e;
    }

    private static com.airbnb.lottie.utils.f f() {
        com.airbnb.lottie.utils.f fVar = f88219k.get();
        if (fVar != null) {
            return fVar;
        }
        com.airbnb.lottie.utils.f fVar2 = new com.airbnb.lottie.utils.f();
        f88219k.set(fVar2);
        return fVar2;
    }

    @androidx.annotation.p0
    public static com.airbnb.lottie.network.g g(@NonNull Context context) {
        com.airbnb.lottie.network.g gVar;
        if (!f88212d) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.g gVar2 = f88218j;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (com.airbnb.lottie.network.g.class) {
            try {
                gVar = f88218j;
                if (gVar == null) {
                    com.airbnb.lottie.network.e eVar = f88216h;
                    if (eVar == null) {
                        eVar = new com.airbnb.lottie.network.e() { // from class: com.airbnb.lottie.e
                            @Override // com.airbnb.lottie.network.e
                            public final File a() {
                                return f.a(applicationContext);
                            }
                        };
                    }
                    gVar = new com.airbnb.lottie.network.g(eVar);
                    f88218j = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    public static com.airbnb.lottie.network.h h(@NonNull Context context) {
        com.airbnb.lottie.network.h hVar;
        com.airbnb.lottie.network.h hVar2 = f88217i;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (com.airbnb.lottie.network.h.class) {
            try {
                hVar = f88217i;
                if (hVar == null) {
                    com.airbnb.lottie.network.g gVarG = g(context);
                    com.airbnb.lottie.network.f bVar = f88215g;
                    if (bVar == null) {
                        bVar = new com.airbnb.lottie.network.b();
                    }
                    hVar = new com.airbnb.lottie.network.h(gVarG, bVar);
                    f88217i = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static void i(com.airbnb.lottie.network.e eVar) {
        com.airbnb.lottie.network.e eVar2 = f88216h;
        if (eVar2 == null && eVar == null) {
            return;
        }
        if (eVar2 == null || !eVar2.equals(eVar)) {
            f88216h = eVar;
            f88218j = null;
        }
    }

    public static void j(a aVar) {
        f88214f = aVar;
    }

    public static void k(boolean z10) {
        f88213e = z10;
    }

    public static void l(com.airbnb.lottie.network.f fVar) {
        com.airbnb.lottie.network.f fVar2 = f88215g;
        if (fVar2 == null && fVar == null) {
            return;
        }
        if (fVar2 == null || !fVar2.equals(fVar)) {
            f88215g = fVar;
            f88217i = null;
        }
    }

    public static void m(boolean z10) {
        f88212d = z10;
    }

    public static void n(boolean z10) {
        if (f88211c == z10) {
            return;
        }
        f88211c = z10;
        if (z10 && f88219k == null) {
            f88219k = new ThreadLocal<>();
        }
    }
}
