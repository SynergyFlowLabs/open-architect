package okhttp3;

import androidx.collection.g3;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
public abstract class g0 implements Closeable {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private Reader reader;

    @SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okio.n f333850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Charset f333851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f333852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Reader f333853d;

        public a(@NotNull okio.n source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f333850a = source;
            this.f333851b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.f333852c = true;
            Reader reader = this.f333853d;
            if (reader != null) {
                reader.close();
                unit = Unit.f312394a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f333850a.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f333852c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f333853d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f333850a.rf(), jk.f.T(this.f333850a, this.f333851b));
                this.f333853d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    public static final class b {

        public static final class a extends g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f333854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f333855b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ okio.n f333856c;

            a(x xVar, long j10, okio.n nVar) {
                this.f333854a = xVar;
                this.f333855b = j10;
                this.f333856c = nVar;
            }

            @Override // okhttp3.g0
            public long contentLength() {
                return this.f333855b;
            }

            @Override // okhttp3.g0
            @Nullable
            public x contentType() {
                return this.f333854a;
            }

            @Override // okhttp3.g0
            @NotNull
            public okio.n source() {
                return this.f333856c;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ g0 i(b bVar, String str, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.a(str, xVar);
        }

        public static /* synthetic */ g0 j(b bVar, okio.n nVar, x xVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return bVar.f(nVar, xVar, j10);
        }

        public static /* synthetic */ g0 k(b bVar, okio.o oVar, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.g(oVar, xVar);
        }

        public static /* synthetic */ g0 l(b bVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.h(bArr, xVar);
        }

        @oj.n
        @oj.i(name = "create")
        @NotNull
        public final g0 a(@NotNull String str, @Nullable x xVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (xVar != null) {
                int i10 = 2 & 1;
                Charset charsetG = x.g(xVar, null, 1, null);
                if (charsetG == null) {
                    xVar = x.f334808e.d(xVar + "; charset=utf-8");
                } else {
                    charset = charsetG;
                }
            }
            okio.l lVarMd = new okio.l().Md(str, charset);
            return f(lVarMd, xVar, lVarMd.size());
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @NotNull
        public final g0 b(@Nullable x xVar, long j10, @NotNull okio.n content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return f(content, xVar, j10);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final g0 c(@Nullable x xVar, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, xVar);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final g0 d(@Nullable x xVar, @NotNull okio.o content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return g(content, xVar);
        }

        @oj.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final g0 e(@Nullable x xVar, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, xVar);
        }

        @oj.n
        @oj.i(name = "create")
        @NotNull
        public final g0 f(@NotNull okio.n nVar, @Nullable x xVar, long j10) {
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            return new a(xVar, j10, nVar);
        }

        @oj.n
        @oj.i(name = "create")
        @NotNull
        public final g0 g(@NotNull okio.o oVar, @Nullable x xVar) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            return f(new okio.l().U7(oVar), xVar, oVar.v0());
        }

        @oj.n
        @oj.i(name = "create")
        @NotNull
        public final g0 h(@NotNull byte[] bArr, @Nullable x xVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return f(new okio.l().write(bArr), xVar, bArr.length);
        }

        private b() {
        }
    }

    private final Charset a() {
        Charset charsetF;
        x xVarContentType = contentType();
        return (xVarContentType == null || (charsetF = xVarContentType.f(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetF;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Object] */
    private final <T> T b(Function1<? super okio.n, ? extends T> function1, Function1<? super T, Integer> function2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > g3.f12256c) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        okio.n nVarSource = source();
        try {
            T tInvoke = function1.invoke(nVarSource);
            kotlin.jvm.internal.h0.d(1);
            kotlin.io.c.a(nVarSource, null);
            kotlin.jvm.internal.h0.c(1);
            int iIntValue = function2.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.io.c.a(nVarSource, th2);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
    }

    @oj.n
    @oj.i(name = "create")
    @NotNull
    public static final g0 create(@NotNull String str, @Nullable x xVar) {
        return Companion.a(str, xVar);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().rf();
    }

    @NotNull
    public final okio.o byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > g3.f12256c) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        okio.n nVarSource = source();
        try {
            okio.o oVarR7 = nVarSource.r7();
            kotlin.io.c.a(nVarSource, null);
            int iV0 = oVarR7.v0();
            if (jContentLength == -1 || jContentLength == iV0) {
                return oVarR7;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iV0 + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(nVarSource, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > g3.f12256c) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        okio.n nVarSource = source();
        try {
            byte[] bArrY5 = nVarSource.Y5();
            kotlin.io.c.a(nVarSource, null);
            int length = bArrY5.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrY5;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(nVarSource, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), a());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jk.f.o(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract x contentType();

    @NotNull
    public abstract okio.n source();

    @NotNull
    public final String string() throws IOException {
        okio.n nVarSource = source();
        try {
            String strB7 = nVarSource.b7(jk.f.T(nVarSource, a()));
            kotlin.io.c.a(nVarSource, null);
            return strB7;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(nVarSource, th2);
                throw th3;
            }
        }
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @NotNull
    public static final g0 create(@Nullable x xVar, long j10, @NotNull okio.n nVar) {
        return Companion.b(xVar, j10, nVar);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final g0 create(@Nullable x xVar, @NotNull String str) {
        return Companion.c(xVar, str);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final g0 create(@Nullable x xVar, @NotNull okio.o oVar) {
        return Companion.d(xVar, oVar);
    }

    @oj.n
    @kotlin.l(level = kotlin.n.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final g0 create(@Nullable x xVar, @NotNull byte[] bArr) {
        return Companion.e(xVar, bArr);
    }

    @oj.n
    @oj.i(name = "create")
    @NotNull
    public static final g0 create(@NotNull okio.n nVar, @Nullable x xVar, long j10) {
        return Companion.f(nVar, xVar, j10);
    }

    @oj.n
    @oj.i(name = "create")
    @NotNull
    public static final g0 create(@NotNull okio.o oVar, @Nullable x xVar) {
        return Companion.g(oVar, xVar);
    }

    @oj.n
    @oj.i(name = "create")
    @NotNull
    public static final g0 create(@NotNull byte[] bArr, @Nullable x xVar) {
        return Companion.h(bArr, xVar);
    }
}
