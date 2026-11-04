package com.google.android.filament.utils;

import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\ncom/google/android/filament/utils/HalfKt\n*L\n1#1,1171:1\n1149#1:1172\n1149#1:1173\n1149#1:1174\n1149#1:1175\n1149#1:1176\n*S KotlinDebug\n*F\n+ 1 Half.kt\ncom/google/android/filament/utils/HalfKt\n*L\n821#1:1172\n954#1:1173\n988#1:1174\n1023#1:1175\n1055#1:1176\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f104927a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f104928b = 32768;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f104929c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f104930d = 31;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f104931e = 1023;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f104932f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f104933g = 32767;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f104934h = 31744;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f104935i = 32256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f104936j = 32767;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f104937k = 31;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f104938l = 23;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f104939m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f104940n = 8388607;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f104941o = 127;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f104942p = 4194304;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f104943q = 1056964608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f104944r;

    static {
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
        f104944r = Float.intBitsToFloat(f104943q);
    }

    public static final short a(double d10) {
        return i.D(i((float) d10));
    }

    public static final short b(float f10) {
        return i.D(i(f10));
    }

    public static final short c(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return i.D(i(Float.parseFloat(value)));
    }

    public static final short d(short s10) {
        return i.M(s10);
    }

    public static final short g(short s10) {
        int iJ0 = i.j0(s10);
        int i10 = iJ0 & 32767;
        if (i10 < 15360) {
            iJ0 = ((-((~(iJ0 >> 15)) & (i10 == 0 ? 0 : 1))) & 15360) | (32768 & iJ0);
        } else if (i10 < 25600) {
            int i11 = (1 << (25 - (i10 >> 10))) - 1;
            iJ0 = (iJ0 + (i11 & ((iJ0 >> 15) - 1))) & (~i11);
        } else if (i10 > f104934h) {
            iJ0 |= 512;
        }
        return i.D(e2.n((short) iJ0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final short h(int i10, int i11, int i12, int i13, int i14) {
        int iN;
        int iN2;
        int iN3;
        if (i11 < 0) {
            iN = u1.n(u1.n(i10) + u1.n(i12 >>> ((i14 - 10) - i11)));
            int i15 = (i14 - 11) - i11;
            iN2 = u1.n(u1.n(i12 >>> i15) & 1);
            iN3 = u1.n(u1.n(u1.n(i12 & u1.n(u1.n(1 << i15) - u1.n(1))) != 0 ? 1 : 0) | i13);
        } else {
            iN = u1.n(u1.n(u1.n(i10) + u1.n(u1.n(i11) << 10)) + u1.n(i12 >>> (i14 - 10)));
            int i16 = i14 - 11;
            iN2 = u1.n(u1.n(i12 >>> i16) & 1);
            iN3 = u1.n(u1.n(u1.n(i12 & u1.n(u1.n(1 << i16) - u1.n(1))) != 0 ? 1 : 0) | i13);
        }
        return i.D(e2.n((short) u1.n(iN + u1.n(iN2 & u1.n(iN3 | iN)))));
    }

    private static final short i(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10);
        int i10 = iFloatToIntBits >>> 31;
        int i11 = (iFloatToIntBits >>> 23) & 255;
        int i12 = f104940n & iFloatToIntBits;
        int i13 = 31;
        int i14 = 0;
        if (i11 != 255) {
            int i15 = i11 - 112;
            if (i15 >= 31) {
                i13 = 49;
            } else if (i15 > 0) {
                i14 = i12 >> 13;
                if ((iFloatToIntBits & 4096) != 0) {
                    return e2.n((short) ((((i15 << 10) | i14) + 1) | (i10 << 15)));
                }
                i13 = i15;
            } else if (i15 >= -10) {
                int i16 = (8388608 | i12) >> (1 - i15);
                if ((i16 & 4096) != 0) {
                    i16 += 8192;
                }
                i13 = 0;
                i14 = i16 >> 13;
            } else {
                i13 = 0;
            }
        } else if (i12 != 0) {
            i14 = 512;
        }
        return e2.n((short) ((i10 << 15) | (i13 << 10) | i14));
    }

    public static final short j(short s10) {
        int iJ0 = i.j0(s10);
        int i10 = iJ0 & 32767;
        if (i10 < 15360) {
            iJ0 = ((iJ0 > 32768 ? 65535 : 0) & 15360) | (iJ0 & 32768);
        } else if (i10 < 25600) {
            int i11 = (1 << (25 - (i10 >> 10))) - 1;
            iJ0 = (iJ0 + ((-(iJ0 >> 15)) & i11)) & (~i11);
        } else if (i10 > f104934h) {
            iJ0 |= 512;
        }
        return i.D(e2.n((short) iJ0));
    }

    public static final short k(double d10) {
        return i.D(i((float) d10));
    }

    public static final short l(float f10) {
        return i.D(i(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(short s10) {
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
                kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + f104943q) - f104944r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        int i18 = (i12 << 23) | (i13 << 16) | i11;
        kotlin.jvm.internal.z zVar2 = kotlin.jvm.internal.z.f312833a;
        return Float.intBitsToFloat(i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if ((r0 & 32768) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r0 > ((r3 & 32768) != 0 ? 32768 - (r3 & 65535) : r3 & 65535)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final short n(short r6, short r7) {
        /*
            int r0 = com.google.android.filament.utils.i.j0(r6)
            r5 = 6
            r1 = r0 & 32767(0x7fff, float:4.5916E-41)
            r5 = 0
            r2 = 31744(0x7c00, float:4.4483E-41)
            r5 = 1
            if (r1 <= r2) goto L16
            com.google.android.filament.utils.i$a r6 = com.google.android.filament.utils.i.f104900b
            r5 = 6
            short r6 = r6.i()
            r5 = 3
            return r6
        L16:
            r5 = 1
            int r3 = com.google.android.filament.utils.i.j0(r7)
            r5 = 4
            r4 = r3 & 32767(0x7fff, float:4.5916E-41)
            r5 = 0
            if (r4 <= r2) goto L29
            com.google.android.filament.utils.i$a r6 = com.google.android.filament.utils.i.f104900b
            short r6 = r6.i()
            r5 = 7
            return r6
        L29:
            r5 = 2
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r1 != 0) goto L36
            if (r4 != 0) goto L36
            r5 = 3
            r0 = r0 & r2
            if (r0 == 0) goto L4f
            goto L51
        L36:
            r5 = 0
            r1 = r0 & r2
            r4 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r4
            if (r1 == 0) goto L41
            int r0 = r2 - r0
        L41:
            r1 = r3 & r2
            if (r1 == 0) goto L4a
            r5 = 6
            r1 = r3 & r4
            int r2 = r2 - r1
            goto L4d
        L4a:
            r5 = 7
            r2 = r3 & r4
        L4d:
            if (r0 <= r2) goto L51
        L4f:
            r5 = 7
            return r6
        L51:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.utils.m.n(short, short):short");
    }

    public static final short o(short s10, short s11) {
        int iJ0;
        int iJ1;
        int iJ2 = i.j0(s10);
        int i10 = iJ2 & 32767;
        if (i10 <= f104934h && (iJ1 = (iJ0 = i.j0(s11)) & 32767) <= f104934h) {
            if (i10 == 0 && iJ1 == 0) {
                if ((iJ2 & 32768) != 0) {
                }
            }
            int i11 = iJ2 & 32768;
            int i12 = iJ2 & 65535;
            if (i11 != 0) {
                i12 = 32768 - i12;
            }
            return i12 < ((iJ0 & 32768) != 0 ? 32768 - (iJ0 & 65535) : iJ0 & 65535) ? s10 : s11;
        }
        return i.f104900b.i();
    }

    private static final int p(int i10) {
        return i10 | 512;
    }

    private static final int q(int i10, int i11) {
        if ((i10 & 32767) <= f104934h) {
            i10 = i11;
        }
        return i10 | 512;
    }

    public static final short r(short s10) {
        int iJ0 = i.j0(s10);
        int i10 = iJ0 & 32767;
        if (i10 < 15360) {
            iJ0 = (iJ0 & 32768) | ((i10 >= 14336 ? 65535 : 0) & 15360);
        } else if (i10 < 25600) {
            int i11 = i10 >> 10;
            iJ0 = (iJ0 + (1 << (24 - i11))) & (~((1 << (25 - i11)) - 1));
        } else if (i10 > f104934h) {
            iJ0 |= 512;
        }
        return i.D(e2.n((short) iJ0));
    }

    public static final short s(short s10) {
        int iJ0 = i.j0(s10);
        int i10 = iJ0 & 32767;
        if (i10 == 0 || i10 >= f104934h) {
            if (i10 > f104934h) {
                iJ0 |= 512;
            } else if (iJ0 > 32768) {
                iJ0 = 32767;
            }
            return i.D(e2.n((short) iJ0));
        }
        int i11 = 15;
        while (i10 < 1024) {
            i10 <<= 1;
            i11--;
        }
        int iN = u1.n(u1.n(1024 | (i10 & 1023)) << 10);
        int i12 = i11 + (i10 >> 10);
        int i13 = i12 & 1;
        int iN2 = u1.n(iN << i13);
        int i14 = (i12 - i13) / 2;
        int iN3 = 0;
        for (int iN4 = u1.n(1048576); iN4 != 0; iN4 = u1.n(iN4 >>> 2)) {
            int i15 = iN3 + iN4;
            if (Integer.compareUnsigned(iN2, u1.n(i15)) < 0) {
                iN3 = u1.n(iN3 >>> 1);
            } else {
                iN2 = u1.n(iN2 - u1.n(i15));
                iN3 = u1.n(u1.n(iN3 >>> 1) + iN4);
            }
        }
        int iN5 = u1.n(u1.n(i14 << 10) + u1.n(iN3 & 1023));
        return i.D(e2.n((short) u1.n(iN5 + u1.n((Integer.compareUnsigned(iN2, iN3) > 0 ? 1 : 0) & u1.n((iN2 != 0 ? 1 : 0) | iN5)))));
    }

    public static final short t(double d10) {
        return i.D(i((float) d10));
    }

    public static final short u(float f10) {
        return i.D(i(f10));
    }

    public static final short v(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return i.D(i(Float.parseFloat(str)));
    }

    public static final short w(short s10) {
        int i10;
        int iJ0 = i.j0(s10);
        int i11 = iJ0 & 32767;
        if (i11 >= 15360) {
            if (i11 < 25600) {
                i10 = ~((1 << (25 - (i11 >> 10))) - 1);
            } else if (i11 > f104934h) {
                iJ0 |= 512;
            }
            return i.D(e2.n((short) iJ0));
        }
        i10 = 32768;
        iJ0 &= i10;
        return i.D(e2.n((short) iJ0));
    }
}
