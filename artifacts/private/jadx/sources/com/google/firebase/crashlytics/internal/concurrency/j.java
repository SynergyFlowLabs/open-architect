package com.google.firebase.crashlytics.internal.concurrency;

import androidx.annotation.l1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class j implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f121228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f121229b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task<?> f121230c = com.google.android.gms.tasks.n.g(null);

    j(ExecutorService executorService) {
        this.f121228a = executorService;
    }

    public static /* synthetic */ Task a(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ Task d(Runnable runnable, Task task) {
        runnable.run();
        return com.google.android.gms.tasks.n.g(null);
    }

    public static /* synthetic */ Task e(com.google.android.gms.tasks.k kVar, Task task) {
        if (task.u()) {
            return kVar.a(task.q());
        }
        return task.p() != null ? com.google.android.gms.tasks.n.f(task.p()) : com.google.android.gms.tasks.n.e();
    }

    public static /* synthetic */ Task f(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public static /* synthetic */ Task g(Callable callable, Task task) {
        return (Task) callable.call();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f121228a.execute(runnable);
    }

    @l1
    public void h() throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.tasks.n.b(j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.concurrency.e
            @Override // java.lang.Runnable
            public final void run() {
                j.c();
            }
        }), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    public ExecutorService i() {
        return this.f121228a;
    }

    @z7.a
    public Task<Void> j(final Runnable runnable) {
        Task taskO;
        synchronized (this.f121229b) {
            taskO = this.f121230c.o(this.f121228a, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.concurrency.c
                @Override // com.google.android.gms.tasks.c
                public final Object a(Task task) {
                    return j.d(runnable, task);
                }
            });
            this.f121230c = taskO;
        }
        return taskO;
    }

    @z7.a
    public <T> Task<T> k(final Callable<T> callable) {
        q0 q0Var;
        synchronized (this.f121229b) {
            try {
                q0Var = (Task<T>) this.f121230c.o(this.f121228a, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.concurrency.d
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return com.google.android.gms.tasks.n.g(callable.call());
                    }
                });
                this.f121230c = q0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q0Var;
    }

    @z7.a
    public <T> Task<T> l(final Callable<Task<T>> callable) {
        q0 q0Var;
        synchronized (this.f121229b) {
            try {
                q0Var = (Task<T>) this.f121230c.o(this.f121228a, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.concurrency.f
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return j.g(callable, task);
                    }
                });
                this.f121230c = q0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q0Var;
    }

    @z7.a
    public <T, R> Task<R> m(final Callable<Task<T>> callable, com.google.android.gms.tasks.c<T, Task<R>> cVar) {
        q0 q0Var;
        synchronized (this.f121229b) {
            try {
                q0Var = (Task<R>) this.f121230c.o(this.f121228a, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.concurrency.g
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return j.a(callable, task);
                    }
                }).o(this.f121228a, cVar);
                this.f121230c = q0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q0Var;
    }

    @z7.a
    public <T, R> Task<R> n(final Callable<Task<T>> callable, final com.google.android.gms.tasks.k<T, R> kVar) {
        q0 q0Var;
        synchronized (this.f121229b) {
            try {
                q0Var = (Task<R>) this.f121230c.o(this.f121228a, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.concurrency.h
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return j.f(callable, task);
                    }
                }).o(this.f121228a, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.concurrency.i
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return j.e(kVar, task);
                    }
                });
                this.f121230c = q0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q0Var;
    }
}
