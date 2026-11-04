package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j0;
import com.google.firebase.components.v;
import com.google.firebase.crashlytics.internal.concurrency.n;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f120919d = "fire-cls";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0<ExecutorService> f120920a = j0.a(d8.a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0<ExecutorService> f120921b = j0.a(d8.b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0<ExecutorService> f120922c = j0.a(d8.c.class, ExecutorService.class);

    static {
        com.google.firebase.sessions.api.b.a(com.google.firebase.sessions.api.c.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics b(com.google.firebase.components.h hVar) {
        n.g(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics firebaseCrashlyticsB = FirebaseCrashlytics.b((com.google.firebase.h) hVar.a(com.google.firebase.h.class), (com.google.firebase.installations.k) hVar.a(com.google.firebase.installations.k.class), hVar.k(com.google.firebase.crashlytics.internal.a.class), hVar.k(com.google.firebase.analytics.connector.a.class), hVar.k(k9.a.class), (ExecutorService) hVar.j(this.f120920a), (ExecutorService) hVar.j(this.f120921b), (ExecutorService) hVar.j(this.f120922c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            com.google.firebase.crashlytics.internal.g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsB;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.g<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.g.h(FirebaseCrashlytics.class).h(f120919d).b(v.m(com.google.firebase.h.class)).b(v.m(com.google.firebase.installations.k.class)).b(v.l(this.f120920a)).b(v.l(this.f120921b)).b(v.l(this.f120922c)).b(v.b(com.google.firebase.crashlytics.internal.a.class)).b(v.b(com.google.firebase.analytics.connector.a.class)).b(v.b(k9.a.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.crashlytics.g
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return this.f120944a.b(hVar);
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(f120919d, "20.0.1"));
    }
}
