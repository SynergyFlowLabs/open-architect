package androidx.compose.material3;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,132:1\n75#2:133\n75#2:134\n75#2:141\n75#2:142\n1282#3,6:135\n1282#3,6:143\n85#4:149\n66#5,5:150\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n*L\n42#1:133\n43#1:134\n49#1:141\n50#1:142\n44#1:135,6\n89#1:143,6\n59#1:149\n123#1:150,5\n*E\n"})
public final class gg {

    public static final class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f27959c;

        a(View view, Function0<Unit> function0) {
            this.f27958b = view;
            this.f27959c = function0;
            view.addOnAttachStateChangeListener(this);
            b();
        }

        private final void b() {
            if (!this.f27957a && this.f27958b.isAttachedToWindow()) {
                this.f27958b.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.f27957a = true;
            }
        }

        private final void c() {
            if (this.f27957a) {
                this.f27958b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f27957a = false;
            }
        }

        public final void a() {
            c();
            this.f27958b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f27959c.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            c();
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n*L\n1#1,69:1\n123#2:70\n*E\n"})
    public static final class b implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f27960a;

        public b(a aVar) {
            this.f27960a = aVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f27960a.a();
        }
    }

    @androidx.compose.runtime.o
    public static final void d(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1646555525);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1646555525, i11, -1, "androidx.compose.material3.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:47)");
            }
            f((View) c0VarR.W(AndroidCompositionLocals_androidKt.m()), (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m()), function0, c0VarR, (i11 << 6) & 896);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.dg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return gg.e(function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(function0, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final void f(final View view, final androidx.compose.ui.unit.d dVar, final Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1319522472);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(view) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(dVar) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1319522472, i11, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:85)");
            }
            boolean zK0 = c0VarR.k0(view) | ((i11 & 896) == 256);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.eg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return gg.g(view, function0, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.c(view, dVar, (Function1) objI0, c0VarR, i11 & okhttp3.internal.ws.g.f334652s);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.fg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return gg.h(view, dVar, function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 g(View view, Function0 function0, androidx.compose.runtime.v1 v1Var) {
        return new b(new a(view, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(View view, androidx.compose.ui.unit.d dVar, Function0 function0, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        f(view, dVar, function0, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.s j(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return androidx.compose.ui.graphics.c3.d(rect);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final ec0 k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(703324275, i10, -1, "androidx.compose.material3.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:40)");
        }
        Object obj = (Configuration) c0Var.W(AndroidCompositionLocals_androidKt.f());
        View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
        boolean zD = c0Var.D(obj) | c0Var.D(view);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new ec0(view);
            c0Var.Y(objI0);
        }
        ec0 ec0Var = (ec0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ec0Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.window.t l(@NotNull String str, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(895018515, i10, -1, "androidx.compose.material3.popupPropertiesForAnchorType (ExposedDropdownMenu.android.kt:57)");
        }
        androidx.compose.runtime.n7<Boolean> n7VarN = androidx.compose.material3.internal.h.n(false, false, false, c0Var, 0, 7);
        int i11 = !m(n7VarN) ? 393248 : 393216;
        df.a aVar = df.f27099b;
        if ((df.g(str, aVar.a()) || (df.g(str, aVar.c()) && !m(n7VarN))) && !z10) {
            i11 |= 8;
        }
        androidx.compose.ui.window.t tVar = new androidx.compose.ui.window.t(i11, false, false, false, false, false, 62, (DefaultConstructorMarker) null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return tVar;
    }

    private static final boolean m(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }
}
