package androidx.compose.material3;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1118:1\n156#2:1119\n174#2:1120\n159#2:1121\n162#2:1122\n114#2:1123\n138#2:1124\n114#2:1125\n138#2:1126\n1282#3,6:1127\n113#4:1133\n99#5,6:1134\n106#5:1170\n79#6,6:1140\n86#6,3:1155\n89#6,2:1164\n93#6:1169\n347#7,9:1146\n356#7,3:1166\n4206#8,6:1158\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n376#1:1119\n382#1:1120\n411#1:1121\n412#1:1122\n483#1:1123\n484#1:1124\n495#1:1125\n496#1:1126\n505#1:1127,6\n510#1:1133\n503#1:1134,6\n503#1:1170\n503#1:1140,6\n503#1:1155,3\n503#1:1164,2\n503#1:1169\n503#1:1146,9\n503#1:1166,3\n503#1:1158,6\n*E\n"})
public final class qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final qa f32204a = new qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f32205b = 0;

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f32207b;

        a(String str, long j10) {
            this.f32206a = str;
            this.f32207b = j10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(850203865, i10, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:421)");
            }
            q50.t(this.f32206a, null, this.f32207b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262138);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f32209b;

        b(String str, long j10) {
            this.f32208a = str;
            this.f32209b = j10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(282231642, i10, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:422)");
            }
            q50.t(this.f32208a, null, this.f32209b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262138);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f32210a;

        c(long j10) {
            this.f32210a = j10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-320655704, i10, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:423)");
            }
            q50.t("-", null, this.f32210a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 6, 0, 262138);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    private qa() {
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    private final void e(Long l10, final Long l11, final int i10, final y7 y7Var, final androidx.compose.ui.a0 a0Var, final long j10, final String str, final String str2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final Locale locale, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        int i14;
        Long l12;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1381313200);
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.D(l10) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.D(l11) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.K(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= (i11 & 4096) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0VarR.D(a0Var) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c0VarR.L(j10) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c0VarR.D(str) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c0VarR.D(str2) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c0VarR.k0(function2) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c0VarR.k0(function3) ? 536870912 : 268435456;
        }
        int i15 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0VarR.k0(function4) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0VarR.k0(locale) ? 32 : 16;
        }
        if (c0VarR.h(((i15 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true, i15 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1381313200, i15, i14, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:468)");
            }
            int i16 = i14;
            String strB = y7.b(y7Var, l10, locale, false, 4, null);
            l12 = l10;
            String strB2 = y7.b(y7Var, l11, locale, false, 4, null);
            String strC = y7Var.c(l12, locale, true);
            String strB3 = "";
            if (strC == null) {
                c0VarR.E(620891895);
                ed.a aVar = ed.f27323b;
                if (ed.f(i10, aVar.b())) {
                    c0VarR.E(297125251);
                    androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                    String strB4 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31856q), c0VarR, 0);
                    c0VarR.A();
                    strC = strB4;
                } else if (ed.f(i10, aVar.a())) {
                    c0VarR.E(297128222);
                    androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                    strC = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31848l), c0VarR, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(621113326);
                    c0VarR.A();
                    strC = "";
                }
                c0VarR.A();
            } else {
                c0VarR.E(297117483);
                c0VarR.A();
            }
            String strC2 = y7Var.c(l11, locale, true);
            if (strC2 == null) {
                c0VarR.E(621382935);
                ed.a aVar4 = ed.f27323b;
                if (ed.f(i10, aVar4.b())) {
                    c0VarR.E(297141091);
                    androidx.compose.material3.internal.l3.a aVar5 = androidx.compose.material3.internal.l3.f29010b;
                    strB3 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31856q), c0VarR, 0);
                    c0VarR.A();
                } else if (ed.f(i10, aVar4.a())) {
                    c0VarR.E(297144062);
                    androidx.compose.material3.internal.l3.a aVar6 = androidx.compose.material3.internal.l3.f29010b;
                    strB3 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31848l), c0VarR, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(621604366);
                    c0VarR.A();
                }
                c0VarR.A();
                strC2 = strB3;
            } else {
                c0VarR.E(297133385);
                c0VarR.A();
            }
            final String str3 = str + ": " + strC;
            final String str4 = str2 + ": " + strC2;
            boolean zD = c0VarR.D(str3) | c0VarR.D(str4);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ma
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qa.g(str3, str4, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.ui.semantics.t.c(a0Var, (Function1) objI0);
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(4)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC);
            androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar7.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar7.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar7.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar7.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            if (strB != null) {
                c0VarR.E(-177386503);
                q50.t(strB, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, (i15 >> 9) & 896, 0, 262138);
                c0Var2 = c0VarR;
                c0Var2.A();
            } else {
                c0Var2 = c0VarR;
                c0Var2.E(-177297192);
                function2.invoke(c0Var2, Integer.valueOf((i15 >> 24) & 14));
                c0Var2.A();
            }
            function4.invoke(c0Var2, Integer.valueOf(i16 & 14));
            if (strB2 != 0) {
                c0Var2.E(-177171301);
                q50.t(strB2, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i15 >> 9) & 896, 0, 262138);
                c0Var2.A();
            } else {
                c0Var2.E(-177083974);
                function3.invoke(c0Var2, Integer.valueOf((i15 >> 27) & 14));
                c0Var2.A();
            }
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            l12 = l10;
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final Long l13 = l12;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.na
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qa.h(this.f30984a, l13, l11, i10, y7Var, a0Var, j10, str, str2, function2, function3, function4, locale, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, String str2, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.E1(e0Var, androidx.compose.ui.semantics.g.f41102b.b());
        androidx.compose.ui.semantics.b0.v1(e0Var, str + ", " + str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(qa qaVar, Long l10, Long l11, int i10, y7 y7Var, androidx.compose.ui.a0 a0Var, long j10, String str, String str2, Function2 function2, Function2 function3, Function2 function4, Locale locale, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        qaVar.e(l10, l11, i10, y7Var, a0Var, j10, str, str2, function2, function3, function4, locale, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(qa qaVar, Long l10, Long l11, int i10, y7 y7Var, androidx.compose.ui.a0 a0Var, long j10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        qaVar.f(l10, l11, i10, y7Var, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(qa qaVar, int i10, androidx.compose.ui.a0 a0Var, long j10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        qaVar.j(i10, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void f(@Nullable final Long l10, @Nullable final Long l11, final int i10, @NotNull final y7 y7Var, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        Long l12;
        int i13;
        Long l13;
        int i14;
        int i15;
        boolean zK0;
        int i16;
        int i17;
        androidx.compose.ui.a0 a0Var2;
        int i18;
        long jT;
        qa qaVar;
        int i19;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1655228151);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            l12 = l10;
        } else if ((i11 & 6) == 0) {
            l12 = l10;
            i13 = (c0VarR.D(l12) ? 4 : 2) | i11;
        } else {
            l12 = l10;
            i13 = i11;
        }
        if ((i12 & 2) == 0) {
            if ((i11 & 48) == 0) {
                l13 = l11;
                i13 |= c0VarR.D(l13) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    i14 = i10;
                    if (c0VarR.K(i14)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    if ((i11 & 4096) == 0) {
                        zK0 = c0VarR.D(y7Var);
                    } else {
                        zK0 = c0VarR.k0(y7Var);
                    }
                    if (zK0) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i13 |= i18;
                    }
                    if ((196608 & i11) == 0) {
                        if ((i12 & 32) == 0) {
                            jT = j10;
                            int i20 = c0VarR.L(jT) ? 131072 : 65536;
                            i13 |= i20;
                        } else {
                            jT = j10;
                        }
                        i13 |= i20;
                    } else {
                        jT = j10;
                    }
                    if ((i12 & 64) != 0) {
                        if ((i11 & 1572864) == 0) {
                            qaVar = this;
                            if (c0VarR.D(qaVar)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i13 |= i19;
                        }
                        if ((599187 & i13) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0 || c0VarR.y()) {
                                if (i17 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if ((i12 & 32) != 0) {
                                    i13 &= -458753;
                                    jT = v7.f33887a.i(c0VarR, 6).t();
                                }
                            } else {
                                c0VarR.u();
                                if ((i12 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                a0Var4 = a0Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                            }
                            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                            String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                            String strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB, jT), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB2, jT), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                            Locale localeA = b4.a(c0VarR, 0);
                            int i21 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                            int i22 = ((i13 >> 12) & 896) | 6;
                            int i23 = i14;
                            androidx.compose.ui.a0 a0Var5 = a0Var4;
                            long j12 = jT;
                            qaVar.e(l12, l13, i23, y7Var, a0Var5, j12, strB, strB2, cVarE, cVarE2, cVarE3, localeA, c0VarR, i21, i22);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j11 = j12;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            j11 = jT;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 1572864;
                    qaVar = this;
                    if ((599187 & i13) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        } else {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                        }
                        androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                        String strB3 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                        String strB4 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                        androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB3, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB4, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                        Locale localeA2 = b4.a(c0VarR, 0);
                        int i24 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                        int i25 = ((i13 >> 12) & 896) | 6;
                        int i26 = i14;
                        androidx.compose.ui.a0 a0Var6 = a0Var4;
                        long j13 = jT;
                        qaVar.e(l12, l13, i26, y7Var, a0Var6, j13, strB3, strB4, cVarE4, cVarE5, cVarE6, localeA2, c0VarR, i24, i25);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j11 = j13;
                        a0Var3 = a0Var6;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        j11 = jT;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                a0Var2 = a0Var;
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        jT = j10;
                        if (c0VarR.L(jT)) {
                        }
                        i13 |= i20;
                    } else {
                        jT = j10;
                    }
                    i13 |= i20;
                } else {
                    jT = j10;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qaVar = this;
                        if (c0VarR.D(qaVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((599187 & i13) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        } else {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                        }
                        androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                        String strB5 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                        String strB6 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                        androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB5, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB6, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                        Locale localeA3 = b4.a(c0VarR, 0);
                        int i27 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                        int i28 = ((i13 >> 12) & 896) | 6;
                        int i29 = i14;
                        androidx.compose.ui.a0 a0Var7 = a0Var4;
                        long j14 = jT;
                        qaVar.e(l12, l13, i29, y7Var, a0Var7, j14, strB5, strB6, cVarE7, cVarE8, cVarE9, localeA3, c0VarR, i27, i28);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j11 = j14;
                        a0Var3 = a0Var7;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        j11 = jT;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                qaVar = this;
                if ((599187 & i13) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                    }
                    androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
                    String strB7 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                    String strB8 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                    androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB7, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB8, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                    Locale localeA4 = b4.a(c0VarR, 0);
                    int i210 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                    int i211 = ((i13 >> 12) & 896) | 6;
                    int i212 = i14;
                    androidx.compose.ui.a0 a0Var8 = a0Var4;
                    long j15 = jT;
                    qaVar.e(l12, l13, i212, y7Var, a0Var8, j15, strB7, strB8, cVarE10, cVarE11, cVarE12, localeA4, c0VarR, i210, i211);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j15;
                    a0Var3 = a0Var8;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j11 = jT;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            i14 = i10;
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if ((i11 & 4096) == 0) {
                    zK0 = c0VarR.D(y7Var);
                } else {
                    zK0 = c0VarR.k0(y7Var);
                }
                if (zK0) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        jT = j10;
                        if (c0VarR.L(jT)) {
                        }
                        i13 |= i20;
                    } else {
                        jT = j10;
                    }
                    i13 |= i20;
                } else {
                    jT = j10;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qaVar = this;
                        if (c0VarR.D(qaVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((599187 & i13) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        } else {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                        }
                        androidx.compose.material3.internal.l3.a aVar5 = androidx.compose.material3.internal.l3.f29010b;
                        String strB9 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                        String strB10 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                        androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB9, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB10, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                        Locale localeA5 = b4.a(c0VarR, 0);
                        int i213 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                        int i214 = ((i13 >> 12) & 896) | 6;
                        int i215 = i14;
                        androidx.compose.ui.a0 a0Var9 = a0Var4;
                        long j16 = jT;
                        qaVar.e(l12, l13, i215, y7Var, a0Var9, j16, strB9, strB10, cVarE13, cVarE14, cVarE15, localeA5, c0VarR, i213, i214);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j11 = j16;
                        a0Var3 = a0Var9;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        j11 = jT;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                qaVar = this;
                if ((599187 & i13) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                    }
                    androidx.compose.material3.internal.l3.a aVar6 = androidx.compose.material3.internal.l3.f29010b;
                    String strB11 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                    String strB12 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                    androidx.compose.runtime.internal.c cVarE16 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB11, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE17 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB12, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE18 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                    Locale localeA6 = b4.a(c0VarR, 0);
                    int i216 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                    int i217 = ((i13 >> 12) & 896) | 6;
                    int i218 = i14;
                    androidx.compose.ui.a0 a0Var10 = a0Var4;
                    long j17 = jT;
                    qaVar.e(l12, l13, i218, y7Var, a0Var10, j17, strB11, strB12, cVarE16, cVarE17, cVarE18, localeA6, c0VarR, i216, i217);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j17;
                    a0Var3 = a0Var10;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j11 = jT;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jT = j10;
                    if (c0VarR.L(jT)) {
                    }
                    i13 |= i20;
                } else {
                    jT = j10;
                }
                i13 |= i20;
            } else {
                jT = j10;
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 1572864) == 0) {
                    qaVar = this;
                    if (c0VarR.D(qaVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((599187 & i13) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                    }
                    androidx.compose.material3.internal.l3.a aVar7 = androidx.compose.material3.internal.l3.f29010b;
                    String strB13 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                    String strB14 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                    androidx.compose.runtime.internal.c cVarE19 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB13, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE110 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB14, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE111 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                    Locale localeA7 = b4.a(c0VarR, 0);
                    int i219 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                    int i2110 = ((i13 >> 12) & 896) | 6;
                    int i2111 = i14;
                    androidx.compose.ui.a0 a0Var11 = a0Var4;
                    long j18 = jT;
                    qaVar.e(l12, l13, i2111, y7Var, a0Var11, j18, strB13, strB14, cVarE19, cVarE110, cVarE111, localeA7, c0VarR, i219, i2110);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j18;
                    a0Var3 = a0Var11;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j11 = jT;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            qaVar = this;
            if ((599187 & i13) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                }
                androidx.compose.material3.internal.l3.a aVar8 = androidx.compose.material3.internal.l3.f29010b;
                String strB15 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                String strB16 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                androidx.compose.runtime.internal.c cVarE112 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB15, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE113 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB16, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE114 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                Locale localeA8 = b4.a(c0VarR, 0);
                int i2112 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                int i2113 = ((i13 >> 12) & 896) | 6;
                int i2114 = i14;
                androidx.compose.ui.a0 a0Var12 = a0Var4;
                long j19 = jT;
                qaVar.e(l12, l13, i2114, y7Var, a0Var12, j19, strB15, strB16, cVarE112, cVarE113, cVarE114, localeA8, c0VarR, i2112, i2113);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j19;
                a0Var3 = a0Var12;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jT;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        l13 = l11;
        if ((i12 & 4) != 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                i14 = i10;
                if (c0VarR.K(i14)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if ((i11 & 4096) == 0) {
                    zK0 = c0VarR.D(y7Var);
                } else {
                    zK0 = c0VarR.k0(y7Var);
                }
                if (zK0) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        jT = j10;
                        if (c0VarR.L(jT)) {
                        }
                        i13 |= i20;
                    } else {
                        jT = j10;
                    }
                    i13 |= i20;
                } else {
                    jT = j10;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qaVar = this;
                        if (c0VarR.D(qaVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((599187 & i13) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        } else {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                jT = v7.f33887a.i(c0VarR, 6).t();
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                        }
                        androidx.compose.material3.internal.l3.a aVar9 = androidx.compose.material3.internal.l3.f29010b;
                        String strB17 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                        String strB18 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                        androidx.compose.runtime.internal.c cVarE115 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB17, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE116 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB18, jT), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE117 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                        Locale localeA9 = b4.a(c0VarR, 0);
                        int i2115 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                        int i2116 = ((i13 >> 12) & 896) | 6;
                        int i2117 = i14;
                        androidx.compose.ui.a0 a0Var13 = a0Var4;
                        long j110 = jT;
                        qaVar.e(l12, l13, i2117, y7Var, a0Var13, j110, strB17, strB18, cVarE115, cVarE116, cVarE117, localeA9, c0VarR, i2115, i2116);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j11 = j110;
                        a0Var3 = a0Var13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        j11 = jT;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                qaVar = this;
                if ((599187 & i13) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                    }
                    androidx.compose.material3.internal.l3.a aVar10 = androidx.compose.material3.internal.l3.f29010b;
                    String strB19 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                    String strB110 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                    androidx.compose.runtime.internal.c cVarE118 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB19, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE119 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB110, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1110 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                    Locale localeA10 = b4.a(c0VarR, 0);
                    int i2118 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                    int i2119 = ((i13 >> 12) & 896) | 6;
                    int i21110 = i14;
                    androidx.compose.ui.a0 a0Var14 = a0Var4;
                    long j111 = jT;
                    qaVar.e(l12, l13, i21110, y7Var, a0Var14, j111, strB19, strB110, cVarE118, cVarE119, cVarE1110, localeA10, c0VarR, i2118, i2119);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j111;
                    a0Var3 = a0Var14;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j11 = jT;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jT = j10;
                    if (c0VarR.L(jT)) {
                    }
                    i13 |= i20;
                } else {
                    jT = j10;
                }
                i13 |= i20;
            } else {
                jT = j10;
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 1572864) == 0) {
                    qaVar = this;
                    if (c0VarR.D(qaVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((599187 & i13) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                    }
                    androidx.compose.material3.internal.l3.a aVar11 = androidx.compose.material3.internal.l3.f29010b;
                    String strB111 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                    String strB112 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                    androidx.compose.runtime.internal.c cVarE1111 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB111, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1112 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB112, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1113 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                    Locale localeA11 = b4.a(c0VarR, 0);
                    int i21111 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                    int i21112 = ((i13 >> 12) & 896) | 6;
                    int i21113 = i14;
                    androidx.compose.ui.a0 a0Var15 = a0Var4;
                    long j112 = jT;
                    qaVar.e(l12, l13, i21113, y7Var, a0Var15, j112, strB111, strB112, cVarE1111, cVarE1112, cVarE1113, localeA11, c0VarR, i21111, i21112);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j112;
                    a0Var3 = a0Var15;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j11 = jT;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            qaVar = this;
            if ((599187 & i13) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                }
                androidx.compose.material3.internal.l3.a aVar12 = androidx.compose.material3.internal.l3.f29010b;
                String strB113 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                String strB114 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                androidx.compose.runtime.internal.c cVarE1114 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB113, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE1115 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB114, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE1116 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                Locale localeA12 = b4.a(c0VarR, 0);
                int i21114 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                int i21115 = ((i13 >> 12) & 896) | 6;
                int i21116 = i14;
                androidx.compose.ui.a0 a0Var16 = a0Var4;
                long j113 = jT;
                qaVar.e(l12, l13, i21116, y7Var, a0Var16, j113, strB113, strB114, cVarE1114, cVarE1115, cVarE1116, localeA12, c0VarR, i21114, i21115);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j113;
                a0Var3 = a0Var16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jT;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        i14 = i10;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if ((i11 & 4096) == 0) {
                zK0 = c0VarR.D(y7Var);
            } else {
                zK0 = c0VarR.k0(y7Var);
            }
            if (zK0) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        }
        i17 = i12 & 16;
        if (i17 != 0) {
            if ((i11 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i13 |= i18;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jT = j10;
                    if (c0VarR.L(jT)) {
                    }
                    i13 |= i20;
                } else {
                    jT = j10;
                }
                i13 |= i20;
            } else {
                jT = j10;
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 1572864) == 0) {
                    qaVar = this;
                    if (c0VarR.D(qaVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((599187 & i13) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            jT = v7.f33887a.i(c0VarR, 6).t();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                    }
                    androidx.compose.material3.internal.l3.a aVar13 = androidx.compose.material3.internal.l3.f29010b;
                    String strB115 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                    String strB116 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                    androidx.compose.runtime.internal.c cVarE1117 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB115, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1118 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB116, jT), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1119 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                    Locale localeA13 = b4.a(c0VarR, 0);
                    int i21117 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                    int i21118 = ((i13 >> 12) & 896) | 6;
                    int i21119 = i14;
                    androidx.compose.ui.a0 a0Var17 = a0Var4;
                    long j114 = jT;
                    qaVar.e(l12, l13, i21119, y7Var, a0Var17, j114, strB115, strB116, cVarE1117, cVarE1118, cVarE1119, localeA13, c0VarR, i21117, i21118);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j114;
                    a0Var3 = a0Var17;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j11 = jT;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            qaVar = this;
            if ((599187 & i13) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                }
                androidx.compose.material3.internal.l3.a aVar14 = androidx.compose.material3.internal.l3.f29010b;
                String strB117 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                String strB118 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                androidx.compose.runtime.internal.c cVarE11110 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB117, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE11111 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB118, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE11112 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                Locale localeA14 = b4.a(c0VarR, 0);
                int i211110 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                int i211111 = ((i13 >> 12) & 896) | 6;
                int i211112 = i14;
                androidx.compose.ui.a0 a0Var18 = a0Var4;
                long j115 = jT;
                qaVar.e(l12, l13, i211112, y7Var, a0Var18, j115, strB117, strB118, cVarE11110, cVarE11111, cVarE11112, localeA14, c0VarR, i211110, i211111);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j115;
                a0Var3 = a0Var18;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jT;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                jT = j10;
                if (c0VarR.L(jT)) {
                }
                i13 |= i20;
            } else {
                jT = j10;
            }
            i13 |= i20;
        } else {
            jT = j10;
        }
        if ((i12 & 64) != 0) {
            if ((i11 & 1572864) == 0) {
                qaVar = this;
                if (c0VarR.D(qaVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((599187 & i13) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        jT = v7.f33887a.i(c0VarR, 6).t();
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                }
                androidx.compose.material3.internal.l3.a aVar15 = androidx.compose.material3.internal.l3.f29010b;
                String strB119 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
                String strB1110 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
                androidx.compose.runtime.internal.c cVarE11113 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB119, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE11114 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB1110, jT), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE11115 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
                Locale localeA15 = b4.a(c0VarR, 0);
                int i211113 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
                int i211114 = ((i13 >> 12) & 896) | 6;
                int i211115 = i14;
                androidx.compose.ui.a0 a0Var19 = a0Var4;
                long j116 = jT;
                qaVar.e(l12, l13, i211115, y7Var, a0Var19, j116, strB119, strB1110, cVarE11113, cVarE11114, cVarE11115, localeA15, c0VarR, i211113, i211114);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j116;
                a0Var3 = a0Var19;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jT;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 1572864;
        qaVar = this;
        if ((599187 & i13) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    jT = v7.f33887a.i(c0VarR, 6).t();
                }
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    jT = v7.f33887a.i(c0VarR, 6).t();
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1655228151, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
            }
            androidx.compose.material3.internal.l3.a aVar16 = androidx.compose.material3.internal.l3.f29010b;
            String strB1111 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
            String strB1112 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0VarR, 0);
            androidx.compose.runtime.internal.c cVarE11116 = androidx.compose.runtime.internal.w.e(850203865, true, new a(strB1111, jT), c0VarR, 54);
            androidx.compose.runtime.internal.c cVarE11117 = androidx.compose.runtime.internal.w.e(282231642, true, new b(strB1112, jT), c0VarR, 54);
            androidx.compose.runtime.internal.c cVarE11118 = androidx.compose.runtime.internal.w.e(-320655704, true, new c(jT), c0VarR, 54);
            Locale localeA16 = b4.a(c0VarR, 0);
            int i211116 = (458752 & i13) | (i13 & 14) | 905969664 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13);
            int i211117 = ((i13 >> 12) & 896) | 6;
            int i211118 = i14;
            androidx.compose.ui.a0 a0Var110 = a0Var4;
            long j117 = jT;
            qaVar.e(l12, l13, i211118, y7Var, a0Var110, j117, strB1111, strB1112, cVarE11116, cVarE11117, cVarE11118, localeA16, c0VarR, i211116, i211117);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j11 = j117;
            a0Var3 = a0Var110;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j11 = jT;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qa.i(this.f31719a, l10, l11, i10, y7Var, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0168  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void j(final int i10, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long jA;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long j12;
        androidx.compose.ui.a0 a0Var5;
        ed.a aVar;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(694693107);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    jA = j10;
                    int i15 = c0VarR.L(jA) ? 256 : 128;
                    i13 |= i15;
                } else {
                    jA = j10;
                }
                i13 |= i15;
            } else {
                jA = j10;
            }
            if ((i13 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0 || c0VarR.y()) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jA = v7.f33887a.i(c0VarR, 6).A();
                        i13 &= -897;
                    }
                    j12 = jA;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    j12 = jA;
                    a0Var5 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(694693107, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:371)");
                }
                aVar = ed.f27323b;
                if (ed.f(i10, aVar.b())) {
                    c0VarR.E(1880154051);
                    androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                    q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.J), c0VarR, 0), a0Var5, j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                    c0VarR.A();
                } else if (ed.f(i10, aVar.a())) {
                    c0VarR.E(1880161282);
                    androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                    q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.D), c0VarR, 0), a0Var5, j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1844364305);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j11 = j12;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.oa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qa.k(this.f31333a, i10, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                jA = j10;
                if (c0VarR.L(jA)) {
                }
                i13 |= i15;
            } else {
                jA = j10;
            }
            i13 |= i15;
        } else {
            jA = j10;
        }
        if ((i13 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jA = v7.f33887a.i(c0VarR, 6).A();
                    i13 &= -897;
                }
                j12 = jA;
                a0Var5 = a0Var4;
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jA = v7.f33887a.i(c0VarR, 6).A();
                    i13 &= -897;
                }
                j12 = jA;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(694693107, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:371)");
            }
            aVar = ed.f27323b;
            if (ed.f(i10, aVar.b())) {
                c0VarR.E(1880154051);
                androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
                q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.J), c0VarR, 0), a0Var5, j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                c0VarR.A();
            } else if (ed.f(i10, aVar.a())) {
                c0VarR.E(1880161282);
                androidx.compose.material3.internal.l3.a aVar5 = androidx.compose.material3.internal.l3.f29010b;
                q50.t(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.D), c0VarR, 0), a0Var5, j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i13 & 1008, 0, 262136);
                c0VarR.A();
            } else {
                c0VarR.E(-1844364305);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j11 = j12;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j11 = jA;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.oa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qa.k(this.f31333a, i10, a0Var3, j11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
