package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes4.dex */
final class c0 implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f105906a;

    c0(d dVar) {
        this.f105906a = dVar;
    }

    @Override // com.google.android.gms.common.api.p.a
    public final void a(Status status) {
        synchronized (this.f105906a.f105911v) {
            try {
                if (this.f105906a.g()) {
                    return;
                }
                if (status.n2()) {
                    this.f105906a.f105909t = true;
                } else if (!status.q2()) {
                    this.f105906a.f105908s = true;
                }
                this.f105906a.f105907r--;
                d dVar = this.f105906a;
                if (dVar.f105907r == 0) {
                    if (dVar.f105909t) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.f();
                    } else {
                        Status status2 = dVar.f105908s ? new Status(13) : Status.f105886f;
                        d dVar2 = this.f105906a;
                        dVar2.o(new e(status2, dVar2.f105910u));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
