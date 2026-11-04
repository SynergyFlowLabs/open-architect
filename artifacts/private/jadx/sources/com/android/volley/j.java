package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class j implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f89457a;

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f89458a;

        a(Handler handler) {
            this.f89458a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f89458a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f89460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f89461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f89462c;

        public b(s sVar, v vVar, Runnable runnable) {
            this.f89460a = sVar;
            this.f89461b = vVar;
            this.f89462c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89460a.isCanceled()) {
                this.f89460a.finish("canceled-at-delivery");
                return;
            }
            if (this.f89461b.b()) {
                this.f89460a.deliverResponse(this.f89461b.f89654a);
            } else {
                this.f89460a.deliverError(this.f89461b.f89656c);
            }
            if (this.f89461b.f89657d) {
                this.f89460a.addMarker("intermediate-response");
            } else {
                this.f89460a.finish("done");
            }
            Runnable runnable = this.f89462c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public j(Handler handler) {
        this.f89457a = new a(handler);
    }

    @Override // com.android.volley.w
    public void a(s<?> sVar, v<?> vVar) {
        b(sVar, vVar, null);
    }

    @Override // com.android.volley.w
    public void b(s<?> sVar, v<?> vVar, Runnable runnable) {
        sVar.markDelivered();
        sVar.addMarker("post-response");
        this.f89457a.execute(new b(sVar, vVar, runnable));
    }

    @Override // com.android.volley.w
    public void c(s<?> sVar, a0 a0Var) {
        sVar.addMarker("post-error");
        this.f89457a.execute(new b(sVar, v.a(a0Var), null));
    }

    public j(Executor executor) {
        this.f89457a = executor;
    }
}
