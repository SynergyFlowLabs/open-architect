package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
final class n3 extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int[] f126114o = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, androidx.constraintlayout.core.motion.utils.v.e.f44057z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f126115s = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f126116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f126117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u f126118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f126119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f126120n;

    class a extends u.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f126121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        u.g f126122b = c();

        a() {
            this.f126121a = new c(n3.this, null);
        }

        private u.g c() {
            if (this.f126121a.hasNext()) {
                return this.f126121a.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f126122b != null;
        }

        @Override // com.google.protobuf.u.g
        public byte nextByte() {
            u.g gVar = this.f126122b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f126122b.hasNext()) {
                this.f126122b = c();
            }
            return bNextByte;
        }
    }

    private static final class c implements Iterator<u.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<n3> f126125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u.i f126126b;

        /* synthetic */ c(u uVar, a aVar) {
            this(uVar);
        }

        private u.i b(u root) {
            while (root instanceof n3) {
                n3 n3Var = (n3) root;
                this.f126125a.push(n3Var);
                root = n3Var.f126117k;
            }
            return (u.i) root;
        }

        private u.i c() {
            u.i iVarB;
            do {
                ArrayDeque<n3> arrayDeque = this.f126125a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                iVarB = b(this.f126125a.pop().f126118l);
            } while (iVarB.isEmpty());
            return iVarB;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u.i next() {
            u.i iVar = this.f126126b;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f126126b = c();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f126126b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(u root) {
            if (!(root instanceof n3)) {
                this.f126125a = null;
                this.f126126b = (u.i) root;
                return;
            }
            n3 n3Var = (n3) root;
            ArrayDeque<n3> arrayDeque = new ArrayDeque<>(n3Var.O());
            this.f126125a = arrayDeque;
            arrayDeque.push(n3Var);
            this.f126126b = b(n3Var.f126117k);
        }
    }

    /* synthetic */ n3(u uVar, u uVar2, a aVar) {
        this(uVar, uVar2);
    }

    static u O0(u left, u right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return P0(left, right);
        }
        if (left instanceof n3) {
            n3 n3Var = (n3) left;
            if (n3Var.f126118l.size() + right.size() < 128) {
                return new n3(n3Var.f126117k, P0(n3Var.f126118l, right));
            }
            if (n3Var.f126117k.O() > n3Var.f126118l.O() && n3Var.O() > right.O()) {
                return new n3(n3Var.f126117k, new n3(n3Var.f126118l, right));
            }
        }
        return size >= V0(Math.max(left.O(), right.O()) + 1) ? new n3(left, right) : new b(null).b(left, right);
    }

    private static u P0(u left, u right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.G(bArr, 0, 0, size);
        right.G(bArr, 0, size, size2);
        return u.E0(bArr);
    }

    private boolean S0(u uVar) {
        u.i next;
        a aVar = null;
        c cVar = new c(this, aVar);
        u.i next2 = cVar.next();
        c cVar2 = new c(uVar, aVar);
        u.i next3 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next2.size() - i10;
            int size2 = next3.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next2.L0(next3, i11, iMin) : next3.L0(next2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f126116j;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = cVar2.next();
                i11 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i11 += iMin;
            }
        }
    }

    static int V0(int depth) {
        int[] iArr = f126114o;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    static n3 W0(u left, u right) {
        return new n3(left, right);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.u
    public void D(ByteBuffer target) {
        this.f126117k.D(target);
        this.f126118l.D(target);
    }

    @Override // com.google.protobuf.u
    void G0(t output) throws IOException {
        this.f126117k.G0(output);
        this.f126118l.G0(output);
    }

    @Override // com.google.protobuf.u
    public void H0(OutputStream outputStream) throws IOException {
        this.f126117k.H0(outputStream);
        this.f126118l.H0(outputStream);
    }

    @Override // com.google.protobuf.u
    protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i10 = sourceOffset + numberToCopy;
        int i11 = this.f126119m;
        if (i10 <= i11) {
            this.f126117k.J(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i11) {
                this.f126118l.J(target, sourceOffset - i11, targetOffset, numberToCopy);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.f126117k.J(target, sourceOffset, targetOffset, i12);
            this.f126118l.J(target, 0, targetOffset + i12, numberToCopy - i12);
        }
    }

    @Override // com.google.protobuf.u
    void J0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        int i10 = sourceOffset + numberToWrite;
        int i11 = this.f126119m;
        if (i10 <= i11) {
            this.f126117k.J0(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i11) {
                this.f126118l.J0(out, sourceOffset - i11, numberToWrite);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.f126117k.J0(out, sourceOffset, i12);
            this.f126118l.J0(out, 0, numberToWrite - i12);
        }
    }

    @Override // com.google.protobuf.u
    void K0(t output) throws IOException {
        this.f126118l.K0(output);
        this.f126117k.K0(output);
    }

    @Override // com.google.protobuf.u
    protected int O() {
        return this.f126120n;
    }

    @Override // com.google.protobuf.u
    byte Q(int index) {
        int i10 = this.f126119m;
        return index < i10 ? this.f126117k.Q(index) : this.f126118l.Q(index - i10);
    }

    @Override // com.google.protobuf.u
    protected boolean R() {
        if (this.f126116j < V0(this.f126120n)) {
            return false;
        }
        int i10 = 5 << 1;
        return true;
    }

    @Override // com.google.protobuf.u
    public boolean S() {
        int iB0 = this.f126117k.b0(0, 0, this.f126119m);
        u uVar = this.f126118l;
        return uVar.b0(iB0, 0, uVar.size()) == 0;
    }

    @Override // com.google.protobuf.u, java.lang.Iterable
    /* JADX INFO: renamed from: T */
    public u.g iterator() {
        return new a();
    }

    @Override // com.google.protobuf.u
    public z V() {
        return z.n(k(), true);
    }

    @Override // com.google.protobuf.u
    public InputStream W() {
        return new d();
    }

    @Override // com.google.protobuf.u
    protected int a0(int h10, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.f126119m;
        if (i10 <= i11) {
            return this.f126117k.a0(h10, offset, length);
        }
        if (offset >= i11) {
            return this.f126118l.a0(h10, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.f126118l.a0(this.f126117k.a0(h10, offset, i12), 0, length - i12);
    }

    @Override // com.google.protobuf.u
    protected int b0(int state, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.f126119m;
        if (i10 <= i11) {
            return this.f126117k.b0(state, offset, length);
        }
        if (offset >= i11) {
            return this.f126118l.b0(state, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.f126118l.b0(this.f126117k.b0(state, offset, i12), 0, length - i12);
    }

    @Override // com.google.protobuf.u
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        if (this.f126116j != uVar.size()) {
            return false;
        }
        if (this.f126116j == 0) {
            return true;
        }
        int iC0 = c0();
        int iC1 = uVar.c0();
        if (iC0 == 0 || iC1 == 0 || iC0 == iC1) {
            return S0(uVar);
        }
        return false;
    }

    @Override // com.google.protobuf.u
    public ByteBuffer i() {
        return ByteBuffer.wrap(q0()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.u
    public List<ByteBuffer> k() {
        ArrayList arrayList = new ArrayList();
        int i10 = 5 | 0;
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().i());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.u
    public byte m(int index) {
        u.n(index, this.f126116j);
        return Q(index);
    }

    @Override // com.google.protobuf.u
    public u p0(int beginIndex, int endIndex) {
        int iP = u.p(beginIndex, endIndex, this.f126116j);
        if (iP == 0) {
            return u.f126379f;
        }
        if (iP == this.f126116j) {
            return this;
        }
        int i10 = this.f126119m;
        if (endIndex <= i10) {
            return this.f126117k.p0(beginIndex, endIndex);
        }
        return beginIndex >= i10 ? this.f126118l.p0(beginIndex - i10, endIndex - i10) : new n3(this.f126117k.n0(beginIndex), this.f126118l.p0(0, endIndex - this.f126119m));
    }

    @Override // com.google.protobuf.u
    public int size() {
        return this.f126116j;
    }

    @Override // com.google.protobuf.u
    protected String v0(Charset charset) {
        return new String(q0(), charset);
    }

    Object writeReplace() {
        return u.E0(q0());
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<u> f126124a;

        private b() {
            this.f126124a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public u b(u left, u right) {
            c(left);
            c(right);
            u uVarPop = this.f126124a.pop();
            while (!this.f126124a.isEmpty()) {
                uVarPop = new n3(this.f126124a.pop(), uVarPop, null);
            }
            return uVarPop;
        }

        private void c(u root) {
            if (root.R()) {
                e(root);
                return;
            }
            if (root instanceof n3) {
                n3 n3Var = (n3) root;
                c(n3Var.f126117k);
                c(n3Var.f126118l);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private int d(int length) {
            int iBinarySearch = Arrays.binarySearch(n3.f126114o, length);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(u byteString) {
            a aVar;
            int iD = d(byteString.size());
            int iV0 = n3.V0(iD + 1);
            if (!this.f126124a.isEmpty() && this.f126124a.peek().size() < iV0) {
                int iV1 = n3.V0(iD);
                u uVarPop = this.f126124a.pop();
                while (true) {
                    aVar = null;
                    if (this.f126124a.isEmpty() || this.f126124a.peek().size() >= iV1) {
                        break;
                    } else {
                        uVarPop = new n3(this.f126124a.pop(), uVarPop, aVar);
                    }
                }
                n3 n3Var = new n3(uVarPop, byteString, aVar);
                while (!this.f126124a.isEmpty()) {
                    if (this.f126124a.peek().size() >= n3.V0(d(n3Var.size()) + 1)) {
                        break;
                    } else {
                        n3Var = new n3(this.f126124a.pop(), n3Var, aVar);
                    }
                }
                this.f126124a.push(n3Var);
                return;
            }
            this.f126124a.push(byteString);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private n3(u left, u right) {
        this.f126117k = left;
        this.f126118l = right;
        int size = left.size();
        this.f126119m = size;
        this.f126116j = size + right.size();
        this.f126120n = Math.max(left.O(), right.O()) + 1;
    }

    private class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f126127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u.i f126128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f126129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f126130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126132f;

        public d() {
            c();
        }

        private void a() {
            if (this.f126128b != null) {
                int i10 = this.f126130d;
                int i11 = this.f126129c;
                if (i10 == i11) {
                    this.f126131e += i11;
                    this.f126130d = 0;
                    if (this.f126127a.hasNext()) {
                        u.i next = this.f126127a.next();
                        this.f126128b = next;
                        this.f126129c = next.size();
                        return;
                    }
                    this.f126128b = null;
                    this.f126129c = 0;
                }
            }
        }

        private int b() {
            return n3.this.size() - (this.f126131e + this.f126130d);
        }

        private void c() {
            c cVar = new c(n3.this, null);
            this.f126127a = cVar;
            u.i next = cVar.next();
            this.f126128b = next;
            this.f126129c = next.size();
            this.f126130d = 0;
            this.f126131e = 0;
        }

        private int d(byte[] b10, int offset, int length) {
            int i10 = length;
            while (i10 > 0) {
                a();
                if (this.f126128b == null) {
                    break;
                }
                int iMin = Math.min(this.f126129c - this.f126130d, i10);
                if (b10 != null) {
                    this.f126128b.G(b10, this.f126130d, offset, iMin);
                    offset += iMin;
                }
                this.f126130d += iMin;
                i10 -= iMin;
            }
            return length - i10;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return b();
        }

        @Override // java.io.InputStream
        public void mark(int readAheadLimit) {
            this.f126132f = this.f126131e + this.f126130d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] b10, int offset, int length) {
            b10.getClass();
            if (offset < 0 || length < 0 || length > b10.length - offset) {
                throw new IndexOutOfBoundsException();
            }
            int iD = d(b10, offset, length);
            if (iD != 0 || (length <= 0 && b() != 0)) {
                return iD;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            try {
                c();
                d(null, 0, this.f126132f);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.InputStream
        public long skip(long length) {
            if (length < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (length > androidx.collection.g3.f12256c) {
                length = 2147483647L;
            }
            return d(null, 0, (int) length);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            u.i iVar = this.f126128b;
            if (iVar == null) {
                return -1;
            }
            int i10 = this.f126130d;
            this.f126130d = i10 + 1;
            return iVar.m(i10) & 255;
        }
    }
}
