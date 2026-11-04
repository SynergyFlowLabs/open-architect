package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n535#2,38:643\n578#2,12:681\n590#2,17:694\n522#2,4:711\n22#3:693\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n95#1:643,38\n138#1:681,12\n138#1:694,17\n198#1:711,4\n138#1:693\n*E\n"})
public final class m1 implements Comparable<m1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38034c = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38036e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38037f = -14;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f38047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38033b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final short f38035d = I(5120);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final short f38038g = I(-1025);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short f38039h = I(31743);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short f38040i = I(androidx.media3.exoplayer.audio.s0.f63371y);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final short f38041j = I(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final short f38042k = I(32256);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final short f38043l = I(-1024);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final short f38044m = I(kotlin.jvm.internal.n1.f312765b);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final short f38045n = I(31744);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final short f38046o = I(0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a() {
            return m1.f38035d;
        }

        public final short b() {
            return m1.f38038g;
        }

        public final short c() {
            return m1.f38039h;
        }

        public final short d() {
            return m1.f38040i;
        }

        public final short e() {
            return m1.f38041j;
        }

        public final short f() {
            return m1.f38042k;
        }

        public final short g() {
            return m1.f38043l;
        }

        public final short h() {
            return m1.f38044m;
        }

        public final short i() {
            return m1.f38045n;
        }

        public final short j() {
            return m1.f38046o;
        }

        private a() {
        }
    }

    private /* synthetic */ m1(short s10) {
        this.f38047a = s10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int D(short s10, short s11) {
        if (X(s10)) {
            return !X(s11) ? 1 : 0;
        }
        if (X(s11)) {
            return -1;
        }
        return Intrinsics.compare((s10 & kotlin.jvm.internal.n1.f312765b) != 0 ? 32768 - (s10 & kotlin.e2.f312492d) : s10 & kotlin.e2.f312492d, (s11 & kotlin.jvm.internal.n1.f312765b) != 0 ? 32768 - (s11 & kotlin.e2.f312492d) : s11 & kotlin.e2.f312492d);
    }

    public static short E(double d10) {
        return H((float) d10);
    }

    public static short H(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
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
                    return I((short) i10);
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
        return I((short) i10);
    }

    public static short I(short s10) {
        return s10;
    }

    public static boolean L(short s10, Object obj) {
        if ((obj instanceof m1) && s10 == ((m1) obj).m0()) {
            return true;
        }
        return false;
    }

    public static final boolean M(short s10, short s11) {
        return s10 == s11;
    }

    public static final short N(short s10) {
        int i10 = 65535;
        int i11 = s10 & kotlin.e2.f312492d;
        int i12 = s10 & kotlin.jvm.internal.n1.f312766c;
        if (i12 < 15360) {
            int i13 = s10 & kotlin.jvm.internal.n1.f312765b;
            if (i11 <= 32768) {
                i10 = 0;
            }
            i11 = i13 | (i10 & 15360);
        } else if (i12 < 25600) {
            int i14 = (1 << (25 - (i12 >> 10))) - 1;
            i11 = (i11 + ((-(i11 >> 15)) & i14)) & (~i14);
        }
        return I((short) i11);
    }

    public static final int O(short s10) {
        return ((s10 >>> 10) & 31) - 15;
    }

    public static final short S(short s10) {
        int i10 = s10 & kotlin.jvm.internal.n1.f312766c;
        if (!((i10 > 31744) | (i10 == 0))) {
            i10 = (s10 & kotlin.jvm.internal.n1.f312765b) | 15360;
        }
        return I((short) i10);
    }

    public static final int T(short s10) {
        return s10 & 1023;
    }

    public static int U(short s10) {
        return Short.hashCode(s10);
    }

    public static final boolean V(short s10) {
        return (s10 & kotlin.jvm.internal.n1.f312766c) != 31744;
    }

    public static final boolean W(short s10) {
        return (s10 & kotlin.jvm.internal.n1.f312766c) == 31744;
    }

    public static final boolean X(short s10) {
        return (s10 & kotlin.jvm.internal.n1.f312766c) > 31744;
    }

    public static final boolean Y(short s10) {
        int i10 = s10 & 31744;
        return (i10 != 0) & (i10 != 31744);
    }

    public static final short Z(short s10) {
        int i10 = 65535;
        int i11 = s10 & kotlin.e2.f312492d;
        int i12 = s10 & kotlin.jvm.internal.n1.f312766c;
        if (i12 < 15360) {
            int i13 = s10 & kotlin.jvm.internal.n1.f312765b;
            if (i12 < 14336) {
                i10 = 0;
            }
            i11 = i13 | (i10 & 15360);
        } else if (i12 < 25600) {
            int i14 = i12 >> 10;
            i11 = (i11 + (1 << (24 - i14))) & (~((1 << (25 - i14)) - 1));
        }
        return I((short) i11);
    }

    public static final int a0(short s10) {
        if (X(s10)) {
            return 32256;
        }
        return s10 & kotlin.e2.f312492d;
    }

    public static final short b(short s10) {
        return I((short) (s10 & kotlin.jvm.internal.n1.f312766c));
    }

    public static final byte c0(short s10) {
        return (byte) e0(s10);
    }

    public static final double d0(short s10) {
        return e0(s10);
    }

    public static final float e0(short s10) {
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
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - n1.f38080r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    @NotNull
    public static final String f0(short s10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 65535 & s10;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append(org.apache.commons.codec.language.l.f335457d);
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                String string = Integer.toString(i13, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(new Regex("0{2,}$").n(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String string2 = Integer.toString(i13, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb2.append(new Regex("0{2,}$").n(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append(org.apache.commons.codec.language.l.f335457d);
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        return sb2.toString();
    }

    public static final int g0(short s10) {
        return (int) e0(s10);
    }

    public static final long h0(short s10) {
        return (long) e0(s10);
    }

    public static final int i0(short s10) {
        return s10 & kotlin.e2.f312492d;
    }

    public static final short j0(short s10) {
        return (short) e0(s10);
    }

    @NotNull
    public static String k0(short s10) {
        return String.valueOf(e0(s10));
    }

    public static final short l0(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & kotlin.jvm.internal.n1.f312766c;
        if (i11 < 15360) {
            i10 = Short.MIN_VALUE & s10;
        } else if (i11 < 25600) {
            i10 &= ~((1 << (25 - (i11 >> 10))) - 1);
        }
        return I((short) i10);
    }

    public static final short n0(short s10, short s11) {
        return I((short) ((s10 & kotlin.jvm.internal.n1.f312766c) | (s11 & kotlin.jvm.internal.n1.f312765b)));
    }

    public static final /* synthetic */ m1 w(short s10) {
        return new m1(s10);
    }

    public static final short x(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & kotlin.jvm.internal.n1.f312766c;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (s10 & kotlin.jvm.internal.n1.f312765b);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return I((short) i10);
    }

    public final short R() {
        return this.f38047a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(m1 m1Var) {
        return z(m1Var.m0());
    }

    public boolean equals(Object obj) {
        return L(this.f38047a, obj);
    }

    public int hashCode() {
        return U(this.f38047a);
    }

    public final /* synthetic */ short m0() {
        return this.f38047a;
    }

    @NotNull
    public String toString() {
        return k0(this.f38047a);
    }

    public int z(short s10) {
        return D(this.f38047a, s10);
    }
}
