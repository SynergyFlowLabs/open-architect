package androidx.media2.exoplayer.external.decoder;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53763a;

    public final void c(int flag) {
        this.f53763a = flag | this.f53763a;
    }

    public void o() {
        this.f53763a = 0;
    }

    public final void p(int flag) {
        this.f53763a = (~flag) & this.f53763a;
    }

    protected final boolean q(int flag) {
        return (this.f53763a & flag) == flag;
    }

    public final boolean r() {
        return q(268435456);
    }

    public final boolean s() {
        return q(Integer.MIN_VALUE);
    }

    public final boolean t() {
        return q(4);
    }

    public final boolean v() {
        return q(1);
    }

    public final void w(int flags) {
        this.f53763a = flags;
    }
}
