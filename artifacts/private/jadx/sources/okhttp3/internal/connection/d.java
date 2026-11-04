package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.b0;
import okhttp3.h0;
import okhttp3.internal.http2.n;
import okhttp3.r;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f334092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final okhttp3.a f334093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f334094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final r f334095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private j.b f334096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private j f334097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f334098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f334099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f334100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private h0 f334101j;

    public d(@NotNull g connectionPool, @NotNull okhttp3.a address, @NotNull e call, @NotNull r eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f334092a = connectionPool;
        this.f334093b = address;
        this.f334094c = call;
        this.f334095d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:78:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final f b(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        List<h0> listA;
        f fVar;
        Socket socketW;
        if (this.f334094c.isCanceled()) {
            throw new IOException("Canceled");
        }
        f fVarK = this.f334094c.k();
        if (fVarK != null) {
            synchronized (fVarK) {
                try {
                    socketW = (fVarK.v() || !g(fVarK.b().d().w())) ? this.f334094c.w() : null;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f334094c.k() != null) {
                if (socketW == null) {
                    return fVarK;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketW != null) {
                jk.f.q(socketW);
            }
            this.f334095d.l(this.f334094c, fVarK);
        }
        this.f334098g = 0;
        this.f334099h = 0;
        this.f334100i = 0;
        if (this.f334092a.a(this.f334093b, this.f334094c, null, false)) {
            f fVarK2 = this.f334094c.k();
            Intrinsics.checkNotNull(fVarK2);
            this.f334095d.k(this.f334094c, fVarK2);
            return fVarK2;
        }
        h0 h0VarC = this.f334101j;
        try {
            if (h0VarC == null) {
                j.b bVar = this.f334096e;
                if (bVar != null) {
                    Intrinsics.checkNotNull(bVar);
                    if (bVar.b()) {
                        j.b bVar2 = this.f334096e;
                        Intrinsics.checkNotNull(bVar2);
                        h0VarC = bVar2.c();
                    }
                    fVar = new f(this.f334092a, h0VarC);
                    this.f334094c.z(fVar);
                    fVar.k(i10, i11, i12, i13, z10, this.f334094c, this.f334095d);
                    this.f334094c.z(null);
                    this.f334094c.j().W().a(fVar.b());
                    if (this.f334092a.a(this.f334093b, this.f334094c, listA, true)) {
                        f fVarK3 = this.f334094c.k();
                        Intrinsics.checkNotNull(fVarK3);
                        this.f334101j = h0VarC;
                        jk.f.q(fVar.d());
                        this.f334095d.k(this.f334094c, fVarK3);
                        return fVarK3;
                    }
                    synchronized (fVar) {
                        this.f334092a.h(fVar);
                        this.f334094c.c(fVar);
                        Unit unit2 = Unit.f312394a;
                    }
                    this.f334095d.k(this.f334094c, fVar);
                    return fVar;
                }
                j jVar = this.f334097f;
                if (jVar == null) {
                    jVar = new j(this.f334093b, this.f334094c.j().W(), this.f334094c, this.f334095d);
                    this.f334097f = jVar;
                }
                j.b bVarC = jVar.c();
                this.f334096e = bVarC;
                listA = bVarC.a();
                if (this.f334094c.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.f334092a.a(this.f334093b, this.f334094c, listA, false)) {
                    f fVarK4 = this.f334094c.k();
                    Intrinsics.checkNotNull(fVarK4);
                    this.f334095d.k(this.f334094c, fVarK4);
                    return fVarK4;
                }
                h0VarC = bVarC.c();
                fVar = new f(this.f334092a, h0VarC);
                this.f334094c.z(fVar);
                fVar.k(i10, i11, i12, i13, z10, this.f334094c, this.f334095d);
                this.f334094c.z(null);
                this.f334094c.j().W().a(fVar.b());
                if (this.f334092a.a(this.f334093b, this.f334094c, listA, true)) {
                    f fVarK5 = this.f334094c.k();
                    Intrinsics.checkNotNull(fVarK5);
                    this.f334101j = h0VarC;
                    jk.f.q(fVar.d());
                    this.f334095d.k(this.f334094c, fVarK5);
                    return fVarK5;
                }
                synchronized (fVar) {
                    this.f334092a.h(fVar);
                    this.f334094c.c(fVar);
                    Unit unit3 = Unit.f312394a;
                    this.f334095d.k(this.f334094c, fVar);
                    return fVar;
                }
            }
            Intrinsics.checkNotNull(h0VarC);
            this.f334101j = null;
            fVar.k(i10, i11, i12, i13, z10, this.f334094c, this.f334095d);
            this.f334094c.z(null);
            this.f334094c.j().W().a(fVar.b());
            if (this.f334092a.a(this.f334093b, this.f334094c, listA, true)) {
                f fVarK6 = this.f334094c.k();
                Intrinsics.checkNotNull(fVarK6);
                this.f334101j = h0VarC;
                jk.f.q(fVar.d());
                this.f334095d.k(this.f334094c, fVarK6);
                return fVarK6;
            }
            synchronized (fVar) {
                this.f334092a.h(fVar);
                this.f334094c.c(fVar);
                Unit unit4 = Unit.f312394a;
                this.f334095d.k(this.f334094c, fVar);
                return fVar;
            }
        } catch (Throwable th3) {
            this.f334094c.z(null);
            throw th3;
        }
        listA = null;
        fVar = new f(this.f334092a, h0VarC);
        this.f334094c.z(fVar);
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            f fVarB = b(i10, i11, i12, i13, z10);
            if (fVarB.z(z11)) {
                return fVarB;
            }
            fVarB.E();
            if (this.f334101j == null) {
                j.b bVar = this.f334096e;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.f334097f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final h0 f() {
        f fVarK;
        if (this.f334098g > 1 || this.f334099h > 1 || this.f334100i > 0 || (fVarK = this.f334094c.k()) == null) {
            return null;
        }
        synchronized (fVarK) {
            if (fVarK.w() != 0) {
                return null;
            }
            if (jk.f.l(fVarK.b().d().w(), this.f334093b.w())) {
                return fVarK.b();
            }
            return null;
        }
    }

    @NotNull
    public final okhttp3.internal.http.d a(@NotNull b0 client, @NotNull okhttp3.internal.http.g chain) {
        d dVar;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            dVar = this;
            try {
                return dVar.c(chain.l(), chain.n(), chain.p(), client.c0(), client.i0(), !Intrinsics.areEqual(chain.o().m(), "GET")).B(client, chain);
            } catch (IOException e10) {
                e = e10;
                IOException iOException = e;
                dVar.h(iOException);
                throw new i(iOException);
            } catch (i e11) {
                e = e11;
                i iVar = e;
                dVar.h(iVar.c());
                throw iVar;
            }
        } catch (IOException e12) {
            e = e12;
            dVar = this;
        } catch (i e13) {
            e = e13;
            dVar = this;
        }
    }

    @NotNull
    public final okhttp3.a d() {
        return this.f334093b;
    }

    public final boolean e() {
        j jVar;
        if (this.f334098g == 0 && this.f334099h == 0 && this.f334100i == 0) {
            return false;
        }
        if (this.f334101j != null) {
            return true;
        }
        h0 h0VarF = f();
        if (h0VarF != null) {
            this.f334101j = h0VarF;
            return true;
        }
        j.b bVar = this.f334096e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f334097f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(@NotNull v url) {
        Intrinsics.checkNotNullParameter(url, "url");
        v vVarW = this.f334093b.w();
        return url.N() == vVarW.N() && Intrinsics.areEqual(url.F(), vVarW.F());
    }

    public final void h(@NotNull IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f334101j = null;
        if ((e10 instanceof n) && ((n) e10).f334496a == okhttp3.internal.http2.b.REFUSED_STREAM) {
            this.f334098g++;
        } else if (e10 instanceof okhttp3.internal.http2.a) {
            this.f334099h++;
        } else {
            this.f334100i++;
        }
    }
}
