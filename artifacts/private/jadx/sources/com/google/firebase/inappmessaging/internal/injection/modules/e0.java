package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.v2;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v2 f122759a;

    public e0(v2 v2Var) {
        this.f122759a = v2Var;
    }

    @q8.e
    @w8.f
    @ij.f
    public io.reactivex.flowables.a<String> c() {
        io.reactivex.flowables.a<String> aVarL4 = io.reactivex.l.w1(new io.reactivex.o() { // from class: com.google.firebase.inappmessaging.internal.injection.modules.c0
            @Override // io.reactivex.o
            public final void a(io.reactivex.n nVar) {
                this.f122750a.f122759a.b(new v2.a() { // from class: com.google.firebase.inappmessaging.internal.injection.modules.d0
                    @Override // com.google.firebase.inappmessaging.internal.v2.a
                    public final void a(String str) {
                        nVar.onNext(str);
                    }
                });
            }
        }, io.reactivex.b.BUFFER).L4();
        aVarL4.P8();
        return aVarL4;
    }

    @q8.e
    @w8.f
    @ij.f
    public v2 d() {
        return this.f122759a;
    }
}
