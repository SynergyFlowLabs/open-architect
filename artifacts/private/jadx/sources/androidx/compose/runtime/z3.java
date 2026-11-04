package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class z3 implements c3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36866c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c3 f36867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x2 f36868b = new x2();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0}, l = {61, com.planner5d.library.engine.input.f.b.I0}, m = "withFrameNanos", n = {"onFrame"}, s = {"L$0"})
    static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36870b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36872d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36870b = obj;
            this.f36872d |= Integer.MIN_VALUE;
            return z3.this.y(null, this);
        }
    }

    public z3(@NotNull c3 c3Var) {
        this.f36867a = c3Var;
    }

    public final boolean a() {
        return !this.f36868b.e();
    }

    public final void b() {
        this.f36868b.d();
    }

    public final void d() {
        this.f36868b.f();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) c3.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) c3.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return c3.a.d(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return c3.a.e(this, coroutineContext);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.runtime.c3
    @Nullable
    public <R> Object y(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f36872d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36872d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f36870b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f36872d;
        if (i11 == 0) {
            ResultKt.m(obj);
            x2 x2Var = this.f36868b;
            aVar.f36869a = function1;
            aVar.f36872d = 1;
            if (x2Var.c(aVar) != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        function1 = (Function1) aVar.f36869a;
        ResultKt.m(obj);
        c3 c3Var = this.f36867a;
        aVar.f36869a = null;
        aVar.f36872d = 2;
        Object objY = c3Var.y(function1, aVar);
        return objY == objL ? objL : objY;
    }
}
