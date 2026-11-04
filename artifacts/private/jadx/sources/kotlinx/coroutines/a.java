package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
public abstract class a<T> extends w2 implements p2, kotlin.coroutines.d<T>, s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f313522c;

    public a(@NotNull CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            q1((p2) coroutineContext.get(p2.M2));
        }
        this.f313522c = coroutineContext.plus(this);
    }

    public static /* synthetic */ void e2() {
    }

    @Override // kotlinx.coroutines.w2
    @NotNull
    public String B1() {
        String strG = l0.g(this.f313522c);
        if (strG == null) {
            return super.B1();
        }
        return '\"' + strG + "\":" + super.B1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.w2
    protected final void J1(@Nullable Object obj) {
        if (!(obj instanceof c0)) {
            g2(obj);
        } else {
            c0 c0Var = (c0) obj;
            f2(c0Var.f313551a, c0Var.a());
        }
    }

    protected void d2(@Nullable Object obj) {
        a0(obj);
    }

    protected void f2(@NotNull Throwable th2, boolean z10) {
    }

    protected void g2(T t10) {
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        return this.f313522c;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f313522c;
    }

    public final <R> void h2(@NotNull u0 u0Var, R r10, @NotNull Function2<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        u0Var.n(function2, r10, this);
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.w2
    public final void p1(@NotNull Throwable th2) {
        p0.b(this.f313522c, th2);
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) throws Throwable {
        Object objA1 = A1(f0.b(obj));
        if (objA1 == x2.f315707b) {
            return;
        }
        d2(objA1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.w2
    @NotNull
    public String z0() {
        return x0.a(this) + " was cancelled";
    }
}
