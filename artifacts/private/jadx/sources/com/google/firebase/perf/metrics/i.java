package com.google.firebase.perf.metrics;

import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.m;
import com.google.firebase.perf.v1.q;
import com.google.firebase.perf.v1.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends com.google.firebase.perf.application.b implements com.google.firebase.perf.session.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124026i = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f124027j = 31;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f124028k = 127;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<PerfSession> f124029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GaugeManager f124030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f124031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q.b f124032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference<com.google.firebase.perf.session.a> f124033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private String f124034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f124035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f124036h;

    private i(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.c(), GaugeManager.getInstance());
    }

    public static i c(k kVar) {
        return new i(kVar);
    }

    private boolean j() {
        return this.f124032d.H7();
    }

    private boolean l() {
        return this.f124032d.dd();
    }

    private static boolean m(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    public i A(@p0 String str) {
        if (str != null) {
            this.f124032d.xm(m.f(m.e(str), 2000));
        }
        return this;
    }

    public i B(@p0 String str) {
        this.f124034f = str;
        return this;
    }

    @Override // com.google.firebase.perf.session.a
    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            f124026i.l("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!j() || l()) {
                return;
            }
            this.f124029a.add(perfSession);
        }
    }

    public q b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f124033e);
        unregisterForAppState();
        u[] uVarArrB = PerfSession.b(f());
        if (uVarArrB != null) {
            this.f124032d.Ol(Arrays.asList(uVarArrB));
        }
        q qVarBuild = this.f124032d.build();
        if (!com.google.firebase.perf.network.h.c(this.f124034f)) {
            f124026i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return qVarBuild;
        }
        if (this.f124035g) {
            if (this.f124036h) {
                f124026i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return qVarBuild;
        }
        this.f124031c.B(qVarBuild, getAppState());
        this.f124035g = true;
        return qVarBuild;
    }

    @l1
    void e() {
        this.f124032d.clear();
    }

    @l1
    List<PerfSession> f() {
        List<PerfSession> listUnmodifiableList;
        synchronized (this.f124029a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f124029a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    public long g() {
        return this.f124032d.Gj();
    }

    public String h() {
        return this.f124032d.getUrl();
    }

    public boolean i() {
        return this.f124032d.pf();
    }

    @l1
    boolean k() {
        return this.f124035g;
    }

    public i n(Map<String, String> map) {
        this.f124032d.Ul().gm(map);
        return this;
    }

    public i o(@p0 String str) {
        if (str != null) {
            q.d dVar = q.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = q.d.OPTIONS;
                    break;
                case "GET":
                    dVar = q.d.GET;
                    break;
                case "PUT":
                    dVar = q.d.PUT;
                    break;
                case "HEAD":
                    dVar = q.d.HEAD;
                    break;
                case "POST":
                    dVar = q.d.POST;
                    break;
                case "PATCH":
                    dVar = q.d.PATCH;
                    break;
                case "TRACE":
                    dVar = q.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = q.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = q.d.DELETE;
                    break;
            }
            this.f124032d.lm(dVar);
        }
        return this;
    }

    public i p(int i10) {
        this.f124032d.mm(i10);
        return this;
    }

    public void q() {
        this.f124036h = true;
    }

    public i r() {
        this.f124032d.nm(q.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    @l1
    void s() {
        this.f124035g = true;
    }

    public i t(long j10) {
        this.f124032d.qm(j10);
        return this;
    }

    public i u(long j10) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f124033e);
        this.f124032d.km(j10);
        a(perfSession);
        if (perfSession.f()) {
            this.f124030b.collectGaugeMetricOnce(perfSession.e());
        }
        return this;
    }

    public i v(@p0 String str) {
        if (str == null) {
            this.f124032d.am();
            return this;
        }
        if (m(str)) {
            this.f124032d.rm(str);
            return this;
        }
        f124026i.l("The content type of the response is not a valid content-type:" + str);
        return this;
    }

    public i w(long j10) {
        this.f124032d.tm(j10);
        return this;
    }

    public i x(long j10) {
        this.f124032d.um(j10);
        return this;
    }

    public i y(long j10) {
        this.f124032d.vm(j10);
        if (SessionManager.getInstance().perfSession().f()) {
            this.f124030b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e());
        }
        return this;
    }

    public i z(long j10) {
        this.f124032d.wm(j10);
        return this;
    }

    public i(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f124032d = q.bn();
        this.f124033e = new WeakReference<>(this);
        this.f124031c = kVar;
        this.f124030b = gaugeManager;
        this.f124029a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
