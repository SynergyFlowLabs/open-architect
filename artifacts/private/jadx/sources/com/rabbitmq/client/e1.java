package com.rabbitmq.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public class e1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f265055m = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f265057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f265058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f265059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f265060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f265061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f265062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function<Object, c> f265063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, com.rabbitmq.utility.a<Object>> f265064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Supplier<String> f265065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f265066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x f265067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final org.slf4j.c f265054l = org.slf4j.e.k(e1.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Function<Object, c> f265056n = new Function() { // from class: com.rabbitmq.client.c1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return e1.b(obj);
        }
    };

    class a extends x {
        a(k kVar) {
            super(kVar);
        }

        @Override // com.rabbitmq.client.x, com.rabbitmq.client.t
        public void a(String str, l1 l1Var) {
            synchronized (e1.this.f265064h) {
                try {
                    Iterator it = e1.this.f265064h.entrySet().iterator();
                    while (it.hasNext()) {
                        ((com.rabbitmq.utility.a) ((Map.Entry) it.next()).getValue()).c(l1Var);
                    }
                    e1.this.f265067k = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.rabbitmq.client.x, com.rabbitmq.client.t
        public void c(String str, f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
            synchronized (e1.this.f265064h) {
                try {
                    String strF = cVar.f();
                    com.rabbitmq.utility.a aVar = (com.rabbitmq.utility.a) e1.this.f265064h.remove(strF);
                    if (aVar == null) {
                        e1.f265054l.w("No outstanding request for correlation ID {}", strF);
                    } else {
                        aVar.c(new c(str, f0Var, cVar, bArr));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class b implements Supplier<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f265069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f265070b;

        public b(String str) {
            this.f265069a = str;
        }

        @Override // java.util.function.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f265069a);
            int i10 = this.f265070b + 1;
            this.f265070b = i10;
            sb2.append(i10);
            return sb2.toString();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected String f265071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected f0 f265072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected com.rabbitmq.client.a.c f265073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected byte[] f265074d;

        public c() {
        }

        public byte[] a() {
            return this.f265074d;
        }

        public String b() {
            return this.f265071a;
        }

        public f0 c() {
            return this.f265072b;
        }

        public com.rabbitmq.client.a.c d() {
            return this.f265073c;
        }

        public c(String str, f0 f0Var, com.rabbitmq.client.a.c cVar, byte[] bArr) {
            this.f265071a = str;
            this.f265072b = f0Var;
            this.f265073c = cVar;
            this.f265074d = bArr;
        }
    }

    public e1(f1 f1Var) throws IOException {
        this.f265064h = new HashMap();
        this.f265066j = com.facebook.appevents.p.f99189d0;
        k kVarD = f1Var.d();
        this.f265057a = kVarD;
        this.f265058b = f1Var.f();
        this.f265059c = f1Var.i();
        this.f265060d = f1Var.h();
        int i10 = 0 & (-1);
        if (f1Var.j() < -1) {
            throw new IllegalArgumentException("Timeout argument must be NO_TIMEOUT(-1) or non-negative.");
        }
        this.f265061e = f1Var.j();
        boolean zN = f1Var.n();
        this.f265062f = zN;
        this.f265063g = f1Var.g();
        this.f265065i = f1Var.e();
        this.f265067k = z();
        if (zN) {
            kVarD.me(new a1() { // from class: com.rabbitmq.client.d1
                @Override // com.rabbitmq.client.a1
                public final void a(z0 z0Var) {
                    e1.a(this.f265044a, z0Var);
                }
            });
        }
    }

    public static /* synthetic */ void a(e1 e1Var, z0 z0Var) {
        synchronized (e1Var.f265064h) {
            try {
                String strF = z0Var.c().f();
                com.rabbitmq.utility.a<Object> aVarRemove = e1Var.f265064h.remove(strF);
                if (aVarRemove == null) {
                    f265054l.w("No outstanding request for correlation ID {}", strF);
                } else {
                    aVarRemove.c(new m2(z0Var));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ c b(Object obj) {
        if (!(obj instanceof l1)) {
            if (obj instanceof m2) {
                throw ((m2) obj);
            }
            return (c) obj;
        }
        l1 l1Var = (l1) obj;
        l1 l1Var2 = new l1(l1Var.d(), l1Var.e(), l1Var.b(), l1Var.c());
        l1Var2.initCause(l1Var);
        throw l1Var2;
    }

    public static Supplier<String> p() {
        return q("");
    }

    public static Supplier<String> q(String str) {
        return new b(str);
    }

    public String A(String str) throws TimeoutException, IOException, l1 {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (IOException unused) {
            bytes = str.getBytes();
        }
        byte[] bArrV = v(bytes);
        try {
            return new String(bArrV, "UTF-8");
        } catch (IOException unused2) {
            return new String(bArrV);
        }
    }

    public void f() throws IOException {
        if (this.f265067k == null) {
            throw new EOFException("RpcClient is closed");
        }
    }

    public void g() throws IOException {
        x xVar = this.f265067k;
        if (xVar != null) {
            this.f265057a.d5(xVar.h());
            this.f265067k = null;
        }
    }

    public c h(com.rabbitmq.client.a.c cVar, byte[] bArr) throws TimeoutException, IOException {
        return i(cVar, bArr, this.f265061e);
    }

    public c i(com.rabbitmq.client.a.c cVar, byte[] bArr, int i10) throws TimeoutException, IOException, l1 {
        String str;
        com.rabbitmq.client.a.c cVarB;
        f();
        com.rabbitmq.utility.a<Object> aVar = new com.rabbitmq.utility.a<>();
        synchronized (this.f265064h) {
            try {
                str = this.f265065i.get();
                this.f265066j = str;
                cVarB = (cVar == null ? new com.rabbitmq.client.a.c.C1777a() : cVar.l()).f(str).l(this.f265060d).b();
                this.f265064h.put(str, aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w(cVarB, bArr);
        try {
            return this.f265063g.apply(aVar.f(i10));
        } catch (TimeoutException e10) {
            this.f265064h.remove(str);
            throw e10;
        }
    }

    public k j() {
        return this.f265057a;
    }

    public t k() {
        return this.f265067k;
    }

    public Map<String, com.rabbitmq.utility.a<Object>> l() {
        return this.f265064h;
    }

    public int m() {
        return Integer.valueOf(this.f265066j).intValue();
    }

    public String n() {
        return this.f265058b;
    }

    public String o() {
        return this.f265059c;
    }

    public Map<String, Object> r(Map<String, Object> map) throws TimeoutException, IOException, l1 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.rabbitmq.client.impl.a1 a1Var = new com.rabbitmq.client.impl.a1(new com.rabbitmq.client.impl.k2(new DataOutputStream(byteArrayOutputStream)));
        a1Var.m(map);
        a1Var.b();
        return new com.rabbitmq.client.impl.z0(new com.rabbitmq.client.impl.j2(new DataInputStream(new ByteArrayInputStream(v(byteArrayOutputStream.toByteArray()))))).i();
    }

    public Map<String, Object> s(Object[] objArr) throws TimeoutException, IOException, l1 {
        HashMap map = new HashMap();
        int i10 = 1 >> 0;
        for (int i11 = 0; i11 < objArr.length; i11 += 2) {
            map.put((String) objArr[i11], objArr[i11 + 1]);
        }
        return r(map);
    }

    public byte[] t(com.rabbitmq.client.a.c cVar, byte[] bArr) throws TimeoutException, IOException, l1 {
        return u(cVar, bArr, this.f265061e);
    }

    public byte[] u(com.rabbitmq.client.a.c cVar, byte[] bArr, int i10) throws TimeoutException, IOException, l1 {
        return i(cVar, bArr, i10).a();
    }

    public byte[] v(byte[] bArr) throws TimeoutException, IOException, l1 {
        return t(null, bArr);
    }

    public void w(com.rabbitmq.client.a.c cVar, byte[] bArr) throws IOException {
        this.f265057a.W1(this.f265058b, this.f265059c, this.f265062f, cVar, bArr);
    }

    public c x(byte[] bArr) throws TimeoutException, IOException, l1 {
        return y(bArr, this.f265061e);
    }

    public c y(byte[] bArr, int i10) throws TimeoutException, IOException, l1 {
        return i(null, bArr, i10);
    }

    protected x z() throws IOException {
        a aVar = new a(this.f265057a);
        this.f265057a.we(this.f265060d, true, aVar);
        return aVar;
    }

    @Deprecated
    public e1(k kVar, String str, String str2, String str3, int i10) throws IOException {
        this(new f1().a(kVar).c(str).m(str2).l(str3).o(i10).q(false));
    }

    @Deprecated
    public e1(k kVar, String str, String str2, String str3) throws IOException {
        this(kVar, str, str2, str3, -1);
    }

    @Deprecated
    public e1(k kVar, String str, String str2) throws IOException {
        this(kVar, str, str2, "amq.rabbitmq.reply-to", -1);
    }

    @Deprecated
    public e1(k kVar, String str, String str2, int i10) throws IOException {
        this(kVar, str, str2, "amq.rabbitmq.reply-to", i10);
    }
}
