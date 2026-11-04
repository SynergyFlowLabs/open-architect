package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n29#2:747\n29#2:750\n29#2:769\n29#2:773\n29#2:782\n29#2:793\n29#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n375#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13402#7:755\n13403#7:758\n13402#7:777\n13403#7:780\n13402#7:799\n13403#7:802\n426#8,9:760\n435#8,2:771\n426#8,9:784\n435#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
public class p0<T> extends kotlinx.coroutines.flow.internal.b<r0> implements j0<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.r<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f314730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f314731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.j f314732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Object[] f314733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f314734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f314735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f314736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f314737l;

    private static final class a implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final p0<?> f314738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public long f314739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Object f314740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public final kotlin.coroutines.d<Unit> f314741d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull p0<?> p0Var, long j10, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            this.f314738a = p0Var;
            this.f314739b = j10;
            this.f314740c = obj;
            this.f314741d = dVar;
        }

        @Override // kotlinx.coroutines.o1
        public void dispose() {
            this.f314738a.B(this);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f314742a;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.j.values().length];
            try {
                iArr[kotlinx.coroutines.channels.j.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.channels.j.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.channels.j.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f314742a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {387, 394, 397}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f314745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f314746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f314747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p0<T> f314748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f314749g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p0<T> p0Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f314748f = p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314747e = obj;
            this.f314749g |= Integer.MIN_VALUE;
            return p0.D(this.f314748f, null, this);
        }
    }

    public p0(int i10, int i11, @NotNull kotlinx.coroutines.channels.j jVar) {
        this.f314730e = i10;
        this.f314731f = i11;
        this.f314732g = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(r0 r0Var, kotlin.coroutines.d<? super Unit> dVar) {
        Unit unit;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        synchronized (this) {
            try {
                if (X(r0Var) < 0) {
                    r0Var.f314766b = pVar;
                } else {
                    Result.a aVar = Result.Companion;
                    pVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                }
                unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(a aVar) {
        synchronized (this) {
            if (aVar.f314739b < N()) {
                return;
            }
            Object[] objArr = this.f314733h;
            Intrinsics.checkNotNull(objArr);
            if (q0.f(objArr, aVar.f314739b) != aVar) {
                return;
            }
            q0.g(objArr, aVar.f314739b, q0.f314763a);
            C();
            Unit unit = Unit.f312394a;
        }
    }

    private final void C() {
        if (this.f314731f != 0 || this.f314737l > 1) {
            Object[] objArr = this.f314733h;
            Intrinsics.checkNotNull(objArr);
            while (this.f314737l > 0 && q0.f(objArr, (N() + ((long) T())) - 1) == q0.f314763a) {
                this.f314737l--;
                q0.g(objArr, N() + ((long) T()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ <T> Object D(p0<T> p0Var, j<? super T> jVar, kotlin.coroutines.d<?> dVar) throws Throwable {
        c cVar;
        p0<T> p0Var2;
        Throwable th2;
        r0 r0Var;
        j<? super T> jVar2;
        p2 p2Var;
        j jVar3;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f314749g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f314749g = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(p0Var, dVar);
            }
        } else {
            cVar = new c(p0Var, dVar);
        }
        Object obj = cVar.f314747e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f314749g;
        if (i11 != 0) {
            if (i11 == 1) {
                r0Var = (r0) cVar.f314745c;
                j<? super T> jVar4 = (j) cVar.f314744b;
                p0<T> p0Var3 = (p0) cVar.f314743a;
                try {
                    ResultKt.m(obj);
                    jVar2 = jVar4;
                    p0Var = p0Var3;
                    try {
                        p2Var = (p2) cVar.getContext().get(p2.M2);
                        jVar3 = jVar2;
                    } catch (Throwable th3) {
                        p0Var2 = p0Var;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    p0Var2 = p0Var3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p2 p2Var2 = (p2) cVar.f314746d;
                r0Var = (r0) cVar.f314745c;
                j jVar5 = (j) cVar.f314744b;
                p0Var2 = (p0) cVar.f314743a;
                try {
                    ResultKt.m(obj);
                    jVar3 = jVar5;
                    p2Var = p2Var2;
                    p0Var = p0Var2;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            p0Var2.l(r0Var);
            throw th2;
        }
        ResultKt.m(obj);
        r0 r0VarG = p0Var.g();
        try {
            if (jVar instanceof d1) {
                cVar.f314743a = p0Var;
                cVar.f314744b = jVar;
                cVar.f314745c = r0VarG;
                cVar.f314749g = 1;
                if (((d1) jVar).a(cVar) == objL) {
                }
                return objL;
            }
            jVar2 = jVar;
            r0Var = r0VarG;
            p2Var = (p2) cVar.getContext().get(p2.M2);
            jVar3 = jVar2;
        } catch (Throwable th6) {
            p0Var2 = p0Var;
            th2 = th6;
            r0Var = r0VarG;
        }
        while (true) {
            Object objY = p0Var.Y(r0Var);
            if (objY == q0.f314763a) {
                cVar.f314743a = p0Var;
                cVar.f314744b = jVar3;
                cVar.f314745c = r0Var;
                cVar.f314746d = p2Var;
                cVar.f314749g = 2;
                if (p0Var.A(r0Var, cVar) == objL) {
                    break;
                }
            } else {
                if (p2Var != null) {
                    s2.z(p2Var);
                }
                cVar.f314743a = p0Var;
                cVar.f314744b = jVar3;
                cVar.f314745c = r0Var;
                cVar.f314746d = p2Var;
                cVar.f314749g = 3;
                if (jVar3.emit(objY, cVar) == objL) {
                    break;
                }
            }
        }
        return objL;
    }

    private final void E(long j10) {
        kotlinx.coroutines.flow.internal.d[] dVarArr;
        if (((kotlinx.coroutines.flow.internal.b) this).f314483b != 0 && (dVarArr = ((kotlinx.coroutines.flow.internal.b) this).f314482a) != null) {
            for (kotlinx.coroutines.flow.internal.d dVar : dVarArr) {
                if (dVar != null) {
                    r0 r0Var = (r0) dVar;
                    long j11 = r0Var.f314765a;
                    if (j11 >= 0 && j11 < j10) {
                        r0Var.f314765a = j10;
                    }
                }
            }
        }
        this.f314735j = j10;
    }

    private final void H() {
        Object[] objArr = this.f314733h;
        Intrinsics.checkNotNull(objArr);
        q0.g(objArr, N(), null);
        this.f314736k--;
        long jN = N() + 1;
        if (this.f314734i < jN) {
            this.f314734i = jN;
        }
        if (this.f314735j < jN) {
            E(jN);
        }
    }

    static /* synthetic */ <T> Object I(p0<T> p0Var, T t10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ;
        return (!p0Var.f(t10) && (objJ = p0Var.J(t10, dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objJ : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(T t10, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        p0<T> p0Var;
        Throwable th2;
        kotlin.coroutines.d<Unit>[] dVarArrL;
        a aVar;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        kotlin.coroutines.d<Unit>[] dVarArrL2 = kotlinx.coroutines.flow.internal.c.f314488a;
        synchronized (this) {
            try {
                if (V(t10)) {
                    try {
                        Result.a aVar2 = Result.Companion;
                        pVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                        dVarArrL = L(dVarArrL2);
                        aVar = null;
                        p0Var = this;
                    } catch (Throwable th3) {
                        th2 = th3;
                        p0Var = this;
                        throw th2;
                    }
                } else {
                    p0Var = this;
                    try {
                        aVar = new a(p0Var, N() + ((long) T()), t10, pVar);
                        p0Var.K(aVar);
                        p0Var.f314737l++;
                        if (p0Var.f314731f == 0) {
                            dVarArrL2 = p0Var.L(dVarArrL2);
                        }
                        dVarArrL = dVarArrL2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    kotlinx.coroutines.r.a(pVar, aVar);
                }
                for (kotlin.coroutines.d<Unit> dVar2 : dVarArrL) {
                    if (dVar2 != null) {
                        Result.a aVar3 = Result.Companion;
                        dVar2.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                    }
                }
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
            } catch (Throwable th5) {
                th = th5;
                p0Var = this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Object obj) {
        int iT = T();
        Object[] objArrU = this.f314733h;
        if (objArrU == null) {
            int i10 = 3 | 0;
            objArrU = U(null, 0, 2);
        } else if (iT >= objArrU.length) {
            objArrU = U(objArrU, iT, objArrU.length * 2);
        }
        q0.g(objArrU, N() + ((long) iT), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.d<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final kotlin.coroutines.d<Unit>[] L(kotlin.coroutines.d<Unit>[] dVarArr) {
        kotlinx.coroutines.flow.internal.d[] dVarArr2;
        r0 r0Var;
        kotlin.coroutines.d<? super Unit> dVar;
        int length = dVarArr.length;
        if (((kotlinx.coroutines.flow.internal.b) this).f314483b != 0 && (dVarArr2 = ((kotlinx.coroutines.flow.internal.b) this).f314482a) != null) {
            int length2 = dVarArr2.length;
            int i10 = 0;
            while (i10 < length2) {
                kotlinx.coroutines.flow.internal.d dVar2 = dVarArr2[i10];
                if (dVar2 == null || (dVar = (r0Var = (r0) dVar2).f314766b) == null || X(r0Var) < 0) {
                    dVarArr = dVarArr;
                } else {
                    if (length >= dVarArr.length) {
                        dVarArr = dVarArr;
                        dVarArr = dVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        dVarArr = objArrCopyOf;
                    }
                    dVarArr = dVarArr;
                    dVarArr = dVarArr;
                    ((kotlin.coroutines.d[]) dVarArr)[length] = dVar;
                    r0Var.f314766b = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
            dVarArr = dVarArr;
        }
        return (kotlin.coroutines.d[]) dVarArr;
    }

    private final long M() {
        return N() + ((long) this.f314736k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long N() {
        return Math.min(this.f314735j, this.f314734i);
    }

    protected static /* synthetic */ void P() {
    }

    private final Object Q(long j10) {
        Object[] objArr = this.f314733h;
        Intrinsics.checkNotNull(objArr);
        Object objF = q0.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f314740c : objF;
    }

    private final long R() {
        return N() + ((long) this.f314736k) + ((long) this.f314737l);
    }

    private final int S() {
        return (int) ((N() + ((long) this.f314736k)) - this.f314734i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int T() {
        return this.f314736k + this.f314737l;
    }

    private final Object[] U(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f314733h = objArr2;
        if (objArr != null) {
            long jN = N();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jN;
                q0.g(objArr2, j10, q0.f(objArr, j10));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean V(T t10) {
        if (m() == 0) {
            return W(t10);
        }
        if (this.f314736k >= this.f314731f && this.f314735j <= this.f314734i) {
            int i10 = b.f314742a[this.f314732g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new kotlin.k0();
            }
        }
        K(t10);
        int i11 = this.f314736k + 1;
        this.f314736k = i11;
        if (i11 > this.f314731f) {
            H();
        }
        if (S() > this.f314730e) {
            Z(this.f314734i + 1, this.f314735j, M(), R());
        }
        return true;
    }

    private final boolean W(T t10) {
        if (this.f314730e == 0) {
            return true;
        }
        K(t10);
        int i10 = this.f314736k + 1;
        this.f314736k = i10;
        if (i10 > this.f314730e) {
            H();
        }
        this.f314735j = N() + ((long) this.f314736k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long X(r0 r0Var) {
        long j10 = r0Var.f314765a;
        if (j10 < M() || (this.f314731f <= 0 && j10 <= N() && this.f314737l != 0)) {
            return j10;
        }
        return -1L;
    }

    private final Object Y(r0 r0Var) {
        Object obj;
        kotlin.coroutines.d<Unit>[] dVarArrA0 = kotlinx.coroutines.flow.internal.c.f314488a;
        synchronized (this) {
            try {
                long jX = X(r0Var);
                if (jX < 0) {
                    obj = q0.f314763a;
                } else {
                    long j10 = r0Var.f314765a;
                    Object objQ = Q(jX);
                    r0Var.f314765a = jX + 1;
                    dVarArrA0 = a0(j10);
                    obj = objQ;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (kotlin.coroutines.d<Unit> dVar : dVarArrA0) {
            if (dVar != null) {
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
            }
        }
        return obj;
    }

    private final void Z(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jN = N(); jN < jMin; jN++) {
            Object[] objArr = this.f314733h;
            Intrinsics.checkNotNull(objArr);
            q0.g(objArr, jN, null);
        }
        this.f314734i = j10;
        this.f314735j = j11;
        this.f314736k = (int) (j12 - jMin);
        this.f314737l = (int) (j13 - j12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public r0 h() {
        return new r0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @NotNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public r0[] j(int i10) {
        return new r0[i10];
    }

    protected final T O() {
        Object[] objArr = this.f314733h;
        Intrinsics.checkNotNull(objArr);
        return (T) q0.f(objArr, (this.f314734i + ((long) S())) - 1);
    }

    @Override // kotlinx.coroutines.flow.o0
    @NotNull
    public List<T> a() {
        synchronized (this) {
            try {
                int iS = S();
                if (iS == 0) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(iS);
                Object[] objArr = this.f314733h;
                Intrinsics.checkNotNull(objArr);
                for (int i10 = 0; i10 < iS; i10++) {
                    arrayList.add(q0.f(objArr, this.f314734i + ((long) i10)));
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final kotlin.coroutines.d<Unit>[] a0(long j10) {
        long j11;
        long j12;
        long j13;
        kotlinx.coroutines.flow.internal.d[] dVarArr;
        if (j10 > this.f314735j) {
            return kotlinx.coroutines.flow.internal.c.f314488a;
        }
        long jN = N();
        long j14 = ((long) this.f314736k) + jN;
        if (this.f314731f == 0 && this.f314737l > 0) {
            j14++;
        }
        if (((kotlinx.coroutines.flow.internal.b) this).f314483b != 0 && (dVarArr = ((kotlinx.coroutines.flow.internal.b) this).f314482a) != null) {
            for (kotlinx.coroutines.flow.internal.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((r0) dVar).f314765a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f314735j) {
            return kotlinx.coroutines.flow.internal.c.f314488a;
        }
        long jM = M();
        int iMin = m() > 0 ? Math.min(this.f314737l, this.f314731f - ((int) (jM - j14))) : this.f314737l;
        kotlin.coroutines.d<Unit>[] dVarArr2 = kotlinx.coroutines.flow.internal.c.f314488a;
        long j16 = ((long) this.f314737l) + jM;
        if (iMin > 0) {
            dVarArr2 = new kotlin.coroutines.d[iMin];
            Object[] objArr = this.f314733h;
            Intrinsics.checkNotNull(objArr);
            j13 = 1;
            long j17 = jM;
            int i10 = 0;
            while (true) {
                if (jM >= j16) {
                    j11 = jN;
                    j12 = j14;
                    jM = j17;
                    break;
                }
                Object objF = q0.f(objArr, jM);
                j11 = jN;
                kotlinx.coroutines.internal.z0 z0Var = q0.f314763a;
                if (objF != z0Var) {
                    Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j14;
                    dVarArr2[i10] = aVar.f314741d;
                    q0.g(objArr, jM, z0Var);
                    q0.g(objArr, j17, aVar.f314740c);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        jM = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                jM++;
                jN = j11;
                j14 = j12;
            }
        } else {
            j11 = jN;
            j12 = j14;
            j13 = 1;
        }
        kotlin.coroutines.d<Unit>[] dVarArr3 = dVarArr2;
        int i12 = (int) (jM - j11);
        long j19 = m() == 0 ? jM : j12;
        long jMax = Math.max(this.f314734i, jM - ((long) Math.min(this.f314730e, i12)));
        if (this.f314731f == 0 && jMax < j16) {
            Object[] objArr2 = this.f314733h;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(q0.f(objArr2, jMax), q0.f314763a)) {
                jM += j13;
                jMax += j13;
            }
        }
        Z(jMax, j19, jM, j16);
        C();
        return !(dVarArr3.length == 0) ? L(dVarArr3) : dVarArr3;
    }

    @Override // kotlinx.coroutines.flow.internal.r
    @NotNull
    public i<T> b(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return q0.e(this, coroutineContext, i10, jVar);
    }

    public final long b0() {
        long j10 = this.f314734i;
        if (j10 < this.f314735j) {
            this.f314735j = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.o0, kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<?> dVar) {
        return D(this, jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.j0
    public void d() throws Throwable {
        p0<T> p0Var;
        synchronized (this) {
            try {
                p0Var = this;
                try {
                    p0Var.Z(M(), this.f314735j, M(), R());
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                p0Var = this;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return I(this, t10, dVar);
    }

    @Override // kotlinx.coroutines.flow.j0
    public boolean f(T t10) {
        int i10;
        boolean z10;
        kotlin.coroutines.d<Unit>[] dVarArrL = kotlinx.coroutines.flow.internal.c.f314488a;
        synchronized (this) {
            try {
                if (V(t10)) {
                    dVarArrL = L(dVarArrL);
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (kotlin.coroutines.d<Unit> dVar : dVarArrL) {
            if (dVar != null) {
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
            }
        }
        return z10;
    }
}
