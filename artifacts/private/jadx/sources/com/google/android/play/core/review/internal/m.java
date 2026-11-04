package com.google.android.play.core.review.internal;

/* JADX INFO: loaded from: classes4.dex */
final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f114952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f114953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f114954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, com.google.android.gms.tasks.l lVar, com.google.android.gms.tasks.l lVar2, j jVar) {
        super(lVar);
        this.f114952b = lVar2;
        this.f114953c = jVar;
        this.f114954d = tVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        synchronized (this.f114954d.f114966f) {
            try {
                t.n(this.f114954d, this.f114952b);
                if (this.f114954d.f114971k.getAndIncrement() > 0) {
                    this.f114954d.f114962b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f114954d, this.f114953c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
