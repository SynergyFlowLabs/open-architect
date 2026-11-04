package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f124596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("this")
    private final t f124597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f124598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.h f124599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.k f124600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f124601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f124602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f124603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f124604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f124605j;

    public class a implements com.google.firebase.remoteconfig.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.firebase.remoteconfig.d f124606a;

        public a(com.google.firebase.remoteconfig.d dVar) {
            this.f124606a = dVar;
        }

        @Override // com.google.firebase.remoteconfig.e
        public void remove() {
            q.this.d(this.f124606a);
        }
    }

    public q(com.google.firebase.h hVar, com.google.firebase.installations.k kVar, n nVar, g gVar, Context context, String str, u uVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f124596a = linkedHashSet;
        this.f124597b = new t(hVar, kVar, nVar, gVar, context, str, linkedHashSet, uVar, scheduledExecutorService);
        this.f124599d = hVar;
        this.f124598c = nVar;
        this.f124600e = kVar;
        this.f124601f = gVar;
        this.f124602g = context;
        this.f124603h = str;
        this.f124604i = uVar;
        this.f124605j = scheduledExecutorService;
    }

    private synchronized void c() {
        try {
            if (!this.f124596a.isEmpty()) {
                this.f124597b.E();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(com.google.firebase.remoteconfig.d dVar) {
        try {
            this.f124596a.remove(dVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public synchronized com.google.firebase.remoteconfig.e b(@NonNull com.google.firebase.remoteconfig.d dVar) {
        try {
            this.f124596a.add(dVar);
            c();
        } catch (Throwable th2) {
            throw th2;
        }
        return new a(dVar);
    }

    public synchronized void e(boolean z10) {
        try {
            this.f124597b.B(z10);
            if (!z10) {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
