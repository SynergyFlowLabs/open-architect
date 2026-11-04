package io.noties.markwon;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class w extends io.noties.markwon.a {

    class a implements m.c<org.commonmark.node.y> {
        a() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull m mVar, @NonNull org.commonmark.node.y yVar) {
            mVar.p();
        }
    }

    @NonNull
    public static w l() {
        return new w();
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void d(@NonNull m.b bVar) {
        bVar.a(org.commonmark.node.y.class, new a());
    }
}
