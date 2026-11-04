package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ze implements ca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fa0 f35118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.o<Float> f35119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.g0<Float> f35120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f35121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f35122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.a f35123f;

    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,3517:1\n69#2:3518\n69#2:3521\n69#2:3524\n69#2:3527\n69#2:3530\n69#2:3537\n69#2:3540\n70#3:3519\n70#3:3522\n70#3:3525\n70#3:3528\n70#3:3531\n53#3,3:3534\n70#3:3538\n70#3:3541\n53#3,3:3544\n22#4:3520\n22#4:3523\n22#4:3526\n22#4:3529\n22#4:3532\n22#4:3539\n22#4:3542\n30#5:3533\n30#5:3543\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1\n*L\n3390#1:3518\n3393#1:3521\n3409#1:3524\n3411#1:3527\n3414#1:3530\n3418#1:3537\n3422#1:3540\n3390#1:3519\n3393#1:3522\n3409#1:3525\n3411#1:3528\n3414#1:3531\n3415#1:3534,3\n3418#1:3538\n3422#1:3541\n3423#1:3544,3\n3390#1:3520\n3393#1:3523\n3409#1:3526\n3411#1:3529\n3414#1:3532\n3418#1:3539\n3422#1:3542\n3415#1:3533\n3423#1:3543\n*E\n"})
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: androidx.compose.material3.ze$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0}, l = {3434, 3436}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class C0268a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f35125a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f35126b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f35128d;

            C0268a(kotlin.coroutines.d<? super C0268a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f35126b = obj;
                this.f35128d |= Integer.MIN_VALUE;
                return a.this.B0(0L, 0L, this);
            }
        }

        a() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            C0268a c0268a;
            long j12;
            if (dVar instanceof C0268a) {
                c0268a = (C0268a) dVar;
                int i10 = c0268a.f35128d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0268a.f35128d = i10 - Integer.MIN_VALUE;
                } else {
                    c0268a = new C0268a(dVar);
                }
            } else {
                c0268a = new C0268a(dVar);
            }
            C0268a c0268a2 = c0268a;
            Object objB0 = c0268a2.f35126b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c0268a2.f35128d;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = c0268a2.f35125a;
                    ResultKt.m(objB0);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j12 = c0268a2.f35125a;
                    ResultKt.m(objB0);
                }
                return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.q(j12, ((androidx.compose.ui.unit.c0) objB0).v()));
            }
            ResultKt.m(objB0);
            if (androidx.compose.ui.unit.c0.n(j11) > 0.0f) {
                ze.this.getState().k(0.0f);
            }
            c0268a2.f35125a = j11;
            c0268a2.f35128d = 1;
            objB0 = super.B0(j10, j11, c0268a2);
            if (objB0 == objL) {
            }
            return objL;
            long jV = ((androidx.compose.ui.unit.c0) objB0).v();
            fa0 state = ze.this.getState();
            float fN = androidx.compose.ui.unit.c0.n(j11);
            androidx.compose.animation.core.g0<Float> g0VarD = ze.this.d();
            androidx.compose.animation.core.o<Float> oVarC = ze.this.c();
            c0268a2.f35125a = jV;
            c0268a2.f35128d = 2;
            objB0 = o1.h1(state, fN, g0VarD, oVarC, c0268a2);
            if (objB0 != objL) {
                j12 = jV;
                return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.q(j12, ((androidx.compose.ui.unit.c0) objB0).v()));
            }
            return objL;
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            if (ze.this.g().invoke().booleanValue()) {
                int i11 = (int) (com.rabbitmq.client.k0.f265952a & j10);
                if (Float.intBitsToFloat(i11) <= 0.0f) {
                    float fH = ze.this.getState().h();
                    ze.this.getState().l(ze.this.getState().h() + Float.intBitsToFloat(i11));
                    return fH == ze.this.getState().h() ? n0.g.f332700b.e() : n0.g.i(j10, 0.0f, 0.0f, 2, null);
                }
            }
            return n0.g.f332700b.e();
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            if (!ze.this.g().invoke().booleanValue()) {
                return n0.g.f332700b.e();
            }
            fa0 state = ze.this.getState();
            float fG = state.g();
            int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            state.k(fG + Float.intBitsToFloat(i11));
            int i12 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
            if (Float.intBitsToFloat(i12) < 0.0f || Float.intBitsToFloat(i11) < 0.0f) {
                float fH = ze.this.getState().h();
                ze.this.getState().l(ze.this.getState().h() + Float.intBitsToFloat(i11));
                float fH2 = ze.this.getState().h() - fH;
                return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fH2)) & com.rabbitmq.client.k0.f265952a));
            }
            if (Float.intBitsToFloat(i12) <= 0.0f) {
                return n0.g.f332700b.e();
            }
            float fH3 = ze.this.getState().h();
            ze.this.getState().l(ze.this.getState().h() + Float.intBitsToFloat(i12));
            float fH4 = ze.this.getState().h() - fH3;
            return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fH4)) & com.rabbitmq.client.k0.f265952a));
        }
    }

    public ze(@NotNull fa0 fa0Var, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @NotNull Function0<Boolean> function0) {
        this.f35118a = fa0Var;
        this.f35119b = oVar;
        this.f35120c = g0Var;
        this.f35121d = function0;
        this.f35123f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return true;
    }

    @Override // androidx.compose.material3.ca0
    @NotNull
    public androidx.compose.ui.input.nestedscroll.a a() {
        return this.f35123f;
    }

    @Override // androidx.compose.material3.ca0
    public boolean b() {
        return this.f35122e;
    }

    @Override // androidx.compose.material3.ca0
    @Nullable
    public androidx.compose.animation.core.o<Float> c() {
        return this.f35119b;
    }

    @Override // androidx.compose.material3.ca0
    @Nullable
    public androidx.compose.animation.core.g0<Float> d() {
        return this.f35120c;
    }

    @NotNull
    public final Function0<Boolean> g() {
        return this.f35121d;
    }

    @Override // androidx.compose.material3.ca0
    @NotNull
    public fa0 getState() {
        return this.f35118a;
    }

    public void h(@NotNull androidx.compose.ui.input.nestedscroll.a aVar) {
        this.f35123f = aVar;
    }

    public /* synthetic */ ze(fa0 fa0Var, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fa0Var, oVar, g0Var, (i10 & 8) != 0 ? new Function0() { // from class: androidx.compose.material3.ye
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ze.f());
            }
        } : function0);
    }
}
