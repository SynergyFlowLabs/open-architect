package okio;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
@oj.i(name = "-SegmentedByteString")
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final l.a f334920a = new l.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f334921b = -1234567890;

    public static final int a(byte b10, int i10) {
        return b10 & i10;
    }

    public static final long b(byte b10, long j10) {
        return ((long) b10) & j10;
    }

    public static final long c(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final boolean d(@NotNull byte[] a10, int i10, @NotNull byte[] b10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int f() {
        return f334921b;
    }

    @NotNull
    public static final l.a g() {
        return f334920a;
    }

    public static /* synthetic */ void h() {
    }

    public static final int i(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static final long j(int i10, long j10) {
        return Math.min(i10, j10);
    }

    public static final long k(long j10, int i10) {
        return Math.min(j10, i10);
    }

    public static final int l(@NotNull o oVar, int i10) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return i10 == f334921b ? oVar.v0() : i10;
    }

    public static final int m(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i10 == f334921b ? bArr.length : i10;
    }

    @NotNull
    public static final l.a n(@NotNull l.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f334920a ? new l.a() : unsafeCursor;
    }

    public static final int o(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long p(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short q(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final long r(long j10, int i10) {
        return (j10 << (64 - i10)) | (j10 >>> i10);
    }

    public static final int s(byte b10, int i10) {
        return b10 << i10;
    }

    public static final int t(byte b10, int i10) {
        return b10 >> i10;
    }

    @NotNull
    public static final String u(byte b10) {
        return StringsKt.w1(new char[]{okio.internal.c.J()[(b10 >> 4) & 15], okio.internal.c.J()[b10 & com.google.common.base.c.f116464q]});
    }

    @NotNull
    public static final String v(int i10) {
        if (i10 == 0) {
            return com.facebook.appevents.p.f99189d0;
        }
        int i11 = 0;
        char[] cArr = {okio.internal.c.J()[(i10 >> 28) & 15], okio.internal.c.J()[(i10 >> 24) & 15], okio.internal.c.J()[(i10 >> 20) & 15], okio.internal.c.J()[(i10 >> 16) & 15], okio.internal.c.J()[(i10 >> 12) & 15], okio.internal.c.J()[(i10 >> 8) & 15], okio.internal.c.J()[(i10 >> 4) & 15], okio.internal.c.J()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return StringsKt.x1(cArr, i11, 8);
    }

    @NotNull
    public static final String w(long j10) {
        if (j10 == 0) {
            return com.facebook.appevents.p.f99189d0;
        }
        int i10 = 0;
        char[] cArr = {okio.internal.c.J()[(int) ((j10 >> 60) & 15)], okio.internal.c.J()[(int) ((j10 >> 56) & 15)], okio.internal.c.J()[(int) ((j10 >> 52) & 15)], okio.internal.c.J()[(int) ((j10 >> 48) & 15)], okio.internal.c.J()[(int) ((j10 >> 44) & 15)], okio.internal.c.J()[(int) ((j10 >> 40) & 15)], okio.internal.c.J()[(int) ((j10 >> 36) & 15)], okio.internal.c.J()[(int) ((j10 >> 32) & 15)], okio.internal.c.J()[(int) ((j10 >> 28) & 15)], okio.internal.c.J()[(int) ((j10 >> 24) & 15)], okio.internal.c.J()[(int) ((j10 >> 20) & 15)], okio.internal.c.J()[(int) ((j10 >> 16) & 15)], okio.internal.c.J()[(int) ((j10 >> 12) & 15)], okio.internal.c.J()[(int) ((j10 >> 8) & 15)], okio.internal.c.J()[(int) ((j10 >> 4) & 15)], okio.internal.c.J()[(int) (j10 & 15)]};
        while (i10 < 16 && cArr[i10] == '0') {
            i10++;
        }
        return StringsKt.x1(cArr, i10, 16);
    }

    public static final byte x(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }
}
