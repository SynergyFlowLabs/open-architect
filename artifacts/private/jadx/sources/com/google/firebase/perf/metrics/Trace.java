package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, com.google.firebase.perf.f, com.google.firebase.perf.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<com.google.firebase.perf.session.a> f123999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Trace f124000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GaugeManager f124001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f124002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Counter> f124003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f124004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<PerfSession> f124005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Trace> f124006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f124007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f124008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Timer f124009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Timer f124010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123996m = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map<String, Trace> f123997n = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    static final Parcelable.Creator<Trace> f123998o = new b();

    class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(@NonNull Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    private void b(@NonNull String str, @NonNull String str2) {
        if (o()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f124002d));
        }
        if (!this.f124004f.containsKey(str) && this.f124004f.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        com.google.firebase.perf.metrics.validator.e.d(str, str2);
    }

    @NonNull
    public static Trace c(@NonNull String str) {
        return new Trace(str);
    }

    @NonNull
    static synchronized Trace k(@NonNull String str) {
        Trace trace;
        Map<String, Trace> map = f123997n;
        trace = map.get(str);
        if (trace == null) {
            trace = new Trace(str);
            map.put(str, trace);
        }
        return trace;
    }

    @NonNull
    @l1
    static synchronized Trace l(@NonNull String str, @NonNull k kVar, @NonNull com.google.firebase.perf.util.a aVar, @NonNull com.google.firebase.perf.application.a aVar2) {
        Trace trace;
        try {
            Map<String, Trace> map = f123997n;
            trace = map.get(str);
            if (trace == null) {
                Trace trace2 = new Trace(str, kVar, aVar, aVar2, GaugeManager.getInstance());
                map.put(str, trace2);
                trace = trace2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return trace;
    }

    @NonNull
    private Counter p(@NonNull String str) {
        Counter counter = this.f124003e.get(str);
        if (counter == null) {
            counter = new Counter(str);
            this.f124003e.put(str, counter);
        }
        return counter;
    }

    private void q(Timer timer) {
        if (this.f124006h.isEmpty()) {
            return;
        }
        Trace trace = this.f124006h.get(this.f124006h.size() - 1);
        if (trace.f124010l == null) {
            trace.f124010l = timer;
        }
    }

    @p0
    static Trace s(@NonNull String str) {
        Trace trace = f123997n.get(str);
        if (trace != null) {
            trace.start();
        }
        return trace;
    }

    @p0
    static Trace u(@NonNull String str) {
        Map<String, Trace> map = f123997n;
        Trace trace = map.get(str);
        if (trace != null) {
            trace.stop();
            map.remove(str);
        }
        return trace;
    }

    @Override // com.google.firebase.perf.session.a
    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            f123996m.l("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!m() || o()) {
                return;
            }
            this.f124005g.add(perfSession);
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    @NonNull
    @l1
    Map<String, Counter> e() {
        return this.f124003e;
    }

    @l1
    Timer f() {
        return this.f124010l;
    }

    protected void finalize() throws Throwable {
        try {
            if (n()) {
                f123996m.m("Trace '%s' is started but not stopped when it is destructed!", this.f124002d);
                incrementTsnsCount(1);
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @NonNull
    @l1
    public String g() {
        return this.f124002d;
    }

    @Override // com.google.firebase.perf.f
    @Keep
    @p0
    public String getAttribute(@NonNull String str) {
        return this.f124004f.get(str);
    }

    @Override // com.google.firebase.perf.f
    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f124004f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? this.f124003e.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.a();
    }

    @l1
    List<PerfSession> h() {
        List<PerfSession> listUnmodifiableList;
        synchronized (this.f124005g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f124005g) {
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

    @l1
    Timer i() {
        return this.f124009k;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j10) {
        String strE = com.google.firebase.perf.metrics.validator.e.e(str);
        if (strE != null) {
            f123996m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!m()) {
            f123996m.m("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f124002d);
        } else {
            if (o()) {
                f123996m.m("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f124002d);
                return;
            }
            Counter counterP = p(str.trim());
            counterP.c(j10);
            f123996m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(counterP.a()), this.f124002d);
        }
    }

    @NonNull
    @l1
    List<Trace> j() {
        return this.f124006h;
    }

    @l1
    boolean m() {
        return this.f124009k != null;
    }

    @l1
    boolean n() {
        return m() && !o();
    }

    @l1
    boolean o() {
        return this.f124010l != null;
    }

    @Override // com.google.firebase.perf.f
    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f123996m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f124002d);
            z10 = true;
        } catch (Exception e10) {
            f123996m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f124004f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j10) {
        String strE = com.google.firebase.perf.metrics.validator.e.e(str);
        if (strE != null) {
            f123996m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!m()) {
            f123996m.m("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f124002d);
        } else if (o()) {
            f123996m.m("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f124002d);
        } else {
            p(str.trim()).e(j10);
            f123996m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f124002d);
        }
    }

    void r(@NonNull String str) {
        Timer timerA = this.f124008j.a();
        q(timerA);
        this.f124006h.add(new Trace(this, str, timerA, null, null, null, null));
    }

    @Override // com.google.firebase.perf.f
    @Keep
    public void removeAttribute(@NonNull String str) {
        if (o()) {
            f123996m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f124004f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.h().N()) {
            f123996m.a("Trace feature is disabled.");
            return;
        }
        String strF = com.google.firebase.perf.metrics.validator.e.f(this.f124002d);
        if (strF != null) {
            f123996m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f124002d, strF);
            return;
        }
        if (this.f124009k != null) {
            f123996m.d("Trace '%s' has already started, should not start again!", this.f124002d);
            return;
        }
        this.f124009k = this.f124008j.a();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f123999a);
        a(perfSession);
        if (perfSession.f()) {
            this.f124001c.collectGaugeMetricOnce(perfSession.e());
        }
    }

    @Keep
    public void stop() {
        if (!m()) {
            f123996m.d("Trace '%s' has not been started so unable to stop!", this.f124002d);
            return;
        }
        if (o()) {
            f123996m.d("Trace '%s' has already stopped, should not stop again!", this.f124002d);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f123999a);
        unregisterForAppState();
        Timer timerA = this.f124008j.a();
        this.f124010l = timerA;
        if (this.f124000b == null) {
            q(timerA);
            if (this.f124002d.isEmpty()) {
                f123996m.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.f124007i.D(new j(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().f()) {
                this.f124001c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e());
            }
        }
    }

    void t() {
        q(this.f124008j.a());
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeParcelable(this.f124000b, 0);
        parcel.writeString(this.f124002d);
        parcel.writeList(this.f124006h);
        parcel.writeMap(this.f124003e);
        parcel.writeParcelable(this.f124009k, 0);
        parcel.writeParcelable(this.f124010l, 0);
        synchronized (this.f124005g) {
            parcel.writeList(this.f124005g);
        }
    }

    private Trace(@NonNull String str) {
        this(str, k.l(), new com.google.firebase.perf.util.a(), com.google.firebase.perf.application.a.c(), GaugeManager.getInstance());
    }

    private Trace(@NonNull Trace trace, @NonNull String str, Timer timer, Timer timer2, @p0 List<Trace> list, @p0 Map<String, Counter> map, @p0 Map<String, String> map2) {
        this.f123999a = new WeakReference<>(this);
        this.f124000b = trace;
        this.f124002d = str.trim();
        this.f124009k = timer;
        this.f124010l = timer2;
        this.f124006h = list == null ? new ArrayList<>() : list;
        this.f124003e = map == null ? new ConcurrentHashMap<>() : map;
        this.f124004f = map2 == null ? new ConcurrentHashMap<>() : map2;
        this.f124008j = trace.f124008j;
        this.f124007i = trace.f124007i;
        this.f124005g = Collections.synchronizedList(new ArrayList());
        this.f124001c = trace.f124001c;
    }

    public Trace(@NonNull String str, @NonNull k kVar, @NonNull com.google.firebase.perf.util.a aVar, @NonNull com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(@NonNull String str, @NonNull k kVar, @NonNull com.google.firebase.perf.util.a aVar, @NonNull com.google.firebase.perf.application.a aVar2, @NonNull GaugeManager gaugeManager) {
        super(aVar2);
        this.f123999a = new WeakReference<>(this);
        this.f124000b = null;
        this.f124002d = str.trim();
        this.f124006h = new ArrayList();
        this.f124003e = new ConcurrentHashMap();
        this.f124004f = new ConcurrentHashMap();
        this.f124008j = aVar;
        this.f124007i = kVar;
        this.f124005g = Collections.synchronizedList(new ArrayList());
        this.f124001c = gaugeManager;
    }

    private Trace(@NonNull Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.c());
        this.f123999a = new WeakReference<>(this);
        this.f124000b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f124002d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f124006h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f124003e = concurrentHashMap;
        this.f124004f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f124009k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f124010l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f124005g = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z10) {
            this.f124007i = null;
            this.f124008j = null;
            this.f124001c = null;
        } else {
            this.f124007i = k.l();
            this.f124008j = new com.google.firebase.perf.util.a();
            this.f124001c = GaugeManager.getInstance();
        }
    }
}
