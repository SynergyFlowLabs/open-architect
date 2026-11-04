package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.h;
import com.google.firebase.components.k;
import com.google.firebase.components.v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(h hVar) {
        return new a((Context) hVar.a(Context.class), hVar.e(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<g<?>> getComponents() {
        return Arrays.asList(g.h(a.class).h(LIBRARY_NAME).b(v.m(Context.class)).b(v.k(com.google.firebase.analytics.connector.a.class)).f(new k() { // from class: com.google.firebase.abt.component.b
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return AbtRegistrar.a(hVar);
            }
        }).d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, c.f120441d));
    }
}
