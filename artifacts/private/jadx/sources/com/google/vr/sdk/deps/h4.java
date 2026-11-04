package com.google.vr.sdk.deps;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class h4 extends e4 {
    private h4() {
        super((byte) 0);
    }

    private static <E> u3<E> f(Object obj, long j10) {
        return (u3) f6.I(obj, j10);
    }

    @Override // com.google.vr.sdk.deps.e4
    final <L> List<L> b(Object obj, long j10) {
        u3 u3VarF = f(obj, j10);
        if (u3VarF.y()) {
            return u3VarF;
        }
        int size = u3VarF.size();
        u3 u3VarN3 = u3VarF.N3(size == 0 ? 10 : size << 1);
        f6.l(obj, j10, u3VarN3);
        return u3VarN3;
    }

    @Override // com.google.vr.sdk.deps.e4
    final <E> void c(Object obj, Object obj2, long j10) {
        u3 u3VarF = f(obj, j10);
        u3 u3VarF2 = f(obj2, j10);
        int size = u3VarF.size();
        int size2 = u3VarF2.size();
        if (size > 0 && size2 > 0) {
            if (!u3VarF.y()) {
                u3VarF = u3VarF.N3(size2 + size);
            }
            u3VarF.addAll(u3VarF2);
        }
        if (size > 0) {
            u3VarF2 = u3VarF;
        }
        f6.l(obj, j10, u3VarF2);
    }

    @Override // com.google.vr.sdk.deps.e4
    final void e(Object obj, long j10) {
        f(obj, j10).b();
    }

    /* synthetic */ h4(byte b10) {
        this();
    }
}
