package kotlinx.coroutines;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b4 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {102}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f313544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313548e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313547d = obj;
            this.f313548e |= Integer.MIN_VALUE;
            return b4.e(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x001e, please report this as an issue */
    @NotNull
    public static final z3 a(long j10, @NotNull c1 c1Var, @NotNull p2 p2Var) {
        String strA;
        e1 e1Var = c1Var instanceof e1 ? (e1) c1Var : null;
        if (e1Var != null) {
            kotlin.time.c.a aVar = kotlin.time.c.f313406b;
            strA = e1Var.a(kotlin.time.e.n0(j10, kotlin.time.f.MILLISECONDS));
            if (strA == null) {
                strA = "Timed out waiting for " + j10 + " ms";
            }
        } else {
            strA = "Timed out waiting for " + j10 + " ms";
        }
        return new z3(strA, p2Var);
    }

    private static final <U, T extends U> Object b(a4<U, ? super T> a4Var, Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        s2.x(a4Var, d1.d(a4Var.f315130d.getContext()).d(a4Var.f313524e, a4Var, a4Var.getContext()));
        return bk.b.e(a4Var, a4Var, function2);
    }

    @Nullable
    public static final <T> Object c(long j10, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        if (j10 <= 0) {
            throw new z3("Timed out immediately");
        }
        Object objB = b(new a4(j10, dVar), function2);
        if (objB == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objB;
    }

    @Nullable
    public static final <T> Object d(long j10, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return c(d1.e(j10), function2, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.a4] */
    @Nullable
    public static final <T> Object e(long j10, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        a aVar;
        kotlin.jvm.internal.i1.h hVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f313548e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f313548e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f313547d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f313548e;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (j10 <= 0) {
                return null;
            }
            kotlin.jvm.internal.i1.h hVar2 = new kotlin.jvm.internal.i1.h();
            try {
                aVar.f313545b = function2;
                aVar.f313546c = hVar2;
                aVar.f313544a = j10;
                aVar.f313548e = 1;
                ?? r10 = (T) new a4(j10, aVar);
                hVar2.f312751a = r10;
                Object objB = b(r10, function2);
                if (objB == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar);
                }
                return objB == objL ? objL : objB;
            } catch (z3 e10) {
                e = e10;
                hVar = hVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (kotlin.jvm.internal.i1.h) aVar.f313546c;
            try {
                ResultKt.m(obj);
                return obj;
            } catch (z3 e11) {
                e = e11;
            }
        }
        if (e.f315736a == hVar.f312751a) {
            return null;
        }
        throw e;
    }

    @Nullable
    public static final <T> Object f(long j10, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e(d1.e(j10), function2, dVar);
    }
}
