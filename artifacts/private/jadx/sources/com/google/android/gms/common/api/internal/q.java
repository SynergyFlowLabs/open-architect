package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class q implements com.google.android.gms.common.api.a.f, ServiceConnection {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f106171m = "q";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final ComponentName f106174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f106175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f106176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f106177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f106178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private IBinder f106179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f106180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private String f106181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private String f106182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.wrappers.a f106183l;

    @g6.a
    public q(@NonNull Context context, @NonNull Looper looper, @NonNull ComponentName componentName, @NonNull f fVar, @NonNull r rVar) {
        this(context, looper, null, null, componentName, fVar, rVar);
    }

    @androidx.annotation.m1
    private final void C() {
        if (Thread.currentThread() != this.f106177f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public static /* synthetic */ void y(@NonNull q qVar) {
        qVar.f106180i = false;
        qVar.f106179h = null;
        qVar.f106176e.k(1);
    }

    public static /* synthetic */ void z(@NonNull q qVar, @NonNull IBinder iBinder) {
        qVar.f106180i = false;
        qVar.f106179h = iBinder;
        String.valueOf(iBinder);
        qVar.f106176e.i(new Bundle());
    }

    public final void A(@androidx.annotation.p0 com.google.android.gms.common.wrappers.a aVar) {
        this.f106183l = aVar;
    }

    public final void B(@androidx.annotation.p0 String str) {
        this.f106182k = str;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    @androidx.annotation.m1
    public final void d() {
        C();
        String.valueOf(this.f106179h);
        try {
            this.f106175d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f106180i = false;
        this.f106179h = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @androidx.annotation.m1
    public final void e(@NonNull String str) {
        C();
        this.f106181j = str;
        d();
    }

    @Override // com.google.android.gms.common.api.a.f
    @androidx.annotation.m1
    public final boolean f() {
        C();
        return this.f106180i;
    }

    @Override // com.google.android.gms.common.api.a.f
    @androidx.annotation.m1
    public final void g(@NonNull com.google.android.gms.common.internal.f.c cVar) {
        C();
        String.valueOf(this.f106179h);
        if (isConnected()) {
            try {
                e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f106174c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f106172a).setAction(this.f106173b);
            }
            boolean zBindService = this.f106175d.bindService(intent, this, com.google.android.gms.common.internal.l.d());
            this.f106180i = zBindService;
            if (!zBindService) {
                this.f106179h = null;
                this.f106178g.n(new ConnectionResult(16));
            }
            String.valueOf(this.f106179h);
        } catch (SecurityException e10) {
            this.f106180i = false;
            this.f106179h = null;
            throw e10;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    @androidx.annotation.p0
    public final IBinder i() {
        return null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @androidx.annotation.m1
    public final boolean isConnected() {
        C();
        return this.f106179h != null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Set<Scope> j() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void k(@androidx.annotation.p0 com.google.android.gms.common.internal.o oVar, @androidx.annotation.p0 Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void m(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int n() {
        return 0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull final IBinder iBinder) {
        this.f106177f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.l2
            @Override // java.lang.Runnable
            public final void run() {
                q.z(this.f106118a, iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f106177f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.k2
            @Override // java.lang.Runnable
            public final void run() {
                q.y(this.f106111a);
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Intent p() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final String q() {
        String str = this.f106172a;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.w.r(this.f106174c);
        return this.f106174c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Feature[] r() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean s() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void t(@NonNull com.google.android.gms.common.internal.f.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Feature[] v() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    @androidx.annotation.p0
    public final String w() {
        return this.f106181j;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    @g6.a
    public IBinder x() {
        C();
        return this.f106179h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r7 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private q(android.content.Context r3, android.os.Looper r4, @androidx.annotation.p0 java.lang.String r5, @androidx.annotation.p0 java.lang.String r6, @androidx.annotation.p0 android.content.ComponentName r7, com.google.android.gms.common.api.internal.f r8, com.google.android.gms.common.api.internal.r r9) {
        /*
            r2 = this;
            r1 = 3
            r2.<init>()
            r0 = 0
            r1 = 3
            r2.f106180i = r0
            r0 = 0
            r2.f106181j = r0
            r2.f106175d = r3
            r1 = 0
            com.google.android.gms.internal.base.q r3 = new com.google.android.gms.internal.base.q
            r3.<init>(r4)
            r2.f106177f = r3
            r2.f106176e = r8
            r2.f106178g = r9
            r1 = 4
            if (r5 == 0) goto L23
            if (r6 == 0) goto L23
            if (r7 != 0) goto L2f
            r7 = r0
            r1 = 1
            goto L26
        L23:
            r1 = 3
            if (r7 == 0) goto L2f
        L26:
            r2.f106172a = r5
            r1 = 3
            r2.f106173b = r6
            r2.f106174c = r7
            r1 = 6
            return
        L2f:
            r1 = 5
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r1 = 2
            r2.<init>(r3)
            r1 = 4
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.q.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.r):void");
    }

    @g6.a
    public q(@NonNull Context context, @NonNull Looper looper, @NonNull String str, @NonNull String str2, @NonNull f fVar, @NonNull r rVar) {
        this(context, looper, str, str2, null, fVar, rVar);
    }
}
