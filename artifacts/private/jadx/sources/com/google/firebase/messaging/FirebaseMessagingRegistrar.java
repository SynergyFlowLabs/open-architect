package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@g6.a
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(com.google.firebase.components.j0 j0Var, com.google.firebase.components.h hVar) {
        return new FirebaseMessaging((com.google.firebase.h) hVar.a(com.google.firebase.h.class), (p8.a) hVar.a(p8.a.class), hVar.e(com.google.firebase.platforminfo.i.class), hVar.e(com.google.firebase.heartbeatinfo.k.class), (com.google.firebase.installations.k) hVar.a(com.google.firebase.installations.k.class), hVar.g(j0Var), (m8.d) hVar.a(m8.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.g<?>> getComponents() {
        final com.google.firebase.components.j0 j0VarA = com.google.firebase.components.j0.a(h8.d.class, com.google.android.datatransport.m.class);
        return Arrays.asList(com.google.firebase.components.g.h(FirebaseMessaging.class).h(LIBRARY_NAME).b(com.google.firebase.components.v.m(com.google.firebase.h.class)).b(com.google.firebase.components.v.i(p8.a.class)).b(com.google.firebase.components.v.k(com.google.firebase.platforminfo.i.class)).b(com.google.firebase.components.v.k(com.google.firebase.heartbeatinfo.k.class)).b(com.google.firebase.components.v.m(com.google.firebase.installations.k.class)).b(com.google.firebase.components.v.j(j0VarA)).b(com.google.firebase.components.v.m(m8.d.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.messaging.h0
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return FirebaseMessagingRegistrar.a(j0VarA, hVar);
            }
        }).c().d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, b.f123426d));
    }
}
