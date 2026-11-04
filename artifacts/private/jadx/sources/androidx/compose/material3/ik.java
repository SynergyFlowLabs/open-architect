package androidx.compose.material3;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@af
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n113#2:656\n1#3:657\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogWrapper\n*L\n470#1:656\n*E\n"})
final class ik extends androidx.activity.t implements androidx.compose.ui.platform.t4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f28600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private ll f28601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f28602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final View f28603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final gk f28604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f28605i;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    private static final class b extends androidx.activity.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.s0 f28606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f28607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function0<Unit> f28608c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1", f = "ModalBottomSheet.android.kt", i = {}, l = {638}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28609a;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return b.this.new a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28609a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVarE = b.this.e();
                    Float fE = kotlin.coroutines.jvm.internal.b.e(0.0f);
                    this.f28609a = 1;
                    if (androidx.compose.animation.core.c.i(cVarE, fE, null, null, null, this, 14, null) == objL) {
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

        /* JADX INFO: renamed from: androidx.compose.material3.ik$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1", f = "ModalBottomSheet.android.kt", i = {}, l = {627}, m = "invokeSuspend", n = {}, s = {})
        static final class C0222b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28611a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.activity.d f28613c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0222b(androidx.activity.d dVar, kotlin.coroutines.d<? super C0222b> dVar2) {
                super(2, dVar2);
                this.f28613c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return b.this.new C0222b(this.f28613c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28611a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVarE = b.this.e();
                    Float fE = kotlin.coroutines.jvm.internal.b.e(androidx.compose.material3.internal.g3.f28886a.a(this.f28613c.a()));
                    this.f28611a = 1;
                    if (cVarE.C(fE, this) == objL) {
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
                return ((C0222b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1", f = "ModalBottomSheet.android.kt", i = {}, l = {620}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28614a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.activity.d f28616c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(androidx.activity.d dVar, kotlin.coroutines.d<? super c> dVar2) {
                super(2, dVar2);
                this.f28616c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return b.this.new c(this.f28616c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28614a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVarE = b.this.e();
                    Float fE = kotlin.coroutines.jvm.internal.b.e(androidx.compose.material3.internal.g3.f28886a.a(this.f28616c.a()));
                    this.f28614a = 1;
                    if (cVarE.C(fE, this) == objL) {
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
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public b(boolean z10, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, @NotNull Function0<Unit> function0) {
            super(z10);
            this.f28606a = s0Var;
            this.f28607b = cVar;
            this.f28608c = function0;
        }

        @NotNull
        public final Function0<Unit> d() {
            return this.f28608c;
        }

        @NotNull
        public final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> e() {
            return this.f28607b;
        }

        @NotNull
        public final kotlinx.coroutines.s0 f() {
            return this.f28606a;
        }

        public final void g(@NotNull Function0<Unit> function0) {
            this.f28608c = function0;
        }

        @Override // androidx.activity.i0
        public void handleOnBackCancelled() {
            kotlinx.coroutines.k.f(this.f28606a, null, null, new a(null), 3, null);
        }

        @Override // androidx.activity.i0
        public void handleOnBackPressed() {
            this.f28608c.invoke();
        }

        @Override // androidx.activity.i0
        public void handleOnBackProgressed(@NotNull androidx.activity.d dVar) {
            kotlinx.coroutines.k.f(this.f28606a, null, null, new C0222b(dVar, null), 3, null);
        }

        @Override // androidx.activity.i0
        public void handleOnBackStarted(@NotNull androidx.activity.d dVar) {
            kotlinx.coroutines.k.f(this.f28606a, null, null, new c(dVar, null), 3, null);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28617a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28617a = iArr;
        }
    }

    public /* synthetic */ ik(Function0 function0, ll llVar, long j10, View view, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar, UUID uuid, androidx.compose.animation.core.c cVar, kotlinx.coroutines.s0 s0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, llVar, j10, view, wVar, dVar, uuid, cVar, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ik ikVar) {
        ikVar.f28600d.invoke();
        return Unit.f312394a;
    }

    private final void l(androidx.compose.ui.unit.w wVar) {
        gk gkVar = this.f28604h;
        int i10 = c.f28617a[wVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new kotlin.k0();
        }
        gkVar.setLayoutDirection(i11);
    }

    private final void m(androidx.compose.ui.window.u uVar) {
        boolean zP = androidx.compose.material3.internal.v0.p(uVar, rl.p(this.f28603g));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setFlags(zP ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Override // androidx.compose.ui.platform.t4
    @NotNull
    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this.f28604h;
    }

    public final void j() {
        this.f28604h.disposeComposition();
    }

    public final void k(@NotNull androidx.compose.runtime.p0 p0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f28604h.k(p0Var, function2);
    }

    public final void n(@NotNull Function0<Unit> function0, @NotNull ll llVar, long j10, @NotNull androidx.compose.ui.unit.w wVar) {
        this.f28600d = function0;
        this.f28601e = llVar;
        this.f28602f = j10;
        m(llVar.a());
        l(wVar);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f28600d.invoke();
        }
        return zOnTouchEvent;
    }

    private ik(Function0<Unit> function0, ll llVar, long j10, View view, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar, UUID uuid, androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, kotlinx.coroutines.s0 s0Var) {
        super(new ContextThemeWrapper(view.getContext(), ps.c.f31867b), 0, 2, null);
        this.f28600d = function0;
        this.f28601e = llVar;
        this.f28602f = j10;
        this.f28603g = view;
        float fR = androidx.compose.ui.unit.h.r(8);
        this.f28605i = fR;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        androidx.core.view.k2.c(window, false);
        gk gkVar = new gk(getContext(), window);
        gkVar.setTag(androidx.compose.ui.d0.b.H, "Dialog:" + uuid);
        gkVar.setClipChildren(false);
        gkVar.setElevation(dVar.S7(fR));
        gkVar.setOutlineProvider(new a());
        this.f28604h = gkVar;
        setContentView(gkVar);
        androidx.lifecycle.n2.b(gkVar, androidx.lifecycle.n2.a(view));
        androidx.lifecycle.p2.b(gkVar, androidx.lifecycle.p2.a(view));
        androidx.savedstate.r.b(gkVar, androidx.savedstate.r.a(view));
        n(this.f28600d, this.f28601e, this.f28602f, wVar);
        androidx.core.view.v3 v3VarA = androidx.core.view.k2.a(window, window.getDecorView());
        Boolean boolD = this.f28601e.d();
        v3VarA.i(boolD != null ? boolD.booleanValue() : rl.o(this.f28602f));
        Boolean boolC = this.f28601e.c();
        v3VarA.h(boolC != null ? boolC.booleanValue() : rl.o(this.f28602f));
        getOnBackPressedDispatcher().i(this, new b(this.f28601e.b(), s0Var, cVar, new Function0() { // from class: androidx.compose.material3.hk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ik.i(this.f28218a);
            }
        }));
    }
}
