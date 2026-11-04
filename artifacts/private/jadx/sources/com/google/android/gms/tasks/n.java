package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private n() {
    }

    public static <TResult> TResult a(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        com.google.android.gms.common.internal.w.p();
        com.google.android.gms.common.internal.w.n();
        com.google.android.gms.common.internal.w.s(task, "Task must not be null");
        if (task.t()) {
            return (TResult) s(task);
        }
        r rVar = new r(null);
        t(task, rVar);
        rVar.c();
        return (TResult) s(task);
    }

    public static <TResult> TResult b(@NonNull Task<TResult> task, long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.w.p();
        com.google.android.gms.common.internal.w.n();
        com.google.android.gms.common.internal.w.s(task, "Task must not be null");
        com.google.android.gms.common.internal.w.s(timeUnit, "TimeUnit must not be null");
        if (task.t()) {
            return (TResult) s(task);
        }
        r rVar = new r(null);
        t(task, rVar);
        if (rVar.e(j10, timeUnit)) {
            return (TResult) s(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> c(@NonNull Callable<TResult> callable) {
        return d(m.f111003a, callable);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> d(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        com.google.android.gms.common.internal.w.s(executor, "Executor must not be null");
        com.google.android.gms.common.internal.w.s(callable, "Callback must not be null");
        q0 q0Var = new q0();
        executor.execute(new t0(q0Var, callable));
        return q0Var;
    }

    @NonNull
    public static <TResult> Task<TResult> e() {
        q0 q0Var = new q0();
        q0Var.z();
        return q0Var;
    }

    @NonNull
    public static <TResult> Task<TResult> f(@NonNull Exception exc) {
        q0 q0Var = new q0();
        q0Var.x(exc);
        return q0Var;
    }

    @NonNull
    public static <TResult> Task<TResult> g(TResult tresult) {
        q0 q0Var = new q0();
        q0Var.y(tresult);
        return q0Var;
    }

    @NonNull
    public static Task<Void> h(@androidx.annotation.p0 Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return g(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        q0 q0Var = new q0();
        t tVar = new t(collection.size(), q0Var);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            t(it2.next(), tVar);
        }
        return q0Var;
    }

    @NonNull
    public static Task<Void> i(@androidx.annotation.p0 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return h(Arrays.asList(taskArr));
        }
        return g(null);
    }

    @NonNull
    public static Task<List<Task<?>>> j(@androidx.annotation.p0 Collection<? extends Task<?>> collection) {
        return k(m.f111003a, collection);
    }

    @NonNull
    public static Task<List<Task<?>>> k(@NonNull Executor executor, @androidx.annotation.p0 Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return h(collection).o(executor, new q(collection));
        }
        return g(Collections.EMPTY_LIST);
    }

    @NonNull
    public static Task<List<Task<?>>> l(@NonNull Executor executor, @androidx.annotation.p0 Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? g(Collections.EMPTY_LIST) : k(executor, Arrays.asList(taskArr));
    }

    @NonNull
    public static Task<List<Task<?>>> m(@androidx.annotation.p0 Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? g(Collections.EMPTY_LIST) : j(Arrays.asList(taskArr));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> n(@androidx.annotation.p0 Collection<? extends Task> collection) {
        return o(m.f111003a, collection);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> o(@NonNull Executor executor, @androidx.annotation.p0 Collection<? extends Task> collection) {
        return (collection == null || collection.isEmpty()) ? g(Collections.EMPTY_LIST) : (Task<List<TResult>>) h(collection).m(executor, new p(collection));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> p(@NonNull Executor executor, @androidx.annotation.p0 Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return o(executor, Arrays.asList(taskArr));
        }
        return g(Collections.EMPTY_LIST);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> q(@androidx.annotation.p0 Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? g(Collections.EMPTY_LIST) : n(Arrays.asList(taskArr));
    }

    @NonNull
    public static <T> Task<T> r(@NonNull Task<T> task, long j10, @NonNull TimeUnit timeUnit) {
        com.google.android.gms.common.internal.w.s(task, "Task must not be null");
        com.google.android.gms.common.internal.w.b(j10 > 0, "Timeout must be positive");
        com.google.android.gms.common.internal.w.s(timeUnit, "TimeUnit must not be null");
        final v vVar = new v();
        final l lVar = new l(vVar);
        final m6.a aVar = new m6.a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.r0
            @Override // java.lang.Runnable
            public final void run() {
                lVar.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j10));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.s0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                aVar.removeCallbacksAndMessages(null);
                l lVar2 = lVar;
                if (task2.u()) {
                    lVar2.e(task2.q());
                } else {
                    if (task2.s()) {
                        vVar.c();
                        return;
                    }
                    Exception excP = task2.p();
                    Objects.requireNonNull(excP);
                    lVar2.d(excP);
                }
            }
        });
        return lVar.a();
    }

    private static Object s(@NonNull Task task) throws ExecutionException {
        if (task.u()) {
            return task.q();
        }
        if (task.s()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.p());
    }

    private static void t(Task task, s sVar) {
        Executor executor = m.f111004b;
        task.k(executor, sVar);
        task.h(executor, sVar);
        task.c(executor, sVar);
    }
}
