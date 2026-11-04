package androidx.compose.material3;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 DatePicker.jvm.kt\nandroidx/compose/material3/DatePicker_jvmKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n1#2:2306\n87#3:2307\n126#3:2308\n114#3:2309\n138#3:2310\n90#3:2311\n129#3:2312\n111#3:2313\n135#3:2314\n35#4:2315\n1282#5,6:2316\n1282#5,6:2322\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n*L\n654#1:2307\n660#1:2308\n696#1:2309\n697#1:2310\n704#1:2311\n705#1:2312\n712#1:2313\n713#1:2314\n710#1:2315\n722#1:2316,6\n745#1:2322,6\n*E\n"})
public final class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v7 f33887a = new v7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final IntRange f33888b = new IntRange(1900, 2100);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f33889c = d0.e0.f267938a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final ww f33890d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f33891e = "yMMMM";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f33892f = "yMMMd";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f33893g = "yMMMMEEEEd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f33894h = 0;

    public static final class a implements ww {
        a() {
        }
    }

    public static final class b implements androidx.compose.foundation.gestures.snapping.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ androidx.compose.foundation.gestures.snapping.n f33895a;

        b(androidx.compose.foundation.gestures.snapping.n nVar) {
            this.f33895a = nVar;
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float a(float f10) {
            return this.f33895a.a(f10);
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float b(float f10, float f11) {
            return 0.0f;
        }
    }

    private v7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.E1(e0Var, androidx.compose.ui.semantics.g.f41102b.b());
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(v7 v7Var, Long l10, int i10, y7 y7Var, androidx.compose.ui.a0 a0Var, long j10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        v7Var.d(l10, i10, y7Var, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(v7 v7Var, int i10, androidx.compose.ui.a0 a0Var, long j10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        v7Var.g(i10, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    public static /* synthetic */ y7 l(v7 v7Var, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = f33891e;
        }
        if ((i10 & 2) != 0) {
            str2 = f33892f;
        }
        if ((i10 & 4) != 0) {
            str3 = f33893g;
        }
        return v7Var.k(str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0166  */
    /* JADX WARN: Code duplicated, block: B:101:0x017c  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0195  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:116:0x0200  */
    /* JADX WARN: Code duplicated, block: B:117:0x0216  */
    /* JADX WARN: Code duplicated, block: B:119:0x0220  */
    /* JADX WARN: Code duplicated, block: B:120:0x0236  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void d(@Nullable Long l10, final int i10, @NotNull y7 y7Var, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long jT;
        int i14;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i15;
        long j12;
        androidx.compose.ui.a0 a0Var5;
        String strB;
        String strC;
        String strB2;
        ed.a aVar;
        final String str;
        boolean zD;
        Object objI0;
        ed.a aVar2;
        ed.a aVar3;
        final Long l11 = l10;
        final y7 y7Var2 = y7Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1913724796);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(l11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= (i11 & 512) == 0 ? c0VarR.D(y7Var2) : c0VarR.k0(y7Var2) ? 256 : 128;
        }
        int i16 = i12 & 8;
        if (i16 == 0) {
            if ((i11 & 3072) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jT = j10;
                    int i17 = c0VarR.L(jT) ? 16384 : 8192;
                    i13 |= i17;
                } else {
                    jT = j10;
                }
                i13 |= i17;
            } else {
                jT = j10;
            }
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(this)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i13 |= i14;
            }
            if ((74899 & i13) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0 || c0VarR.y()) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jT = i(c0VarR, (i13 >> 15) & 14).t();
                        i13 &= -57345;
                    }
                    i15 = i13;
                    j12 = jT;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    i15 = i13;
                    j12 = jT;
                    a0Var5 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1913724796, i15, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:684)");
                }
                Locale localeA = b4.a(c0VarR, 0);
                strB = y7.b(y7Var, l11, localeA, false, 4, null);
                y7Var2 = y7Var;
                l11 = l11;
                strC = y7Var2.c(l11, localeA, true);
                strB2 = "";
                if (strC == null) {
                    c0VarR.E(380185931);
                    aVar3 = ed.f27323b;
                    if (ed.f(i10, aVar3.b())) {
                        c0VarR.E(843549871);
                        androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
                        strC = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31856q), c0VarR, 0);
                        c0VarR.A();
                    } else if (ed.f(i10, aVar3.a())) {
                        c0VarR.E(843552842);
                        androidx.compose.material3.internal.l3.a aVar5 = androidx.compose.material3.internal.l3.f29010b;
                        strC = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31848l), c0VarR, 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(380407362);
                        c0VarR.A();
                        strC = "";
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(843542258);
                    c0VarR.A();
                }
                if (strB == null) {
                    c0VarR.E(380507587);
                    aVar2 = ed.f27323b;
                    if (ed.f(i10, aVar2.b())) {
                        c0VarR.E(843560257);
                        androidx.compose.material3.internal.l3.a aVar6 = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31852n), c0VarR, 0);
                        c0VarR.A();
                    } else if (ed.f(i10, aVar2.a())) {
                        c0VarR.E(843562784);
                        androidx.compose.material3.internal.l3.a aVar7 = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31836f), c0VarR, 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(380705954);
                        c0VarR.A();
                        strB = "";
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(843557408);
                    c0VarR.A();
                }
                aVar = ed.f27323b;
                if (ed.f(i10, aVar.b())) {
                    c0VarR.E(843570444);
                    androidx.compose.material3.internal.l3.a aVar8 = androidx.compose.material3.internal.l3.f29010b;
                    strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31854o), c0VarR, 0);
                    c0VarR.A();
                } else if (ed.f(i10, aVar.a())) {
                    c0VarR.E(843573323);
                    androidx.compose.material3.internal.l3.a aVar9 = androidx.compose.material3.internal.l3.f29010b;
                    strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31838g), c0VarR, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(381043234);
                    c0VarR.A();
                }
                str = String.format(strB2, Arrays.copyOf(new Object[]{strC}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                zD = c0VarR.D(str);
                objI0 = c0VarR.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.s7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return v7.e(str, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var6 = a0Var5;
                q50.t(strB, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c0Var2, (i15 >> 6) & 896, 24576, 245752);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var6;
                j11 = j12;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j11 = jT;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.t7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v7.f(this.f33148a, l11, i10, y7Var2, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        a0Var2 = a0Var;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                jT = j10;
                if (c0VarR.L(jT)) {
                }
                i13 |= i17;
            } else {
                jT = j10;
            }
            i13 |= i17;
        } else {
            jT = j10;
        }
        if ((i12 & 32) != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.D(this)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
        }
        if ((74899 & i13) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 16) != 0) {
                    jT = i(c0VarR, (i13 >> 15) & 14).t();
                    i13 &= -57345;
                }
                i15 = i13;
                j12 = jT;
                a0Var5 = a0Var4;
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 16) != 0) {
                    jT = i(c0VarR, (i13 >> 15) & 14).t();
                    i13 &= -57345;
                }
                i15 = i13;
                j12 = jT;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1913724796, i15, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:684)");
            }
            Locale localeA2 = b4.a(c0VarR, 0);
            strB = y7.b(y7Var, l11, localeA2, false, 4, null);
            y7Var2 = y7Var;
            l11 = l11;
            strC = y7Var2.c(l11, localeA2, true);
            strB2 = "";
            if (strC == null) {
                c0VarR.E(380185931);
                aVar3 = ed.f27323b;
                if (ed.f(i10, aVar3.b())) {
                    c0VarR.E(843549871);
                    androidx.compose.material3.internal.l3.a aVar10 = androidx.compose.material3.internal.l3.f29010b;
                    strC = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31856q), c0VarR, 0);
                    c0VarR.A();
                } else if (ed.f(i10, aVar3.a())) {
                    c0VarR.E(843552842);
                    androidx.compose.material3.internal.l3.a aVar11 = androidx.compose.material3.internal.l3.f29010b;
                    strC = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31848l), c0VarR, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(380407362);
                    c0VarR.A();
                    strC = "";
                }
                c0VarR.A();
            } else {
                c0VarR.E(843542258);
                c0VarR.A();
            }
            if (strB == null) {
                c0VarR.E(380507587);
                aVar2 = ed.f27323b;
                if (ed.f(i10, aVar2.b())) {
                    c0VarR.E(843560257);
                    androidx.compose.material3.internal.l3.a aVar12 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31852n), c0VarR, 0);
                    c0VarR.A();
                } else if (ed.f(i10, aVar2.a())) {
                    c0VarR.E(843562784);
                    androidx.compose.material3.internal.l3.a aVar13 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31836f), c0VarR, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(380705954);
                    c0VarR.A();
                    strB = "";
                }
                c0VarR.A();
            } else {
                c0VarR.E(843557408);
                c0VarR.A();
            }
            aVar = ed.f27323b;
            if (ed.f(i10, aVar.b())) {
                c0VarR.E(843570444);
                androidx.compose.material3.internal.l3.a aVar14 = androidx.compose.material3.internal.l3.f29010b;
                strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31854o), c0VarR, 0);
                c0VarR.A();
            } else if (ed.f(i10, aVar.a())) {
                c0VarR.E(843573323);
                androidx.compose.material3.internal.l3.a aVar15 = androidx.compose.material3.internal.l3.f29010b;
                strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31838g), c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(381043234);
                c0VarR.A();
            }
            str = String.format(strB2, Arrays.copyOf(new Object[]{strC}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            zD = c0VarR.D(str);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new Function1() { // from class: androidx.compose.material3.s7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v7.e(str, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material3.s7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v7.e(str, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0Var2 = c0VarR;
            androidx.compose.ui.a0 a0Var7 = a0Var5;
            q50.t(strB, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c0Var2, (i15 >> 6) & 896, 24576, 245752);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var7;
            j11 = j12;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j11 = jT;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.t7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v7.f(this.f33148a, l11, i10, y7Var2, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x0168  */
    /* JADX WARN: Code duplicated, block: B:80:0x0177  */
    /* JADX WARN: Code duplicated, block: B:82:0x017c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void g(final int i10, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long j11;
        int i14;
        boolean z10;
        final long j12;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long j13;
        ed.a aVar;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-390880814);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    j11 = j10;
                    int i16 = c0VarR.L(j11) ? 256 : 128;
                    i13 |= i16;
                } else {
                    j11 = j10;
                }
                i13 |= i16;
            } else {
                j11 = j10;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (c0VarR.D(this)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0 || c0VarR.y()) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        long jA = i(c0VarR, (i13 >> 9) & 14).A();
                        i13 &= -897;
                        j13 = jA;
                    } else {
                        j13 = j11;
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    j13 = j11;
                    a0Var3 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-390880814, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:649)");
                }
                aVar = ed.f27323b;
                if (ed.f(i10, aVar.b())) {
                    c0VarR.E(-1974299164);
                    androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                    q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31865z), c0VarR, 0), a0Var3, j13, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                    c0VarR.A();
                } else if (ed.f(i10, aVar.a())) {
                    c0VarR.E(-1974291869);
                    androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                    q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31850m), c0VarR, 0), a0Var3, j13, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1073325776);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j13;
            } else {
                c0VarR.u();
                j12 = j11;
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.u7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v7.h(this.f33528a, i10, a0Var5, j12, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                j11 = j10;
                if (c0VarR.L(j11)) {
                }
                i13 |= i16;
            } else {
                j11 = j10;
            }
            i13 |= i16;
        } else {
            j11 = j10;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (c0VarR.D(this)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    long jA2 = i(c0VarR, (i13 >> 9) & 14).A();
                    i13 &= -897;
                    j13 = jA2;
                } else {
                    j13 = j11;
                }
                a0Var3 = a0Var4;
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    long jA3 = i(c0VarR, (i13 >> 9) & 14).A();
                    i13 &= -897;
                    j13 = jA3;
                } else {
                    j13 = j11;
                }
                a0Var3 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-390880814, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:649)");
            }
            aVar = ed.f27323b;
            if (ed.f(i10, aVar.b())) {
                c0VarR.E(-1974299164);
                androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
                q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31865z), c0VarR, 0), a0Var3, j13, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                c0VarR.A();
            } else if (ed.f(i10, aVar.a())) {
                c0VarR.E(-1974291869);
                androidx.compose.material3.internal.l3.a aVar5 = androidx.compose.material3.internal.l3.f29010b;
                q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31850m), c0VarR, 0), a0Var3, j13, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                c0VarR.A();
            } else {
                c0VarR.E(-1073325776);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = j13;
        } else {
            c0VarR.u();
            j12 = j11;
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var6 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.u7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v7.h(this.f33528a, i10, a0Var6, j12, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r7 i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-275219611, i10, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:447)");
        }
        r7 r7VarN = n(pj.f31758a.a(c0Var, 6), c0Var, (i10 << 3) & com.planner5d.library.engine.input.f.b.B);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r7VarN;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r7 j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, @Nullable j40 j40Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13) {
        long jU = (i13 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i13 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i13 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i13 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i13 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i13 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i13 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long j34 = jU;
        long jU8 = (i13 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        long jU9 = (i13 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j18;
        long jU10 = (i13 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j19;
        long jU11 = (i13 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j20;
        long jU12 = (i13 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j21;
        long jU13 = (i13 & 4096) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j22;
        long jU14 = (i13 & 8192) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j23;
        long jU15 = (i13 & 16384) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j24;
        long jU16 = (i13 & 32768) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j25;
        long jU17 = (i13 & 65536) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j26;
        long jU18 = (i13 & 131072) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j27;
        long jU19 = (i13 & 262144) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j28;
        long jU20 = (i13 & 524288) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j29;
        long jU21 = (i13 & 1048576) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j30;
        long jU22 = (i13 & 2097152) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j31;
        long jU23 = (i13 & 4194304) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j32;
        long jU24 = (i13 & 8388608) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j33;
        j40 j40Var2 = (i13 & 16777216) != 0 ? null : j40Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1991626358, i10, i11, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:516)");
        }
        r7 r7VarB = n(pj.f31758a.a(c0Var, 6), c0Var, (i12 >> 12) & com.planner5d.library.engine.input.f.b.B).b(j34, jU2, jU3, jU4, jU5, jU6, jU7, jU8, jU9, jU10, jU11, jU12, jU13, jU14, jU15, jU16, jU17, jU18, jU19, jU20, jU21, jU23, jU22, jU24, j40Var2);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r7VarB;
    }

    @NotNull
    public final y7 k(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new z7(str, str2, str3);
    }

    @NotNull
    public final ww m() {
        return f33890d;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getDefaultDatePickerColors")
    @NotNull
    public final r7 n(@NotNull l6 l6Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1180555308, i10, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:546)");
        }
        r7 r7VarL = l6Var.l();
        if (r7VarL == null) {
            c0Var.E(642416503);
            d0.x xVar = d0.x.f269223a;
            r7 r7Var = new r7(o6.o(l6Var, xVar.a()), o6.o(l6Var, xVar.w()), o6.o(l6Var, xVar.u()), o6.o(l6Var, xVar.R()), o6.o(l6Var, xVar.F()), l6Var.w0(), o6.o(l6Var, xVar.Q()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, xVar.Q()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, xVar.q()), o6.o(l6Var, xVar.M()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, xVar.M()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, xVar.L()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, xVar.L()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, xVar.r()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, xVar.r()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, xVar.k()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, xVar.k()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, xVar.j()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, xVar.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, xVar.q()), o6.o(l6Var, xVar.o()), o6.o(l6Var, xVar.y()), o6.o(l6Var, xVar.H()), o6.o(l6Var, d0.z.f269455a.a()), lq.f30410a.o(l6Var, c0Var, (i10 & 14) | 48), null);
            l6Var.e1(r7Var);
            c0Var.A();
            r7VarL = r7Var;
        } else {
            c0Var.E(642290457);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r7VarL;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 o(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(700927667, i10, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:770)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.x.f269223a.d(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float p() {
        return f33889c;
    }

    @NotNull
    public final IntRange q() {
        return f33888b;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.gestures.c3 r(@NotNull androidx.compose.foundation.lazy.j1 j1Var, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            g0Var = androidx.compose.animation.core.i0.d(0.0f, 0.0f, 3, null);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2036003494, i10, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:741)");
        }
        androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.DefaultEffects, c0Var, 6);
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.D(j1Var)) || (i10 & 6) == 4) | c0Var.D(g0Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.foundation.gestures.snapping.m.t(new b(androidx.compose.foundation.gestures.snapping.f.b(j1Var, null, 2, null)), g0Var, y0VarB);
            c0Var.Y(objI0);
        }
        androidx.compose.foundation.gestures.e5 e5Var = (androidx.compose.foundation.gestures.e5) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5Var;
    }
}
