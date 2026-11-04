package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@x8.a
public class m2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f122848p = "ON_FOREGROUND";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.reactivex.flowables.a<String> f122849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.flowables.a<String> f122850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f122851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.time.a f122852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f122853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q3 f122854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a1 f122855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o3 f122856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.model.m f122857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f122858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u3 f122859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f122860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.firebase.installations.k f122861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q f122862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d8.b
    private final Executor f122863o;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122864a;

        static {
            int[] iArr = new int[com.google.firebase.inappmessaging.x.j.b.values().length];
            f122864a = iArr;
            try {
                iArr[com.google.firebase.inappmessaging.x.j.b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122864a[com.google.firebase.inappmessaging.x.j.b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122864a[com.google.firebase.inappmessaging.x.j.b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122864a[com.google.firebase.inappmessaging.x.j.b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @ij.a
    public m2(@w8.c io.reactivex.flowables.a<String> aVar, @w8.f io.reactivex.flowables.a<String> aVar2, n nVar, com.google.firebase.inappmessaging.internal.time.a aVar3, g gVar, f fVar, q3 q3Var, a1 a1Var, o3 o3Var, @w8.c com.google.firebase.inappmessaging.model.m mVar, u3 u3Var, com.google.firebase.installations.k kVar, q qVar, c cVar, @d8.b Executor executor) {
        this.f122849a = aVar;
        this.f122850b = aVar2;
        this.f122851c = nVar;
        this.f122852d = aVar3;
        this.f122853e = gVar;
        this.f122858j = fVar;
        this.f122854f = q3Var;
        this.f122855g = a1Var;
        this.f122856h = o3Var;
        this.f122857i = mVar;
        this.f122859k = u3Var;
        this.f122862n = qVar;
        this.f122861m = kVar;
        this.f122860l = cVar;
        this.f122863o = executor;
    }

    public static /* synthetic */ boolean A(Boolean bool) {
        return !bool.booleanValue();
    }

    public static /* synthetic */ com.google.internal.firebase.inappmessaging.v1.a.f C(com.google.internal.firebase.inappmessaging.v1.a.f fVar, Boolean bool) {
        return fVar;
    }

    public static /* synthetic */ void D(Task task, Executor executor, final io.reactivex.u uVar) {
        task.k(executor, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.inappmessaging.internal.u1
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                m2.m(uVar, obj);
            }
        });
        task.h(executor, new com.google.android.gms.tasks.f() { // from class: com.google.firebase.inappmessaging.internal.v1
            @Override // com.google.android.gms.tasks.f
            public final void d(Exception exc) {
                m2.f(uVar, exc);
            }
        });
    }

    @androidx.annotation.l1
    static com.google.internal.firebase.inappmessaging.v1.sdkserving.i H() {
        return com.google.internal.firebase.inappmessaging.v1.sdkserving.i.rm().Wl(1L).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(com.google.internal.firebase.inappmessaging.v1.a.f fVar, com.google.internal.firebase.inappmessaging.v1.a.f fVar2) {
        if (fVar.Fh() && !fVar2.Fh()) {
            return -1;
        }
        if (!fVar2.Fh() || fVar.Fh()) {
            return Integer.compare(fVar.e1().getValue(), fVar2.e1().getValue());
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J(String str, com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        if (R(str) && fVar.Fh()) {
            return true;
        }
        for (com.google.firebase.inappmessaging.f.u uVar : fVar.uj()) {
            if (O(uVar, str) || N(uVar, str)) {
                p2.a(String.format("The event %s is contained in the list of triggers", str));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.a.f> L(String str, final com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        return (fVar.Fh() || !R(str)) ? io.reactivex.s.w0(fVar) : this.f122856h.p(this.f122857i).W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.c1
            @Override // dj.g
            public final void accept(Object obj) {
                p2.c("App foreground rate limited ? : " + ((Boolean) obj));
            }
        }).L0(io.reactivex.k0.s0(Boolean.FALSE)).b0(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.n1
            @Override // dj.r
            public final boolean test(Object obj) {
                return m2.g((Boolean) obj);
            }
        }).y0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.y1
            @Override // dj.o
            public final Object apply(Object obj) {
                return m2.o(fVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.s<com.google.firebase.inappmessaging.model.o> M(final String str, dj.o<com.google.internal.firebase.inappmessaging.v1.a.f, io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.a.f>> oVar, dj.o<com.google.internal.firebase.inappmessaging.v1.a.f, io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.a.f>> oVar2, dj.o<com.google.internal.firebase.inappmessaging.v1.a.f, io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.a.f>> oVar3, com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        return io.reactivex.l.X2(iVar.hg()).n2(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.b2
            @Override // dj.r
            public final boolean test(Object obj) {
                return m2.r(this.f122592a, (com.google.internal.firebase.inappmessaging.v1.a.f) obj);
            }
        }).n2(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.c2
            @Override // dj.r
            public final boolean test(Object obj) {
                return m2.J(str, (com.google.internal.firebase.inappmessaging.v1.a.f) obj);
            }
        }).J2(oVar).J2(oVar2).J2(oVar3).Z5(new Comparator() { // from class: com.google.firebase.inappmessaging.internal.d2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m2.I((com.google.internal.firebase.inappmessaging.v1.a.f) obj, (com.google.internal.firebase.inappmessaging.v1.a.f) obj2);
            }
        }).p2().c0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.e2
            @Override // dj.o
            public final Object apply(Object obj) {
                return this.f122619a.V((com.google.internal.firebase.inappmessaging.v1.a.f) obj, str);
            }
        });
    }

    private static boolean N(com.google.firebase.inappmessaging.f.u uVar, String str) {
        return uVar.getEvent().getName().equals(str);
    }

    private static boolean O(com.google.firebase.inappmessaging.f.u uVar, String str) {
        return uVar.pb().toString().equals(str);
    }

    private static boolean P(com.google.firebase.inappmessaging.internal.time.a aVar, com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        long jJ2;
        long jT4;
        if (!fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.VANILLA_PAYLOAD)) {
            if (fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.EXPERIMENTAL_PAYLOAD)) {
                jJ2 = fVar.hk().j2();
                jT4 = fVar.hk().t4();
            }
        }
        jJ2 = fVar.I8().j2();
        jT4 = fVar.I8().t4();
        long jA = aVar.a();
        return jA > jJ2 && jA < jT4;
    }

    public static boolean Q(com.google.firebase.inappmessaging.f.u uVar) {
        return uVar.pb().toString().equals(f122848p);
    }

    public static boolean R(String str) {
        return str.equals(f122848p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(com.google.internal.firebase.inappmessaging.v1.a.f fVar, Boolean bool) {
        if (fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.VANILLA_PAYLOAD)) {
            p2.c(String.format("Already impressed campaign %s ? : %s", fVar.I8().A6(), bool));
        } else if (fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.EXPERIMENTAL_PAYLOAD)) {
            p2.c(String.format("Already impressed experiment %s ? : %s", fVar.hk().A6(), bool));
        }
    }

    private boolean T(String str) {
        return this.f122859k.a() ? R(str) : this.f122859k.b();
    }

    private static <T> io.reactivex.s<T> U(final Task<T> task, @d8.b final Executor executor) {
        return io.reactivex.s.F(new io.reactivex.w() { // from class: com.google.firebase.inappmessaging.internal.g1
            @Override // io.reactivex.w
            public final void a(io.reactivex.u uVar) {
                m2.D(task, executor, uVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.s<com.google.firebase.inappmessaging.model.o> V(com.google.internal.firebase.inappmessaging.v1.a.f fVar, String str) {
        String strG0;
        String strA6;
        if (fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.VANILLA_PAYLOAD)) {
            strG0 = fVar.I8().G0();
            strA6 = fVar.I8().A6();
        } else {
            if (!fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.EXPERIMENTAL_PAYLOAD)) {
                return io.reactivex.s.Y();
            }
            String strG1 = fVar.hk().G0();
            String strA7 = fVar.hk().A6();
            if (!fVar.Fh()) {
                this.f122860l.c(fVar.hk().ob());
            }
            strG0 = strG1;
            strA6 = strA7;
        }
        com.google.firebase.inappmessaging.model.i iVarD = com.google.firebase.inappmessaging.model.k.d(fVar.getContent(), strG0, strA6, fVar.Fh(), fVar.qd());
        return iVarD.l().equals(MessageType.UNSUPPORTED) ? io.reactivex.s.Y() : io.reactivex.s.w0(new com.google.firebase.inappmessaging.model.o(iVarD, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean W(o2 o2Var) {
        return (TextUtils.isEmpty(o2Var.b()) || TextUtils.isEmpty(o2Var.c().b())) ? false : true;
    }

    public static /* synthetic */ io.reactivex.s a(final m2 m2Var, io.reactivex.s sVar, final com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVar) {
        if (!m2Var.f122862n.b()) {
            p2.c("Automatic data collection is disabled, not attempting campaign fetch from service.");
            return io.reactivex.s.w0(H());
        }
        io.reactivex.s sVarW = sVar.b0(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.h1
            @Override // dj.r
            public final boolean test(Object obj) {
                return m2.W((o2) obj);
            }
        }).y0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.i1
            @Override // dj.o
            public final Object apply(Object obj) {
                return this.f122651a.f122853e.c((o2) obj, bVar);
            }
        }).v1(io.reactivex.s.w0(H())).W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.j1
            @Override // dj.g
            public final void accept(Object obj) {
                p2.c(String.format(Locale.US, "Successfully fetched %d messages from backend", Integer.valueOf(((com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj).hg().size())));
            }
        }).W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.k1
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122822a.f122855g.h((com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj).G0();
            }
        });
        final f fVar = m2Var.f122858j;
        Objects.requireNonNull(fVar);
        io.reactivex.s sVarW2 = sVarW.W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.l1
            @Override // dj.g
            public final void accept(Object obj) {
                fVar.f((com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj);
            }
        });
        final u3 u3Var = m2Var.f122859k;
        Objects.requireNonNull(u3Var);
        return sVarW2.W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.m1
            @Override // dj.g
            public final void accept(Object obj) {
                u3Var.c((com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj);
            }
        }).T(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.o1
            @Override // dj.g
            public final void accept(Object obj) {
                p2.d("Service fetch error: " + ((Throwable) obj).getMessage());
            }
        }).W0(io.reactivex.s.Y());
    }

    public static /* synthetic */ io.reactivex.s b(com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        int i10 = a.f122864a[fVar.getContent().fh().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return io.reactivex.s.w0(fVar);
        }
        p2.a("Filtering non-displayable message");
        return io.reactivex.s.Y();
    }

    public static /* synthetic */ io.reactivex.s c(m2 m2Var, final com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        m2Var.getClass();
        return fVar.Fh() ? io.reactivex.s.w0(fVar) : m2Var.f122855g.l(fVar).T(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.w1
            @Override // dj.g
            public final void accept(Object obj) {
                p2.d("Impression store read fail: " + ((Throwable) obj).getMessage());
            }
        }).L0(io.reactivex.k0.s0(Boolean.FALSE)).W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.x1
            @Override // dj.g
            public final void accept(Object obj) {
                m2.S(fVar, (Boolean) obj);
            }
        }).b0(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.z1
            @Override // dj.r
            public final boolean test(Object obj) {
                return m2.A((Boolean) obj);
            }
        }).y0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.a2
            @Override // dj.o
            public final Object apply(Object obj) {
                return m2.C(fVar, (Boolean) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ org.reactivestreams.u e(final m2 m2Var, final String str) {
        io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.sdkserving.i> sVarW0 = m2Var.f122851c.f().W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.f2
            @Override // dj.g
            public final void accept(Object obj) {
                p2.a("Fetched from cache");
            }
        }).T(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.g2
            @Override // dj.g
            public final void accept(Object obj) {
                p2.d("Cache read error: " + ((Throwable) obj).getMessage());
            }
        }).W0(io.reactivex.s.Y());
        dj.g gVar = new dj.g() { // from class: com.google.firebase.inappmessaging.internal.h2
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122645a.f122851c.h((com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj).J(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.r1
                    @Override // dj.a
                    public final void run() {
                        p2.a("Wrote to cache");
                    }
                }).L(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.s1
                    @Override // dj.g
                    public final void accept(Object obj2) {
                        p2.d("Cache write error: " + ((Throwable) obj2).getMessage());
                    }
                }).r0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.t1
                    @Override // dj.o
                    public final Object apply(Object obj2) {
                        return io.reactivex.c.t();
                    }
                }).G0();
            }
        };
        final dj.o oVar = new dj.o() { // from class: com.google.firebase.inappmessaging.internal.i2
            @Override // dj.o
            public final Object apply(Object obj) {
                return m2.c(this.f122653a, (com.google.internal.firebase.inappmessaging.v1.a.f) obj);
            }
        };
        final dj.o oVar2 = new dj.o() { // from class: com.google.firebase.inappmessaging.internal.j2
            @Override // dj.o
            public final Object apply(Object obj) {
                return this.f122816a.L(str, (com.google.internal.firebase.inappmessaging.v1.a.f) obj);
            }
        };
        final dj.o oVar3 = new dj.o() { // from class: com.google.firebase.inappmessaging.internal.k2
            @Override // dj.o
            public final Object apply(Object obj) {
                return m2.b((com.google.internal.firebase.inappmessaging.v1.a.f) obj);
            }
        };
        dj.o<? super com.google.internal.firebase.inappmessaging.v1.sdkserving.i, ? extends io.reactivex.y<? extends R>> oVar4 = new dj.o() { // from class: com.google.firebase.inappmessaging.internal.l2
            @Override // dj.o
            public final Object apply(Object obj) {
                return this.f122839a.M(str, oVar, oVar2, oVar3, (com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj);
            }
        };
        io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.sdkserving.b> sVarW1 = m2Var.f122855g.j().T(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.d1
            @Override // dj.g
            public final void accept(Object obj) {
                p2.d("Impressions store read fail: " + ((Throwable) obj).getMessage());
            }
        }).G(com.google.internal.firebase.inappmessaging.v1.sdkserving.b.nm()).W0(io.reactivex.s.w0(com.google.internal.firebase.inappmessaging.v1.sdkserving.b.nm()));
        final io.reactivex.s sVarR0 = io.reactivex.s.V1(U(m2Var.f122861m.getId(), m2Var.f122863o), U(m2Var.f122861m.b(false), m2Var.f122863o), new dj.c() { // from class: com.google.firebase.inappmessaging.internal.e1
            @Override // dj.c
            public final Object apply(Object obj, Object obj2) {
                return o2.a((String) obj, (com.google.firebase.installations.p) obj2);
            }
        }).R0(m2Var.f122854f.b());
        dj.o<? super com.google.internal.firebase.inappmessaging.v1.sdkserving.b, ? extends io.reactivex.y<? extends R>> oVar5 = new dj.o() { // from class: com.google.firebase.inappmessaging.internal.f1
            @Override // dj.o
            public final Object apply(Object obj) {
                return m2.a(this.f122628a, sVarR0, (com.google.internal.firebase.inappmessaging.v1.sdkserving.b) obj);
            }
        };
        if (m2Var.T(str)) {
            p2.c(String.format("Forcing fetch from service rather than cache. Test Device: %s | App Fresh Install: %s", Boolean.valueOf(m2Var.f122859k.b()), Boolean.valueOf(m2Var.f122859k.a())));
            return sVarW1.c0(oVar5).c0(oVar4).M1();
        }
        p2.a("Attempting to fetch campaigns using cache");
        return sVarW0.v1(sVarW1.c0(oVar5).W(gVar)).c0(oVar4).M1();
    }

    public static /* synthetic */ void f(io.reactivex.u uVar, Exception exc) {
        uVar.onError(exc);
        uVar.onComplete();
    }

    public static /* synthetic */ boolean g(Boolean bool) {
        return !bool.booleanValue();
    }

    public static /* synthetic */ void m(io.reactivex.u uVar, Object obj) {
        uVar.b(obj);
        uVar.onComplete();
    }

    public static /* synthetic */ com.google.internal.firebase.inappmessaging.v1.a.f o(com.google.internal.firebase.inappmessaging.v1.a.f fVar, Boolean bool) {
        return fVar;
    }

    public static /* synthetic */ boolean r(m2 m2Var, com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        return m2Var.f122859k.b() || P(m2Var.f122852d, fVar);
    }

    public io.reactivex.l<com.google.firebase.inappmessaging.model.o> K() {
        return io.reactivex.l.S3(this.f122849a, this.f122858j.d(), this.f122850b).d2(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.p1
            @Override // dj.g
            public final void accept(Object obj) {
                p2.a("Event Triggered: " + ((String) obj));
            }
        }).l4(this.f122854f.b()).R0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.q1
            @Override // dj.o
            public final Object apply(Object obj) {
                return m2.e(this.f122912a, (String) obj);
            }
        }).l4(this.f122854f.c());
    }
}
