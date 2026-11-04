package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f103699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f103700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f103701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b6.b f103702d;

    @ij.a
    w(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, b6.b bVar) {
        this.f103699a = executor;
        this.f103700b = dVar;
        this.f103701c = yVar;
        this.f103702d = bVar;
    }

    public static /* synthetic */ Object a(w wVar) {
        Iterator<com.google.android.datatransport.runtime.r> it = wVar.f103700b.E9().iterator();
        while (it.hasNext()) {
            wVar.f103701c.b(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f103699a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.u
            @Override // java.lang.Runnable
            public final void run() {
                w wVar = this.f103697a;
                wVar.f103702d.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.v
                    @Override // b6.b.a
                    public final Object execute() {
                        return w.a(wVar);
                    }
                });
            }
        });
    }
}
