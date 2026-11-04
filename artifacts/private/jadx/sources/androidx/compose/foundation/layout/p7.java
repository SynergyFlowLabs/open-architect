package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(30)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n318#2,11:709\n65#3:720\n69#3:723\n65#3:725\n69#3:728\n60#4:721\n70#4:724\n60#4:726\n70#4:729\n22#5:722\n22#5:727\n26#5:730\n26#5:731\n26#5:732\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n202#1:709,11\n209#1:720\n209#1:723\n216#1:725\n216#1:728\n209#1:721\n209#1:724\n216#1:726\n216#1:729\n209#1:722\n216#1:727\n256#1:730\n257#1:731\n370#1:732\n*E\n"})
final class p7 implements androidx.compose.ui.input.nestedscroll.a, WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f16278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final View f16279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h6 f16280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f16281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private WindowInsetsAnimationController f16282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final CancellationSignal f16284g = new CancellationSignal();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f16285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f16286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.n<? super WindowInsetsAnimationController> f16287j;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 1, 1, 2}, l = {301, 327, 352}, m = "fling-huYlsQE", n = {"available", "flingAmount", "endVelocity", "available", "available"}, s = {"J$0", "F$0", "L$0", "J$0", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f16288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f16289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f16290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16291d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16293f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16291d = obj;
            this.f16293f |= Integer.MIN_VALUE;
            return p7.this.q(0L, 0.0f, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16295b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f16297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f16298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o6 f16299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f16300g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f16301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f16302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f16303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f16304k;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f16306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f16307c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ o6 f16308d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f16309e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f16310f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p7 f16311g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f16312h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ WindowInsetsAnimationController f16313i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f16314j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, float f10, o6 o6Var, int i11, int i12, p7 p7Var, kotlin.jvm.internal.i1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f16306b = i10;
                this.f16307c = f10;
                this.f16308d = o6Var;
                this.f16309e = i11;
                this.f16310f = i12;
                this.f16311g = p7Var;
                this.f16312h = eVar;
                this.f16313i = windowInsetsAnimationController;
                this.f16314j = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(int i10, int i11, p7 p7Var, kotlin.jvm.internal.i1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, float f10, float f11) {
                float f12 = i10;
                if (f10 > i11 || f12 > f10) {
                    eVar.f312748a = f11;
                    windowInsetsAnimationController.finish(z10);
                    p7Var.f16282e = null;
                    kotlinx.coroutines.p2 p2Var = p7Var.f16286i;
                    if (p2Var != null) {
                        p2Var.e(new w6());
                    }
                } else {
                    p7Var.l(f10);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f16306b, this.f16307c, this.f16308d, this.f16309e, this.f16310f, this.f16311g, this.f16312h, this.f16313i, this.f16314j, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f16305a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    float f10 = this.f16306b;
                    float f11 = this.f16307c;
                    o6 o6Var = this.f16308d;
                    final int i11 = this.f16309e;
                    final int i12 = this.f16310f;
                    final p7 p7Var = this.f16311g;
                    final kotlin.jvm.internal.i1.e eVar = this.f16312h;
                    final WindowInsetsAnimationController windowInsetsAnimationController = this.f16313i;
                    final boolean z10 = this.f16314j;
                    Function2 function2 = new Function2() { // from class: androidx.compose.foundation.layout.q7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return p7.b.a.m(i11, i12, p7Var, eVar, windowInsetsAnimationController, z10, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f16305a = 1;
                    if (androidx.compose.animation.core.f3.x(f10, f11, o6Var, function2, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, float f10, o6 o6Var, int i11, int i12, kotlin.jvm.internal.i1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f16297d = i10;
            this.f16298e = f10;
            this.f16299f = o6Var;
            this.f16300g = i11;
            this.f16301h = i12;
            this.f16302i = eVar;
            this.f16303j = windowInsetsAnimationController;
            this.f16304k = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = p7.this.new b(this.f16297d, this.f16298e, this.f16299f, this.f16300g, this.f16301h, this.f16302i, this.f16303j, this.f16304k, dVar);
            bVar.f16295b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f16294a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f16295b;
                p7 p7Var = p7.this;
                p7Var.f16286i = kotlinx.coroutines.k.f(s0Var, null, null, new a(this.f16297d, this.f16298e, this.f16299f, this.f16300g, this.f16301h, p7Var, this.f16302i, this.f16303j, this.f16304k, null), 3, null);
                kotlinx.coroutines.p2 p2Var = p7.this.f16286i;
                if (p2Var != null) {
                    this.f16294a = 1;
                    if (p2Var.d1(this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            p7.this.f16286i = null;
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16316b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f16318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f16319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f16320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f16321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f16322h;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f16324b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f16325c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f16326d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ WindowInsetsAnimationController f16327e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f16328f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p7 f16329g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, p7 p7Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f16324b = i10;
                this.f16325c = i11;
                this.f16326d = f10;
                this.f16327e = windowInsetsAnimationController;
                this.f16328f = z10;
                this.f16329g = p7Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(p7 p7Var, androidx.compose.animation.core.c cVar) {
                p7Var.l(((Number) cVar.v()).floatValue());
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f16324b, this.f16325c, this.f16326d, this.f16327e, this.f16328f, this.f16329g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f16323a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVarB = androidx.compose.animation.core.d.b(this.f16324b, 0.0f, 2, null);
                    Float fE = kotlin.coroutines.jvm.internal.b.e(this.f16325c);
                    Float fE2 = kotlin.coroutines.jvm.internal.b.e(this.f16326d);
                    final p7 p7Var = this.f16329g;
                    Function1 function1 = new Function1() { // from class: androidx.compose.foundation.layout.r7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return p7.c.a.m(p7Var, (androidx.compose.animation.core.c) obj2);
                        }
                    };
                    this.f16323a = 1;
                    aVar = this;
                    if (androidx.compose.animation.core.c.i(cVarB, fE, null, fE2, function1, aVar, 2, null) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    aVar = this;
                }
                aVar.f16327e.finish(aVar.f16328f);
                aVar.f16329g.f16282e = null;
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f16318d = i10;
            this.f16319e = i11;
            this.f16320f = f10;
            this.f16321g = windowInsetsAnimationController;
            this.f16322h = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = p7.this.new c(this.f16318d, this.f16319e, this.f16320f, this.f16321g, this.f16322h, dVar);
            cVar.f16316b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f16315a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f16316b;
            p7 p7Var = p7.this;
            p7Var.f16286i = kotlinx.coroutines.k.f(s0Var, null, null, new a(this.f16318d, this.f16319e, this.f16320f, this.f16321g, this.f16322h, p7Var, null), 3, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public p7(@NotNull h hVar, @NotNull View view, @NotNull h6 h6Var, @NotNull androidx.compose.ui.unit.d dVar) {
        this.f16278a = hVar;
        this.f16279b = view;
        this.f16280c = h6Var;
        this.f16281d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(float f10) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f16282e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.f16280c.e(windowInsetsAnimationController.getCurrentInsets(), Math.round(f10)), 1.0f, 0.0f);
        }
    }

    private final void m() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f16282e;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.f16282e) != null) {
            windowInsetsAnimationController.finish(this.f16278a.g());
        }
        this.f16282e = null;
        kotlinx.coroutines.n<? super WindowInsetsAnimationController> nVar = this.f16287j;
        if (nVar != null) {
            nVar.M(null, new Function1() { // from class: androidx.compose.foundation.layout.m7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p7.n((Throwable) obj);
                }
            });
        }
        this.f16287j = null;
        kotlinx.coroutines.p2 p2Var = this.f16286i;
        if (p2Var != null) {
            p2Var.e(new w6());
        }
        this.f16286i = null;
        this.f16285h = 0.0f;
        this.f16283f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Throwable th2) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Throwable th2) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public final Object q(long j10, float f10, boolean z10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        a aVar;
        Object objR;
        long j11;
        kotlin.jvm.internal.i1.e eVar;
        long j12;
        long j13;
        float f11 = f10;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f16293f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f16293f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f16291d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f16293f;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.p2 p2Var = this.f16286i;
            if (p2Var != null) {
                p2Var.e(new w6());
            }
            this.f16286i = null;
            this.f16285h = 0.0f;
            if ((f11 == 0.0f && !z10) || (this.f16282e == null && this.f16278a.g() == z10)) {
                return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.f42681b.a());
            }
            aVar2.f16288a = j10;
            aVar2.f16289b = f11;
            aVar2.f16293f = 1;
            objR = r(aVar2);
            if (objR != objL) {
                j11 = j10;
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                j12 = aVar2.f16288a;
                eVar = (kotlin.jvm.internal.i1.e) aVar2.f16290c;
                ResultKt.m(obj);
                return androidx.compose.ui.unit.c0.b(this.f16280c.g(j12, eVar.f312748a));
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = aVar2.f16288a;
            ResultKt.m(obj);
            return androidx.compose.ui.unit.c0.b(this.f16280c.g(j13, 0.0f));
        }
        f11 = aVar2.f16289b;
        j11 = aVar2.f16288a;
        ResultKt.m(obj);
        objR = obj;
        float f12 = f11;
        WindowInsetsAnimationController windowInsetsAnimationControllerA = h7.a(objR);
        if (windowInsetsAnimationControllerA == null) {
            return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.f42681b.a());
        }
        int iF = this.f16280c.f(windowInsetsAnimationControllerA.getHiddenStateInsets());
        int iF2 = this.f16280c.f(windowInsetsAnimationControllerA.getShownStateInsets());
        int iF3 = this.f16280c.f(windowInsetsAnimationControllerA.getCurrentInsets());
        if ((f12 <= 0.0f && iF3 == iF) || (f12 >= 0.0f && iF3 == iF2)) {
            windowInsetsAnimationControllerA.finish(iF3 == iF2);
            this.f16282e = null;
            return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.f42681b.a());
        }
        o6 o6Var = new o6(this.f16281d);
        float f13 = iF3 + o6Var.f(f12);
        float f14 = iF;
        boolean z11 = (f13 - f14) / ((float) (iF2 - iF)) > 0.5f;
        int i12 = z11 ? iF2 : iF;
        if (f13 > iF2 || f13 < f14) {
            boolean z12 = z11;
            kotlin.jvm.internal.i1.e eVar2 = new kotlin.jvm.internal.i1.e();
            b bVar = new b(iF3, f12, o6Var, iF, iF2, eVar2, windowInsetsAnimationControllerA, z12, null);
            aVar2.f16290c = eVar2;
            aVar2.f16288a = j11;
            aVar2.f16293f = 2;
            if (kotlinx.coroutines.t0.g(bVar, aVar2) != objL) {
                eVar = eVar2;
                j12 = j11;
                return androidx.compose.ui.unit.c0.b(this.f16280c.g(j12, eVar.f312748a));
            }
        } else {
            c cVar = new c(iF3, i12, f12, windowInsetsAnimationControllerA, z11, null);
            aVar2.f16288a = j11;
            aVar2.f16293f = 3;
            if (kotlinx.coroutines.t0.g(cVar, aVar2) != objL) {
                j13 = j11;
                return androidx.compose.ui.unit.c0.b(this.f16280c.g(j13, 0.0f));
            }
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(kotlin.coroutines.d<? super WindowInsetsAnimationController> dVar) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f16282e;
        if (windowInsetsAnimationController != null) {
            return windowInsetsAnimationController;
        }
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        this.f16287j = pVar;
        x();
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Throwable th2) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        if (this.f16283f) {
            return;
        }
        this.f16283f = true;
        WindowInsetsController windowInsetsController = this.f16279b.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.f16278a.f(), -1L, null, this.f16284g, f7.a(this));
        }
    }

    private final long y(long j10, float f10) {
        kotlinx.coroutines.p2 p2Var = this.f16286i;
        if (p2Var != null) {
            p2Var.e(new w6());
            this.f16286i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f16282e;
        if (f10 != 0.0f) {
            if (this.f16278a.g() != (f10 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f16285h = 0.0f;
                    x();
                    return this.f16280c.c(j10);
                }
                int iF = this.f16280c.f(windowInsetsAnimationController.getHiddenStateInsets());
                int iF2 = this.f16280c.f(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iF3 = this.f16280c.f(currentInsets);
                if (iF3 == (f10 > 0.0f ? iF2 : iF)) {
                    this.f16285h = 0.0f;
                    return n0.g.f332700b.e();
                }
                float f11 = iF3 + f10 + this.f16285h;
                int I = kotlin.ranges.r.I(Math.round(f11), iF, iF2);
                this.f16285h = f11 - Math.round(f11);
                if (I != iF3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f16280c.e(currentInsets, I), 1.0f, 0.0f);
                }
                return this.f16280c.c(j10);
            }
        }
        return n0.g.f332700b.e();
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object B0(long j10, long j11, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        return q(j11, this.f16280c.a(androidx.compose.ui.unit.c0.l(j11), androidx.compose.ui.unit.c0.n(j11)), true, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long G7(long j10, int i10) {
        return y(j10, this.f16280c.b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object a4(long j10, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        return q(j10, this.f16280c.b(androidx.compose.ui.unit.c0.l(j10), androidx.compose.ui.unit.c0.n(j10)), false, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        return y(j11, this.f16280c.a(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j11))));
    }

    public final void o() {
        kotlinx.coroutines.n<? super WindowInsetsAnimationController> nVar = this.f16287j;
        if (nVar != null) {
            nVar.M(null, new Function1() { // from class: androidx.compose.foundation.layout.n7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p7.p((Throwable) obj);
                }
            });
        }
        kotlinx.coroutines.p2 p2Var = this.f16286i;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f16282e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    public void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
        m();
    }

    public void onFinished(@NotNull WindowInsetsAnimationController windowInsetsAnimationController) {
        m();
    }

    public void onReady(@NotNull WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
        this.f16282e = windowInsetsAnimationController;
        this.f16283f = false;
        kotlinx.coroutines.n<? super WindowInsetsAnimationController> nVar = this.f16287j;
        if (nVar != null) {
            nVar.M(windowInsetsAnimationController, new Function1() { // from class: androidx.compose.foundation.layout.o7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p7.w((Throwable) obj);
                }
            });
        }
        this.f16287j = null;
    }

    @NotNull
    public final androidx.compose.ui.unit.d s() {
        return this.f16281d;
    }

    @NotNull
    public final h6 t() {
        return this.f16280c;
    }

    @NotNull
    public final View u() {
        return this.f16279b;
    }

    @NotNull
    public final h v() {
        return this.f16278a;
    }
}
