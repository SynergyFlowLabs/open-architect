package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class m<A, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f96857b = 250;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.h<b<A>, B> f96858a;

    class a extends com.bumptech.glide.util.h<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.util.h
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void n(@NonNull b<A> bVar, @p0 B b10) {
            bVar.c();
        }
    }

    @l1
    static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f96860d = com.bumptech.glide.util.m.f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f96861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f96862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private A f96863c;

        private b() {
        }

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f96860d;
            synchronized (queue) {
                try {
                    bVar = (b) queue.poll();
                } finally {
                }
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        private void b(A a10, int i10, int i11) {
            this.f96863c = a10;
            this.f96862b = i10;
            this.f96861a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f96860d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f96862b == bVar.f96862b && this.f96861a == bVar.f96861a && this.f96863c.equals(bVar.f96863c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f96861a * 31) + this.f96862b) * 31) + this.f96863c.hashCode();
        }
    }

    public m() {
        this(250L);
    }

    public void a() {
        this.f96858a.c();
    }

    @p0
    public B b(A a10, int i10, int i11) {
        b<A> bVarA = b.a(a10, i10, i11);
        B bK = this.f96858a.k(bVarA);
        bVarA.c();
        return bK;
    }

    public void c(A a10, int i10, int i11, B b10) {
        this.f96858a.o(b.a(a10, i10, i11), b10);
    }

    public m(long j10) {
        this.f96858a = new a(j10);
    }
}
