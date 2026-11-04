package okhttp3;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f334754c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final x f334755d = x.f334808e.c("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f334756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<String> f334757b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Charset f334758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<String> f334759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<String> f334760c;

        /* JADX WARN: Multi-variable type inference failed */
        @oj.j
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = this.f334759b;
            v.b bVar = v.f334772k;
            list.add(v.b.f(bVar, name, 0, 0, v.f334782u, false, false, true, false, this.f334758a, 91, null));
            this.f334760c.add(v.b.f(bVar, value, 0, 0, v.f334782u, false, false, true, false, this.f334758a, 91, null));
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = this.f334759b;
            v.b bVar = v.f334772k;
            list.add(v.b.f(bVar, name, 0, 0, v.f334782u, true, false, true, false, this.f334758a, 83, null));
            this.f334760c.add(v.b.f(bVar, value, 0, 0, v.f334782u, true, false, true, false, this.f334758a, 83, null));
            return this;
        }

        @NotNull
        public final s c() {
            return new s(this.f334759b, this.f334760c);
        }

        @oj.j
        public a(@Nullable Charset charset) {
            this.f334758a = charset;
            this.f334759b = new ArrayList();
            this.f334760c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                charset = null;
                int i11 = 6 << 0;
            }
            this(charset);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public s(@NotNull List<String> encodedNames, @NotNull List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f334756a = jk.f.h0(encodedNames);
        this.f334757b = jk.f.h0(encodedValues);
    }

    private final long g(okio.m mVar, boolean z10) throws EOFException {
        okio.l lVarN;
        if (z10) {
            lVarN = new okio.l();
        } else {
            Intrinsics.checkNotNull(mVar);
            lVarN = mVar.n();
        }
        int size = this.f334756a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                lVarN.writeByte(38);
            }
            lVarN.pa(this.f334756a.get(i10));
            lVarN.writeByte(61);
            lVarN.pa(this.f334757b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = lVarN.size();
        lVarN.c();
        return size2;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    @oj.i(name = "-deprecated_size")
    public final int a() {
        return e();
    }

    @NotNull
    public final String b(int i10) {
        return this.f334756a.get(i10);
    }

    @NotNull
    public final String c(int i10) {
        return this.f334757b.get(i10);
    }

    @Override // okhttp3.e0
    public long contentLength() {
        return g(null, true);
    }

    @Override // okhttp3.e0
    @NotNull
    public x contentType() {
        return f334755d;
    }

    @NotNull
    public final String d(int i10) {
        return v.b.n(v.f334772k, b(i10), 0, 0, true, 3, null);
    }

    @oj.i(name = "size")
    public final int e() {
        return this.f334756a.size();
    }

    @NotNull
    public final String f(int i10) {
        return v.b.n(v.f334772k, c(i10), 0, 0, true, 3, null);
    }

    @Override // okhttp3.e0
    public void writeTo(@NotNull okio.m sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        g(sink, false);
    }
}
