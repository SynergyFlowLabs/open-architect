package com.rabbitmq.client.impl.recovery;

import com.rabbitmq.client.b1;
import com.rabbitmq.client.j1;
import com.rabbitmq.client.l1;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes13.dex */
public class c implements com.rabbitmq.client.v0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final org.slf4j.c f265688l = org.slf4j.e.k(c.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile d0 f265689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile m f265690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<j1> f265691c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.rabbitmq.client.y0> f265692d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<b1> f265693e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<com.rabbitmq.client.o> f265694f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<String> f265695g = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f265696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f265697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f265698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f265699k;

    class a implements com.rabbitmq.client.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.n f265700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.n f265701b;

        a(com.rabbitmq.client.n nVar, com.rabbitmq.client.n nVar2) {
            this.f265700a = nVar;
            this.f265701b = nVar2;
        }

        @Override // com.rabbitmq.client.o
        public void a(long j10, boolean z10) throws IOException {
            this.f265700a.a(j10, z10);
        }

        @Override // com.rabbitmq.client.o
        public void b(long j10, boolean z10) throws IOException {
            this.f265701b.a(j10, z10);
        }
    }

    class b implements com.rabbitmq.client.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.j f265703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.b0 f265704b;

        b(com.rabbitmq.client.j jVar, com.rabbitmq.client.b0 b0Var) {
            this.f265703a = jVar;
            this.f265704b = b0Var;
        }

        @Override // com.rabbitmq.client.t
        public void a(String str, l1 l1Var) {
        }

        @Override // com.rabbitmq.client.t
        public void b(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void c(String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            this.f265704b.a(str, new com.rabbitmq.client.c0(f0Var, cVar, bArr));
        }

        @Override // com.rabbitmq.client.t
        public void d(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void e(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void f(String str) throws IOException {
            this.f265703a.a(str);
        }
    }

    /* JADX INFO: renamed from: com.rabbitmq.client.impl.recovery.c$c, reason: collision with other inner class name */
    class C1843c implements com.rabbitmq.client.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.v f265706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.b0 f265707b;

        C1843c(com.rabbitmq.client.v vVar, com.rabbitmq.client.b0 b0Var) {
            this.f265706a = vVar;
            this.f265707b = b0Var;
        }

        @Override // com.rabbitmq.client.t
        public void a(String str, l1 l1Var) {
            this.f265706a.a(str, l1Var);
        }

        @Override // com.rabbitmq.client.t
        public void b(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void c(String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            this.f265707b.a(str, new com.rabbitmq.client.c0(f0Var, cVar, bArr));
        }

        @Override // com.rabbitmq.client.t
        public void d(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void e(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void f(String str) throws IOException {
        }
    }

    class d implements com.rabbitmq.client.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.j f265709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.v f265710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.b0 f265711c;

        d(com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar, com.rabbitmq.client.b0 b0Var) {
            this.f265709a = jVar;
            this.f265710b = vVar;
            this.f265711c = b0Var;
        }

        @Override // com.rabbitmq.client.t
        public void a(String str, l1 l1Var) {
            this.f265710b.a(str, l1Var);
        }

        @Override // com.rabbitmq.client.t
        public void b(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void c(String str, com.rabbitmq.client.f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            this.f265711c.a(str, new com.rabbitmq.client.c0(f0Var, cVar, bArr));
        }

        @Override // com.rabbitmq.client.t
        public void d(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void e(String str) {
        }

        @Override // com.rabbitmq.client.t
        public void f(String str) throws IOException {
            this.f265709a.a(str);
        }
    }

    public c(m mVar, d0 d0Var) {
        this.f265690b = mVar;
        this.f265689a = d0Var;
    }

    private void B0() throws IOException {
        int i10 = this.f265696h;
        if (i10 != 0) {
            Pa(i10, false);
        }
        int i11 = this.f265697i;
        if (i11 != 0) {
            Pa(i11, true);
        }
        if (this.f265698j) {
            D8();
        }
        if (this.f265699k) {
            ac();
        }
    }

    private void H(String str) {
        this.f265690b.Q0(str);
    }

    private void I(String str) {
        this.f265690b.R0(str);
    }

    private void N() {
        Iterator<com.rabbitmq.client.y0> it = this.f265692d.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    private void R() {
        Iterator<com.rabbitmq.client.y0> it = this.f265692d.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void T(String str, String str2, boolean z10, boolean z11, Map<String, Object> map, com.rabbitmq.client.t tVar) {
        t tVarE = new t(this, str2).d(z10).f(str).g(z11).c(map).e(tVar);
        this.f265695g.add(str);
        this.f265690b.e1(str, tVarE);
    }

    private void X(com.rabbitmq.client.a.g.d dVar, String str, String str2, boolean z10, boolean z11, Map<String, Object> map) {
        Y(str, new v(this, str).i(str2).f(z10).e(z11).d(map));
    }

    private void Y(String str, v vVar) {
        this.f265690b.g1(str, vVar);
    }

    public static /* synthetic */ void b(c cVar, com.rabbitmq.client.o0 o0Var, com.rabbitmq.client.m mVar) {
        cVar.getClass();
        if (mVar != null) {
            cVar.g0(mVar.getMethod(), o0Var);
        }
    }

    private void d0(String str, String str2, String str3, Map<String, Object> map) {
        this.f265690b.h1(this, str, str2, str3, map);
    }

    private com.rabbitmq.client.t e(com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) {
        return new b(jVar, b0Var);
    }

    private com.rabbitmq.client.t f(com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) {
        return new d(jVar, vVar, b0Var);
    }

    private void f0(com.rabbitmq.client.o0 o0Var) {
        if (o0Var instanceof com.rabbitmq.client.a.i.e) {
            x(((com.rabbitmq.client.a.i.e) o0Var).e());
            return;
        }
        if (o0Var instanceof com.rabbitmq.client.a.g.e) {
            r(((com.rabbitmq.client.a.g.e) o0Var).f());
            return;
        }
        if (o0Var instanceof com.rabbitmq.client.a.i.InterfaceC1824i) {
            com.rabbitmq.client.a.i.InterfaceC1824i interfaceC1824i = (com.rabbitmq.client.a.i.InterfaceC1824i) o0Var;
            y(interfaceC1824i.e(), interfaceC1824i.f(), interfaceC1824i.g(), interfaceC1824i.d());
            H(interfaceC1824i.f());
        } else if (o0Var instanceof com.rabbitmq.client.a.g.InterfaceC1812g) {
            com.rabbitmq.client.a.g.InterfaceC1812g interfaceC1812g = (com.rabbitmq.client.a.g.InterfaceC1812g) o0Var;
            t(interfaceC1812g.q1(), interfaceC1812g.P(), interfaceC1812g.g(), interfaceC1812g.d());
            H(interfaceC1812g.P());
        }
    }

    private void g0(com.rabbitmq.client.o0 o0Var, com.rabbitmq.client.o0 o0Var2) {
        if (o0Var instanceof com.rabbitmq.client.a.i.d) {
            if (!(o0Var2 instanceof com.rabbitmq.client.a.i.c)) {
                f265688l.m("RPC response {} and RPC request {} not compatible, topology not recorded.", o0Var.getClass(), o0Var2.getClass());
                return;
            } else {
                com.rabbitmq.client.a.i.c cVar = (com.rabbitmq.client.a.i.c) o0Var2;
                k0((com.rabbitmq.client.a.i.d) o0Var, cVar.e(), cVar.u(), cVar.o(), cVar.r(), cVar.d());
                return;
            }
        }
        if (o0Var instanceof com.rabbitmq.client.a.g.d) {
            if (!(o0Var2 instanceof com.rabbitmq.client.a.g.c)) {
                f265688l.m("RPC response {} and RPC request {} not compatible, topology not recorded.", o0Var.getClass(), o0Var2.getClass());
                return;
            } else {
                com.rabbitmq.client.a.g.c cVar2 = (com.rabbitmq.client.a.g.c) o0Var2;
                X((com.rabbitmq.client.a.g.d) o0Var, cVar2.f(), cVar2.c(), cVar2.u(), cVar2.r(), cVar2.d());
                return;
            }
        }
        if (o0Var instanceof com.rabbitmq.client.a.i.b) {
            if (!(o0Var2 instanceof com.rabbitmq.client.a.i.InterfaceC1815a)) {
                f265688l.m("RPC response {} and RPC request {} not compatible, topology not recorded.", o0Var.getClass(), o0Var2.getClass());
                return;
            } else {
                com.rabbitmq.client.a.i.InterfaceC1815a interfaceC1815a = (com.rabbitmq.client.a.i.InterfaceC1815a) o0Var2;
                r0(interfaceC1815a.e(), interfaceC1815a.f(), interfaceC1815a.g(), interfaceC1815a.d());
                return;
            }
        }
        if (o0Var instanceof com.rabbitmq.client.a.g.b) {
            if (!(o0Var2 instanceof com.rabbitmq.client.a.g.InterfaceC1805a)) {
                f265688l.m("RPC response {} and RPC request {} not compatible, topology not recorded.", o0Var.getClass(), o0Var2.getClass());
            } else {
                com.rabbitmq.client.a.g.InterfaceC1805a interfaceC1805a = (com.rabbitmq.client.a.g.InterfaceC1805a) o0Var2;
                d0(interfaceC1805a.q1(), interfaceC1805a.P(), interfaceC1805a.g(), interfaceC1805a.d());
            }
        }
    }

    private void j0(com.rabbitmq.client.a.i.d dVar, y yVar) {
        this.f265690b.j1(dVar, yVar);
    }

    private void k0(com.rabbitmq.client.a.i.d dVar, String str, boolean z10, boolean z11, boolean z12, Map<String, Object> map) {
        y yVarD = new y(this, dVar.e()).f(z10).g(z11).e(z12).d(map);
        if (str.equals("")) {
            yVarD.l(true);
        }
        j0(dVar, yVarD);
    }

    private com.rabbitmq.client.t o(com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) {
        return new C1843c(vVar, b0Var);
    }

    private void o0(String str, y yVar) {
        this.f265690b.l1(str, yVar);
    }

    private t q(String str) {
        this.f265695g.remove(str);
        return this.f265690b.Y(str);
    }

    private void r(String str) {
        this.f265690b.d0(str);
    }

    private void r0(String str, String str2, String str3, Map<String, Object> map) {
        this.f265690b.o1(this, str, str2, str3, map);
    }

    private boolean t(String str, String str2, String str3, Map<String, Object> map) {
        return this.f265690b.f0(this, str, str2, str3, map);
    }

    private void w0() {
        Iterator<com.rabbitmq.client.o> it = this.f265694f.iterator();
        while (it.hasNext()) {
            this.f265689a.Db(it.next());
        }
    }

    private void x(String str) {
        this.f265690b.g0(str);
    }

    private void x0() {
        Iterator<b1> it = this.f265693e.iterator();
        while (it.hasNext()) {
            this.f265689a.Be(it.next());
        }
    }

    private boolean y(String str, String str2, String str3, Map<String, Object> map) {
        return this.f265690b.j0(this, str, str2, str3, map);
    }

    private void y0() {
        Iterator<j1> it = this.f265691c.iterator();
        while (it.hasNext()) {
            this.f265689a.h(it.next());
        }
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d A4(String str) throws IOException {
        return this.f265689a.A4(str);
    }

    @Override // com.rabbitmq.client.k
    public String A7(String str, boolean z10, String str2, com.rabbitmq.client.t tVar) throws IOException {
        return p3(str, z10, str2, false, false, null, tVar);
    }

    @Override // com.rabbitmq.client.k
    public String B6(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.t tVar) throws IOException {
        return p3(str, z10, "", false, false, map, tVar);
    }

    @Override // com.rabbitmq.client.k
    public void Be(b1 b1Var) {
        this.f265693e.add(b1Var);
        this.f265689a.Be(b1Var);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.p C0() {
        return this.f265689a.N();
    }

    @Override // com.rabbitmq.client.k
    public boolean C2(long j10) throws InterruptedException, TimeoutException {
        return this.f265689a.C2(j10);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d Cb(String str, com.rabbitmq.client.i iVar, boolean z10, boolean z11, Map<String, Object> map) throws IOException {
        return g9(str, iVar.k(), z10, z11, map);
    }

    @Override // com.rabbitmq.client.k
    public String D7(String str, boolean z10, String str2, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, str2, false, false, null, f(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.e.b D8() throws IOException {
        this.f265698j = true;
        return this.f265689a.D8();
    }

    @Override // com.rabbitmq.client.k
    public void D9(long j10, boolean z10) throws IOException {
        this.f265689a.D9(j10, z10);
    }

    @Override // com.rabbitmq.client.k
    public void Db(com.rabbitmq.client.o oVar) {
        this.f265694f.add(oVar);
        this.f265689a.Db(oVar);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.h De(String str, String str2, String str3) throws IOException {
        return qc(str, str2, str3, null);
    }

    public com.rabbitmq.client.k E() {
        return this.f265689a;
    }

    @Override // com.rabbitmq.client.k
    public void E8(String str, boolean z10, boolean z11) throws IOException {
        x(str);
        this.f265689a.E8(str, z10, z11);
    }

    @Override // com.rabbitmq.client.k
    public long F4(String str) throws IOException {
        return this.f265689a.F4(str);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.b.p Fc(boolean z10) throws IOException {
        return this.f265689a.Fc(z10);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.m G5(com.rabbitmq.client.o0 o0Var) throws IOException {
        f0(o0Var);
        com.rabbitmq.client.impl.e eVarH0 = this.f265689a.G5(o0Var);
        g0(eVarH0.getMethod(), o0Var);
        return eVarH0;
    }

    @Override // com.rabbitmq.client.k
    public void Gd() throws InterruptedException, IOException {
        this.f265689a.Gd();
    }

    void H0(String str, String str2) {
        synchronized (this.f265695g) {
            this.f265695g.remove(str);
            this.f265695g.add(str2);
        }
    }

    @Override // com.rabbitmq.client.k
    public void I5(int i10) throws IOException {
        R1(0, i10, false);
    }

    @Override // com.rabbitmq.client.k
    public void Ie(String str, com.rabbitmq.client.i iVar, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        Xb(str, iVar.k(), z10, z11, z12, map);
    }

    @Override // com.rabbitmq.client.k
    public String K2(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, str2, z11, z12, map, f(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.b.p L4() throws IOException {
        return this.f265689a.L4();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.d L7(String str, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        com.rabbitmq.client.impl.k.i.d dVarQ2 = this.f265689a.L7(str, z10, z11, z12, map);
        k0(dVarQ2, str, z10, z11, z12, map);
        return dVarQ2;
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.f Le(String str, boolean z10) throws IOException {
        r(str);
        return this.f265689a.Le(str, z10);
    }

    @Override // com.rabbitmq.client.k
    public void M5(String str, String str2, boolean z10, boolean z11, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        this.f265689a.M5(str, str2, z10, z11, cVar, bArr);
    }

    @Override // com.rabbitmq.client.k
    public void Ne() {
        this.f265693e.clear();
        this.f265689a.Ne();
    }

    @Override // com.rabbitmq.client.k
    public boolean O3() throws InterruptedException {
        return this.f265689a.O3();
    }

    @Override // com.rabbitmq.client.k
    public void O9(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        this.f265689a.O9(str, str2, str3, map);
        d0(str, str2, str3, map);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d P1(String str, com.rabbitmq.client.i iVar, boolean z10) throws IOException {
        return X7(str, iVar.k(), z10);
    }

    @Override // com.rabbitmq.client.k
    public void Pa(int i10, boolean z10) throws IOException {
        R1(0, i10, z10);
    }

    @Override // com.rabbitmq.client.k
    public void Qc(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        this.f265689a.Qc(str, str2, str3, map);
        t(str, str2, str3, map);
    }

    @Override // com.rabbitmq.client.k
    public void Qe() {
        this.f265694f.clear();
        this.f265689a.Qe();
    }

    @Override // com.rabbitmq.client.k
    public void R1(int i10, int i11, boolean z10) throws IOException {
        if (z10) {
            this.f265697i = i11;
        } else {
            this.f265696h = i11;
        }
        this.f265689a.R1(i10, i11, z10);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.b R3(String str, String str2, String str3) throws IOException {
        return q9(str, str2, str3, null);
    }

    @Override // com.rabbitmq.client.k
    public void Tc(com.rabbitmq.client.t tVar) {
        this.f265689a.Tc(tVar);
    }

    @Override // com.rabbitmq.client.k
    public void U4(String str, boolean z10) throws IOException {
        r(str);
        this.f265689a.U4(str, z10);
    }

    @Override // com.rabbitmq.client.k
    public String Ua(String str, boolean z10, String str2, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return p3(str, z10, str2, false, false, null, e(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public boolean Ub(b1 b1Var) {
        this.f265693e.remove(b1Var);
        return this.f265689a.Ub(b1Var);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.b V2(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        com.rabbitmq.client.impl.k.i.b bVarO2 = this.f265689a.V2(str, str2, str3, map);
        r0(str, str2, str3, map);
        return bVarO2;
    }

    @Override // com.rabbitmq.client.k
    public String V7(String str, boolean z10, String str2, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        int i10 = 0 << 0;
        return p3(str, z10, str2, false, false, null, o(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    public int V8() {
        return this.f265689a.V8();
    }

    @Override // com.rabbitmq.client.k
    public void W1(String str, String str2, boolean z10, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        this.f265689a.W1(str, str2, z10, cVar, bArr);
    }

    @Override // com.rabbitmq.client.k
    public String Wb(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, str2, z11, z12, map, o(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d X7(String str, String str2, boolean z10) throws IOException {
        return g9(str, str2, z10, false, null);
    }

    @Override // com.rabbitmq.client.k
    public void Xb(String str, String str2, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        Y(str, new v(this, str).i(str2).f(z10).e(z11).d(map));
        this.f265689a.Xb(str, str2, z10, z11, z12, map);
    }

    @Override // com.rabbitmq.client.k
    public void Z1(com.rabbitmq.client.o0 o0Var) throws IOException {
        this.f265689a.Z1(o0Var);
    }

    @Override // com.rabbitmq.client.k
    public String Z9(String str, boolean z10, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return A7(str, z10, "", f(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.j Zd(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        y(str, str2, str3, map);
        H(str2);
        return this.f265689a.Zd(str, str2, str3, map);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d a2(String str, com.rabbitmq.client.i iVar) throws IOException {
        return c3(str, iVar.k());
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.j.b a8() throws IOException {
        return this.f265689a.a8();
    }

    @Override // com.rabbitmq.client.k
    public void abort() throws IOException {
        this.f265689a.abort();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.j.f ac() throws IOException {
        this.f265699k = true;
        return this.f265689a.ac();
    }

    @Override // com.rabbitmq.client.k
    public String ad(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, "", false, false, map, o(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.d b3(String str) throws IOException {
        return this.f265689a.b3(str);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.j bc(String str, String str2, String str3) throws IOException {
        return Zd(str, str2, str3, null);
    }

    public void c(m mVar, com.rabbitmq.client.p pVar) throws IOException {
        d0 d0Var = this.f265689a;
        this.f265690b = mVar;
        d0 d0Var2 = (d0) pVar.Ae(V8());
        if (d0Var2 == null) {
            throw new IOException("Failed to create new channel for channel number=" + V8() + " during recovery");
        }
        d0Var2.o3(d0Var);
        this.f265689a = d0Var2;
        R();
        y0();
        x0();
        w0();
        B0();
        N();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d c3(String str, String str2) throws IOException {
        return g9(str, str2, false, false, null);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.h0 ca(String str, boolean z10) throws IOException {
        return this.f265689a.ca(str, z10);
    }

    @Override // com.rabbitmq.client.k, java.lang.AutoCloseable
    public void close() throws TimeoutException, IOException {
        try {
            this.f265689a.close();
            Iterator<String> it = this.f265695g.iterator();
            while (it.hasNext()) {
                this.f265690b.Y(it.next());
            }
            m mVar = this.f265690b;
        } finally {
            Iterator<String> it2 = this.f265695g.iterator();
            while (it2.hasNext()) {
                this.f265690b.Y(it2.next());
            }
            this.f265690b.q2(this);
        }
    }

    @Override // com.rabbitmq.client.u0
    public void d(com.rabbitmq.client.y0 y0Var) {
        this.f265692d.remove(y0Var);
    }

    @Override // com.rabbitmq.client.k
    public String d3(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return p3(str, z10, "", false, false, map, f(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    public void d5(String str) throws IOException {
        t tVarQ = q(str);
        if (tVarQ != null) {
            I(tVarQ.i());
        }
        this.f265689a.d5(str);
    }

    @Override // com.rabbitmq.client.k
    public void d6(String str, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        y yVarD = new y(this, str).f(z10).g(z11).e(z12).d(map);
        this.f265689a.d6(str, z10, z11, z12, map);
        o0(str, yVarD);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.o e4(com.rabbitmq.client.n nVar, com.rabbitmq.client.n nVar2) {
        a aVar = new a(nVar, nVar2);
        Db(aVar);
        return aVar;
    }

    @Override // com.rabbitmq.client.k
    public String ec(String str, boolean z10, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return p3(str, z10, "", false, false, map, e(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d fc(String str, String str2, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        com.rabbitmq.client.impl.k.g.d dVarT2 = this.f265689a.fc(str, str2, z10, z11, z12, map);
        X(dVarT2, str, str2, z10, z11, map);
        return dVarT2;
    }

    @Override // com.rabbitmq.client.k1
    public l1 g() {
        return this.f265689a.g();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d g9(String str, String str2, boolean z10, boolean z11, Map<String, Object> map) throws IOException {
        return fc(str, str2, z10, z11, false, map);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.h gb(String str) throws IOException {
        return this.f265689a.gb(str);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.f gc(String str) throws IOException {
        return lc(str, false, false);
    }

    @Override // com.rabbitmq.client.k
    public long gf(String str) throws IOException {
        return this.f265689a.gf(str);
    }

    @Override // com.rabbitmq.client.k1
    public void h(j1 j1Var) {
        this.f265691c.add(j1Var);
        this.f265689a.h(j1Var);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.j.d id() throws IOException {
        return this.f265689a.id();
    }

    @Override // com.rabbitmq.client.k1
    public boolean isOpen() {
        return this.f265689a.isOpen();
    }

    @Override // com.rabbitmq.client.k1
    public void j(j1 j1Var) {
        this.f265691c.remove(j1Var);
        this.f265689a.j(j1Var);
    }

    @Override // com.rabbitmq.client.k
    public CompletableFuture<com.rabbitmq.client.m> j6(final com.rabbitmq.client.o0 o0Var) throws IOException {
        f0(o0Var);
        CompletableFuture<com.rabbitmq.client.m> completableFutureJ6 = this.f265689a.j6(o0Var);
        completableFutureJ6.thenAccept(new Consumer() { // from class: com.rabbitmq.client.impl.recovery.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c.b(this.f265673a, o0Var, (com.rabbitmq.client.m) obj);
            }
        });
        return completableFutureJ6;
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.d k6() throws IOException {
        return L7("", false, true, true, null);
    }

    @Override // com.rabbitmq.client.k1
    public void l() {
        this.f265689a.l();
    }

    @Override // com.rabbitmq.client.k
    public String l4(String str, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return o5(str, e(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.f lc(String str, boolean z10, boolean z11) throws IOException {
        x(str);
        return this.f265689a.lc(str, z10, z11);
    }

    @Override // com.rabbitmq.client.k
    public void le(String str, String str2, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        this.f265689a.le(str, str2, cVar, bArr);
    }

    @Override // com.rabbitmq.client.u0
    public void m(com.rabbitmq.client.y0 y0Var) {
        this.f265692d.add(y0Var);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.d m9(String str, com.rabbitmq.client.i iVar, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException {
        return fc(str, iVar.k(), z10, z11, z12, map);
    }

    @Override // com.rabbitmq.client.k
    public b1 me(final com.rabbitmq.client.a1 a1Var) {
        b1 b1Var = new b1() { // from class: com.rabbitmq.client.impl.recovery.b
            @Override // com.rabbitmq.client.b1
            public final void a(int i10, String str, String str2, String str3, com.rabbitmq.client.a.c cVar, byte[] bArr) {
                a1Var.a(new com.rabbitmq.client.z0(i10, str, str2, str3, cVar, bArr));
            }
        };
        Be(b1Var);
        return b1Var;
    }

    @Override // com.rabbitmq.client.k
    public String o5(String str, com.rabbitmq.client.t tVar) throws IOException {
        return we(str, false, tVar);
    }

    @Override // com.rabbitmq.client.k
    public String p3(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.t tVar) throws IOException {
        String strP3 = this.f265689a.p3(str, z10, str2, z11, z12, map, tVar);
        T(strP3, str, z10, z12, map, tVar);
        return strP3;
    }

    @Override // com.rabbitmq.client.k
    public String pc(String str, boolean z10, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return A7(str, z10, "", o(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    public void q3(long j10, boolean z10, boolean z11) throws IOException {
        this.f265689a.q3(j10, z10, z11);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.t q4() {
        return this.f265689a.q4();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.b q9(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        com.rabbitmq.client.impl.k.g.b bVarD2 = this.f265689a.q9(str, str2, str3, map);
        d0(str, str2, str3, map);
        return bVarD2;
    }

    @Override // com.rabbitmq.client.k
    public boolean qb(com.rabbitmq.client.o oVar) {
        this.f265694f.remove(oVar);
        return this.f265689a.qb(oVar);
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.h qc(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        t(str, str2, str3, map);
        H(str2);
        return this.f265689a.qc(str, str2, str3, map);
    }

    @Override // com.rabbitmq.client.k
    public void r1(int i10, String str) throws IOException {
        this.f265689a.r1(i10, str);
    }

    @Override // com.rabbitmq.client.k
    public String t6(String str, boolean z10, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return A7(str, z10, "", e(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public String t8(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar) throws IOException {
        return p3(str, z10, str2, z11, z12, map, e(b0Var, jVar));
    }

    @Override // com.rabbitmq.client.k
    public void tc(long j10) throws InterruptedException, TimeoutException, IOException {
        this.f265689a.tc(j10);
    }

    public String toString() {
        return this.f265689a.toString();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.i.b vb(String str, String str2, String str3) throws IOException {
        return V2(str, str2, str3, null);
    }

    @Override // com.rabbitmq.client.k
    public long vd() {
        return this.f265689a.vd();
    }

    @Override // com.rabbitmq.client.k
    public com.rabbitmq.client.a.g.f ve(String str) throws IOException {
        return Le(str, false);
    }

    @Override // com.rabbitmq.client.k
    public String we(String str, boolean z10, com.rabbitmq.client.t tVar) throws IOException {
        return A7(str, z10, "", tVar);
    }

    @Override // com.rabbitmq.client.k
    public String xe(String str, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.v vVar) throws IOException {
        return o5(str, o(b0Var, vVar));
    }

    @Override // com.rabbitmq.client.k
    public String yc(String str, com.rabbitmq.client.b0 b0Var, com.rabbitmq.client.j jVar, com.rabbitmq.client.v vVar) throws IOException {
        return we(str, false, f(b0Var, jVar, vVar));
    }

    @Override // com.rabbitmq.client.k
    public void z6(long j10, boolean z10) throws IOException {
        this.f265689a.z6(j10, z10);
    }

    @Override // com.rabbitmq.client.k
    public void zb(String str, String str2, String str3, Map<String, Object> map) throws IOException {
        this.f265689a.zb(str, str2, str3, map);
        r0(str, str2, str3, map);
    }

    @Override // com.rabbitmq.client.k
    public void close(int i10, String str) throws TimeoutException, IOException {
        try {
            this.f265689a.close(i10, str);
        } finally {
            this.f265690b.q2(this);
        }
    }
}
