package com.davidehrmann.vcdiff.mina_buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f97982e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f97983f = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal<Map<Integer, Queue<C0883c>>> f97986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Map<Integer, Queue<C0883c>>> f97987d;

    class a extends ThreadLocal<Map<Integer, Queue<C0883c>>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Integer, Queue<C0883c>> initialValue() {
            return c.this.j();
        }
    }

    class b extends ThreadLocal<Map<Integer, Queue<C0883c>>> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Integer, Queue<C0883c>> initialValue() {
            return c.this.j();
        }
    }

    public c() {
        this(8, 262144);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public d a(ByteBuffer byteBuffer) {
        return new C0883c(byteBuffer);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public d b(int i10, boolean z10) {
        d dVarA;
        int iK1 = d.k1(i10);
        int i11 = this.f97985b;
        if (i11 == 0 || iK1 <= i11) {
            C0883c c0883cPoll = (z10 ? this.f97987d.get().get(Integer.valueOf(iK1)) : this.f97986c.get().get(Integer.valueOf(iK1))).poll();
            if (c0883cPoll != null) {
                c0883cPoll.E();
                c0883cPoll.J2(false);
                c0883cPoll.l1(ByteOrder.BIG_ENDIAN);
                dVarA = c0883cPoll;
            } else {
                dVarA = z10 ? a(ByteBuffer.allocateDirect(iK1)) : a(ByteBuffer.allocate(iK1));
            }
        } else {
            dVarA = z10 ? a(ByteBuffer.allocateDirect(iK1)) : a(ByteBuffer.allocate(iK1));
        }
        dVarA.f1(i10);
        return dVarA;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public ByteBuffer c(int i10, boolean z10) {
        return b(i10, z10).x();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public void dispose() {
    }

    public int h() {
        return this.f97985b;
    }

    public int i() {
        return this.f97984a;
    }

    Map<Integer, Queue<C0883c>> j() {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 31; i10++) {
            map.put(Integer.valueOf(1 << i10), new ConcurrentLinkedQueue());
        }
        map.put(0, new ConcurrentLinkedQueue());
        map.put(Integer.MAX_VALUE, new ConcurrentLinkedQueue());
        return map;
    }

    public c(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maxPoolSize: " + i10);
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("maxCachedBufferSize: " + i11);
        }
        this.f97984a = i10;
        this.f97985b = i11;
        this.f97986c = new a();
        this.f97987d = new b();
    }

    /* JADX INFO: renamed from: com.davidehrmann.vcdiff.mina_buffer.c$c, reason: collision with other inner class name */
    private class C0883c extends com.davidehrmann.vcdiff.mina_buffer.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Thread f97990l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ByteBuffer f97991m;

        protected C0883c(ByteBuffer byteBuffer) {
            super(c.this, byteBuffer.capacity());
            this.f97990l = Thread.currentThread();
            this.f97991m = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        private void j3(ByteBuffer byteBuffer) {
            if (byteBuffer != null) {
                if ((c.this.f97985b == 0 || byteBuffer.capacity() <= c.this.f97985b) && !byteBuffer.isReadOnly() && !a1() && Thread.currentThread() == this.f97990l) {
                    Queue queue = byteBuffer.isDirect() ? (Queue) ((Map) c.this.f97987d.get()).get(Integer.valueOf(byteBuffer.capacity())) : (Queue) ((Map) c.this.f97986c.get()).get(Integer.valueOf(byteBuffer.capacity()));
                    if (queue == null) {
                        return;
                    }
                    if (c.this.f97984a == 0 || queue.size() < c.this.f97984a) {
                        queue.offer(c.this.new C0883c(byteBuffer));
                    }
                }
            }
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public void U() {
            j3(this.f97991m);
            this.f97991m = null;
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected d U2() {
            return c.this.new C0883c(this, x().asReadOnlyBuffer());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public boolean V0() {
            return x().hasArray();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected void X2(ByteBuffer byteBuffer) {
            ByteBuffer byteBuffer2 = this.f97991m;
            this.f97991m = byteBuffer;
            j3(byteBuffer2);
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected d a3() {
            return c.this.new C0883c(this, x().duplicate());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected d f3() {
            return c.this.new C0883c(this, x().slice());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public byte[] k() {
            return x().array();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public int l() {
            return x().arrayOffset();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public ByteBuffer x() {
            ByteBuffer byteBuffer = this.f97991m;
            if (byteBuffer != null) {
                return byteBuffer;
            }
            throw new IllegalStateException("Buffer has been freed already.");
        }

        protected C0883c(C0883c c0883c, ByteBuffer byteBuffer) {
            super(c0883c);
            this.f97990l = Thread.currentThread();
            this.f97991m = byteBuffer;
        }
    }
}
