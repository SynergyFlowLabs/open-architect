package androidx.compose.ui;

import androidx.annotation.b1;
import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@t
@b1({b1.a.LIBRARY_GROUP})
public final class g0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a<T>> f37494a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final p2 f37495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f37496b;

        public a(@NotNull p2 p2Var, T t10) {
            this.f37495a = p2Var;
            this.f37496b = t10;
        }

        @NotNull
        public final p2 a() {
            return this.f37495a;
        }

        public final T b() {
            return this.f37496b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {61, 63}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<s0, T> f37499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicReference<a<T>> f37500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f37501e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super s0, ? extends T> function1, AtomicReference<a<T>> atomicReference, Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f37499c = function1;
            this.f37500d = atomicReference;
            this.f37501e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f37499c, this.f37500d, this.f37501e, dVar);
            bVar.f37498b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a<T> aVar;
            p2 p2VarA;
            a<T> aVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f37497a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0 s0Var = (s0) this.f37498b;
                    aVar = new a<>(s2.A(s0Var.getCoroutineContext()), this.f37499c.invoke(s0Var));
                    a<T> andSet = this.f37500d.getAndSet(aVar);
                    if (andSet != null && (p2VarA = andSet.a()) != null) {
                        this.f37498b = aVar;
                        this.f37497a = 1;
                        if (s2.l(p2VarA, this) == objL) {
                        }
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (a) this.f37498b;
                    try {
                        ResultKt.m(obj);
                        z1.a(this.f37500d, aVar2, null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        z1.a(this.f37500d, aVar2, null);
                        throw th;
                    }
                }
                aVar = (a) this.f37498b;
                ResultKt.m(obj);
                Function2<T, kotlin.coroutines.d<? super R>, Object> function2 = this.f37501e;
                T tB = aVar.b();
                this.f37498b = aVar;
                this.f37497a = 2;
                obj = function2.invoke(tB, this);
                if (obj != objL) {
                    aVar2 = aVar;
                    z1.a(this.f37500d, aVar2, null);
                    return obj;
                }
                return objL;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                z1.a(this.f37500d, aVar2, null);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private /* synthetic */ g0(AtomicReference atomicReference) {
        this.f37494a = atomicReference;
    }

    public static final /* synthetic */ g0 a(AtomicReference atomicReference) {
        return new g0(atomicReference);
    }

    @NotNull
    public static <T> AtomicReference<a<T>> b() {
        return c(new AtomicReference(null));
    }

    private static <T> AtomicReference<a<T>> c(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }

    public static boolean d(AtomicReference<a<T>> atomicReference, Object obj) {
        if ((obj instanceof g0) && Intrinsics.areEqual(atomicReference, ((g0) obj).i())) {
            return true;
        }
        return false;
    }

    public static final boolean e(AtomicReference<a<T>> atomicReference, AtomicReference<a<T>> atomicReference2) {
        return Intrinsics.areEqual(atomicReference, atomicReference2);
    }

    @Nullable
    public static final T f(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static int g(AtomicReference<a<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    public static String h(AtomicReference<a<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    @Nullable
    public static final <R> Object j(AtomicReference<a<T>> atomicReference, @NotNull Function1<? super s0, ? extends T> function1, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return t0.g(new b(function1, atomicReference, function2, null), dVar);
    }

    public boolean equals(Object obj) {
        return d(this.f37494a, obj);
    }

    public int hashCode() {
        return g(this.f37494a);
    }

    public final /* synthetic */ AtomicReference i() {
        return this.f37494a;
    }

    public String toString() {
        return h(this.f37494a);
    }
}
