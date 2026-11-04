package io.ably.lib.http;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class b extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f287270d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final String f287271e = "io.ably.lib.http.b";

    private static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f287272a;

        a(io.ably.lib.types.n nVar) {
            int i10 = nVar.O;
            this.f287272a = new ThreadPoolExecutor(i10, i10, 2000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }

        @Override // java.lang.AutoCloseable
        public void close() throws Exception {
            int size = this.f287272a.shutdownNow().size();
            if (size > 0) {
                io.ably.lib.util.k.m(b.f287271e, "close() drained (cancelled) task count: " + size);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f287272a.execute(runnable);
        }

        protected void finalize() throws Exception {
            close();
        }
    }

    public b(i iVar, io.ably.lib.types.n nVar) {
        super(iVar, new a(nVar));
    }

    public b o(i iVar) {
        return new b(iVar, this.f287393a);
    }

    private b(i iVar, e eVar) {
        super(iVar, eVar);
    }
}
