package coil.compose;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.z0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,277:1\n1#2:278\n124#3,5:279\n130#3,5:292\n135#3:303\n137#3:306\n286#4,8:284\n294#4,2:304\n3737#5,6:297\n*S KotlinDebug\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n*L\n260#1:279,5\n260#1:292,5\n260#1:303\n260#1:306\n260#1:284,8\n260#1:304,2\n260#1:297,6\n*E\n"})
public final class c {

    public static final class a extends l0 implements Function0<androidx.compose.ui.node.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f87038a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f87038a = function0;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final androidx.compose.ui.node.g invoke() {
            return this.f87038a.invoke();
        }
    }

    static final class b implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f87039a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(i2.a aVar) {
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            return c1.h6(c1Var, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), null, new Function1() { // from class: coil.compose.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.b.g((i2.a) obj);
                }
            }, 4, null);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void c(h hVar, final String str, final androidx.compose.ui.a0 a0Var, final Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, final Function1<? super AsyncImagePainter.State, Unit> function2, final androidx.compose.ui.e eVar, final androidx.compose.ui.layout.l lVar, final float f10, final r0 r0Var, final int i10, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        final h hVar2;
        int i13;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function3;
        Function1<? super AsyncImagePainter.State, Unit> function4;
        int i14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-421592773);
        if ((i11 & 14) == 0) {
            hVar2 = hVar;
            i13 = (c0VarR.D(hVar2) ? 4 : 2) | i11;
        } else {
            hVar2 = hVar;
            i13 = i11;
        }
        if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i13 |= c0VarR.D(str) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            function3 = function1;
            i13 |= c0VarR.k0(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i11 & 57344) == 0) {
            function4 = function2;
            i13 |= c0VarR.k0(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((i11 & 458752) == 0) {
            i13 |= c0VarR.D(eVar) ? 131072 : 65536;
        }
        if ((i11 & 3670016) == 0) {
            i13 |= c0VarR.D(lVar) ? 1048576 : 524288;
        }
        if ((i11 & 29360128) == 0) {
            i13 |= c0VarR.I(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i13 |= c0VarR.D(r0Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 1879048192) == 0) {
            i13 |= c0VarR.K(i10) ? 536870912 : 268435456;
        }
        int i15 = i13;
        if ((i12 & 14) == 0) {
            i14 = i12 | (c0VarR.G(z10) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i15 & 1533916891) == 306783378 && (i14 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            coil.request.i iVarN = g0.n(hVar2.b(), lVar, c0VarR, ((i15 >> 15) & com.planner5d.library.engine.input.f.b.B) | 8);
            int i16 = i15 >> 3;
            int i17 = i15 >> 6;
            int i18 = i17 & 57344;
            AsyncImagePainter asyncImagePainterC = g.c(iVarN, hVar2.a(), function3, function4, lVar, i10, hVar2.c(), c0VarR, (i16 & 7168) | (i16 & 896) | 72 | i18 | ((i15 >> 12) & 458752), 0);
            coil.size.j jVarK = iVarN.K();
            i(jVarK instanceof k ? a0Var.B2((androidx.compose.ui.a0) jVarK) : a0Var, asyncImagePainterC, str, eVar, lVar, f10, r0Var, z10, c0VarR, ((i15 << 3) & 896) | (i17 & 7168) | i18 | (i17 & 458752) | (i17 & 3670016) | ((i14 << 21) & 29360128));
            c0VarR = c0VarR;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: coil.compose.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.h(hVar2, str, a0Var, function1, function2, eVar, lVar, f10, r0Var, i10, z10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    public static final void d(@Nullable Object obj, @Nullable String str, @NotNull coil.j jVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.painter.b bVar, @Nullable androidx.compose.ui.graphics.painter.b bVar2, @Nullable androidx.compose.ui.graphics.painter.b bVar3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function2, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function3, @Nullable androidx.compose.ui.e eVar, @Nullable androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var, int i10, boolean z10, @Nullable m mVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12, int i13) {
        c0Var.h0(-1481548872);
        androidx.compose.ui.a0 a0Var2 = (i13 & 8) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.graphics.painter.b bVar4 = (i13 & 16) != 0 ? null : bVar;
        androidx.compose.ui.graphics.painter.b bVar5 = (i13 & 32) != 0 ? null : bVar2;
        androidx.compose.ui.graphics.painter.b bVar6 = (i13 & 64) != 0 ? bVar5 : bVar3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function4 = (i13 & 128) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function5 = (i13 & 256) != 0 ? null : function2;
        Function1<? super AsyncImagePainter.State.Error, Unit> function6 = (i13 & 512) != 0 ? null : function3;
        androidx.compose.ui.e eVarI = (i13 & 1024) != 0 ? androidx.compose.ui.e.f37317a.i() : eVar;
        androidx.compose.ui.layout.l lVarI = (i13 & 2048) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar;
        float f11 = (i13 & 4096) != 0 ? 1.0f : f10;
        int i14 = i12 << 15;
        c(new h(obj, (i13 & 65536) != 0 ? n.a() : mVar, jVar), str, a0Var2, g0.s(bVar4, bVar5, bVar6), g0.k(function4, function5, function6), eVarI, lVarI, f11, (i13 & 8192) == 0 ? r0Var : null, (i13 & 16384) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, (32768 & i13) != 0 ? true : z10, c0Var, (i11 & com.planner5d.library.engine.input.f.b.B) | ((i11 >> 3) & 896) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i12 >> 15) & 14);
        c0Var.w0();
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void e(Object obj, String str, coil.j jVar, androidx.compose.ui.a0 a0Var, Function1 function1, Function1 function2, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11, int i12, int i13) {
        c0Var.h0(-2030202961);
        int i14 = i11 >> 3;
        c(new h(obj, n.a(), jVar), str, (i13 & 8) != 0 ? androidx.compose.ui.a0.E : a0Var, (i13 & 16) != 0 ? AsyncImagePainter.Z.a() : function1, (i13 & 32) != 0 ? null : function2, (i13 & 64) != 0 ? androidx.compose.ui.e.f37317a.i() : eVar, (i13 & 128) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar, (i13 & 256) != 0 ? 1.0f : f10, (i13 & 512) != 0 ? null : r0Var, (i13 & 1024) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, true, c0Var, (i11 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024) | ((i12 << 27) & 1879048192), 6);
        c0Var.w0();
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void f(Object obj, String str, coil.j jVar, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.painter.b bVar2, androidx.compose.ui.graphics.painter.b bVar3, Function1 function1, Function1 function2, Function1 function3, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11, int i12, int i13) {
        c0Var.h0(-245964807);
        androidx.compose.ui.a0 a0Var2 = (i13 & 8) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.graphics.painter.b bVar4 = (i13 & 16) != 0 ? null : bVar;
        androidx.compose.ui.graphics.painter.b bVar5 = (i13 & 32) != 0 ? null : bVar2;
        androidx.compose.ui.graphics.painter.b bVar6 = (i13 & 64) != 0 ? bVar5 : bVar3;
        Function1 function4 = (i13 & 128) != 0 ? null : function1;
        Function1 function5 = (i13 & 256) != 0 ? null : function2;
        Function1 function6 = (i13 & 512) != 0 ? null : function3;
        androidx.compose.ui.e eVarI = (i13 & 1024) != 0 ? androidx.compose.ui.e.f37317a.i() : eVar;
        androidx.compose.ui.layout.l lVarI = (i13 & 2048) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar;
        float f11 = (i13 & 4096) != 0 ? 1.0f : f10;
        r0 r0Var2 = (i13 & 8192) == 0 ? r0Var : null;
        int i14 = i12 << 15;
        c(new h(obj, n.a(), jVar), str, a0Var2, g0.s(bVar4, bVar5, bVar6), g0.k(function4, function5, function6), eVarI, lVarI, f11, r0Var2, (i13 & 16384) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, true, c0Var, (i11 & com.planner5d.library.engine.input.f.b.B) | ((i11 >> 3) & 896) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), 6);
        c0Var.w0();
    }

    @androidx.compose.runtime.o
    public static final void g(@Nullable Object obj, @Nullable String str, @NotNull coil.j jVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function2, @Nullable androidx.compose.ui.e eVar, @Nullable androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var, int i10, boolean z10, @Nullable m mVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12, int i13) {
        c0Var.h0(2032051394);
        int i14 = i11 >> 3;
        c(new h(obj, (i13 & 4096) != 0 ? n.a() : mVar, jVar), str, (i13 & 8) != 0 ? androidx.compose.ui.a0.E : a0Var, (i13 & 16) != 0 ? AsyncImagePainter.Z.a() : function1, (i13 & 32) != 0 ? null : function2, (i13 & 64) != 0 ? androidx.compose.ui.e.f37317a.i() : eVar, (i13 & 128) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar, (i13 & 256) != 0 ? 1.0f : f10, (i13 & 512) != 0 ? null : r0Var, (i13 & 1024) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, (i13 & 2048) != 0 ? true : z10, c0Var, (i11 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024) | ((i12 << 27) & 1879048192), (i12 >> 3) & 14);
        c0Var.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(h hVar, String str, androidx.compose.ui.a0 a0Var, Function1 function1, Function1 function2, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, int i10, boolean z10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        c(hVar, str, a0Var, function1, function2, eVar, lVar, f10, r0Var, i10, z10, c0Var, t4.a(i11 | 1), t4.a(i12));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void i(final androidx.compose.ui.a0 a0Var, final AsyncImagePainter asyncImagePainter, final String str, final androidx.compose.ui.e eVar, final androidx.compose.ui.layout.l lVar, final float f10, final r0 r0Var, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(777774312);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.D(asyncImagePainter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.D(str) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c0VarR.D(eVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c0VarR.D(lVar) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= c0VarR.I(f10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= c0VarR.D(r0Var) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= c0VarR.G(z10) ? 8388608 : 4194304;
        }
        if ((i11 & 23967451) == 4793490 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0VarF = g0.f(a0Var, str);
            if (z10) {
                a0VarF = androidx.compose.ui.draw.j.b(a0VarF);
            }
            androidx.compose.ui.a0 a0VarB2 = a0VarF.B2(new ContentPainterElement(asyncImagePainter, eVar, lVar, f10, r0Var));
            b bVar = b.f87039a;
            c0VarR.h0(544976794);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB2);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            c0VarR.h0(1405779621);
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(new a(function0A));
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, bVar, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            y7.n(c0VarD, a0VarN, aVar.f());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            c0VarR.o();
            c0VarR.w0();
            c0VarR.w0();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: coil.compose.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.j(a0Var, asyncImagePainter, str, eVar, lVar, f10, r0Var, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.a0 a0Var, AsyncImagePainter asyncImagePainter, String str, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        i(a0Var, asyncImagePainter, str, eVar, lVar, f10, r0Var, z10, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
