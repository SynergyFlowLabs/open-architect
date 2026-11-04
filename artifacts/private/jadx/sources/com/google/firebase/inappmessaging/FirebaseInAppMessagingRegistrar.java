package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j0;
import com.google.firebase.inappmessaging.internal.injection.modules.e0;
import com.google.firebase.inappmessaging.internal.v2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private j0<Executor> backgroundExecutor = j0.a(d8.a.class, Executor.class);
    private j0<Executor> blockingExecutor = j0.a(d8.b.class, Executor.class);
    private j0<Executor> lightWeightExecutor = j0.a(d8.c.class, Executor.class);
    private j0<com.google.android.datatransport.m> legacyTransportFactory = j0.a(h8.b.class, com.google.android.datatransport.m.class);

    /* JADX INFO: Access modifiers changed from: private */
    public m providesFirebaseInAppMessaging(com.google.firebase.components.h hVar) {
        com.google.firebase.h hVar2 = (com.google.firebase.h) hVar.a(com.google.firebase.h.class);
        com.google.firebase.installations.k kVar = (com.google.firebase.installations.k) hVar.a(com.google.firebase.installations.k.class);
        z8.a aVarK = hVar.k(com.google.firebase.analytics.connector.a.class);
        m8.d dVar = (m8.d) hVar.a(m8.d.class);
        com.google.firebase.inappmessaging.internal.injection.components.d dVarD = com.google.firebase.inappmessaging.internal.injection.components.c.a().c(new com.google.firebase.inappmessaging.internal.injection.modules.n((Application) hVar2.n())).b(new com.google.firebase.inappmessaging.internal.injection.modules.k(aVarK, dVar)).a(new com.google.firebase.inappmessaging.internal.injection.modules.a()).h(new e0(new v2())).e(new com.google.firebase.inappmessaging.internal.injection.modules.q((Executor) hVar.j(this.lightWeightExecutor), (Executor) hVar.j(this.backgroundExecutor), (Executor) hVar.j(this.blockingExecutor))).d();
        return com.google.firebase.inappmessaging.internal.injection.components.b.a().e(new com.google.firebase.inappmessaging.internal.c(((com.google.firebase.abt.component.a) hVar.a(com.google.firebase.abt.component.a.class)).b("fiam"), (Executor) hVar.j(this.blockingExecutor))).b(new com.google.firebase.inappmessaging.internal.injection.modules.d(hVar2, kVar, dVarD.m())).d(new com.google.firebase.inappmessaging.internal.injection.modules.z(hVar2)).c(dVarD).a((com.google.android.datatransport.m) hVar.j(this.legacyTransportFactory)).build().b();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.g<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.g.h(m.class).h(LIBRARY_NAME).b(com.google.firebase.components.v.m(Context.class)).b(com.google.firebase.components.v.m(com.google.firebase.installations.k.class)).b(com.google.firebase.components.v.m(com.google.firebase.h.class)).b(com.google.firebase.components.v.m(com.google.firebase.abt.component.a.class)).b(com.google.firebase.components.v.b(com.google.firebase.analytics.connector.a.class)).b(com.google.firebase.components.v.l(this.legacyTransportFactory)).b(com.google.firebase.components.v.m(m8.d.class)).b(com.google.firebase.components.v.l(this.backgroundExecutor)).b(com.google.firebase.components.v.l(this.blockingExecutor)).b(com.google.firebase.components.v.l(this.lightWeightExecutor)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.inappmessaging.u
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return this.f123126a.providesFirebaseInAppMessaging(hVar);
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, "21.0.2"));
    }
}
