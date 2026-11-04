package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final d4 f108324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    e5 f108325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    final c f108326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rh f108327d;

    public c1() {
        d4 d4Var = new d4();
        this.f108324a = d4Var;
        this.f108325b = d4Var.f108354b.c();
        this.f108326c = new c();
        this.f108327d = new rh();
        d4Var.f108356d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f108288a.g();
            }
        });
        d4Var.f108356d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new i9(this.f108271a.f108326c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f108324a.f108356d.a(str, callable);
    }

    public final boolean b(b bVar) throws d2 {
        try {
            c cVar = this.f108326c;
            cVar.b(bVar);
            this.f108324a.f108355c.e("runtime.counter", new i(Double.valueOf(0.0d)));
            this.f108327d.b(this.f108325b.c(), cVar);
            return c() || d();
        } catch (Throwable th2) {
            throw new d2(th2);
        }
    }

    public final boolean c() {
        c cVar = this.f108326c;
        return !cVar.c().equals(cVar.a());
    }

    public final boolean d() {
        return !this.f108326c.f().isEmpty();
    }

    public final c e() {
        return this.f108326c;
    }

    public final void f(i8 i8Var) throws d2 {
        j jVar;
        try {
            d4 d4Var = this.f108324a;
            this.f108325b = d4Var.f108354b.c();
            if (d4Var.a(this.f108325b, (m8[]) i8Var.E().toArray(new m8[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (f8 f8Var : i8Var.F().E()) {
                List listF = f8Var.F();
                String strE = f8Var.E();
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    p pVarA = d4Var.a(this.f108325b, (m8) it.next());
                    if (!(pVarA instanceof m)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    e5 e5Var = this.f108325b;
                    if (e5Var.d(strE)) {
                        p pVarH = e5Var.h(strE);
                        if (!(pVarH instanceof j)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strE)));
                        }
                        jVar = (j) pVarH;
                    } else {
                        jVar = null;
                    }
                    if (jVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strE)));
                    }
                    jVar.a(this.f108325b, Collections.singletonList(pVarA));
                }
            }
        } catch (Throwable th2) {
            throw new d2(th2);
        }
    }

    final /* synthetic */ j g() {
        return new nh(this.f108327d);
    }
}
