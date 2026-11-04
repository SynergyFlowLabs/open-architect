package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a extends k<f> implements com.google.android.gms.signin.f {

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final /* synthetic */ int f110933z3 = 0;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final boolean f110934v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private final com.google.android.gms.common.internal.h f110935w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final Bundle f110936x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @p0
    private final Integer f110937y3;

    public a(@NonNull Context context, @NonNull Looper looper, boolean z10, @NonNull com.google.android.gms.common.internal.h hVar, @NonNull Bundle bundle, @NonNull l.b bVar, @NonNull l.c cVar) {
        super(context, looper, 44, hVar, bVar, cVar);
        this.f110934v3 = true;
        this.f110935w3 = hVar;
        this.f110936x3 = bundle;
        this.f110937y3 = hVar.l();
    }

    @NonNull
    @g6.a
    public static Bundle w0(@NonNull com.google.android.gms.common.internal.h hVar) {
        hVar.k();
        Integer numL = hVar.l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", hVar.b());
        if (numL != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numL.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final Bundle I() {
        if (!G().getPackageName().equals(this.f110935w3.h())) {
            this.f110936x3.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f110935w3.h());
        }
        return this.f110936x3;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void c() {
        try {
            ((f) M()).s(((Integer) w.r(this.f110937y3)).intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final boolean h() {
        return this.f110934v3;
    }

    @Override // com.google.android.gms.signin.f
    public final void l() {
        g(new com.google.android.gms.common.internal.f.d());
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void o(@NonNull o oVar, boolean z10) {
        try {
            ((f) M()).u(oVar, ((Integer) w.r(this.f110937y3)).intValue(), z10);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void u(e eVar) {
        w.s(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountD = this.f110935w3.d();
            ((f) M()).v(new zai(1, new zat(accountD, ((Integer) w.r(this.f110937y3)).intValue(), "<<default account>>".equals(accountD.name) ? com.google.android.gms.auth.api.signin.internal.b.b(G()).c() : null)), eVar);
        } catch (RemoteException e10) {
            try {
                eVar.v9(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final /* synthetic */ IInterface z(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder);
    }
}
