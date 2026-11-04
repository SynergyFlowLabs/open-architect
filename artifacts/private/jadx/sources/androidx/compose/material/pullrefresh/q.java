package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.f3;
import androidx.compose.foundation.s3;
import androidx.compose.material.u7;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@u7
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,241:1\n85#2:242\n85#2:243\n117#2,2:244\n81#3:246\n114#3,2:247\n81#3:249\n114#3,2:250\n81#3:252\n114#3,2:253\n81#3:255\n114#3,2:256\n65#4,10:258\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n128#1:242\n130#1:243\n130#1:244,2\n131#1:246\n131#1:247,2\n132#1:249\n132#1:250,2\n133#1:252\n133#1:253,2\n134#1:255\n134#1:256,2\n211#1:258,10\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f24339j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s0 f24340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n7<Function0<Unit>> f24341b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final k3 f24346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final k3 f24347h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n7 f24342c = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Float.valueOf(q.e(this.f24337a));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f24343d = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k3 f24344e = g4.b(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final k3 f24345f = g4.b(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final s3 f24348i = new s3();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24349a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f24351c;

        /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.q$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
        static final class C0190a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24352a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f24353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f24354c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0190a(q qVar, float f10, kotlin.coroutines.d<? super C0190a> dVar) {
                super(1, dVar);
                this.f24353b = qVar;
                this.f24354c = f10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(q qVar, float f10, float f11) {
                qVar.x(f10);
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new C0190a(this.f24353b, this.f24354c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24352a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    float fN = this.f24353b.n();
                    float f10 = this.f24354c;
                    final q qVar = this.f24353b;
                    Function2 function2 = new Function2() { // from class: androidx.compose.material.pullrefresh.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return q.a.C0190a.m(qVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f24352a = 1;
                    if (f3.o(fN, f10, 0.0f, null, function2, this, 12, null) == objL) {
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

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0190a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f24351c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new a(this.f24351c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24349a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s3 s3Var = q.this.f24348i;
                C0190a c0190a = new C0190a(q.this, this.f24351c, null);
                this.f24349a = 1;
                if (s3.e(s3Var, null, c0190a, this, 1, null) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull s0 s0Var, @NotNull n7<? extends Function0<Unit>> n7Var, float f10, float f11) {
        this.f24340a = s0Var;
        this.f24341b = n7Var;
        this.f24346g = g4.b(f11);
        this.f24347h = g4.b(f10);
    }

    private final void A(float f10) {
        this.f24346g.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(q qVar) {
        return qVar.i() * 0.5f;
    }

    private final p2 f(float f10) {
        int i10 = 3 >> 0;
        return kotlinx.coroutines.k.f(this.f24340a, null, null, new a(f10, null), 3, null);
    }

    private final float g() {
        if (h() <= m()) {
            return h();
        }
        float fAbs = Math.abs(k()) - 1.0f;
        if (fAbs < 0.0f) {
            fAbs = 0.0f;
        }
        if (fAbs > 2.0f) {
            fAbs = 2.0f;
        }
        return m() + (m() * (fAbs - (((float) Math.pow(fAbs, 2)) / 4)));
    }

    private final float h() {
        return ((Number) this.f24342c.getValue()).floatValue();
    }

    private final float i() {
        return this.f24345f.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float n() {
        return this.f24344e.V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean o() {
        return ((Boolean) this.f24343d.getValue()).booleanValue();
    }

    private final float p() {
        return this.f24347h.V0();
    }

    private final float q() {
        return this.f24346g.V0();
    }

    private final void t(float f10) {
        this.f24345f.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(float f10) {
        this.f24344e.q(f10);
    }

    private final void y(boolean z10) {
        this.f24343d.setValue(Boolean.valueOf(z10));
    }

    private final void z(float f10) {
        this.f24347h.q(f10);
    }

    public final float j() {
        return n();
    }

    public final float k() {
        return h() / m();
    }

    public final boolean l() {
        return o();
    }

    public final float m() {
        return q();
    }

    public final float r(float f10) {
        if (o()) {
            return 0.0f;
        }
        float fT = kotlin.ranges.r.t(i() + f10, 0.0f);
        float fI = fT - i();
        t(fT);
        x(g());
        return fI;
    }

    public final float s(float f10) {
        if (l()) {
            return 0.0f;
        }
        if (h() > m()) {
            this.f24341b.getValue().invoke();
        }
        f(0.0f);
        if (i() == 0.0f || f10 < 0.0f) {
            f10 = 0.0f;
        }
        t(0.0f);
        return f10;
    }

    public final void u(boolean z10) {
        if (o() != z10) {
            y(z10);
            t(0.0f);
            f(z10 ? p() : 0.0f);
        }
    }

    public final void v(float f10) {
        if (p() == f10) {
            return;
        }
        z(f10);
        if (l()) {
            f(f10);
        }
    }

    public final void w(float f10) {
        A(f10);
    }
}
