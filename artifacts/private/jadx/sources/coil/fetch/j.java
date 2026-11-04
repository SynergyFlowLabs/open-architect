package coil.fetch;

import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.annotation.l1;
import coil.request.n;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.d0;
import com.superwall.sdk.network.Api;
import io.sentry.protocol.a0;
import java.io.IOException;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p;
import kotlin.text.StringsKt;
import okhttp3.g0;
import okhttp3.x;
import okio.l0;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHttpUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n+ 2 FileSystem.kt\nokio/FileSystem\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n80#2:305\n165#2:306\n81#2:307\n82#2:312\n80#2:341\n165#2:342\n81#2:343\n82#2:348\n80#2:377\n165#2:378\n81#2:379\n82#2:384\n67#2:417\n68#2:422\n52#3,4:308\n60#3,10:313\n56#3,18:323\n52#3,4:344\n60#3,10:349\n56#3,18:359\n52#3,4:380\n60#3,10:385\n56#3,18:395\n66#3:416\n52#3,4:418\n60#3,10:423\n56#3,3:433\n71#3,3:436\n216#4,2:413\n1#5:415\n*S KotlinDebug\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n*L\n162#1:305\n162#1:306\n162#1:307\n162#1:312\n167#1:341\n167#1:342\n167#1:343\n167#1:348\n170#1:377\n170#1:378\n170#1:379\n170#1:384\n255#1:417\n255#1:422\n162#1:308,4\n162#1:313,10\n162#1:323,18\n167#1:344,4\n167#1:349,10\n167#1:359,18\n170#1:380,4\n170#1:385,10\n170#1:395,18\n255#1:416\n255#1:418,4\n255#1:423,10\n255#1:433,3\n255#1:436,3\n190#1:413,2\n*E\n"})
public final class j implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f87358g = "text/plain";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0<okhttp3.e.a> f87363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0<coil.disk.a> f87364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f87365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f87357f = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final okhttp3.d f87359h = new okhttp3.d.a().g().h().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final okhttp3.d f87360i = new okhttp3.d.a().g().j().a();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements h.a<Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final f0<okhttp3.e.a> f87366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final f0<coil.disk.a> f87367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f87368c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull f0<? extends okhttp3.e.a> f0Var, @NotNull f0<? extends coil.disk.a> f0Var2, boolean z10) {
            this.f87366a = f0Var;
            this.f87367b = f0Var2;
            this.f87368c = z10;
        }

        private final boolean c(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), Api.scheme);
        }

        @Override // coil.fetch.h.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Uri uri, @NotNull n nVar, @NotNull coil.j jVar) {
            if (c(uri)) {
                return new j(uri.toString(), nVar, this.f87366a, this.f87367b, this.f87368c);
            }
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {}, l = {224}, m = "executeNetworkRequest", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f87369a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f87371c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87369a = obj;
            this.f87371c |= Integer.MIN_VALUE;
            return j.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {0, 0, 0, 1, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160716p, com.planner5d.library.engine.input.f.b.f160742x1}, m = d0.f124428k, n = {"this", a0.b.f306128c, "cacheStrategy", "this", a0.b.f306128c, io.sentry.protocol.n.f306405g}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f87374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f87375d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f87377f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87375d = obj;
            this.f87377f |= Integer.MIN_VALUE;
            return j.this.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull String str, @NotNull n nVar, @NotNull f0<? extends okhttp3.e.a> f0Var, @NotNull f0<? extends coil.disk.a> f0Var2, boolean z10) {
        this.f87361a = str;
        this.f87362b = nVar;
        this.f87363c = f0Var;
        this.f87364d = f0Var2;
        this.f87365e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object c(okhttp3.d0 d0Var, kotlin.coroutines.d<? super okhttp3.f0> dVar) throws IOException {
        c cVar;
        okhttp3.f0 f0VarExecute;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f87371c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f87371c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA = cVar.f87369a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f87371c;
        if (i11 == 0) {
            ResultKt.m(objA);
            if (!coil.util.l.A()) {
                okhttp3.e eVarA = this.f87363c.getValue().a(d0Var);
                cVar.f87371c = 1;
                objA = coil.util.b.a(eVarA, cVar);
                if (objA == objL) {
                    return objL;
                }
            } else {
                if (this.f87362b.l().n()) {
                    throw new NetworkOnMainThreadException();
                }
                f0VarExecute = FirebasePerfOkHttpClient.execute(this.f87363c.getValue().a(d0Var));
            }
            if (!f0VarExecute.isSuccessful() || f0VarExecute.E() == 304) {
                return f0VarExecute;
            }
            g0 g0VarR = f0VarExecute.r();
            if (g0VarR != null) {
                coil.util.l.f(g0VarR);
            }
            throw new coil.network.f(f0VarExecute);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objA);
        f0VarExecute = (okhttp3.f0) objA;
        if (f0VarExecute.isSuccessful()) {
        }
        return f0VarExecute;
    }

    private final String d() {
        String strH = this.f87362b.h();
        return strH == null ? this.f87361a : strH;
    }

    private final v e() {
        coil.disk.a value = this.f87364d.getValue();
        Intrinsics.checkNotNull(value);
        return value.getFileSystem();
    }

    private final boolean g(okhttp3.d0 d0Var, okhttp3.f0 f0Var) {
        return this.f87362b.i().o() && (!this.f87365e || coil.network.d.f87586c.c(d0Var, f0Var));
    }

    private final okhttp3.d0 h() {
        okhttp3.d0.a aVarO = new okhttp3.d0.a().B(this.f87361a).o(this.f87362b.j());
        for (Map.Entry<Class<?>, Object> entry : this.f87362b.q().a().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVarO.z(key, entry.getValue());
        }
        boolean zN = this.f87362b.i().n();
        boolean zN2 = this.f87362b.l().n();
        if (!zN2 && zN) {
            aVarO.c(okhttp3.d.f333771p);
        } else if (!zN2 || zN) {
            if (!zN2 && !zN) {
                aVarO.c(f87360i);
            }
        } else if (this.f87362b.i().o()) {
            aVarO.c(okhttp3.d.f333770o);
        } else {
            aVarO.c(f87359h);
        }
        return aVarO.b();
    }

    private final coil.disk.a.c i() {
        coil.disk.a value;
        if (!this.f87362b.i().n() || (value = this.f87364d.getValue()) == null) {
            return null;
        }
        return value.f(d());
    }

    private final coil.network.c j(coil.disk.a.c cVar) throws Throwable {
        Throwable th2;
        coil.network.c cVar2;
        try {
            okio.n nVarE = l0.e(e().M(cVar.z()));
            try {
                cVar2 = new coil.network.c(nVarE);
                if (nVarE != null) {
                    try {
                        nVarE.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (nVarE != null) {
                    try {
                        nVarE.close();
                    } catch (Throwable th5) {
                        p.a(th4, th5);
                    }
                }
                th2 = th4;
                cVar2 = null;
            }
            if (th2 == null) {
                return cVar2;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    private final coil.decode.e k(okhttp3.f0 f0Var) {
        return f0Var.g0() != null ? coil.decode.e.NETWORK : coil.decode.e.DISK;
    }

    private final coil.decode.v l(coil.disk.a.c cVar) {
        return coil.decode.a0.m(cVar.getData(), e(), d(), cVar);
    }

    private final coil.decode.v m(g0 g0Var) {
        return coil.decode.a0.i(g0Var.source(), this.f87362b.g());
    }

    private final coil.disk.a.c n(coil.disk.a.c cVar, okhttp3.d0 d0Var, okhttp3.f0 f0Var, coil.network.c cVar2) {
        coil.disk.a.b bVarE;
        Throwable th2;
        Throwable th3 = null;
        if (!g(d0Var, f0Var)) {
            if (cVar != null) {
                coil.util.l.f(cVar);
            }
            return null;
        }
        if (cVar != null) {
            bVarE = cVar.qd();
        } else {
            coil.disk.a value = this.f87364d.getValue();
            bVarE = value != null ? value.e(d()) : null;
        }
        try {
            if (bVarE == null) {
                return null;
            }
            try {
                if (f0Var.E() != 304 || cVar2 == null) {
                    okio.m mVarD = l0.d(e().K(bVarE.z(), false));
                    try {
                        new coil.network.c(f0Var).k(mVarD);
                        Unit unit = Unit.f312394a;
                        if (mVarD != null) {
                            try {
                                mVarD.close();
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        }
                        th2 = null;
                    } catch (Throwable th5) {
                        if (mVarD != null) {
                            try {
                                mVarD.close();
                            } catch (Throwable th6) {
                                p.a(th5, th6);
                            }
                        }
                        th2 = th5;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    okio.m mVarD2 = l0.d(e().K(bVarE.getData(), false));
                    try {
                        g0 g0VarR = f0Var.r();
                        Intrinsics.checkNotNull(g0VarR);
                        g0VarR.source().g8(mVarD2);
                        if (mVarD2 != null) {
                            try {
                                mVarD2.close();
                            } catch (Throwable th7) {
                                th3 = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        th3 = th8;
                        if (mVarD2 != null) {
                            try {
                                mVarD2.close();
                            } catch (Throwable th9) {
                                p.a(th3, th9);
                            }
                        }
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                } else {
                    okhttp3.f0 f0VarC = f0Var.j0().w(coil.network.d.f87586c.a(cVar2.h(), f0Var.Y())).c();
                    okio.m mVarD3 = l0.d(e().K(bVarE.z(), false));
                    try {
                        new coil.network.c(f0VarC).k(mVarD3);
                        Unit unit2 = Unit.f312394a;
                        if (mVarD3 != null) {
                            try {
                                mVarD3.close();
                            } catch (Throwable th10) {
                                th3 = th10;
                            }
                        }
                    } catch (Throwable th11) {
                        th3 = th11;
                        if (mVarD3 != null) {
                            try {
                                mVarD3.close();
                            } catch (Throwable th12) {
                                p.a(th3, th12);
                            }
                        }
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                }
                coil.disk.a.c cVarA = bVarE.a();
                coil.util.l.f(f0Var);
                return cVarA;
            } catch (Exception e10) {
                coil.util.l.a(bVarE);
                throw e10;
            }
        } catch (Throwable th13) {
            coil.util.l.f(f0Var);
            throw th13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v11 */
    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) throws Exception {
        d dVar2;
        coil.disk.a.c cVarI;
        coil.network.d dVarB;
        Object objC;
        okhttp3.f0 f0Var;
        g0 g0VarH;
        coil.disk.a.c cVar;
        okhttp3.f0 f0Var2;
        coil.disk.a.c cVarN;
        j jVar;
        okhttp3.f0 f0Var3;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f87377f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f87377f = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f87375d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        ?? r10 = dVar2.f87377f;
        int i11 = 2 ^ 1;
        try {
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        cVarI = i();
                        if (cVarI != null) {
                            Long lH = e().D(cVarI.z()).h();
                            if (lH != null && lH.longValue() == 0) {
                                return new m(l(cVarI), f(this.f87361a, null), coil.decode.e.DISK);
                            }
                            if (!this.f87365e) {
                                coil.decode.v vVarL = l(cVarI);
                                String str = this.f87361a;
                                coil.network.c cVarJ = j(cVarI);
                                return new m(vVarL, f(str, cVarJ != null ? cVarJ.f() : null), coil.decode.e.DISK);
                            }
                            dVarB = new coil.network.d.b(h(), j(cVarI)).b();
                            if (dVarB.b() == null && dVarB.a() != null) {
                                return new m(l(cVarI), f(this.f87361a, dVarB.a().f()), coil.decode.e.DISK);
                            }
                        } else {
                            dVarB = new coil.network.d.b(h(), null).b();
                        }
                        okhttp3.d0 d0VarB = dVarB.b();
                        Intrinsics.checkNotNull(d0VarB);
                        dVar2.f87372a = this;
                        dVar2.f87373b = cVarI;
                        dVar2.f87374c = dVarB;
                        dVar2.f87377f = 1;
                        objC = c(d0VarB, dVar2);
                        if (objC == objL) {
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f0Var2 = (okhttp3.f0) dVar2.f87374c;
                        cVar = (coil.disk.a.c) dVar2.f87373b;
                        jVar = (j) dVar2.f87372a;
                        try {
                            ResultKt.m(obj);
                            f0Var3 = (okhttp3.f0) obj;
                            try {
                                g0 g0VarH2 = coil.util.l.H(f0Var3);
                                return new m(jVar.m(g0VarH2), jVar.f(jVar.f87361a, g0VarH2.contentType()), jVar.k(f0Var3));
                            } catch (Exception e10) {
                                e = e10;
                                f0Var2 = f0Var3;
                                try {
                                    coil.util.l.f(f0Var2);
                                    throw e;
                                } catch (Exception e11) {
                                    e = e11;
                                    r10 = cVar;
                                    if (r10 != 0) {
                                        coil.util.l.f(r10);
                                    }
                                    throw e;
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            coil.util.l.f(f0Var2);
                            throw e;
                        }
                    }
                    coil.network.d dVar3 = (coil.network.d) dVar2.f87374c;
                    cVarI = (coil.disk.a.c) dVar2.f87373b;
                    j jVar2 = (j) dVar2.f87372a;
                    ResultKt.m(obj);
                    dVarB = dVar3;
                    this = jVar2;
                    objC = obj;
                    if (cVarN != null) {
                        coil.decode.v vVarL2 = this.l(cVarN);
                        String str2 = this.f87361a;
                        coil.network.c cVarJ2 = this.j(cVarN);
                        return new m(vVarL2, this.f(str2, cVarJ2 != null ? cVarJ2.f() : null), coil.decode.e.NETWORK);
                    }
                    if (g0VarH.source().request(1L)) {
                        return new m(this.m(g0VarH), this.f(this.f87361a, g0VarH.contentType()), this.k(f0Var));
                    }
                    coil.util.l.f(f0Var);
                    okhttp3.d0 d0VarH = this.h();
                    dVar2.f87372a = this;
                    dVar2.f87373b = cVarN;
                    dVar2.f87374c = f0Var;
                    dVar2.f87377f = 2;
                    Object objC2 = this.c(d0VarH, dVar2);
                    if (objC2 != objL) {
                        cVar = cVarN;
                        obj = objC2;
                        jVar = this;
                        f0Var2 = f0Var;
                        f0Var3 = (okhttp3.f0) obj;
                        g0 g0VarH3 = coil.util.l.H(f0Var3);
                        return new m(jVar.m(g0VarH3), jVar.f(jVar.f87361a, g0VarH3.contentType()), jVar.k(f0Var3));
                    }
                    return objL;
                } catch (Exception e13) {
                    cVar = cVarN;
                    e = e13;
                    f0Var2 = f0Var;
                    coil.util.l.f(f0Var2);
                    throw e;
                }
                cVarN = this.n(cVarI, dVarB.b(), f0Var, dVarB.a());
            } catch (Exception e14) {
                e = e14;
                cVar = cVarI;
            }
            f0Var = (okhttp3.f0) objC;
            g0VarH = coil.util.l.H(f0Var);
        } catch (Exception e15) {
            e = e15;
        }
    }

    @l1
    @Nullable
    public final String f(@NotNull String str, @Nullable x xVar) {
        String strQ;
        String string = xVar != null ? xVar.toString() : null;
        if ((string == null || StringsKt.u2(string, f87358g, false, 2, null)) && (strQ = coil.util.l.q(MimeTypeMap.getSingleton(), str)) != null) {
            return strQ;
        }
        if (string != null) {
            return StringsKt.w5(string, ';', null, 2, null);
        }
        return null;
    }
}
