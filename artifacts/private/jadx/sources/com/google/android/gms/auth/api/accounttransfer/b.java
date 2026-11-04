package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public class b extends com.google.android.gms.common.api.k<v> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f105097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f105098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f105099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f105100q = 0;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f105097n = gVar;
        g gVar2 = new g();
        f105098o = gVar2;
        f105099p = new com.google.android.gms.common.api.a("AccountTransfer.ACCOUNT_TRANSFER_API", gVar2, gVar);
    }

    b(@NonNull Activity activity, @p0 v vVar) {
        super(activity, (com.google.android.gms.common.api.a<v>) f105099p, v.f105117b, new com.google.android.gms.common.api.k.a.C0970a().c(new com.google.android.gms.common.api.internal.b()).a());
    }

    @NonNull
    public Task<DeviceMetaData> K0(@NonNull String str) {
        com.google.android.gms.common.internal.w.r(str);
        return r0(new l(this, 1608, new zzaq(str)));
    }

    @NonNull
    public Task<Void> L0(@NonNull String str, int i10) {
        com.google.android.gms.common.internal.w.r(str);
        return x0(new n(this, 1610, new zzav(str, i10)));
    }

    @NonNull
    public Task<byte[]> M0(@NonNull String str) {
        com.google.android.gms.common.internal.w.r(str);
        return r0(new j(this, 1607, new zzax(str)));
    }

    @NonNull
    public Task<Void> N0(@NonNull String str, @NonNull byte[] bArr) {
        com.google.android.gms.common.internal.w.r(str);
        com.google.android.gms.common.internal.w.r(bArr);
        return x0(new h(this, 1606, new zzaz(str, bArr)));
    }

    @NonNull
    public Task<Void> O0(@NonNull String str, @NonNull PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.w.r(str);
        com.google.android.gms.common.internal.w.r(pendingIntent);
        return x0(new m(this, 1609, new zzbb(str, pendingIntent)));
    }

    b(@NonNull Context context, @p0 v vVar) {
        super(context, (com.google.android.gms.common.api.a<v>) f105099p, v.f105117b, new com.google.android.gms.common.api.k.a.C0970a().c(new com.google.android.gms.common.api.internal.b()).a());
    }
}
