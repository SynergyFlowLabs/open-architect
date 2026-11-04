package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.api.k;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.fido.h1;
import com.google.android.gms.internal.fido.i1;
import com.google.android.gms.internal.fido.j1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a extends k<com.google.android.gms.common.api.a.d.C0969d> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f107353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f107354o;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f107353n = gVar;
        f107354o = new com.google.android.gms.common.api.a("Fido.U2F_API", new i1(), gVar);
    }

    public a(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f107354o, com.google.android.gms.common.api.a.d.N1, (z) new com.google.android.gms.common.api.internal.b());
    }

    @NonNull
    public Task<b> K0(@NonNull final RegisterRequestParams registerRequestParams) {
        return r0(b0.a().f(5424).c(new w() { // from class: com.google.android.gms.fido.u2f.d
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a aVar = this.f107458a;
                RegisterRequestParams registerRequestParams2 = registerRequestParams;
                ((h1) ((j1) obj).M()).n(new e(aVar, (l) obj2), registerRequestParams2);
            }
        }).a());
    }

    @NonNull
    public Task<b> L0(@NonNull final SignRequestParams signRequestParams) {
        return r0(b0.a().f(5425).c(new w() { // from class: com.google.android.gms.fido.u2f.c
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a aVar = this.f107456a;
                SignRequestParams signRequestParams2 = signRequestParams;
                ((h1) ((j1) obj).M()).p(new f(aVar, (l) obj2), signRequestParams2);
            }
        }).a());
    }

    public a(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f107354o, com.google.android.gms.common.api.a.d.N1, new com.google.android.gms.common.api.internal.b());
    }
}
