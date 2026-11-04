package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LastLocationRequest;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class a1 implements com.google.android.gms.common.api.internal.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ a1 f108082a = new a1();

    private /* synthetic */ a1() {
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ((d3) obj).E0(new LastLocationRequest.a().a(), (com.google.android.gms.tasks.l) obj2);
    }
}
