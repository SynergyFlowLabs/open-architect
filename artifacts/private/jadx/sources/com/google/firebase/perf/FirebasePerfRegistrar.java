package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.android.datatransport.m;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j0;
import com.google.firebase.installations.k;
import com.google.firebase.remoteconfig.d0;
import com.google.firebase.v;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static /* synthetic */ b b(j0 j0Var, com.google.firebase.components.h hVar) {
        return new b((com.google.firebase.h) hVar.a(com.google.firebase.h.class), (v) hVar.e(v.class).get(), (Executor) hVar.j(j0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e providesFirebasePerformance(com.google.firebase.components.h hVar) {
        hVar.a(b.class);
        return com.google.firebase.perf.injection.components.a.a().b(new com.google.firebase.perf.injection.modules.a((com.google.firebase.h) hVar.a(com.google.firebase.h.class), (k) hVar.a(k.class), hVar.e(d0.class), hVar.e(m.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.g<?>> getComponents() {
        final j0 j0VarA = j0.a(d8.d.class, Executor.class);
        return Arrays.asList(com.google.firebase.components.g.h(e.class).h(LIBRARY_NAME).b(com.google.firebase.components.v.m(com.google.firebase.h.class)).b(com.google.firebase.components.v.o(d0.class)).b(com.google.firebase.components.v.m(k.class)).b(com.google.firebase.components.v.o(m.class)).b(com.google.firebase.components.v.m(b.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.perf.c
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return FirebasePerfRegistrar.providesFirebasePerformance(hVar);
            }
        }).d(), com.google.firebase.components.g.h(b.class).h(EARLY_LIBRARY_NAME).b(com.google.firebase.components.v.m(com.google.firebase.h.class)).b(com.google.firebase.components.v.k(v.class)).b(com.google.firebase.components.v.l(j0VarA)).e().f(new com.google.firebase.components.k() { // from class: com.google.firebase.perf.d
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return FirebasePerfRegistrar.b(j0VarA, hVar);
            }
        }).d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, a.f123835g));
    }
}
