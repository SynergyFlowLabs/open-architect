package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.b;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class u<A extends com.google.android.gms.common.api.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f106210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final Feature[] f106211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f106212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106213d;

    @g6.a
    protected u(@NonNull o<L> oVar, @androidx.annotation.p0 Feature[] featureArr, boolean z10, int i10) {
        this.f106210a = oVar;
        this.f106211b = featureArr;
        this.f106212c = z10;
        this.f106213d = i10;
    }

    @g6.a
    public void a() {
        this.f106210a.a();
    }

    @androidx.annotation.p0
    @g6.a
    public o.a<L> b() {
        return this.f106210a.b();
    }

    @androidx.annotation.p0
    @g6.a
    public Feature[] c() {
        return this.f106211b;
    }

    @g6.a
    protected abstract void d(@NonNull A a10, @NonNull com.google.android.gms.tasks.l<Void> lVar) throws RemoteException;

    public final int e() {
        return this.f106213d;
    }

    public final boolean f() {
        return this.f106212c;
    }

    @g6.a
    protected u(@NonNull o<L> oVar) {
        this(oVar, null, false, 0);
    }

    @g6.a
    protected u(@NonNull o<L> oVar, @NonNull Feature[] featureArr, boolean z10) {
        this(oVar, featureArr, z10, 0);
    }
}
