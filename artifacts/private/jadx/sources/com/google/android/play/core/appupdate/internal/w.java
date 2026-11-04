package com.google.android.play.core.appupdate.internal;

/* JADX INFO: loaded from: classes4.dex */
final class w extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f114857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f114858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d0 f114859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(d0 d0Var, com.google.android.gms.tasks.l lVar, com.google.android.gms.tasks.l lVar2, t tVar) {
        super(lVar);
        this.f114859d = d0Var;
        this.f114857b = lVar2;
        this.f114858c = tVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        synchronized (this.f114859d.f114828f) {
            try {
                d0.n(this.f114859d, this.f114857b);
                if (this.f114859d.f114833k.getAndIncrement() > 0) {
                    this.f114859d.f114824b.d("Already connected to the service.", new Object[0]);
                }
                d0.p(this.f114859d, this.f114858c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
