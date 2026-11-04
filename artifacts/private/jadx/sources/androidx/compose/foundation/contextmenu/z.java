package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.c4;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.e4;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.q4;
import androidx.compose.foundation.text.p1;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,443:1\n87#2:444\n84#2,9:445\n94#2:484\n80#3,6:454\n87#3,3:469\n90#3,2:478\n94#3:483\n80#3,6:497\n87#3,3:512\n90#3,2:521\n80#3,6:534\n87#3,3:549\n90#3,2:558\n94#3:563\n94#3:567\n391#4,9:460\n400#4,3:480\n391#4,9:503\n400#4:523\n391#4,9:540\n400#4,3:560\n401#4,2:565\n4360#5,6:472\n4360#5,6:515\n4360#5,6:552\n1282#6,6:485\n1282#6,6:571\n99#7,6:491\n106#7:568\n70#8:524\n67#8,9:525\n77#8:564\n75#9:569\n75#9:570\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n*L\n160#1:444\n160#1:445,9\n160#1:484\n160#1:454,6\n160#1:469,3\n160#1:478,2\n160#1:483\n198#1:497,6\n198#1:512,3\n198#1:521,2\n218#1:534,6\n218#1:549,3\n218#1:558,2\n218#1:563\n198#1:567\n160#1:460,9\n160#1:480,3\n198#1:503,9\n198#1:523\n218#1:540,9\n218#1:560,3\n198#1:565,2\n160#1:472,6\n198#1:515,6\n218#1:552,6\n203#1:485,6\n386#1:571,6\n198#1:491,6\n198#1:568\n218#1:524\n218#1:525,9\n218#1:564\n385#1:569\n386#1:570\n*E\n"})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.window.t f14124a = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f14125b = 0.38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final h f14126c;

    @SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt$ContextMenuColumnBuilder$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,443:1\n1282#2,6:444\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt$ContextMenuColumnBuilder$1\n*L\n144#1:444,6\n*E\n"})
    static final class a implements pj.n<m0, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<p, Unit> f14127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f14128b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super p, Unit> function1, h hVar) {
            this.f14127a = function1;
            this.f14128b = hVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(m0 m0Var, c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(860259975, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder.<anonymous> (ContextMenuUi.android.kt:143)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = new p();
                c0Var.Y(objI0);
            }
            p pVar = (p) objI0;
            Function1<p, Unit> function1 = this.f14127a;
            h hVar = this.f14128b;
            pVar.d();
            function1.invoke(pVar);
            pVar.b(hVar, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, c0 c0Var, Integer num) {
            c(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f14129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f14130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<p, Unit> f14131c;

        /* JADX WARN: Multi-variable type inference failed */
        b(a0 a0Var, h hVar, Function1<? super p, Unit> function1) {
            this.f14129a = a0Var;
            this.f14130b = hVar;
            this.f14131c = function1;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(795909757, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:132)");
            }
            z.i(this.f14129a, this.f14130b, this.f14131c, c0Var, 0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        q0.a aVar = q0.f38131b;
        f14126c = new h(aVar.w(), aVar.a(), aVar.a(), q0.w(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), q0.w(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @l1
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void g(@NotNull h hVar, @Nullable a0 a0Var, @NotNull final pj.n<? super m0, ? super c0, ? super Integer, Unit> nVar, @Nullable c0 c0Var, final int i10, final int i11) {
        h hVar2;
        int i12;
        a0 a0Var2;
        int i13;
        boolean z10;
        a0 a0Var3;
        s5 s5VarT;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        c0 c0VarR = c0Var.R(621449936);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 6) == 0) {
            hVar2 = hVar;
            i12 = (c0VarR.D(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= a5.S0;
            } else if ((i10 & a5.S0) == 0) {
                if (c0VarR.k0(nVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i14 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(621449936, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:158)");
                }
                q qVar = q.f14065a;
                a0 a0VarM = q4.m(d5.t(c4.d(androidx.compose.foundation.v.d(androidx.compose.ui.draw.x.f(a0Var3, qVar.o(), androidx.compose.foundation.shape.o.h(qVar.c()), false, 0L, 0L, 28, null), hVar2.a(), null, 2, null), e4.Max), 0.0f, qVar.p(), 1, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null);
                int i15 = (i12 << 3) & 7168;
                a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarM);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarB, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                nVar.invoke(n0.f16227a, c0VarR, Integer.valueOf(((i15 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final h hVar3 = hVar2;
                final a0 a0Var4 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.w
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return z.h(hVar3, a0Var4, nVar, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            if (c0VarR.k0(nVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i14 != 0) {
                a0Var3 = a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(621449936, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:158)");
            }
            q qVar2 = q.f14065a;
            a0 a0VarM2 = q4.m(d5.t(c4.d(androidx.compose.foundation.v.d(androidx.compose.ui.draw.x.f(a0Var3, qVar2.o(), androidx.compose.foundation.shape.o.h(qVar2.c()), false, 0L, 0L, 28, null), hVar2.a(), null, 2, null), e4.Max), 0.0f, qVar2.p(), 1, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null);
            int i16 = (i12 << 3) & 7168;
            a1 a1VarB2 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarM2);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            function0A = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB2, aVar2.e());
            y7.n(c0VarD, b1VarK2, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar2.f());
            nVar.invoke(n0.f16227a, c0VarR, Integer.valueOf(((i16 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final h hVar4 = hVar2;
            final a0 a0Var5 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.h(hVar4, a0Var5, nVar, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(h hVar, a0 a0Var, pj.n nVar, int i10, int i11, c0 c0Var, int i12) {
        g(hVar, a0Var, nVar, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void i(@Nullable a0 a0Var, @Nullable h hVar, @NotNull final Function1<? super p, Unit> function1, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        final a0 a0Var2;
        final h hVar2;
        c0 c0VarR = c0Var.R(-1430784946);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(hVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            a0 a0Var3 = a0Var;
            if (i14 != 0) {
                hVar = f14126c;
            }
            h hVar3 = hVar;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1430784946, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder (ContextMenuUi.android.kt:141)");
            }
            g(hVar3, a0Var3, androidx.compose.runtime.internal.w.e(860259975, true, new a(function1, hVar3), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | a5.S0 | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            hVar2 = hVar3;
            a0Var2 = a0Var3;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            hVar2 = hVar;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.j(a0Var2, hVar2, function1, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(a0 a0Var, h hVar, Function1 function1, int i10, int i11, c0 c0Var, int i12) {
        i(a0Var, hVar, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01db  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:112:0x0228  */
    /* JADX WARN: Code duplicated, block: B:115:0x0234  */
    /* JADX WARN: Code duplicated, block: B:116:0x0238  */
    /* JADX WARN: Code duplicated, block: B:119:0x0259  */
    /* JADX WARN: Code duplicated, block: B:121:0x0267  */
    /* JADX WARN: Code duplicated, block: B:124:0x0280  */
    /* JADX WARN: Code duplicated, block: B:125:0x0285  */
    /* JADX WARN: Code duplicated, block: B:128:0x029d  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x0185  */
    /* JADX WARN: Code duplicated, block: B:99:0x0191  */
    @l1
    @androidx.compose.runtime.o
    @e.a({"ComposableLambdaParameterPosition"})
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(@NotNull final String str, final boolean z10, @NotNull final h hVar, @Nullable a0 a0Var, @Nullable pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar, @NotNull final Function0<Unit> function0, @Nullable c0 c0Var, final int i10, final int i11) {
        String str2;
        int i12;
        h hVar2;
        a0 a0Var2;
        int i13;
        pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar2;
        int i14;
        int i15;
        int i16;
        boolean z11;
        c0 c0Var2;
        final a0 a0Var3;
        final pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar3;
        s5 s5VarT;
        a0 a0Var4;
        q qVar;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objI0;
        int iHashCode;
        androidx.compose.ui.node.g.a aVar;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        long jB;
        long jC;
        c0 c0VarR = c0Var.R(-1027365588);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            str2 = str;
        } else if ((i10 & 6) == 0) {
            str2 = str;
            i12 = (c0VarR.D(str2) ? 4 : 2) | i10;
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            if ((i10 & a5.S0) == 0) {
                i12 |= c0VarR.D(hVar2) ? 256 : 128;
            }
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function0)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((74899 & i16) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i16 & 1)) {
                    if (i17 != 0) {
                        a0Var4 = a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        nVar2 = null;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1027365588, i16, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:196)");
                    }
                    qVar = q.f14065a;
                    androidx.compose.ui.e.c cVarK = qVar.k();
                    androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(qVar.h());
                    if ((i16 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((458752 & i16) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z12 | z13;
                    objI0 = c0VarR.i0();
                    if (z14 || objI0 == c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.contextmenu.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return z.l(z10, function0);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0 a0Var5 = a0Var4;
                    a0 a0VarT = d5.t(i6.z(i6.h(i1.j(a0Var5, z10, str2, null, null, (Function0) objI0, 12, null), 0.0f, 1, null), qVar.b(), qVar.n(), qVar.a(), qVar.n()), qVar.h(), 0.0f, 2, null);
                    a1 a1VarE = u5.e(fVarG, cVarK, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK = c0VarR.k();
                    a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
                    aVar = androidx.compose.ui.node.g.I;
                    function0A = aVar.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE, aVar.e());
                    y7.n(c0VarD, b1VarK, aVar.g());
                    function2B = aVar.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar.f());
                    y5 y5Var = y5.f16577a;
                    if (nVar2 == null) {
                        c0VarR.E(-1483499797);
                    } else {
                        c0VarR.E(-1483499796);
                        a0 a0VarS = i6.s(a0.E, qVar.i(), 0.0f, qVar.i(), qVar.i(), 2, null);
                        a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK2 = c0VarR.k();
                        a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarS);
                        function0A2 = aVar.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK, aVar.e());
                        y7.n(c0VarD2, b1VarK2, aVar.g());
                        function2B2 = aVar.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN2, aVar.f());
                        d0 d0Var = d0.f15956a;
                        if (z10) {
                            jB = hVar2.d();
                        } else {
                            jB = hVar2.b();
                        }
                        nVar2.invoke(q0.n(jB), c0VarR, 0);
                        c0VarR.o();
                        Unit unit = Unit.f312394a;
                    }
                    c0VarR.A();
                    if (z10) {
                        jC = hVar2.e();
                    } else {
                        jC = hVar2.c();
                    }
                    pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar4 = nVar2;
                    c0Var2 = c0VarR;
                    p1.A(str, y5Var.h(a0.E, 1.0f, true), qVar.q(jC), null, 0, false, 1, 0, null, null, c0Var2, (i16 & 14) | 1572864, 952);
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    nVar3 = nVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    nVar3 = nVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.y
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return z.m(str, z10, hVar, a0Var3, nVar3, function0, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVar2 = nVar;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function0)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((74899 & i16) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i16 & 1)) {
                if (i17 != 0) {
                    a0Var4 = a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    nVar2 = null;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1027365588, i16, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:196)");
                }
                qVar = q.f14065a;
                androidx.compose.ui.e.c cVarK2 = qVar.k();
                androidx.compose.foundation.layout.q.f fVarG2 = androidx.compose.foundation.layout.q.f16330a.G(qVar.h());
                if ((i16 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((458752 & i16) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z12 | z13;
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.contextmenu.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.l(z10, function0);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.contextmenu.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.l(z10, function0);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0 a0Var6 = a0Var4;
                a0 a0VarT2 = d5.t(i6.z(i6.h(i1.j(a0Var6, z10, str2, null, null, (Function0) objI0, 12, null), 0.0f, 1, null), qVar.b(), qVar.n(), qVar.a(), qVar.n()), qVar.h(), 0.0f, 2, null);
                a1 a1VarE2 = u5.e(fVarG2, cVarK2, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarT2);
                aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE2, aVar.e());
                y7.n(c0VarD, b1VarK3, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN3, aVar.f());
                y5 y5Var2 = y5.f16577a;
                if (nVar2 == null) {
                    c0VarR.E(-1483499797);
                } else {
                    c0VarR.E(-1483499796);
                    a0 a0VarS2 = i6.s(a0.E, qVar.i(), 0.0f, qVar.i(), qVar.i(), 2, null);
                    a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK4 = c0VarR.k();
                    a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarS2);
                    function0A2 = aVar.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK2, aVar.e());
                    y7.n(c0VarD2, b1VarK4, aVar.g());
                    function2B2 = aVar.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN4, aVar.f());
                    d0 d0Var2 = d0.f15956a;
                    if (z10) {
                        jB = hVar2.d();
                    } else {
                        jB = hVar2.b();
                    }
                    nVar2.invoke(q0.n(jB), c0VarR, 0);
                    c0VarR.o();
                    Unit unit2 = Unit.f312394a;
                }
                c0VarR.A();
                if (z10) {
                    jC = hVar2.e();
                } else {
                    jC = hVar2.c();
                }
                pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar5 = nVar2;
                c0Var2 = c0VarR;
                p1.A(str, y5Var2.h(a0.E, 1.0f, true), qVar.q(jC), null, 0, false, 1, 0, null, null, c0Var2, (i16 & 14) | 1572864, 952);
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var6;
                nVar3 = nVar5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                nVar3 = nVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return z.m(str, z10, hVar, a0Var3, nVar3, function0, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function0)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((74899 & i16) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i16 & 1)) {
                if (i17 != 0) {
                    a0Var4 = a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    nVar2 = null;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1027365588, i16, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:196)");
                }
                qVar = q.f14065a;
                androidx.compose.ui.e.c cVarK3 = qVar.k();
                androidx.compose.foundation.layout.q.f fVarG3 = androidx.compose.foundation.layout.q.f16330a.G(qVar.h());
                if ((i16 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((458752 & i16) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z12 | z13;
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.contextmenu.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.l(z10, function0);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.foundation.contextmenu.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.l(z10, function0);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0 a0Var7 = a0Var4;
                a0 a0VarT3 = d5.t(i6.z(i6.h(i1.j(a0Var7, z10, str2, null, null, (Function0) objI0, 12, null), 0.0f, 1, null), qVar.b(), qVar.n(), qVar.a(), qVar.n()), qVar.h(), 0.0f, 2, null);
                a1 a1VarE3 = u5.e(fVarG3, cVarK3, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK5 = c0VarR.k();
                a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarT3);
                aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE3, aVar.e());
                y7.n(c0VarD, b1VarK5, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar.f());
                y5 y5Var3 = y5.f16577a;
                if (nVar2 == null) {
                    c0VarR.E(-1483499797);
                } else {
                    c0VarR.E(-1483499796);
                    a0 a0VarS3 = i6.s(a0.E, qVar.i(), 0.0f, qVar.i(), qVar.i(), 2, null);
                    a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK6 = c0VarR.k();
                    a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarS3);
                    function0A2 = aVar.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK3, aVar.e());
                    y7.n(c0VarD2, b1VarK6, aVar.g());
                    function2B2 = aVar.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN6, aVar.f());
                    d0 d0Var3 = d0.f15956a;
                    if (z10) {
                        jB = hVar2.d();
                    } else {
                        jB = hVar2.b();
                    }
                    nVar2.invoke(q0.n(jB), c0VarR, 0);
                    c0VarR.o();
                    Unit unit3 = Unit.f312394a;
                }
                c0VarR.A();
                if (z10) {
                    jC = hVar2.e();
                } else {
                    jC = hVar2.c();
                }
                pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar6 = nVar2;
                c0Var2 = c0VarR;
                p1.A(str, y5Var3.h(a0.E, 1.0f, true), qVar.q(jC), null, 0, false, 1, 0, null, null, c0Var2, (i16 & 14) | 1572864, 952);
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var7;
                nVar3 = nVar6;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                nVar3 = nVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return z.m(str, z10, hVar, a0Var3, nVar3, function0, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        nVar2 = nVar;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(function0)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((74899 & i16) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i16 & 1)) {
            if (i17 != 0) {
                a0Var4 = a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                nVar2 = null;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1027365588, i16, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:196)");
            }
            qVar = q.f14065a;
            androidx.compose.ui.e.c cVarK4 = qVar.k();
            androidx.compose.foundation.layout.q.f fVarG4 = androidx.compose.foundation.layout.q.f16330a.G(qVar.h());
            if ((i16 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((458752 & i16) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z12 | z13;
            objI0 = c0VarR.i0();
            if (z14) {
                objI0 = new Function0() { // from class: androidx.compose.foundation.contextmenu.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z.l(z10, function0);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: androidx.compose.foundation.contextmenu.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z.l(z10, function0);
                    }
                };
                c0VarR.Y(objI0);
            }
            a0 a0Var8 = a0Var4;
            a0 a0VarT4 = d5.t(i6.z(i6.h(i1.j(a0Var8, z10, str2, null, null, (Function0) objI0, 12, null), 0.0f, 1, null), qVar.b(), qVar.n(), qVar.a(), qVar.n()), qVar.h(), 0.0f, 2, null);
            a1 a1VarE4 = u5.e(fVarG4, cVarK4, c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK7 = c0VarR.k();
            a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarT4);
            aVar = androidx.compose.ui.node.g.I;
            function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE4, aVar.e());
            y7.n(c0VarD, b1VarK7, aVar.g());
            function2B = aVar.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar.f());
            y5 y5Var4 = y5.f16577a;
            if (nVar2 == null) {
                c0VarR.E(-1483499797);
            } else {
                c0VarR.E(-1483499796);
                a0 a0VarS4 = i6.s(a0.E, qVar.i(), 0.0f, qVar.i(), qVar.i(), 2, null);
                a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK8 = c0VarR.k();
                a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarS4);
                function0A2 = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK4, aVar.e());
                y7.n(c0VarD2, b1VarK8, aVar.g());
                function2B2 = aVar.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN8, aVar.f());
                d0 d0Var4 = d0.f15956a;
                if (z10) {
                    jB = hVar2.d();
                } else {
                    jB = hVar2.b();
                }
                nVar2.invoke(q0.n(jB), c0VarR, 0);
                c0VarR.o();
                Unit unit4 = Unit.f312394a;
            }
            c0VarR.A();
            if (z10) {
                jC = hVar2.e();
            } else {
                jC = hVar2.c();
            }
            pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar7 = nVar2;
            c0Var2 = c0VarR;
            p1.A(str, y5Var4.h(a0.E, 1.0f, true), qVar.q(jC), null, 0, false, 1, 0, null, null, c0Var2, (i16 & 14) | 1572864, 952);
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var8;
            nVar3 = nVar7;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            nVar3 = nVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.m(str, z10, hVar, a0Var3, nVar3, function0, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(boolean z10, Function0 function0) {
        if (z10) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(String str, boolean z10, h hVar, a0 a0Var, pj.n nVar, Function0 function0, int i10, int i11, c0 c0Var, int i12) {
        k(str, z10, hVar, a0Var, nVar, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @l1
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void n(@NotNull final androidx.compose.ui.window.s sVar, @NotNull final Function0<Unit> function0, @Nullable a0 a0Var, @NotNull final h hVar, @NotNull final Function1<? super p, Unit> function1, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        final a0 a0Var2;
        int i13;
        int i14;
        boolean z10;
        s5 s5VarT;
        a0 a0Var3;
        c0 c0VarR = c0Var.R(1447189339);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(sVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.D(hVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function1)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i15 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1447189339, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:126)");
                }
                androidx.compose.ui.window.c.a(sVar, function0, f14124a, androidx.compose.runtime.internal.w.e(795909757, true, new b(a0Var3, hVar, function1), c0VarR, 54), c0VarR, (i12 & 14) | 3456 | (i12 & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.v
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return z.q(sVar, function0, a0Var2, hVar, function1, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.D(hVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.k0(function1)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i15 != 0) {
                a0Var3 = a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1447189339, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:126)");
            }
            androidx.compose.ui.window.c.a(sVar, function0, f14124a, androidx.compose.runtime.internal.w.e(795909757, true, new b(a0Var3, hVar, function1), c0VarR, 54), c0VarR, (i12 & 14) | 3456 | (i12 & com.planner5d.library.engine.input.f.b.B), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
        } else {
            c0VarR.u();
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.q(sVar, function0, a0Var2, hVar, function1, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void o(@NotNull androidx.compose.ui.window.s sVar, @NotNull Function0<Unit> function0, @Nullable a0 a0Var, @NotNull Function1<? super p, Unit> function1, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function2;
        final Function1<? super p, Unit> function3;
        final androidx.compose.ui.window.s sVar2;
        final a0 a0Var2;
        c0 c0VarR = c0Var.R(712057293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(sVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function1) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            a0 a0Var3 = a0Var;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(712057293, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:108)");
            }
            function2 = function0;
            n(sVar, function2, a0Var3, r(0, 0, c0VarR, 0, 3), function1, c0VarR, (i12 & androidx.media3.exoplayer.analytics.b.f62802b0) | ((i12 << 3) & 57344), 0);
            sVar2 = sVar;
            function3 = function1;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
        } else {
            function2 = function0;
            function3 = function1;
            sVar2 = sVar;
            c0VarR.u();
            a0Var2 = a0Var;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function0<Unit> function4 = function2;
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.p(sVar2, function4, a0Var2, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(androidx.compose.ui.window.s sVar, Function0 function0, a0 a0Var, Function1 function1, int i10, int i11, c0 c0Var, int i12) {
        o(sVar, function0, a0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.window.s sVar, Function0 function0, a0 a0Var, h hVar, Function1 function1, int i10, int i11, c0 c0Var, int i12) {
        n(sVar, function0, a0Var, hVar, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @l1
    @NotNull
    public static final h r(@g1 int i10, @g1 int i11, @Nullable c0 c0Var, int i12, int i13) {
        int i14 = (i13 & 1) != 0 ? R.style.Widget.PopupMenu : i10;
        int i15 = (i13 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i11;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1689505294, i12, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:383)");
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        boolean zD = c0Var.D((Configuration) c0Var.W(AndroidCompositionLocals_androidKt.f())) | c0Var.D(context);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            h hVar = f14126c;
            long jW = w(context, i14, R.attr.colorBackground, hVar.a());
            ColorStateList colorStateListX = x(context, i15, R.attr.textColorPrimary);
            long jT = t(colorStateListX, hVar.e());
            long jS = s(colorStateListX, hVar.c());
            Object hVar2 = new h(jW, jT, jT, jS, jS, null);
            c0Var.Y(hVar2);
            objI0 = hVar2;
        }
        h hVar3 = (h) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return hVar3;
    }

    private static final long s(ColorStateList colorStateList, long j10) {
        int iT = s0.t(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iT)) : null;
        if (numValueOf != null && numValueOf.intValue() != iT) {
            return s0.b(numValueOf.intValue());
        }
        return j10;
    }

    private static final long t(ColorStateList colorStateList, long j10) {
        int iT = s0.t(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iT)) : null;
        if (numValueOf != null && numValueOf.intValue() != iT) {
            return s0.b(numValueOf.intValue());
        }
        return j10;
    }

    @NotNull
    public static final h u() {
        return f14126c;
    }

    @l1
    public static /* synthetic */ void v() {
    }

    private static final long w(Context context, @g1 int i10, @androidx.annotation.f int i11, long j10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        int iT = s0.t(j10);
        int color = typedArrayObtainStyledAttributes.getColor(0, iT);
        typedArrayObtainStyledAttributes.recycle();
        return color == iT ? j10 : s0.b(color);
    }

    private static final ColorStateList x(Context context, @g1 int i10, @androidx.annotation.f int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }
}
