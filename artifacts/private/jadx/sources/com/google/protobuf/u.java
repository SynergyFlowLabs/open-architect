package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@y
public abstract class u implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f126375b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f126376c = 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f126377d = 256;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f126378e = 8192;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f126379f = new j(s1.f126327e);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f126380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f126381h = 255;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<u> f126382i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f126383a = 0;

    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f126384a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f126385b;

        a() {
            this.f126385b = u.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f126384a < this.f126385b;
        }

        @Override // com.google.protobuf.u.g
        public byte nextByte() {
            int i10 = this.f126384a;
            if (i10 >= this.f126385b) {
                throw new NoSuchElementException();
            }
            this.f126384a = i10 + 1;
            return u.this.Q(i10);
        }
    }

    class b implements Comparator<u> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(u former, u latter) {
            g it = former.iterator();
            g it2 = latter.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(u.s0(it.nextByte())).compareTo(Integer.valueOf(u.s0(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(former.size()).compareTo(Integer.valueOf(latter.size()));
        }
    }

    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.u.f
        public byte[] a(byte[] bytes, int offset, int size) {
            return Arrays.copyOfRange(bytes, offset, size + offset);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e extends j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f126387o = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f126388m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f126389n;

        e(byte[] bytes, int offset, int length) {
            super(bytes);
            u.p(offset, offset + length, bytes.length);
            this.f126388m = offset;
            this.f126389n = length;
        }

        private void readObject(ObjectInputStream in) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.u.j, com.google.protobuf.u
        protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f126394k, N0() + sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // com.google.protobuf.u.j
        protected int N0() {
            return this.f126388m;
        }

        @Override // com.google.protobuf.u.j, com.google.protobuf.u
        byte Q(int index) {
            return this.f126394k[this.f126388m + index];
        }

        @Override // com.google.protobuf.u.j, com.google.protobuf.u
        public byte m(int index) {
            u.n(index, size());
            return this.f126394k[this.f126388m + index];
        }

        @Override // com.google.protobuf.u.j, com.google.protobuf.u
        public int size() {
            return this.f126389n;
        }

        Object writeReplace() {
            return u.E0(q0());
        }
    }

    private interface f {
        byte[] a(byte[] bytes, int offset, int size);
    }

    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f126390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f126391b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public u a() {
            this.f126390a.Z();
            return new j(this.f126391b);
        }

        public b0 b() {
            return this.f126390a;
        }

        private h(int size) {
            byte[] bArr = new byte[size];
            this.f126391b = bArr;
            this.f126390a = b0.n1(bArr);
        }
    }

    static abstract class i extends u {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f126392j = 1;

        i() {
        }

        @Override // com.google.protobuf.u
        void K0(t byteOutput) throws IOException {
            G0(byteOutput);
        }

        abstract boolean L0(u other, int offset, int length);

        @Override // com.google.protobuf.u
        protected final int O() {
            return 0;
        }

        @Override // com.google.protobuf.u
        protected final boolean R() {
            return true;
        }

        @Override // com.google.protobuf.u, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f126393l = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected final byte[] f126394k;

        j(byte[] bytes) {
            bytes.getClass();
            this.f126394k = bytes;
        }

        @Override // com.google.protobuf.u
        public final void D(ByteBuffer target) {
            target.put(this.f126394k, N0(), size());
        }

        @Override // com.google.protobuf.u
        final void G0(t output) throws IOException {
            output.X(this.f126394k, N0(), size());
        }

        @Override // com.google.protobuf.u
        public final void H0(OutputStream outputStream) throws IOException {
            outputStream.write(q0());
        }

        @Override // com.google.protobuf.u
        protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f126394k, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // com.google.protobuf.u
        final void J0(OutputStream outputStream, int sourceOffset, int numberToWrite) throws IOException {
            outputStream.write(this.f126394k, N0() + sourceOffset, numberToWrite);
        }

        @Override // com.google.protobuf.u.i
        final boolean L0(u other, int offset, int length) {
            if (length > other.size()) {
                throw new IllegalArgumentException("Length too large: " + length + size());
            }
            int i10 = offset + length;
            if (i10 > other.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + offset + ", " + length + ", " + other.size());
            }
            if (!(other instanceof j)) {
                return other.p0(offset, i10).equals(p0(0, length));
            }
            j jVar = (j) other;
            byte[] bArr = this.f126394k;
            byte[] bArr2 = jVar.f126394k;
            int iN0 = N0() + length;
            int iN1 = N0();
            int iN2 = jVar.N0() + offset;
            while (iN1 < iN0) {
                if (bArr[iN1] != bArr2[iN2]) {
                    return false;
                }
                iN1++;
                iN2++;
            }
            return true;
        }

        protected int N0() {
            return 0;
        }

        @Override // com.google.protobuf.u
        byte Q(int index) {
            return this.f126394k[index];
        }

        @Override // com.google.protobuf.u
        public final boolean S() {
            int iN0 = N0();
            return u4.u(this.f126394k, iN0, size() + iN0);
        }

        @Override // com.google.protobuf.u
        public final z V() {
            return z.s(this.f126394k, N0(), size(), true);
        }

        @Override // com.google.protobuf.u
        public final InputStream W() {
            return new ByteArrayInputStream(this.f126394k, N0(), size());
        }

        @Override // com.google.protobuf.u
        protected final int a0(int h10, int offset, int length) {
            return s1.w(h10, this.f126394k, N0() + offset, length);
        }

        @Override // com.google.protobuf.u
        protected final int b0(int state, int offset, int length) {
            int iN0 = N0() + offset;
            return u4.w(state, this.f126394k, iN0, length + iN0);
        }

        @Override // com.google.protobuf.u
        public final boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof u) && size() == ((u) other).size()) {
                if (size() == 0) {
                    return true;
                }
                if (!(other instanceof j)) {
                    return other.equals(this);
                }
                j jVar = (j) other;
                int iC0 = c0();
                int iC1 = jVar.c0();
                if (iC0 == 0 || iC1 == 0 || iC0 == iC1) {
                    return L0(jVar, 0, size());
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.u
        public final ByteBuffer i() {
            return ByteBuffer.wrap(this.f126394k, N0(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.u
        public final List<ByteBuffer> k() {
            return Collections.singletonList(i());
        }

        @Override // com.google.protobuf.u
        public byte m(int index) {
            return this.f126394k[index];
        }

        @Override // com.google.protobuf.u
        public final u p0(int beginIndex, int endIndex) {
            int iP = u.p(beginIndex, endIndex, size());
            return iP == 0 ? u.f126379f : new e(this.f126394k, N0() + beginIndex, iP);
        }

        @Override // com.google.protobuf.u
        public int size() {
            return this.f126394k.length;
        }

        @Override // com.google.protobuf.u
        protected final String v0(Charset charset) {
            return new String(this.f126394k, N0(), size(), charset);
        }
    }

    private static final class l implements f {
        private l() {
        }

        @Override // com.google.protobuf.u.f
        public byte[] a(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f126380g = com.google.protobuf.e.c() ? new l(aVar) : new d(aVar);
        f126382i = new b();
    }

    u() {
    }

    public static u A(byte[] bytes) {
        return B(bytes, 0, bytes.length);
    }

    private String A0() {
        if (size() <= 50) {
            return c4.a(this);
        }
        return c4.a(p0(0, 47)) + "...";
    }

    public static u B(byte[] bytes, int offset, int size) {
        p(offset, offset + size, bytes.length);
        return new j(f126380g.a(bytes, offset, size));
    }

    public static u C(String text) {
        return new j(text.getBytes(s1.f126324b));
    }

    public static Comparator<u> C0() {
        return f126382i;
    }

    static u D0(ByteBuffer buffer) {
        if (!buffer.hasArray()) {
            return new a3(buffer);
        }
        return F0(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    static u E0(byte[] bytes) {
        return new j(bytes);
    }

    static u F0(byte[] bytes, int offset, int length) {
        return new e(bytes, offset, length);
    }

    public static final u K() {
        return f126379f;
    }

    private static int M(String hexString, int index) {
        int iP = P(hexString.charAt(index));
        if (iP != -1) {
            return iP;
        }
        throw new NumberFormatException("Invalid hexString " + hexString + " must only contain [0-9a-fA-F] but contained " + hexString.charAt(index) + " at index " + index);
    }

    public static u N(@d0 String hexString) {
        if (hexString.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + hexString + " of length " + hexString.length() + " must be even.");
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (M(hexString, i11 + 1) | (M(hexString, i11) << 4));
        }
        return new j(bArr);
    }

    private static int P(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - org.locationtech.jts.geom.l.f338160j;
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < 'a' || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    static h U(int size) {
        return new h(size, null);
    }

    public static k Y() {
        return new k(128);
    }

    public static k Z(int initialCapacity) {
        return new k(initialCapacity);
    }

    private static u e0(InputStream in, final int chunkSize) throws IOException {
        int i10;
        byte[] bArr = new byte[chunkSize];
        int i11 = 0;
        while (i11 < chunkSize && (i10 = in.read(bArr, i11, chunkSize - i11)) != -1) {
            i11 += i10;
        }
        if (i11 == 0) {
            return null;
        }
        return B(bArr, 0, i11);
    }

    public static u h0(InputStream streamToDrain) throws IOException {
        return l0(streamToDrain, 256, 8192);
    }

    public static u i0(InputStream streamToDrain, int chunkSize) throws IOException {
        return l0(streamToDrain, chunkSize, chunkSize);
    }

    private static u l(Iterator<u> iterator, int length) {
        if (length < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(length)));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i10 = length >>> 1;
        return l(iterator, i10).r(l(iterator, length - i10));
    }

    public static u l0(InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            u uVarE0 = e0(streamToDrain, minChunkSize);
            if (uVarE0 == null) {
                return s(arrayList);
            }
            arrayList.add(uVarE0);
            minChunkSize = Math.min(minChunkSize * 2, maxChunkSize);
        }
    }

    static void n(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + index);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + index + ", " + size);
        }
    }

    @x
    static int p(int startIndex, int endIndex, int size) {
        int i10 = endIndex - startIndex;
        if ((startIndex | endIndex | i10 | (size - endIndex)) >= 0) {
            return i10;
        }
        if (startIndex < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + startIndex + " < 0");
        }
        if (endIndex < startIndex) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + startIndex + ", " + endIndex);
        }
        throw new IndexOutOfBoundsException("End index: " + endIndex + " >= " + size);
    }

    public static u s(Iterable<u> byteStrings) {
        int size;
        if (byteStrings instanceof Collection) {
            size = ((Collection) byteStrings).size();
        } else {
            Iterator<u> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f126379f : l(byteStrings.iterator(), size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s0(byte value) {
        return value & 255;
    }

    public static u t(String text, String charsetName) throws UnsupportedEncodingException {
        return new j(text.getBytes(charsetName));
    }

    public static u u(String text, Charset charset) {
        return new j(text.getBytes(charset));
    }

    public static u v(ByteBuffer bytes) {
        return w(bytes, bytes.remaining());
    }

    public static u w(ByteBuffer bytes, int size) {
        p(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new j(bArr);
    }

    public abstract void D(ByteBuffer target);

    public void F(byte[] target, int offset) {
        G(target, 0, offset, size());
    }

    @Deprecated
    public final void G(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        p(sourceOffset, sourceOffset + numberToCopy, size());
        p(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            J(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    abstract void G0(t byteOutput) throws IOException;

    public abstract void H0(OutputStream out) throws IOException;

    final void I0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        p(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            J0(out, sourceOffset, numberToWrite);
        }
    }

    protected abstract void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    abstract void J0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException;

    abstract void K0(t byteOutput) throws IOException;

    public final boolean L(u suffix) {
        return size() >= suffix.size() && n0(size() - suffix.size()).equals(suffix);
    }

    protected abstract int O();

    abstract byte Q(int index);

    protected abstract boolean R();

    public abstract boolean S();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract z V();

    public abstract InputStream W();

    protected abstract int a0(int h10, int offset, int length);

    protected abstract int b0(int state, int offset, int length);

    protected final int c0() {
        return this.f126383a;
    }

    public abstract boolean equals(Object o10);

    public final int hashCode() {
        int iA0 = this.f126383a;
        if (iA0 == 0) {
            int size = size();
            iA0 = a0(size, 0, size);
            if (iA0 == 0) {
                iA0 = 1;
            }
            this.f126383a = iA0;
        }
        return iA0;
    }

    public abstract ByteBuffer i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract List<ByteBuffer> k();

    public abstract byte m(int index);

    public final boolean m0(u prefix) {
        return size() >= prefix.size() && p0(0, prefix.size()).equals(prefix);
    }

    public final u n0(int beginIndex) {
        return p0(beginIndex, size());
    }

    public abstract u p0(int beginIndex, int endIndex);

    public final byte[] q0() {
        int size = size();
        if (size == 0) {
            return s1.f126327e;
        }
        byte[] bArr = new byte[size];
        J(bArr, 0, 0, size);
        return bArr;
    }

    public final u r(u other) {
        if (Integer.MAX_VALUE - size() >= other.size()) {
            return n3.O0(this, other);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + org.slf4j.h.f339615a3 + other.size());
    }

    public abstract int size();

    public final String t0(String charsetName) throws UnsupportedEncodingException {
        try {
            return u0(Charset.forName(charsetName));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), A0());
    }

    public final String u0(Charset charset) {
        return size() == 0 ? "" : v0(charset);
    }

    protected abstract String v0(Charset charset);

    public final String z0() {
        return u0(s1.f126324b);
    }

    public static final class k extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f126395f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f126396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<u> f126397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f126398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f126399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126400e;

        k(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f126396a = initialCapacity;
            this.f126397b = new ArrayList<>();
            this.f126399d = new byte[initialCapacity];
        }

        private void a(int minSize) {
            this.f126397b.add(new j(this.f126399d));
            int length = this.f126398c + this.f126399d.length;
            this.f126398c = length;
            this.f126399d = new byte[Math.max(this.f126396a, Math.max(minSize, length >>> 1))];
            this.f126400e = 0;
        }

        private void b() {
            int i10 = this.f126400e;
            byte[] bArr = this.f126399d;
            if (i10 >= bArr.length) {
                this.f126397b.add(new j(this.f126399d));
                this.f126399d = f126395f;
            } else if (i10 > 0) {
                this.f126397b.add(new j(Arrays.copyOf(bArr, i10)));
            }
            this.f126398c += this.f126400e;
            int i11 = 6 | 0;
            this.f126400e = 0;
        }

        public synchronized int c() {
            return this.f126398c + this.f126400e;
        }

        public synchronized u d() {
            try {
                b();
            } catch (Throwable th2) {
                throw th2;
            }
            return u.s(this.f126397b);
        }

        public void e(OutputStream out) throws IOException {
            int i10;
            u[] uVarArr;
            byte[] bArr;
            int i11;
            synchronized (this) {
                uVarArr = (u[]) this.f126397b.toArray(new u[0]);
                bArr = this.f126399d;
                i11 = this.f126400e;
            }
            for (u uVar : uVarArr) {
                uVar.H0(out);
            }
            out.write(Arrays.copyOf(bArr, i11));
        }

        public synchronized void reset() {
            this.f126397b.clear();
            this.f126398c = 0;
            this.f126400e = 0;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b10) {
            try {
                if (this.f126400e == this.f126399d.length) {
                    a(1);
                }
                byte[] bArr = this.f126399d;
                int i10 = this.f126400e;
                this.f126400e = i10 + 1;
                bArr[i10] = (byte) b10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b10, int offset, int length) {
            try {
                byte[] bArr = this.f126399d;
                int length2 = bArr.length;
                int i10 = this.f126400e;
                if (length <= length2 - i10) {
                    System.arraycopy(b10, offset, bArr, i10, length);
                    this.f126400e += length;
                } else {
                    int length3 = bArr.length - i10;
                    System.arraycopy(b10, offset, bArr, i10, length3);
                    int i11 = length - length3;
                    a(i11);
                    System.arraycopy(b10, offset + length3, this.f126399d, 0, i11);
                    this.f126400e = i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
