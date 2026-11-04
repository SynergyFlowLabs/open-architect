package com.davidehrmann.vcdiff.mina_buffer;

import androidx.collection.g3;
import androidx.core.view.s0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.EnumSet;
import java.util.Set;
import kotlin.e2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.davidehrmann.vcdiff.mina_buffer.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f97967i = 255;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f97968j = 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f97969k = 4294967295L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f97970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f97971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f97972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f97973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f97974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f97975h = -1;

    class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            a.this.w1(bArr, i10, i11);
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            a.this.r1((byte) i10);
        }
    }

    class c extends ObjectInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f97978a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InputStream inputStream, ClassLoader classLoader) {
            super(inputStream);
            this.f97978a = classLoader;
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            int i10 = read();
            if (i10 < 0) {
                throw new EOFException();
            }
            if (i10 == 0) {
                return super.readClassDescriptor();
            }
            if (i10 == 1) {
                return ObjectStreamClass.lookup(Class.forName(readUTF(), true, this.f97978a));
            }
            throw new StreamCorruptedException("Unexpected class descriptor type: " + i10);
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            try {
                return Class.forName(objectStreamClass.getName(), false, this.f97978a);
            } catch (ClassNotFoundException unused) {
                return super.resolveClass(objectStreamClass);
            }
        }
    }

    class d extends ObjectOutputStream {
        d(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.ObjectOutputStream
        protected void writeClassDescriptor(ObjectStreamClass objectStreamClass) throws IOException {
            try {
                if (Serializable.class.isAssignableFrom(Class.forName(objectStreamClass.getName()))) {
                    write(1);
                    writeUTF(objectStreamClass.getName());
                } else {
                    write(0);
                    super.writeClassDescriptor(objectStreamClass);
                }
            } catch (ClassNotFoundException unused) {
                write(0);
                super.writeClassDescriptor(objectStreamClass);
            }
        }
    }

    protected a(e eVar, int i10) {
        this.f97973f = true;
        com.davidehrmann.vcdiff.mina_buffer.d.I2(eVar);
        this.f97973f = true;
        this.f97970c = false;
        this.f97974g = i10;
    }

    private com.davidehrmann.vcdiff.mina_buffer.d V2(int i10) {
        if (Y0()) {
            d3(i10, true);
        }
        return this;
    }

    private com.davidehrmann.vcdiff.mina_buffer.d W2(int i10, int i11) {
        if (Y0()) {
            c3(i10, i11, true);
        }
        return this;
    }

    private static void Y2(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException("fieldSize cannot be negative: " + i10);
    }

    private String b3(Enum<?> r10, String str) {
        return String.format("%s.%s has an ordinal value too large for a %s", r10.getClass().getName(), r10.name(), str);
    }

    private com.davidehrmann.vcdiff.mina_buffer.d c3(int i10, int i11, boolean z10) {
        if (!this.f97973f) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        int i12 = i10 + i11;
        int iK1 = z10 ? com.davidehrmann.vcdiff.mina_buffer.d.k1(i12) : i12;
        if (iK1 > z()) {
            D(iK1);
        }
        if (i12 > e1()) {
            x().limit(i12);
        }
        return this;
    }

    private com.davidehrmann.vcdiff.mina_buffer.d d3(int i10, boolean z10) {
        return c3(n1(), i10, z10);
    }

    private int e3(byte b10, byte b11, byte b12) {
        int i10 = ((b10 << com.google.common.base.c.f116465r) & 16711680) | ((b11 << 8) & s0.f48920f) | (b12 & 255);
        return (b10 & 128) == 128 ? i10 | (-16777216) : i10;
    }

    private <E> E g3(Class<E> cls, int i10) {
        E[] enumConstants = cls.getEnumConstants();
        if (i10 <= enumConstants.length) {
            return enumConstants[i10];
        }
        throw new IndexOutOfBoundsException(String.format("%d is too large of an ordinal to convert to the enum %s", Integer.valueOf(i10), cls.getName()));
    }

    private <E extends Enum<E>> EnumSet<E> h3(Class<E> cls, long j10) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        long j11 = 1;
        for (E e10 : cls.getEnumConstants()) {
            if ((j11 & j10) == j11) {
                enumSetNoneOf.add(e10);
            }
            j11 <<= 1;
        }
        return enumSetNoneOf;
    }

    private <E extends Enum<E>> long i3(Set<E> set) {
        long jOrdinal = 0;
        for (E e10 : set) {
            if (e10.ordinal() >= 64) {
                throw new IllegalArgumentException("The enum set is too large to fit in a bit vector: " + set);
            }
            jOrdinal |= 1 << e10.ordinal();
        }
        return jOrdinal;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final long A0(int i10) {
        return x().getLong(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d A1(int i10, double d10) {
        W2(i10, 8);
        x().putDouble(i10, d10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d A2(int i10, int i11) {
        W2(i10, 2);
        x().putShort(i10, (short) i11);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public int B0() {
        byte bV = V();
        byte bV2 = V();
        byte bV3 = V();
        return ByteOrder.BIG_ENDIAN.equals(m1()) ? e3(bV, bV2, bV3) : e3(bV3, bV2, bV);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d B1(int i10, Enum<?> r10) {
        if (r10.ordinal() <= 255) {
            return s1(i10, (byte) r10.ordinal());
        }
        throw new IllegalArgumentException(b3(r10, io.sentry.profilemeasurements.a.f306070m));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d B2(int i10, long j10) {
        W2(i10, 2);
        x().putShort(i10, (short) j10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public int C0(int i10) {
        byte bW = W(i10);
        byte bW2 = W(i10 + 1);
        byte bW3 = W(i10 + 2);
        return ByteOrder.BIG_ENDIAN.equals(m1()) ? e3(bW, bW2, bW3) : e3(bW3, bW2, bW);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d C1(Enum<?> r10) {
        if (r10.ordinal() <= 255) {
            return r1((byte) r10.ordinal());
        }
        throw new IllegalArgumentException(b3(r10, io.sentry.profilemeasurements.a.f306070m));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d C2(int i10, short s10) {
        W2(i10, 2);
        x().putShort(i10, s10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d D(int i10) {
        if (!this.f97973f) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        if (i10 > z()) {
            int iN1 = n1();
            int iE1 = e1();
            ByteOrder byteOrderM1 = m1();
            ByteBuffer byteBufferX = x();
            ByteBuffer byteBufferC = com.davidehrmann.vcdiff.mina_buffer.d.Z().c(i10, b1());
            byteBufferX.clear();
            byteBufferC.put(byteBufferX);
            X2(byteBufferC);
            x().limit(iE1);
            if (this.f97975h >= 0) {
                x().position(this.f97975h);
                x().mark();
            }
            x().position(iN1);
            x().order(byteOrderM1);
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public Object D0() throws ClassNotFoundException {
        return E0(Thread.currentThread().getContextClassLoader());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d D1(int i10, Enum<?> r10) {
        return T1(i10, r10.ordinal());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d D2(long j10) {
        V2(2);
        x().putShort((short) j10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d E() {
        x().clear();
        this.f97975h = -1;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public Object E0(ClassLoader classLoader) throws ClassNotFoundException {
        if (!p1(4)) {
            throw new BufferUnderflowException();
        }
        int iX0 = x0();
        if (iX0 <= 4) {
            throw new com.davidehrmann.vcdiff.mina_buffer.b("Object length should be greater than 4: " + iX0);
        }
        int iE1 = e1();
        f1(n1() + iX0);
        try {
            try {
                Object object = new c(q(), classLoader).readObject();
                f1(iE1);
                return object;
            } catch (IOException e10) {
                throw new com.davidehrmann.vcdiff.mina_buffer.b(e10);
            }
        } catch (Throwable th2) {
            f1(iE1);
            throw th2;
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d E1(Enum<?> r10) {
        return S1(r10.ordinal());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d E2(short s10) {
        V2(2);
        x().putShort(s10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public String F0(int i10, CharsetDecoder charsetDecoder) throws CharacterCodingException {
        int iN0;
        if (!p1(i10)) {
            throw new BufferUnderflowException();
        }
        if (i10 == 1) {
            iN0 = N0();
        } else if (i10 != 2) {
            iN0 = i10 != 4 ? 0 : x0();
        } else {
            iN0 = T0();
        }
        if (iN0 == 0) {
            return "";
        }
        if (charsetDecoder.charset().name().startsWith("UTF-16") && (iN0 & 1) != 0) {
            throw new com.davidehrmann.vcdiff.mina_buffer.b("fieldSize is not even for a UTF-16 string.");
        }
        int iE1 = e1();
        int iN1 = n1() + iN0;
        if (iE1 < iN1) {
            throw new BufferUnderflowException();
        }
        f1(iN1);
        charsetDecoder.reset();
        int iF2 = ((int) (F2() * charsetDecoder.averageCharsPerByte())) + 1;
        CharBuffer charBufferAllocate = CharBuffer.allocate(iF2);
        while (true) {
            CoderResult coderResultDecode = W0() ? charsetDecoder.decode(x(), charBufferAllocate, true) : charsetDecoder.flush(charBufferAllocate);
            if (coderResultDecode.isUnderflow()) {
                f1(iE1);
                o1(iN1);
                return charBufferAllocate.flip().toString();
            }
            if (coderResultDecode.isOverflow()) {
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(charBufferAllocate.capacity() + iF2);
                charBufferAllocate.flip();
                charBufferAllocate2.put(charBufferAllocate);
                charBufferAllocate = charBufferAllocate2;
            } else {
                coderResultDecode.throwException();
            }
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d F1(int i10, Set<E> set) {
        long jI3 = i3(set);
        if (((-256) & jI3) == 0) {
            return s1(i10, (byte) jI3);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a byte: " + set);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int F2() {
        return e1() - n1();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public String G0(CharsetDecoder charsetDecoder) throws CharacterCodingException {
        return F0(2, charsetDecoder);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d G1(Set<E> set) {
        long jI3 = i3(set);
        if (((-256) & jI3) == 0) {
            return r1((byte) jI3);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a byte: " + set);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d G2() {
        x().reset();
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d H() {
        int i10;
        int iF2 = F2();
        int iZ = z();
        if (iZ != 0) {
            if (!Z0() || iF2 > (iZ >>> 2) || iZ <= (i10 = this.f97974g)) {
                x().compact();
            } else {
                int iMax = Math.max(i10, iF2 << 1);
                int i11 = iZ;
                while (true) {
                    int i12 = i11 >>> 1;
                    if (i12 < iMax) {
                        break;
                    }
                    i11 = i12;
                }
                int iMax2 = Math.max(iMax, i11);
                if (iMax2 != iZ) {
                    ByteOrder byteOrderM1 = m1();
                    if (iF2 > iMax2) {
                        throw new IllegalStateException("The amount of the remaining bytes is greater than the new capacity.");
                    }
                    ByteBuffer byteBufferX = x();
                    ByteBuffer byteBufferC = com.davidehrmann.vcdiff.mina_buffer.d.Z().c(iMax2, b1());
                    byteBufferC.put(byteBufferX);
                    X2(byteBufferC);
                    x().order(byteOrderM1);
                }
            }
            this.f97975h = -1;
            return this;
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final short H0() {
        return x().getShort();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d H1(int i10, Set<E> set) {
        long jI3 = i3(set);
        if (((-4294967296L) & jI3) == 0) {
            return T1(i10, (int) jI3);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in an int: " + set);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d H2() {
        x().rewind();
        this.f97975h = -1;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d I() {
        this.f97973f = false;
        return a3();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final short I0(int i10) {
        return x().getShort(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d I1(Set<E> set) {
        long jI3 = i3(set);
        if (((-4294967296L) & jI3) == 0) {
            return S1((int) jI3);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in an int: " + set);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d J0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("length: " + i10);
        }
        int iN1 = n1();
        int iE1 = e1();
        int i11 = iN1 + i10;
        if (iE1 >= i11) {
            f1(i11);
            com.davidehrmann.vcdiff.mina_buffer.d dVarO2 = O2();
            o1(i11);
            f1(iE1);
            return dVarO2;
        }
        throw new IndexOutOfBoundsException("position + length (" + i11 + ") is greater than limit (" + iE1 + ").");
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d J1(int i10, Set<E> set) {
        return U1(i10, i3(set));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d J2(boolean z10) {
        if (!this.f97973f) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        this.f97971d = z10;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d K0(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("length: " + i11);
        }
        int iE1 = e1();
        if (i10 > iE1) {
            throw new IllegalArgumentException("index: " + i10);
        }
        int i12 = i11 + i10;
        if (z() >= i12) {
            E();
            o1(i10);
            f1(i12);
            com.davidehrmann.vcdiff.mina_buffer.d dVarO2 = O2();
            o1(i10);
            f1(iE1);
            return dVarO2;
        }
        throw new IndexOutOfBoundsException("index + length (" + i12 + ") is greater than capacity (" + z() + ").");
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d K1(Set<E> set) {
        return V1(i3(set));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d K2(boolean z10) {
        if (!this.f97973f) {
            throw new IllegalStateException("Derived buffers and their parent can't be shrinked.");
        }
        this.f97972e = z10;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d L(int i10) {
        return c3(n1(), i10, false);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public String L0(int i10, CharsetDecoder charsetDecoder) throws CharacterCodingException {
        Y2(i10);
        if (i10 == 0 || !W0()) {
            return "";
        }
        boolean zStartsWith = charsetDecoder.charset().name().startsWith("UTF-16");
        if (zStartsWith && (i10 & 1) != 0) {
            throw new IllegalArgumentException("fieldSize is not even.");
        }
        int iN1 = n1();
        int iE1 = e1();
        int i11 = i10 + iN1;
        if (iE1 < i11) {
            throw new BufferUnderflowException();
        }
        if (zStartsWith) {
            int i12 = iN1;
            while (i12 < i11 && (W(i12) != 0 || W(i12 + 1) != 0)) {
                i12 += 2;
            }
            if (i12 == i11) {
                f1(i11);
            } else {
                f1(i12);
            }
        } else {
            int i13 = iN1;
            while (i13 < i11 && W(i13) != 0) {
                i13++;
            }
            if (i13 == i11) {
                f1(i11);
            } else {
                f1(i13);
            }
        }
        if (!W0()) {
            f1(iE1);
            o1(i11);
            return "";
        }
        charsetDecoder.reset();
        int iF2 = ((int) (F2() * charsetDecoder.averageCharsPerByte())) + 1;
        CharBuffer charBufferAllocate = CharBuffer.allocate(iF2);
        while (true) {
            CoderResult coderResultDecode = W0() ? charsetDecoder.decode(x(), charBufferAllocate, true) : charsetDecoder.flush(charBufferAllocate);
            if (coderResultDecode.isUnderflow()) {
                f1(iE1);
                o1(i11);
                return charBufferAllocate.flip().toString();
            }
            if (coderResultDecode.isOverflow()) {
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(charBufferAllocate.capacity() + iF2);
                charBufferAllocate.flip();
                charBufferAllocate2.put(charBufferAllocate);
                charBufferAllocate = charBufferAllocate2;
            } else if (coderResultDecode.isError()) {
                f1(iE1);
                o1(iN1);
                coderResultDecode.throwException();
            }
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d L1(int i10, Set<E> set) {
        long jI3 = i3(set);
        if (((-65536) & jI3) == 0) {
            return d2(i10, (short) jI3);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a short: " + set);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d M(int i10, int i11) {
        return c3(i10, i11, false);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public String M0(CharsetDecoder charsetDecoder) throws CharacterCodingException {
        int iX0;
        int i10;
        int i11;
        if (!W0()) {
            return "";
        }
        boolean zStartsWith = charsetDecoder.charset().name().startsWith("UTF-16");
        int iN1 = n1();
        int iE1 = e1();
        if (zStartsWith) {
            iX0 = iN1;
            while (true) {
                boolean z10 = W(iX0) == 0;
                int i12 = iX0 + 1;
                if (i12 < iE1) {
                    if (W(i12) != 0) {
                        iX0 += 2;
                        if (iX0 >= iE1) {
                        }
                    } else {
                        if (z10) {
                            break;
                        }
                        iX0 = i12;
                    }
                }
                iX0 = -1;
                break;
            }
            if (iX0 < 0) {
                iX0 = ((iE1 - iN1) & (-2)) + iN1;
            } else {
                i10 = iX0 + 2;
                if (i10 <= iE1) {
                    i11 = i10;
                }
            }
            i11 = iX0;
        } else {
            iX0 = X0((byte) 0);
            if (iX0 < 0) {
                iX0 = iE1;
                i11 = iX0;
            } else {
                i10 = iX0 + 1;
                i11 = i10;
            }
        }
        if (iN1 == iX0) {
            o1(i11);
            return "";
        }
        f1(iX0);
        charsetDecoder.reset();
        int iF2 = ((int) (F2() * charsetDecoder.averageCharsPerByte())) + 1;
        CharBuffer charBufferAllocate = CharBuffer.allocate(iF2);
        while (true) {
            CoderResult coderResultDecode = W0() ? charsetDecoder.decode(x(), charBufferAllocate, true) : charsetDecoder.flush(charBufferAllocate);
            if (coderResultDecode.isUnderflow()) {
                f1(iE1);
                o1(i11);
                return charBufferAllocate.flip().toString();
            }
            if (coderResultDecode.isOverflow()) {
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(charBufferAllocate.capacity() + iF2);
                charBufferAllocate.flip();
                charBufferAllocate2.put(charBufferAllocate);
                charBufferAllocate = charBufferAllocate2;
            } else if (coderResultDecode.isError()) {
                f1(iE1);
                o1(iN1);
                coderResultDecode.throwException();
            }
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d M2() {
        if (!this.f97973f) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        int iN1 = n1();
        int iZ = z();
        int iE1 = e1();
        if (iZ != iE1) {
            int iMax = Math.max(this.f97974g, iE1);
            int i10 = iZ;
            while (true) {
                int i11 = i10 >>> 1;
                if (i11 < iMax) {
                    break;
                }
                i10 = i11;
            }
            int iMax2 = Math.max(iMax, i10);
            if (iMax2 != iZ) {
                ByteOrder byteOrderM1 = m1();
                ByteBuffer byteBufferX = x();
                ByteBuffer byteBufferC = com.davidehrmann.vcdiff.mina_buffer.d.Z().c(iMax2, b1());
                byteBufferX.position(0);
                byteBufferX.limit(iE1);
                byteBufferC.put(byteBufferX);
                X2(byteBufferC);
                x().position(iN1);
                x().limit(iE1);
                x().order(byteOrderM1);
                this.f97975h = -1;
                return this;
            }
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d N(byte b10, int i10) {
        V2(i10);
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i11 > 0) {
            long j10 = (b10 << 8) | b10 | (b10 << com.google.common.base.c.f116465r) | (b10 << com.google.common.base.c.B);
            long j11 = j10 | (j10 << 32);
            while (i11 > 0) {
                V1(j11);
                i11--;
            }
        }
        int i13 = i12 >>> 2;
        int i14 = i10 & 3;
        if (i13 > 0) {
            S1((b10 << 8) | b10 | (b10 << com.google.common.base.c.f116465r) | (b10 << com.google.common.base.c.B));
        }
        int i15 = i10 & 1;
        if ((i14 >> 1) > 0) {
            e2((short) ((b10 << 8) | b10));
        }
        if (i15 > 0) {
            r1(b10);
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final short N0() {
        return (short) (V() & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> com.davidehrmann.vcdiff.mina_buffer.d N1(Set<E> set) {
        long jI3 = i3(set);
        if (((-65536) & jI3) == 0) {
            return e2((short) jI3);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a short: " + set);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d N2(int i10) {
        V2(i10);
        return o1(n1() + i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d O(int i10) {
        V2(i10);
        int i11 = i10 & 7;
        for (int i12 = i10 >>> 3; i12 > 0; i12--) {
            V1(0L);
        }
        int i13 = i11 >>> 2;
        int i14 = i10 & 3;
        if (i13 > 0) {
            S1(0);
        }
        int i15 = i10 & 1;
        if ((i14 >> 1) > 0) {
            e2((short) 0);
        }
        if (i15 > 0) {
            r1((byte) 0);
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final short O0(int i10) {
        return (short) (W(i10) & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d O1(int i10, Enum<?> r10) {
        if (r10.ordinal() <= 65535) {
            return d2(i10, (short) r10.ordinal());
        }
        throw new IllegalArgumentException(b3(r10, "short"));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d O2() {
        this.f97973f = false;
        return f3();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public long P0() {
        return ((long) x0()) & 4294967295L;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d P1(Enum<?> r10) {
        if (r10.ordinal() <= 65535) {
            return e2((short) r10.ordinal());
        }
        throw new IllegalArgumentException(b3(r10, "short"));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d P2() {
        E();
        return S(F2());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public long Q0(int i10) {
        return ((long) y0(i10)) & 4294967295L;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d Q1(float f10) {
        V2(4);
        x().putFloat(f10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d Q2(byte b10) {
        E();
        return R(b10, F2());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d R(byte b10, int i10) {
        V2(i10);
        int iN1 = n1();
        try {
            N(b10, i10);
            o1(iN1);
            return this;
        } catch (Throwable th2) {
            o1(iN1);
            throw th2;
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public int R0() {
        short sN0 = N0();
        short sN1 = N0();
        short sN2 = N0();
        return ByteOrder.BIG_ENDIAN.equals(m1()) ? (sN0 << 16) | (sN1 << 8) | sN2 : (sN2 << 16) | (sN1 << 8) | sN0;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d R1(int i10, float f10) {
        W2(i10, 4);
        x().putFloat(i10, f10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d S(int i10) {
        V2(i10);
        int iN1 = n1();
        try {
            O(i10);
            o1(iN1);
            return this;
        } catch (Throwable th2) {
            o1(iN1);
            throw th2;
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public int S0(int i10) {
        short sO0 = O0(i10);
        short sO1 = O0(i10 + 1);
        short sO2 = O0(i10 + 2);
        return ByteOrder.BIG_ENDIAN.equals(m1()) ? (sO0 << 16) | (sO1 << 8) | sO2 : (sO2 << 16) | (sO1 << 8) | sO0;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d S1(int i10) {
        V2(4);
        x().putInt(i10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d T() {
        x().flip();
        this.f97975h = -1;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public int T0() {
        return H0() & e2.f312492d;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d T1(int i10, int i11) {
        W2(i10, 4);
        x().putInt(i10, i11);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public int U0(int i10) {
        return I0(i10) & e2.f312492d;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d U1(int i10, long j10) {
        W2(i10, 8);
        x().putLong(i10, j10);
        return this;
    }

    protected abstract com.davidehrmann.vcdiff.mina_buffer.d U2();

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final byte V() {
        return x().get();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d V1(long j10) {
        V2(8);
        x().putLong(j10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final byte W(int i10) {
        return x().get(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final boolean W0() {
        return e1() > n1();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d W1(int i10) {
        byte b10 = (byte) (i10 >> 16);
        byte b11 = (byte) (i10 >> 8);
        byte b12 = (byte) i10;
        if (ByteOrder.BIG_ENDIAN.equals(m1())) {
            r1(b10).r1(b11).r1(b12);
            return this;
        }
        r1(b12).r1(b11).r1(b10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d X(byte[] bArr) {
        return Y(bArr, 0, bArr.length);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public int X0(byte b10) {
        if (V0()) {
            int iL = l();
            int iE1 = e1() + iL;
            byte[] bArrK = k();
            for (int iN1 = n1() + iL; iN1 < iE1; iN1++) {
                if (bArrK[iN1] == b10) {
                    return iN1 - iL;
                }
            }
        } else {
            int iE2 = e1();
            for (int iN2 = n1(); iN2 < iE2; iN2++) {
                if (W(iN2) == b10) {
                    return iN2;
                }
            }
        }
        return -1;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d X1(int i10, int i11) {
        byte b10 = (byte) (i11 >> 16);
        byte b11 = (byte) (i11 >> 8);
        byte b12 = (byte) i11;
        if (ByteOrder.BIG_ENDIAN.equals(m1())) {
            s1(i10, b10).s1(i10 + 1, b11).s1(i10 + 2, b12);
            return this;
        }
        s1(i10, b12).s1(i10 + 1, b11).s1(i10 + 2, b10);
        return this;
    }

    protected abstract void X2(ByteBuffer byteBuffer);

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d Y(byte[] bArr, int i10, int i11) {
        x().get(bArr, i10, i11);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final boolean Y0() {
        return this.f97971d && this.f97973f;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d Y1(Object obj) {
        int iN1 = n1();
        N2(4);
        try {
            d dVar = new d(t());
            dVar.writeObject(obj);
            dVar.flush();
            int iN2 = n1();
            o1(iN1);
            S1((iN2 - iN1) - 4);
            o1(iN2);
            return this;
        } catch (IOException e10) {
            throw new com.davidehrmann.vcdiff.mina_buffer.b(e10);
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final boolean Z0() {
        return this.f97972e && this.f97973f;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d Z1(CharSequence charSequence, int i10, int i11, byte b10, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        int i12;
        int i13;
        int i14 = 4;
        int i15 = 2;
        boolean z10 = true;
        if (i10 == 1) {
            i12 = 255;
        } else if (i10 == 2) {
            i12 = 65535;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("prefixLength: " + i10);
            }
            i12 = Integer.MAX_VALUE;
        }
        if (charSequence.length() > i12) {
            throw new IllegalArgumentException("The specified string is too long.");
        }
        if (charSequence.length() != 0) {
            if (i11 == 0 || i11 == 1) {
                i13 = 0;
            } else if (i11 == 2) {
                i13 = 1;
            } else {
                if (i11 != 4) {
                    throw new IllegalArgumentException("padding: " + i11);
                }
                i13 = 3;
            }
            CharBuffer charBufferWrap = CharBuffer.wrap(charSequence);
            N2(i10);
            int iN1 = n1();
            charsetEncoder.reset();
            int i16 = 0;
            while (true) {
                CoderResult coderResultEncode = charBufferWrap.hasRemaining() ? charsetEncoder.encode(charBufferWrap, x(), z10) : charsetEncoder.flush(x());
                if (n1() - iN1 > i12) {
                    throw new IllegalArgumentException("The specified string is too long.");
                }
                if (coderResultEncode.isUnderflow()) {
                    N(b10, i11 - ((n1() - iN1) & i13));
                    int iN2 = n1() - iN1;
                    if (i10 == z10) {
                        s1(iN1 - (z10 ? 1 : 0), (byte) iN2);
                        return this;
                    }
                    if (i10 == i15) {
                        d2(iN1 - i15, (short) iN2);
                        return this;
                    }
                    if (i10 == i14) {
                        T1(iN1 - i14, iN2);
                        return this;
                    }
                } else {
                    if (!coderResultEncode.isOverflow()) {
                        i16 = 0;
                    } else if (Y0()) {
                        if (i16 == 0) {
                            V2((int) Math.ceil(charBufferWrap.remaining() * charsetEncoder.averageBytesPerChar()));
                            i16++;
                            i12 = i12;
                            i14 = 4;
                            i15 = 2;
                            z10 = true;
                        } else {
                            if (i16 != z10) {
                                throw new RuntimeException("Expanded by " + ((int) Math.ceil(charBufferWrap.remaining() * charsetEncoder.maxBytesPerChar())) + " but that wasn't enough for '" + ((Object) charSequence) + "'");
                            }
                            V2((int) Math.ceil(charBufferWrap.remaining() * charsetEncoder.maxBytesPerChar()));
                            i16++;
                            i14 = 4;
                            i15 = 2;
                        }
                    }
                    coderResultEncode.throwException();
                    i12 = i12;
                    i14 = 4;
                    i15 = 2;
                    z10 = true;
                }
            }
        } else {
            if (i10 == 1) {
                r1((byte) 0);
                return this;
            }
            if (i10 == 2) {
                e2((short) 0);
                return this;
            }
            if (i10 == 4) {
                S1(0);
                return this;
            }
        }
        return this;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.davidehrmann.vcdiff.mina_buffer.d dVar) {
        int iN1 = n1() + Math.min(F2(), dVar.F2());
        int iN2 = n1();
        int iN3 = dVar.n1();
        while (iN2 < iN1) {
            byte bW = W(iN2);
            byte bW2 = dVar.W(iN3);
            if (bW != bW2) {
                return bW < bW2 ? -1 : 1;
            }
            iN2++;
            iN3++;
        }
        return F2() - dVar.F2();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final char a0() {
        return x().getChar();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final boolean a1() {
        return this.f97970c;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d a2(CharSequence charSequence, int i10, int i11, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        return Z1(charSequence, i10, i11, (byte) 0, charsetEncoder);
    }

    protected abstract com.davidehrmann.vcdiff.mina_buffer.d a3();

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final boolean b1() {
        return x().isDirect();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d b2(CharSequence charSequence, int i10, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        return a2(charSequence, i10, 0, charsetEncoder);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final char c0(int i10) {
        return x().getChar(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final boolean c1() {
        return x().isReadOnly();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d c2(CharSequence charSequence, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        return a2(charSequence, 2, 0, charsetEncoder);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final double d0() {
        return x().getDouble();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d d2(int i10, short s10) {
        W2(i10, 2);
        x().putShort(i10, s10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final double e0(int i10) {
        return x().getDouble(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int e1() {
        return x().limit();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d e2(short s10) {
        V2(2);
        x().putShort(s10);
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof com.davidehrmann.vcdiff.mina_buffer.d)) {
            return false;
        }
        com.davidehrmann.vcdiff.mina_buffer.d dVar = (com.davidehrmann.vcdiff.mina_buffer.d) obj;
        if (F2() != dVar.F2()) {
            return false;
        }
        int iN1 = n1();
        int iE1 = e1() - 1;
        int iE2 = dVar.e1() - 1;
        while (iE1 >= iN1) {
            if (W(iE1) != dVar.W(iE2)) {
                return false;
            }
            iE1--;
            iE2--;
        }
        return true;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> E f0(int i10, Class<E> cls) {
        return (E) g3(cls, O0(i10));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d f1(int i10) {
        W2(i10, 0);
        x().limit(i10);
        if (this.f97975h > i10) {
            int i11 = 4 | (-1);
            this.f97975h = -1;
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d f2(CharSequence charSequence, int i10, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        Y2(i10);
        if (i10 == 0) {
            return this;
        }
        V2(i10);
        boolean zStartsWith = charsetEncoder.charset().name().startsWith("UTF-16");
        if (zStartsWith && (i10 & 1) != 0) {
            throw new IllegalArgumentException("fieldSize is not even.");
        }
        int iE1 = e1();
        int iN1 = n1() + i10;
        if (iE1 < iN1) {
            throw new BufferOverflowException();
        }
        if (charSequence.length() == 0) {
            if (zStartsWith) {
                r1((byte) 0);
                r1((byte) 0);
            } else {
                r1((byte) 0);
            }
            o1(iN1);
            return this;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(charSequence);
        f1(iN1);
        charsetEncoder.reset();
        while (true) {
            CoderResult coderResultEncode = charBufferWrap.hasRemaining() ? charsetEncoder.encode(charBufferWrap, x(), true) : charsetEncoder.flush(x());
            if (coderResultEncode.isUnderflow() || coderResultEncode.isOverflow()) {
                break;
            }
            coderResultEncode.throwException();
        }
        f1(iE1);
        if (n1() < iN1) {
            if (zStartsWith) {
                r1((byte) 0);
                r1((byte) 0);
            } else {
                r1((byte) 0);
            }
        }
        o1(iN1);
        return this;
    }

    protected abstract com.davidehrmann.vcdiff.mina_buffer.d f3();

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> E g0(Class<E> cls) {
        return (E) g3(cls, N0());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d g1() {
        x().mark();
        this.f97975h = n1();
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d g2(CharSequence charSequence, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        if (charSequence.length() != 0) {
            CharBuffer charBufferWrap = CharBuffer.wrap(charSequence);
            charsetEncoder.reset();
            int i10 = 0;
            while (true) {
                CoderResult coderResultEncode = charBufferWrap.hasRemaining() ? charsetEncoder.encode(charBufferWrap, x(), true) : charsetEncoder.flush(x());
                if (coderResultEncode.isUnderflow()) {
                    break;
                }
                if (!coderResultEncode.isOverflow()) {
                    i10 = 0;
                } else if (Y0()) {
                    if (i10 == 0) {
                        V2((int) Math.ceil(charBufferWrap.remaining() * charsetEncoder.averageBytesPerChar()));
                    } else {
                        if (i10 != 1) {
                            throw new RuntimeException("Expanded by " + ((int) Math.ceil(charBufferWrap.remaining() * charsetEncoder.maxBytesPerChar())) + " but that wasn't enough for '" + ((Object) charSequence) + "'");
                        }
                        V2((int) Math.ceil(charBufferWrap.remaining() * charsetEncoder.maxBytesPerChar()));
                    }
                    i10++;
                }
                coderResultEncode.throwException();
            }
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> E h0(int i10, Class<E> cls) {
        return (E) g3(cls, y0(i10));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int h1() {
        return this.f97975h;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d h2(byte b10) {
        V2(1);
        x().put((byte) (b10 & 255));
        return this;
    }

    public int hashCode() {
        int iN1 = n1();
        int iW = 1;
        for (int iE1 = e1() - 1; iE1 >= iN1; iE1--) {
            iW = (iW * 31) + W(iE1);
        }
        return iW;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> E i0(Class<E> cls) {
        return (E) g3(cls, x0());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int i1() {
        return this.f97974g;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d i2(int i10) {
        V2(1);
        x().put((byte) (i10 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> j0(int i10, Class<E> cls) {
        return h3(cls, ((long) W(i10)) & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d j1(int i10) {
        if (i10 >= 0) {
            this.f97974g = i10;
            return this;
        }
        throw new IllegalArgumentException("minimumCapacity: " + i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d j2(int i10, byte b10) {
        W2(i10, 1);
        x().put(i10, (byte) (b10 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> k0(Class<E> cls) {
        return h3(cls, ((long) V()) & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d k2(int i10, int i11) {
        W2(i10, 1);
        x().put(i10, (byte) (i11 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> l0(int i10, Class<E> cls) {
        return h3(cls, ((long) y0(i10)) & 4294967295L);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d l1(ByteOrder byteOrder) {
        x().order(byteOrder);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d l2(int i10, long j10) {
        W2(i10, 1);
        x().put(i10, (byte) (j10 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> m0(Class<E> cls) {
        return h3(cls, ((long) x0()) & 4294967295L);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final ByteOrder m1() {
        return x().order();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d m2(int i10, short s10) {
        W2(i10, 1);
        x().put(i10, (byte) (s10 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final CharBuffer n() {
        return x().asCharBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> n0(int i10, Class<E> cls) {
        return h3(cls, A0(i10));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int n1() {
        return x().position();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d n2(long j10) {
        V2(1);
        x().put((byte) (j10 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final DoubleBuffer o() {
        return x().asDoubleBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> o0(Class<E> cls) {
        return h3(cls, z0());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d o1(int i10) {
        W2(i10, 0);
        x().position(i10);
        if (this.f97975h > i10) {
            this.f97975h = -1;
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d o2(short s10) {
        V2(1);
        x().put((byte) (s10 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final FloatBuffer p() {
        return x().asFloatBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> p0(int i10, Class<E> cls) {
        return h3(cls, ((long) I0(i10)) & 65535);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public boolean p1(int i10) {
        return q1(i10, Integer.MAX_VALUE);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d p2(byte b10) {
        V2(4);
        x().putInt(b10 & 255);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public InputStream q() {
        return new C0882a();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> EnumSet<E> q0(Class<E> cls) {
        return h3(cls, ((long) H0()) & 65535);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public boolean q1(int i10, int i11) {
        int iO0;
        if (F2() < i10) {
            return false;
        }
        if (i10 == 1) {
            iO0 = O0(n1());
        } else if (i10 == 2) {
            iO0 = U0(n1());
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("prefixLength: " + i10);
            }
            iO0 = y0(n1());
        }
        if (iO0 >= 0 && iO0 <= i11) {
            return F2() - i10 >= iO0;
        }
        throw new com.davidehrmann.vcdiff.mina_buffer.b("dataLength: " + iO0);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d q2(int i10) {
        V2(4);
        x().putInt(i10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final IntBuffer r() {
        return x().asIntBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> E r0(int i10, Class<E> cls) {
        return (E) g3(cls, U0(i10));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d r1(byte b10) {
        V2(1);
        x().put(b10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d r2(int i10, byte b10) {
        W2(i10, 4);
        x().putInt(i10, b10 & 255);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final LongBuffer s() {
        return x().asLongBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public <E extends Enum<E>> E s0(Class<E> cls) {
        return (E) g3(cls, T0());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d s1(int i10, byte b10) {
        W2(i10, 1);
        x().put(i10, b10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d s2(int i10, int i11) {
        W2(i10, 4);
        x().putInt(i10, i11);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public OutputStream t() {
        return new b();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final float t0() {
        return x().getFloat();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d t1(com.davidehrmann.vcdiff.mina_buffer.d dVar) {
        return u1(dVar.x());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d t2(int i10, long j10) {
        W2(i10, 4);
        x().putInt(i10, (int) (j10 & 4294967295L));
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (b1()) {
            sb2.append("DirectBuffer");
        } else {
            sb2.append("HeapBuffer");
        }
        sb2.append("[pos=");
        sb2.append(n1());
        sb2.append(" lim=");
        sb2.append(e1());
        sb2.append(" cap=");
        sb2.append(z());
        sb2.append(": ");
        sb2.append(w0(16));
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final float u0(int i10) {
        return x().getFloat(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d u1(ByteBuffer byteBuffer) {
        V2(byteBuffer.remaining());
        x().put(byteBuffer);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d u2(int i10, short s10) {
        W2(i10, 4);
        x().putInt(i10, s10 & e2.f312492d);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d v() {
        this.f97973f = false;
        return U2();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public String v0() {
        return w0(Integer.MAX_VALUE);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public com.davidehrmann.vcdiff.mina_buffer.d v1(byte[] bArr) {
        return w1(bArr, 0, bArr.length);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d v2(long j10) {
        V2(4);
        x().putInt((int) j10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final ShortBuffer w() {
        return x().asShortBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public String w0(int i10) {
        return f.a(this, i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d w1(byte[] bArr, int i10, int i11) {
        V2(i11);
        x().put(bArr, i10, i11);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d w2(short s10) {
        V2(4);
        x().putInt(s10 & e2.f312492d);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int x0() {
        return x().getInt();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d x1(char c10) {
        V2(2);
        x().putChar(c10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d x2(byte b10) {
        V2(2);
        x().putShort((short) (b10 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int y0(int i10) {
        return x().getInt(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d y1(int i10, char c10) {
        W2(i10, 2);
        x().putChar(i10, c10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d y2(int i10) {
        V2(2);
        x().putShort((short) i10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final int z() {
        return x().capacity();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final long z0() {
        return x().getLong();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d z1(double d10) {
        V2(8);
        x().putDouble(d10);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.d
    public final com.davidehrmann.vcdiff.mina_buffer.d z2(int i10, byte b10) {
        W2(i10, 2);
        x().putShort(i10, (short) (b10 & 255));
        return this;
    }

    /* JADX INFO: renamed from: com.davidehrmann.vcdiff.mina_buffer.a$a, reason: collision with other inner class name */
    class C0882a extends InputStream {
        C0882a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return a.this.F2();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            a.this.g1();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (a.this.W0()) {
                return a.this.V() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            a.this.G2();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            int iF2 = j10 > g3.f12256c ? a.this.F2() : Math.min(a.this.F2(), (int) j10);
            a.this.N2(iF2);
            return iF2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int iF2 = a.this.F2();
            if (iF2 <= 0) {
                return -1;
            }
            int iMin = Math.min(iF2, i11);
            a.this.Y(bArr, i10, iMin);
            return iMin;
        }
    }

    protected a(a aVar) {
        this.f97973f = true;
        com.davidehrmann.vcdiff.mina_buffer.d.I2(com.davidehrmann.vcdiff.mina_buffer.d.Z());
        this.f97973f = false;
        this.f97970c = true;
        this.f97974g = aVar.f97974g;
    }
}
