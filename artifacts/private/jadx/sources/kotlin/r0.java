package kotlin;

/* JADX INFO: loaded from: classes11.dex */
class r0 extends q0 {
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int T0(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & 255) - 24;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int U0(short s10) {
        return Integer.numberOfLeadingZeros(s10 & e2.f312492d) - 16;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int V0(byte b10) {
        return Integer.bitCount(b10 & 255);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int W0(short s10) {
        return Integer.bitCount(s10 & e2.f312492d);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int X0(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | 256);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int Y0(short s10) {
        return Integer.numberOfTrailingZeros(s10 | 65536);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    public static final byte Z0(byte b10, int i10) {
        int i11 = i10 & 7;
        return (byte) (((b10 & 255) >>> (8 - i11)) | (b10 << i11));
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    public static final short a1(short s10, int i10) {
        int i11 = i10 & 15;
        return (short) (((s10 & 65535) >>> (16 - i11)) | (s10 << i11));
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    public static final byte b1(byte b10, int i10) {
        int i11 = i10 & 7;
        return (byte) (((b10 & 255) >>> i11) | (b10 << (8 - i11)));
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    public static final short c1(short s10, int i10) {
        int i11 = i10 & 15;
        return (short) (((s10 & 65535) >>> i11) | (s10 << (16 - i11)));
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final byte d1(byte b10) {
        return (byte) Integer.highestOneBit(b10 & 255);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final short e1(short s10) {
        return (short) Integer.highestOneBit(s10 & e2.f312492d);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final byte f1(byte b10) {
        return (byte) Integer.lowestOneBit(b10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final short g1(short s10) {
        return (short) Integer.lowestOneBit(s10);
    }
}
