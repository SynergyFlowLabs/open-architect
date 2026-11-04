package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.k;
import com.google.firebase.components.v;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    public interface a<T> {
        String a(T t10);
    }

    private h() {
    }

    public static com.google.firebase.components.g<?> b(String str, String str2) {
        return com.google.firebase.components.g.p(f.a(str, str2), f.class);
    }

    public static com.google.firebase.components.g<?> c(final String str, final a<Context> aVar) {
        return com.google.firebase.components.g.r(f.class).b(v.m(Context.class)).f(new k() { // from class: com.google.firebase.platforminfo.g
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return f.a(str, aVar.a((Context) hVar.a(Context.class)));
            }
        }).d();
    }
}
