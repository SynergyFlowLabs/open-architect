package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.h;
import com.google.firebase.components.v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@g6.a
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.analytics.connector.a lambda$getComponents$0(h hVar) {
        return com.google.firebase.analytics.connector.b.j((com.google.firebase.h) hVar.a(com.google.firebase.h.class), (Context) hVar.a(Context.class), (m8.d) hVar.a(m8.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @g6.a
    @e.a({"MissingPermission"})
    public List<com.google.firebase.components.g<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.g.h(com.google.firebase.analytics.connector.a.class).b(v.m(com.google.firebase.h.class)).b(v.m(Context.class)).b(v.m(m8.d.class)).f(b.f120714a).e().d(), com.google.firebase.platforminfo.h.b("fire-analytics", "23.0.0"));
    }
}
