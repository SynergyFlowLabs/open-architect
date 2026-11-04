package androidx.compose.material3;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,129:1\n1282#2,6:130\n1282#2,6:140\n1282#2,6:183\n1282#2,6:190\n144#3:136\n147#3:137\n141#3:138\n177#3:139\n159#3:182\n162#3:189\n99#4:146\n97#4,8:147\n106#4:199\n79#5,6:155\n86#5,3:170\n89#5,2:179\n93#5:198\n347#6,9:161\n356#6:181\n357#6,2:196\n4206#7,6:173\n113#8:200\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n48#1:130,6\n54#1:140,6\n89#1:183,6\n112#1:190,6\n49#1:136\n50#1:137\n51#1:138\n52#1:139\n76#1:182\n100#1:189\n71#1:146\n71#1:147,8\n71#1:199\n71#1:155,6\n71#1:170,3\n71#1:179,2\n71#1:198\n71#1:161,9\n71#1:181\n71#1:196,2\n71#1:173,6\n128#1:200\n*E\n"})
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f28498a = androidx.compose.ui.unit.h.r(8);

    @SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,129:1\n1282#2,6:130\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2\n*L\n84#1:130,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28500b;

        a(String str, String str2) {
            this.f28499a = str;
            this.f28500b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, String str2, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.v1(e0Var, str + ", " + str2);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1740538748, i10, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:80)");
            }
            String str = this.f28499a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(str) | c0Var.D(this.f28500b);
            final String str2 = this.f28499a;
            final String str3 = this.f28500b;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ha
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.a.f(str2, str3, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262140);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,129:1\n1282#2,6:130\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$3\n*L\n87#1:130,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28501a;

        b(String str) {
            this.f28501a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1229526589, i10, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:86)");
            }
            String str = this.f28501a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ja
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.b.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262140);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,129:1\n1282#2,6:130\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$5\n*L\n107#1:130,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28503b;

        c(String str, String str2) {
            this.f28502a = str;
            this.f28503b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, String str2, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.v1(e0Var, str + ", " + str2);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-882370893, i10, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:104)");
            }
            String str = this.f28502a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(str) | c0Var.D(this.f28503b);
            final String str2 = this.f28502a;
            final String str3 = this.f28503b;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ka
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.c.f(str2, str3, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262140);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$6\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,129:1\n1282#2,6:130\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$6\n*L\n110#1:130,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28504a;

        d(String str) {
            this.f28504a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1956183348, i10, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:109)");
            }
            String str = this.f28504a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.la
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.d.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262140);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@Nullable final Long l10, @Nullable final Long l11, @NotNull final Function2<? super Long, ? super Long, Unit> function2, @NotNull final androidx.compose.material3.internal.k1 k1Var, @NotNull final IntRange intRange, @NotNull final y7 y7Var, @NotNull final ww wwVar, @NotNull final r7 r7Var, @Nullable final androidx.compose.ui.focus.g0 g0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        IntRange intRange2;
        final Function2<? super Long, ? super Long, Unit> function3;
        androidx.compose.runtime.c0 c0Var2;
        Object p7Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1372713366);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(l11) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            intRange2 = intRange;
            i11 |= c0VarR.k0(intRange2) ? 16384 : 8192;
        } else {
            intRange2 = intRange;
        }
        if ((196608 & i10) == 0) {
            i11 |= (i10 & 262144) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(wwVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= c0VarR.D(r7Var) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= c0VarR.D(g0Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if (c0VarR.h((i11 & 38347923) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1372713366, i11, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:44)");
            }
            boolean zD = c0VarR.D(k1Var.l());
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = k1Var.g(k1Var.l());
                c0VarR.Y(objI0);
            }
            androidx.compose.material3.internal.v1 v1Var = (androidx.compose.material3.internal.v1) objI0;
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31840h), c0VarR, 0);
            String strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31844j), c0VarR, 0);
            String strB3 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31842i), c0VarR, 0);
            String strB4 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.C), c0VarR, 0);
            boolean zD2 = c0VarR.D(v1Var) | ((i11 & 458752) == 131072 || ((i11 & 262144) != 0 && c0VarR.D(y7Var)));
            Object objI1 = c0VarR.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                p7Var = new p7(intRange2, wwVar, v1Var, y7Var, strB, strB2, strB3, strB4);
                v1Var = v1Var;
                c0VarR.Y(p7Var);
            } else {
                p7Var = objI1;
            }
            p7 p7Var2 = (p7) p7Var;
            p7Var2.d(l10);
            p7Var2.c(l11);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(aVar2, n7.r());
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.G(f28498a), androidx.compose.ui.e.f37317a.w(), c0VarR, 6);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            String upperCase = v1Var.f().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strB5 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0VarR, 0);
            androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.x5.q(y5Var, aVar2, 0.5f, false, 2, null);
            ti.a aVar4 = ti.f33206b;
            int iC = aVar4.c();
            Locale localeL = k1Var.l();
            int i12 = i11 & 896;
            boolean z10 = i12 == 256;
            int i13 = i11 & com.planner5d.library.engine.input.f.b.B;
            boolean z11 = (i13 == 32) | z10;
            Object objI2 = c0VarR.i0();
            if (z11 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material3.ea
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.e(function2, l11, (Long) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            int i14 = i11 & 7168;
            int i15 = i11 >> 21;
            int i16 = i15 & 14;
            int i17 = i11;
            c0Var2 = c0VarR;
            boolean z12 = false;
            n7.i(a0VarQ, l10, (Function1) objI2, k1Var, androidx.compose.runtime.internal.w.e(1740538748, true, new a(strB5, upperCase), c0VarR, 54), androidx.compose.runtime.internal.w.e(1229526589, true, new b(upperCase), c0VarR, 54), iC, p7Var2, v1Var, localeL, r7Var, g0Var, c0Var2, ((i11 << 3) & com.planner5d.library.engine.input.f.b.B) | 1794048 | i14, i15 & okhttp3.internal.ws.g.f334652s);
            String strB6 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0Var2, 0);
            androidx.compose.ui.a0 a0VarQ2 = androidx.compose.foundation.layout.x5.q(y5Var, aVar2, 0.5f, false, 2, null);
            int iA = aVar4.a();
            Locale localeL2 = k1Var.l();
            boolean z13 = i12 == 256;
            if ((i17 & 14) == 4) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            Object objI3 = c0Var2.i0();
            if (z14 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                function3 = function2;
                objI3 = new Function1() { // from class: androidx.compose.material3.fa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.f(function3, l10, (Long) obj);
                    }
                };
                c0Var2.Y(objI3);
            } else {
                function3 = function2;
            }
            n7.i(a0VarQ2, l11, (Function1) objI3, k1Var, androidx.compose.runtime.internal.w.e(-882370893, true, new c(strB6, upperCase), c0Var2, 54), androidx.compose.runtime.internal.w.e(1956183348, true, new d(upperCase), c0Var2, 54), iA, p7Var2, v1Var, localeL2, r7Var, null, c0Var2, i13 | 1794048 | i14, i16 | 48);
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            function3 = function2;
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final Function2<? super Long, ? super Long, Unit> function4 = function3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ga
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ia.g(l10, l11, function4, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function2 function2, Long l10, Long l11) {
        function2.invoke(l11, l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function2 function2, Long l10, Long l11) {
        function2.invoke(l10, l11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Long l10, Long l11, Function2 function2, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, androidx.compose.ui.focus.g0 g0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(l10, l11, function2, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
