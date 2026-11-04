package com.google.firebase.platforminfo;

import com.google.firebase.components.k;
import com.google.firebase.components.v;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f124410b;

    c(Set<f> set, d dVar) {
        this.f124409a = c(set);
        this.f124410b = dVar;
    }

    public static /* synthetic */ i a(com.google.firebase.components.h hVar) {
        return new c(hVar.d(f.class), d.a());
    }

    public static com.google.firebase.components.g<i> b() {
        return com.google.firebase.components.g.h(i.class).b(v.q(f.class)).f(new k() { // from class: com.google.firebase.platforminfo.b
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return c.a(hVar);
            }
        }).d();
    }

    private static String c(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // com.google.firebase.platforminfo.i
    public String getUserAgent() {
        if (this.f124410b.b().isEmpty()) {
            return this.f124409a;
        }
        return this.f124409a + ' ' + c(this.f124410b.b());
    }
}
