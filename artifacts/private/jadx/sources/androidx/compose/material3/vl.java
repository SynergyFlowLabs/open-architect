package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWideNavigationRail.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/ModalWideNavigationRailDialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,487:1\n85#2:488\n117#2,2:489\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/ModalWideNavigationRailDialogLayout\n*L\n186#1:488\n186#1:489,2\n*E\n"})
final class vl extends androidx.compose.ui.platform.a implements androidx.compose.ui.window.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f33960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f33962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Unit> f33963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f33964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final vs f33965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f33966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f33967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Object f33968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33969j;

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(33)
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f33970a = new a();

        private a() {
        }

        @oj.n
        @androidx.annotation.u
        @NotNull
        public static final OnBackInvokedCallback b(@NotNull final Function0<Unit> function0) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.ul
                public final void onBackInvoked() {
                    vl.a.c(function0);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 function0) {
            function0.invoke();
        }

        @oj.n
        @androidx.annotation.u
        public static final void d(@NotNull View view, @Nullable Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
            }
        }

        @oj.n
        @androidx.annotation.u
        public static final void e(@NotNull View view, @Nullable Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    @androidx.annotation.w0(34)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f33971a = new b();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ vs f33972a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.unit.w f33973b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Float, Unit> f33974c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f33975d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f33976e;

            /* JADX WARN: Multi-variable type inference failed */
            a(vs vsVar, androidx.compose.ui.unit.w wVar, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function0<Unit> function2) {
                this.f33972a = vsVar;
                this.f33973b = wVar;
                this.f33974c = function1;
                this.f33975d = function0;
                this.f33976e = function2;
            }

            public void onBackCancelled() {
                this.f33976e.invoke();
            }

            public void onBackInvoked() {
                this.f33975d.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                this.f33972a.c(backEvent.getSwipeEdge() == 0, this.f33973b == androidx.compose.ui.unit.w.Rtl);
                this.f33974c.invoke(Float.valueOf(androidx.compose.material3.internal.g3.f28886a.a(backEvent.getProgress())));
            }

            public void onBackStarted(BackEvent backEvent) {
                this.f33972a.c(backEvent.getSwipeEdge() == 0, this.f33973b == androidx.compose.ui.unit.w.Rtl);
                this.f33974c.invoke(Float.valueOf(androidx.compose.material3.internal.g3.f28886a.a(backEvent.getProgress())));
            }
        }

        private b() {
        }

        @oj.n
        @androidx.annotation.u
        @NotNull
        public static final OnBackAnimationCallback a(@NotNull Function0<Unit> function0, @NotNull Function1<? super Float, Unit> function1, @NotNull Function0<Unit> function2, @NotNull vs vsVar, @NotNull androidx.compose.ui.unit.w wVar) {
            return new a(vsVar, wVar, function1, function0, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vl(@NotNull Context context, @NotNull Window window, boolean z10, @NotNull Function0<Unit> function0, @NotNull Function1<? super Float, Unit> function1, @NotNull Function0<Unit> function2, @NotNull vs vsVar, @NotNull androidx.compose.ui.unit.w wVar) {
        super(context, null, 0, 6, null);
        this.f33960a = window;
        this.f33961b = z10;
        this.f33962c = function0;
        this.f33963d = function1;
        this.f33964e = function2;
        this.f33965f = vsVar;
        this.f33966g = wVar;
        this.f33967h = androidx.compose.runtime.d7.g(b7.f26219a.a(), null, 2, null);
    }

    private final Function2<androidx.compose.runtime.c0, Integer, Unit> getContent() {
        return (Function2) this.f33967h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(vl vlVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vlVar.Content(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private final void l() {
        int i10;
        if (!this.f33961b || (i10 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f33968i == null) {
            this.f33968i = i10 >= 34 ? b.a(this.f33962c, this.f33963d, this.f33964e, this.f33965f, this.f33966g) : a.b(this.f33962c);
        }
        a.d(this, this.f33968i);
    }

    private final void m() {
        if (Build.VERSION.SDK_INT >= 33) {
            a.e(this, this.f33968i);
        }
        this.f33968i = null;
    }

    private final void setContent(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f33967h.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    public void Content(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-640057148);
        if ((i10 & 6) == 0) {
            if (c0VarR.k0(this)) {
                i12 = 4;
                int i13 = 5 << 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-640057148, i11, -1, "androidx.compose.material3.ModalWideNavigationRailDialogLayout.Content (WideNavigationRail.android.kt:202)");
            }
            getContent().invoke(c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.tl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vl.j(this.f33214a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f33969j;
    }

    @Override // androidx.compose.ui.window.l
    @NotNull
    public Window getWindow() {
        return this.f33960a;
    }

    public final boolean k() {
        return this.f33961b;
    }

    public final void n(@NotNull androidx.compose.runtime.p0 p0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        setParentCompositionContext(p0Var);
        setContent(function2);
        this.f33969j = true;
        createComposition();
    }

    @Override // androidx.compose.ui.platform.a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }
}
