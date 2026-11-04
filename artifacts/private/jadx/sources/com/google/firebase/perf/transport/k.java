package com.google.firebase.perf.transport;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.android.datatransport.m;
import com.google.android.gms.tasks.n;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.v1.q;
import com.google.firebase.perf.v1.s;
import com.google.firebase.perf.v1.t;
import com.google.firebase.perf.v1.x;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class k implements com.google.firebase.perf.application.a.b {
    private static final int H1 = 50;
    private static final int X = 0;
    private static final int Y = 1;
    private static final String Z = "KEY_AVAILABLE_TRACES_FOR_CACHING";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f124163g3 = 50;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f124164p0 = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f124165p1 = "KEY_AVAILABLE_GAUGES_FOR_CACHING";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f124166p2 = 50;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124167v = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final k f124168w = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f124169a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.firebase.h f124172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private com.google.firebase.perf.e f124173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.firebase.installations.k f124174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z8.b<m> f124175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f124176h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f124178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.firebase.perf.config.a f124179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f124180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.firebase.perf.application.a f124181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.firebase.perf.v1.e.b f124182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f124183o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f124184s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue<c> f124170b = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f124171c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f124185t = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExecutorService f124177i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @e.a({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f124169a = concurrentHashMap;
        concurrentHashMap.put(Z, 50);
        concurrentHashMap.put(f124164p0, 50);
        concurrentHashMap.put(f124165p1, 50);
    }

    private s E(s.b bVar, com.google.firebase.perf.v1.g gVar) {
        I();
        com.google.firebase.perf.v1.e.b bVarBm = this.f124182n.bm(gVar);
        if (bVar.Di() || bVar.Sf()) {
            bVarBm = bVarBm.clone().Ul(k());
        }
        return bVar.Yl(bVarBm).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public void G() {
        Context contextN = this.f124172d.n();
        this.f124178j = contextN;
        this.f124183o = contextN.getPackageName();
        this.f124179k = com.google.firebase.perf.config.a.h();
        this.f124180l = new d(this.f124178j, new com.google.firebase.perf.util.h(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f124181m = com.google.firebase.perf.application.a.c();
        this.f124176h = new b(this.f124175g, this.f124179k.b());
        i();
    }

    @m1
    private void H(s.b bVar, com.google.firebase.perf.v1.g gVar) {
        if (!x()) {
            if (v(bVar)) {
                f124167v.b("Transport is not initialized yet, %s will be queued for to be dispatched later", o(bVar));
                this.f124170b.add(new c(bVar, gVar));
                return;
            }
            return;
        }
        s sVarE = E(bVar, gVar);
        if (w(sVarE)) {
            h(sVarE);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    @m1
    private void I() {
        String str;
        if (this.f124179k.N() && (!this.f124182n.Md() || this.f124185t)) {
            try {
                str = (String) n.b(this.f124174f.getId(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                f124167v.d("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                str = null;
            } catch (ExecutionException e11) {
                f124167v.d("Unable to retrieve Installation Id: %s", e11.getMessage());
                str = null;
            } catch (TimeoutException e12) {
                f124167v.d("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                f124167v.l("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            } else {
                this.f124182n.Zl(str);
            }
        }
    }

    private void J() {
        if (this.f124173e == null && x()) {
            this.f124173e = com.google.firebase.perf.e.c();
        }
    }

    public static /* synthetic */ void b(k kVar, c cVar) {
        kVar.getClass();
        kVar.H(cVar.f124130a, cVar.f124131b);
    }

    public static /* synthetic */ void c(k kVar, x xVar, com.google.firebase.perf.v1.g gVar) {
        kVar.getClass();
        kVar.H(s.Am().fm(xVar), gVar);
    }

    public static /* synthetic */ void d(k kVar, q qVar, com.google.firebase.perf.v1.g gVar) {
        kVar.getClass();
        kVar.H(s.Am().dm(qVar), gVar);
    }

    public static /* synthetic */ void f(k kVar, com.google.firebase.perf.v1.m mVar, com.google.firebase.perf.v1.g gVar) {
        kVar.getClass();
        kVar.H(s.Am().bm(mVar), gVar);
    }

    @m1
    private void h(s sVar) {
        if (sVar.Di()) {
            f124167v.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", o(sVar), j(sVar.Hi()));
        } else {
            f124167v.g("Logging %s", o(sVar));
        }
        this.f124176h.b(sVar);
    }

    private void i() {
        this.f124181m.p(new WeakReference<>(f124168w));
        com.google.firebase.perf.v1.e.b bVarVm = com.google.firebase.perf.v1.e.vm();
        this.f124182n = bVarVm;
        bVarVm.cm(this.f124172d.s().j()).Xl(com.google.firebase.perf.v1.a.nm().Rl(this.f124183o).Tl(com.google.firebase.perf.a.f123833e).Vl(r(this.f124178j)));
        this.f124171c.set(true);
        while (!this.f124170b.isEmpty()) {
            final c cVarPoll = this.f124170b.poll();
            if (cVarPoll != null) {
                this.f124177i.execute(new Runnable() { // from class: com.google.firebase.perf.transport.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b(this.f124157a, cVarPoll);
                    }
                });
            }
        }
    }

    private String j(x xVar) {
        String name = xVar.getName();
        return name.startsWith(com.google.firebase.perf.util.b.f124203p) ? com.google.firebase.perf.logging.b.c(this.f124184s, this.f124183o, name) : com.google.firebase.perf.logging.b.a(this.f124184s, this.f124183o, name);
    }

    private Map<String, String> k() {
        J();
        com.google.firebase.perf.e eVar = this.f124173e;
        return eVar != null ? eVar.getAttributes() : Collections.EMPTY_MAP;
    }

    public static k l() {
        return f124168w;
    }

    private static String m(com.google.firebase.perf.v1.m mVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(mVar.pj()), Integer.valueOf(mVar.jd()), Integer.valueOf(mVar.g8()));
    }

    private static String n(q qVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", qVar.getUrl(), qVar.pf() ? String.valueOf(qVar.vg()) : "UNKNOWN", new DecimalFormat("#.####").format((qVar.dd() ? qVar.s8() : 0L) / 1000.0d));
    }

    private static String o(t tVar) {
        if (tVar.Di()) {
            return p(tVar.Hi());
        }
        if (tVar.Sf()) {
            return n(tVar.u9());
        }
        return tVar.re() ? m(tVar.ed()) : "log";
    }

    private static String p(x xVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", xVar.getName(), new DecimalFormat("#.####").format(xVar.Q1() / 1000.0d));
    }

    private static String r(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void s(s sVar) {
        if (sVar.Di()) {
            this.f124181m.h(com.google.firebase.perf.util.b.a.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (sVar.Sf()) {
            this.f124181m.h(com.google.firebase.perf.util.b.a.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    @m1
    private boolean v(t tVar) {
        Integer num = this.f124169a.get(Z);
        int iIntValue = num.intValue();
        Integer num2 = this.f124169a.get(f124164p0);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f124169a.get(f124165p1);
        int iIntValue3 = num3.intValue();
        if (tVar.Di() && iIntValue > 0) {
            this.f124169a.put(Z, Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (tVar.Sf() && iIntValue2 > 0) {
            this.f124169a.put(f124164p0, Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!tVar.re() || iIntValue3 <= 0) {
            f124167v.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", o(tVar), num, num2, num3);
            return false;
        }
        this.f124169a.put(f124165p1, Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    @m1
    private boolean w(s sVar) {
        if (!this.f124179k.N()) {
            f124167v.g("Performance collection is not enabled, dropping %s", o(sVar));
            return false;
        }
        if (!sVar.X8().Md()) {
            f124167v.m("App Instance ID is null or empty, dropping %s", o(sVar));
            return false;
        }
        if (!com.google.firebase.perf.metrics.validator.e.b(sVar, this.f124178j)) {
            f124167v.m("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", o(sVar));
            return false;
        }
        if (!this.f124180l.k(sVar)) {
            s(sVar);
            f124167v.g("Event dropped due to device sampling - %s", o(sVar));
            return false;
        }
        if (!this.f124180l.j(sVar)) {
            return true;
        }
        s(sVar);
        f124167v.g("Rate limited (per device) - %s", o(sVar));
        return false;
    }

    public void A(q qVar) {
        B(qVar, com.google.firebase.perf.v1.g.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    public void B(final q qVar, final com.google.firebase.perf.v1.g gVar) {
        this.f124177i.execute(new Runnable() { // from class: com.google.firebase.perf.transport.i
            @Override // java.lang.Runnable
            public final void run() {
                k.d(this.f124159a, qVar, gVar);
            }
        });
    }

    public void C(x xVar) {
        D(xVar, com.google.firebase.perf.v1.g.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    public void D(final x xVar, final com.google.firebase.perf.v1.g gVar) {
        this.f124177i.execute(new Runnable() { // from class: com.google.firebase.perf.transport.g
            @Override // java.lang.Runnable
            public final void run() {
                k.c(this.f124154a, xVar, gVar);
            }
        });
    }

    @l1
    protected void F(boolean z10) {
        this.f124171c.set(z10);
    }

    @l1
    protected void g() {
        this.f124182n.Pl();
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(com.google.firebase.perf.v1.g gVar) {
        this.f124185t = gVar == com.google.firebase.perf.v1.g.FOREGROUND;
        if (x()) {
            this.f124177i.execute(new Runnable() { // from class: com.google.firebase.perf.transport.e
                @Override // java.lang.Runnable
                public final void run() {
                    k kVar = this.f124150a;
                    kVar.f124180l.a(kVar.f124185t);
                }
            });
        }
    }

    @l1
    protected ConcurrentLinkedQueue<c> q() {
        return new ConcurrentLinkedQueue<>(this.f124170b);
    }

    public void t(@NonNull com.google.firebase.h hVar, @NonNull com.google.firebase.installations.k kVar, @NonNull z8.b<m> bVar) {
        this.f124172d = hVar;
        this.f124184s = hVar.s().n();
        this.f124174f = kVar;
        this.f124175g = bVar;
        this.f124177i.execute(new Runnable() { // from class: com.google.firebase.perf.transport.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f124162a.G();
            }
        });
    }

    @l1(otherwise = 5)
    void u(com.google.firebase.h hVar, com.google.firebase.perf.e eVar, com.google.firebase.installations.k kVar, z8.b<m> bVar, com.google.firebase.perf.config.a aVar, d dVar, com.google.firebase.perf.application.a aVar2, b bVar2, ExecutorService executorService) {
        this.f124172d = hVar;
        this.f124184s = hVar.s().n();
        this.f124178j = hVar.n();
        this.f124173e = eVar;
        this.f124174f = kVar;
        this.f124175g = bVar;
        this.f124179k = aVar;
        this.f124180l = dVar;
        this.f124181m = aVar2;
        this.f124176h = bVar2;
        this.f124177i = executorService;
        this.f124169a.put(Z, 50);
        this.f124169a.put(f124164p0, 50);
        this.f124169a.put(f124165p1, 50);
        i();
    }

    public boolean x() {
        return this.f124171c.get();
    }

    public void y(com.google.firebase.perf.v1.m mVar) {
        z(mVar, com.google.firebase.perf.v1.g.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    public void z(final com.google.firebase.perf.v1.m mVar, final com.google.firebase.perf.v1.g gVar) {
        this.f124177i.execute(new Runnable() { // from class: com.google.firebase.perf.transport.f
            @Override // java.lang.Runnable
            public final void run() {
                k.f(this.f124151a, mVar, gVar);
            }
        });
    }
}
