package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final org.slf4j.c f97907f = org.slf4j.e.k(m.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final short f97908g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final short f97909h = -2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte f97910i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte f97911j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f97912k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte f97913l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte f97914m = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected IOException f97916b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final ByteBuffer f97918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ByteBuffer f97919e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected short f97915a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Integer f97917c = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f97920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f97921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f97922c;

        public a(byte b10, int i10, int i11) {
            this.f97920a = b10;
            this.f97921b = i10;
            this.f97922c = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f97923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f97924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f97925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f97926d;

        public b(int i10, int i11, int i12, int i13) {
            this.f97923a = i10;
            this.f97924b = i11;
            this.f97925c = i12;
            this.f97926d = i13;
        }
    }

    public m(ByteBuffer byteBuffer) {
        this.f97918d = byteBuffer.duplicate();
    }

    private a j(long j10, byte b10, String str, String str2) throws IOException {
        Integer numI = i("source segment length");
        if (numI == null) {
            return null;
        }
        if (numI.intValue() > j10) {
            IOException iOException = new IOException(String.format("Source segment length (%d) is larger than %s (%d)", numI, str2, Long.valueOf(j10)));
            this.f97916b = iOException;
            throw iOException;
        }
        Integer numI2 = i("source segment position");
        if (numI2 == null) {
            return null;
        }
        if (numI2.intValue() >= j10 && numI.intValue() > 0) {
            IOException iOException2 = new IOException(String.format("Source segment position (%d) is past %s (%d)", numI2, str, Long.valueOf(j10)));
            this.f97916b = iOException2;
            throw iOException2;
        }
        int iIntValue = numI2.intValue() + numI.intValue();
        if (iIntValue <= j10) {
            return new a(b10, numI.intValue(), numI2.intValue());
        }
        IOException iOException3 = new IOException(String.format("Source segment end position ({}) is past {} ({})", Integer.valueOf(iIntValue), str, Long.valueOf(j10)));
        this.f97916b = iOException3;
        throw iOException3;
    }

    public Integer a() throws IOException {
        if (this.f97919e != null) {
            IOException iOException = new IOException("Internal error: VCDiffHeaderParser.ParseWindowLengths was called twice for the same delta window");
            this.f97916b = iOException;
            throw iOException;
        }
        Integer numI = i("length of the delta encoding");
        this.f97917c = numI;
        if (numI == null) {
            return null;
        }
        this.f97919e = this.f97918d.duplicate();
        return i("size of the target window");
    }

    public Integer b() {
        ByteBuffer byteBuffer = this.f97919e;
        if (byteBuffer != null) {
            return Integer.valueOf(byteBuffer.position() + this.f97917c.intValue());
        }
        throw new IllegalStateException("Internal error: VCDiffHeaderParser.GetDeltaWindowEnd was called before ParseWindowLengths");
    }

    public short c() {
        return this.f97915a;
    }

    public Byte d() throws IOException {
        if (this.f97915a != 0) {
            return null;
        }
        IOException iOException = this.f97916b;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f97918d.hasRemaining()) {
            return Byte.valueOf(this.f97918d.get());
        }
        this.f97915a = (short) -2;
        return null;
    }

    public Integer e(String str) throws IOException {
        return k(str);
    }

    public boolean f() throws IOException {
        Byte bD = d();
        if (bD == null) {
            return false;
        }
        if ((bD.byteValue() & 7) == 0) {
            return true;
        }
        IOException iOException = new IOException("Secondary compression of delta file sections is not supported");
        this.f97916b = iOException;
        throw iOException;
    }

    public Integer g(String str) throws IOException {
        if (this.f97915a != 0) {
            return null;
        }
        IOException iOException = this.f97916b;
        if (iOException != null) {
            throw iOException;
        }
        this.f97918d.mark();
        try {
            return Integer.valueOf(com.davidehrmann.vcdiff.util.b.c(this.f97918d));
        } catch (com.davidehrmann.vcdiff.util.b.a unused) {
            this.f97918d.reset();
            this.f97915a = (short) -2;
            return null;
        } catch (com.davidehrmann.vcdiff.util.b.C0884b unused2) {
            this.f97918d.reset();
            IOException iOException2 = new IOException("Expected " + str + "; found invalid variable-length integer");
            this.f97916b = iOException2;
            throw iOException2;
        }
    }

    public b h(boolean z10) throws IOException {
        Integer numI = i("length of data for ADDs and RUNs");
        Integer numI2 = i("length of instructions section");
        Integer numI3 = i("length of addresses for COPYs");
        Integer numE = z10 ? e("Adler32 checksum value") : null;
        if (this.f97915a != 0) {
            return null;
        }
        IOException iOException = this.f97916b;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f97919e == null) {
            IOException iOException2 = new IOException("Internal error: VCDiffHeaderParser.parseSectionLengths was called before ParseWindowLengths");
            this.f97916b = iOException2;
            throw iOException2;
        }
        if (this.f97917c.intValue() == ((long) (this.f97918d.position() - this.f97919e.position())) + ((long) numI.intValue()) + ((long) numI2.intValue()) + ((long) numI3.intValue())) {
            return new b(numI.intValue(), numI2.intValue(), numI3.intValue(), numE != null ? numE.intValue() : 0);
        }
        IOException iOException3 = new IOException("The length of the delta encoding does not match the size of the header plus the sizes of the data sections");
        this.f97916b = iOException3;
        throw iOException3;
    }

    public Integer i(String str) throws IOException {
        return g(str);
    }

    public Integer k(String str) throws IOException {
        if (this.f97915a != 0) {
            return null;
        }
        IOException iOException = this.f97916b;
        if (iOException != null) {
            throw iOException;
        }
        try {
            this.f97918d.mark();
            long jD = com.davidehrmann.vcdiff.util.b.d(this.f97918d);
            if (((-4294967296L) & jD) == 0) {
                return Integer.valueOf((int) jD);
            }
            this.f97918d.reset();
            IOException iOException2 = new IOException(String.format("Value of {} ({}) is too large for unsigned 32-bit integer", str, Long.valueOf(jD)));
            this.f97916b = iOException2;
            throw iOException2;
        } catch (com.davidehrmann.vcdiff.util.b.a unused) {
            this.f97915a = (short) -2;
            this.f97918d.reset();
            return null;
        } catch (com.davidehrmann.vcdiff.util.b.C0884b unused2) {
            this.f97918d.reset();
            IOException iOException3 = new IOException(String.format("Expected {}; found invalid variable-length integer", str));
            this.f97916b = iOException3;
            throw iOException3;
        }
    }

    public a l(int i10, int i11, boolean z10) throws IOException {
        Byte bD = d();
        if (bD == null) {
            return null;
        }
        int iByteValue = bD.byteValue() & 248;
        if (iByteValue != 0) {
            f97907f.m0(String.format("Unrecognized win_indicator flags: 0x%02x", Integer.valueOf(iByteValue)));
        }
        int iByteValue2 = bD.byteValue() & 3;
        if (iByteValue2 == 1) {
            return j(i10, bD.byteValue(), "end of dictionary", "dictionary");
        }
        if (iByteValue2 != 2) {
            if (iByteValue2 != 3) {
                return new a(bD.byteValue(), 0, 0);
            }
            IOException iOException = new IOException("Win_Indicator must not have both VCD_SOURCE and VCD_TARGET set");
            this.f97916b = iOException;
            throw iOException;
        }
        if (z10) {
            return j(i11, bD.byteValue(), "current target position", "target file");
        }
        IOException iOException2 = new IOException("Delta file contains VCD_TARGET flag, which is not allowed by current decoder settings");
        this.f97916b = iOException2;
        throw iOException2;
    }

    public ByteBuffer m() {
        return this.f97918d.duplicate().asReadOnlyBuffer();
    }
}
