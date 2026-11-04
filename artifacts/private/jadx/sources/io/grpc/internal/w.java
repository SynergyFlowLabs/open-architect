package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes13.dex */
public class w extends io.grpc.internal.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f<Void> f289963f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f<Void> f289964g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final f<byte[]> f289965h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final f<ByteBuffer> f289966i = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final g<OutputStream> f289967j = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque<i2> f289968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Deque<i2> f289969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f289970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<i2> f289971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f289972e;

    class a implements f<Void> {
        a() {
        }

        @Override // io.grpc.internal.w.f, io.grpc.internal.w.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, Void r10, int i11) {
            return i2Var.readUnsignedByte();
        }
    }

    class b implements f<Void> {
        b() {
        }

        @Override // io.grpc.internal.w.f, io.grpc.internal.w.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, Void r10, int i11) {
            i2Var.skipBytes(i10);
            return 0;
        }
    }

    class c implements f<byte[]> {
        c() {
        }

        @Override // io.grpc.internal.w.f, io.grpc.internal.w.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, byte[] bArr, int i11) {
            i2Var.e7(bArr, i11, i10);
            return i11 + i10;
        }
    }

    class d implements f<ByteBuffer> {
        d() {
        }

        @Override // io.grpc.internal.w.f, io.grpc.internal.w.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, ByteBuffer byteBuffer, int i11) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            i2Var.g5(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    class e implements g<OutputStream> {
        e() {
        }

        @Override // io.grpc.internal.w.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, OutputStream outputStream, int i11) throws IOException {
            i2Var.Ee(outputStream, i10);
            return 0;
        }
    }

    private interface f<T> extends g<T> {
        @Override // io.grpc.internal.w.g
        int a(i2 i2Var, int i10, T t10, int i11);
    }

    private interface g<T> {
        int a(i2 i2Var, int i10, T t10, int i11) throws IOException;
    }

    public w(int i10) {
        this.f289971d = new ArrayDeque(2);
        this.f289968a = new ArrayDeque(i10);
    }

    private void c() {
        if (!this.f289972e) {
            this.f289968a.remove().close();
            return;
        }
        this.f289969b.add(this.f289968a.remove());
        i2 i2VarPeek = this.f289968a.peek();
        if (i2VarPeek != null) {
            i2VarPeek.u7();
        }
    }

    private void d() {
        if (this.f289968a.peek().q0() == 0) {
            c();
        }
    }

    private void e(i2 i2Var) {
        if (!(i2Var instanceof w)) {
            this.f289968a.add(i2Var);
            this.f289970c += i2Var.q0();
            return;
        }
        w wVar = (w) i2Var;
        while (!wVar.f289968a.isEmpty()) {
            this.f289968a.add(wVar.f289968a.remove());
        }
        this.f289970c += wVar.f289970c;
        wVar.f289970c = 0;
        wVar.close();
    }

    private <T> int f(g<T> gVar, int i10, T t10, int i11) throws IOException {
        a(i10);
        if (!this.f289968a.isEmpty()) {
            d();
        }
        while (i10 > 0 && !this.f289968a.isEmpty()) {
            i2 i2VarPeek = this.f289968a.peek();
            int iMin = Math.min(i10, i2VarPeek.q0());
            i11 = gVar.a(i2VarPeek, iMin, t10, i11);
            i10 -= iMin;
            this.f289970c -= iMin;
            d();
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private <T> int g(f<T> fVar, int i10, T t10, int i11) {
        try {
            return f(fVar, i10, t10, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    public boolean D0() {
        Iterator<i2> it = this.f289968a.iterator();
        while (it.hasNext()) {
            if (!it.next().D0()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.i2
    public void Ee(OutputStream outputStream, int i10) throws IOException {
        f(f289967j, i10, outputStream, 0);
    }

    public void b(i2 i2Var) {
        boolean z10 = this.f289972e && this.f289968a.isEmpty();
        e(i2Var);
        if (z10) {
            this.f289968a.peek().u7();
        }
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f289968a.isEmpty()) {
            this.f289968a.remove().close();
        }
        if (this.f289969b != null) {
            while (!this.f289969b.isEmpty()) {
                this.f289969b.remove().close();
            }
        }
    }

    @Override // io.grpc.internal.i2
    public void e7(byte[] bArr, int i10, int i11) {
        g(f289965h, i11, bArr, i10);
    }

    @Override // io.grpc.internal.i2
    public void g5(ByteBuffer byteBuffer) {
        g(f289966i, byteBuffer.remaining(), byteBuffer, 0);
    }

    public void h(w wVar, int i10) {
        a(i10);
        this.f289970c -= i10;
        while (i10 > 0) {
            i2 i2VarPeek = this.f289971d.peek();
            if (i2VarPeek.q0() > i10) {
                wVar.b(i2VarPeek.l2(i10));
                i10 = 0;
            } else {
                wVar.b(this.f289971d.poll());
                i10 -= i2VarPeek.q0();
            }
        }
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    @fj.h
    public ByteBuffer k1() {
        if (this.f289968a.isEmpty()) {
            return null;
        }
        return this.f289968a.peek().k1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.grpc.internal.i2] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.grpc.internal.i2] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.internal.w] */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.grpc.internal.w] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // io.grpc.internal.i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.grpc.internal.i2 l2(int r8) {
        /*
            r7 = this;
            if (r8 > 0) goto L8
            io.grpc.internal.i2 r7 = io.grpc.internal.j2.a()
            r6 = 1
            return r7
        L8:
            r7.a(r8)
            r6 = 5
            int r0 = r7.f289970c
            int r0 = r0 - r8
            r6 = 4
            r7.f289970c = r0
            r0 = 0
            r1 = r0
        L14:
            r6 = 3
            java.util.Deque<io.grpc.internal.i2> r2 = r7.f289968a
            java.lang.Object r2 = r2.peek()
            r6 = 6
            io.grpc.internal.i2 r2 = (io.grpc.internal.i2) r2
            int r3 = r2.q0()
            r6 = 7
            if (r3 <= r8) goto L2d
            io.grpc.internal.i2 r8 = r2.l2(r8)
            r2 = 0
            r2 = 0
            r6 = 2
            goto L49
        L2d:
            r6 = 2
            boolean r4 = r7.f289972e
            r6 = 6
            if (r4 == 0) goto L3b
            io.grpc.internal.i2 r2 = r2.l2(r3)
            r7.c()
            goto L43
        L3b:
            java.util.Deque<io.grpc.internal.i2> r2 = r7.f289968a
            java.lang.Object r2 = r2.poll()
            io.grpc.internal.i2 r2 = (io.grpc.internal.i2) r2
        L43:
            r6 = 6
            int r8 = r8 - r3
            r5 = r2
            r6 = 3
            r2 = r8
            r8 = r5
        L49:
            if (r0 != 0) goto L4e
            r0 = r8
            r6 = 4
            goto L70
        L4e:
            r6 = 5
            if (r1 != 0) goto L6d
            io.grpc.internal.w r1 = new io.grpc.internal.w
            r3 = 2
            r6 = 4
            if (r2 != 0) goto L58
            goto L65
        L58:
            java.util.Deque<io.grpc.internal.i2> r4 = r7.f289968a
            int r4 = r4.size()
            int r4 = r4 + r3
            r3 = 16
            int r3 = java.lang.Math.min(r4, r3)
        L65:
            r6 = 1
            r1.<init>(r3)
            r1.b(r0)
            r0 = r1
        L6d:
            r1.b(r8)
        L70:
            if (r2 > 0) goto L74
            r6 = 5
            return r0
        L74:
            r8 = r2
            r8 = r2
            r6 = 7
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.w.l2(int):io.grpc.internal.i2");
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    public boolean markSupported() {
        Iterator<i2> it = this.f289968a.iterator();
        while (it.hasNext()) {
            if (!it.next().markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.i2
    public int q0() {
        return this.f289970c;
    }

    @Override // io.grpc.internal.i2
    public int readUnsignedByte() {
        return g(f289963f, 1, null, 0);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    public void reset() {
        if (!this.f289972e) {
            throw new InvalidMarkException();
        }
        i2 i2VarPeek = this.f289968a.peek();
        if (i2VarPeek != null) {
            int iQ0 = i2VarPeek.q0();
            i2VarPeek.reset();
            this.f289970c += i2VarPeek.q0() - iQ0;
        }
        while (true) {
            i2 i2VarPollLast = this.f289969b.pollLast();
            if (i2VarPollLast == null) {
                return;
            }
            i2VarPollLast.reset();
            this.f289968a.addFirst(i2VarPollLast);
            this.f289970c += i2VarPollLast.q0();
        }
    }

    @Override // io.grpc.internal.i2
    public void skipBytes(int i10) {
        g(f289964g, i10, null, 0);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    public void u7() {
        if (this.f289969b == null) {
            this.f289969b = new ArrayDeque(Math.min(this.f289968a.size(), 16));
        }
        while (!this.f289969b.isEmpty()) {
            this.f289969b.remove().close();
        }
        this.f289972e = true;
        i2 i2VarPeek = this.f289968a.peek();
        if (i2VarPeek != null) {
            i2VarPeek.u7();
        }
    }

    public w() {
        this.f289971d = new ArrayDeque(2);
        this.f289968a = new ArrayDeque();
    }
}
