package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.phone.b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends k implements b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a.g f107488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final a.AbstractC0967a f107489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f107490p;

    static {
        a.g gVar = new a.g();
        f107488n = gVar;
        q qVar = new q();
        f107489o = qVar;
        f107490p = new a("SmsCodeAutofill.API", qVar, gVar);
    }

    public u(Activity activity) {
        super(activity, (a<a.d.C0969d>) f107490p, a.d.N1, k.a.f106306c);
    }

    @Override // com.google.android.gms.auth.api.phone.b
    public final Task<Void> b() {
        return x0(b0.a().e(d.f107475a).c(new w() { // from class: com.google.android.gms.internal.auth-api-phone.p
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((k) ((z) obj).M()).s(new r(this.f107484a, (l) obj2));
            }
        }).f(1563).a());
    }

    @Override // com.google.android.gms.auth.api.phone.b
    public final Task<Boolean> j(final String str) {
        com.google.android.gms.common.internal.w.r(str);
        com.google.android.gms.common.internal.w.b(!str.isEmpty(), "The package name cannot be empty.");
        return r0(b0.a().e(d.f107475a).c(new w() { // from class: com.google.android.gms.internal.auth-api-phone.o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((k) ((z) obj).M()).p(str, new t(this.f107482a, (l) obj2));
            }
        }).f(1565).a());
    }

    @Override // com.google.android.gms.auth.api.phone.b
    public final Task<Integer> z() {
        return r0(b0.a().e(d.f107475a).c(new w() { // from class: com.google.android.gms.internal.auth-api-phone.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((k) ((z) obj).M()).n(new s(this.f107481a, (l) obj2));
            }
        }).f(1564).a());
    }

    public u(Context context) {
        super(context, (a<a.d.C0969d>) f107490p, a.d.N1, k.a.f106306c);
    }
}
