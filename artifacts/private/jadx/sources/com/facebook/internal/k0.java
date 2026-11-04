package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f99940b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f99941c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static Handler f99942d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k0 f99939a = new k0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final m1 f99943e = new m1(8, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final m1 f99944f = new m1(2, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Map<d, c> f99945g = new HashMap();

    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final d f99946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f99947b;

        public a(@NotNull d key, boolean z10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f99946a = key;
            this.f99947b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                try {
                    if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                        try {
                            k0.f99939a.p(this.f99946a, this.f99947b);
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.b.c(th2, this);
                        }
                    }
                } catch (Throwable th3) {
                    com.facebook.internal.instrument.crashshield.b.c(th3, this);
                }
            }
        }
    }

    private static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final d f99948a;

        public b(@NotNull d key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f99948a = key;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                    return;
                }
                try {
                    k0.f99939a.f(this.f99948a);
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }

    @androidx.annotation.l1(otherwise = 2)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private l0 f99949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private m1.b f99950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f99951c;

        public c(@NotNull l0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f99949a = request;
        }

        @NotNull
        public final l0 a() {
            return this.f99949a;
        }

        @Nullable
        public final m1.b b() {
            return this.f99950b;
        }

        public final boolean c() {
            return this.f99951c;
        }

        public final void d(boolean z10) {
            this.f99951c = z10;
        }

        public final void e(@NotNull l0 l0Var) {
            Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
            this.f99949a = l0Var;
        }

        public final void f(@Nullable m1.b bVar) {
            this.f99950b = bVar;
        }
    }

    @androidx.annotation.l1(otherwise = 2)
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f99952c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f99953d = 29;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f99954e = 37;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Uri f99955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private Object f99956b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public d(@NotNull Uri uri, @NotNull Object tag) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f99955a = uri;
            this.f99956b = tag;
        }

        @NotNull
        public final Object a() {
            return this.f99956b;
        }

        @NotNull
        public final Uri b() {
            return this.f99955a;
        }

        public final void c(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f99956b = obj;
        }

        public final void d(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.f99955a = uri;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj != null && (obj instanceof d)) {
                d dVar = (d) obj;
                if (dVar.f99955a == this.f99955a && dVar.f99956b == this.f99956b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((1073 + this.f99955a.hashCode()) * 37) + this.f99956b.hashCode();
        }
    }

    private k0() {
    }

    @oj.n
    public static final boolean d(@NotNull l0 request) {
        boolean z10;
        Intrinsics.checkNotNullParameter(request, "request");
        d dVar = new d(request.e(), request.c());
        Map<d, c> map = f99945g;
        synchronized (map) {
            try {
                c cVar = map.get(dVar);
                if (cVar != null) {
                    m1.b bVarB = cVar.b();
                    z10 = true;
                    if (bVarB == null || !bVarB.cancel()) {
                        cVar.d(true);
                    } else {
                        map.remove(dVar);
                    }
                } else {
                    z10 = false;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @oj.n
    public static final void e() {
        n0 n0Var = n0.f100016a;
        n0.a();
        b1 b1Var = b1.f99756a;
        b1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    public final void f(d dVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r10;
        Exception uVar;
        InputStream inputStreamE;
        Bitmap bitmapDecodeStream;
        ?? r11 = 0;
        InputStream inputStream = null;
        r11 = 0;
        Bitmap bitmap = null;
        boolean z10 = true;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(dVar.b().toString()).openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    ?? responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode != 200) {
                            if (responseCode == 301 || responseCode == 302) {
                                try {
                                    String headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.d.f120676s);
                                    e1 e1Var = e1.f99794a;
                                    if (!e1.Z(headerField)) {
                                        Uri redirectUri = Uri.parse(headerField);
                                        b1 b1Var = b1.f99756a;
                                        b1.a(dVar.b(), redirectUri);
                                        c cVarQ = q(dVar);
                                        if (cVarQ != null && !cVarQ.c()) {
                                            l0 l0VarA = cVarQ.a();
                                            Intrinsics.checkNotNullExpressionValue(redirectUri, "redirectUri");
                                            h(l0VarA, new d(redirectUri, dVar.a()), false);
                                        }
                                    }
                                    z10 = false;
                                    bitmapDecodeStream = null;
                                    uVar = null;
                                } catch (IOException e10) {
                                    e = e10;
                                    z10 = false;
                                    r10 = 0;
                                    e1 e1Var2 = e1.f99794a;
                                    e1.j(r10);
                                    e1.q(httpURLConnection);
                                    uVar = e;
                                }
                            } else {
                                inputStreamE = httpURLConnection.getErrorStream();
                                StringBuilder sb2 = new StringBuilder();
                                if (inputStreamE != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamE);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i10 = inputStreamReader.read(cArr, 0, 128);
                                        if (i10 <= 0) {
                                            break;
                                        } else {
                                            sb2.append(cArr, 0, i10);
                                        }
                                    }
                                    e1 e1Var3 = e1.f99794a;
                                    e1.j(inputStreamReader);
                                } else {
                                    sb2.append("Unexpected error while downloading an image.");
                                }
                                uVar = new com.facebook.u(sb2.toString());
                                bitmapDecodeStream = null;
                            }
                            e1 e1Var4 = e1.f99794a;
                            e1.j(inputStream);
                            e1.q(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z10) {
                                m(dVar, uVar, bitmap, false);
                            }
                        }
                        n0 n0Var = n0.f100016a;
                        inputStreamE = n0.e(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE);
                        uVar = null;
                        inputStream = inputStreamE;
                        e1 e1Var5 = e1.f99794a;
                        e1.j(inputStream);
                        e1.q(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e11) {
                        e = e11;
                        r10 = responseCode;
                        e1 e1Var6 = e1.f99794a;
                        e1.j(r10);
                        e1.q(httpURLConnection);
                        uVar = e;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = responseCode;
                        e1 e1Var7 = e1.f99794a;
                        e1.j(r11);
                        e1.q(httpURLConnection);
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
                if (z10) {
                    m(dVar, uVar, bitmap, false);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
            httpURLConnection = null;
            r10 = 0;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    @oj.n
    public static final void g(@Nullable l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        d dVar = new d(l0Var.e(), l0Var.c());
        Map<d, c> map = f99945g;
        synchronized (map) {
            try {
                c cVar = map.get(dVar);
                if (cVar != null) {
                    cVar.e(l0Var);
                    cVar.d(false);
                    m1.b bVarB = cVar.b();
                    if (bVarB != null) {
                        bVarB.a();
                        Unit unit = Unit.f312394a;
                    }
                } else {
                    f99939a.h(l0Var, dVar, l0Var.h());
                    Unit unit2 = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void h(l0 l0Var, d dVar, boolean z10) {
        j(l0Var, dVar, f99944f, new a(dVar, z10));
    }

    private final void i(l0 l0Var, d dVar) {
        j(l0Var, dVar, f99943e, new b(dVar));
    }

    private final void j(l0 l0Var, d dVar, m1 m1Var, Runnable runnable) {
        Map<d, c> map = f99945g;
        synchronized (map) {
            c cVar = new c(l0Var);
            map.put(dVar, cVar);
            cVar.f(m1.g(m1Var, runnable, false, 2, null));
            Unit unit = Unit.f312394a;
        }
    }

    private final synchronized Handler k() {
        try {
            if (f99942d == null) {
                f99942d = new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f99942d;
    }

    private final void m(d dVar, final Exception exc, final Bitmap bitmap, final boolean z10) {
        l0.b bVarB;
        Handler handlerK;
        c cVarQ = q(dVar);
        if (cVarQ != null && !cVarQ.c()) {
            final l0 l0VarA = cVarQ.a();
            if (l0VarA == null) {
                bVarB = null;
                int i10 = 5 >> 0;
            } else {
                bVarB = l0VarA.b();
            }
            final l0.b bVar = bVarB;
            if (bVar != null && (handlerK = k()) != null) {
                handlerK.post(new Runnable() { // from class: com.facebook.internal.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k0.n(l0VarA, exc, z10, bitmap, bVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l0 request, Exception exc, boolean z10, Bitmap bitmap, l0.b bVar) {
        Intrinsics.checkNotNullParameter(request, "$request");
        bVar.a(new m0(request, exc, z10, bitmap));
    }

    @oj.n
    public static final void o(@NotNull l0 request) {
        m1.b bVarB;
        Intrinsics.checkNotNullParameter(request, "request");
        d dVar = new d(request.e(), request.c());
        Map<d, c> map = f99945g;
        synchronized (map) {
            try {
                c cVar = map.get(dVar);
                if (cVar != null && (bVarB = cVar.b()) != null) {
                    bVarB.a();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public final void p(d dVar, boolean z10) throws Throwable {
        InputStream inputStreamC;
        boolean z11 = false;
        if (z10) {
            b1 b1Var = b1.f99756a;
            Uri uriD = b1.d(dVar.b());
            if (uriD != null) {
                n0 n0Var = n0.f100016a;
                inputStreamC = n0.c(uriD);
                if (inputStreamC != null) {
                    z11 = true;
                }
            } else {
                inputStreamC = null;
            }
        } else {
            inputStreamC = null;
        }
        if (!z11) {
            n0 n0Var2 = n0.f100016a;
            inputStreamC = n0.c(dVar.b());
        }
        if (inputStreamC != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamC);
            e1 e1Var = e1.f99794a;
            e1.j(inputStreamC);
            m(dVar, null, bitmapDecodeStream, z11);
            return;
        }
        c cVarQ = q(dVar);
        l0 l0VarA = cVarQ != null ? cVarQ.a() : null;
        if (cVarQ == null || cVarQ.c() || l0VarA == null) {
            return;
        }
        i(l0VarA, dVar);
    }

    private final c q(d dVar) {
        c cVarRemove;
        Map<d, c> map = f99945g;
        synchronized (map) {
            try {
                cVarRemove = map.remove(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVarRemove;
    }

    @androidx.annotation.l1(otherwise = 2)
    @NotNull
    public final Map<d, c> l() {
        return f99945g;
    }
}
