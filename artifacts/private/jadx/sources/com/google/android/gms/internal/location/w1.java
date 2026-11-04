package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends com.google.android.gms.common.api.k implements com.google.android.gms.location.k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f108209n = 0;

    public w1(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) k0.f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }

    @Override // com.google.android.gms.location.k
    public final Task<Void> T(final PendingIntent pendingIntent) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.x1
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((d3) obj).B0(zzem.T1(pendingIntent), (com.google.android.gms.tasks.l) obj2);
            }
        }).f(2425).a());
    }

    @Override // com.google.android.gms.location.k
    public final Task<Void> e(final List<String> list) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.y1
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((d3) obj).B0(zzem.O1(list), (com.google.android.gms.tasks.l) obj2);
            }
        }).f(2425).a());
    }

    @Override // com.google.android.gms.location.k
    public final Task<Void> e0(final GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.z1
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((d3) obj).A0(geofencingRequest, pendingIntent, (com.google.android.gms.tasks.l) obj2);
            }
        }).f(2424).a());
    }

    public w1(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) k0.f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }
}
