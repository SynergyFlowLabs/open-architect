package okhttp3;

import androidx.collection.g3;
import com.superwall.sdk.network.Api;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.b1;
import okio.l0;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b f333721g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f333722h = 201105;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f333723i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f333724j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f333725k = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.cache.d f333726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f333727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f333728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f333729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f333730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f333731f;

    private static final class a extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okhttp3.internal.cache.d.C2356d f333732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f333733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f333734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final okio.n f333735d;

        /* JADX INFO: renamed from: okhttp3.c$a$a, reason: collision with other inner class name */
        public static final class C2352a extends okio.y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f333736a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2352a(b1 b1Var, a aVar) {
                super(b1Var);
                this.f333736a = aVar;
            }

            @Override // okio.y, okio.b1, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f333736a.c().close();
                super.close();
            }
        }

        public a(@NotNull okhttp3.internal.cache.d.C2356d snapshot, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f333732a = snapshot;
            this.f333733b = str;
            this.f333734c = str2;
            this.f333735d = l0.e(new C2352a(snapshot.c(1), this));
        }

        @NotNull
        public final okhttp3.internal.cache.d.C2356d c() {
            return this.f333732a;
        }

        @Override // okhttp3.g0
        public long contentLength() {
            String str = this.f333734c;
            return str != null ? jk.f.j0(str, -1L) : -1L;
        }

        @Override // okhttp3.g0
        @Nullable
        public x contentType() {
            String str = this.f333733b;
            if (str != null) {
                return x.f334808e.d(str);
            }
            return null;
        }

        @Override // okhttp3.g0
        @NotNull
        public okio.n source() {
            return this.f333735d;
        }
    }

    @SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> d(u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (StringsKt.N1(com.google.common.net.d.N0, uVar.n(i10), true)) {
                    String strW = uVar.w(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.T1(q1.f312784a));
                    }
                    Iterator it = StringsKt.T4(strW, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.E5((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? SetsKt.emptySet() : treeSet;
        }

        private final u e(u uVar, u uVar2) {
            Set<String> setD = d(uVar2);
            if (setD.isEmpty()) {
                return jk.f.f307484b;
            }
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strN = uVar.n(i10);
                if (setD.contains(strN)) {
                    aVar.b(strN, uVar.w(i10));
                }
            }
            return aVar.i();
        }

        public final boolean a(@NotNull f0 f0Var) {
            Intrinsics.checkNotNullParameter(f0Var, "<this>");
            return d(f0Var.Y()).contains("*");
        }

        @oj.n
        @NotNull
        public final String b(@NotNull v url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return okio.o.f335046d.l(url.toString()).j0().N();
        }

        public final int c(@NotNull okio.n source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long jDd = source.dd();
                String strLb = source.lb();
                if (jDd >= 0 && jDd <= g3.f12256c && strLb.length() <= 0) {
                    return (int) jDd;
                }
                throw new IOException("expected an int but was \"" + jDd + strLb + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        @NotNull
        public final u f(@NotNull f0 f0Var) {
            Intrinsics.checkNotNullParameter(f0Var, "<this>");
            f0 f0VarG0 = f0Var.g0();
            Intrinsics.checkNotNull(f0VarG0);
            return e(f0VarG0.x0().k(), f0Var.Y());
        }

        public final boolean g(@NotNull f0 cachedResponse, @NotNull u cachedRequest, @NotNull d0 newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.Y());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!Intrinsics.areEqual(cachedRequest.A(str), newRequest.j(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    private final class d implements okhttp3.internal.cache.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okhttp3.internal.cache.d.b f333750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final z0 f333751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final z0 f333752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f333753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f333754e;

        public static final class a extends okio.x {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f333755b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f333756c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, d dVar, z0 z0Var) {
                super(z0Var);
                this.f333755b = cVar;
                this.f333756c = dVar;
            }

            @Override // okio.x, okio.z0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                c cVar = this.f333755b;
                d dVar = this.f333756c;
                synchronized (cVar) {
                    try {
                        if (dVar.c()) {
                            return;
                        }
                        dVar.d(true);
                        cVar.H(cVar.j() + 1);
                        super.close();
                        this.f333756c.f333750a.b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public d(@NotNull c cVar, okhttp3.internal.cache.d.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f333754e = cVar;
            this.f333750a = editor;
            z0 z0VarF = editor.f(1);
            this.f333751b = z0VarF;
            this.f333752c = new a(cVar, this, z0VarF);
        }

        @Override // okhttp3.internal.cache.b
        @NotNull
        public z0 a() {
            return this.f333752c;
        }

        @Override // okhttp3.internal.cache.b
        public void abort() {
            c cVar = this.f333754e;
            synchronized (cVar) {
                try {
                    if (this.f333753d) {
                        return;
                    }
                    this.f333753d = true;
                    cVar.E(cVar.h() + 1);
                    jk.f.o(this.f333751b);
                    try {
                        this.f333750a.a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean c() {
            return this.f333753d;
        }

        public final void d(boolean z10) {
            this.f333753d = z10;
        }
    }

    @SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"})
    public static final class e implements Iterator<String>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Iterator<okhttp3.internal.cache.d.C2356d> f333757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f333758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f333759c;

        e(c cVar) {
            this.f333757a = cVar.g().y0();
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f333758b;
            Intrinsics.checkNotNull(str);
            this.f333758b = null;
            this.f333759c = true;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f333758b != null) {
                return true;
            }
            this.f333759c = false;
            while (this.f333757a.hasNext()) {
                try {
                    okhttp3.internal.cache.d.C2356d next = this.f333757a.next();
                    try {
                        continue;
                        this.f333758b = l0.e(next.c(0)).lb();
                        kotlin.io.c.a(next, null);
                        return true;
                    } catch (Throwable th2) {
                        try {
                            continue;
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(next, th2);
                            throw th3;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f333759c) {
                throw new IllegalStateException("remove() before next()");
            }
            this.f333757a.remove();
        }
    }

    public c(@NotNull File directory, long j10, @NotNull okhttp3.internal.io.a fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f333726a = new okhttp3.internal.cache.d(fileSystem, directory, f333722h, 2, j10, okhttp3.internal.concurrent.d.f334058i);
    }

    private final void b(okhttp3.internal.cache.d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    @oj.n
    @NotNull
    public static final String o(@NotNull v vVar) {
        return f333721g.b(vVar);
    }

    public final void E(int i10) {
        this.f333728c = i10;
    }

    public final void H(int i10) {
        this.f333727b = i10;
    }

    public final synchronized void I() {
        try {
            this.f333730e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void N(@NotNull okhttp3.internal.cache.c cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.f333731f++;
            if (cacheStrategy.b() != null) {
                this.f333729d++;
            } else if (cacheStrategy.a() != null) {
                this.f333730e++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void R(@NotNull f0 cached, @NotNull f0 network) {
        okhttp3.internal.cache.d.b bVarA;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        C2353c c2353c = new C2353c(network);
        g0 g0VarR = cached.r();
        Intrinsics.checkNotNull(g0VarR, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarA = ((a) g0VarR).c().a();
            if (bVarA == null) {
                return;
            }
            try {
                c2353c.f(bVarA);
                bVarA.b();
            } catch (IOException unused) {
                b(bVarA);
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    @NotNull
    public final Iterator<String> T() throws IOException {
        return new e(this);
    }

    public final synchronized int X() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f333728c;
    }

    public final synchronized int Y() {
        try {
        } finally {
        }
        return this.f333727b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "directory", imports = {}))
    @oj.i(name = "-deprecated_directory")
    @NotNull
    public final File a() {
        return this.f333726a.E();
    }

    public final void c() throws IOException {
        this.f333726a.m();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f333726a.close();
    }

    @oj.i(name = "directory")
    @NotNull
    public final File d() {
        return this.f333726a.E();
    }

    public final void e() throws IOException {
        this.f333726a.t();
    }

    @Nullable
    public final f0 f(@NotNull d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            okhttp3.internal.cache.d.C2356d c2356dX = this.f333726a.x(f333721g.b(request.q()));
            if (c2356dX == null) {
                return null;
            }
            try {
                C2353c c2353c = new C2353c(c2356dX.c(0));
                f0 f0VarD = c2353c.d(c2356dX);
                if (c2353c.b(request, f0VarD)) {
                    return f0VarD;
                }
                g0 g0VarR = f0VarD.r();
                if (g0VarR != null) {
                    jk.f.o(g0VarR);
                }
                return null;
            } catch (IOException unused) {
                jk.f.o(c2356dX);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f333726a.flush();
    }

    @NotNull
    public final okhttp3.internal.cache.d g() {
        return this.f333726a;
    }

    public final int h() {
        return this.f333728c;
    }

    public final boolean isClosed() {
        return this.f333726a.isClosed();
    }

    public final int j() {
        return this.f333727b;
    }

    public final synchronized int l() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f333730e;
    }

    public final void m() throws IOException {
        this.f333726a.T();
    }

    public final long q() {
        return this.f333726a.N();
    }

    public final synchronized int r() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f333729d;
    }

    public final long size() throws IOException {
        return this.f333726a.size();
    }

    @Nullable
    public final okhttp3.internal.cache.b t(@NotNull f0 response) {
        okhttp3.internal.cache.d.b bVarR;
        Intrinsics.checkNotNullParameter(response, "response");
        String strM = response.x0().m();
        if (okhttp3.internal.http.f.f334185a.a(response.x0().m())) {
            try {
                x(response.x0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(strM, "GET")) {
            return null;
        }
        b bVar = f333721g;
        if (bVar.a(response)) {
            return null;
        }
        C2353c c2353c = new C2353c(response);
        try {
            int i10 = 0 >> 0;
            bVarR = okhttp3.internal.cache.d.r(this.f333726a, bVar.b(response.x0().q()), 0L, 2, null);
            if (bVarR == null) {
                return null;
            }
            try {
                c2353c.f(bVarR);
                return new d(this, bVarR);
            } catch (IOException unused2) {
                b(bVarR);
                return null;
            }
        } catch (IOException unused3) {
            bVarR = null;
        }
    }

    public final void x(@NotNull d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f333726a.k0(f333721g.b(request.q()));
    }

    public final synchronized int y() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f333731f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull File directory, long j10) {
        this(directory, j10, okhttp3.internal.io.a.f334498b);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX INFO: renamed from: okhttp3.c$c, reason: collision with other inner class name */
    private static final class C2353c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final a f333737k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private static final String f333738l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private static final String f333739m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final v f333740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final u f333741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f333742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final c0 f333743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f333744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f333745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final u f333746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private final t f333747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f333748i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f333749j;

        /* JADX INFO: renamed from: okhttp3.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            okhttp3.internal.platform.h.a aVar = okhttp3.internal.platform.h.f334560a;
            sb2.append(aVar.g().i());
            sb2.append("-Sent-Millis");
            f333738l = sb2.toString();
            f333739m = aVar.g().i() + "-Received-Millis";
        }

        public C2353c(@NotNull b1 rawSource) throws IOException {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                okio.n nVarE = l0.e(rawSource);
                String strLb = nVarE.lb();
                v vVarL = v.f334772k.l(strLb);
                if (vVarL == null) {
                    IOException iOException = new IOException("Cache corruption for " + strLb);
                    okhttp3.internal.platform.h.f334560a.g().m("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f333740a = vVarL;
                this.f333742c = nVarE.lb();
                u.a aVar = new u.a();
                int iC = c.f333721g.c(nVarE);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.f(nVarE.lb());
                }
                this.f333741b = aVar.i();
                okhttp3.internal.http.k kVarB = okhttp3.internal.http.k.f334202d.b(nVarE.lb());
                this.f333743d = kVarB.f334207a;
                this.f333744e = kVarB.f334208b;
                this.f333745f = kVarB.f334209c;
                u.a aVar2 = new u.a();
                int iC2 = c.f333721g.c(nVarE);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.f(nVarE.lb());
                }
                String str = f333738l;
                String strJ = aVar2.j(str);
                String str2 = f333739m;
                String strJ2 = aVar2.j(str2);
                aVar2.l(str);
                aVar2.l(str2);
                this.f333748i = strJ != null ? Long.parseLong(strJ) : 0L;
                this.f333749j = strJ2 != null ? Long.parseLong(strJ2) : 0L;
                this.f333746g = aVar2.i();
                if (a()) {
                    String strLb2 = nVarE.lb();
                    if (strLb2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strLb2 + '\"');
                    }
                    this.f333747h = t.f334761e.c(!nVarE.y1() ? i0.f333933b.a(nVarE.lb()) : i0.SSL_3_0, i.f333864b.b(nVarE.lb()), c(nVarE), c(nVarE));
                } else {
                    this.f333747h = null;
                }
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        private final boolean a() {
            return Intrinsics.areEqual(this.f333740a.X(), Api.scheme);
        }

        private final List<Certificate> c(okio.n nVar) throws IOException {
            int iC = c.f333721g.c(nVar);
            if (iC == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strLb = nVar.lb();
                    okio.l lVar = new okio.l();
                    okio.o oVarH = okio.o.f335046d.h(strLb);
                    if (oVarH == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    lVar.U7(oVarH);
                    arrayList.add(certificateFactory.generateCertificate(lVar.rf()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(okio.m mVar, List<? extends Certificate> list) throws IOException {
            try {
                mVar.h5(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    okio.o.a aVar = okio.o.f335046d;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    mVar.pa(okio.o.a.p(aVar, bytes, 0, 0, 3, null).n()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(@NotNull d0 request, @NotNull f0 response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.areEqual(this.f333740a, request.q()) && Intrinsics.areEqual(this.f333742c, request.m()) && c.f333721g.g(response, this.f333741b, request);
        }

        @NotNull
        public final f0 d(@NotNull okhttp3.internal.cache.d.C2356d snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String strK = this.f333746g.k("Content-Type");
            String strK2 = this.f333746g.k("Content-Length");
            return new f0.a().E(new d0.a().D(this.f333740a).p(this.f333742c, null).o(this.f333741b).b()).B(this.f333743d).g(this.f333744e).y(this.f333745f).w(this.f333746g).b(new a(snapshot, strK, strK2)).u(this.f333747h).F(this.f333748i).C(this.f333749j).c();
        }

        public final void f(@NotNull okhttp3.internal.cache.d.b editor) throws IOException {
            Intrinsics.checkNotNullParameter(editor, "editor");
            okio.m mVarD = l0.d(editor.f(0));
            try {
                mVarD.pa(this.f333740a.toString()).writeByte(10);
                mVarD.pa(this.f333742c).writeByte(10);
                mVarD.h5(this.f333741b.size()).writeByte(10);
                int size = this.f333741b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    mVarD.pa(this.f333741b.n(i10)).pa(": ").pa(this.f333741b.w(i10)).writeByte(10);
                }
                mVarD.pa(new okhttp3.internal.http.k(this.f333743d, this.f333744e, this.f333745f).toString()).writeByte(10);
                mVarD.h5(this.f333746g.size() + 2).writeByte(10);
                int size2 = this.f333746g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    mVarD.pa(this.f333746g.n(i11)).pa(": ").pa(this.f333746g.w(i11)).writeByte(10);
                }
                mVarD.pa(f333738l).pa(": ").h5(this.f333748i).writeByte(10);
                mVarD.pa(f333739m).pa(": ").h5(this.f333749j).writeByte(10);
                if (a()) {
                    mVarD.writeByte(10);
                    t tVar = this.f333747h;
                    Intrinsics.checkNotNull(tVar);
                    mVarD.pa(tVar.g().e()).writeByte(10);
                    e(mVarD, this.f333747h.m());
                    e(mVarD, this.f333747h.k());
                    mVarD.pa(this.f333747h.o().o()).writeByte(10);
                }
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(mVarD, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(mVarD, th2);
                    throw th3;
                }
            }
        }

        public C2353c(@NotNull f0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f333740a = response.x0().q();
            this.f333741b = c.f333721g.f(response);
            this.f333742c = response.x0().m();
            this.f333743d = response.r0();
            this.f333744e = response.E();
            this.f333745f = response.f0();
            this.f333746g = response.Y();
            this.f333747h = response.I();
            this.f333748i = response.y0();
            this.f333749j = response.w0();
        }
    }
}
