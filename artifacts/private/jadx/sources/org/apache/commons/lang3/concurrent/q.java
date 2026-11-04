package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes14.dex */
public class q<I, O> implements i<I, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<I, Future<O>> f337117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<I, O> f337118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f337119c;

    class a implements Callable<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f337120a;

        a(Object obj) {
            this.f337120a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public O call() throws InterruptedException {
            return (O) q.this.f337118b.a(this.f337120a);
        }
    }

    public q(i<I, O> iVar) {
        this(iVar, false);
    }

    private RuntimeException c(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            return (RuntimeException) th2;
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new IllegalStateException("Unchecked exception", th2);
    }

    @Override // org.apache.commons.lang3.concurrent.i
    public O a(I i10) throws InterruptedException {
        FutureTask futureTask;
        while (true) {
            Future<O> futurePutIfAbsent = this.f337117a.get(i10);
            if (futurePutIfAbsent == null && (futurePutIfAbsent = this.f337117a.putIfAbsent(i10, (futureTask = new FutureTask(this.new a(i10))))) == null) {
                futureTask.run();
                futurePutIfAbsent = futureTask;
            }
            try {
                continue;
                return futurePutIfAbsent.get();
            } catch (CancellationException unused) {
                this.f337117a.remove(i10, futurePutIfAbsent);
            } catch (ExecutionException e10) {
                if (this.f337119c) {
                    this.f337117a.remove(i10, futurePutIfAbsent);
                }
                throw this.c(e10.getCause());
            }
        }
    }

    public q(i<I, O> iVar, boolean z10) {
        this.f337117a = new ConcurrentHashMap();
        this.f337118b = iVar;
        this.f337119c = z10;
    }
}
