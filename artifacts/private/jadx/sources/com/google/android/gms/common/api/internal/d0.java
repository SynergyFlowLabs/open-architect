package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a.b;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class d0<A extends com.google.android.gms.common.api.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.a f105984a;

    @g6.a
    protected d0(@NonNull o.a<L> aVar) {
        this.f105984a = aVar;
    }

    @NonNull
    @g6.a
    public o.a<L> a() {
        return this.f105984a;
    }

    @g6.a
    protected abstract void b(@NonNull A a10, @NonNull com.google.android.gms.tasks.l<Boolean> lVar) throws RemoteException;
}
