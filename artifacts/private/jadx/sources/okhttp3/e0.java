package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okio.b1;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e0 {

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: okhttp3.e0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nokhttp3/RequestBody$Companion$asRequestBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
        public static final class C2354a extends e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f333804a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f333805b;

            C2354a(x xVar, File file) {
                this.f333804a = xVar;
                this.f333805b = file;
            }

            @Override // okhttp3.e0
            public long contentLength() {
                return this.f333805b.length();
            }

            @Override // okhttp3.e0
            @Nullable
            public x contentType() {
                return this.f333804a;
            }

            @Override // okhttp3.e0
            public void writeTo(@NotNull okio.m sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                b1 b1VarT = l0.t(this.f333805b);
                try {
                    sink.Ma(b1VarT);
                    kotlin.io.c.a(b1VarT, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(b1VarT, th2);
                        throw th3;
                    }
                }
            }
        }

        public static final class b extends e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f333806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ okio.o f333807b;

            b(x xVar, okio.o oVar) {
                this.f333806a = xVar;
                this.f333807b = oVar;
            }

            @Override // okhttp3.e0
            public long contentLength() {
                return this.f333807b.v0();
            }

            @Override // okhttp3.e0
            @Nullable
            public x contentType() {
                return this.f333806a;
            }

            @Override // okhttp3.e0
            public void writeTo(@NotNull okio.m sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.U7(this.f333807b);
            }
        }

        public static final class c extends e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f333808a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f333809b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f333810c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f333811d;

            c(x xVar, int i10, byte[] bArr, int i11) {
                this.f333808a = xVar;
                this.f333809b = i10;
                this.f333810c = bArr;
                this.f333811d = i11;
            }

            @Override // okhttp3.e0
            public long contentLength() {
                return this.f333809b;
            }

            @Override // okhttp3.e0
            @Nullable
            public x contentType() {
                return this.f333808a;
            }

            @Override // okhttp3.e0
            public void writeTo(@NotNull okio.m sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f333810c, this.f333811d, this.f333809b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ e0 n(a aVar, File file, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.a(file, xVar);
        }

        public static /* synthetic */ e0 o(a aVar, String str, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.b(str, xVar);
        }

        public static /* synthetic */ e0 p(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ e0 q(a aVar, okio.o oVar, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.i(oVar, xVar);
        }

        public static /* synthetic */ e0 r(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m(bArr, xVar, i10, i11);
        }

        @oj.n
        @oj.i(name = "create")
        @NotNull
        public final e0 a(@NotNull File file, @Nullable x xVar) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C2354a(xVar, file);
        }

        @oj.n
        @oj.i(name = "create")
        @NotNull
        public final e0 b(@NotNull String str, @Nullable x xVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (xVar != null) {
                Charset charsetG = x.g(xVar, null, 1, null);
                if (charsetG == null) {
                    xVar = x.f334808e.d(xVar + "; charset=utf-8");
                } else {
                    charset = charsetG;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return m(bytes, xVar, 0, bytes.length);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.b1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @NotNull
        public final e0 c(@Nullable x xVar, @NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return a(file, xVar);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final e0 d(@Nullable x xVar, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return b(content, xVar);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final e0 e(@Nullable x xVar, @NotNull okio.o content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return i(content, xVar);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @oj.j
        public final e0 f(@Nullable x xVar, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return p(this, xVar, content, 0, 0, 12, null);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @oj.j
        public final e0 g(@Nullable x xVar, @NotNull byte[] content, int i10) {
            Intrinsics.checkNotNullParameter(content, "content");
            int i11 = 6 << 0;
            return p(this, xVar, content, i10, 0, 8, null);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @oj.j
        public final e0 h(@Nullable x xVar, @NotNull byte[] content, int i10, int i11) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m(content, xVar, i10, i11);
        }

        @oj.n
        @oj.i(name = "create")
        @NotNull
        public final e0 i(@NotNull okio.o oVar, @Nullable x xVar) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            return new b(xVar, oVar);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "create")
        public final e0 j(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "create")
        public final e0 k(@NotNull byte[] bArr, @Nullable x xVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return r(this, bArr, xVar, 0, 0, 6, null);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "create")
        public final e0 l(@NotNull byte[] bArr, @Nullable x xVar, int i10) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return r(this, bArr, xVar, i10, 0, 4, null);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "create")
        public final e0 m(@NotNull byte[] bArr, @Nullable x xVar, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            jk.f.n(bArr.length, i10, i11);
            return new c(xVar, i11, bArr, i10);
        }

        private a() {
        }
    }

    @oj.n
    @oj.i(name = "create")
    @NotNull
    public static final e0 create(@NotNull File file, @Nullable x xVar) {
        return Companion.a(file, xVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract x contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull okio.m mVar) throws IOException;

    @oj.n
    @oj.i(name = "create")
    @NotNull
    public static final e0 create(@NotNull String str, @Nullable x xVar) {
        return Companion.b(str, xVar);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.b1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @NotNull
    public static final e0 create(@Nullable x xVar, @NotNull File file) {
        return Companion.c(xVar, file);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final e0 create(@Nullable x xVar, @NotNull String str) {
        return Companion.d(xVar, str);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final e0 create(@Nullable x xVar, @NotNull okio.o oVar) {
        return Companion.e(xVar, oVar);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @oj.j
    public static final e0 create(@Nullable x xVar, @NotNull byte[] bArr) {
        return Companion.f(xVar, bArr);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @oj.j
    public static final e0 create(@Nullable x xVar, @NotNull byte[] bArr, int i10) {
        return Companion.g(xVar, bArr, i10);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @oj.j
    public static final e0 create(@Nullable x xVar, @NotNull byte[] bArr, int i10, int i11) {
        return Companion.h(xVar, bArr, i10, i11);
    }

    @oj.n
    @oj.i(name = "create")
    @NotNull
    public static final e0 create(@NotNull okio.o oVar, @Nullable x xVar) {
        return Companion.i(oVar, xVar);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "create")
    public static final e0 create(@NotNull byte[] bArr) {
        return Companion.j(bArr);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "create")
    public static final e0 create(@NotNull byte[] bArr, @Nullable x xVar) {
        return Companion.k(bArr, xVar);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "create")
    public static final e0 create(@NotNull byte[] bArr, @Nullable x xVar, int i10) {
        return Companion.l(bArr, xVar, i10);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "create")
    public static final e0 create(@NotNull byte[] bArr, @Nullable x xVar, int i10, int i11) {
        return Companion.m(bArr, xVar, i10, i11);
    }
}
