package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.n;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import com.google.android.datatransport.runtime.w;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f103598f = Logger.getLogger(w.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f103599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f103600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f103601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f103602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b6.b f103603e;

    @ij.a
    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, y yVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, b6.b bVar) {
        this.f103600b = executor;
        this.f103601c = eVar;
        this.f103599a = yVar;
        this.f103602d = dVar;
        this.f103603e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, r rVar, j jVar) {
        cVar.f103602d.te(rVar, jVar);
        int i10 = 2 ^ 1;
        cVar.f103599a.b(rVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final r rVar, n nVar, j jVar) {
        cVar.getClass();
        try {
            com.google.android.datatransport.runtime.backends.n nVar2 = cVar.f103601c.get(rVar.b());
            if (nVar2 == null) {
                String str = String.format("Transport backend '%s' is not registered", rVar.b());
                f103598f.warning(str);
                nVar.a(new IllegalArgumentException(str));
            } else {
                final j jVarA = nVar2.a(jVar);
                cVar.f103603e.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.b
                    @Override // b6.b.a
                    public final Object execute() {
                        return c.b(this.f103595a, rVar, jVarA);
                    }
                });
                nVar.a(null);
            }
        } catch (Exception e10) {
            f103598f.warning("Error scheduling event " + e10.getMessage());
            nVar.a(e10);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.e
    public void a(final r rVar, final j jVar, final n nVar) {
        this.f103600b.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f103591a, rVar, nVar, jVar);
            }
        });
    }
}
