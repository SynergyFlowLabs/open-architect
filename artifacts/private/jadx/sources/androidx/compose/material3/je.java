package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class je implements ca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fa0 f29752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.o<Float> f29753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.g0<Float> f29754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f29755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.a f29758g;

    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,3517:1\n69#2:3518\n69#2:3521\n69#2:3524\n70#3:3519\n70#3:3522\n70#3:3525\n22#4:3520\n22#4:3523\n22#4:3526\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1\n*L\n3318#1:3518\n3340#1:3521\n3341#1:3524\n3318#1:3519\n3340#1:3522\n3341#1:3525\n3318#1:3520\n3340#1:3523\n3341#1:3526\n*E\n"})
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: androidx.compose.material3.je$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0}, l = {3354, 3356}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class C0243a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f29760a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29761b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f29763d;

            C0243a(kotlin.coroutines.d<? super C0243a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f29761b = obj;
                this.f29763d |= Integer.MIN_VALUE;
                return a.this.B0(0L, 0L, this);
            }
        }

        a() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            C0243a c0243a;
            long j12;
            if (dVar instanceof C0243a) {
                c0243a = (C0243a) dVar;
                int i10 = c0243a.f29763d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0243a.f29763d = i10 - Integer.MIN_VALUE;
                } else {
                    c0243a = new C0243a(dVar);
                }
            } else {
                c0243a = new C0243a(dVar);
            }
            C0243a c0243a2 = c0243a;
            Object objB0 = c0243a2.f29761b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c0243a2.f29763d;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = c0243a2.f29760a;
                    ResultKt.m(objB0);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j12 = c0243a2.f29760a;
                    ResultKt.m(objB0);
                }
                return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.q(j12, ((androidx.compose.ui.unit.c0) objB0).v()));
            }
            ResultKt.m(objB0);
            if (androidx.compose.ui.unit.c0.n(j11) > 0.0f && (je.this.getState().h() == 0.0f || je.this.getState().h() == je.this.getState().i())) {
                je.this.getState().k(0.0f);
            }
            c0243a2.f29760a = j11;
            c0243a2.f29763d = 1;
            objB0 = super.B0(j10, j11, c0243a2);
            if (objB0 != objL) {
            }
            return objL;
            long jV = ((androidx.compose.ui.unit.c0) objB0).v();
            fa0 state = je.this.getState();
            float fN = androidx.compose.ui.unit.c0.n(j11);
            androidx.compose.animation.core.g0<Float> g0VarD = je.this.d();
            androidx.compose.animation.core.o<Float> oVarC = je.this.c();
            c0243a2.f29760a = jV;
            c0243a2.f29763d = 2;
            objB0 = o1.h1(state, fN, g0VarD, oVarC, c0243a2);
            if (objB0 != objL) {
                j12 = jV;
                return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.q(j12, ((androidx.compose.ui.unit.c0) objB0).v()));
            }
            return objL;
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            if (!je.this.g().invoke().booleanValue()) {
                return n0.g.f332700b.e();
            }
            float fH = je.this.getState().h();
            fa0 state = je.this.getState();
            state.l(state.h() + Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10)));
            if (!je.this.h() && fH != je.this.getState().h()) {
                return n0.g.i(j10, 0.0f, 0.0f, 2, null);
            }
            return n0.g.f332700b.e();
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            if (!je.this.g().invoke().booleanValue()) {
                return n0.g.f332700b.e();
            }
            fa0 state = je.this.getState();
            float fG = state.g();
            int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            state.k(fG + Float.intBitsToFloat(i11));
            if (!je.this.h()) {
                fa0 state2 = je.this.getState();
                state2.l(state2.h() + Float.intBitsToFloat(i11));
            }
            return n0.g.f332700b.e();
        }
    }

    public je(@NotNull fa0 fa0Var, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @NotNull Function0<Boolean> function0, boolean z10) {
        this.f29752a = fa0Var;
        this.f29753b = oVar;
        this.f29754c = g0Var;
        this.f29755d = function0;
        this.f29756e = z10;
        this.f29758g = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return true;
    }

    @Override // androidx.compose.material3.ca0
    @NotNull
    public androidx.compose.ui.input.nestedscroll.a a() {
        return this.f29758g;
    }

    @Override // androidx.compose.material3.ca0
    public boolean b() {
        return this.f29757f;
    }

    @Override // androidx.compose.material3.ca0
    @Nullable
    public androidx.compose.animation.core.o<Float> c() {
        return this.f29753b;
    }

    @Override // androidx.compose.material3.ca0
    @Nullable
    public androidx.compose.animation.core.g0<Float> d() {
        return this.f29754c;
    }

    @NotNull
    public final Function0<Boolean> g() {
        return this.f29755d;
    }

    @Override // androidx.compose.material3.ca0
    @NotNull
    public fa0 getState() {
        return this.f29752a;
    }

    public final boolean h() {
        return this.f29756e;
    }

    public void i(@NotNull androidx.compose.ui.input.nestedscroll.a aVar) {
        this.f29758g = aVar;
    }

    public /* synthetic */ je(fa0 fa0Var, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, Function0 function0, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fa0Var, oVar, g0Var, (i10 & 8) != 0 ? new Function0() { // from class: androidx.compose.material3.ie
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(je.f());
            }
        } : function0, (i10 & 16) != 0 ? false : z10);
    }
}
