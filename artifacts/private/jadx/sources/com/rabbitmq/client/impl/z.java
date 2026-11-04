package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f265916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f265917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.rabbitmq.client.k f265918c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile CountDownLatch f265921f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f265919d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f265920e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile com.rabbitmq.client.l1 f265922g = null;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.t f265923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f265924b;

        a(com.rabbitmq.client.t tVar, String str) {
            this.f265923a = tVar;
            this.f265924b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f265923a.d(this.f265924b);
            } catch (Throwable th2) {
                z.this.f265917b.getExceptionHandler().h(z.this.f265918c, th2, this.f265923a, this.f265924b, "handleConsumeOk");
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.t f265926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f265927b;

        b(com.rabbitmq.client.t tVar, String str) {
            this.f265926a = tVar;
            this.f265927b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f265926a.e(this.f265927b);
            } catch (Throwable th2) {
                z.this.f265917b.getExceptionHandler().h(z.this.f265918c, th2, this.f265926a, this.f265927b, "handleCancelOk");
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.t f265929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f265930b;

        c(com.rabbitmq.client.t tVar, String str) {
            this.f265929a = tVar;
            this.f265930b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f265929a.f(this.f265930b);
            } catch (Throwable th2) {
                z.this.f265917b.getExceptionHandler().h(z.this.f265918c, th2, this.f265929a, this.f265930b, "handleCancel");
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.t f265932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f265933b;

        d(com.rabbitmq.client.t tVar, String str) {
            this.f265932a = tVar;
            this.f265933b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f265932a.b(this.f265933b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.t f265935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f265936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.f0 f265937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.a.c f265938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ byte[] f265939e;

        e(com.rabbitmq.client.t tVar, String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) {
            this.f265935a = tVar;
            this.f265936b = str;
            this.f265937c = f0Var;
            this.f265938d = cVar;
            this.f265939e = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f265935a.c(this.f265936b, this.f265937c, this.f265938d, this.f265939e);
            } catch (Throwable th2) {
                z.this.f265917b.getExceptionHandler().h(z.this.f265918c, th2, this.f265935a, this.f265936b, "handleDelivery");
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f265941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.l1 f265942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f265943c;

        f(Map map, com.rabbitmq.client.l1 l1Var, CountDownLatch countDownLatch) {
            this.f265941a = map;
            this.f265942b = l1Var;
            this.f265943c = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.p(this.f265941a, this.f265942b);
            z.this.s(this.f265942b);
            z.this.f265916a.h(z.this.f265918c);
            this.f265943c.countDown();
        }
    }

    public z(i iVar, com.rabbitmq.client.k kVar, a0 a0Var) {
        this.f265917b = iVar;
        this.f265918c = kVar;
        a0Var.e(kVar);
        this.f265916a = a0Var;
    }

    private void f() {
        if (this.f265922g != null) {
            throw ((com.rabbitmq.client.l1) com.rabbitmq.utility.e.c(this.f265922g));
        }
    }

    private void g(Runnable runnable) {
        f();
        this.f265916a.c(this.f265918c, runnable);
    }

    private void h(Runnable runnable) {
        if (this.f265919d) {
            return;
        }
        g(runnable);
    }

    private void o(String str, com.rabbitmq.client.t tVar, com.rabbitmq.client.l1 l1Var) {
        try {
            tVar.a(str, l1Var);
        } catch (Throwable th2) {
            this.f265917b.getExceptionHandler().h(this.f265918c, th2, tVar, str, "handleShutdownSignal");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Map<String, com.rabbitmq.client.t> map, com.rabbitmq.client.l1 l1Var) {
        for (Map.Entry<String, com.rabbitmq.client.t> entry : map.entrySet()) {
            o(entry.getKey(), entry.getValue(), l1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(com.rabbitmq.client.l1 l1Var) {
        this.f265922g = l1Var;
    }

    public void i(com.rabbitmq.client.t tVar, String str) {
        h(new c(tVar, str));
    }

    public void j(com.rabbitmq.client.t tVar, String str) {
        h(new b(tVar, str));
    }

    public void k(com.rabbitmq.client.t tVar, String str) {
        h(new a(tVar, str));
    }

    public void l(com.rabbitmq.client.t tVar, String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        h(new e(tVar, str, f0Var, cVar, bArr));
    }

    public void m(com.rabbitmq.client.t tVar, String str) {
        h(new d(tVar, str));
    }

    public CountDownLatch n(Map<String, com.rabbitmq.client.t> map, com.rabbitmq.client.l1 l1Var) {
        if (!this.f265920e) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f265921f = countDownLatch;
            this.f265920e = true;
            g(new f(map, l1Var, countDownLatch));
        }
        return this.f265921f;
    }

    public void q() {
        this.f265919d = true;
    }

    public void r(boolean z10) {
        this.f265916a.f(this.f265918c, z10);
    }
}
