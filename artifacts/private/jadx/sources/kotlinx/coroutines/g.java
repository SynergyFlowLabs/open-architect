package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
final class g<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Thread f315014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final s1 f315015e;

    public g(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable s1 s1Var) {
        super(coroutineContext, true, true);
        this.f315014d = thread;
        this.f315015e = s1Var;
    }

    @Override // kotlinx.coroutines.w2
    protected void a0(@Nullable Object obj) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.f315014d)) {
            return;
        }
        Thread thread = this.f315014d;
        b bVar = c.f313549a;
        if (bVar != null) {
            bVar.g(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T i2() throws Throwable {
        b bVar = c.f313549a;
        if (bVar != null) {
            bVar.d();
        }
        try {
            s1 s1Var = this.f315015e;
            if (s1Var != null) {
                s1.g1(s1Var, false, 1, null);
            }
            while (true) {
                try {
                    s1 s1Var2 = this.f315015e;
                    long jS1 = s1Var2 != null ? s1Var2.s1() : Long.MAX_VALUE;
                    if (x()) {
                        break;
                    }
                    b bVar2 = c.f313549a;
                    if (bVar2 != null) {
                        bVar2.c(this, jS1);
                    } else {
                        LockSupport.parkNanos(this, jS1);
                    }
                    if (Thread.interrupted()) {
                        m0(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    s1 s1Var3 = this.f315015e;
                    if (s1Var3 != null) {
                        s1.O0(s1Var3, false, 1, null);
                    }
                    throw th2;
                }
            }
            s1 s1Var4 = this.f315015e;
            if (s1Var4 != null) {
                s1.O0(s1Var4, false, 1, null);
            }
            b bVar3 = c.f313549a;
            if (bVar3 != null) {
                bVar3.h();
            }
            T t10 = (T) x2.h(c1());
            c0 c0Var = t10 instanceof c0 ? (c0) t10 : null;
            if (c0Var == null) {
                return t10;
            }
            throw c0Var.f313551a;
        } catch (Throwable th3) {
            b bVar4 = c.f313549a;
            if (bVar4 != null) {
                bVar4.h();
            }
            throw th3;
        }
    }

    @Override // kotlinx.coroutines.w2
    protected boolean u1() {
        return true;
    }
}
