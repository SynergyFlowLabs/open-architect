package androidx.compose.foundation.text;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class z4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21818f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7<Character> f21819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v4 f21820b = new v4(new b(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.internal.t f21821c = new androidx.compose.foundation.text.input.internal.t() { // from class: androidx.compose.foundation.text.x4
        @Override // androidx.compose.foundation.text.input.internal.t
        public final int a(int i10, int i11) {
            return z4.d(this.f21754b, i10, i11);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f21822d = androidx.compose.ui.focus.d.a(androidx.compose.ui.a0.E, new Function1() { // from class: androidx.compose.foundation.text.y4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return z4.e(this.f21786a, (androidx.compose.ui.focus.p0) obj);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Unit> f21823e = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", f = "BasicSecureTextField.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.U1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21824a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z4.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21824a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f21824a = 1;
                if (kotlinx.coroutines.d1.b(1500L, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            z4.this.h().c();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(unit, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, z4.class, "scheduleHide", "scheduleHide()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((z4) this.receiver).j();
        }
    }

    public z4(@NotNull androidx.compose.runtime.n7<Character> n7Var) {
        this.f21819a = n7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(z4 z4Var, int i10, int i11) {
        return i10 == z4Var.f21820b.a() ? i11 : z4Var.f21819a.getValue().charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(z4 z4Var, androidx.compose.ui.focus.p0 p0Var) {
        if (!p0Var.k()) {
            z4Var.f21820b.c();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (kotlinx.coroutines.channels.t.l(this.f21823e.p(Unit.f312394a))) {
            this.f21820b.c();
        }
    }

    @NotNull
    public final androidx.compose.foundation.text.input.internal.t f() {
        return this.f21821c;
    }

    @NotNull
    public final androidx.compose.ui.a0 g() {
        return this.f21822d;
    }

    @NotNull
    public final v4 h() {
        return this.f21820b;
    }

    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = kotlinx.coroutines.flow.k.C(kotlinx.coroutines.flow.k.Z(this.f21823e), new a(null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }
}
