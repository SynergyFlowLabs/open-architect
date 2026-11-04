package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f7 extends mb implements zc {
    private f7() {
        throw null;
    }

    public final f7 A(Iterable iterable) {
        n();
        ((i7) this.f108682b).P(iterable);
        return this;
    }

    public final f7 B() {
        n();
        ((i7) this.f108682b).Q();
        return this;
    }

    public final String C() {
        return ((i7) this.f108682b).I();
    }

    public final f7 D(String str) {
        n();
        ((i7) this.f108682b).R(str);
        return this;
    }

    public final f7 E(String str) {
        n();
        ((i7) this.f108682b).S(str);
        return this;
    }

    public final List u() {
        return Collections.unmodifiableList(((i7) this.f108682b).E());
    }

    public final int v() {
        return ((i7) this.f108682b).F();
    }

    public final k7 w(int i10) {
        return ((i7) this.f108682b).G(i10);
    }

    public final f7 x(int i10, j7 j7Var) {
        n();
        ((i7) this.f108682b).N(i10, (k7) j7Var.r());
        return this;
    }

    public final f7 z(j7 j7Var) {
        n();
        ((i7) this.f108682b).O((k7) j7Var.r());
        return this;
    }

    /* synthetic */ f7(byte[] bArr) {
        super(i7.zzh);
    }
}
