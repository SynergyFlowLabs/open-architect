package kotlinx.io;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n-Util.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Util.kt\nkotlinx/io/_UtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n89#1:186\n95#1:187\n1#2:185\n*S KotlinDebug\n*F\n+ 1 -Util.kt\nkotlinx/io/_UtilKt\n*L\n114#1:186\n115#1:187\n*E\n"})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final char[] f315772a = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', ni.f.f333369f, 'e', 'f'};

    public static final int a(byte b10, int i10) {
        return b10 & i10;
    }

    public static final long b(byte b10, long j10) {
        return ((long) b10) & j10;
    }

    public static final long c(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final void d(int i10, int i11, int i12) {
        e(i10, i11, i12);
    }

    public static final void e(long j10, long j11, long j12) {
        if (j11 < 0 || j12 > j10) {
            throw new IndexOutOfBoundsException("startIndex (" + j11 + ") and endIndex (" + j12 + ") are not within the range [0..size(" + j10 + "))");
        }
        if (j11 <= j12) {
            return;
        }
        throw new IllegalArgumentException("startIndex (" + j11 + ") > endIndex (" + j12 + ')');
    }

    public static final void f(long j10) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
    }

    public static final void g(long j10, long j11, long j12) {
        if (j11 < 0 || j11 > j10 || j10 - j11 < j12 || j12 < 0) {
            throw new IllegalArgumentException("offset (" + j11 + ") and byteCount (" + j12 + ") are not within the range [0..size(" + j10 + "))");
        }
    }

    @NotNull
    public static final char[] h() {
        return f315772a;
    }

    public static final int i(long j10) {
        if (j10 == 0) {
            return 1;
        }
        return (67 - Long.numberOfLeadingZeros(j10)) / 4;
    }

    public static final long j(int i10, long j10) {
        return Math.min(i10, j10);
    }

    public static final long k(long j10, int i10) {
        return Math.min(j10, i10);
    }

    public static final int l(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long m(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short n(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final int o(byte b10, int i10) {
        return b10 << i10;
    }

    public static final int p(byte b10, int i10) {
        return b10 >> i10;
    }

    @NotNull
    public static final String q(byte b10) {
        char[] cArr = f315772a;
        int i10 = 3 >> 2;
        return StringsKt.w1(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & com.google.common.base.c.f116464q]});
    }

    @NotNull
    public static final String r(int i10) {
        if (i10 == 0) {
            return com.facebook.appevents.p.f99189d0;
        }
        char[] cArr = f315772a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        return StringsKt.x1(cArr2, i11, 8);
    }

    @NotNull
    public static final String s(long j10) {
        if (j10 == 0) {
            return com.facebook.appevents.p.f99189d0;
        }
        char[] cArr = f315772a;
        int i10 = 0;
        char[] cArr2 = {cArr[(int) ((j10 >> 60) & 15)], cArr[(int) ((j10 >> 56) & 15)], cArr[(int) ((j10 >> 52) & 15)], cArr[(int) ((j10 >> 48) & 15)], cArr[(int) ((j10 >> 44) & 15)], cArr[(int) ((j10 >> 40) & 15)], cArr[(int) ((j10 >> 36) & 15)], cArr[(int) ((j10 >> 32) & 15)], cArr[(int) ((j10 >> 28) & 15)], cArr[(int) ((j10 >> 24) & 15)], cArr[(int) ((j10 >> 20) & 15)], cArr[(int) ((j10 >> 16) & 15)], cArr[(int) ((j10 >> 12) & 15)], cArr[(int) ((j10 >> 8) & 15)], cArr[(int) ((j10 >> 4) & 15)], cArr[(int) (j10 & 15)]};
        while (i10 < 16 && cArr2[i10] == '0') {
            i10++;
        }
        return StringsKt.x1(cArr2, i10, 16);
    }

    public static final byte t(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }
}
