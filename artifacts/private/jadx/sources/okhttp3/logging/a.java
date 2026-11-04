package okhttp3.logging;

import com.google.common.net.d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.l;
import kotlin.n;
import kotlin.text.StringsKt;
import oj.f;
import oj.i;
import oj.j;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.http.e;
import okhttp3.internal.platform.h;
import okhttp3.u;
import okhttp3.w;
import okhttp3.x;
import okio.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f334701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private volatile Set<String> f334702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private volatile EnumC2372a f334703d;

    /* JADX INFO: renamed from: okhttp3.logging.a$a, reason: collision with other inner class name */
    public enum EnumC2372a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2373a f334709a = C2373a.f334711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @f
        @NotNull
        public static final b f334710b = new C2373a.C2374a();

        /* JADX INFO: renamed from: okhttp3.logging.a$b$a, reason: collision with other inner class name */
        public static final class C2373a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ C2373a f334711a = new C2373a();

            /* JADX INFO: renamed from: okhttp3.logging.a$b$a$a, reason: collision with other inner class name */
            private static final class C2374a implements b {
                @Override // okhttp3.logging.a.b
                public void a(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    h.n(h.f334560a.g(), message, 0, null, 6, null);
                }
            }

            private C2373a() {
            }
        }

        void a(@NotNull String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean b(u uVar) {
        String strK = uVar.k(d.f119476b0);
        return (strK == null || StringsKt.N1(strK, "identity", true) || StringsKt.N1(strK, "gzip", true)) ? false : true;
    }

    private final void e(u uVar, int i10) {
        String strW = this.f334702c.contains(uVar.n(i10)) ? "██" : uVar.w(i10);
        this.f334701b.a(uVar.n(i10) + ": " + strW);
    }

    @l(level = n.ERROR, message = "moved to var", replaceWith = @b1(expression = "level", imports = {}))
    @i(name = "-deprecated_level")
    @NotNull
    public final EnumC2372a a() {
        return this.f334703d;
    }

    @NotNull
    public final EnumC2372a c() {
        return this.f334703d;
    }

    @i(name = "level")
    public final void d(@NotNull EnumC2372a enumC2372a) {
        Intrinsics.checkNotNullParameter(enumC2372a, "<set-?>");
        this.f334703d = enumC2372a;
    }

    public final void f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TreeSet treeSet = new TreeSet(StringsKt.T1(q1.f312784a));
        CollectionsKt.addAll(treeSet, this.f334702c);
        treeSet.add(name);
        this.f334702c = treeSet;
    }

    @NotNull
    public final a g(@NotNull EnumC2372a level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.f334703d = level;
        return this;
    }

    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws Exception {
        String string;
        long j10;
        char c10;
        String string2;
        Charset UTF_8;
        Charset UTF_9;
        Intrinsics.checkNotNullParameter(chain, "chain");
        EnumC2372a enumC2372a = this.f334703d;
        d0 d0VarRequest = chain.request();
        if (enumC2372a == EnumC2372a.NONE) {
            return chain.c(d0VarRequest);
        }
        boolean z10 = enumC2372a == EnumC2372a.BODY;
        boolean z11 = z10 || enumC2372a == EnumC2372a.HEADERS;
        e0 e0VarF = d0VarRequest.f();
        okhttp3.j jVarD = chain.d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(d0VarRequest.m());
        sb2.append(' ');
        sb2.append(d0VarRequest.q());
        if (jVarD != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(jVarD.a());
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        String string3 = sb2.toString();
        if (!z11 && e0VarF != null) {
            string3 = string3 + " (" + e0VarF.contentLength() + "-byte body)";
        }
        this.f334701b.a(string3);
        if (z11) {
            u uVarK = d0VarRequest.k();
            j10 = -1;
            if (e0VarF != null) {
                x xVarContentType = e0VarF.contentType();
                if (xVarContentType != null && uVarK.k("Content-Type") == null) {
                    this.f334701b.a("Content-Type: " + xVarContentType);
                }
                if (e0VarF.contentLength() != -1 && uVarK.k("Content-Length") == null) {
                    this.f334701b.a("Content-Length: " + e0VarF.contentLength());
                }
            }
            int size = uVarK.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(uVarK, i10);
            }
            if (!z10 || e0VarF == null) {
                this.f334701b.a("--> END " + d0VarRequest.m());
            } else if (b(d0VarRequest.k())) {
                this.f334701b.a("--> END " + d0VarRequest.m() + " (encoded body omitted)");
            } else if (e0VarF.isDuplex()) {
                this.f334701b.a("--> END " + d0VarRequest.m() + " (duplex request body omitted)");
            } else if (e0VarF.isOneShot()) {
                this.f334701b.a("--> END " + d0VarRequest.m() + " (one-shot body omitted)");
            } else {
                okio.l lVar = new okio.l();
                e0VarF.writeTo(lVar);
                x xVarContentType2 = e0VarF.contentType();
                if (xVarContentType2 == null || (UTF_9 = xVarContentType2.f(StandardCharsets.UTF_8)) == null) {
                    UTF_9 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                }
                this.f334701b.a("");
                if (c.a(lVar)) {
                    this.f334701b.a(lVar.b7(UTF_9));
                    this.f334701b.a("--> END " + d0VarRequest.m() + " (" + e0VarF.contentLength() + "-byte body)");
                } else {
                    this.f334701b.a("--> END " + d0VarRequest.m() + " (binary " + e0VarF.contentLength() + "-byte body omitted)");
                }
            }
        } else {
            j10 = -1;
        }
        long jNanoTime = System.nanoTime();
        try {
            f0 f0VarC = chain.c(d0VarRequest);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            g0 g0VarR = f0VarC.r();
            Intrinsics.checkNotNull(g0VarR);
            long jContentLength = g0VarR.contentLength();
            String str = jContentLength != j10 ? jContentLength + "-byte" : "unknown-length";
            b bVar = this.f334701b;
            StringBuilder sb4 = new StringBuilder();
            boolean z12 = z11;
            sb4.append("<-- ");
            sb4.append(f0VarC.E());
            if (f0VarC.f0().length() == 0) {
                string2 = "";
                c10 = ' ';
            } else {
                String strF0 = f0VarC.f0();
                StringBuilder sb5 = new StringBuilder();
                c10 = ' ';
                sb5.append(' ');
                sb5.append(strF0);
                string2 = sb5.toString();
            }
            sb4.append(string2);
            sb4.append(c10);
            sb4.append(f0VarC.x0().q());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(z12 ? "" : ", " + str + " body");
            sb4.append(')');
            bVar.a(sb4.toString());
            if (z12) {
                u uVarY = f0VarC.Y();
                int size2 = uVarY.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    e(uVarY, i11);
                }
                if (z10 && e.c(f0VarC)) {
                    if (b(f0VarC.Y())) {
                        this.f334701b.a("<-- END HTTP (encoded body omitted)");
                        return f0VarC;
                    }
                    okio.n nVarSource = g0VarR.source();
                    nVarSource.request(Long.MAX_VALUE);
                    okio.l lVarN = nVarSource.n();
                    Long l10 = null;
                    if (StringsKt.N1("gzip", uVarY.k(d.f119476b0), true)) {
                        Long lValueOf = Long.valueOf(lVarN.size());
                        b0 b0Var = new b0(lVarN.clone());
                        try {
                            lVarN = new okio.l();
                            lVarN.Ma(b0Var);
                            kotlin.io.c.a(b0Var, null);
                            l10 = lValueOf;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                kotlin.io.c.a(b0Var, th2);
                                throw th3;
                            }
                        }
                    }
                    x xVarContentType3 = g0VarR.contentType();
                    if (xVarContentType3 == null || (UTF_8 = xVarContentType3.f(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!c.a(lVarN)) {
                        this.f334701b.a("");
                        this.f334701b.a("<-- END HTTP (binary " + lVarN.size() + "-byte body omitted)");
                        return f0VarC;
                    }
                    if (jContentLength != 0) {
                        this.f334701b.a("");
                        this.f334701b.a(lVarN.clone().b7(UTF_8));
                    }
                    if (l10 == null) {
                        this.f334701b.a("<-- END HTTP (" + lVarN.size() + "-byte body)");
                        return f0VarC;
                    }
                    this.f334701b.a("<-- END HTTP (" + lVarN.size() + "-byte, " + l10 + "-gzipped-byte body)");
                    return f0VarC;
                }
                this.f334701b.a("<-- END HTTP");
            }
            return f0VarC;
        } catch (Exception e10) {
            this.f334701b.a("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }

    @j
    public a(@NotNull b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f334701b = logger;
        this.f334702c = SetsKt.emptySet();
        this.f334703d = EnumC2372a.NONE;
    }

    public /* synthetic */ a(b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? b.f334710b : bVar);
    }
}
