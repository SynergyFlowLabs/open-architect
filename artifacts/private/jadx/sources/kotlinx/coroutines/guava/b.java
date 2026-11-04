package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.f3;
import com.google.common.util.concurrent.m2;
import com.google.common.util.concurrent.t1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nkotlinx/coroutines/guava/JobListenableFuture\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,506:1\n1#2:507\n*E\n"})
final class b<T> implements t1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p2 f315020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2<Object> f315021b = m2.F();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f315022c;

    public b(@NotNull p2 p2Var) {
        this.f315020a = p2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final T c(Object obj) throws Throwable {
        if (obj instanceof a) {
            throw new CancellationException().initCause(((a) obj).f315019a);
        }
        return obj;
    }

    public final boolean a(T t10) {
        return this.f315021b.B(t10);
    }

    public final boolean b(@NotNull Throwable th2) {
        if (th2 instanceof CancellationException) {
            return this.f315021b.B(new a((CancellationException) th2));
        }
        boolean zC = this.f315021b.C(th2);
        if (zC) {
            this.f315022c = true;
        }
        return zC;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!this.f315021b.cancel(z10)) {
            return false;
        }
        p2.a.b(this.f315020a, null, 1, null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return c(this.f315021b.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z10;
        if (this.f315021b.isCancelled()) {
            return true;
        }
        if (isDone() && !this.f315022c) {
            try {
                z10 = f3.f(this.f315021b) instanceof a;
            } catch (CancellationException unused) {
                z10 = true;
            } catch (ExecutionException unused2) {
                this.f315022c = true;
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f315021b.isDone();
    }

    @Override // com.google.common.util.concurrent.t1
    public void m0(@NotNull Runnable runnable, @NotNull Executor executor) {
        this.f315021b.m0(runnable, executor);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isDone()) {
            try {
                Object objF = f3.f(this.f315021b);
                if (objF instanceof a) {
                    sb2.append("CANCELLED, cause=[" + ((a) objF).f315019a + AbstractJsonLexerKt.END_LIST);
                } else {
                    sb2.append("SUCCESS, result=[" + objF + AbstractJsonLexerKt.END_LIST);
                }
            } catch (CancellationException unused) {
                sb2.append("CANCELLED");
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[" + e10.getCause() + AbstractJsonLexerKt.END_LIST);
            } catch (Throwable th2) {
                sb2.append("UNKNOWN, cause=[" + th2.getClass() + " thrown from get()]");
            }
        } else {
            sb2.append("PENDING, delegate=[" + this.f315021b + AbstractJsonLexerKt.END_LIST);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, @NotNull TimeUnit timeUnit) {
        return c(this.f315021b.get(j10, timeUnit));
    }
}
