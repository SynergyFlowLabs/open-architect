package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
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

/* JADX INFO: loaded from: classes2.dex */
@y
public abstract class u implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f50628b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f50629c = 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f50630d = 256;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f50631e = 8192;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f50632f = new j(s1.f50564e);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f50633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f50634h = 255;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<u> f50635i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50636a = 0;

    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50637a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f50638b;

        a() {
            this.f50638b = u.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50637a < this.f50638b;
        }

        @Override // androidx.datastore.preferences.protobuf.u.g
        public byte nextByte() {
            int i10 = this.f50637a;
            if (i10 >= this.f50638b) {
                throw new NoSuchElementException();
            }
            this.f50637a = i10 + 1;
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
                int iCompareTo = Integer.valueOf(u.t0(it.nextByte())).compareTo(Integer.valueOf(u.t0(it2.nextByte())));
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

        @Override // androidx.datastore.preferences.protobuf.u.f
        public byte[] a(byte[] bytes, int offset, int size) {
            return Arrays.copyOfRange(bytes, offset, size + offset);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e extends j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f50640o = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f50641m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f50642n;

        e(byte[] bytes, int offset, int length) {
            super(bytes);
            u.p(offset, offset + length, bytes.length);
            this.f50641m = offset;
            this.f50642n = length;
        }

        private void readObject(ObjectInputStream in) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f50647k, O0() + sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.u.j
        protected int O0() {
            return this.f50641m;
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        byte Q(int index) {
            return this.f50647k[this.f50641m + index];
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        public byte m(int index) {
            u.n(index, size());
            return this.f50647k[this.f50641m + index];
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        public int size() {
            return this.f50642n;
        }

        Object writeReplace() {
            return u.F0(s0());
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
        private final b0 f50643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f50644b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public u a() {
            this.f50643a.Z();
            return new j(this.f50644b);
        }

        public b0 b() {
            return this.f50643a;
        }

        private h(int size) {
            byte[] bArr = new byte[size];
            this.f50644b = bArr;
            this.f50643a = b0.n1(bArr);
        }
    }

    static abstract class i extends u {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f50645j = 1;

        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        void L0(t byteOutput) throws IOException {
            H0(byteOutput);
        }

        abstract boolean N0(u other, int offset, int length);

        @Override // androidx.datastore.preferences.protobuf.u
        protected final int O() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected final boolean R() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.u, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        private i() {
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f50646l = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected final byte[] f50647k;

        j(byte[] bytes) {
            super(null);
            bytes.getClass();
            this.f50647k = bytes;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final void D(ByteBuffer target) {
            target.put(this.f50647k, O0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        final void H0(t output) throws IOException {
            output.X(this.f50647k, O0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final void I0(OutputStream outputStream) throws IOException {
            outputStream.write(s0());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f50647k, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        final void K0(OutputStream outputStream, int sourceOffset, int numberToWrite) throws IOException {
            outputStream.write(this.f50647k, O0() + sourceOffset, numberToWrite);
        }

        @Override // androidx.datastore.preferences.protobuf.u.i
        final boolean N0(u other, int offset, int length) {
            if (length > other.size()) {
                throw new IllegalArgumentException("Length too large: " + length + size());
            }
            int i10 = offset + length;
            if (i10 > other.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + offset + ", " + length + ", " + other.size());
            }
            if (!(other instanceof j)) {
                return other.q0(offset, i10).equals(q0(0, length));
            }
            j jVar = (j) other;
            byte[] bArr = this.f50647k;
            byte[] bArr2 = jVar.f50647k;
            int iO0 = O0() + length;
            int iO1 = O0();
            int iO2 = jVar.O0() + offset;
            while (iO1 < iO0) {
                if (bArr[iO1] != bArr2[iO2]) {
                    return false;
                }
                iO1++;
                iO2++;
            }
            return true;
        }

        protected int O0() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        byte Q(int index) {
            return this.f50647k[index];
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final boolean S() {
            int iO0 = O0();
            return x4.u(this.f50647k, iO0, size() + iO0);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final z V() {
            return z.s(this.f50647k, O0(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final InputStream W() {
            return new ByteArrayInputStream(this.f50647k, O0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected final int b0(int h10, int offset, int length) {
            return s1.w(h10, this.f50647k, O0() + offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected final int c0(int state, int offset, int length) {
            int iO0 = O0() + offset;
            return x4.w(state, this.f50647k, iO0, length + iO0);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof u) || size() != ((u) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(other instanceof j)) {
                return other.equals(this);
            }
            j jVar = (j) other;
            int iE0 = e0();
            int iE1 = jVar.e0();
            if (iE0 == 0 || iE1 == 0 || iE0 == iE1) {
                return N0(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final ByteBuffer i() {
            return ByteBuffer.wrap(this.f50647k, O0(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final List<ByteBuffer> k() {
            return Collections.singletonList(i());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public byte m(int index) {
            return this.f50647k[index];
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final u q0(int beginIndex, int endIndex) {
            int iP = u.p(beginIndex, endIndex, size());
            return iP == 0 ? u.f50632f : new e(this.f50647k, O0() + beginIndex, iP);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public int size() {
            return this.f50647k.length;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected final String z0(Charset charset) {
            return new String(this.f50647k, O0(), size(), charset);
        }
    }

    private static final class k extends i {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final ByteBuffer f50648k;

        k(ByteBuffer buffer) {
            super(null);
            s1.e(buffer, "buffer");
            this.f50648k = buffer.slice().order(ByteOrder.nativeOrder());
        }

        private ByteBuffer P0(int beginIndex, int endIndex) {
            if (beginIndex < this.f50648k.position() || endIndex > this.f50648k.limit() || beginIndex > endIndex) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(beginIndex), Integer.valueOf(endIndex)));
            }
            ByteBuffer byteBufferSlice = this.f50648k.slice();
            v1.e(byteBufferSlice, beginIndex - this.f50648k.position());
            v1.c(byteBufferSlice, endIndex - this.f50648k.position());
            return byteBufferSlice;
        }

        private void readObject(ObjectInputStream in) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object writeReplace() {
            return u.v(this.f50648k.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void D(ByteBuffer target) {
            target.put(this.f50648k.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        void H0(t output) throws IOException {
            output.W(this.f50648k.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void I0(OutputStream out) throws IOException {
            out.write(s0());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            ByteBuffer byteBufferSlice = this.f50648k.slice();
            v1.e(byteBufferSlice, sourceOffset);
            byteBufferSlice.get(target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        void K0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
            if (!this.f50648k.hasArray()) {
                s.h(P0(sourceOffset, numberToWrite + sourceOffset), out);
            } else {
                out.write(this.f50648k.array(), this.f50648k.arrayOffset() + this.f50648k.position() + sourceOffset, numberToWrite);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.u.i
        boolean N0(u other, int offset, int length) {
            return q0(0, length).equals(other.q0(offset, length + offset));
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public byte Q(int index) {
            return m(index);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public boolean S() {
            return x4.s(this.f50648k);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public z V() {
            return z.p(this.f50648k, true);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public InputStream W() {
            return new a();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected int b0(int h10, int offset, int length) {
            for (int i10 = offset; i10 < offset + length; i10++) {
                h10 = (h10 * 31) + this.f50648k.get(i10);
            }
            return h10;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected int c0(int state, int offset, int length) {
            return x4.v(state, this.f50648k, offset, length + offset);
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
            if (size() != uVar.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (other instanceof k) {
                return this.f50648k.equals(((k) other).f50648k);
            }
            return other instanceof p3 ? other.equals(this) : this.f50648k.equals(uVar.i());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public ByteBuffer i() {
            return this.f50648k.asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public List<ByteBuffer> k() {
            return Collections.singletonList(i());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public byte m(int index) {
            try {
                return this.f50648k.get(index);
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            } catch (IndexOutOfBoundsException e11) {
                throw new ArrayIndexOutOfBoundsException(e11.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public u q0(int beginIndex, int endIndex) {
            try {
                return new k(P0(beginIndex, endIndex));
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            } catch (IndexOutOfBoundsException e11) {
                throw new ArrayIndexOutOfBoundsException(e11.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public int size() {
            return this.f50648k.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        protected String z0(Charset charset) {
            byte[] bArrS0;
            int length;
            int iArrayOffset;
            if (this.f50648k.hasArray()) {
                bArrS0 = this.f50648k.array();
                iArrayOffset = this.f50648k.arrayOffset() + this.f50648k.position();
                length = this.f50648k.remaining();
            } else {
                bArrS0 = s0();
                length = bArrS0.length;
                iArrayOffset = 0;
            }
            return new String(bArrS0, iArrayOffset, length, charset);
        }

        class a extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ByteBuffer f50649a;

            a() {
                this.f50649a = k.this.f50648k.slice();
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                return this.f50649a.remaining();
            }

            @Override // java.io.InputStream
            public void mark(int readlimit) {
                v1.d(this.f50649a);
            }

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (this.f50649a.hasRemaining()) {
                    return this.f50649a.get() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                try {
                    v1.f(this.f50649a);
                } catch (InvalidMarkException e10) {
                    throw new IOException(e10);
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bytes, int off, int len) throws IOException {
                if (!this.f50649a.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(len, this.f50649a.remaining());
                this.f50649a.get(bytes, off, iMin);
                return iMin;
            }
        }
    }

    private static final class m implements f {
        private m() {
        }

        @Override // androidx.datastore.preferences.protobuf.u.f
        public byte[] a(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f50633g = androidx.datastore.preferences.protobuf.e.c() ? new m(aVar) : new d(aVar);
        f50635i = new b();
    }

    u() {
    }

    public static u A(byte[] bytes) {
        return B(bytes, 0, bytes.length);
    }

    public static u B(byte[] bytes, int offset, int size) {
        p(offset, offset + size, bytes.length);
        return new j(f50633g.a(bytes, offset, size));
    }

    public static u C(String text) {
        return new j(text.getBytes(s1.f50561b));
    }

    private String C0() {
        if (size() <= 50) {
            return f4.a(this);
        }
        return f4.a(q0(0, 47)) + "...";
    }

    public static Comparator<u> D0() {
        return f50635i;
    }

    static u E0(ByteBuffer buffer) {
        if (!buffer.hasArray()) {
            return new k(buffer);
        }
        return G0(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    static u F0(byte[] bytes) {
        return new j(bytes);
    }

    static u G0(byte[] bytes, int offset, int length) {
        return new e(bytes, offset, length);
    }

    public static final u K() {
        return f50632f;
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

    public static l Y() {
        return new l(128);
    }

    public static l Z(int initialCapacity) {
        return new l(initialCapacity);
    }

    static u a0(ByteBuffer buffer) {
        return new k(buffer);
    }

    private static u h0(InputStream in, final int chunkSize) throws IOException {
        byte[] bArr = new byte[chunkSize];
        int i10 = 0;
        while (i10 < chunkSize) {
            int i11 = in.read(bArr, i10, chunkSize - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        if (i10 == 0) {
            return null;
        }
        return B(bArr, 0, i10);
    }

    public static u i0(InputStream streamToDrain) throws IOException {
        return m0(streamToDrain, 256, 8192);
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

    public static u l0(InputStream streamToDrain, int chunkSize) throws IOException {
        return m0(streamToDrain, chunkSize, chunkSize);
    }

    public static u m0(InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            u uVarH0 = h0(streamToDrain, minChunkSize);
            if (uVarH0 == null) {
                return s(arrayList);
            }
            arrayList.add(uVarH0);
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
        return size == 0 ? f50632f : l(byteStrings.iterator(), size);
    }

    public static u t(String text, String charsetName) throws UnsupportedEncodingException {
        return new j(text.getBytes(charsetName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t0(byte value) {
        return value & 255;
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

    public final String A0() {
        return v0(s1.f50561b);
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

    abstract void H0(t byteOutput) throws IOException;

    public abstract void I0(OutputStream out) throws IOException;

    protected abstract void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    final void J0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        p(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            K0(out, sourceOffset, numberToWrite);
        }
    }

    abstract void K0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException;

    public final boolean L(u suffix) {
        return size() >= suffix.size() && p0(size() - suffix.size()).equals(suffix);
    }

    abstract void L0(t byteOutput) throws IOException;

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

    protected abstract int b0(int h10, int offset, int length);

    protected abstract int c0(int state, int offset, int length);

    protected final int e0() {
        return this.f50636a;
    }

    public abstract boolean equals(Object o10);

    public final int hashCode() {
        int iB0 = this.f50636a;
        if (iB0 == 0) {
            int size = size();
            iB0 = b0(size, 0, size);
            if (iB0 == 0) {
                iB0 = 1;
            }
            this.f50636a = iB0;
        }
        return iB0;
    }

    public abstract ByteBuffer i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract List<ByteBuffer> k();

    public abstract byte m(int index);

    public final boolean n0(u prefix) {
        return size() >= prefix.size() && q0(0, prefix.size()).equals(prefix);
    }

    public final u p0(int beginIndex) {
        return q0(beginIndex, size());
    }

    public abstract u q0(int beginIndex, int endIndex);

    public final u r(u other) {
        if (Integer.MAX_VALUE - size() >= other.size()) {
            return p3.P0(this, other);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + org.slf4j.h.f339615a3 + other.size());
    }

    public final byte[] s0() {
        int size = size();
        if (size == 0) {
            return s1.f50564e;
        }
        byte[] bArr = new byte[size];
        J(bArr, 0, 0, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), C0());
    }

    public final String u0(String charsetName) throws UnsupportedEncodingException {
        try {
            return v0(Charset.forName(charsetName));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public final String v0(Charset charset) {
        return size() == 0 ? "" : z0(charset);
    }

    protected abstract String z0(Charset charset);

    public static final class l extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f50651f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<u> f50653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f50655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f50656e;

        l(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f50652a = initialCapacity;
            this.f50653b = new ArrayList<>();
            this.f50655d = new byte[initialCapacity];
        }

        private void a(int minSize) {
            this.f50653b.add(new j(this.f50655d));
            int length = this.f50654c + this.f50655d.length;
            this.f50654c = length;
            this.f50655d = new byte[Math.max(this.f50652a, Math.max(minSize, length >>> 1))];
            this.f50656e = 0;
        }

        private void b() {
            int i10 = this.f50656e;
            byte[] bArr = this.f50655d;
            if (i10 >= bArr.length) {
                this.f50653b.add(new j(this.f50655d));
                this.f50655d = f50651f;
            } else if (i10 > 0) {
                this.f50653b.add(new j(Arrays.copyOf(bArr, i10)));
            }
            this.f50654c += this.f50656e;
            this.f50656e = 0;
        }

        public synchronized int c() {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f50654c + this.f50656e;
        }

        public synchronized u d() {
            try {
                b();
            } catch (Throwable th2) {
                throw th2;
            }
            return u.s(this.f50653b);
        }

        public void e(OutputStream out) throws IOException {
            int i10;
            u[] uVarArr;
            byte[] bArr;
            int i11;
            synchronized (this) {
                uVarArr = (u[]) this.f50653b.toArray(new u[0]);
                bArr = this.f50655d;
                i11 = this.f50656e;
            }
            for (u uVar : uVarArr) {
                uVar.I0(out);
            }
            out.write(Arrays.copyOf(bArr, i11));
        }

        public synchronized void reset() {
            try {
                this.f50653b.clear();
                this.f50654c = 0;
                this.f50656e = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b10) {
            try {
                if (this.f50656e == this.f50655d.length) {
                    a(1);
                }
                byte[] bArr = this.f50655d;
                int i10 = this.f50656e;
                this.f50656e = i10 + 1;
                bArr[i10] = (byte) b10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b10, int offset, int length) {
            try {
                byte[] bArr = this.f50655d;
                int length2 = bArr.length;
                int i10 = this.f50656e;
                if (length <= length2 - i10) {
                    System.arraycopy(b10, offset, bArr, i10, length);
                    this.f50656e += length;
                } else {
                    int length3 = bArr.length - i10;
                    System.arraycopy(b10, offset, bArr, i10, length3);
                    int i11 = length - length3;
                    a(i11);
                    System.arraycopy(b10, offset + length3, this.f50655d, 0, i11);
                    this.f50656e = i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
