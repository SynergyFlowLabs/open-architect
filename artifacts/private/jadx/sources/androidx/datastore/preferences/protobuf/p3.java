package androidx.datastore.preferences.protobuf;

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

/* JADX INFO: loaded from: classes2.dex */
final class p3 extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int[] f50507o = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, androidx.constraintlayout.core.motion.utils.v.e.f44057z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f50508s = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f50509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f50510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u f50511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f50512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f50513n;

    class a extends u.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f50514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        u.g f50515b = c();

        a() {
            this.f50514a = new c(p3.this, null);
        }

        private u.g c() {
            if (this.f50514a.hasNext()) {
                return this.f50514a.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50515b != null;
        }

        @Override // androidx.datastore.preferences.protobuf.u.g
        public byte nextByte() {
            u.g gVar = this.f50515b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f50515b.hasNext()) {
                this.f50515b = c();
            }
            return bNextByte;
        }
    }

    private static final class c implements Iterator<u.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<p3> f50518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u.i f50519b;

        /* synthetic */ c(u uVar, a aVar) {
            this(uVar);
        }

        private u.i b(u root) {
            while (root instanceof p3) {
                p3 p3Var = (p3) root;
                this.f50518a.push(p3Var);
                root = p3Var.f50510k;
            }
            return (u.i) root;
        }

        private u.i c() {
            u.i iVarB;
            do {
                ArrayDeque<p3> arrayDeque = this.f50518a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                iVarB = b(this.f50518a.pop().f50511l);
            } while (iVarB.isEmpty());
            return iVarB;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u.i next() {
            u.i iVar = this.f50519b;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f50519b = c();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50519b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(u root) {
            if (!(root instanceof p3)) {
                this.f50518a = null;
                this.f50519b = (u.i) root;
                return;
            }
            p3 p3Var = (p3) root;
            ArrayDeque<p3> arrayDeque = new ArrayDeque<>(p3Var.O());
            this.f50518a = arrayDeque;
            arrayDeque.push(p3Var);
            this.f50519b = b(p3Var.f50510k);
        }
    }

    /* synthetic */ p3(u uVar, u uVar2, a aVar) {
        this(uVar, uVar2);
    }

    static u P0(u left, u right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return S0(left, right);
        }
        if (left instanceof p3) {
            p3 p3Var = (p3) left;
            if (p3Var.f50511l.size() + right.size() < 128) {
                return new p3(p3Var.f50510k, S0(p3Var.f50511l, right));
            }
            if (p3Var.f50510k.O() > p3Var.f50511l.O() && p3Var.O() > right.O()) {
                return new p3(p3Var.f50510k, new p3(p3Var.f50511l, right));
            }
        }
        return size >= W0(Math.max(left.O(), right.O()) + 1) ? new p3(left, right) : new b(null).b(left, right);
    }

    private static u S0(u left, u right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.G(bArr, 0, 0, size);
        right.G(bArr, 0, size, size2);
        return u.F0(bArr);
    }

    private boolean V0(u uVar) {
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
            if (!(i10 == 0 ? next2.N0(next3, i11, iMin) : next3.N0(next2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f50509j;
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

    static int W0(int depth) {
        int[] iArr = f50507o;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    static p3 X0(u left, u right) {
        return new p3(left, right);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void D(ByteBuffer target) {
        this.f50510k.D(target);
        this.f50511l.D(target);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    void H0(t output) throws IOException {
        this.f50510k.H0(output);
        this.f50511l.H0(output);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void I0(OutputStream outputStream) throws IOException {
        this.f50510k.I0(outputStream);
        this.f50511l.I0(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i10 = sourceOffset + numberToCopy;
        int i11 = this.f50512m;
        if (i10 <= i11) {
            this.f50510k.J(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i11) {
                this.f50511l.J(target, sourceOffset - i11, targetOffset, numberToCopy);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.f50510k.J(target, sourceOffset, targetOffset, i12);
            this.f50511l.J(target, 0, targetOffset + i12, numberToCopy - i12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u
    void K0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        int i10 = sourceOffset + numberToWrite;
        int i11 = this.f50512m;
        if (i10 <= i11) {
            this.f50510k.K0(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i11) {
                this.f50511l.K0(out, sourceOffset - i11, numberToWrite);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.f50510k.K0(out, sourceOffset, i12);
            this.f50511l.K0(out, 0, numberToWrite - i12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u
    void L0(t output) throws IOException {
        this.f50511l.L0(output);
        this.f50510k.L0(output);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    protected int O() {
        return this.f50513n;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    byte Q(int index) {
        int i10 = this.f50512m;
        return index < i10 ? this.f50510k.Q(index) : this.f50511l.Q(index - i10);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    protected boolean R() {
        return this.f50509j >= W0(this.f50513n);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public boolean S() {
        int iC0 = this.f50510k.c0(0, 0, this.f50512m);
        u uVar = this.f50511l;
        return uVar.c0(iC0, 0, uVar.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.u, java.lang.Iterable
    /* JADX INFO: renamed from: T */
    public u.g iterator() {
        return new a();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public z V() {
        return z.n(k(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public InputStream W() {
        return new d();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    protected int b0(int h10, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.f50512m;
        if (i10 <= i11) {
            return this.f50510k.b0(h10, offset, length);
        }
        if (offset >= i11) {
            return this.f50511l.b0(h10, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.f50511l.b0(this.f50510k.b0(h10, offset, i12), 0, length - i12);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    protected int c0(int state, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.f50512m;
        if (i10 <= i11) {
            return this.f50510k.c0(state, offset, length);
        }
        if (offset >= i11) {
            return this.f50511l.c0(state, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.f50511l.c0(this.f50510k.c0(state, offset, i12), 0, length - i12);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        if (this.f50509j != uVar.size()) {
            return false;
        }
        if (this.f50509j == 0) {
            return true;
        }
        int iE0 = e0();
        int iE1 = uVar.e0();
        if (iE0 == 0 || iE1 == 0 || iE0 == iE1) {
            return V0(uVar);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public ByteBuffer i() {
        return ByteBuffer.wrap(s0()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public List<ByteBuffer> k() {
        ArrayList arrayList = new ArrayList();
        int i10 = 1 >> 0;
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().i());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public byte m(int index) {
        u.n(index, this.f50509j);
        return Q(index);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public u q0(int beginIndex, int endIndex) {
        int iP = u.p(beginIndex, endIndex, this.f50509j);
        if (iP == 0) {
            return u.f50632f;
        }
        if (iP == this.f50509j) {
            return this;
        }
        int i10 = this.f50512m;
        if (endIndex <= i10) {
            return this.f50510k.q0(beginIndex, endIndex);
        }
        return beginIndex >= i10 ? this.f50511l.q0(beginIndex - i10, endIndex - i10) : new p3(this.f50510k.p0(beginIndex), this.f50511l.q0(0, endIndex - this.f50512m));
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public int size() {
        return this.f50509j;
    }

    Object writeReplace() {
        return u.F0(s0());
    }

    @Override // androidx.datastore.preferences.protobuf.u
    protected String z0(Charset charset) {
        return new String(s0(), charset);
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<u> f50517a;

        private b() {
            this.f50517a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public u b(u left, u right) {
            c(left);
            c(right);
            u uVarPop = this.f50517a.pop();
            while (!this.f50517a.isEmpty()) {
                uVarPop = new p3(this.f50517a.pop(), uVarPop, null);
            }
            return uVarPop;
        }

        private void c(u root) {
            if (root.R()) {
                e(root);
                return;
            }
            if (root instanceof p3) {
                p3 p3Var = (p3) root;
                c(p3Var.f50510k);
                c(p3Var.f50511l);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private int d(int length) {
            int iBinarySearch = Arrays.binarySearch(p3.f50507o, length);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(u byteString) {
            a aVar;
            int iD = d(byteString.size());
            int iW0 = p3.W0(iD + 1);
            if (this.f50517a.isEmpty() || this.f50517a.peek().size() >= iW0) {
                this.f50517a.push(byteString);
                return;
            }
            int iW1 = p3.W0(iD);
            u uVarPop = this.f50517a.pop();
            while (true) {
                aVar = null;
                if (this.f50517a.isEmpty() || this.f50517a.peek().size() >= iW1) {
                    break;
                } else {
                    uVarPop = new p3(this.f50517a.pop(), uVarPop, aVar);
                }
            }
            p3 p3Var = new p3(uVarPop, byteString, aVar);
            while (!this.f50517a.isEmpty()) {
                if (this.f50517a.peek().size() >= p3.W0(d(p3Var.size()) + 1)) {
                    break;
                } else {
                    p3Var = new p3(this.f50517a.pop(), p3Var, aVar);
                }
            }
            this.f50517a.push(p3Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private p3(u left, u right) {
        this.f50510k = left;
        this.f50511l = right;
        int size = left.size();
        this.f50512m = size;
        this.f50509j = size + right.size();
        this.f50513n = Math.max(left.O(), right.O()) + 1;
    }

    private class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f50520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u.i f50521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f50523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f50524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f50525f;

        public d() {
            c();
        }

        private void a() {
            if (this.f50521b != null) {
                int i10 = this.f50523d;
                int i11 = this.f50522c;
                if (i10 == i11) {
                    this.f50524e += i11;
                    this.f50523d = 0;
                    if (!this.f50520a.hasNext()) {
                        this.f50521b = null;
                        this.f50522c = 0;
                    } else {
                        u.i next = this.f50520a.next();
                        this.f50521b = next;
                        this.f50522c = next.size();
                    }
                }
            }
        }

        private int b() {
            return p3.this.size() - (this.f50524e + this.f50523d);
        }

        private void c() {
            c cVar = new c(p3.this, null);
            this.f50520a = cVar;
            u.i next = cVar.next();
            this.f50521b = next;
            this.f50522c = next.size();
            this.f50523d = 0;
            this.f50524e = 0;
        }

        private int d(byte[] b10, int offset, int length) {
            int i10 = length;
            while (i10 > 0) {
                a();
                if (this.f50521b == null) {
                    break;
                }
                int iMin = Math.min(this.f50522c - this.f50523d, i10);
                if (b10 != null) {
                    this.f50521b.G(b10, this.f50523d, offset, iMin);
                    offset += iMin;
                }
                this.f50523d += iMin;
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
            this.f50525f = this.f50524e + this.f50523d;
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
                int i10 = 6 & 0;
                d(null, 0, this.f50525f);
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
            u.i iVar = this.f50521b;
            if (iVar == null) {
                return -1;
            }
            int i10 = this.f50523d;
            this.f50523d = i10 + 1;
            return iVar.m(i10) & 255;
        }
    }
}
