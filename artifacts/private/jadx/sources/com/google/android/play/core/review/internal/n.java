package com.google.android.play.core.review.internal;

/* JADX INFO: loaded from: classes4.dex */
final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f114955b;

    n(t tVar) {
        this.f114955b = tVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        synchronized (this.f114955b.f114966f) {
            try {
                if (this.f114955b.f114971k.get() > 0 && this.f114955b.f114971k.decrementAndGet() > 0) {
                    this.f114955b.f114962b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.f114955b;
                if (tVar.f114973m != null) {
                    tVar.f114962b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.f114955b;
                    tVar2.f114961a.unbindService(tVar2.f114972l);
                    this.f114955b.f114967g = false;
                    this.f114955b.f114973m = null;
                    this.f114955b.f114972l = null;
                }
                this.f114955b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
