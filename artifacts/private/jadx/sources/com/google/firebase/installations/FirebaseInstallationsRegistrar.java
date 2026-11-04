package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j0;
import com.google.firebase.components.v;
import com.google.firebase.concurrent.y;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ k a(com.google.firebase.components.h hVar) {
        return new j((com.google.firebase.h) hVar.a(com.google.firebase.h.class), hVar.e(com.google.firebase.heartbeatinfo.j.class), (ExecutorService) hVar.j(j0.a(d8.a.class, ExecutorService.class)), y.h((Executor) hVar.j(j0.a(d8.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.g<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.g.h(k.class).h(LIBRARY_NAME).b(v.m(com.google.firebase.h.class)).b(v.k(com.google.firebase.heartbeatinfo.j.class)).b(v.l(j0.a(d8.a.class, ExecutorService.class))).b(v.l(j0.a(d8.b.class, Executor.class))).f(new com.google.firebase.components.k() { // from class: com.google.firebase.installations.m
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return FirebaseInstallationsRegistrar.a(hVar);
            }
        }).d(), com.google.firebase.heartbeatinfo.i.a(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, c.f123164d));
    }
}
