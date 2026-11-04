package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
abstract class d<Result> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f52653e = "AsyncTask";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Handler f52654f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f52656b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f52657c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f52658d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FutureTask<Result> f52655a = new b(new a());

    class a implements Callable<Result> {
        a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() {
            d.this.f52658d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b();
                Binder.flushPendingCommands();
                d.this.i(result);
                return result;
            } catch (Throwable th2) {
                try {
                    d.this.f52657c.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    d.this.i(result);
                    throw th3;
                }
            }
        }
    }

    class b extends FutureTask<Result> {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.j(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                d.this.j(null);
            } catch (ExecutionException e10) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52661a;

        c(Object obj) {
            this.f52661a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            d.this.d(this.f52661a);
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0488d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52663a;

        static {
            int[] iArr = new int[e.values().length];
            f52663a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52663a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    d() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (d.class) {
            try {
                if (f52654f == null) {
                    f52654f = new Handler(Looper.getMainLooper());
                }
                handler = f52654f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f52657c.set(true);
        return this.f52655a.cancel(z10);
    }

    protected abstract Result b();

    public final void c(@NonNull Executor executor) {
        if (this.f52656b == e.PENDING) {
            this.f52656b = e.RUNNING;
            executor.execute(this.f52655a);
            return;
        }
        int i10 = C0488d.f52663a[this.f52656b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Result result) {
        if (f()) {
            g(result);
        } else {
            h(result);
        }
        this.f52656b = e.FINISHED;
    }

    public final boolean f() {
        return this.f52657c.get();
    }

    protected void g(Result result) {
    }

    protected void h(Result result) {
    }

    void i(Result result) {
        e().post(new c(result));
    }

    void j(Result result) {
        if (this.f52658d.get()) {
            return;
        }
        i(result);
    }
}
