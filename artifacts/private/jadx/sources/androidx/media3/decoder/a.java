package androidx.media3.decoder;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62681a;

    public final void c(int i10) {
        this.f62681a = i10 | this.f62681a;
    }

    @androidx.annotation.i
    public void o() {
        this.f62681a = 0;
    }

    public final void p(int i10) {
        this.f62681a = (~i10) & this.f62681a;
    }

    protected final boolean q(int i10) {
        return (this.f62681a & i10) == i10;
    }

    public final boolean r() {
        return q(268435456);
    }

    public final boolean s() {
        return q(4);
    }

    public final boolean t() {
        return q(androidx.media3.common.j.W0);
    }

    public final boolean v() {
        return q(1);
    }

    public final boolean w() {
        return q(536870912);
    }

    public final boolean x() {
        return q(67108864);
    }

    public final void z(int i10) {
        this.f62681a = i10;
    }
}
