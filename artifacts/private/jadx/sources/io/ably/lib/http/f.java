package io.ably.lib.http;

import io.ably.lib.types.r;

/* JADX INFO: loaded from: classes13.dex */
public class f implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.ably.lib.http.b f287298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f287299b;

    /* JADX INFO: Add missing generic type declarations: [Result] */
    class a<Result> implements b<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.ably.lib.types.a f287300a;

        /* JADX INFO: renamed from: io.ably.lib.http.f$a$a, reason: collision with other inner class name */
        class RunnableC1930a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.ably.lib.types.i f287302a;

            RunnableC1930a(io.ably.lib.types.i iVar) {
                this.f287302a = iVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f287302a.a(a.this.f287300a.f287918a);
            }
        }

        a(io.ably.lib.types.a aVar) {
            this.f287300a = aVar;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<Result> iVar) throws io.ably.lib.types.a {
            lVar.f(new RunnableC1930a(iVar));
        }
    }

    public interface b<Result> {
        void a(l lVar, io.ably.lib.types.i<Result> iVar) throws io.ably.lib.types.a;
    }

    public class c<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<Result> f287304a;

        class a implements io.ably.lib.types.i<Result> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f287306a;

            a(d dVar) {
                this.f287306a = dVar;
            }

            @Override // io.ably.lib.types.i
            public void a(r rVar) {
                this.f287306a.f287309b = rVar;
            }

            @Override // io.ably.lib.types.i
            public void b(Result result) {
                this.f287306a.f287308a = result;
            }
        }

        c(b<Result> bVar) {
            this.f287304a = bVar;
        }

        public void a(io.ably.lib.types.i<Result> iVar) {
            try {
                this.f287304a.a(f.this.f287298a, iVar);
            } catch (io.ably.lib.types.a e10) {
                iVar.a(e10.f287918a);
            }
        }

        public Result b() throws io.ably.lib.types.a {
            d dVar = new d(null);
            this.f287304a.a(f.this.f287299b, new a(dVar));
            r rVar = dVar.f287309b;
            if (rVar == null) {
                return dVar.f287308a;
            }
            throw io.ably.lib.types.a.a(rVar);
        }
    }

    public f(io.ably.lib.http.b bVar, o oVar) {
        this.f287298a = bVar;
        this.f287299b = oVar;
    }

    public f c(i iVar) {
        return new f(this.f287298a.o(iVar), new o(iVar));
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.f287298a.close();
    }

    public <Result> c<Result> d(io.ably.lib.types.a aVar) {
        return new c<>(new a(aVar));
    }

    public <Result> c<Result> e(b<Result> bVar) {
        return new c<>(bVar);
    }

    private static class d<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Result f287308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r f287309b;

        private d() {
            this.f287308a = null;
            this.f287309b = null;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
