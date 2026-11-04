package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.internal.k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final GoogleSignInOptions f105678v3;

    public h(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, @p0 GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.l.b bVar, com.google.android.gms.common.api.l.c cVar) {
        super(context, looper, 91, hVar, bVar, cVar);
        GoogleSignInOptions.a aVar = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar.l(com.google.android.gms.internal.p000authapi.t.a());
        if (!hVar.e().isEmpty()) {
            Iterator<Scope> it = hVar.e().iterator();
            while (it.hasNext()) {
                aVar.g(it.next(), new Scope[0]);
            }
        }
        this.f105678v3 = aVar.b();
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final Intent p() {
        return p.c(G(), this.f105678v3);
    }

    public final GoogleSignInOptions w0() {
        return this.f105678v3;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof v ? (v) iInterfaceQueryLocalInterface : new v(iBinder);
    }
}
