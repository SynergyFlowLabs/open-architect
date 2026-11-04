package com.google.firebase.perf.transport;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.m;
import com.google.firebase.perf.v1.s;
import com.google.firebase.perf.v1.u;
import com.google.firebase.perf.v1.w;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f124132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f124133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f124134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f124135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f124136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f124137f;

    static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.perf.logging.a f124138k = com.google.firebase.perf.logging.a.e();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f124139l = TimeUnit.SECONDS.toMicros(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.firebase.perf.util.a f124140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f124141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Timer f124142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.firebase.perf.util.h f124143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f124144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private double f124145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.firebase.perf.util.h f124146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.firebase.perf.util.h f124147h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f124148i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f124149j;

        a(com.google.firebase.perf.util.h hVar, long j10, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, @j9.a String str, boolean z10) {
            this.f124140a = aVar;
            this.f124144e = j10;
            this.f124143d = hVar;
            this.f124145f = j10;
            this.f124142c = aVar.a();
            m(aVar2, str, z10);
            this.f124141b = z10;
        }

        private static long e(com.google.firebase.perf.config.a aVar, @j9.a String str) {
            return str == j9.a.K3 ? aVar.G() : aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, @j9.a String str) {
            return str == j9.a.K3 ? aVar.u() : aVar.u();
        }

        private static long g(com.google.firebase.perf.config.a aVar, @j9.a String str) {
            return str == j9.a.K3 ? aVar.H() : aVar.s();
        }

        private static long h(com.google.firebase.perf.config.a aVar, @j9.a String str) {
            return str == j9.a.K3 ? aVar.u() : aVar.u();
        }

        private void m(com.google.firebase.perf.config.a aVar, @j9.a String str, boolean z10) {
            long jH = h(aVar, str);
            long jG = g(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.google.firebase.perf.util.h hVar = new com.google.firebase.perf.util.h(jG, jH, timeUnit);
            this.f124146g = hVar;
            this.f124148i = jG;
            if (z10) {
                f124138k.b("Foreground %s logging rate:%f, burst capacity:%d", str, hVar, Long.valueOf(jG));
            }
            long jF = f(aVar, str);
            long jE = e(aVar, str);
            com.google.firebase.perf.util.h hVar2 = new com.google.firebase.perf.util.h(jE, jF, timeUnit);
            this.f124147h = hVar2;
            this.f124149j = jE;
            if (z10) {
                f124138k.b("Background %s logging rate:%f, capacity:%d", str, hVar2, Long.valueOf(jE));
            }
        }

        synchronized void a(boolean z10) {
            try {
                this.f124143d = z10 ? this.f124146g : this.f124147h;
                this.f124144e = z10 ? this.f124148i : this.f124149j;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean b(@NonNull s sVar) {
            try {
                Timer timerA = this.f124140a.a();
                double dE = (this.f124142c.e(timerA) * this.f124143d.a()) / f124139l;
                if (dE > 0.0d) {
                    this.f124145f = Math.min(this.f124145f + dE, this.f124144e);
                    this.f124142c = timerA;
                }
                double d10 = this.f124145f;
                if (d10 >= 1.0d) {
                    this.f124145f = d10 - 1.0d;
                    return true;
                }
                if (this.f124141b) {
                    f124138k.l("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @l1
        long c() {
            return this.f124149j;
        }

        @l1
        com.google.firebase.perf.util.h d() {
            return this.f124147h;
        }

        @l1
        long i() {
            return this.f124148i;
        }

        @l1
        com.google.firebase.perf.util.h j() {
            return this.f124146g;
        }

        @l1
        com.google.firebase.perf.util.h k() {
            return this.f124143d;
        }

        @l1
        void l(com.google.firebase.perf.util.h hVar) {
            this.f124143d = hVar;
        }
    }

    public d(@NonNull Context context, com.google.firebase.perf.util.h hVar, long j10) {
        this(hVar, j10, new com.google.firebase.perf.util.a(), e(), e(), com.google.firebase.perf.config.a.h());
        this.f124137f = m.c(context);
    }

    @l1
    static double e() {
        return new Random().nextDouble();
    }

    private boolean f(List<u> list) {
        return list.size() > 0 && list.get(0).Mj() > 0 && list.get(0).ik(0) == w.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean g() {
        return this.f124134c < this.f124132a.g();
    }

    private boolean h() {
        if (this.f124133b >= this.f124132a.t()) {
            return false;
        }
        boolean z10 = true & true;
        return true;
    }

    private boolean i() {
        return this.f124133b < this.f124132a.I();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f124135d.a(z10);
        this.f124136e.a(z10);
    }

    @l1
    boolean b() {
        return g();
    }

    @l1
    boolean c() {
        return h();
    }

    @l1
    boolean d() {
        return i();
    }

    boolean j(s sVar) {
        boolean zB;
        if (!m(sVar)) {
            return false;
        }
        if (sVar.Sf()) {
            zB = this.f124136e.b(sVar);
        } else {
            if (!sVar.Di()) {
                return true;
            }
            zB = this.f124135d.b(sVar);
        }
        return !zB;
    }

    boolean k(s sVar) {
        if (sVar.Di() && !i() && !f(sVar.Hi().C7())) {
            return false;
        }
        if (!l(sVar) || g() || f(sVar.Hi().C7())) {
            return !sVar.Sf() || h() || f(sVar.u9().C7());
        }
        return false;
    }

    protected boolean l(s sVar) {
        return sVar.Di() && sVar.Hi().getName().startsWith(com.google.firebase.perf.util.b.f124203p) && sVar.Hi().x1(com.google.firebase.perf.util.b.f124205r);
    }

    boolean m(@NonNull s sVar) {
        return (!sVar.Di() || (!(sVar.Hi().getName().equals(com.google.firebase.perf.util.b.EnumC1180b.FOREGROUND_TRACE_NAME.toString()) || sVar.Hi().getName().equals(com.google.firebase.perf.util.b.EnumC1180b.BACKGROUND_TRACE_NAME.toString())) || sVar.Hi().Nc() <= 0)) && !sVar.re();
    }

    d(com.google.firebase.perf.util.h hVar, long j10, com.google.firebase.perf.util.a aVar, double d10, double d11, com.google.firebase.perf.config.a aVar2) {
        this.f124135d = null;
        this.f124136e = null;
        boolean z10 = false;
        this.f124137f = false;
        m.b(0.0d <= d10 && d10 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d11 && d11 < 1.0d) {
            z10 = true;
        }
        m.b(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f124133b = d10;
        this.f124134c = d11;
        this.f124132a = aVar2;
        this.f124135d = new a(hVar, j10, aVar, aVar2, j9.a.K3, this.f124137f);
        this.f124136e = new a(hVar, j10, aVar, aVar2, j9.a.L3, this.f124137f);
    }
}
