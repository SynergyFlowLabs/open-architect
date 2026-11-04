package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.common.util.concurrent.t1;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f43042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<T> f43043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e<Void> f43044c = e.N();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f43045d;

        a() {
        }

        private void e() {
            this.f43042a = null;
            this.f43043b = null;
            this.f43044c = null;
        }

        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            e<Void> eVar = this.f43044c;
            if (eVar != null) {
                eVar.m0(runnable, executor);
            }
        }

        void b() {
            this.f43042a = null;
            this.f43043b = null;
            this.f43044c.E(null);
        }

        public boolean c(T t10) {
            this.f43045d = true;
            d<T> dVar = this.f43043b;
            boolean z10 = dVar != null && dVar.b(t10);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f43045d = true;
            d<T> dVar = this.f43043b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(@NonNull Throwable th2) {
            this.f43045d = true;
            d<T> dVar = this.f43043b;
            boolean z10 = dVar != null && dVar.c(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            e<Void> eVar;
            d<T> dVar = this.f43043b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f43042a));
            }
            if (this.f43045d || (eVar = this.f43044c) == null) {
                return;
            }
            eVar.E(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0353c<T> {
        @p0
        Object a(@NonNull a<T> aVar) throws Exception;
    }

    private static final class d<T> implements t1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<a<T>> f43046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f43047b = new a();

        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String x() {
                a<T> aVar = d.this.f43046a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f43042a + "]";
            }
        }

        d(a<T> aVar) {
            this.f43046a = new WeakReference<>(aVar);
        }

        boolean a(boolean z10) {
            return this.f43047b.cancel(z10);
        }

        boolean b(T t10) {
            return this.f43047b.E(t10);
        }

        boolean c(Throwable th2) {
            return this.f43047b.H(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f43046a.get();
            boolean zCancel = this.f43047b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f43047b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f43047b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f43047b.isDone();
        }

        @Override // com.google.common.util.concurrent.t1
        public void m0(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f43047b.m0(runnable, executor);
        }

        public String toString() {
            return this.f43047b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f43047b.get(j10, timeUnit);
        }
    }

    private c() {
    }

    @NonNull
    public static <T> t1<T> a(@NonNull InterfaceC0353c<T> interfaceC0353c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f43043b = dVar;
        aVar.f43042a = interfaceC0353c.getClass();
        try {
            Object objA = interfaceC0353c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f43042a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
