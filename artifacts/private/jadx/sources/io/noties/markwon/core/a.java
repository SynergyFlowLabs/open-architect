package io.noties.markwon.core;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import io.noties.markwon.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.commonmark.node.a0;
import org.commonmark.node.b0;
import org.commonmark.node.q;
import org.commonmark.node.r;
import org.commonmark.node.t;
import org.commonmark.node.v;
import org.commonmark.node.w;
import org.commonmark.node.x;
import org.commonmark.node.y;
import org.commonmark.node.z;

/* JADX INFO: loaded from: classes8.dex */
public class a extends io.noties.markwon.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<p> f297491a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f297492b;

    /* JADX INFO: renamed from: io.noties.markwon.core.a$a, reason: collision with other inner class name */
    class C2112a implements io.noties.markwon.m.c<b0> {
        C2112a() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull b0 b0Var) {
            mVar.h(b0Var);
            int length = mVar.length();
            mVar.builder().append(kotlin.text.b0.f313282g);
            mVar.j(b0Var, length);
            mVar.I(b0Var);
        }
    }

    class b implements io.noties.markwon.m.c<org.commonmark.node.m> {
        b() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.m mVar2) {
            mVar.h(mVar2);
            int length = mVar.length();
            mVar.d(mVar2);
            io.noties.markwon.core.b.f297497d.h(mVar.i(), Integer.valueOf(mVar2.q()));
            mVar.j(mVar2, length);
            mVar.I(mVar2);
        }
    }

    class c implements io.noties.markwon.m.c<y> {
        c() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull y yVar) {
            mVar.builder().append(' ');
        }
    }

    class d implements io.noties.markwon.m.c<org.commonmark.node.l> {
        d() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.l lVar) {
            mVar.p();
        }
    }

    class e implements io.noties.markwon.m.c<x> {
        e() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull x xVar) {
            boolean zB = a.B(xVar);
            if (!zB) {
                mVar.h(xVar);
            }
            int length = mVar.length();
            mVar.d(xVar);
            io.noties.markwon.core.b.f297499f.h(mVar.i(), Boolean.valueOf(zB));
            mVar.j(xVar, length);
            if (zB) {
                return;
            }
            mVar.I(xVar);
        }
    }

    class f implements io.noties.markwon.m.c<r> {
        f() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull r rVar) {
            int length = mVar.length();
            mVar.d(rVar);
            io.noties.markwon.core.b.f297498e.h(mVar.i(), rVar.p());
            mVar.j(rVar, length);
        }
    }

    class g implements io.noties.markwon.m.c<a0> {
        g() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull a0 a0Var) {
            String strP = a0Var.p();
            mVar.builder().f(strP);
            if (!a.this.f297491a.isEmpty()) {
                int length = mVar.length() - strP.length();
                Iterator it = a.this.f297491a.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(mVar, strP, length);
                }
            }
        }
    }

    class h implements io.noties.markwon.m.c<z> {
        h() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull z zVar) {
            int length = mVar.length();
            mVar.d(zVar);
            mVar.j(zVar, length);
        }
    }

    class i implements io.noties.markwon.m.c<org.commonmark.node.j> {
        i() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.j jVar) {
            int length = mVar.length();
            mVar.d(jVar);
            mVar.j(jVar, length);
        }
    }

    class j implements io.noties.markwon.m.c<org.commonmark.node.c> {
        j() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.c cVar) {
            mVar.h(cVar);
            int length = mVar.length();
            mVar.d(cVar);
            mVar.j(cVar, length);
            mVar.I(cVar);
        }
    }

    class k implements io.noties.markwon.m.c<org.commonmark.node.e> {
        k() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.e eVar) {
            int length = mVar.length();
            mVar.builder().append(kotlin.text.b0.f313282g).f(eVar.p()).append(kotlin.text.b0.f313282g);
            mVar.j(eVar, length);
        }
    }

    class l implements io.noties.markwon.m.c<org.commonmark.node.k> {
        l() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.k kVar) {
            a.L(mVar, kVar.t(), kVar.u(), kVar);
        }
    }

    class m implements io.noties.markwon.m.c<q> {
        m() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull q qVar) {
            a.L(mVar, null, qVar.q(), qVar);
        }
    }

    class n implements io.noties.markwon.m.c<org.commonmark.node.p> {
        n() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.p pVar) {
            io.noties.markwon.x xVarA = mVar.n().f().a(org.commonmark.node.p.class);
            if (xVarA == null) {
                mVar.d(pVar);
                return;
            }
            int length = mVar.length();
            mVar.d(pVar);
            if (length == mVar.length()) {
                mVar.builder().append((char) 65532);
            }
            io.noties.markwon.g gVarN = mVar.n();
            boolean z10 = pVar.h() instanceof r;
            String strB = gVarN.c().b(pVar.p());
            u uVarI = mVar.i();
            io.noties.markwon.image.g.f297649a.h(uVarI, strB);
            io.noties.markwon.image.g.f297650b.h(uVarI, Boolean.valueOf(z10));
            io.noties.markwon.image.g.f297651c.h(uVarI, null);
            mVar.b(length, xVarA.a(gVarN, uVarI));
        }
    }

    class o implements io.noties.markwon.m.c<org.commonmark.node.u> {
        o() {
        }

        @Override // io.noties.markwon.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull io.noties.markwon.m mVar, @NonNull org.commonmark.node.u uVar) {
            int length = mVar.length();
            mVar.d(uVar);
            org.commonmark.node.b bVarH = uVar.h();
            if (bVarH instanceof w) {
                w wVar = (w) bVarH;
                int iT = wVar.t();
                io.noties.markwon.core.b.f297494a.h(mVar.i(), io.noties.markwon.core.b.a.ORDERED);
                io.noties.markwon.core.b.f297496c.h(mVar.i(), Integer.valueOf(iT));
                wVar.v(wVar.t() + 1);
            } else {
                io.noties.markwon.core.b.f297494a.h(mVar.i(), io.noties.markwon.core.b.a.BULLET);
                io.noties.markwon.core.b.f297495b.h(mVar.i(), Integer.valueOf(a.E(uVar)));
            }
            mVar.j(uVar, length);
            if (mVar.y(uVar)) {
                mVar.p();
            }
        }
    }

    public interface p {
        void a(@NonNull io.noties.markwon.m mVar, @NonNull String str, int i10);
    }

    protected a() {
    }

    private static void A(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(q.class, new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B(@NonNull x xVar) {
        org.commonmark.node.b bVarH = xVar.h();
        if (bVarH != null) {
            v vVarH = bVarH.h();
            if (vVarH instanceof t) {
                return ((t) vVarH).q();
            }
        }
        return false;
    }

    private static void C(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(r.class, new f());
    }

    private static void D(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.u.class, new o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(@NonNull v vVar) {
        int i10 = 0;
        for (v vVarH = vVar.h(); vVarH != null; vVarH = vVarH.h()) {
            if (vVarH instanceof org.commonmark.node.u) {
                i10++;
            }
        }
        return i10;
    }

    private static void F(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(w.class, new io.noties.markwon.core.d());
    }

    private static void G(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(x.class, new e());
    }

    private static void H(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(y.class, new c());
    }

    private static void I(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(z.class, new h());
    }

    private void J(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(a0.class, new g());
    }

    private static void K(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(b0.class, new C2112a());
    }

    @l1
    static void L(@NonNull io.noties.markwon.m mVar, @p0 String str, @NonNull String str2, @NonNull v vVar) {
        mVar.h(vVar);
        int length = mVar.length();
        mVar.builder().append(kotlin.text.b0.f313282g).append('\n').append(mVar.n().g().a(str, str2));
        mVar.p();
        mVar.builder().append(kotlin.text.b0.f313282g);
        io.noties.markwon.core.b.f297500g.h(mVar.i(), str);
        mVar.j(vVar, length);
        mVar.I(vVar);
    }

    private static void p(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.c.class, new j());
    }

    private static void q(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.d.class, new io.noties.markwon.core.d());
    }

    private static void r(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.e.class, new k());
    }

    @NonNull
    public static a s() {
        return new a();
    }

    private static void t(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.j.class, new i());
    }

    @NonNull
    public static Set<Class<? extends org.commonmark.node.b>> u() {
        return new HashSet(Arrays.asList(org.commonmark.node.c.class, org.commonmark.node.m.class, org.commonmark.node.k.class, org.commonmark.node.n.class, b0.class, t.class, q.class));
    }

    private static void v(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.k.class, new l());
    }

    private static void w(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.l.class, new d());
    }

    private static void y(@NonNull io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.m.class, new b());
    }

    private static void z(io.noties.markwon.m.b bVar) {
        bVar.a(org.commonmark.node.p.class, new n());
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void c(@NonNull TextView textView) {
        if (this.f297492b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void d(@NonNull io.noties.markwon.m.b bVar) {
        J(bVar);
        I(bVar);
        t(bVar);
        p(bVar);
        r(bVar);
        v(bVar);
        A(bVar);
        z(bVar);
        q(bVar);
        F(bVar);
        D(bVar);
        K(bVar);
        y(bVar);
        H(bVar);
        w(bVar);
        G(bVar);
        C(bVar);
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void e(@NonNull io.noties.markwon.k.a aVar) {
        aj.b bVar = new aj.b();
        aVar.e(z.class, new aj.h()).e(org.commonmark.node.j.class, new aj.d()).e(org.commonmark.node.c.class, new aj.a()).e(org.commonmark.node.e.class, new aj.c()).e(org.commonmark.node.k.class, bVar).e(q.class, bVar).e(org.commonmark.node.u.class, new aj.g()).e(org.commonmark.node.m.class, new aj.e()).e(r.class, new aj.f()).e(b0.class, new aj.i());
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        io.noties.markwon.core.spans.j.a(textView, spanned);
        if (spanned instanceof Spannable) {
            io.noties.markwon.core.spans.m.a((Spannable) spanned, textView);
        }
    }

    @NonNull
    public a o(@NonNull p pVar) {
        this.f297491a.add(pVar);
        return this;
    }

    @NonNull
    public a x(boolean z10) {
        this.f297492b = z10;
        return this;
    }
}
