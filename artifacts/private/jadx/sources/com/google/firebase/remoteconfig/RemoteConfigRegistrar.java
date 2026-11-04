package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ d0 a(j0 j0Var, com.google.firebase.components.h hVar) {
        return new d0((Context) hVar.a(Context.class), (ScheduledExecutorService) hVar.j(j0Var), (com.google.firebase.h) hVar.a(com.google.firebase.h.class), (com.google.firebase.installations.k) hVar.a(com.google.firebase.installations.k.class), ((com.google.firebase.abt.component.a) hVar.a(com.google.firebase.abt.component.a.class)).b(com.google.firebase.abt.d.a.Q1), hVar.e(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.g<?>> getComponents() {
        final j0 j0VarA = j0.a(d8.b.class, ScheduledExecutorService.class);
        return Arrays.asList(com.google.firebase.components.g.i(d0.class, k9.a.class).h(LIBRARY_NAME).b(com.google.firebase.components.v.m(Context.class)).b(com.google.firebase.components.v.l(j0VarA)).b(com.google.firebase.components.v.m(com.google.firebase.h.class)).b(com.google.firebase.components.v.m(com.google.firebase.installations.k.class)).b(com.google.firebase.components.v.m(com.google.firebase.abt.component.a.class)).b(com.google.firebase.components.v.k(com.google.firebase.analytics.connector.a.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.remoteconfig.h0
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return RemoteConfigRegistrar.a(j0VarA, hVar);
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, b.f124425d));
    }
}
