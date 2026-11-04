package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f40600a = a.f40601a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40601a = new a();

        private a() {
        }

        @NotNull
        public final k4 a() {
            return c.f40607b;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b implements k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f40602b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40603c = 0;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f40604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0326b f40605b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, ViewOnAttachStateChangeListenerC0326b viewOnAttachStateChangeListenerC0326b) {
                super(0);
                this.f40604a = aVar;
                this.f40605b = viewOnAttachStateChangeListenerC0326b;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f40604a.removeOnAttachStateChangeListener(this.f40605b);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.k4$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0326b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f40606a;

            ViewOnAttachStateChangeListenerC0326b(androidx.compose.ui.platform.a aVar) {
                this.f40606a = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.f40606a.disposeComposition();
            }
        }

        private b() {
        }

        @Override // androidx.compose.ui.platform.k4
        @NotNull
        public Function0<Unit> a(@NotNull androidx.compose.ui.platform.a aVar) {
            ViewOnAttachStateChangeListenerC0326b viewOnAttachStateChangeListenerC0326b = new ViewOnAttachStateChangeListenerC0326b(aVar);
            aVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0326b);
            return new a(aVar, viewOnAttachStateChangeListenerC0326b);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class c implements k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f40607b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40608c = 0;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f40609a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f40610b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.customview.poolingcontainer.b f40611c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, b bVar, androidx.customview.poolingcontainer.b bVar2) {
                super(0);
                this.f40609a = aVar;
                this.f40610b = bVar;
                this.f40611c = bVar2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f40609a.removeOnAttachStateChangeListener(this.f40610b);
                androidx.customview.poolingcontainer.a.g(this.f40609a, this.f40611c);
            }
        }

        public static final class b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f40612a;

            b(androidx.compose.ui.platform.a aVar) {
                this.f40612a = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (androidx.customview.poolingcontainer.a.f(this.f40612a)) {
                    return;
                }
                this.f40612a.disposeComposition();
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(androidx.compose.ui.platform.a aVar) {
            aVar.disposeComposition();
        }

        @Override // androidx.compose.ui.platform.k4
        @NotNull
        public Function0<Unit> a(@NotNull final androidx.compose.ui.platform.a aVar) {
            b bVar = new b(aVar);
            aVar.addOnAttachStateChangeListener(bVar);
            androidx.customview.poolingcontainer.b bVar2 = new androidx.customview.poolingcontainer.b() { // from class: androidx.compose.ui.platform.l4
                @Override // androidx.customview.poolingcontainer.b
                public final void c() {
                    k4.c.c(aVar);
                }
            };
            androidx.customview.poolingcontainer.a.a(aVar, bVar2);
            return new a(aVar, bVar, bVar2);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class d implements k4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40613c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.lifecycle.c0 f40614b;

        public d(@NotNull androidx.lifecycle.c0 c0Var) {
            this.f40614b = c0Var;
        }

        @Override // androidx.compose.ui.platform.k4
        @NotNull
        public Function0<Unit> a(@NotNull androidx.compose.ui.platform.a aVar) {
            return n4.c(aVar, this.f40614b);
        }

        public d(@NotNull androidx.lifecycle.o0 o0Var) {
            this(o0Var.getLifecycle());
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nViewCompositionStrategy.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,197:1\n78#2,5:198\n*S KotlinDebug\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed\n*L\n154#1:198,5\n*E\n"})
    public static final class e implements k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f40615b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40616c = 0;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f40617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f40618b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, c cVar) {
                super(0);
                this.f40617a = aVar;
                this.f40618b = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f40617a.removeOnAttachStateChangeListener(this.f40618b);
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<Function0<Unit>> f40619a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.i1.h<Function0<Unit>> hVar) {
                super(0);
                this.f40619a = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f40619a.f312751a.invoke();
            }
        }

        @SourceDebugExtension({"SMAP\nViewCompositionStrategy.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,197:1\n78#2,5:198\n*S KotlinDebug\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1\n*L\n165#1:198,5\n*E\n"})
        public static final class c implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f40620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<Function0<Unit>> f40621b;

            c(androidx.compose.ui.platform.a aVar, kotlin.jvm.internal.i1.h<Function0<Unit>> hVar) {
                this.f40620a = aVar;
                this.f40621b = hVar;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [T, kotlin.jvm.functions.Function0] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                androidx.lifecycle.o0 o0VarA = androidx.lifecycle.n2.a(this.f40620a);
                androidx.compose.ui.platform.a aVar = this.f40620a;
                if (o0VarA != null) {
                    this.f40621b.f312751a = n4.c(aVar, o0VarA.getLifecycle());
                    this.f40620a.removeOnAttachStateChangeListener(this);
                } else {
                    s0.a.j("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
                    throw new kotlin.a0();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        }

        private e() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.platform.k4$e$a] */
        @Override // androidx.compose.ui.platform.k4
        @NotNull
        public Function0<Unit> a(@NotNull androidx.compose.ui.platform.a aVar) {
            if (!aVar.isAttachedToWindow()) {
                kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                c cVar = new c(aVar, hVar);
                aVar.addOnAttachStateChangeListener(cVar);
                hVar.f312751a = new a(aVar, cVar);
                return new b(hVar);
            }
            androidx.lifecycle.o0 o0VarA = androidx.lifecycle.n2.a(aVar);
            if (o0VarA != null) {
                return n4.c(aVar, o0VarA.getLifecycle());
            }
            s0.a.j("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
            throw new kotlin.a0();
        }
    }

    @NotNull
    Function0<Unit> a(@NotNull androidx.compose.ui.platform.a aVar);
}
