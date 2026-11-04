package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.internal.fido.u0;
import com.google.android.gms.internal.fido.v0;
import com.google.android.gms.internal.fido.y0;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class c extends com.google.android.gms.common.api.k<com.google.android.gms.common.api.a.d.C0969d> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f107320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f107321o;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f107320n = gVar;
        f107321o = new com.google.android.gms.common.api.a("Fido.FIDO2_PRIVILEGED_API", new u0(), gVar);
    }

    @Deprecated
    public c(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f107321o, com.google.android.gms.common.api.a.d.N1, (z) new com.google.android.gms.common.api.internal.b());
    }

    @NonNull
    public Task<List<FidoCredentialDetails>> K0(@NonNull final String str) {
        return r0(b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107336a;
                String str2 = str;
                ((y0) ((v0) obj).M()).n(new y(cVar, (com.google.android.gms.tasks.l) obj2), str2);
            }
        }).f(5430).a());
    }

    @NonNull
    @Deprecated
    public Task<b> L0(@NonNull final BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        return r0(b0.a().f(5414).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.r
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107344a;
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions2 = browserPublicKeyCredentialCreationOptions;
                ((y0) ((v0) obj).M()).p(new v(cVar, (com.google.android.gms.tasks.l) obj2), browserPublicKeyCredentialCreationOptions2);
            }
        }).a());
    }

    @NonNull
    public Task<PendingIntent> M0(@NonNull final BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        return r0(b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107338a;
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions2 = browserPublicKeyCredentialCreationOptions;
                ((y0) ((v0) obj).M()).p(new t(cVar, (com.google.android.gms.tasks.l) obj2), browserPublicKeyCredentialCreationOptions2);
            }
        }).f(5412).a());
    }

    @NonNull
    @Deprecated
    public Task<b> N0(@NonNull final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        return r0(b0.a().f(5415).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107342a;
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
                ((y0) ((v0) obj).M()).s(new w(cVar, (com.google.android.gms.tasks.l) obj2), browserPublicKeyCredentialRequestOptions2);
            }
        }).a());
    }

    @NonNull
    public Task<PendingIntent> O0(@NonNull final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        return r0(b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.p
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107340a;
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
                ((y0) ((v0) obj).M()).s(new u(cVar, (com.google.android.gms.tasks.l) obj2), browserPublicKeyCredentialRequestOptions2);
            }
        }).f(5413).a());
    }

    @NonNull
    public Task<Boolean> P0() {
        return r0(b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.s
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((y0) ((v0) obj).M()).u(new x(this.f107346a, (com.google.android.gms.tasks.l) obj2));
            }
        }).e(k6.c.f307598h).f(5416).a());
    }

    @Deprecated
    public c(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f107321o, com.google.android.gms.common.api.a.d.N1, new com.google.android.gms.common.api.internal.b());
    }
}
