package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
public abstract class b1<V> extends a1<V> implements t1<V> {

    public static abstract class a<V> extends b1<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t1<V> f119941a;

        protected a(t1<V> delegate) {
            this.f119941a = (t1) com.google.common.base.j0.E(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.b1, com.google.common.util.concurrent.a1
        /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final t1<V> L0() {
            return this.f119941a;
        }
    }

    protected b1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.a1
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public abstract t1<? extends V> L0();

    @Override // com.google.common.util.concurrent.t1
    public void m0(Runnable listener, Executor exec) {
        L0().m0(listener, exec);
    }
}
