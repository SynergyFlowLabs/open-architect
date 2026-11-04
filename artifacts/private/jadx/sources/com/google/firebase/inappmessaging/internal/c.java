package com.google.firebase.inappmessaging.internal;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@x8.a
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.abt.d f122594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.l1
    Executor f122595b;

    @ij.a
    public c(com.google.firebase.abt.d dVar, @d8.b Executor executor) {
        this.f122594a = dVar;
        this.f122595b = executor;
    }

    public static /* synthetic */ void a(c cVar, ArrayList arrayList) {
        cVar.getClass();
        try {
            p2.a("Updating running experiments with: " + arrayList.size() + " experiments");
            cVar.f122594a.q(arrayList);
        } catch (com.google.firebase.abt.a e10) {
            p2.b("Unable to register experiments with ABT, missing analytics?\n" + e10.getMessage());
        }
    }

    public static /* synthetic */ void b(c cVar, com.google.firebase.inappmessaging.i.d dVar) {
        cVar.getClass();
        try {
            p2.a("Updating active experiment: " + dVar.toString());
            cVar.f122594a.o(new com.google.firebase.abt.b(dVar.H1(), dVar.Fj(), dVar.ce(), new Date(dVar.wk()), dVar.Wa(), dVar.D8()));
        } catch (com.google.firebase.abt.a e10) {
            p2.b("Unable to set experiment as active with ABT, missing analytics?\n" + e10.getMessage());
        }
    }

    void c(final com.google.firebase.inappmessaging.i.d dVar) {
        this.f122595b.execute(new Runnable() { // from class: com.google.firebase.inappmessaging.internal.b
            @Override // java.lang.Runnable
            public final void run() {
                c.b(this.f122587a, dVar);
            }
        });
    }

    void d(com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        final ArrayList arrayList = new ArrayList();
        for (com.google.internal.firebase.inappmessaging.v1.a.f fVar : iVar.hg()) {
            if (!fVar.Fh() && fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.EXPERIMENTAL_PAYLOAD)) {
                com.google.firebase.inappmessaging.i.d dVarOb = fVar.hk().ob();
                arrayList.add(new com.google.firebase.abt.b(dVarOb.H1(), dVarOb.Fj(), dVarOb.ce(), new Date(dVarOb.wk()), dVarOb.Wa(), dVarOb.D8()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f122595b.execute(new Runnable() { // from class: com.google.firebase.inappmessaging.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                c.a(this.f122578a, arrayList);
            }
        });
    }
}
