package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.firebase.perf.v1.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private g currentAppState;
    private boolean isRegisteredForAppState;

    protected b() {
        this(a.c());
    }

    public g getAppState() {
        return this.currentAppState;
    }

    @l1
    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    protected void incrementTsnsCount(int i10) {
        this.appStateMonitor.i(i10);
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(g gVar) {
        g gVar2 = this.currentAppState;
        g gVar3 = g.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (gVar2 == gVar3) {
            this.currentAppState = gVar;
            return;
        }
        if (gVar2 != gVar && gVar != gVar3) {
            this.currentAppState = g.FOREGROUND_BACKGROUND;
        }
    }

    protected void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.b();
        this.appStateMonitor.p(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    protected void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.x(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    protected b(@NonNull a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = g.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
