package androidx.compose.animation;

import androidx.compose.animation.core.t4;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.ui.layout.i2;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,441:1\n136#2:442\n141#2:443\n136#2:447\n136#2:453\n273#3:444\n278#3:445\n273#3:446\n273#3:452\n85#4:448\n117#4,2:449\n150#5:451\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n*L\n295#1:442\n301#1:443\n329#1:447\n411#1:453\n311#1:444\n316#1:445\n329#1:446\n411#1:452\n344#1:448\n344#1:449,2\n405#1:451\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13720j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.c<n0.j, androidx.compose.animation.core.v> f13721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f13723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f13725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f13726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n3 f13727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private List<androidx.compose.ui.layout.g0> f13728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f13729i;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44022w}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<n0.j, androidx.compose.animation.core.v> f13731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0.j f13732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f13733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t f13734e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.animation.core.c<n0.j, androidx.compose.animation.core.v> cVar, n0.j jVar, s sVar, t tVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f13731b = cVar;
            this.f13732c = jVar;
            this.f13733d = sVar;
            this.f13734e = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f13731b, this.f13732c, this.f13733d, this.f13734e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13730a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<n0.j, androidx.compose.animation.core.v> cVar = this.f13731b;
                n0.j jVar = this.f13732c;
                s sVar = this.f13733d;
                n0.j jVarC = this.f13734e.c();
                Intrinsics.checkNotNull(jVarC);
                androidx.compose.animation.core.y0<n0.j> y0VarA = sVar.a(jVarC, this.f13732c);
                this.f13730a = 1;
                if (androidx.compose.animation.core.c.i(cVar, jVar, y0VarA, null, null, this, 12, null) == objL) {
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

    public t() {
        n0.n.a aVar = n0.n.f332724b;
        this.f13722b = aVar.a();
        n0.g.a aVar2 = n0.g.f332700b;
        this.f13723c = aVar2.c();
        this.f13725e = aVar2.c();
        this.f13726f = aVar.a();
        this.f13727g = d7.g(null, null, 2, null);
        this.f13729i = aVar2.e();
    }

    private final n0.j a(kotlinx.coroutines.s0 s0Var, s sVar) {
        n0.j jVarV;
        long j10 = this.f13723c;
        if ((9223372034707292159L & j10) != n0.d.f332689d) {
            long j11 = this.f13722b;
            if (j11 != n0.d.f332689d) {
                n0.j jVarC = n0.k.c(j10, j11);
                androidx.compose.animation.core.c<n0.j, androidx.compose.animation.core.v> cVar = this.f13721a;
                if (cVar == null) {
                    cVar = new androidx.compose.animation.core.c<>(jVarC, t4.S(n0.j.f332705e), null, null, 12, null);
                }
                this.f13721a = cVar;
                if (this.f13724d) {
                    this.f13724d = false;
                    kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new a(cVar, jVarC, sVar, this, null), 1, null);
                }
            }
        }
        androidx.compose.animation.core.c<n0.j, androidx.compose.animation.core.v> cVar2 = this.f13721a;
        return (cVar2 == null || (jVarV = cVar2.v()) == null) ? n0.j.f332705e.a() : jVarV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n0.j b() {
        return (n0.j) this.f13727g.getValue();
    }

    private final void g(n0.j jVar) {
        this.f13727g.setValue(jVar);
    }

    private final void j(long j10) {
        if ((this.f13723c & 9223372034707292159L) != n0.d.f332689d && !androidx.compose.ui.unit.q.k(androidx.compose.ui.unit.r.g(j10), androidx.compose.ui.unit.r.g(this.f13723c))) {
            this.f13724d = true;
        }
        this.f13723c = j10;
        if ((this.f13725e & 9223372034707292159L) == n0.d.f332689d) {
            this.f13725e = j10;
        }
    }

    @Nullable
    public final n0.j c() {
        long j10 = this.f13726f;
        long j11 = this.f13725e;
        if ((9223372034707292159L & j11) == n0.d.f332689d || j10 == n0.d.f332689d) {
            return null;
        }
        return n0.k.c(j11, j10);
    }

    public final long d() {
        return this.f13726f;
    }

    @Nullable
    public final n0.j e() {
        if (f()) {
            return null;
        }
        return b();
    }

    public final boolean f() {
        androidx.compose.animation.core.c<n0.j, androidx.compose.animation.core.v> cVar;
        return !this.f13724d && ((cVar = this.f13721a) == null || !cVar.y());
    }

    public final void h(long j10) {
        this.f13726f = j10;
    }

    public final void i(long j10, long j11) {
        this.f13725e = j10;
        this.f13726f = j11;
    }

    public final void k(@NotNull androidx.compose.ui.layout.w0 w0Var, @NotNull i2.a aVar, @NotNull kotlinx.coroutines.s0 s0Var, boolean z10, boolean z11, @NotNull s sVar) {
        androidx.compose.ui.layout.g0 g0VarN = aVar.n();
        if (g0VarN != null) {
            androidx.compose.ui.layout.g0 g0VarN2 = w0Var.N(aVar);
            long jE = n0.g.f332700b.e();
            if (!z11 && z10) {
                List<androidx.compose.ui.layout.g0> arrayList = this.f13728h;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                int i10 = 0;
                androidx.compose.ui.layout.g0 g0VarS0 = g0VarN;
                while (!Intrinsics.areEqual(w0Var.K(g0VarS0), g0VarN2)) {
                    if (g0VarS0.U()) {
                        if (arrayList.size() == i10) {
                            arrayList.add(g0VarS0);
                            jE = n0.g.w(jE, androidx.compose.ui.layout.h0.e(g0VarS0));
                        } else if (!Intrinsics.areEqual(arrayList.get(i10), g0VarS0)) {
                            long jV = n0.g.v(jE, androidx.compose.ui.layout.h0.e(arrayList.get(i10)));
                            arrayList.set(i10, g0VarS0);
                            jE = n0.g.w(jV, androidx.compose.ui.layout.h0.e(g0VarS0));
                        }
                        i10++;
                    }
                    g0VarS0 = g0VarS0.s0();
                    if (g0VarS0 == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i10 <= size) {
                    while (true) {
                        jE = n0.g.v(jE, androidx.compose.ui.layout.h0.e(arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i10) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.f13728h = arrayList;
            }
            this.f13729i = n0.g.w(this.f13729i, jE);
            j(n0.g.w(androidx.compose.ui.layout.w0.Z(w0Var, g0VarN2, g0VarN, 0L, z11, 2, null), this.f13729i));
            g(a(s0Var, sVar).T(n0.g.g(this.f13729i ^ (-9223372034707292160L))));
        }
    }

    public final void l(long j10) {
        if (this.f13722b != n0.d.f332689d && !androidx.compose.ui.unit.u.h(androidx.compose.ui.unit.v.d(j10), androidx.compose.ui.unit.v.d(this.f13722b))) {
            this.f13724d = true;
        }
        this.f13722b = j10;
        if (this.f13726f == n0.d.f332689d) {
            this.f13726f = j10;
        }
    }
}
