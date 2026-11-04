package io.grpc;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes13.dex */
@gj.b
public final class w1<ReqT, RespT> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f291376k = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f291377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f291378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private final String f291379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c<ReqT> f291380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c<RespT> f291381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.h
    private final Object f291382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f291383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f291384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f291385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicReferenceArray<Object> f291386j;

    public static final class b<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c<ReqT> f291387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c<RespT> f291388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f291389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f291390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f291391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f291392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f291393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f291394h;

        @fj.c
        public w1<ReqT, RespT> a() {
            return new w1<>(this.f291389c, this.f291390d, this.f291387a, this.f291388b, this.f291393g, this.f291391e, this.f291392f, this.f291394h);
        }

        public b<ReqT, RespT> b(String str) {
            this.f291390d = str;
            return this;
        }

        public b<ReqT, RespT> c(boolean z10) {
            this.f291391e = z10;
            if (!z10) {
                this.f291392f = false;
            }
            return this;
        }

        public b<ReqT, RespT> d(c<ReqT> cVar) {
            this.f291387a = cVar;
            return this;
        }

        public b<ReqT, RespT> e(c<RespT> cVar) {
            this.f291388b = cVar;
            return this;
        }

        public b<ReqT, RespT> f(boolean z10) {
            this.f291392f = z10;
            if (z10) {
                this.f291391e = true;
            }
            return this;
        }

        public b<ReqT, RespT> g(boolean z10) {
            this.f291394h = z10;
            return this;
        }

        public b<ReqT, RespT> h(@fj.h Object obj) {
            this.f291393g = obj;
            return this;
        }

        public b<ReqT, RespT> i(d dVar) {
            this.f291389c = dVar;
            return this;
        }

        private b() {
        }
    }

    public interface c<T> {
        T a(InputStream inputStream);

        InputStream b(T t10);
    }

    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean k() {
            if (this != UNARY && this != SERVER_STREAMING) {
                return false;
            }
            return true;
        }

        public final boolean l() {
            if (this != UNARY && this != CLIENT_STREAMING) {
                return false;
            }
            return true;
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public interface e<T> extends f<T> {
        @fj.h
        T d();
    }

    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public interface f<T> extends c<T> {
        Class<T> c();
    }

    @Deprecated
    public static <RequestT, ResponseT> w1<RequestT, ResponseT> a(d dVar, String str, c<RequestT> cVar, c<ResponseT> cVar2) {
        return new w1<>(dVar, str, cVar, cVar2, null, false, false, false);
    }

    @fj.h
    @e0("https://github.com/grpc/grpc-java/issues/5635")
    public static String b(String str) {
        int iLastIndexOf = ((String) com.google.common.base.j0.F(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    @fj.h
    public static String c(String str) {
        int iLastIndexOf = ((String) com.google.common.base.j0.F(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        int i10 = 7 | 0;
        return null;
    }

    public static String d(String str, String str2) {
        return ((String) com.google.common.base.j0.F(str, "fullServiceName")) + "/" + ((String) com.google.common.base.j0.F(str2, "methodName"));
    }

    @fj.c
    public static <ReqT, RespT> b<ReqT, RespT> p() {
        return q(null, null);
    }

    @fj.c
    public static <ReqT, RespT> b<ReqT, RespT> q(c<ReqT> cVar, c<RespT> cVar2) {
        return new b().d(cVar).e(cVar2);
    }

    @fj.h
    @e0("https://github.com/grpc/grpc-java/issues/5635")
    public String e() {
        return b(this.f291378b);
    }

    public String f() {
        return this.f291378b;
    }

    final Object g(int i10) {
        return this.f291386j.get(i10);
    }

    public c<ReqT> h() {
        return this.f291380d;
    }

    public c<RespT> i() {
        return this.f291381e;
    }

    @fj.h
    public Object j() {
        return this.f291382f;
    }

    @fj.h
    @e0("https://github.com/grpc/grpc-java/issues/5635")
    public String k() {
        return this.f291379c;
    }

    public d l() {
        return this.f291377a;
    }

    public boolean m() {
        return this.f291383g;
    }

    public boolean n() {
        return this.f291384h;
    }

    public boolean o() {
        return this.f291385i;
    }

    public ReqT r(InputStream inputStream) {
        return this.f291380d.a(inputStream);
    }

    public RespT s(InputStream inputStream) {
        return this.f291381e.a(inputStream);
    }

    final void t(int i10, Object obj) {
        this.f291386j.lazySet(i10, obj);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("fullMethodName", this.f291378b).f("type", this.f291377a).g("idempotent", this.f291383g).g("safe", this.f291384h).g("sampledToLocalTracing", this.f291385i).f("requestMarshaller", this.f291380d).f("responseMarshaller", this.f291381e).f("schemaDescriptor", this.f291382f).v().toString();
    }

    public InputStream u(ReqT reqt) {
        return this.f291380d.b(reqt);
    }

    public InputStream v(RespT respt) {
        return this.f291381e.b(respt);
    }

    @fj.c
    public b<ReqT, RespT> w() {
        return (b<ReqT, RespT>) x(this.f291380d, this.f291381e);
    }

    @fj.c
    public <NewReqT, NewRespT> b<NewReqT, NewRespT> x(c<NewReqT> cVar, c<NewRespT> cVar2) {
        return p().d(cVar).e(cVar2).i(this.f291377a).b(this.f291378b).c(this.f291383g).f(this.f291384h).g(this.f291385i).h(this.f291382f);
    }

    private w1(d dVar, String str, c<ReqT> cVar, c<RespT> cVar2, Object obj, boolean z10, boolean z11, boolean z12) {
        this.f291386j = new AtomicReferenceArray<>(2);
        this.f291377a = (d) com.google.common.base.j0.F(dVar, "type");
        this.f291378b = (String) com.google.common.base.j0.F(str, "fullMethodName");
        this.f291379c = c(str);
        this.f291380d = (c) com.google.common.base.j0.F(cVar, "requestMarshaller");
        this.f291381e = (c) com.google.common.base.j0.F(cVar2, "responseMarshaller");
        this.f291382f = obj;
        this.f291383g = z10;
        this.f291384h = z11;
        this.f291385i = z12;
    }
}
