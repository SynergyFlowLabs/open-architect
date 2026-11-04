package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.m;
import com.google.android.datatransport.runtime.w;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.h;
import com.google.firebase.components.j0;
import com.google.firebase.components.k;
import com.google.firebase.components.v;
import com.google.firebase.datatransport.TransportRegistrar;
import h8.b;
import h8.d;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ m a(h hVar) {
        w.f((Context) hVar.a(Context.class));
        return w.c().g(a.f103191j);
    }

    public static /* synthetic */ m b(h hVar) {
        w.f((Context) hVar.a(Context.class));
        return w.c().g(a.f103192k);
    }

    public static /* synthetic */ m c(h hVar) {
        w.f((Context) hVar.a(Context.class));
        return w.c().g(a.f103192k);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<g<?>> getComponents() {
        return Arrays.asList(g.h(m.class).h(LIBRARY_NAME).b(v.m(Context.class)).f(new k() { // from class: h8.e
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return TransportRegistrar.c(hVar);
            }
        }).d(), g.f(j0.a(b.class, m.class)).b(v.m(Context.class)).f(new k() { // from class: h8.f
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return TransportRegistrar.b(hVar);
            }
        }).d(), g.f(j0.a(d.class, m.class)).b(v.m(Context.class)).f(new k() { // from class: h8.g
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return TransportRegistrar.a(hVar);
            }
        }).d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, "19.0.0"));
    }
}
