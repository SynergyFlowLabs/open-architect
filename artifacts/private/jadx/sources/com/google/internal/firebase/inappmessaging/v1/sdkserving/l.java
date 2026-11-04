package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.common.util.concurrent.t1;
import io.grpc.stub.m;
import io.grpc.t2;
import io.grpc.w1;
import io.grpc.w2;

/* JADX INFO: loaded from: classes5.dex */
@uh.a
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f125670a = "google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile w1<com.google.internal.firebase.inappmessaging.v1.sdkserving.g, com.google.internal.firebase.inappmessaging.v1.sdkserving.i> f125671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f125672c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile w2 f125673d;

    class a implements io.grpc.stub.d.a<h> {
        a() {
        }

        @Override // io.grpc.stub.d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(io.grpc.f fVar, io.grpc.e eVar) {
            return new h(fVar, eVar, null);
        }
    }

    class b implements io.grpc.stub.d.a<e> {
        b() {
        }

        @Override // io.grpc.stub.d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(io.grpc.f fVar, io.grpc.e eVar) {
            return new e(fVar, eVar, null);
        }
    }

    class c implements io.grpc.stub.d.a<f> {
        c() {
        }

        @Override // io.grpc.stub.d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(io.grpc.f fVar, io.grpc.e eVar) {
            return new f(fVar, eVar, null);
        }
    }

    public interface d {
        default void b(com.google.internal.firebase.inappmessaging.v1.sdkserving.g gVar, m<com.google.internal.firebase.inappmessaging.v1.sdkserving.i> mVar) {
            io.grpc.stub.l.f(l.b(), mVar);
        }
    }

    public static final class e extends io.grpc.stub.b<e> {
        /* synthetic */ e(io.grpc.f fVar, io.grpc.e eVar, a aVar) {
            this(fVar, eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public e a(io.grpc.f fVar, io.grpc.e eVar) {
            return new e(fVar, eVar);
        }

        public com.google.internal.firebase.inappmessaging.v1.sdkserving.i r(com.google.internal.firebase.inappmessaging.v1.sdkserving.g gVar) {
            return (com.google.internal.firebase.inappmessaging.v1.sdkserving.i) io.grpc.stub.g.j(c(), l.b(), b(), gVar);
        }

        private e(io.grpc.f fVar, io.grpc.e eVar) {
            super(fVar, eVar);
        }
    }

    public static final class f extends io.grpc.stub.c<f> {
        /* synthetic */ f(io.grpc.f fVar, io.grpc.e eVar, a aVar) {
            this(fVar, eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public f a(io.grpc.f fVar, io.grpc.e eVar) {
            return new f(fVar, eVar);
        }

        public t1<com.google.internal.firebase.inappmessaging.v1.sdkserving.i> r(com.google.internal.firebase.inappmessaging.v1.sdkserving.g gVar) {
            return io.grpc.stub.g.m(c().g(l.b(), b()), gVar);
        }

        private f(io.grpc.f fVar, io.grpc.e eVar) {
            super(fVar, eVar);
        }
    }

    public static abstract class g implements io.grpc.c, d {
        @Override // io.grpc.c
        public final t2 a() {
            return l.a(this);
        }
    }

    public static final class h extends io.grpc.stub.a<h> {
        /* synthetic */ h(io.grpc.f fVar, io.grpc.e eVar, a aVar) {
            this(fVar, eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public h a(io.grpc.f fVar, io.grpc.e eVar) {
            return new h(fVar, eVar);
        }

        public void r(com.google.internal.firebase.inappmessaging.v1.sdkserving.g gVar, m<com.google.internal.firebase.inappmessaging.v1.sdkserving.i> mVar) {
            io.grpc.stub.g.e(c().g(l.b(), b()), gVar, mVar);
        }

        private h(io.grpc.f fVar, io.grpc.e eVar) {
            super(fVar, eVar);
        }
    }

    private static final class i<Req, Resp> implements io.grpc.stub.l.h<Req, Resp>, io.grpc.stub.l.e<Req, Resp>, io.grpc.stub.l.b<Req, Resp>, io.grpc.stub.l.a<Req, Resp> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f125674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f125675b;

        i(d dVar, int i10) {
            this.f125674a = dVar;
            this.f125675b = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.stub.l.h, io.grpc.stub.l.i, io.grpc.stub.l.e
        public void a(Req req, m<Resp> mVar) {
            if (this.f125675b != 0) {
                throw new AssertionError();
            }
            this.f125674a.b((com.google.internal.firebase.inappmessaging.v1.sdkserving.g) req, mVar);
        }

        @Override // io.grpc.stub.l.b, io.grpc.stub.l.f, io.grpc.stub.l.a
        public m<Req> b(m<Resp> mVar) {
            throw new AssertionError();
        }
    }

    private l() {
    }

    public static final t2 a(d dVar) {
        return t2.a(c()).a(b(), io.grpc.stub.l.d(new i(dVar, 0))).c();
    }

    @uh.b(fullMethodName = "google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing/FetchEligibleCampaigns", methodType = w1.d.UNARY, requestType = com.google.internal.firebase.inappmessaging.v1.sdkserving.g.class, responseType = com.google.internal.firebase.inappmessaging.v1.sdkserving.i.class)
    public static w1<com.google.internal.firebase.inappmessaging.v1.sdkserving.g, com.google.internal.firebase.inappmessaging.v1.sdkserving.i> b() {
        w1<com.google.internal.firebase.inappmessaging.v1.sdkserving.g, com.google.internal.firebase.inappmessaging.v1.sdkserving.i> w1VarA;
        w1<com.google.internal.firebase.inappmessaging.v1.sdkserving.g, com.google.internal.firebase.inappmessaging.v1.sdkserving.i> w1Var = f125671b;
        if (w1Var != null) {
            return w1Var;
        }
        synchronized (l.class) {
            try {
                w1VarA = f125671b;
                if (w1VarA == null) {
                    w1VarA = w1.p().i(w1.d.UNARY).b(w1.d(f125670a, "FetchEligibleCampaigns")).g(true).d(io.grpc.protobuf.lite.b.b(com.google.internal.firebase.inappmessaging.v1.sdkserving.g.zm())).e(io.grpc.protobuf.lite.b.b(com.google.internal.firebase.inappmessaging.v1.sdkserving.i.om())).a();
                    f125671b = w1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w1VarA;
    }

    public static w2 c() {
        w2 w2VarG;
        w2 w2Var = f125673d;
        if (w2Var != null) {
            return w2Var;
        }
        synchronized (l.class) {
            try {
                w2VarG = f125673d;
                if (w2VarG == null) {
                    w2VarG = w2.d(f125670a).f(b()).g();
                    f125673d = w2VarG;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w2VarG;
    }

    public static e d(io.grpc.f fVar) {
        return (e) io.grpc.stub.b.d(new b(), fVar);
    }

    public static f e(io.grpc.f fVar) {
        return (f) io.grpc.stub.c.d(new c(), fVar);
    }

    public static h f(io.grpc.f fVar) {
        return (h) io.grpc.stub.a.d(new a(), fVar);
    }
}
