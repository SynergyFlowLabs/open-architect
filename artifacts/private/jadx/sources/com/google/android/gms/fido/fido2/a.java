package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.internal.fido.a1;
import com.google.android.gms.internal.fido.d1;
import com.google.android.gms.internal.fido.z0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.google.android.gms.common.api.k<com.google.android.gms.common.api.a.d.C0969d> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f107077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f107078o;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f107077n = gVar;
        f107078o = new com.google.android.gms.common.api.a("Fido.FIDO2_API", new z0(), gVar);
    }

    @Deprecated
    public a(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f107078o, com.google.android.gms.common.api.a.d.N1, (z) new com.google.android.gms.common.api.internal.b());
    }

    @NonNull
    @Deprecated
    public Task<b> K0(@NonNull final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return r0(b0.a().f(5409).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.g
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a aVar = this.f107327a;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                ((d1) ((a1) obj).M()).n(new k(aVar, (com.google.android.gms.tasks.l) obj2), publicKeyCredentialCreationOptions2);
            }
        }).a());
    }

    @NonNull
    public Task<PendingIntent> L0(@NonNull final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return r0(b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.f
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a aVar = this.f107325a;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                ((d1) ((a1) obj).M()).n(new i(aVar, (com.google.android.gms.tasks.l) obj2), publicKeyCredentialCreationOptions2);
            }
        }).f(5407).a());
    }

    @NonNull
    @Deprecated
    public Task<b> M0(@NonNull final PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return r0(b0.a().f(5410).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.d
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a aVar = this.f107322a;
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = publicKeyCredentialRequestOptions;
                ((d1) ((a1) obj).M()).p(new l(aVar, (com.google.android.gms.tasks.l) obj2), publicKeyCredentialRequestOptions2);
            }
        }).a());
    }

    @NonNull
    public Task<PendingIntent> N0(@NonNull final PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return r0(b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.h
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a aVar = this.f107329a;
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = publicKeyCredentialRequestOptions;
                ((d1) ((a1) obj).M()).p(new j(aVar, (com.google.android.gms.tasks.l) obj2), publicKeyCredentialRequestOptions2);
            }
        }).f(5408).a());
    }

    @NonNull
    public Task<Boolean> O0() {
        return r0(b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.fido.fido2.e
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((d1) ((a1) obj).M()).s(new m(this.f107324a, (com.google.android.gms.tasks.l) obj2));
            }
        }).e(k6.c.f307598h).f(5411).a());
    }

    @Deprecated
    public a(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f107078o, com.google.android.gms.common.api.a.d.N1, new com.google.android.gms.common.api.internal.b());
    }
}
