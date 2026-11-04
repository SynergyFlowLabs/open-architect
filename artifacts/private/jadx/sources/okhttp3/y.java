package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f334817f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final x f334818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final x f334819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final x f334820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final x f334821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final x f334822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final byte[] f334823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final byte[] f334824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final byte[] f334825n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.o f334826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f334827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<c> f334828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final x f334829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f334830e;

    @SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okio.o f334831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private x f334832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<c> f334833c;

        /* JADX WARN: Multi-variable type inference failed */
        @oj.j
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            d(c.f334834c.c(name, value));
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @Nullable String str, @NotNull e0 body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            d(c.f334834c.d(name, str, body));
            return this;
        }

        @NotNull
        public final a c(@Nullable u uVar, @NotNull e0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            d(c.f334834c.a(uVar, body));
            return this;
        }

        @NotNull
        public final a d(@NotNull c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f334833c.add(part);
            return this;
        }

        @NotNull
        public final a e(@NotNull e0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            d(c.f334834c.b(body));
            return this;
        }

        @NotNull
        public final y f() {
            if (this.f334833c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new y(this.f334831a, this.f334832b, jk.f.h0(this.f334833c));
        }

        @NotNull
        public final a g(@NotNull x type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.l(), io.ktor.http.m.g.f296038b)) {
                this.f334832b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        @oj.j
        public a(@NotNull String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f334831a = okio.o.f335046d.l(boundary);
            this.f334832b = y.f334818g;
            this.f334833c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull StringBuilder sb2, @NotNull String key) {
            Intrinsics.checkNotNullParameter(sb2, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(cCharAt);
                }
            }
            sb2.append('\"');
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f334834c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final u f334835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final e0 f334836b;

        @SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            @NotNull
            public final c a(@Nullable u uVar, @NotNull e0 body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((uVar != null ? uVar.k("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((uVar != null ? uVar.k("Content-Length") : null) == null) {
                    return new c(uVar, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            @oj.n
            @NotNull
            public final c b(@NotNull e0 body) {
                Intrinsics.checkNotNullParameter(body, "body");
                return a(null, body);
            }

            @oj.n
            @NotNull
            public final c c(@NotNull String name, @NotNull String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return d(name, null, e0.a.o(e0.Companion, value, null, 1, null));
            }

            @oj.n
            @NotNull
            public final c d(@NotNull String name, @Nullable String str, @NotNull e0 body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = y.f334817f;
                bVar.a(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.a(sb2, str);
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return a(new u.a().h(com.google.common.net.d.f119472a0, string).i(), body);
            }

            private a() {
            }
        }

        public /* synthetic */ c(u uVar, e0 e0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(uVar, e0Var);
        }

        @oj.n
        @NotNull
        public static final c d(@Nullable u uVar, @NotNull e0 e0Var) {
            return f334834c.a(uVar, e0Var);
        }

        @oj.n
        @NotNull
        public static final c e(@NotNull e0 e0Var) {
            return f334834c.b(e0Var);
        }

        @oj.n
        @NotNull
        public static final c f(@NotNull String str, @NotNull String str2) {
            return f334834c.c(str, str2);
        }

        @oj.n
        @NotNull
        public static final c g(@NotNull String str, @Nullable String str2, @NotNull e0 e0Var) {
            return f334834c.d(str, str2, e0Var);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "body", imports = {}))
        @oj.i(name = "-deprecated_body")
        @NotNull
        public final e0 a() {
            return this.f334836b;
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "headers", imports = {}))
        @oj.i(name = "-deprecated_headers")
        @Nullable
        public final u b() {
            return this.f334835a;
        }

        @oj.i(name = "body")
        @NotNull
        public final e0 c() {
            return this.f334836b;
        }

        @oj.i(name = "headers")
        @Nullable
        public final u h() {
            return this.f334835a;
        }

        private c(u uVar, e0 e0Var) {
            this.f334835a = uVar;
            this.f334836b = e0Var;
        }
    }

    static {
        x.a aVar = x.f334808e;
        f334818g = aVar.c("multipart/mixed");
        f334819h = aVar.c("multipart/alternative");
        f334820i = aVar.c("multipart/digest");
        f334821j = aVar.c("multipart/parallel");
        f334822k = aVar.c(androidx.browser.trusted.sharing.b.f12045l);
        f334823l = new byte[]{58, 32};
        f334824m = new byte[]{com.google.common.base.c.f116462o, 10};
        f334825n = new byte[]{45, 45};
    }

    public y(@NotNull okio.o boundaryByteString, @NotNull x type, @NotNull List<c> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f334826a = boundaryByteString;
        this.f334827b = type;
        this.f334828c = parts;
        this.f334829d = x.f334808e.c(type + "; boundary=" + e());
        this.f334830e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(okio.m mVar, boolean z10) throws IOException {
        okio.l lVar;
        if (z10) {
            mVar = new okio.l();
            lVar = mVar;
        } else {
            lVar = 0;
        }
        int size = this.f334828c.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.f334828c.get(i10);
            u uVarH = cVar.h();
            e0 e0VarC = cVar.c();
            Intrinsics.checkNotNull(mVar);
            mVar.write(f334825n);
            mVar.U7(this.f334826a);
            mVar.write(f334824m);
            if (uVarH != null) {
                int size2 = uVarH.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    mVar.pa(uVarH.n(i11)).write(f334823l).pa(uVarH.w(i11)).write(f334824m);
                }
            }
            x xVarContentType = e0VarC.contentType();
            if (xVarContentType != null) {
                mVar.pa("Content-Type: ").pa(xVarContentType.toString()).write(f334824m);
            }
            long jContentLength = e0VarC.contentLength();
            if (jContentLength != -1) {
                mVar.pa("Content-Length: ").h5(jContentLength).write(f334824m);
            } else if (z10) {
                Intrinsics.checkNotNull(lVar);
                lVar.c();
                return -1L;
            }
            byte[] bArr = f334824m;
            mVar.write(bArr);
            if (z10) {
                j10 += jContentLength;
            } else {
                e0VarC.writeTo(mVar);
            }
            mVar.write(bArr);
        }
        Intrinsics.checkNotNull(mVar);
        byte[] bArr2 = f334825n;
        mVar.write(bArr2);
        mVar.U7(this.f334826a);
        mVar.write(bArr2);
        mVar.write(f334824m);
        if (!z10) {
            return j10;
        }
        Intrinsics.checkNotNull(lVar);
        long size3 = j10 + lVar.size();
        lVar.c();
        return size3;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "boundary", imports = {}))
    @oj.i(name = "-deprecated_boundary")
    @NotNull
    public final String a() {
        return e();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "parts", imports = {}))
    @oj.i(name = "-deprecated_parts")
    @NotNull
    public final List<c> b() {
        return this.f334828c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    @oj.i(name = "-deprecated_size")
    public final int c() {
        return h();
    }

    @Override // okhttp3.e0
    public long contentLength() throws IOException {
        long j10 = this.f334830e;
        if (j10 == -1) {
            j10 = j(null, true);
            this.f334830e = j10;
        }
        return j10;
    }

    @Override // okhttp3.e0
    @NotNull
    public x contentType() {
        return this.f334829d;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "type", imports = {}))
    @oj.i(name = "-deprecated_type")
    @NotNull
    public final x d() {
        return this.f334827b;
    }

    @oj.i(name = "boundary")
    @NotNull
    public final String e() {
        return this.f334826a.G0();
    }

    @NotNull
    public final c f(int i10) {
        return this.f334828c.get(i10);
    }

    @oj.i(name = "parts")
    @NotNull
    public final List<c> g() {
        return this.f334828c;
    }

    @oj.i(name = "size")
    public final int h() {
        return this.f334828c.size();
    }

    @oj.i(name = "type")
    @NotNull
    public final x i() {
        return this.f334827b;
    }

    @Override // okhttp3.e0
    public void writeTo(@NotNull okio.m sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        j(sink, false);
    }
}
