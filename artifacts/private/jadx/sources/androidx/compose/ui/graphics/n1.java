package androidx.compose.ui.graphics;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n22#2:643\n22#2:644\n22#2:645\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n589#1:643\n606#1:644\n518#1:645\n*E\n"})
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f38063a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f38064b = 32768;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38065c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38066d = 31;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38067e = 1023;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38068f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f38069g = 32767;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f38070h = 31744;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f38071i = 15360;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f38072j = 32256;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f38073k = 31;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f38074l = 23;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f38075m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f38076n = 8388607;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f38077o = 127;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f38078p = 4194304;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f38079q = 1056964608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f38080r = Float.intBitsToFloat(f38079q);

    public static final short b(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = f38076n & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else {
                if (i16 > 0) {
                    i15 = i13 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    } else {
                        i14 = i16;
                    }
                    return (short) i10;
                }
                if (i16 >= -10) {
                    int i17 = (8388608 | i13) >> (1 - i16);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i14 = 0;
                    i15 = i17 >> 13;
                } else {
                    i14 = 0;
                }
            }
        } else if (i13 != 0) {
            i15 = 512;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i10;
    }

    public static final float c(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + com.planner5d.library.engine.input.f.b.B;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + f38079q) - f38080r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final short d(short s10, short s11) {
        if (m1.X(s10) || m1.X(s11)) {
            return m1.f38033b.f();
        }
        return m1.D(s10, s11) >= 0 ? s10 : s11;
    }

    public static final short e(short s10, short s11) {
        if (m1.X(s10) || m1.X(s11)) {
            return m1.f38033b.f();
        }
        return m1.D(s10, s11) <= 0 ? s10 : s11;
    }

    private static final int f(short s10) {
        return (s10 & kotlin.jvm.internal.n1.f312765b) != 0 ? 32768 - (s10 & kotlin.e2.f312492d) : s10 & kotlin.e2.f312492d;
    }
}
