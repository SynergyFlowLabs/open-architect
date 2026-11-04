package io.ably.lib.realtime;

import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.c0;
import io.ably.lib.types.d0;
import io.ably.lib.types.e0;
import io.ably.lib.types.r;
import io.ably.lib.types.w;
import io.ably.lib.util.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f287646i = "waitForSync";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f287647j = "clientId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f287648k = "connectionId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f287649l = io.ably.lib.realtime.b.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f287650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumMap<c0.a, d> f287651b = new EnumMap<>(c0.a.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<g> f287652c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f287653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f287654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.ably.lib.realtime.b f287655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f287656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f287657h;

    class a implements io.ably.lib.realtime.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f287658a;

        a(c0 c0Var) {
            this.f287658a = c0Var;
        }

        @Override // io.ably.lib.realtime.g
        public void a(r rVar) {
            String str = String.format(Locale.ROOT, "Cannot automatically re-enter %s on channel %s (%s)", this.f287658a.f288019c, l.this.f287655f.f287536c, rVar.f288158c);
            io.ably.lib.util.k.d(l.f287649l, str);
            l.this.f287655f.M(new r(str, 91004), true);
        }

        @Override // io.ably.lib.realtime.g
        public void onSuccess() {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f287660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f287661b;

        static {
            int[] iArr = new int[io.ably.lib.realtime.e.values().length];
            f287661b = iArr;
            try {
                iArr[io.ably.lib.realtime.e.initialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f287661b[io.ably.lib.realtime.e.attaching.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f287661b[io.ably.lib.realtime.e.attached.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[c0.a.values().length];
            f287660a = iArr2;
            try {
                iArr2[c0.a.enter.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f287660a[c0.a.update.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f287660a[c0.a.present.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f287660a[c0.a.leave.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f287660a[c0.a.absent.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private class c extends f {
        private c() {
            super(l.this, null);
        }

        @Override // io.ably.lib.realtime.l.f
        public String g(c0 c0Var) {
            return c0Var.f288019c;
        }

        /* synthetic */ c(l lVar, a aVar) {
            this();
        }
    }

    private static class d extends io.ably.lib.util.l<e> implements e {
        private d() {
            super(new e[0]);
        }

        @Override // io.ably.lib.realtime.l.e
        public void d(c0 c0Var) {
            Iterator<e> it = i().iterator();
            while (it.hasNext()) {
                try {
                    it.next().d(c0Var);
                } catch (Throwable unused) {
                }
            }
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    public interface e {
        void d(c0 c0Var);
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c0 f287667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.ably.lib.realtime.g f287668b;

        g(c0 c0Var, io.ably.lib.realtime.g gVar) {
            this.f287667a = c0Var;
            this.f287668b = gVar;
        }
    }

    l(io.ably.lib.realtime.b bVar) {
        a aVar = null;
        this.f287650a = new d(aVar);
        this.f287653d = new f(this, aVar);
        this.f287654e = new c(this, aVar);
        this.f287655f = bVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void F() {
        io.ably.lib.realtime.g gVar;
        io.ably.lib.util.k.k(f287649l, "sendQueuedMessages()");
        io.ably.lib.realtime.a aVar = this.f287655f.f287552s;
        boolean z10 = aVar.f287674a.f288126v;
        io.ably.lib.transport.b bVar = aVar.f287532i.f287618i;
        int size = this.f287652c.size();
        if (size == 0) {
            return;
        }
        e0 e0Var = new e0(e0.a.presence, this.f287655f.f287536c);
        Iterator<g> it = this.f287652c.iterator();
        c0[] c0VarArr = new c0[size];
        e0Var.f287966l = c0VarArr;
        int i10 = 0;
        if (size == 1) {
            g next = it.next();
            c0VarArr[0] = next.f287667a;
            gVar = next.f287668b;
        } else {
            io.ably.lib.realtime.g.b bVar2 = new io.ably.lib.realtime.g.b(new io.ably.lib.realtime.g[0]);
            while (it.hasNext()) {
                g next2 = it.next();
                int i11 = i10 + 1;
                c0VarArr[i10] = next2.f287667a;
                io.ably.lib.realtime.g gVar2 = next2.f287668b;
                if (gVar2 != null) {
                    bVar2.g(gVar2);
                }
                i10 = i11;
            }
            boolean zJ = bVar2.j();
            gVar = bVar2;
            if (zJ) {
                gVar = null;
            }
        }
        this.f287652c.clear();
        try {
            bVar.r0(e0Var, z10, gVar);
        } catch (io.ably.lib.types.a e10) {
            io.ably.lib.util.k.e(f287649l, "sendQueuedMessages(): Unexpected exception sending message", e10);
            if (gVar != null) {
                gVar.a(e10.f287918a);
            }
        }
    }

    private void M(c0.a aVar, e eVar) {
        d dVar = this.f287651b.get(aVar);
        if (dVar == null) {
            dVar = new d(null);
            this.f287651b.put(aVar, dVar);
        }
        dVar.g(eVar);
    }

    private void R(c0.a aVar, e eVar) {
        d dVar = this.f287651b.get(aVar);
        if (dVar != null) {
            dVar.k(eVar);
            if (dVar.j()) {
                this.f287651b.remove(aVar);
            }
        }
    }

    private void W(e0 e0Var) {
        int i10 = 0;
        while (true) {
            c0[] c0VarArr = e0Var.f287966l;
            if (i10 >= c0VarArr.length) {
                return;
            }
            c0 c0Var = c0VarArr[i10];
            try {
                c0Var.b(this.f287655f.f287554u);
            } catch (w e10) {
                io.ably.lib.util.k.d(f287649l, String.format(Locale.ROOT, "%s on channel %s", e10.f287918a.f288158c, this.f287655f.f287536c));
            }
            if (c0Var.f288020d == null) {
                c0Var.f288020d = e0Var.f287962h;
            }
            if (c0Var.f288018b == 0) {
                c0Var.f288018b = e0Var.f287964j;
            }
            if (c0Var.f288017a == null) {
                c0Var.f288017a = e0Var.f287959e + AbstractJsonLexerKt.COLON + i10;
            }
            i10++;
        }
    }

    private void d(List<c0> list) {
        for (c0 c0Var : list) {
            this.f287650a.d(c0Var);
            d dVar = this.f287651b.get(c0Var.f287937s);
            if (dVar != null) {
                dVar.d(c0Var);
            }
        }
    }

    private void e() {
        List<c0> listD = this.f287653d.d();
        for (c0 c0Var : listD) {
            c0Var.f287937s = c0.a.leave;
            c0Var.f288017a = null;
            c0Var.f288018b = System.currentTimeMillis();
        }
        d(listD);
    }

    private void j(String str, String str2, Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        if (str2 == null) {
            String str3 = String.format(Locale.ROOT, "Channel %s: unable to enter presence channel (null clientId specified)", this.f287655f.f287536c);
            io.ably.lib.util.k.k(f287649l, str3);
            if (gVar != null) {
                gVar.a(new r(str3, 40000));
                return;
            }
        }
        c0 c0Var = new c0(c0.a.enter, str2, obj);
        c0Var.f288017a = str;
        io.ably.lib.util.k.k(f287649l, "enterClient(); channel = " + this.f287655f.f287536c + "; clientId = " + str2);
        X(c0Var, gVar);
    }

    private void l(r rVar) {
        io.ably.lib.util.k.k(f287649l, "failQueuedMessages()");
        Iterator<g> it = this.f287652c.iterator();
        while (it.hasNext()) {
            io.ably.lib.realtime.g gVar = it.next().f287668b;
            if (gVar != null) {
                try {
                    gVar.a(rVar);
                } catch (Throwable th2) {
                    io.ably.lib.util.k.e(f287649l, "failQueuedMessages(): Unexpected exception calling listener", th2);
                }
            }
        }
        this.f287652c.clear();
    }

    private io.ably.lib.http.d.f<c0> t(io.ably.lib.http.f fVar, b0[] b0VarArr) {
        try {
            b0[] b0VarArrI0 = io.ably.lib.realtime.c.i0(this.f287655f, b0VarArr);
            io.ably.lib.realtime.b bVar = this.f287655f;
            io.ably.lib.realtime.a aVar = bVar.f287552s;
            return new io.ably.lib.http.d(fVar, this.f287655f.f287553t + "/presence/history", io.ably.lib.http.m.d(aVar.f287674a.f288125u), b0VarArrI0, d0.e(bVar.f287554u)).h();
        } catch (io.ably.lib.types.a e10) {
            return new io.ably.lib.http.d.f.b(e10);
        }
    }

    private void u(io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        if (!this.f287655f.A()) {
            if (gVar == null) {
                return;
            }
            String str = String.format("Channel %s: attachOnSubscribe=false doesn't expect attach completion callback", this.f287655f.f287536c);
            io.ably.lib.util.k.d(f287649l, str);
            throw io.ably.lib.types.a.a(new r(str, 400, 40000));
        }
        io.ably.lib.realtime.b bVar = this.f287655f;
        if (bVar.f287538e != io.ably.lib.realtime.e.failed) {
            bVar.x(gVar);
        } else {
            String str2 = String.format(Locale.ROOT, "Channel %s: subscribe in FAILED channel state", bVar.f287536c);
            io.ably.lib.util.k.d(f287649l, str2);
            throw io.ably.lib.types.a.a(new r(str2, 90001));
        }
    }

    void A(boolean z10) {
        this.f287653d.j();
        if (!z10) {
            e();
        }
        F();
        k();
    }

    void B(r rVar) {
        synchronized (this.f287653d) {
            try {
                this.f287653d.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f287653d.c();
        this.f287654e.c();
        l(rVar);
    }

    void C(r rVar) {
        synchronized (this.f287653d) {
            this.f287653d.notifyAll();
        }
        l(rVar);
    }

    void D(e0 e0Var) {
        boolean zH;
        W(e0Var);
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : e0Var.f287966l) {
            boolean zEquals = c0Var.f288020d.equals(this.f287655f.f287552s.f287532i.f287616g);
            int i10 = b.f287660a[c0Var.f287937s.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                c0 c0Var2 = (c0) c0Var.clone();
                c0Var2.f287937s = c0.a.present;
                zH = this.f287653d.h(c0Var2);
                if (zEquals) {
                    this.f287654e.h(c0Var);
                }
            } else if (i10 != 4) {
                zH = false;
            } else {
                zH = this.f287653d.i(c0Var);
                if (zEquals) {
                    this.f287654e.i(c0Var);
                }
            }
            if (zH) {
                arrayList.add(c0Var);
            }
        }
        d(arrayList);
    }

    void E(e0 e0Var) {
        String str;
        String str2 = e0Var.f287961g;
        if (q.a(str2)) {
            str = null;
        } else {
            String[] strArrSplit = str2.split(":");
            String str3 = strArrSplit[0];
            str = strArrSplit.length > 1 ? strArrSplit[1] : "";
            if (this.f287653d.f287663a && !q.a(this.f287656g) && !this.f287656g.equals(str3)) {
                e();
            }
            this.f287653d.j();
            if (!q.a(str)) {
                this.f287656g = str3;
            }
        }
        D(e0Var);
        if (q.a(str2) || q.a(str)) {
            e();
            this.f287656g = null;
        }
    }

    public void G(e eVar) throws io.ably.lib.types.a {
        H(eVar, null);
    }

    public void H(e eVar, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        u(gVar);
        this.f287650a.g(eVar);
    }

    public void I(c0.a aVar, e eVar) throws io.ably.lib.types.a {
        J(aVar, eVar, null);
    }

    public void J(c0.a aVar, e eVar, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        u(gVar);
        M(aVar, eVar);
    }

    public void K(EnumSet<c0.a> enumSet, e eVar) throws io.ably.lib.types.a {
        L(enumSet, eVar, null);
    }

    public void L(EnumSet<c0.a> enumSet, e eVar, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        u(gVar);
        Iterator<c0.a> it = enumSet.iterator();
        while (it.hasNext()) {
            M(it.next(), eVar);
        }
    }

    public void N() {
        this.f287650a.h();
        this.f287651b.clear();
    }

    public void O(e eVar) {
        this.f287650a.k(eVar);
        Iterator<d> it = this.f287651b.values().iterator();
        while (it.hasNext()) {
            it.next().k(eVar);
        }
    }

    public void P(c0.a aVar, e eVar) {
        R(aVar, eVar);
    }

    public void Q(EnumSet<c0.a> enumSet, e eVar) {
        Iterator<c0.a> it = enumSet.iterator();
        while (it.hasNext()) {
            R(it.next(), eVar);
        }
    }

    public void S(Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287649l, "update(); channel = " + this.f287655f.f287536c);
        X(new c0(c0.a.update, null, obj), gVar);
    }

    public void T(String str) throws io.ably.lib.types.a {
        U(str, null);
    }

    public void U(String str, Object obj) throws io.ably.lib.types.a {
        V(str, obj, null);
    }

    public void V(String str, Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        if (str == null) {
            String str2 = String.format(Locale.ROOT, "Channel %s: unable to update presence channel (null clientId specified)", this.f287655f.f287536c);
            io.ably.lib.util.k.k(f287649l, str2);
            if (gVar != null) {
                gVar.a(new r(str2, 40000));
                return;
            }
        }
        io.ably.lib.util.k.k(f287649l, "updateClient(); channel = " + this.f287655f.f287536c + "; clientId = " + str);
        X(new c0(c0.a.update, str, obj), gVar);
    }

    public void X(c0 c0Var, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287649l, "updatePresence(); channel = " + this.f287655f.f287536c);
        io.ably.lib.realtime.a aVar = this.f287655f.f287552s;
        try {
            aVar.f287677d.h(c0Var, false, aVar.f287532i.f287612c == j.connected);
            c0Var.d(null);
            synchronized (this.f287655f) {
                try {
                    int i10 = b.f287661b[this.f287655f.f287538e.ordinal()];
                    if (i10 == 1) {
                        this.f287655f.w();
                    } else if (i10 != 2) {
                        if (i10 != 3) {
                            throw io.ably.lib.types.a.a(new r("Unable to enter presence channel in detached or failed state", 400, 91001));
                        }
                        e0 e0Var = new e0(e0.a.presence, this.f287655f.f287536c);
                        e0Var.f287966l = new c0[]{c0Var};
                        aVar.f287532i.f287618i.r0(e0Var, aVar.f287674a.f288126v, gVar);
                    }
                    this.f287652c.add(new g(c0Var, gVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (io.ably.lib.types.a e10) {
            if (gVar != null) {
                gVar.a(e10.f287918a);
            }
        }
    }

    void c(c0 c0Var, io.ably.lib.realtime.g gVar) {
        synchronized (this.f287655f) {
            this.f287652c.add(new g(c0Var, gVar));
        }
    }

    public void f(Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287649l, "enter(); channel = " + this.f287655f.f287536c);
        X(new c0(c0.a.enter, null, obj), gVar);
    }

    public void g(String str) throws io.ably.lib.types.a {
        h(str, null);
    }

    public void h(String str, Object obj) throws io.ably.lib.types.a {
        i(str, obj, null);
    }

    public void i(String str, Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        if (str == null) {
            String str2 = String.format(Locale.ROOT, "Channel %s: unable to enter presence channel (null clientId specified)", this.f287655f.f287536c);
            io.ably.lib.util.k.k(f287649l, str2);
            if (gVar != null) {
                gVar.a(new r(str2, 40000));
                return;
            }
        }
        io.ably.lib.util.k.k(f287649l, "enterClient(); channel = " + this.f287655f.f287536c + "; clientId = " + str);
        X(new c0(c0.a.enter, str, obj), gVar);
    }

    void k() {
        for (c0 c0Var : this.f287654e.f287665c.values()) {
            try {
                j(c0Var.f288017a, c0Var.f288019c, c0Var.f288022f, new a(c0Var));
            } catch (io.ably.lib.types.a e10) {
                String str = String.format(Locale.ROOT, "Cannot automatically re-enter %s on channel %s (%s)", c0Var.f288019c, this.f287655f.f287536c, e10.f287918a.f288158c);
                io.ably.lib.util.k.d(f287649l, str);
                this.f287655f.M(new r(str, 91004), true);
            }
        }
    }

    public synchronized c0[] m(String str, boolean z10) throws io.ably.lib.types.a {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return o(new b0(f287646i, String.valueOf(z10)), new b0(f287647j, str));
    }

    public synchronized c0[] n(boolean z10) throws io.ably.lib.types.a {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return o(new b0(f287646i, String.valueOf(z10)));
    }

    public synchronized c0[] o(b0... b0VarArr) throws io.ably.lib.types.a {
        Collection<c0> collectionE;
        io.ably.lib.realtime.b bVar = this.f287655f;
        if (bVar.f287538e == io.ably.lib.realtime.e.failed) {
            throw io.ably.lib.types.a.a(new r("channel operation failed (invalid channel state)", 90001));
        }
        bVar.w();
        try {
            collectionE = this.f287653d.e(b0VarArr);
        } catch (InterruptedException e10) {
            io.ably.lib.util.k.k(f287649l, String.format(Locale.ROOT, "Channel %s: get() operation interrupted", this.f287655f.f287536c));
            throw io.ably.lib.types.a.c(e10);
        }
        return (c0[]) collectionE.toArray(new c0[collectionE.size()]);
    }

    a0<c0> p(io.ably.lib.http.f fVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        return t(fVar, b0VarArr).b();
    }

    public a0<c0> q(b0[] b0VarArr) throws io.ably.lib.types.a {
        return p(this.f287655f.f287552s.f287675b, b0VarArr);
    }

    void r(io.ably.lib.http.f fVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<c0>> iVar) {
        t(fVar, b0VarArr).a(iVar);
    }

    public void s(b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<c0>> iVar) {
        t(this.f287655f.f287552s.f287675b, b0VarArr).a(iVar);
    }

    public void v(io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        w(null, gVar);
    }

    public void w(Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287649l, "leave(); channel = " + this.f287655f.f287536c);
        X(new c0(c0.a.leave, null, obj), gVar);
    }

    public void x(String str) throws io.ably.lib.types.a {
        y(str, null);
    }

    public void y(String str, Object obj) throws io.ably.lib.types.a {
        z(str, obj, null);
    }

    public void z(String str, Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        if (str == null) {
            String str2 = String.format(Locale.ROOT, "Channel %s: unable to leave presence channel (null clientId specified)", this.f287655f.f287536c);
            io.ably.lib.util.k.k(f287649l, str2);
            if (gVar != null) {
                gVar.a(new r(str2, 40000));
                return;
            }
        }
        io.ably.lib.util.k.k(f287649l, "leaveClient(); channel = " + this.f287655f.f287536c + "; clientId = " + str);
        X(new c0(c0.a.leave, str, obj), gVar);
    }

    private class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f287663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Collection<String> f287664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap<String, c0> f287665c;

        private f() {
            this.f287665c = new HashMap<>();
        }

        synchronized void c() {
            try {
                this.f287665c.clear();
                Collection<String> collection = this.f287664b;
                if (collection != null) {
                    collection.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized List<c0> d() {
            ArrayList arrayList;
            try {
                io.ably.lib.util.k.k(l.f287649l, "endSync(); channel = " + l.this.f287655f.f287536c + "; syncInProgress = " + this.f287663a);
                arrayList = new ArrayList();
                if (this.f287663a) {
                    Iterator<Map.Entry<String, c0>> it = this.f287665c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().f287937s == c0.a.absent) {
                            it.remove();
                        }
                    }
                    Iterator<String> it2 = this.f287664b.iterator();
                    while (it2.hasNext()) {
                        c0 c0VarRemove = this.f287665c.remove(it2.next());
                        if (c0VarRemove != null) {
                            arrayList.add((c0) c0VarRemove.clone());
                        }
                    }
                    this.f287664b = null;
                    this.f287663a = false;
                }
                l.this.f287657h = true;
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        synchronized Collection<c0> e(b0[] b0VarArr) throws InterruptedException, io.ably.lib.types.a {
            HashSet hashSet;
            byte b10;
            try {
                String str = null;
                int i10 = 2 << 1;
                String str2 = null;
                boolean z10 = true;
                for (b0 b0Var : b0VarArr) {
                    String str3 = b0Var.f287931a;
                    int iHashCode = str3.hashCode();
                    if (iHashCode != -485951537) {
                        if (iHashCode != 908408390) {
                            if (iHashCode == 1923106969 && str3.equals(l.f287648k)) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                        } else if (str3.equals(l.f287647j)) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (str3.equals(l.f287646i)) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        z10 = Boolean.parseBoolean(b0Var.f287932b);
                    } else if (b10 == 1) {
                        str = b0Var.f287932b;
                    } else if (b10 == 2) {
                        str2 = b0Var.f287932b;
                    }
                }
                hashSet = new HashSet();
                if (z10) {
                    k();
                }
                for (c0 c0Var : this.f287665c.values()) {
                    if (str == null || c0Var.f288019c.equals(str)) {
                        if (str2 == null || c0Var.f288020d.equals(str2)) {
                            hashSet.add(c0Var);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return hashSet;
        }

        synchronized boolean f(String str, c0 c0Var) {
            try {
                c0 c0Var2 = this.f287665c.get(str);
                boolean z10 = false;
                if (c0Var2 == null) {
                    return false;
                }
                String str2 = c0Var.f288020d;
                if (str2 == null || c0Var2.f288020d == null || (c0Var.f288017a.startsWith(str2) && c0Var2.f288017a.startsWith(c0Var2.f288020d))) {
                    String[] strArrSplit = c0Var.f288017a.split(":", 3);
                    String[] strArrSplit2 = c0Var2.f288017a.split(":", 3);
                    if (strArrSplit.length < 3 || strArrSplit2.length < 3) {
                        return false;
                    }
                    try {
                        long j10 = Long.parseLong(strArrSplit[1]);
                        long j11 = Long.parseLong(strArrSplit[2]);
                        long j12 = Long.parseLong(strArrSplit2[1]);
                        long j13 = Long.parseLong(strArrSplit2[2]);
                        if (j12 > j10 || (j12 == j10 && j13 >= j11)) {
                            z10 = true;
                        }
                        return z10;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
                return c0Var2.f288018b >= c0Var.f288018b;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public String g(c0 c0Var) {
            return c0Var.u();
        }

        synchronized boolean h(c0 c0Var) {
            try {
                String strG = g(c0Var);
                Collection<String> collection = this.f287664b;
                if (collection != null) {
                    collection.remove(strG);
                }
                if (f(strG, c0Var)) {
                    return false;
                }
                this.f287665c.put(strG, c0Var);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean i(c0 c0Var) {
            try {
                String strG = g(c0Var);
                if (f(strG, c0Var)) {
                    return false;
                }
                c0 c0VarRemove = this.f287665c.remove(strG);
                return c0VarRemove == null || c0VarRemove.f287937s != c0.a.absent;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized void j() {
            try {
                io.ably.lib.util.k.k(l.f287649l, "startSync(); channel = " + l.this.f287655f.f287536c + "; syncInProgress = " + this.f287663a);
                if (!this.f287663a) {
                    this.f287664b = new HashSet(this.f287665c.keySet());
                    this.f287663a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized void k() throws InterruptedException, io.ably.lib.types.a {
            String str;
            int i10;
            boolean z10;
            while (l.this.f287655f.f287538e == io.ably.lib.realtime.e.attaching) {
                try {
                    wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            boolean z11 = false;
            if (l.this.f287655f.f287538e == io.ably.lib.realtime.e.attached) {
                do {
                    z10 = !this.f287663a && l.this.f287657h;
                    if (!z10) {
                        wait();
                    }
                } while (!z10);
                z11 = z10;
            }
            if (l.this.f287655f.f287538e == io.ably.lib.realtime.e.suspended) {
                str = String.format(Locale.ROOT, "Channel %s: presence state is out of sync due to the channel being in a SUSPENDED state", l.this.f287655f.f287536c);
                i10 = 91005;
            } else if (!z11) {
                str = String.format(Locale.ROOT, "Channel %s: cannot get presence state because channel is in invalid state", l.this.f287655f.f287536c);
                i10 = 90001;
            }
            io.ably.lib.util.k.k(l.f287649l, str);
            throw io.ably.lib.types.a.a(new r(str, i10));
        }

        /* synthetic */ f(l lVar, a aVar) {
            this();
        }
    }
}
