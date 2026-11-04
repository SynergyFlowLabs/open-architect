package com.google.android.filament.utils;

import kotlin.e2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.n1;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@oj.g
@SourceDebugExtension({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\ncom/google/android/filament/utils/Half\n+ 2 Half.kt\ncom/google/android/filament/utils/HalfKt\n*L\n1#1,1171:1\n1152#2:1172\n1152#2:1173\n1152#2:1174\n*S KotlinDebug\n*F\n+ 1 Half.kt\ncom/google/android/filament/utils/Half\n*L\n574#1:1172\n647#1:1173\n693#1:1174\n*E\n"})
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104901c = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104903e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104904f = -14;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f104914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104900b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final short f104902d = D(e2.n((short) 5120));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final short f104905g = D(e2.n((short) 64511));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short f104906h = D(e2.n((short) 31743));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short f104907i = D(e2.n((short) 1024));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final short f104908j = D(e2.n((short) 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final short f104909k = D(e2.n((short) 32256));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final short f104910l = D(e2.n((short) 64512));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final short f104911m = D(e2.n((short) 32768));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final short f104912n = D(e2.n((short) 31744));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final short f104913o = D(e2.n((short) 0));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(int i10) {
            return i.D(e2.n((short) (65535 & i10)));
        }

        public final short b() {
            return i.f104902d;
        }

        public final short c() {
            return i.f104905g;
        }

        public final short d() {
            return i.f104906h;
        }

        public final short e() {
            return i.f104907i;
        }

        public final short f() {
            return i.f104908j;
        }

        public final short g() {
            return i.f104910l;
        }

        public final short h() {
            return i.f104911m;
        }

        public final short i() {
            return i.f104909k;
        }

        public final short j() {
            return i.f104912n;
        }

        public final short k() {
            return i.f104913o;
        }

        private a() {
        }
    }

    private /* synthetic */ i(short s10) {
        this.f104914a = s10;
    }

    public static short D(short s10) {
        return s10;
    }

    public static final short E(short s10) {
        return f0(s10, D(e2.n((short) 48128)));
    }

    public static final short H(short s10, short s11) {
        int iJ0 = j0(s10);
        int iJ1 = j0(s11);
        int i10 = (iJ0 ^ iJ1) & 32768;
        int i11 = iJ0 & 32767;
        int i12 = 32767;
        int i13 = iJ1 & 32767;
        if (i11 >= 31744 || i13 >= 31744) {
            if (i11 > 31744 || i13 > 31744) {
                if ((iJ0 & 32767) <= 31744) {
                    i11 = i13;
                }
                i12 = i11 | 512;
            } else if (i11 != i13) {
                i12 = i10 | (i11 == 31744 ? 31744 : 0);
            }
            return D(e2.n((short) i12));
        }
        if (i11 == 0) {
            if (i13 == 0) {
                i10 = 32767;
            }
            return D(e2.n((short) i10));
        }
        if (i13 == 0) {
            return D(e2.n((short) (i10 | 31744)));
        }
        int i14 = 14;
        while (i11 < 1024) {
            i11 <<= 1;
            i14--;
        }
        while (i13 < 1024) {
            i13 <<= 1;
            i14++;
        }
        int iN = u1.n((i11 & 1023) | 1024);
        int iN2 = u1.n(1024 | (i13 & 1023));
        int i15 = Integer.compareUnsigned(iN, iN2) < 0 ? 1 : 0;
        int i16 = i14 + (((i11 >> 10) - (i13 >> 10)) - i15);
        if (i16 > 29) {
            return D(e2.n((short) (i10 | 31744)));
        }
        if (i16 < -11) {
            return D(e2.n((short) i10));
        }
        int iN3 = u1.n(iN << (i15 + 12));
        int iN4 = u1.n(iN2 << 1);
        return m.h(i10, i16, Integer.divideUnsigned(iN3, iN4), Integer.remainderUnsigned(iN3, iN4) != 0 ? 1 : 0, 11);
    }

    public static boolean I(short s10, Object obj) {
        return (obj instanceof i) && s10 == ((i) obj).u0();
    }

    public static final boolean L(short s10, short s11) {
        return e2.v(s10, s11);
    }

    public static final short M(short s10) {
        return D(e2.n((short) (s10 & n1.f312766c)));
    }

    public static final int N(short s10) {
        return (((s10 & e2.f312492d) >>> 10) & 31) - 15;
    }

    public static final short O(short s10) {
        int i10 = s10 & n1.f312766c;
        if (i10 > 31744) {
            return f104909k;
        }
        if (i10 == 0) {
            return f104913o;
        }
        return m.b((s10 & n1.f312765b) != 0 ? -1.0f : 1.0f);
    }

    public static final int R(short s10) {
        return s10 & 1023;
    }

    public static final short S(short s10) {
        if (X(s10)) {
            return f104909k;
        }
        if (W(s10)) {
            return f104912n;
        }
        if ((s10 & n1.f312766c) == 31743) {
            return D(e2.n((short) 19456));
        }
        short sM = M(s10);
        return a0(e0(sM), sM);
    }

    public static int T(short s10) {
        return e2.H(s10);
    }

    public static final short U(short s10) {
        return f0(s10, D(e2.n((short) 15360)));
    }

    public static final boolean V(short s10) {
        return (s10 & 31744) != 31744;
    }

    public static final boolean W(short s10) {
        return (s10 & n1.f312766c) == 31744;
    }

    public static final boolean X(short s10) {
        return (s10 & n1.f312766c) > 31744;
    }

    public static final boolean Y(short s10) {
        int i10 = s10 & 31744;
        return (i10 == 0 || i10 == 31744) ? false : true;
    }

    public static final boolean Z(short s10) {
        return (s10 & n1.f312766c) == 0;
    }

    public static final short a0(short s10, short s11) {
        return f0(s10, s0(s11));
    }

    public static final short c0(short s10) {
        if (!X(s10) && s10 != f104910l) {
            if (Z(s10)) {
                return s0(f104908j);
            }
            s10 = D(e2.n((short) (j0(s10) + ((s10 & n1.f312765b) == 0 ? -1 : 1))));
        }
        return s10;
    }

    public static final short d0(short s10, short s11) {
        if (X(s10) || X(s11)) {
            return f104909k;
        }
        if (L(s11, s10)) {
            return s10;
        }
        return z(s11, s10) > 0 ? e0(s10) : c0(s10);
    }

    public static final short e0(short s10) {
        if (!X(s10) && s10 != f104912n) {
            if (Z(s10)) {
                return f104908j;
            }
            s10 = D(e2.n((short) (j0(s10) + ((s10 & n1.f312765b) == 0 ? 1 : -1))));
        }
        return s10;
    }

    public static final short f0(short s10, short s11) {
        int i10;
        int i11;
        int iJ0 = j0(s10);
        int iJ1 = j0(s11);
        int i12 = 7 ^ 1;
        boolean z10 = ((iJ0 ^ iJ1) & 32768) != 0;
        int i13 = iJ0 & 32767;
        int i14 = iJ1 & 32767;
        if (i13 >= 31744 || i14 >= 31744) {
            if (i13 > 31744 || i14 > 31744) {
                if ((iJ0 & 32767) <= 31744) {
                    i13 = i14;
                }
                iJ0 = i13 | 512;
            } else if (i14 == 31744) {
                iJ0 = (z10 && i13 == 31744) ? 32767 : iJ1;
            }
            return D(e2.n((short) iJ0));
        }
        if (i13 == 0) {
            return i14 != 0 ? s11 : D(e2.n((short) (iJ0 & iJ1)));
        }
        if (i14 == 0) {
            return s10;
        }
        if (z10 && i14 > i13) {
            iJ0 = iJ1;
        }
        int i15 = iJ0 & 32768;
        if (i14 > i13) {
            i14 = i13;
            i13 = i14;
        }
        int i16 = (i13 >> 10) + (i13 <= 1023 ? 1 : 0);
        int i17 = (i16 - (i14 >> 10)) - (i14 <= 1023 ? 1 : 0);
        int i18 = ((i13 & 1023) | ((i13 > 1023 ? 1 : 0) << 10)) << 3;
        if (i17 < 13) {
            int i19 = (((i14 > 1023 ? 1 : 0) << 10) | (i14 & 1023)) << 3;
            i10 = ((i19 & ((1 << i17) - 1)) != 0 ? 1 : 0) | (i19 >> i17);
        } else {
            i10 = 1;
        }
        if (z10) {
            i11 = i18 - i10;
            if (i11 == 0) {
                return f104913o;
            }
            while (i11 < 8192 && i16 > 1) {
                i11 <<= 1;
                i16--;
            }
        } else {
            int i20 = i18 + i10;
            int i21 = i20 >> 14;
            i16 += i21;
            if (i16 > 30) {
                return D(e2.n((short) (i15 | 31744)));
            }
            i11 = (i20 >> i21) | (i21 & i20);
        }
        int i22 = i15 + ((i16 - 1) << 10) + (i11 >> 3);
        return D(e2.n((short) (i22 + ((i11 >> 2) & 1 & (((i11 & 3) != 0 ? 1 : 0) | i22)))));
    }

    public static final int g0(short s10) {
        if (X(s10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return o0(m.r(s10));
    }

    public static final long h0(short s10) {
        if (X(s10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return p0(m.r(s10));
    }

    public static final short i0(short s10, short s11) {
        int iJ0 = j0(s10);
        int iJ1 = j0(s11);
        int i10 = (iJ0 ^ iJ1) & 32768;
        int i11 = iJ0 & 32767;
        int i12 = 32767;
        int i13 = iJ1 & 32767;
        if (i11 >= 31744 || i13 >= 31744) {
            if (i11 > 31744 || i13 > 31744) {
                if ((iJ0 & 32767) <= 31744) {
                    i11 = i13;
                }
                i12 = i11 | 512;
            } else if ((i11 != 31744 || i13 != 0) && (i13 != 31744 || i11 != 0)) {
                i12 = i10 | 31744;
            }
            return D(e2.n((short) i12));
        }
        if (i11 != 0 && i13 != 0) {
            int i14 = -16;
            while (i11 < 1024) {
                i11 <<= 1;
                i14--;
            }
            while (i13 < 1024) {
                i13 <<= 1;
                i14--;
            }
            int iN = u1.n(u1.n((i11 & 1023) | 1024) * u1.n(1024 | (i13 & 1023)));
            int iN2 = u1.n(iN >>> 21);
            int i15 = i14 + (i11 >> 10) + (i13 >> 10) + iN2;
            if (i15 > 29) {
                return D(e2.n((short) (i10 | 31744)));
            }
            return i15 < -11 ? D(e2.n((short) i10)) : m.h(i10, i15, u1.n(iN >>> iN2), u1.n(iN & iN2), 20);
        }
        return D(e2.n((short) i10));
    }

    public static final int j0(short s10) {
        return s10 & e2.f312492d;
    }

    public static final byte k0(short s10) {
        return (byte) m.m(s10);
    }

    public static final double l0(short s10) {
        return m.m(s10);
    }

    public static final float m0(short s10) {
        return m.m(s10);
    }

    @NotNull
    public static final String n0(short s10) {
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
        String string3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return string3;
    }

    public static final int o0(short s10) {
        return (int) m.m(s10);
    }

    public static final long p0(short s10) {
        return (long) m.m(s10);
    }

    public static final short q0(short s10) {
        return (short) m.m(s10);
    }

    @NotNull
    public static String r0(short s10) {
        return String.valueOf(m0(s10));
    }

    public static final short s0(short s10) {
        return D(e2.n((short) ((s10 & e2.f312492d) ^ 32768)));
    }

    public static final short t0(short s10) {
        return D(s10);
    }

    public static final short v0(short s10, short s11) {
        return D(e2.n((short) ((s10 & n1.f312766c) | (s11 & n1.f312765b))));
    }

    public static final /* synthetic */ i w(short s10) {
        return new i(s10);
    }

    public static int z(short s10, short s11) {
        if ((s10 & n1.f312766c) > 31744) {
            s10 = 32256;
        }
        if ((s11 & n1.f312766c) > 31744) {
            s11 = 32256;
        }
        if (s10 == s11) {
            return 0;
        }
        int i10 = s10 >> 15;
        int i11 = (s10 ^ ((32768 - i10) | 32768)) + i10;
        int i12 = s11 >> 15;
        return i11 < (s11 ^ (32768 | (32768 - i12))) + i12 ? -1 : 1;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(i iVar) {
        return x(iVar.u0());
    }

    public boolean equals(Object obj) {
        return I(this.f104914a, obj);
    }

    public int hashCode() {
        return T(this.f104914a);
    }

    @NotNull
    public String toString() {
        return r0(this.f104914a);
    }

    public final /* synthetic */ short u0() {
        return this.f104914a;
    }

    public int x(short s10) {
        return z(this.f104914a, s10);
    }
}
