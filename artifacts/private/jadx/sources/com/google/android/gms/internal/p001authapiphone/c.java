package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.phone.g;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends g {
    public c(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.g, com.google.android.gms.auth.api.phone.f
    public final Task<Void> O(@p0 final String str) {
        return x0(b0.a().c(new w() { // from class: com.google.android.gms.internal.auth-api-phone.b0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((k) ((z) obj).M()).w(str, new b(this.f107472a, (l) obj2));
            }
        }).e(d.f107478d).f(1568).a());
    }

    @Override // com.google.android.gms.auth.api.phone.g, com.google.android.gms.auth.api.phone.f
    public final Task<Void> u() {
        return x0(b0.a().c(new w() { // from class: com.google.android.gms.internal.auth-api-phone.a0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((k) ((z) obj).M()).v(new c0(this.f107470a, (l) obj2));
            }
        }).e(d.f107477c).f(1567).a());
    }

    public c(Context context) {
        super(context);
    }
}
