package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.components.b0;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.m;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private com.google.firebase.perf.v1.g applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final b0<c> cpuGaugeCollector;

    @p0
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final b0<ScheduledExecutorService> gaugeManagerExecutor;

    @p0
    private i gaugeMetadataManager;
    private final b0<l> memoryGaugeCollector;

    @p0
    private String sessionId;
    private final com.google.firebase.perf.transport.k transportManager;
    private static final com.google.firebase.perf.logging.a logger = com.google.firebase.perf.logging.a.e();
    private static final GaugeManager instance = new GaugeManager();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124083a;

        static {
            int[] iArr = new int[com.google.firebase.perf.v1.g.values().length];
            f124083a = iArr;
            try {
                iArr[com.google.firebase.perf.v1.g.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124083a[com.google.firebase.perf.v1.g.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @e.a({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new b0(new z8.b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // z8.b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), com.google.firebase.perf.transport.k.l(), com.google.firebase.perf.config.a.h(), null, new b0(new z8.b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // z8.b
            public final Object get() {
                return GaugeManager.c();
            }
        }), new b0(new z8.b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // z8.b
            public final Object get() {
                return GaugeManager.b();
            }
        }));
    }

    public static /* synthetic */ l b() {
        return new l();
    }

    public static /* synthetic */ c c() {
        return new c();
    }

    private long getCpuGaugeCollectionFrequencyMs(com.google.firebase.perf.v1.g gVar) {
        long jA;
        int i10 = a.f124083a[gVar.ordinal()];
        if (i10 != 1) {
            jA = i10 != 2 ? -1L : this.configResolver.B();
        } else {
            jA = this.configResolver.A();
        }
        if (c.f(jA)) {
            return -1L;
        }
        return jA;
    }

    private com.google.firebase.perf.v1.k getGaugeMetadata() {
        return com.google.firebase.perf.v1.k.um().Wl(this.gaugeMetadataManager.a()).Xl(this.gaugeMetadataManager.b()).Yl(this.gaugeMetadataManager.c()).build();
    }

    public static synchronized GaugeManager getInstance() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(com.google.firebase.perf.v1.g gVar) {
        long jD;
        int i10 = a.f124083a[gVar.ordinal()];
        if (i10 != 1) {
            jD = i10 != 2 ? -1L : this.configResolver.E();
        } else {
            jD = this.configResolver.D();
        }
        if (l.e(jD)) {
            return -1L;
        }
        return jD;
    }

    private boolean startCollectingCpuMetrics(long j10, Timer timer) {
        if (j10 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().i(j10, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, Timer timer) {
        if (j10 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().h(j10, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncFlush(String str, com.google.firebase.perf.v1.g gVar) {
        m.b bVarKm = m.Km();
        while (!this.cpuGaugeCollector.get().f124097a.isEmpty()) {
            bVarKm.Xl(this.cpuGaugeCollector.get().f124097a.poll());
        }
        while (!this.memoryGaugeCollector.get().f124122b.isEmpty()) {
            bVarKm.Tl(this.memoryGaugeCollector.get().f124122b.poll());
        }
        bVarKm.lm(str);
        this.transportManager.z(bVarKm.build(), gVar);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, com.google.firebase.perf.v1.g gVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.z(m.Km().lm(str).km(getGaugeMetadata()).build(), gVar);
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, final com.google.firebase.perf.v1.g gVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(gVar, perfSession.e());
        if (jStartCollectingGauges == -1) {
            logger.l("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strJ = perfSession.j();
        this.sessionId = strJ;
        this.applicationProcessState = gVar;
        try {
            long j10 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124106a.syncFlush(strJ, gVar);
                }
            }, j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.l("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final com.google.firebase.perf.v1.g gVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().j();
        this.memoryGaugeCollector.get().i();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            int i10 = 6 | 0;
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f124103a.syncFlush(str, gVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = com.google.firebase.perf.v1.g.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, Timer timer) {
        cVar.c(timer);
        lVar.c(timer);
    }

    @l1
    GaugeManager(b0<ScheduledExecutorService> b0Var, com.google.firebase.perf.transport.k kVar, com.google.firebase.perf.config.a aVar, i iVar, b0<c> b0Var2, b0<l> b0Var3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = com.google.firebase.perf.v1.g.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = b0Var;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = b0Var2;
        this.memoryGaugeCollector = b0Var3;
    }

    private long startCollectingGauges(com.google.firebase.perf.v1.g gVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(gVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(gVar);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
