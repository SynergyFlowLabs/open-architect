package com.google.android.play.core.appupdate.internal;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final com.google.android.gms.tasks.l f114853a;

    t() {
        this.f114853a = null;
    }

    protected abstract void a();

    @p0
    final com.google.android.gms.tasks.l b() {
        return this.f114853a;
    }

    public final void c(Exception exc) {
        com.google.android.gms.tasks.l lVar = this.f114853a;
        if (lVar != null) {
            lVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public t(@p0 com.google.android.gms.tasks.l lVar) {
        this.f114853a = lVar;
    }
}
