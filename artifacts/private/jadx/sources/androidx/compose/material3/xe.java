package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class xe implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t2 f34468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.o<Float> f34469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.g0<Float> f34470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f34471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f34472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.a f34473f;

    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,3517:1\n69#2:3518\n69#2:3521\n70#3:3519\n70#3:3522\n22#4:3520\n22#4:3523\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1\n*L\n2380#1:3518\n2381#1:3521\n2380#1:3519\n2381#1:3522\n2380#1:3520\n2381#1:3523\n*E\n"})
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: androidx.compose.material3.xe$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0}, l = {2394, 2396}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class C0265a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f34475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34476b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f34478d;

            C0265a(kotlin.coroutines.d<? super C0265a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34476b = obj;
                this.f34478d |= Integer.MIN_VALUE;
                return a.this.B0(0L, 0L, this);
            }
        }

        a() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            C0265a c0265a;
            long j12;
            if (dVar instanceof C0265a) {
                c0265a = (C0265a) dVar;
                int i10 = c0265a.f34478d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0265a.f34478d = i10 - Integer.MIN_VALUE;
                } else {
                    c0265a = new C0265a(dVar);
                }
            } else {
                c0265a = new C0265a(dVar);
            }
            C0265a c0265a2 = c0265a;
            Object objB0 = c0265a2.f34476b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c0265a2.f34478d;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = c0265a2.f34475a;
                    ResultKt.m(objB0);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j12 = c0265a2.f34475a;
                    ResultKt.m(objB0);
                }
                return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.q(j12, ((androidx.compose.ui.unit.c0) objB0).v()));
            }
            ResultKt.m(objB0);
            if (androidx.compose.ui.unit.c0.n(j11) > 0.0f && (xe.this.getState().d() == 0.0f || xe.this.getState().d() == xe.this.getState().b())) {
                xe.this.getState().f(0.0f);
            }
            c0265a2.f34475a = j11;
            c0265a2.f34478d = 1;
            objB0 = super.B0(j10, j11, c0265a2);
            if (objB0 != objL) {
            }
            return objL;
            long jV = ((androidx.compose.ui.unit.c0) objB0).v();
            t2 state = xe.this.getState();
            float fN = androidx.compose.ui.unit.c0.n(j11);
            androidx.compose.animation.core.g0<Float> g0VarD = xe.this.d();
            androidx.compose.animation.core.o<Float> oVarC = xe.this.c();
            c0265a2.f34475a = jV;
            c0265a2.f34478d = 2;
            objB0 = o1.k1(state, fN, g0VarD, oVarC, c0265a2);
            if (objB0 != objL) {
                j12 = jV;
                return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.q(j12, ((androidx.compose.ui.unit.c0) objB0).v()));
            }
            return objL;
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            if (!xe.this.g().invoke().booleanValue()) {
                return n0.g.f332700b.e();
            }
            t2 state = xe.this.getState();
            float fE = state.e();
            int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            state.f(fE + Float.intBitsToFloat(i11));
            xe.this.getState().c(xe.this.getState().d() + Float.intBitsToFloat(i11));
            return n0.g.f332700b.e();
        }
    }

    public xe(@NotNull t2 t2Var, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @NotNull Function0<Boolean> function0) {
        this.f34468a = t2Var;
        this.f34469b = oVar;
        this.f34470c = g0Var;
        this.f34471d = function0;
        this.f34473f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return true;
    }

    @Override // androidx.compose.material3.q2
    @NotNull
    public androidx.compose.ui.input.nestedscroll.a a() {
        return this.f34473f;
    }

    @Override // androidx.compose.material3.q2
    public boolean b() {
        return this.f34472e;
    }

    @Override // androidx.compose.material3.q2
    @Nullable
    public androidx.compose.animation.core.o<Float> c() {
        return this.f34469b;
    }

    @Override // androidx.compose.material3.q2
    @Nullable
    public androidx.compose.animation.core.g0<Float> d() {
        return this.f34470c;
    }

    @NotNull
    public final Function0<Boolean> g() {
        return this.f34471d;
    }

    @Override // androidx.compose.material3.q2
    @NotNull
    public t2 getState() {
        return this.f34468a;
    }

    public void h(@NotNull androidx.compose.ui.input.nestedscroll.a aVar) {
        this.f34473f = aVar;
    }

    public /* synthetic */ xe(t2 t2Var, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(t2Var, oVar, g0Var, (i10 & 8) != 0 ? new Function0() { // from class: androidx.compose.material3.we
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(xe.f());
            }
        } : function0);
    }
}
