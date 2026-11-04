package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.phone.c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends k implements c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a.g f107493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final a.AbstractC0967a f107494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f107495p;

    static {
        a.g gVar = new a.g();
        f107493n = gVar;
        w wVar = new w();
        f107494o = wVar;
        f107495p = new a("SmsCodeBrowser.API", wVar, gVar);
    }

    public y(Activity activity) {
        super(activity, (a<a.d.C0969d>) f107495p, a.d.N1, k.a.f106306c);
    }

    @Override // com.google.android.gms.auth.api.phone.c
    public final Task<Void> b() {
        return x0(b0.a().e(d.f107476b).c(new w() { // from class: com.google.android.gms.internal.auth-api-phone.v
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((k) ((z) obj).M()).u(new x(this.f107491a, (l) obj2));
            }
        }).f(1566).a());
    }

    public y(Context context) {
        super(context, (a<a.d.C0969d>) f107495p, a.d.N1, k.a.f106306c);
    }
}
