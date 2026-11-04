package com.google.firebase.perf.session;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.l1;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.g;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class SessionManager extends com.google.firebase.perf.application.b {

    @e.a({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final com.google.firebase.perf.application.a appStateMonitor;
    private final Set<WeakReference<a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.c(UUID.randomUUID().toString()), com.google.firebase.perf.application.a.c());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, PerfSession perfSession) {
        sessionManager.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.f()) {
            sessionManager.gaugeManager.logGaugeMetadata(perfSession.j(), g.FOREGROUND);
        }
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private void logGaugeMetadataIfCollectionEnabled(g gVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.j(), gVar);
        }
    }

    private void startOrStopCollectingGauges(g gVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, gVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @l1
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        g gVar = g.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(gVar);
        startOrStopCollectingGauges(gVar);
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(g gVar) {
        super.onUpdateAppState(gVar);
        if (this.appStateMonitor.j()) {
            return;
        }
        if (gVar == g.FOREGROUND) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.g()) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(gVar);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.google.firebase.perf.session.b
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.b(this.f124080a, context, perfSession);
            }
        });
    }

    @l1
    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.g()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<a> weakReference) {
        synchronized (this.clients) {
            try {
                this.clients.remove(weakReference);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.j() == this.perfSession.j()) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<a>> it = this.clients.iterator();
                while (it.hasNext()) {
                    a aVar = it.next().get();
                    if (aVar != null) {
                        aVar.a(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.b());
        startOrStopCollectingGauges(this.appStateMonitor.b());
    }

    @l1
    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, com.google.firebase.perf.application.a aVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = aVar;
        registerForAppState();
    }
}
