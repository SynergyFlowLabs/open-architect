package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class f<T> extends d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Callable<T> f337100d;

    public f(Callable<T> callable) {
        k(callable);
        this.f337100d = callable;
    }

    private void k(Callable<T> callable) {
        c0.v(callable != null, "Callable must not be null!", new Object[0]);
    }

    @Override // org.apache.commons.lang3.concurrent.d
    protected T g() throws Exception {
        return this.f337100d.call();
    }

    public f(Callable<T> callable, ExecutorService executorService) {
        super(executorService);
        k(callable);
        this.f337100d = callable;
    }
}
