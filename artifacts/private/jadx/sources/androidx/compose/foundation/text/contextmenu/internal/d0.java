package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDefaultTextContextMenuDropdownProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTextContextMenuDropdownProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/DefaultTextContextMenuDropdownProvider_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,286:1\n1282#2,6:287\n1282#2,6:293\n1282#2,6:300\n1282#2,6:307\n1282#2,3:313\n1285#2,3:317\n75#3:299\n75#3:306\n640#4:316\n35#5,5:320\n*S KotlinDebug\n*F\n+ 1 DefaultTextContextMenuDropdownProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/DefaultTextContextMenuDropdownProvider_androidKt\n*L\n112#1:287,6\n122#1:293,6\n141#1:300,6\n170#1:307,6\n178#1:313,3\n178#1:317,3\n137#1:299\n168#1:306\n178#1:316\n142#1:320,5\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.window.t f18850a = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0.b f18851a;

        a(b0.b bVar) {
            this.f18851a = bVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final String c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(666084174);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(666084174, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
            }
            String strB = ((b0.d) this.f18851a).b();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return strB;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    static final class b implements pj.n<androidx.compose.ui.graphics.q0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0.b f18852a;

        b(b0.b bVar) {
            this.f18852a = bVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(long j10, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.L(j10) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1930700965, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
            }
            d0.o(((b0.d) this.f18852a).c(), j10, c0Var, (i10 << 3) & com.planner5d.library.engine.input.f.b.B);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.q0 q0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(q0Var.M(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDefaultTextContextMenuDropdownProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTextContextMenuDropdownProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,286:1\n1282#2,6:287\n85#3:293\n*S KotlinDebug\n*F\n+ 1 DefaultTextContextMenuDropdownProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2\n*L\n125#1:287,6\n125#1:293\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.j f18853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0.g f18854b;

        /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<b0.c> {
            a(Object obj) {
                super(0, obj, androidx.compose.foundation.text.contextmenu.provider.j.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final b0.c invoke() {
                return ((androidx.compose.foundation.text.contextmenu.provider.j) this.receiver).K();
            }
        }

        c(androidx.compose.foundation.text.contextmenu.provider.j jVar, b0.g gVar) {
            this.f18853a = jVar;
            this.f18854b = gVar;
        }

        private static final b0.c d(n7<b0.c> n7Var) {
            return n7Var.getValue();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1315155414, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
            }
            boolean zD = c0Var.D(this.f18853a);
            androidx.compose.foundation.text.contextmenu.provider.j jVar = this.f18853a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = w6.e(new a(jVar));
                c0Var.Y(objI0);
            }
            d0.k(this.f18854b, d((n7) objI0), c0Var, 0);
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

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    @NotNull
    public static final androidx.compose.foundation.text.contextmenu.provider.c C(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1197778906, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.defaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:98)");
        }
        androidx.compose.foundation.text.contextmenu.provider.c cVarL = androidx.compose.foundation.text.contextmenu.provider.i.l(s.f18929a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return cVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void k(final b0.g gVar, final b0.c cVar, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1904307118);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(gVar) : c0VarR.k0(gVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(cVar) ? 32 : 16;
        }
        boolean z10 = false;
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1904307118, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            c0VarR.E(-1009462744);
            final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            c0VarR.A();
            boolean zK0 = c0VarR.k0(cVar);
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && c0VarR.k0(gVar))) {
                z10 = true;
            }
            boolean zK1 = zK0 | z10 | c0VarR.k0(context);
            Object objI0 = c0VarR.i0();
            if (zK1 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d0.l(cVar, context, gVar, (androidx.compose.foundation.contextmenu.p) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i12 = 6 | 0;
            androidx.compose.foundation.contextmenu.z.i(null, null, (Function1) objI0, c0VarR, 0, 3);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d0.n(gVar, cVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(b0.c cVar, Context context, final b0.g gVar, androidx.compose.foundation.contextmenu.p pVar) {
        androidx.compose.foundation.contextmenu.p pVar2;
        List<b0.b> listB = cVar.b();
        int size = listB.size();
        int i10 = 0;
        while (i10 < size) {
            final b0.b bVar = listB.get(i10);
            if (bVar instanceof b0.d) {
                pVar2 = pVar;
                androidx.compose.foundation.contextmenu.p.f(pVar2, new a(bVar), null, false, ((b0.d) bVar).c() == 0 ? null : androidx.compose.runtime.internal.w.c(-1930700965, true, new b(bVar)), new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.m(bVar, gVar);
                    }
                }, 6, null);
            } else {
                pVar2 = pVar;
                if (bVar instanceof b0.h) {
                    x0.f18959a.o(pVar2, context, (b0.h) bVar);
                } else if (bVar instanceof b0.f) {
                    pVar2.g();
                }
            }
            i10++;
            pVar = pVar2;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(b0.b bVar, b0.g gVar) {
        ((b0.d) bVar).d().invoke(gVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(b0.g gVar, b0.c cVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        k(gVar, cVar, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void o(@androidx.annotation.v final int i10, final long j10, androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        s5 s5VarT;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1240244237);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.L(j10) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1240244237, i12, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            boolean zD = ((i12 & 14) == 4) | c0VarR.D(context);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = Integer.valueOf(context.obtainStyledAttributes(new int[]{i10}).getResourceId(0, -1));
                c0VarR.Y(objI0);
            }
            int iIntValue = ((Number) objI0).intValue();
            if (iIntValue == -1) {
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                s5VarT = c0VarR.T();
                if (s5VarT == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.y
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d0.p(i10, j10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(iIntValue, c0VarR, 0);
                boolean z10 = (i12 & com.planner5d.library.engine.input.f.b.B) == 32;
                Object objI1 = c0VarR.i0();
                if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = j10 == 16 ? null : androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j10, 0, 2, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.ui.draw.t.b(i6.w(androidx.compose.ui.a0.E, androidx.compose.foundation.contextmenu.q.f14065a.i()), bVarC, false, null, androidx.compose.ui.layout.l.f39405a.i(), 0.0f, (androidx.compose.ui.graphics.r0) objI1, 22, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
            s5VarT.a(function2);
        }
        c0VarR.u();
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d0.q(i10, j10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            };
            s5VarT.a(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(int i10, long j10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(i10, j10, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(int i10, long j10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(i10, j10, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void r(final b0.g gVar, final androidx.compose.foundation.text.contextmenu.provider.j jVar, final Function0<? extends androidx.compose.ui.layout.g0> function0, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2040393164);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(gVar) : c0VarR.k0(gVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0VarR.D(jVar) : c0VarR.k0(jVar) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function0) ? 256 : 128;
        }
        boolean z10 = false;
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2040393164, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            boolean z11 = (i11 & com.planner5d.library.engine.input.f.b.B) == 32 || ((i11 & 64) != 0 && c0VarR.D(jVar));
            Object objI0 = c0VarR.i0();
            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new f0(new androidx.compose.foundation.contextmenu.m(new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.s(jVar, function0);
                    }
                }, (Function2) null, 2, (DefaultConstructorMarker) null));
                c0VarR.Y(objI0);
            }
            f0 f0Var = (f0) objI0;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && c0VarR.k0(gVar))) {
                z10 = true;
            }
            Object objI1 = c0VarR.i0();
            if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.t(gVar);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.window.c.a(f0Var, (Function0) objI1, f18850a, androidx.compose.runtime.internal.w.e(1315155414, true, new c(jVar, gVar), c0VarR, 54), c0VarR, 3456, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d0.u(gVar, jVar, function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.q s(androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0 function0) {
        return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.r.g(jVar.n4((androidx.compose.ui.layout.g0) function0.invoke())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(b0.g gVar) {
        gVar.close();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(b0.g gVar, androidx.compose.foundation.text.contextmenu.provider.j jVar, Function0 function0, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        r(gVar, jVar, function0, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void v(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final androidx.compose.ui.a0 a0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1392105195);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1392105195, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            a0Var2 = a0Var;
            function3 = function2;
            androidx.compose.foundation.text.contextmenu.provider.i.e(a0Var2, androidx.compose.foundation.text.contextmenu.provider.n.e(), s.f18929a.c(), function3, c0VarR, (i11 & 14) | 432 | ((i11 << 6) & 7168));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            a0Var2 = a0Var;
            function3 = function2;
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d0.y(a0Var2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void w(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(422095256);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(422095256, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:71)");
            }
            androidx.compose.foundation.text.contextmenu.provider.i.d(androidx.compose.foundation.text.contextmenu.provider.n.e(), s.f18929a.b(), function2, c0VarR, ((i11 << 6) & 896) | 54);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d0.x(function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        w(function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.compose.ui.a0 a0Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        v(a0Var, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
