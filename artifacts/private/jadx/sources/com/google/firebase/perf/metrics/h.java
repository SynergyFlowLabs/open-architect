package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class h implements com.google.firebase.perf.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124020f = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f124021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Timer f124022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f124023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f124024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f124025e;

    public h(String str, String str2, k kVar, Timer timer) {
        this.f124024d = false;
        this.f124025e = false;
        this.f124023c = new ConcurrentHashMap();
        this.f124022b = timer;
        i iVarO = i.c(kVar).A(str).o(str2);
        this.f124021a = iVarO;
        iVarO.q();
        if (com.google.firebase.perf.config.a.h().N()) {
            return;
        }
        f124020f.g("HttpMetric feature is disabled. URL %s", str);
        this.f124025e = true;
    }

    private void a(@NonNull String str, @NonNull String str2) {
        if (this.f124024d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (!this.f124023c.containsKey(str) && this.f124023c.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        com.google.firebase.perf.metrics.validator.e.d(str, str2);
    }

    public void b() {
        this.f124021a.x(this.f124022b.c());
    }

    public void c() {
        this.f124021a.z(this.f124022b.c());
    }

    public void d(int i10) {
        this.f124021a.p(i10);
    }

    public void e(long j10) {
        this.f124021a.t(j10);
    }

    public void f(@p0 String str) {
        this.f124021a.v(str);
    }

    public void g(long j10) {
        this.f124021a.w(j10);
    }

    @Override // com.google.firebase.perf.f
    @p0
    public String getAttribute(@NonNull String str) {
        return this.f124023c.get(str);
    }

    @Override // com.google.firebase.perf.f
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.f124023c);
    }

    public void h() {
        this.f124022b.h();
        this.f124021a.u(this.f124022b.f());
    }

    public void i() {
        if (this.f124025e) {
            return;
        }
        this.f124021a.y(this.f124022b.c()).n(this.f124023c).b();
        int i10 = 7 & 1;
        this.f124024d = true;
    }

    @Override // com.google.firebase.perf.f
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            a(str, str2);
            f124020f.b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f124021a.h());
            z10 = true;
        } catch (Exception e10) {
            f124020f.d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f124023c.put(str, str2);
        }
    }

    @Override // com.google.firebase.perf.f
    public void removeAttribute(@NonNull String str) {
        if (this.f124024d) {
            f124020f.c("Can't remove a attribute from a HttpMetric that's stopped.");
        } else {
            this.f124023c.remove(str);
        }
    }

    public h(URL url, String str, k kVar, Timer timer) {
        this(url.toString(), str, kVar, timer);
    }
}
