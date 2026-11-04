package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.d2;
import com.rabbitmq.client.n1;
import com.rabbitmq.client.q1;
import com.rabbitmq.client.z1;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes13.dex */
public class r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static Function<i, s> f265591m = new Function() { // from class: com.rabbitmq.client.impl.nio.q
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return r.a((i) obj);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExecutorService f265597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ThreadFactory f265598g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ExecutorService f265601j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f265592a = 32768;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f265593b = 32768;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f265594c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f265595d = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f265596e = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n1 f265599h = q1.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z1 f265600i = new z1() { // from class: com.rabbitmq.client.impl.nio.p
        @Override // com.rabbitmq.client.z1
        public final void a(SSLEngine sSLEngine) {
            r.b(sSLEngine);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f265602k = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Function<i, s> f265603l = f265591m;

    public r() {
    }

    public static /* synthetic */ s a(i iVar) {
        return new a(new ArrayBlockingQueue(iVar.a().n(), true), iVar.a().m());
    }

    public static /* synthetic */ void b(SSLEngine sSLEngine) {
    }

    public r A(Function<i, s> function) {
        this.f265603l = function;
        return this;
    }

    public r c() {
        z1 z1Var = this.f265600i;
        if (z1Var == null) {
            this.f265600i = d2.f265046b;
            return this;
        }
        this.f265600i = z1Var.c(d2.f265046b);
        return this;
    }

    public b d() {
        return this.f265602k;
    }

    public ExecutorService e() {
        return this.f265601j;
    }

    public int f() {
        return this.f265594c;
    }

    public ExecutorService g() {
        return this.f265597f;
    }

    public int h() {
        return this.f265592a;
    }

    public n1 i() {
        return this.f265599h;
    }

    public z1 j() {
        return this.f265600i;
    }

    public ThreadFactory k() {
        return this.f265598g;
    }

    public int l() {
        return this.f265593b;
    }

    public int m() {
        return this.f265595d;
    }

    public int n() {
        return this.f265596e;
    }

    public Function<i, s> o() {
        return this.f265603l;
    }

    public r p(b bVar) {
        this.f265602k = bVar;
        return this;
    }

    public r q(ExecutorService executorService) {
        this.f265601j = executorService;
        return this;
    }

    public r r(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Number of threads must be greater than 0");
        }
        this.f265594c = i10;
        return this;
    }

    public r s(ExecutorService executorService) {
        this.f265597f = executorService;
        return this;
    }

    public r t(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Buffer size must be greater than 0");
        }
        this.f265592a = i10;
        return this;
    }

    public void u(n1 n1Var) {
        this.f265599h = n1Var;
    }

    public void v(z1 z1Var) {
        this.f265600i = z1Var;
    }

    public r w(ThreadFactory threadFactory) {
        this.f265598g = threadFactory;
        return this;
    }

    public r x(int i10) {
        if (this.f265592a <= 0) {
            throw new IllegalArgumentException("Buffer size must be greater than 0");
        }
        this.f265593b = i10;
        return this;
    }

    public r y(int i10) {
        this.f265595d = i10;
        return this;
    }

    public r z(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Write queue capacity must be greater than 0");
        }
        this.f265596e = i10;
        return this;
    }

    public r(r rVar) {
        t(rVar.h());
        x(rVar.l());
        r(rVar.f());
        y(rVar.m());
        z(rVar.n());
        s(rVar.g());
        w(rVar.k());
        u(rVar.i());
        v(rVar.j());
        q(rVar.e());
        p(rVar.d());
        A(rVar.o());
    }
}
