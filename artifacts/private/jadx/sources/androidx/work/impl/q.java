package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.lifecycle.c1;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class q implements androidx.work.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c1<androidx.work.a0.b> f77097c = new c1<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<androidx.work.a0.b.c> f77098d = androidx.work.impl.utils.futures.c.u();

    public q() {
        a(androidx.work.a0.f76490b);
    }

    public void a(@NonNull androidx.work.a0.b state) {
        this.f77097c.o(state);
        if (state instanceof androidx.work.a0.b.c) {
            this.f77098d.p((androidx.work.a0.b.c) state);
        } else if (state instanceof androidx.work.a0.b.a) {
            this.f77098d.q(((androidx.work.a0.b.a) state).a());
        }
    }

    @Override // androidx.work.a0
    @NonNull
    public t1<androidx.work.a0.b.c> getResult() {
        return this.f77098d;
    }

    @Override // androidx.work.a0
    @NonNull
    public androidx.lifecycle.w0<androidx.work.a0.b> getState() {
        return this.f77097c;
    }
}
