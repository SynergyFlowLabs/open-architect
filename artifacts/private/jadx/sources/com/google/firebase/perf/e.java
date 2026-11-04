package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.datatransport.m;
import com.google.firebase.installations.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.remoteconfig.d0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class e implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123903i = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f123904j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f123905k = 40;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f123906l = 100;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f123907m = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f123908a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f123909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.util.e f123910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Boolean f123911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.h f123912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z8.b<d0> f123913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f123914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z8.b<m> f123915h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: a2, reason: collision with root package name */
        public static final String f123916a2 = "GET";

        /* JADX INFO: renamed from: b2, reason: collision with root package name */
        public static final String f123917b2 = "PUT";

        /* JADX INFO: renamed from: c2, reason: collision with root package name */
        public static final String f123918c2 = "POST";

        /* JADX INFO: renamed from: d2, reason: collision with root package name */
        public static final String f123919d2 = "DELETE";

        /* JADX INFO: renamed from: e2, reason: collision with root package name */
        public static final String f123920e2 = "HEAD";

        /* JADX INFO: renamed from: f2, reason: collision with root package name */
        public static final String f123921f2 = "PATCH";

        /* JADX INFO: renamed from: g2, reason: collision with root package name */
        public static final String f123922g2 = "OPTIONS";

        /* JADX INFO: renamed from: h2, reason: collision with root package name */
        public static final String f123923h2 = "TRACE";

        /* JADX INFO: renamed from: i2, reason: collision with root package name */
        public static final String f123924i2 = "CONNECT";
    }

    @ij.a
    @l1
    e(com.google.firebase.h hVar, z8.b<d0> bVar, k kVar, z8.b<m> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f123911d = null;
        this.f123912e = hVar;
        this.f123913f = bVar;
        this.f123914g = kVar;
        this.f123915h = bVar2;
        if (hVar == null) {
            this.f123911d = Boolean.FALSE;
            this.f123909b = aVar;
            this.f123910c = new com.google.firebase.perf.util.e(new Bundle());
            return;
        }
        com.google.firebase.perf.transport.k.l().t(hVar, kVar, bVar2);
        Context contextN = hVar.n();
        com.google.firebase.perf.util.e eVarB = b(contextN);
        this.f123910c = eVarB;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f123909b = aVar;
        aVar.V(eVarB);
        aVar.R(contextN);
        sessionManager.setApplicationContext(contextN);
        this.f123911d = aVar.k();
        com.google.firebase.perf.logging.a aVar2 = f123903i;
        if (aVar2.h() && e()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", com.google.firebase.perf.logging.b.b(hVar.s().n(), contextN.getPackageName())));
        }
    }

    private void a(@p0 String str, @p0 String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Attribute must not have null key or value.");
        }
        if (!this.f123908a.containsKey(str) && this.f123908a.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.US, "Exceeds max limit of number of attributes - %d", 5));
        }
        com.google.firebase.perf.metrics.validator.e.d(str, str2);
    }

    private static com.google.firebase.perf.util.e b(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            e10.getMessage();
            bundle = null;
        }
        return bundle != null ? new com.google.firebase.perf.util.e(bundle) : new com.google.firebase.perf.util.e();
    }

    @NonNull
    public static e c() {
        return (e) com.google.firebase.h.p().l(e.class);
    }

    @NonNull
    public static Trace k(@NonNull String str) {
        Trace traceC = Trace.c(str);
        traceC.start();
        return traceC;
    }

    @l1
    Boolean d() {
        return this.f123911d;
    }

    public boolean e() {
        Boolean bool = this.f123911d;
        return bool != null ? bool.booleanValue() : com.google.firebase.h.p().A();
    }

    @NonNull
    public com.google.firebase.perf.metrics.h f(@NonNull String str, @NonNull String str2) {
        return new com.google.firebase.perf.metrics.h(str, str2, com.google.firebase.perf.transport.k.l(), new Timer());
    }

    @NonNull
    public com.google.firebase.perf.metrics.h g(@NonNull URL url, @NonNull String str) {
        return new com.google.firebase.perf.metrics.h(url, str, com.google.firebase.perf.transport.k.l(), new Timer());
    }

    @Override // com.google.firebase.perf.f
    @p0
    public String getAttribute(@NonNull String str) {
        return this.f123908a.get(str);
    }

    @Override // com.google.firebase.perf.f
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.f123908a);
    }

    @NonNull
    public Trace h(@NonNull String str) {
        return Trace.c(str);
    }

    public synchronized void i(@p0 Boolean bool) {
        try {
            try {
                com.google.firebase.h.p();
                if (this.f123909b.j().booleanValue()) {
                    f123903i.f("Firebase Performance is permanently disabled");
                    return;
                }
                this.f123909b.U(bool);
                if (bool != null) {
                    this.f123911d = bool;
                } else {
                    this.f123911d = this.f123909b.k();
                }
                if (Boolean.TRUE.equals(this.f123911d)) {
                    f123903i.f("Firebase Performance is Enabled");
                } else if (Boolean.FALSE.equals(this.f123911d)) {
                    f123903i.f("Firebase Performance is Disabled");
                }
            } catch (IllegalStateException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void j(boolean z10) {
        i(Boolean.valueOf(z10));
    }

    @Override // com.google.firebase.perf.f
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            a(str, str2);
            z10 = true;
        } catch (Exception e10) {
            f123903i.d("Can not set attribute %s with value %s (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f123908a.put(str, str2);
        }
    }

    @Override // com.google.firebase.perf.f
    public void removeAttribute(@NonNull String str) {
        this.f123908a.remove(str);
    }
}
