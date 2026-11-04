package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends com.google.android.gms.common.api.k implements com.google.android.gms.auth.api.proxy.c {
    public l0(@NonNull Activity activity, @androidx.annotation.p0 com.google.android.gms.auth.api.c cVar) {
        super(activity, com.google.android.gms.auth.api.b.f105147a, cVar == null ? com.google.android.gms.auth.api.c.f105151b : cVar, com.google.android.gms.common.api.k.a.f106306c);
    }

    @Override // com.google.android.gms.auth.api.proxy.c
    public final Task<ProxyResponse> S(@NonNull final ProxyRequest proxyRequest) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth.i0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                l0 l0Var = this.f107654a;
                ProxyRequest proxyRequest2 = proxyRequest;
                ((e0) ((b0) obj).M()).s(new j0(l0Var, (com.google.android.gms.tasks.l) obj2), proxyRequest2);
            }
        }).f(1518).a());
    }

    @Override // com.google.android.gms.auth.api.proxy.c
    public final Task<String> m() {
        return r0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth.h0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((e0) ((b0) obj).M()).p(new k0(this.f107644a, (com.google.android.gms.tasks.l) obj2));
            }
        }).f(1520).a());
    }

    public l0(@NonNull Context context, @androidx.annotation.p0 com.google.android.gms.auth.api.c cVar) {
        super(context, com.google.android.gms.auth.api.b.f105147a, cVar == null ? com.google.android.gms.auth.api.c.f105151b : cVar, com.google.android.gms.common.api.k.a.f106306c);
    }
}
