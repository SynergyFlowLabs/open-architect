package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
public final class m2<V> extends f.j<V> {
    private m2() {
    }

    public static <V> m2<V> F() {
        return new m2<>();
    }

    @Override // com.google.common.util.concurrent.f
    @z7.a
    public boolean B(@d2 V value) {
        return super.B(value);
    }

    @Override // com.google.common.util.concurrent.f
    @z7.a
    public boolean C(Throwable throwable) {
        return super.C(throwable);
    }

    @Override // com.google.common.util.concurrent.f
    @z7.a
    public boolean D(t1<? extends V> future) {
        return super.D(future);
    }
}
