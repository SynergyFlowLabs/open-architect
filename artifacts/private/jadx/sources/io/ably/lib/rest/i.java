package io.ably.lib.rest;

import androidx.media2.session.SessionCommand;
import io.ably.lib.http.m;
import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.l;
import io.ably.lib.types.n;
import io.ably.lib.types.r;
import io.ably.lib.types.u;
import io.ably.lib.types.w;
import io.ably.lib.util.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f287762e = "io.ably.lib.rest.i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f287763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.ably.lib.http.f f287764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f287765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f287766d;

    public i(String str, io.ably.lib.http.f fVar, n nVar, l lVar) {
        this.f287763a = str;
        this.f287764b = fVar;
        this.f287765c = nVar;
        this.f287766d = lVar;
    }

    public static /* synthetic */ void a(i iVar, io.ably.lib.types.b bVar, String str, io.ably.lib.http.l lVar, io.ably.lib.types.i iVar2) {
        io.ably.lib.types.b[] bVarArr = {bVar};
        lVar.l(iVar.o(str), m.d(iVar.f287765c.f288125u), iVar.f287765c.R ? b0.a(io.ably.lib.util.e.f()) : null, iVar.f287765c.f288125u ? io.ably.lib.types.d.c(bVarArr) : io.ably.lib.types.d.b(bVarArr), null, true, iVar2);
    }

    private io.ably.lib.http.f.c<Void> f(String str, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        k.k(f287762e, "delete(): annotation=" + bVar);
        bVar.f287927s = io.ably.lib.types.c.ANNOTATION_DELETE;
        return v(str, bVar);
    }

    private String o(String str) {
        return "/channels/" + m.f(this.f287763a) + "/messages/" + m.f(str) + "/annotations";
    }

    private io.ably.lib.http.d.f<io.ably.lib.types.b> p(String str, b0[] b0VarArr) {
        k.k(f287762e, "getImpl(): params=" + Arrays.toString(b0VarArr));
        io.ably.lib.http.i.b<io.ably.lib.types.b> bVarD = io.ably.lib.types.d.d(this.f287766d);
        if (this.f287765c.R) {
            b0VarArr = b0.f(b0VarArr, io.ably.lib.util.e.f());
        }
        return new io.ably.lib.http.d(this.f287764b, o(str), m.d(this.f287765c.f288125u), b0VarArr, bVarD).h();
    }

    private io.ably.lib.http.f.c<Void> u(String str, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        k.k(f287762e, "publish(): annotation=" + bVar);
        bVar.f287927s = io.ably.lib.types.c.ANNOTATION_CREATE;
        return v(str, bVar);
    }

    private io.ably.lib.http.f.c<Void> v(final String str, final io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        if (bVar.f287930w == null) {
            throw io.ably.lib.types.a.a(new r("Annotation type must be specified", 400, 40000));
        }
        bVar.f287929v = str;
        try {
            bVar.d(this.f287766d);
            if (bVar.f288017a == null && this.f287765c.A) {
                bVar.f288017a = io.ably.lib.util.e.o();
            }
            return this.f287764b.e(new io.ably.lib.http.f.b() { // from class: io.ably.lib.rest.h
                @Override // io.ably.lib.http.f.b
                public final void a(io.ably.lib.http.l lVar, io.ably.lib.types.i iVar) {
                    i.a(this.f287759a, bVar, str, lVar, iVar);
                }
            });
        } catch (w e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }

    private void w(String str) throws io.ably.lib.types.a {
        if (str == null) {
            throw io.ably.lib.types.a.a(new r("Message serial can not be empty", 400, SessionCommand.f58655d0));
        }
    }

    public void b(u uVar, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        c(uVar.f288184w, bVar);
    }

    public void c(String str, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        w(str);
        f(str, bVar).b();
    }

    public void d(u uVar, io.ably.lib.types.b bVar, io.ably.lib.types.i<Void> iVar) throws io.ably.lib.types.a {
        e(uVar.f288184w, bVar, iVar);
    }

    public void e(String str, io.ably.lib.types.b bVar, io.ably.lib.types.i<Void> iVar) throws io.ably.lib.types.a {
        w(str);
        f(str, bVar).a(iVar);
    }

    public a0<io.ably.lib.types.b> g(u uVar) throws io.ably.lib.types.a {
        return i(uVar.f288184w);
    }

    public a0<io.ably.lib.types.b> h(u uVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        return j(uVar.f288184w, b0VarArr);
    }

    public a0<io.ably.lib.types.b> i(String str) throws io.ably.lib.types.a {
        return j(str, null);
    }

    public a0<io.ably.lib.types.b> j(String str, b0[] b0VarArr) throws io.ably.lib.types.a {
        w(str);
        return p(str, b0VarArr).b();
    }

    public void k(u uVar, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        m(uVar.f288184w, iVar);
    }

    public void l(u uVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        n(uVar.f288184w, b0VarArr, iVar);
    }

    public void m(String str, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        w(str);
        p(str, null).a(iVar);
    }

    public void n(String str, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        w(str);
        p(str, b0VarArr).a(iVar);
    }

    public void q(u uVar, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        r(uVar.f288184w, bVar);
    }

    public void r(String str, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        w(str);
        u(str, bVar).b();
    }

    public void s(u uVar, io.ably.lib.types.b bVar, io.ably.lib.types.i<Void> iVar) throws io.ably.lib.types.a {
        t(uVar.f288184w, bVar, iVar);
    }

    public void t(String str, io.ably.lib.types.b bVar, io.ably.lib.types.i<Void> iVar) throws io.ably.lib.types.a {
        w(str);
        u(str, bVar).a(iVar);
    }
}
