package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b0 implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final q0 f57249a;

    public b0() {
        this(null);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l.a
    public l a() {
        a0 a0Var = new a0();
        q0 q0Var = this.f57249a;
        if (q0Var != null) {
            a0Var.c(q0Var);
        }
        return a0Var;
    }

    public b0(@androidx.annotation.p0 q0 listener) {
        this.f57249a = listener;
    }
}
