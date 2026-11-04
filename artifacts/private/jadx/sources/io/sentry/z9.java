package io.sentry;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Deque<a> f307202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f307203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f307204c;

    public z9(@NotNull ILogger iLogger, @NotNull a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f307202a = linkedBlockingDeque;
        this.f307204c = new io.sentry.util.a();
        this.f307203b = (ILogger) io.sentry.util.y.c(iLogger, "logger is required");
        linkedBlockingDeque.push((a) io.sentry.util.y.c(aVar, "rootStackItem is required"));
    }

    @NotNull
    a a() {
        return this.f307202a.peek();
    }

    void b() {
        m1 m1VarA = this.f307204c.a();
        try {
            if (this.f307202a.size() != 1) {
                this.f307202a.pop();
            } else {
                this.f307203b.c(y7.WARNING, "Attempt to pop the root scope.", new Object[0]);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void c(@NotNull a aVar) {
        this.f307202a.push(aVar);
    }

    int d() {
        return this.f307202a.size();
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n8 f307205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private volatile k1 f307206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private volatile g1 f307207c;

        a(@NotNull n8 n8Var, @NotNull k1 k1Var, @NotNull g1 g1Var) {
            this.f307206b = (k1) io.sentry.util.y.c(k1Var, "ISentryClient is required.");
            this.f307207c = (g1) io.sentry.util.y.c(g1Var, "Scope is required.");
            this.f307205a = (n8) io.sentry.util.y.c(n8Var, "Options is required");
        }

        @NotNull
        public k1 a() {
            return this.f307206b;
        }

        @NotNull
        public n8 b() {
            return this.f307205a;
        }

        @NotNull
        public g1 c() {
            return this.f307207c;
        }

        public void d(@NotNull k1 k1Var) {
            this.f307206b = k1Var;
        }

        a(@NotNull a aVar) {
            this.f307205a = aVar.f307205a;
            this.f307206b = aVar.f307206b;
            this.f307207c = aVar.f307207c.m777clone();
        }
    }

    public z9(@NotNull z9 z9Var) {
        this(z9Var.f307203b, new a(z9Var.f307202a.getLast()));
        Iterator<a> itDescendingIterator = z9Var.f307202a.descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            c(new a(itDescendingIterator.next()));
        }
    }
}
