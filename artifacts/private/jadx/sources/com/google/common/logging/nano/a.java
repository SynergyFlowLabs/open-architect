package com.google.common.logging.nano;

import com.google.vr.sdk.deps.a7;
import com.google.vr.sdk.deps.b7;
import com.google.vr.sdk.deps.c7;
import com.google.vr.sdk.deps.e3;
import com.google.vr.sdk.deps.e7;
import com.google.vr.sdk.deps.f7;
import com.google.vr.sdk.deps.t2;
import com.google.vr.sdk.deps.t6;
import com.google.vr.sdk.deps.u6;
import com.google.vr.sdk.deps.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: com.google.common.logging.nano.a$a, reason: collision with other inner class name */
    public static final class C1088a extends w6<C1088a> implements Cloneable {
        public e3.a.i H1;
        public f X;
        public l Y;
        public h Z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e3.a.s f119068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g f119069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.google.common.logging.nano.b.a.C1105a f119070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C1089a f119071f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f119072g;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        public e3.a.u f119073g3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C1089a[] f119074h;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        public e3.a.x f119075h3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public b f119076i;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        public j f119077i3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public k f119078j;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        public e3.a.j f119079j3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f119080k;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        public d f119081k3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public e3.a.l f119082l;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        public e f119083l3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public i f119084m;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        public n f119085m3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public e3.a.i0 f119086n;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        public c f119087n3;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public e3.a.k f119088o;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        public e3.a.g f119089o3;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public e3.a.c f119090p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public e3.a.e0 f119091p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public m f119092p2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public e3.a.q f119093s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public q f119094t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public e3.a.p f119095v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public e3.a.z f119096w;

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$a, reason: collision with other inner class name */
        public static final class C1089a extends w6<C1089a> implements Cloneable {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static volatile C1089a[] f119097f;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f119098c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f119099d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f119100e;

            public C1089a() {
                p();
            }

            public static C1089a[] r() {
                if (f119097f == null) {
                    synchronized (a7.f127704b) {
                        try {
                            if (f119097f == null) {
                                f119097f = new C1089a[0];
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f119097f;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                String str = this.f119098c;
                if (str != null) {
                    iB += u6.u(1, str);
                }
                String str2 = this.f119099d;
                if (str2 != null) {
                    iB += u6.u(2, str2);
                }
                String str3 = this.f119100e;
                return str3 != null ? iB + u6.u(3, str3) : iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                String str = this.f119098c;
                if (str != null) {
                    u6Var.m(1, str);
                }
                String str2 = this.f119099d;
                if (str2 != null) {
                    u6Var.m(2, str2);
                }
                String str3 = this.f119100e;
                if (str3 != null) {
                    u6Var.m(3, str3);
                }
                super.k(u6Var);
            }

            public final C1089a p() {
                this.f119098c = null;
                this.f119099d = null;
                this.f119100e = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public final C1089a l() {
                try {
                    return (C1089a) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C1089a e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 10) {
                        this.f119098c = t6Var.l();
                    } else if (iA == 18) {
                        this.f119099d = t6Var.l();
                    } else if (iA == 26) {
                        this.f119100e = t6Var.l();
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$b */
        public static final class b extends w6<b> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C1090a f119101c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public d f119102d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public C1091b f119103e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public c f119104f;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$b$a, reason: collision with other inner class name */
            public static final class C1090a extends w6<C1090a> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.n.b.EnumC1316b f119105c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Float f119106d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Boolean f119107e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Boolean f119108f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Long f119109g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Long f119110h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public Long f119111i;

                public C1090a() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.n.b.EnumC1316b enumC1316b = this.f119105c;
                    if (enumC1316b != null && enumC1316b != null) {
                        iB += u6.r(1, enumC1316b.i());
                    }
                    Float f10 = this.f119106d;
                    if (f10 != null) {
                        f10.getClass();
                        iB += u6.q(2) + 4;
                    }
                    Boolean bool = this.f119107e;
                    if (bool != null) {
                        bool.getClass();
                        iB += u6.q(3) + 1;
                    }
                    Boolean bool2 = this.f119108f;
                    if (bool2 != null) {
                        bool2.getClass();
                        iB += u6.q(4) + 1;
                    }
                    Long l10 = this.f119109g;
                    if (l10 != null) {
                        iB += u6.s(5, l10.longValue());
                    }
                    Long l11 = this.f119110h;
                    if (l11 != null) {
                        iB += u6.s(6, l11.longValue());
                    }
                    Long l12 = this.f119111i;
                    return l12 != null ? iB + u6.s(7, l12.longValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.n.b.EnumC1316b enumC1316b = this.f119105c;
                    if (enumC1316b != null && enumC1316b != null) {
                        u6Var.i(1, enumC1316b.i());
                    }
                    Float f10 = this.f119106d;
                    if (f10 != null) {
                        u6Var.h(2, f10.floatValue());
                    }
                    Boolean bool = this.f119107e;
                    if (bool != null) {
                        u6Var.n(3, bool.booleanValue());
                    }
                    Boolean bool2 = this.f119108f;
                    if (bool2 != null) {
                        u6Var.n(4, bool2.booleanValue());
                    }
                    Long l10 = this.f119109g;
                    if (l10 != null) {
                        u6Var.j(5, l10.longValue());
                    }
                    Long l11 = this.f119110h;
                    if (l11 != null) {
                        u6Var.j(6, l11.longValue());
                    }
                    Long l12 = this.f119111i;
                    if (l12 != null) {
                        u6Var.j(7, l12.longValue());
                    }
                    super.k(u6Var);
                }

                public final C1090a p() {
                    this.f119105c = null;
                    this.f119106d = null;
                    this.f119107e = null;
                    this.f119108f = null;
                    this.f119109g = null;
                    this.f119110h = null;
                    this.f119111i = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1090a l() {
                    try {
                        return (C1090a) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1090a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2 || iN == 3 || iN == 4) {
                                this.f119105c = e3.a.n.b.EnumC1316b.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 21) {
                            this.f119106d = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                        } else if (iA == 24) {
                            this.f119107e = Boolean.valueOf(t6Var.k());
                        } else if (iA == 32) {
                            this.f119108f = Boolean.valueOf(t6Var.k());
                        } else if (iA == 40) {
                            this.f119109g = Long.valueOf(t6Var.p());
                        } else if (iA == 48) {
                            this.f119110h = Long.valueOf(t6Var.p());
                        } else if (iA == 56) {
                            this.f119111i = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$b$b, reason: collision with other inner class name */
            public static final class C1091b extends w6<C1091b> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.n.c.b f119112c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Boolean f119113d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Integer f119114e;

                public C1091b() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.n.c.b bVar = this.f119112c;
                    int i10 = 5 | 1;
                    if (bVar != null && bVar != null) {
                        iB += u6.r(1, bVar.i());
                    }
                    Boolean bool = this.f119113d;
                    if (bool != null) {
                        bool.getClass();
                        iB += u6.q(2) + 1;
                    }
                    Integer num = this.f119114e;
                    return num != null ? iB + u6.r(3, num.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.n.c.b bVar = this.f119112c;
                    if (bVar != null && bVar != null) {
                        u6Var.i(1, bVar.i());
                    }
                    Boolean bool = this.f119113d;
                    if (bool != null) {
                        u6Var.n(2, bool.booleanValue());
                    }
                    Integer num = this.f119114e;
                    if (num != null) {
                        u6Var.i(3, num.intValue());
                    }
                    super.k(u6Var);
                }

                public final C1091b p() {
                    this.f119112c = null;
                    this.f119113d = null;
                    this.f119114e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1091b l() {
                    try {
                        return (C1091b) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1091b e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA != 0) {
                            if (iA == 8) {
                                int iT = t6Var.t();
                                int iN = t6Var.n();
                                switch (iN) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        this.f119112c = e3.a.n.c.b.b(iN);
                                        break;
                                    default:
                                        t6Var.o(iT);
                                        n(t6Var, iA);
                                        break;
                                }
                            } else if (iA == 16) {
                                this.f119113d = Boolean.valueOf(t6Var.k());
                            } else if (iA == 24) {
                                this.f119114e = Integer.valueOf(t6Var.n());
                            } else if (!super.n(t6Var, iA)) {
                            }
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$b$c */
            public static final class c extends w6<c> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119115c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119116d;

                public c() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 2) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum OriginScreen");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119115c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Integer num2 = this.f119116d;
                    return num2 != null ? iB + u6.r(2, num2.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119115c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Integer num2 = this.f119116d;
                    if (num2 != null) {
                        u6Var.i(2, num2.intValue());
                    }
                    super.k(u6Var);
                }

                public final c q() {
                    this.f119115c = null;
                    this.f119116d = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final c l() {
                    try {
                        return (c) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final c e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            try {
                                this.f119115c = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            this.f119116d = Integer.valueOf(t6Var.n());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$b$d */
            public static final class d extends w6<d> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119117c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Boolean f119118d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Boolean f119119e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Integer f119120f;

                public d() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 2) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum Orientation");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119117c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Boolean bool = this.f119118d;
                    if (bool != null) {
                        bool.getClass();
                        iB += u6.q(2) + 1;
                    }
                    Boolean bool2 = this.f119119e;
                    if (bool2 != null) {
                        bool2.getClass();
                        iB += u6.q(3) + 1;
                    }
                    Integer num2 = this.f119120f;
                    return num2 != null ? iB + u6.r(4, num2.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119117c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Boolean bool = this.f119118d;
                    if (bool != null) {
                        u6Var.n(2, bool.booleanValue());
                    }
                    Boolean bool2 = this.f119119e;
                    if (bool2 != null) {
                        u6Var.n(3, bool2.booleanValue());
                    }
                    Integer num2 = this.f119120f;
                    if (num2 != null) {
                        u6Var.i(4, num2.intValue());
                    }
                    super.k(u6Var);
                }

                public final d q() {
                    this.f119117c = null;
                    this.f119118d = null;
                    this.f119119e = null;
                    this.f119120f = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final d l() {
                    try {
                        return (d) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final d e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            try {
                                this.f119117c = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            this.f119118d = Boolean.valueOf(t6Var.k());
                        } else if (iA == 24) {
                            this.f119119e = Boolean.valueOf(t6Var.k());
                        } else if (iA == 32) {
                            this.f119120f = Integer.valueOf(t6Var.n());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public b() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                C1090a c1090a = this.f119101c;
                if (c1090a != null) {
                    iB += u6.t(1, c1090a);
                }
                d dVar = this.f119102d;
                if (dVar != null) {
                    iB += u6.t(2, dVar);
                }
                C1091b c1091b = this.f119103e;
                if (c1091b != null) {
                    iB += u6.t(3, c1091b);
                }
                c cVar = this.f119104f;
                return cVar != null ? iB + u6.t(4, cVar) : iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                C1090a c1090a = this.f119101c;
                if (c1090a != null) {
                    u6Var.l(1, c1090a);
                }
                d dVar = this.f119102d;
                if (dVar != null) {
                    u6Var.l(2, dVar);
                }
                C1091b c1091b = this.f119103e;
                if (c1091b != null) {
                    u6Var.l(3, c1091b);
                }
                c cVar = this.f119104f;
                if (cVar != null) {
                    u6Var.l(4, cVar);
                }
                super.k(u6Var);
            }

            public final b p() {
                this.f119101c = null;
                this.f119102d = null;
                this.f119103e = null;
                this.f119104f = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final b l() {
                try {
                    b bVar = (b) super.l();
                    C1090a c1090a = this.f119101c;
                    if (c1090a != null) {
                        bVar.f119101c = c1090a.l();
                    }
                    d dVar = this.f119102d;
                    if (dVar != null) {
                        bVar.f119102d = dVar.l();
                    }
                    C1091b c1091b = this.f119103e;
                    if (c1091b != null) {
                        bVar.f119103e = c1091b.l();
                    }
                    c cVar = this.f119104f;
                    if (cVar != null) {
                        bVar.f119104f = cVar.l();
                    }
                    return bVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final b e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 10) {
                        if (this.f119101c == null) {
                            this.f119101c = new C1090a();
                        }
                        t6Var.e(this.f119101c);
                    } else if (iA == 18) {
                        if (this.f119102d == null) {
                            this.f119102d = new d();
                        }
                        t6Var.e(this.f119102d);
                    } else if (iA == 26) {
                        if (this.f119103e == null) {
                            this.f119103e = new C1091b();
                        }
                        t6Var.e(this.f119103e);
                    } else if (iA == 34) {
                        if (this.f119104f == null) {
                            this.f119104f = new c();
                        }
                        t6Var.e(this.f119104f);
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c */
        public static final class c extends w6<c> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public b f119121c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public d f119122d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public i f119123e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public g f119124f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public m f119125g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public C1093c f119126h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public C1092a f119127i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public e3.a.r.q f119128j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public k f119129k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public e f119130l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public h f119131m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public n f119132n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public f f119133o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public e3.a.r.c f119134s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public e3.a.r.m f119135t;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$a, reason: collision with other inner class name */
            public static final class C1092a extends w6<C1092a> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119136c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119137d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119138e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Long f119139f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Long f119140g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Integer f119141h;

                public C1092a() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119136c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Integer num2 = this.f119137d;
                    if (num2 != null) {
                        iB += u6.r(2, num2.intValue());
                    }
                    Long l10 = this.f119138e;
                    if (l10 != null) {
                        iB += u6.s(3, l10.longValue());
                    }
                    Long l11 = this.f119139f;
                    if (l11 != null) {
                        iB += u6.s(4, l11.longValue());
                    }
                    Long l12 = this.f119140g;
                    if (l12 != null) {
                        iB += u6.s(5, l12.longValue());
                    }
                    Integer num3 = this.f119141h;
                    return num3 != null ? iB + u6.r(6, num3.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119136c;
                    if (num != null) {
                        int i10 = 3 & 1;
                        u6Var.i(1, num.intValue());
                    }
                    Integer num2 = this.f119137d;
                    if (num2 != null) {
                        u6Var.i(2, num2.intValue());
                    }
                    Long l10 = this.f119138e;
                    if (l10 != null) {
                        u6Var.j(3, l10.longValue());
                    }
                    Long l11 = this.f119139f;
                    if (l11 != null) {
                        u6Var.j(4, l11.longValue());
                    }
                    Long l12 = this.f119140g;
                    if (l12 != null) {
                        u6Var.j(5, l12.longValue());
                    }
                    Integer num3 = this.f119141h;
                    if (num3 != null) {
                        u6Var.i(6, num3.intValue());
                    }
                    super.k(u6Var);
                }

                public final C1092a p() {
                    this.f119136c = null;
                    this.f119137d = null;
                    this.f119138e = null;
                    this.f119139f = null;
                    this.f119140g = null;
                    this.f119141h = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1092a l() {
                    try {
                        return (C1092a) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1092a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119136c = Integer.valueOf(t6Var.n());
                        } else if (iA == 16) {
                            this.f119137d = Integer.valueOf(t6Var.n());
                        } else if (iA == 24) {
                            this.f119138e = Long.valueOf(t6Var.p());
                        } else if (iA == 32) {
                            this.f119139f = Long.valueOf(t6Var.p());
                        } else if (iA == 40) {
                            this.f119140g = Long.valueOf(t6Var.p());
                        } else if (iA == 48) {
                            this.f119141h = Integer.valueOf(t6Var.n());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$b */
            public static final class b extends w6<b> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119142c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public String f119143d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public String f119144e;

                public b() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 3) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum CameraType");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119142c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    String str = this.f119143d;
                    if (str != null) {
                        iB += u6.u(2, str);
                    }
                    String str2 = this.f119144e;
                    return str2 != null ? iB + u6.u(3, str2) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119142c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    String str = this.f119143d;
                    if (str != null) {
                        u6Var.m(2, str);
                    }
                    String str2 = this.f119144e;
                    if (str2 != null) {
                        u6Var.m(3, str2);
                    }
                    super.k(u6Var);
                }

                public final b q() {
                    this.f119142c = null;
                    this.f119143d = null;
                    this.f119144e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final b l() {
                    try {
                        return (b) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final b e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            try {
                                this.f119142c = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 18) {
                            this.f119143d = t6Var.l();
                        } else if (iA == 26) {
                            this.f119144e = t6Var.l();
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$c, reason: collision with other inner class name */
            public static final class C1093c extends w6<C1093c> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Boolean f119145c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119146d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Boolean f119147e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Integer f119148f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Long f119149g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Long f119150h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public Boolean f119151i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Boolean f119152j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public Integer f119153k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public Integer f119154l;

                public C1093c() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 4) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(48);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum TemperatureState");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Boolean bool = this.f119145c;
                    if (bool != null) {
                        bool.getClass();
                        iB += u6.q(1) + 1;
                    }
                    Integer num = this.f119146d;
                    if (num != null) {
                        iB += u6.r(2, num.intValue());
                    }
                    Boolean bool2 = this.f119147e;
                    if (bool2 != null) {
                        bool2.getClass();
                        iB += u6.q(3) + 1;
                    }
                    Integer num2 = this.f119148f;
                    if (num2 != null) {
                        iB += u6.r(4, num2.intValue());
                    }
                    Long l10 = this.f119149g;
                    if (l10 != null) {
                        iB += u6.s(5, l10.longValue());
                    }
                    Long l11 = this.f119150h;
                    if (l11 != null) {
                        iB += u6.s(6, l11.longValue());
                    }
                    Boolean bool3 = this.f119151i;
                    if (bool3 != null) {
                        bool3.getClass();
                        iB += u6.q(7) + 1;
                    }
                    Boolean bool4 = this.f119152j;
                    if (bool4 != null) {
                        bool4.getClass();
                        iB += u6.q(8) + 1;
                    }
                    Integer num3 = this.f119153k;
                    if (num3 != null) {
                        iB += u6.r(9, num3.intValue());
                    }
                    Integer num4 = this.f119154l;
                    return num4 != null ? iB + u6.r(10, num4.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Boolean bool = this.f119145c;
                    if (bool != null) {
                        u6Var.n(1, bool.booleanValue());
                    }
                    Integer num = this.f119146d;
                    if (num != null) {
                        u6Var.i(2, num.intValue());
                    }
                    Boolean bool2 = this.f119147e;
                    if (bool2 != null) {
                        u6Var.n(3, bool2.booleanValue());
                    }
                    Integer num2 = this.f119148f;
                    if (num2 != null) {
                        u6Var.i(4, num2.intValue());
                    }
                    Long l10 = this.f119149g;
                    if (l10 != null) {
                        u6Var.j(5, l10.longValue());
                    }
                    Long l11 = this.f119150h;
                    if (l11 != null) {
                        u6Var.j(6, l11.longValue());
                    }
                    Boolean bool3 = this.f119151i;
                    if (bool3 != null) {
                        u6Var.n(7, bool3.booleanValue());
                    }
                    Boolean bool4 = this.f119152j;
                    if (bool4 != null) {
                        u6Var.n(8, bool4.booleanValue());
                    }
                    Integer num3 = this.f119153k;
                    if (num3 != null) {
                        u6Var.i(9, num3.intValue());
                    }
                    Integer num4 = this.f119154l;
                    if (num4 != null) {
                        u6Var.i(10, num4.intValue());
                    }
                    super.k(u6Var);
                }

                public final C1093c q() {
                    this.f119145c = null;
                    this.f119146d = null;
                    this.f119147e = null;
                    this.f119148f = null;
                    this.f119149g = null;
                    this.f119150h = null;
                    this.f119151i = null;
                    this.f119152j = null;
                    this.f119153k = null;
                    this.f119154l = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1093c l() {
                    try {
                        return (C1093c) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C1093c e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        switch (iA) {
                            case 0:
                                break;
                            case 8:
                                this.f119145c = Boolean.valueOf(t6Var.k());
                                break;
                            case 16:
                                this.f119146d = Integer.valueOf(t6Var.n());
                                break;
                            case 24:
                                this.f119147e = Boolean.valueOf(t6Var.k());
                                break;
                            case 32:
                                this.f119148f = Integer.valueOf(t6Var.n());
                                break;
                            case 40:
                                this.f119149g = Long.valueOf(t6Var.p());
                                break;
                            case 48:
                                this.f119150h = Long.valueOf(t6Var.p());
                                break;
                            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                                this.f119151i = Boolean.valueOf(t6Var.k());
                                break;
                            case 64:
                                this.f119152j = Boolean.valueOf(t6Var.k());
                                break;
                            case 72:
                                int iT = t6Var.t();
                                try {
                                    this.f119153k = Integer.valueOf(p(t6Var.n()));
                                } catch (IllegalArgumentException unused) {
                                    t6Var.o(iT);
                                    n(t6Var, iA);
                                }
                                break;
                            case 80:
                                this.f119154l = Integer.valueOf(t6Var.n());
                                break;
                            default:
                                if (!super.n(t6Var, iA)) {
                                }
                                break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$d */
            public static final class d extends w6<d> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119155c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public j f119156d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public l f119157e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public C1094a f119158f;

                /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$d$a, reason: collision with other inner class name */
                public static final class C1094a extends w6<C1094a> implements Cloneable {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Integer f119159c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Long f119160d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public Long f119161e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public Long f119162f;

                    public C1094a() {
                        q();
                    }

                    public static int p(int i10) {
                        if (i10 >= 0 && i10 <= 6) {
                            return i10;
                        }
                        StringBuilder sb2 = new StringBuilder(47);
                        sb2.append(i10);
                        sb2.append(" is not a valid enum LiveStreamError");
                        throw new IllegalArgumentException(sb2.toString());
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    protected final int b() {
                        int iB = super.b();
                        Integer num = this.f119159c;
                        if (num != null) {
                            iB += u6.r(1, num.intValue());
                        }
                        Long l10 = this.f119160d;
                        if (l10 != null) {
                            iB += u6.s(2, l10.longValue());
                        }
                        Long l11 = this.f119161e;
                        if (l11 != null) {
                            iB += u6.s(3, l11.longValue());
                        }
                        Long l12 = this.f119162f;
                        if (l12 != null) {
                            iB += u6.s(4, l12.longValue());
                        }
                        return iB;
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    public final void k(u6 u6Var) throws IOException {
                        Integer num = this.f119159c;
                        if (num != null) {
                            u6Var.i(1, num.intValue());
                        }
                        Long l10 = this.f119160d;
                        if (l10 != null) {
                            u6Var.j(2, l10.longValue());
                        }
                        Long l11 = this.f119161e;
                        if (l11 != null) {
                            u6Var.j(3, l11.longValue());
                        }
                        Long l12 = this.f119162f;
                        if (l12 != null) {
                            u6Var.j(4, l12.longValue());
                        }
                        super.k(u6Var);
                    }

                    public final C1094a q() {
                        this.f119159c = null;
                        this.f119160d = null;
                        this.f119161e = null;
                        this.f119162f = null;
                        this.f129659b = null;
                        this.f127766a = -1;
                        return this;
                    }

                    @Override // com.google.vr.sdk.deps.w6
                    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                    public final C1094a l() {
                        try {
                            return (C1094a) super.l();
                        } catch (CloneNotSupportedException e10) {
                            throw new AssertionError(e10);
                        }
                    }

                    @Override // com.google.vr.sdk.deps.c7
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final C1094a e(t6 t6Var) throws IOException {
                        while (true) {
                            int iA = t6Var.a();
                            if (iA == 0) {
                                break;
                            }
                            if (iA == 8) {
                                int iT = t6Var.t();
                                try {
                                    this.f119159c = Integer.valueOf(p(t6Var.n()));
                                } catch (IllegalArgumentException unused) {
                                    t6Var.o(iT);
                                    n(t6Var, iA);
                                }
                            } else if (iA == 16) {
                                this.f119160d = Long.valueOf(t6Var.p());
                            } else if (iA == 24) {
                                this.f119161e = Long.valueOf(t6Var.p());
                            } else if (iA == 32) {
                                this.f119162f = Long.valueOf(t6Var.p());
                            } else if (!super.n(t6Var, iA)) {
                                break;
                            }
                        }
                        return this;
                    }
                }

                public d() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 4) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum CaptureType");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119155c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    j jVar = this.f119156d;
                    if (jVar != null) {
                        iB += u6.t(2, jVar);
                    }
                    l lVar = this.f119157e;
                    if (lVar != null) {
                        iB += u6.t(3, lVar);
                    }
                    C1094a c1094a = this.f119158f;
                    return c1094a != null ? iB + u6.t(10, c1094a) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119155c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    j jVar = this.f119156d;
                    if (jVar != null) {
                        u6Var.l(2, jVar);
                    }
                    l lVar = this.f119157e;
                    if (lVar != null) {
                        u6Var.l(3, lVar);
                    }
                    C1094a c1094a = this.f119158f;
                    if (c1094a != null) {
                        u6Var.l(10, c1094a);
                    }
                    super.k(u6Var);
                }

                public final d q() {
                    this.f119155c = null;
                    this.f119156d = null;
                    this.f119157e = null;
                    this.f119158f = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final d l() {
                    try {
                        d dVar = (d) super.l();
                        j jVar = this.f119156d;
                        if (jVar != null) {
                            dVar.f119156d = jVar.l();
                        }
                        l lVar = this.f119157e;
                        if (lVar != null) {
                            dVar.f119157e = lVar.l();
                        }
                        C1094a c1094a = this.f119158f;
                        if (c1094a != null) {
                            dVar.f119158f = c1094a.l();
                        }
                        return dVar;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final d e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            try {
                                this.f119155c = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 18) {
                            if (this.f119156d == null) {
                                this.f119156d = new j();
                            }
                            t6Var.e(this.f119156d);
                        } else if (iA == 26) {
                            if (this.f119157e == null) {
                                this.f119157e = new l();
                            }
                            t6Var.e(this.f119157e);
                        } else if (iA == 82) {
                            if (this.f119158f == null) {
                                this.f119158f = new C1094a();
                            }
                            t6Var.e(this.f119158f);
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$e */
            public static final class e extends w6<e> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.r.p.b f119163c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public e3.a.r.p.d f119164d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119165e;

                public e() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.r.p.b bVar = this.f119163c;
                    if (bVar != null && bVar != null) {
                        iB += u6.r(1, bVar.i());
                    }
                    e3.a.r.p.d dVar = this.f119164d;
                    if (dVar != null && dVar != null) {
                        iB += u6.r(2, dVar.i());
                    }
                    Long l10 = this.f119165e;
                    return l10 != null ? iB + u6.s(3, l10.longValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.r.p.b bVar = this.f119163c;
                    if (bVar != null && bVar != null) {
                        u6Var.i(1, bVar.i());
                    }
                    e3.a.r.p.d dVar = this.f119164d;
                    if (dVar != null && dVar != null) {
                        u6Var.i(2, dVar.i());
                    }
                    Long l10 = this.f119165e;
                    if (l10 != null) {
                        u6Var.j(3, l10.longValue());
                    }
                    super.k(u6Var);
                }

                public final e p() {
                    this.f119163c = null;
                    this.f119164d = null;
                    this.f119165e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final e l() {
                    try {
                        return (e) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final e e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2) {
                                this.f119163c = e3.a.r.p.b.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            int iT2 = t6Var.t();
                            int iN2 = t6Var.n();
                            if (iN2 == 0 || iN2 == 1 || iN2 == 2 || iN2 == 3) {
                                this.f119164d = e3.a.r.p.d.b(iN2);
                            } else {
                                t6Var.o(iT2);
                                n(t6Var, iA);
                            }
                        } else if (iA == 24) {
                            this.f119165e = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$f */
            public static final class f extends w6<f> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.r.h.d f119166c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119167d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Integer f119168e;

                public f() {
                    r();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 3) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(38);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum Action");
                    throw new IllegalArgumentException(sb2.toString());
                }

                public static int q(int i10) {
                    if (i10 >= 0 && i10 <= 3) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum FailureType");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.r.h.d dVar = this.f119166c;
                    if (dVar != null && dVar != null) {
                        iB += u6.r(1, dVar.i());
                    }
                    Integer num = this.f119167d;
                    if (num != null) {
                        iB += u6.r(2, num.intValue());
                    }
                    Integer num2 = this.f119168e;
                    return num2 != null ? iB + u6.r(3, num2.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.r.h.d dVar = this.f119166c;
                    if (dVar != null && dVar != null) {
                        int i10 = 1 << 1;
                        u6Var.i(1, dVar.i());
                    }
                    Integer num = this.f119167d;
                    if (num != null) {
                        u6Var.i(2, num.intValue());
                    }
                    Integer num2 = this.f119168e;
                    if (num2 != null) {
                        u6Var.i(3, num2.intValue());
                    }
                    super.k(u6Var);
                }

                public final f r() {
                    this.f119166c = null;
                    this.f119167d = null;
                    this.f119168e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final f l() {
                    try {
                        return (f) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final f e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2) {
                                this.f119166c = e3.a.r.h.d.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            int iT2 = t6Var.t();
                            try {
                                this.f119167d = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT2);
                                n(t6Var, iA);
                            }
                        } else if (iA == 24) {
                            int iT3 = t6Var.t();
                            try {
                                this.f119168e = Integer.valueOf(q(t6Var.n()));
                            } catch (IllegalArgumentException unused2) {
                                t6Var.o(iT3);
                                n(t6Var, iA);
                            }
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$g */
            public static final class g extends w6<g> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.r.i.c f119169c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public e3.a.r.i.d f119170d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119171e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Long f119172f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public e3.a.r.i.b f119173g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public j f119174h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public l f119175i;

                public g() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.r.i.c cVar = this.f119169c;
                    if (cVar != null && cVar != null) {
                        iB += u6.r(1, cVar.i());
                    }
                    e3.a.r.i.d dVar = this.f119170d;
                    if (dVar != null && dVar != null) {
                        int i10 = 4 << 2;
                        iB += u6.r(2, dVar.i());
                    }
                    Long l10 = this.f119171e;
                    if (l10 != null) {
                        iB += u6.s(3, l10.longValue());
                    }
                    Long l11 = this.f119172f;
                    if (l11 != null) {
                        iB += u6.s(4, l11.longValue());
                    }
                    e3.a.r.i.b bVar = this.f119173g;
                    if (bVar != null && bVar != null) {
                        iB += u6.r(5, bVar.i());
                    }
                    j jVar = this.f119174h;
                    if (jVar != null) {
                        iB += u6.t(6, jVar);
                    }
                    l lVar = this.f119175i;
                    return lVar != null ? iB + u6.t(7, lVar) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.r.i.c cVar = this.f119169c;
                    if (cVar != null && cVar != null) {
                        u6Var.i(1, cVar.i());
                    }
                    e3.a.r.i.d dVar = this.f119170d;
                    if (dVar != null && dVar != null) {
                        u6Var.i(2, dVar.i());
                    }
                    Long l10 = this.f119171e;
                    if (l10 != null) {
                        u6Var.j(3, l10.longValue());
                    }
                    Long l11 = this.f119172f;
                    if (l11 != null) {
                        u6Var.j(4, l11.longValue());
                    }
                    e3.a.r.i.b bVar = this.f119173g;
                    if (bVar != null && bVar != null) {
                        u6Var.i(5, bVar.i());
                    }
                    j jVar = this.f119174h;
                    if (jVar != null) {
                        u6Var.l(6, jVar);
                    }
                    l lVar = this.f119175i;
                    if (lVar != null) {
                        u6Var.l(7, lVar);
                    }
                    super.k(u6Var);
                }

                public final g p() {
                    this.f119169c = null;
                    this.f119170d = null;
                    this.f119171e = null;
                    this.f119172f = null;
                    this.f119173g = null;
                    this.f119174h = null;
                    this.f119175i = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final g l() {
                    try {
                        g gVar = (g) super.l();
                        j jVar = this.f119174h;
                        if (jVar != null) {
                            gVar.f119174h = jVar.l();
                        }
                        l lVar = this.f119175i;
                        if (lVar != null) {
                            gVar.f119175i = lVar.l();
                        }
                        return gVar;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final g e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2 || iN == 3 || iN == 4 || iN == 5) {
                                this.f119169c = e3.a.r.i.c.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            int iT2 = t6Var.t();
                            int iN2 = t6Var.n();
                            if (iN2 == 0 || iN2 == 1 || iN2 == 2 || iN2 == 3 || iN2 == 4 || iN2 == 5) {
                                this.f119170d = e3.a.r.i.d.b(iN2);
                            } else {
                                t6Var.o(iT2);
                                n(t6Var, iA);
                            }
                        } else if (iA == 24) {
                            this.f119171e = Long.valueOf(t6Var.p());
                        } else if (iA == 32) {
                            this.f119172f = Long.valueOf(t6Var.p());
                        } else if (iA == 40) {
                            int iT3 = t6Var.t();
                            int iN3 = t6Var.n();
                            if (iN3 == 0 || iN3 == 1 || iN3 == 2) {
                                this.f119173g = e3.a.r.i.b.b(iN3);
                            } else {
                                t6Var.o(iT3);
                                n(t6Var, iA);
                            }
                        } else if (iA == 50) {
                            if (this.f119174h == null) {
                                this.f119174h = new j();
                            }
                            t6Var.e(this.f119174h);
                        } else if (iA == 58) {
                            if (this.f119175i == null) {
                                this.f119175i = new l();
                            }
                            t6Var.e(this.f119175i);
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$h */
            public static final class h extends w6<h> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119176c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119177d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119178e;

                public h() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119176c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Long l10 = this.f119177d;
                    if (l10 != null) {
                        iB += u6.s(2, l10.longValue());
                    }
                    Long l11 = this.f119178e;
                    if (l11 != null) {
                        iB += u6.s(3, l11.longValue());
                    }
                    return iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119176c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Long l10 = this.f119177d;
                    if (l10 != null) {
                        u6Var.j(2, l10.longValue());
                    }
                    Long l11 = this.f119178e;
                    if (l11 != null) {
                        u6Var.j(3, l11.longValue());
                    }
                    super.k(u6Var);
                }

                public final h p() {
                    this.f119176c = null;
                    this.f119177d = null;
                    this.f119178e = null;
                    this.f129659b = null;
                    int i10 = 1 & (-1);
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final h l() {
                    try {
                        return (h) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final h e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119176c = Integer.valueOf(t6Var.n());
                        } else if (iA == 16) {
                            this.f119177d = Long.valueOf(t6Var.p());
                        } else if (iA == 24) {
                            this.f119178e = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$i */
            public static final class i extends w6<i> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.r.k.b f119179c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119180d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119181e;

                public i() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.r.k.b bVar = this.f119179c;
                    if (bVar != null && bVar != null) {
                        iB += u6.r(1, bVar.i());
                    }
                    Long l10 = this.f119180d;
                    if (l10 != null) {
                        iB += u6.s(2, l10.longValue());
                    }
                    Long l11 = this.f119181e;
                    if (l11 != null) {
                        iB += u6.s(3, l11.longValue());
                    }
                    return iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.r.k.b bVar = this.f119179c;
                    if (bVar != null && bVar != null) {
                        u6Var.i(1, bVar.i());
                    }
                    Long l10 = this.f119180d;
                    if (l10 != null) {
                        int i10 = 0 ^ 2;
                        u6Var.j(2, l10.longValue());
                    }
                    Long l11 = this.f119181e;
                    if (l11 != null) {
                        u6Var.j(3, l11.longValue());
                    }
                    super.k(u6Var);
                }

                public final i p() {
                    this.f119179c = null;
                    this.f119180d = null;
                    this.f119181e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final i l() {
                    try {
                        return (i) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final i e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2 || iN == 3) {
                                this.f119179c = e3.a.r.k.b.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            this.f119180d = Long.valueOf(t6Var.p());
                        } else if (iA == 24) {
                            this.f119181e = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$j */
            public static final class j extends w6<j> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119182c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119183d;

                public j() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119182c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Integer num2 = this.f119183d;
                    return num2 != null ? iB + u6.r(2, num2.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119182c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Integer num2 = this.f119183d;
                    if (num2 != null) {
                        u6Var.i(2, num2.intValue());
                    }
                    super.k(u6Var);
                }

                public final j p() {
                    this.f119182c = null;
                    this.f119183d = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final j l() {
                    try {
                        return (j) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final j e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119182c = Integer.valueOf(t6Var.n());
                        } else if (iA == 16) {
                            this.f119183d = Integer.valueOf(t6Var.n());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$k */
            public static final class k extends w6<k> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119184c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119185d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public j f119186e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public l f119187f;

                public k() {
                    r();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 4) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(40);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum ShareApp");
                    throw new IllegalArgumentException(sb2.toString());
                }

                public static int q(int i10) {
                    if (i10 >= 0 && i10 <= 5) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum ShareType");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119184c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Integer num2 = this.f119185d;
                    if (num2 != null) {
                        iB += u6.r(2, num2.intValue());
                    }
                    j jVar = this.f119186e;
                    if (jVar != null) {
                        iB += u6.t(3, jVar);
                    }
                    l lVar = this.f119187f;
                    return lVar != null ? iB + u6.t(4, lVar) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119184c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Integer num2 = this.f119185d;
                    if (num2 != null) {
                        u6Var.i(2, num2.intValue());
                    }
                    j jVar = this.f119186e;
                    if (jVar != null) {
                        u6Var.l(3, jVar);
                    }
                    l lVar = this.f119187f;
                    if (lVar != null) {
                        u6Var.l(4, lVar);
                    }
                    super.k(u6Var);
                }

                public final k r() {
                    this.f119184c = null;
                    this.f119185d = null;
                    this.f119186e = null;
                    this.f119187f = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final k l() {
                    try {
                        k kVar = (k) super.l();
                        j jVar = this.f119186e;
                        if (jVar != null) {
                            kVar.f119186e = jVar.l();
                        }
                        l lVar = this.f119187f;
                        if (lVar != null) {
                            kVar.f119187f = lVar.l();
                        }
                        return kVar;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final k e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            try {
                                this.f119184c = Integer.valueOf(q(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            int iT2 = t6Var.t();
                            try {
                                this.f119185d = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused2) {
                                t6Var.o(iT2);
                                n(t6Var, iA);
                            }
                        } else if (iA == 26) {
                            if (this.f119186e == null) {
                                this.f119186e = new j();
                            }
                            t6Var.e(this.f119186e);
                        } else if (iA == 34) {
                            if (this.f119187f == null) {
                                this.f119187f = new l();
                            }
                            t6Var.e(this.f119187f);
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$l */
            public static final class l extends w6<l> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Long f119188c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119189d;

                public l() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 3) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum Codec");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Long l10 = this.f119188c;
                    if (l10 != null) {
                        iB += u6.s(1, l10.longValue());
                    }
                    Integer num = this.f119189d;
                    return num != null ? iB + u6.r(2, num.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Long l10 = this.f119188c;
                    if (l10 != null) {
                        u6Var.j(1, l10.longValue());
                    }
                    Integer num = this.f119189d;
                    if (num != null) {
                        u6Var.i(2, num.intValue());
                    }
                    super.k(u6Var);
                }

                public final l q() {
                    this.f119188c = null;
                    this.f119189d = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final l l() {
                    try {
                        return (l) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final l e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119188c = Long.valueOf(t6Var.p());
                        } else if (iA == 16) {
                            int iT = t6Var.t();
                            try {
                                this.f119189d = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$m */
            public static final class m extends w6<m> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.r.p.b f119190c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public e3.a.r.p.e f119191d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119192e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Long f119193f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public e3.a.r.p.d f119194g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Integer f119195h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public Integer f119196i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public e3.a.r.p.c f119197j;

                public m() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.r.p.b bVar = this.f119190c;
                    if (bVar != null && bVar != null) {
                        iB += u6.r(1, bVar.i());
                    }
                    e3.a.r.p.e eVar = this.f119191d;
                    if (eVar != null && eVar != null) {
                        iB += u6.r(2, eVar.i());
                    }
                    Long l10 = this.f119192e;
                    if (l10 != null) {
                        iB += u6.s(3, l10.longValue());
                    }
                    Long l11 = this.f119193f;
                    if (l11 != null) {
                        iB += u6.s(4, l11.longValue());
                    }
                    e3.a.r.p.d dVar = this.f119194g;
                    if (dVar != null && dVar != null) {
                        iB += u6.r(5, dVar.i());
                    }
                    Integer num = this.f119195h;
                    if (num != null) {
                        iB += u6.r(6, num.intValue());
                    }
                    Integer num2 = this.f119196i;
                    if (num2 != null) {
                        iB += u6.r(7, num2.intValue());
                    }
                    e3.a.r.p.c cVar = this.f119197j;
                    if (cVar != null && cVar != null) {
                        iB += u6.r(8, cVar.i());
                    }
                    return iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.r.p.b bVar = this.f119190c;
                    if (bVar != null && bVar != null) {
                        u6Var.i(1, bVar.i());
                    }
                    e3.a.r.p.e eVar = this.f119191d;
                    if (eVar != null && eVar != null) {
                        u6Var.i(2, eVar.i());
                    }
                    Long l10 = this.f119192e;
                    if (l10 != null) {
                        u6Var.j(3, l10.longValue());
                    }
                    Long l11 = this.f119193f;
                    if (l11 != null) {
                        u6Var.j(4, l11.longValue());
                    }
                    e3.a.r.p.d dVar = this.f119194g;
                    if (dVar != null && dVar != null) {
                        u6Var.i(5, dVar.i());
                    }
                    Integer num = this.f119195h;
                    if (num != null) {
                        u6Var.i(6, num.intValue());
                    }
                    Integer num2 = this.f119196i;
                    if (num2 != null) {
                        u6Var.i(7, num2.intValue());
                    }
                    e3.a.r.p.c cVar = this.f119197j;
                    if (cVar != null && cVar != null) {
                        u6Var.i(8, cVar.i());
                    }
                    super.k(u6Var);
                }

                public final m p() {
                    this.f119190c = null;
                    this.f119191d = null;
                    this.f119192e = null;
                    this.f119193f = null;
                    this.f119194g = null;
                    this.f119195h = null;
                    this.f119196i = null;
                    this.f119197j = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final m l() {
                    try {
                        return (m) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final m e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2) {
                                this.f119190c = e3.a.r.p.b.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            int iT2 = t6Var.t();
                            int iN2 = t6Var.n();
                            if (iN2 == 0 || iN2 == 1 || iN2 == 2 || iN2 == 3) {
                                this.f119191d = e3.a.r.p.e.b(iN2);
                            } else {
                                t6Var.o(iT2);
                                n(t6Var, iA);
                            }
                        } else if (iA == 24) {
                            this.f119192e = Long.valueOf(t6Var.p());
                        } else if (iA == 32) {
                            this.f119193f = Long.valueOf(t6Var.p());
                        } else if (iA == 40) {
                            int iT3 = t6Var.t();
                            int iN3 = t6Var.n();
                            if (iN3 == 0 || iN3 == 1 || iN3 == 2 || iN3 == 3) {
                                this.f119194g = e3.a.r.p.d.b(iN3);
                            } else {
                                t6Var.o(iT3);
                                n(t6Var, iA);
                            }
                        } else if (iA == 48) {
                            this.f119195h = Integer.valueOf(t6Var.n());
                        } else if (iA == 56) {
                            this.f119196i = Integer.valueOf(t6Var.n());
                        } else if (iA == 64) {
                            int iT4 = t6Var.t();
                            int iN4 = t6Var.n();
                            if (iN4 == 0 || iN4 == 1 || iN4 == 2 || iN4 == 3) {
                                this.f119197j = e3.a.r.p.c.b(iN4);
                            } else {
                                t6Var.o(iT4);
                                n(t6Var, iA);
                            }
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$c$n */
            public static final class n extends w6<n> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.r.C1362r.b f119198c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119199d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119200e;

                public n() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.r.C1362r.b bVar = this.f119198c;
                    if (bVar != null && bVar != null) {
                        iB += u6.r(1, bVar.i());
                    }
                    Long l10 = this.f119199d;
                    if (l10 != null) {
                        iB += u6.s(2, l10.longValue());
                    }
                    Long l11 = this.f119200e;
                    if (l11 != null) {
                        iB += u6.s(3, l11.longValue());
                    }
                    return iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.r.C1362r.b bVar = this.f119198c;
                    if (bVar != null && bVar != null) {
                        u6Var.i(1, bVar.i());
                    }
                    Long l10 = this.f119199d;
                    if (l10 != null) {
                        u6Var.j(2, l10.longValue());
                    }
                    Long l11 = this.f119200e;
                    if (l11 != null) {
                        u6Var.j(3, l11.longValue());
                    }
                    super.k(u6Var);
                }

                public final n p() {
                    this.f119198c = null;
                    this.f119199d = null;
                    this.f119200e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final n l() {
                    try {
                        return (n) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final n e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2) {
                                this.f119198c = e3.a.r.C1362r.b.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            this.f119199d = Long.valueOf(t6Var.p());
                        } else if (iA == 24) {
                            this.f119200e = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public c() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                b bVar = this.f119121c;
                if (bVar != null) {
                    iB += u6.t(1, bVar);
                }
                d dVar = this.f119122d;
                if (dVar != null) {
                    iB += u6.t(2, dVar);
                }
                i iVar = this.f119123e;
                if (iVar != null) {
                    iB += u6.t(3, iVar);
                }
                g gVar = this.f119124f;
                if (gVar != null) {
                    iB += u6.t(4, gVar);
                }
                m mVar = this.f119125g;
                if (mVar != null) {
                    iB += u6.t(5, mVar);
                }
                C1093c c1093c = this.f119126h;
                if (c1093c != null) {
                    iB += u6.t(6, c1093c);
                }
                C1092a c1092a = this.f119127i;
                if (c1092a != null) {
                    iB += u6.t(7, c1092a);
                }
                e3.a.r.q qVar = this.f119128j;
                if (qVar != null) {
                    iB += t2.V(8, qVar);
                }
                k kVar = this.f119129k;
                if (kVar != null) {
                    iB += u6.t(9, kVar);
                }
                e eVar = this.f119130l;
                if (eVar != null) {
                    iB += u6.t(10, eVar);
                }
                h hVar = this.f119131m;
                if (hVar != null) {
                    iB += u6.t(11, hVar);
                }
                n nVar = this.f119132n;
                if (nVar != null) {
                    iB += u6.t(12, nVar);
                }
                f fVar = this.f119133o;
                if (fVar != null) {
                    iB += u6.t(13, fVar);
                }
                e3.a.r.c cVar = this.f119134s;
                if (cVar != null) {
                    iB += t2.V(14, cVar);
                }
                e3.a.r.m mVar2 = this.f119135t;
                return mVar2 != null ? iB + t2.V(15, mVar2) : iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                b bVar = this.f119121c;
                if (bVar != null) {
                    u6Var.l(1, bVar);
                }
                d dVar = this.f119122d;
                if (dVar != null) {
                    u6Var.l(2, dVar);
                }
                i iVar = this.f119123e;
                if (iVar != null) {
                    u6Var.l(3, iVar);
                }
                g gVar = this.f119124f;
                if (gVar != null) {
                    u6Var.l(4, gVar);
                }
                m mVar = this.f119125g;
                if (mVar != null) {
                    u6Var.l(5, mVar);
                }
                C1093c c1093c = this.f119126h;
                if (c1093c != null) {
                    u6Var.l(6, c1093c);
                }
                C1092a c1092a = this.f119127i;
                if (c1092a != null) {
                    u6Var.l(7, c1092a);
                }
                e3.a.r.q qVar = this.f119128j;
                if (qVar != null) {
                    u6Var.k(8, qVar);
                }
                k kVar = this.f119129k;
                if (kVar != null) {
                    u6Var.l(9, kVar);
                }
                e eVar = this.f119130l;
                if (eVar != null) {
                    u6Var.l(10, eVar);
                }
                h hVar = this.f119131m;
                if (hVar != null) {
                    u6Var.l(11, hVar);
                }
                n nVar = this.f119132n;
                if (nVar != null) {
                    u6Var.l(12, nVar);
                }
                f fVar = this.f119133o;
                if (fVar != null) {
                    u6Var.l(13, fVar);
                }
                e3.a.r.c cVar = this.f119134s;
                if (cVar != null) {
                    u6Var.k(14, cVar);
                }
                e3.a.r.m mVar2 = this.f119135t;
                if (mVar2 != null) {
                    u6Var.k(15, mVar2);
                }
                super.k(u6Var);
            }

            public final c p() {
                this.f119121c = null;
                this.f119122d = null;
                this.f119123e = null;
                this.f119124f = null;
                this.f119125g = null;
                this.f119126h = null;
                this.f119127i = null;
                this.f119128j = null;
                this.f119129k = null;
                this.f119130l = null;
                this.f119131m = null;
                this.f119132n = null;
                this.f119133o = null;
                this.f119134s = null;
                this.f119135t = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final c l() {
                try {
                    c cVar = (c) super.l();
                    b bVar = this.f119121c;
                    if (bVar != null) {
                        cVar.f119121c = bVar.l();
                    }
                    d dVar = this.f119122d;
                    if (dVar != null) {
                        cVar.f119122d = dVar.l();
                    }
                    i iVar = this.f119123e;
                    if (iVar != null) {
                        cVar.f119123e = iVar.l();
                    }
                    g gVar = this.f119124f;
                    if (gVar != null) {
                        cVar.f119124f = gVar.l();
                    }
                    m mVar = this.f119125g;
                    if (mVar != null) {
                        cVar.f119125g = mVar.l();
                    }
                    C1093c c1093c = this.f119126h;
                    if (c1093c != null) {
                        cVar.f119126h = c1093c.l();
                    }
                    C1092a c1092a = this.f119127i;
                    if (c1092a != null) {
                        cVar.f119127i = c1092a.l();
                    }
                    e3.a.r.q qVar = this.f119128j;
                    if (qVar != null) {
                        cVar.f119128j = qVar;
                    }
                    k kVar = this.f119129k;
                    if (kVar != null) {
                        cVar.f119129k = kVar.l();
                    }
                    e eVar = this.f119130l;
                    if (eVar != null) {
                        cVar.f119130l = eVar.l();
                    }
                    h hVar = this.f119131m;
                    if (hVar != null) {
                        cVar.f119131m = hVar.l();
                    }
                    n nVar = this.f119132n;
                    if (nVar != null) {
                        cVar.f119132n = nVar.l();
                    }
                    f fVar = this.f119133o;
                    if (fVar != null) {
                        cVar.f119133o = fVar.l();
                    }
                    e3.a.r.c cVar2 = this.f119134s;
                    if (cVar2 != null) {
                        cVar.f119134s = cVar2;
                    }
                    e3.a.r.m mVar2 = this.f119135t;
                    if (mVar2 != null) {
                        cVar.f119135t = mVar2;
                    }
                    return cVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final c e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    switch (iA) {
                        case 0:
                            break;
                        case 10:
                            if (this.f119121c == null) {
                                this.f119121c = new b();
                            }
                            t6Var.e(this.f119121c);
                            break;
                        case 18:
                            if (this.f119122d == null) {
                                this.f119122d = new d();
                            }
                            t6Var.e(this.f119122d);
                            break;
                        case 26:
                            if (this.f119123e == null) {
                                this.f119123e = new i();
                            }
                            t6Var.e(this.f119123e);
                            break;
                        case 34:
                            if (this.f119124f == null) {
                                this.f119124f = new g();
                            }
                            t6Var.e(this.f119124f);
                            break;
                        case 42:
                            if (this.f119125g == null) {
                                this.f119125g = new m();
                            }
                            t6Var.e(this.f119125g);
                            break;
                        case 50:
                            if (this.f119126h == null) {
                                this.f119126h = new C1093c();
                            }
                            t6Var.e(this.f119126h);
                            break;
                        case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                            if (this.f119127i == null) {
                                this.f119127i = new C1092a();
                            }
                            t6Var.e(this.f119127i);
                            break;
                        case 66:
                            e3.a.r.q qVarBuild = (e3.a.r.q) t6Var.b(e3.a.r.q.B());
                            e3.a.r.q qVar = this.f119128j;
                            if (qVar != null) {
                                qVarBuild = qVar.r1().l(qVarBuild).build();
                            }
                            this.f119128j = qVarBuild;
                            break;
                        case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                            if (this.f119129k == null) {
                                this.f119129k = new k();
                            }
                            t6Var.e(this.f119129k);
                            break;
                        case com.planner5d.library.engine.input.f.b.f160705l0 /* 82 */:
                            if (this.f119130l == null) {
                                this.f119130l = new e();
                            }
                            t6Var.e(this.f119130l);
                            break;
                        case 90:
                            if (this.f119131m == null) {
                                this.f119131m = new h();
                            }
                            t6Var.e(this.f119131m);
                            break;
                        case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                            if (this.f119132n == null) {
                                this.f119132n = new n();
                            }
                            t6Var.e(this.f119132n);
                            break;
                        case com.planner5d.library.engine.input.f.b.f160742x1 /* 106 */:
                            if (this.f119133o == null) {
                                this.f119133o = new f();
                            }
                            t6Var.e(this.f119133o);
                            break;
                        case 114:
                            e3.a.r.c cVarBuild = (e3.a.r.c) t6Var.b(e3.a.r.c.B());
                            e3.a.r.c cVar = this.f119134s;
                            if (cVar != null) {
                                cVarBuild = cVar.r1().l(cVarBuild).build();
                            }
                            this.f119134s = cVarBuild;
                            break;
                        case 122:
                            e3.a.r.m mVarBuild = (e3.a.r.m) t6Var.b(e3.a.r.m.B());
                            e3.a.r.m mVar = this.f119135t;
                            if (mVar != null) {
                                mVarBuild = mVar.r1().l(mVarBuild).build();
                            }
                            this.f119135t = mVarBuild;
                            break;
                        default:
                            if (!super.n(t6Var, iA)) {
                            }
                            break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$d */
        public static final class d extends w6<d> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f119201c;

            public d() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                String str = this.f119201c;
                if (str != null) {
                    iB += u6.u(1, str);
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                String str = this.f119201c;
                if (str != null) {
                    u6Var.m(1, str);
                }
                super.k(u6Var);
            }

            public final d p() {
                this.f119201c = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final d l() {
                try {
                    return (d) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final d e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 10) {
                        this.f119201c = t6Var.l();
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$e */
        public static final class e extends w6<e> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f119202c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Integer f119203d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Long f119204e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Float f119205f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Long f119206g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public C1095a f119207h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private b f119208i;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$e$a, reason: collision with other inner class name */
            public static final class C1095a extends w6<C1095a> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Long f119209c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119210d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public C1096a[] f119211e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public b[] f119212f;

                /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$e$a$a, reason: collision with other inner class name */
                public static final class C1096a extends w6<C1096a> implements Cloneable {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static volatile C1096a[] f119213e;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Long f119214c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Integer f119215d;

                    public C1096a() {
                        p();
                    }

                    public static C1096a[] r() {
                        if (f119213e == null) {
                            synchronized (a7.f127704b) {
                                try {
                                    if (f119213e == null) {
                                        f119213e = new C1096a[0];
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        return f119213e;
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    protected final int b() {
                        int iB = super.b();
                        Long l10 = this.f119214c;
                        if (l10 != null) {
                            iB += u6.s(1, l10.longValue());
                        }
                        Integer num = this.f119215d;
                        return num != null ? iB + u6.r(2, num.intValue()) : iB;
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    public final void k(u6 u6Var) throws IOException {
                        Long l10 = this.f119214c;
                        if (l10 != null) {
                            u6Var.j(1, l10.longValue());
                        }
                        Integer num = this.f119215d;
                        if (num != null) {
                            u6Var.i(2, num.intValue());
                        }
                        super.k(u6Var);
                    }

                    public final C1096a p() {
                        this.f119214c = null;
                        this.f119215d = null;
                        this.f129659b = null;
                        this.f127766a = -1;
                        return this;
                    }

                    @Override // com.google.vr.sdk.deps.w6
                    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                    public final C1096a l() {
                        try {
                            return (C1096a) super.l();
                        } catch (CloneNotSupportedException e10) {
                            throw new AssertionError(e10);
                        }
                    }

                    @Override // com.google.vr.sdk.deps.c7
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final C1096a e(t6 t6Var) throws IOException {
                        while (true) {
                            int iA = t6Var.a();
                            if (iA == 0) {
                                break;
                            }
                            if (iA == 8) {
                                this.f119214c = Long.valueOf(t6Var.p());
                            } else if (iA == 16) {
                                this.f119215d = Integer.valueOf(t6Var.n());
                            } else if (!super.n(t6Var, iA)) {
                                break;
                            }
                        }
                        return this;
                    }
                }

                /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$e$a$b */
                public static final class b extends w6<b> implements Cloneable {

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static volatile b[] f119216g;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Long f119217c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Boolean f119218d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public float[] f119219e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public float[] f119220f;

                    public b() {
                        p();
                    }

                    public static b[] r() {
                        if (f119216g == null) {
                            synchronized (a7.f127704b) {
                                try {
                                    if (f119216g == null) {
                                        f119216g = new b[0];
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        return f119216g;
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    protected final int b() {
                        int iB = super.b();
                        Long l10 = this.f119217c;
                        if (l10 != null) {
                            iB += u6.s(1, l10.longValue());
                        }
                        Boolean bool = this.f119218d;
                        if (bool != null) {
                            bool.getClass();
                            iB += u6.q(2) + 1;
                        }
                        float[] fArr = this.f119219e;
                        if (fArr != null && fArr.length > 0) {
                            iB = iB + (fArr.length * 4) + fArr.length;
                        }
                        float[] fArr2 = this.f119220f;
                        return (fArr2 == null || fArr2.length <= 0) ? iB : iB + (fArr2.length * 4) + fArr2.length;
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    public final void k(u6 u6Var) throws IOException {
                        Long l10 = this.f119217c;
                        if (l10 != null) {
                            u6Var.j(1, l10.longValue());
                        }
                        Boolean bool = this.f119218d;
                        if (bool != null) {
                            u6Var.n(2, bool.booleanValue());
                        }
                        float[] fArr = this.f119219e;
                        int i10 = 0;
                        if (fArr != null && fArr.length > 0) {
                            int i11 = 0;
                            while (true) {
                                float[] fArr2 = this.f119219e;
                                if (i11 >= fArr2.length) {
                                    break;
                                }
                                u6Var.h(3, fArr2[i11]);
                                i11++;
                            }
                        }
                        float[] fArr3 = this.f119220f;
                        if (fArr3 != null && fArr3.length > 0) {
                            while (true) {
                                float[] fArr4 = this.f119220f;
                                if (i10 >= fArr4.length) {
                                    break;
                                }
                                u6Var.h(4, fArr4[i10]);
                                i10++;
                            }
                        }
                        super.k(u6Var);
                    }

                    public final b p() {
                        this.f119217c = null;
                        this.f119218d = null;
                        float[] fArr = e7.f129361b;
                        this.f119219e = fArr;
                        this.f119220f = fArr;
                        this.f129659b = null;
                        this.f127766a = -1;
                        return this;
                    }

                    @Override // com.google.vr.sdk.deps.w6
                    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                    public final b l() {
                        try {
                            b bVar = (b) super.l();
                            float[] fArr = this.f119219e;
                            if (fArr != null && fArr.length > 0) {
                                bVar.f119219e = (float[]) fArr.clone();
                            }
                            float[] fArr2 = this.f119220f;
                            if (fArr2 != null && fArr2.length > 0) {
                                bVar.f119220f = (float[]) fArr2.clone();
                            }
                            return bVar;
                        } catch (CloneNotSupportedException e10) {
                            throw new AssertionError(e10);
                        }
                    }

                    @Override // com.google.vr.sdk.deps.c7
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final b e(t6 t6Var) throws IOException {
                        while (true) {
                            int iA = t6Var.a();
                            if (iA == 0) {
                                break;
                            }
                            if (iA == 8) {
                                this.f119217c = Long.valueOf(t6Var.p());
                            } else if (iA == 16) {
                                this.f119218d = Boolean.valueOf(t6Var.k());
                            } else if (iA == 26) {
                                int iN = t6Var.n();
                                int iJ = t6Var.j(iN);
                                int i10 = iN / 4;
                                float[] fArr = this.f119219e;
                                int length = fArr == null ? 0 : fArr.length;
                                int i11 = i10 + length;
                                float[] fArr2 = new float[i11];
                                if (length != 0) {
                                    System.arraycopy(fArr, 0, fArr2, 0, length);
                                }
                                while (length < i11) {
                                    fArr2[length] = Float.intBitsToFloat(t6Var.r());
                                    length++;
                                }
                                this.f119219e = fArr2;
                                t6Var.m(iJ);
                            } else if (iA == 29) {
                                int iA2 = e7.a(t6Var, 29);
                                float[] fArr3 = this.f119219e;
                                int length2 = fArr3 == null ? 0 : fArr3.length;
                                int i12 = iA2 + length2;
                                float[] fArr4 = new float[i12];
                                if (length2 != 0) {
                                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                                }
                                while (length2 < i12 - 1) {
                                    fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                                    t6Var.a();
                                    length2++;
                                }
                                fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                                this.f119219e = fArr4;
                            } else if (iA == 34) {
                                int iN2 = t6Var.n();
                                int iJ2 = t6Var.j(iN2);
                                int i13 = iN2 / 4;
                                float[] fArr5 = this.f119220f;
                                int length3 = fArr5 == null ? 0 : fArr5.length;
                                int i14 = i13 + length3;
                                float[] fArr6 = new float[i14];
                                if (length3 != 0) {
                                    System.arraycopy(fArr5, 0, fArr6, 0, length3);
                                }
                                while (length3 < i14) {
                                    fArr6[length3] = Float.intBitsToFloat(t6Var.r());
                                    length3++;
                                }
                                this.f119220f = fArr6;
                                t6Var.m(iJ2);
                            } else if (iA == 37) {
                                int iA3 = e7.a(t6Var, 37);
                                float[] fArr7 = this.f119220f;
                                int length4 = fArr7 == null ? 0 : fArr7.length;
                                int i15 = iA3 + length4;
                                float[] fArr8 = new float[i15];
                                if (length4 != 0) {
                                    System.arraycopy(fArr7, 0, fArr8, 0, length4);
                                }
                                while (length4 < i15 - 1) {
                                    fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                                    t6Var.a();
                                    length4++;
                                }
                                fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                                this.f119220f = fArr8;
                            } else if (!super.n(t6Var, iA)) {
                                break;
                            }
                        }
                        return this;
                    }
                }

                public C1095a() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Long l10 = this.f119209c;
                    if (l10 != null) {
                        iB += u6.s(1, l10.longValue());
                    }
                    Long l11 = this.f119210d;
                    if (l11 != null) {
                        iB += u6.s(2, l11.longValue());
                    }
                    C1096a[] c1096aArr = this.f119211e;
                    int i10 = 0;
                    if (c1096aArr != null && c1096aArr.length > 0) {
                        int i11 = 0;
                        while (true) {
                            C1096a[] c1096aArr2 = this.f119211e;
                            if (i11 >= c1096aArr2.length) {
                                break;
                            }
                            C1096a c1096a = c1096aArr2[i11];
                            if (c1096a != null) {
                                iB += u6.t(3, c1096a);
                            }
                            i11++;
                        }
                    }
                    b[] bVarArr = this.f119212f;
                    if (bVarArr != null && bVarArr.length > 0) {
                        while (true) {
                            b[] bVarArr2 = this.f119212f;
                            if (i10 >= bVarArr2.length) {
                                break;
                            }
                            b bVar = bVarArr2[i10];
                            if (bVar != null) {
                                iB += u6.t(4, bVar);
                            }
                            i10++;
                        }
                    }
                    return iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Long l10 = this.f119209c;
                    if (l10 != null) {
                        u6Var.j(1, l10.longValue());
                    }
                    Long l11 = this.f119210d;
                    if (l11 != null) {
                        u6Var.j(2, l11.longValue());
                    }
                    C1096a[] c1096aArr = this.f119211e;
                    int i10 = 0;
                    if (c1096aArr != null && c1096aArr.length > 0) {
                        int i11 = 0;
                        while (true) {
                            C1096a[] c1096aArr2 = this.f119211e;
                            if (i11 >= c1096aArr2.length) {
                                break;
                            }
                            C1096a c1096a = c1096aArr2[i11];
                            if (c1096a != null) {
                                u6Var.l(3, c1096a);
                            }
                            i11++;
                        }
                    }
                    b[] bVarArr = this.f119212f;
                    if (bVarArr != null && bVarArr.length > 0) {
                        while (true) {
                            b[] bVarArr2 = this.f119212f;
                            if (i10 >= bVarArr2.length) {
                                break;
                            }
                            b bVar = bVarArr2[i10];
                            if (bVar != null) {
                                u6Var.l(4, bVar);
                            }
                            i10++;
                        }
                    }
                    super.k(u6Var);
                }

                public final C1095a p() {
                    this.f119209c = null;
                    this.f119210d = null;
                    this.f119211e = C1096a.r();
                    this.f119212f = b.r();
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1095a l() {
                    try {
                        C1095a c1095a = (C1095a) super.l();
                        C1096a[] c1096aArr = this.f119211e;
                        int i10 = 0;
                        if (c1096aArr != null && c1096aArr.length > 0) {
                            c1095a.f119211e = new C1096a[c1096aArr.length];
                            int i11 = 0;
                            while (true) {
                                C1096a[] c1096aArr2 = this.f119211e;
                                if (i11 >= c1096aArr2.length) {
                                    break;
                                }
                                C1096a c1096a = c1096aArr2[i11];
                                if (c1096a != null) {
                                    c1095a.f119211e[i11] = c1096a.l();
                                }
                                i11++;
                            }
                        }
                        b[] bVarArr = this.f119212f;
                        if (bVarArr != null && bVarArr.length > 0) {
                            c1095a.f119212f = new b[bVarArr.length];
                            while (true) {
                                b[] bVarArr2 = this.f119212f;
                                if (i10 >= bVarArr2.length) {
                                    break;
                                }
                                b bVar = bVarArr2[i10];
                                if (bVar != null) {
                                    c1095a.f119212f[i10] = bVar.l();
                                }
                                i10++;
                            }
                        }
                        return c1095a;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1095a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119209c = Long.valueOf(t6Var.p());
                        } else if (iA == 16) {
                            this.f119210d = Long.valueOf(t6Var.p());
                        } else if (iA == 26) {
                            int iA2 = e7.a(t6Var, 26);
                            C1096a[] c1096aArr = this.f119211e;
                            int length = c1096aArr == null ? 0 : c1096aArr.length;
                            int i10 = iA2 + length;
                            C1096a[] c1096aArr2 = new C1096a[i10];
                            if (length != 0) {
                                System.arraycopy(c1096aArr, 0, c1096aArr2, 0, length);
                            }
                            while (length < i10 - 1) {
                                C1096a c1096a = new C1096a();
                                c1096aArr2[length] = c1096a;
                                t6Var.e(c1096a);
                                t6Var.a();
                                length++;
                            }
                            C1096a c1096a2 = new C1096a();
                            c1096aArr2[length] = c1096a2;
                            t6Var.e(c1096a2);
                            this.f119211e = c1096aArr2;
                        } else if (iA == 34) {
                            int iA3 = e7.a(t6Var, 34);
                            b[] bVarArr = this.f119212f;
                            int length2 = bVarArr == null ? 0 : bVarArr.length;
                            int i11 = iA3 + length2;
                            b[] bVarArr2 = new b[i11];
                            if (length2 != 0) {
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length2);
                            }
                            while (length2 < i11 - 1) {
                                b bVar = new b();
                                bVarArr2[length2] = bVar;
                                t6Var.e(bVar);
                                t6Var.a();
                                length2++;
                            }
                            b bVar2 = new b();
                            bVarArr2[length2] = bVar2;
                            t6Var.e(bVar2);
                            this.f119212f = bVarArr2;
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$e$b */
            public static final class b extends w6<b> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Float f119221c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Float f119222d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Float f119223e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public float[] f119224f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public float[] f119225g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Float f119226h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public Float f119227i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Float f119228j;

                public b() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Float f10 = this.f119221c;
                    if (f10 != null) {
                        f10.getClass();
                        iB += u6.q(1) + 4;
                    }
                    Float f11 = this.f119222d;
                    if (f11 != null) {
                        f11.getClass();
                        iB += u6.q(2) + 4;
                    }
                    Float f12 = this.f119223e;
                    if (f12 != null) {
                        f12.getClass();
                        iB += u6.q(3) + 4;
                    }
                    float[] fArr = this.f119224f;
                    if (fArr != null && fArr.length > 0) {
                        iB = iB + (fArr.length * 4) + fArr.length;
                    }
                    float[] fArr2 = this.f119225g;
                    if (fArr2 != null && fArr2.length > 0) {
                        iB = iB + (fArr2.length * 4) + fArr2.length;
                    }
                    Float f13 = this.f119226h;
                    if (f13 != null) {
                        f13.getClass();
                        iB += u6.q(6) + 4;
                    }
                    Float f14 = this.f119227i;
                    if (f14 != null) {
                        f14.getClass();
                        iB += u6.q(7) + 4;
                    }
                    Float f15 = this.f119228j;
                    if (f15 == null) {
                        return iB;
                    }
                    f15.getClass();
                    return iB + u6.q(8) + 4;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Float f10 = this.f119221c;
                    if (f10 != null) {
                        u6Var.h(1, f10.floatValue());
                    }
                    Float f11 = this.f119222d;
                    if (f11 != null) {
                        u6Var.h(2, f11.floatValue());
                    }
                    Float f12 = this.f119223e;
                    if (f12 != null) {
                        u6Var.h(3, f12.floatValue());
                    }
                    float[] fArr = this.f119224f;
                    int i10 = 0;
                    if (fArr != null && fArr.length > 0) {
                        int i11 = 0;
                        while (true) {
                            float[] fArr2 = this.f119224f;
                            if (i11 >= fArr2.length) {
                                break;
                            }
                            u6Var.h(4, fArr2[i11]);
                            i11++;
                        }
                    }
                    float[] fArr3 = this.f119225g;
                    if (fArr3 != null && fArr3.length > 0) {
                        while (true) {
                            float[] fArr4 = this.f119225g;
                            if (i10 >= fArr4.length) {
                                break;
                            }
                            u6Var.h(5, fArr4[i10]);
                            i10++;
                        }
                    }
                    Float f13 = this.f119226h;
                    if (f13 != null) {
                        u6Var.h(6, f13.floatValue());
                    }
                    Float f14 = this.f119227i;
                    if (f14 != null) {
                        u6Var.h(7, f14.floatValue());
                    }
                    Float f15 = this.f119228j;
                    if (f15 != null) {
                        u6Var.h(8, f15.floatValue());
                    }
                    super.k(u6Var);
                }

                public final b p() {
                    this.f119221c = null;
                    this.f119222d = null;
                    this.f119223e = null;
                    float[] fArr = e7.f129361b;
                    this.f119224f = fArr;
                    this.f119225g = fArr;
                    this.f119226h = null;
                    this.f119227i = null;
                    this.f119228j = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final b l() {
                    try {
                        b bVar = (b) super.l();
                        float[] fArr = this.f119224f;
                        if (fArr != null && fArr.length > 0) {
                            bVar.f119224f = (float[]) fArr.clone();
                        }
                        float[] fArr2 = this.f119225g;
                        if (fArr2 != null && fArr2.length > 0) {
                            bVar.f119225g = (float[]) fArr2.clone();
                        }
                        return bVar;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final b e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        switch (iA) {
                            case 0:
                                break;
                            case 13:
                                this.f119221c = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                                continue;
                            case 21:
                                this.f119222d = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                                continue;
                            case 29:
                                this.f119223e = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                                continue;
                            case 34:
                                int iN = t6Var.n();
                                int iJ = t6Var.j(iN);
                                int i10 = iN / 4;
                                float[] fArr = this.f119224f;
                                int length = fArr == null ? 0 : fArr.length;
                                int i11 = i10 + length;
                                float[] fArr2 = new float[i11];
                                if (length != 0) {
                                    System.arraycopy(fArr, 0, fArr2, 0, length);
                                }
                                while (length < i11) {
                                    fArr2[length] = Float.intBitsToFloat(t6Var.r());
                                    length++;
                                }
                                this.f119224f = fArr2;
                                t6Var.m(iJ);
                                continue;
                            case 37:
                                int iA2 = e7.a(t6Var, 37);
                                float[] fArr3 = this.f119224f;
                                int length2 = fArr3 == null ? 0 : fArr3.length;
                                int i12 = iA2 + length2;
                                float[] fArr4 = new float[i12];
                                if (length2 != 0) {
                                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                                }
                                while (length2 < i12 - 1) {
                                    fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                                    t6Var.a();
                                    length2++;
                                }
                                fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                                this.f119224f = fArr4;
                                continue;
                            case 42:
                                int iN2 = t6Var.n();
                                int iJ2 = t6Var.j(iN2);
                                int i13 = iN2 / 4;
                                float[] fArr5 = this.f119225g;
                                int length3 = fArr5 == null ? 0 : fArr5.length;
                                int i14 = i13 + length3;
                                float[] fArr6 = new float[i14];
                                if (length3 != 0) {
                                    System.arraycopy(fArr5, 0, fArr6, 0, length3);
                                }
                                while (length3 < i14) {
                                    fArr6[length3] = Float.intBitsToFloat(t6Var.r());
                                    length3++;
                                }
                                this.f119225g = fArr6;
                                t6Var.m(iJ2);
                                continue;
                            case 45:
                                int iA3 = e7.a(t6Var, 45);
                                float[] fArr7 = this.f119225g;
                                int length4 = fArr7 == null ? 0 : fArr7.length;
                                int i15 = iA3 + length4;
                                float[] fArr8 = new float[i15];
                                if (length4 != 0) {
                                    System.arraycopy(fArr7, 0, fArr8, 0, length4);
                                }
                                while (length4 < i15 - 1) {
                                    fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                                    t6Var.a();
                                    length4++;
                                }
                                fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                                this.f119225g = fArr8;
                                continue;
                            case 53:
                                this.f119226h = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                                continue;
                            case 61:
                                this.f119227i = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                                continue;
                            case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                                this.f119228j = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                                continue;
                            default:
                                if (!super.n(t6Var, iA)) {
                                }
                                break;
                        }
                    }
                    return this;
                }
            }

            public e() {
                q();
            }

            public static int p(int i10) {
                if (i10 >= 0 && i10 <= 7) {
                    return i10;
                }
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append(i10);
                sb2.append(" is not a valid enum FallBackReason");
                throw new IllegalArgumentException(sb2.toString());
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Integer num = this.f119203d;
                if (num != null) {
                    iB += u6.r(1, num.intValue());
                }
                Long l10 = this.f119204e;
                if (l10 != null) {
                    iB += u6.s(2, l10.longValue());
                }
                Float f10 = this.f119205f;
                if (f10 != null) {
                    f10.getClass();
                    iB += u6.q(3) + 4;
                }
                Long l11 = this.f119206g;
                if (l11 != null) {
                    iB += u6.s(4, l11.longValue());
                }
                C1095a c1095a = this.f119207h;
                if (c1095a != null) {
                    iB += u6.t(5, c1095a);
                }
                return this.f119202c == 0 ? iB + u6.t(6, this.f119208i) : iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Integer num = this.f119203d;
                if (num != null) {
                    u6Var.i(1, num.intValue());
                }
                Long l10 = this.f119204e;
                if (l10 != null) {
                    u6Var.j(2, l10.longValue());
                }
                Float f10 = this.f119205f;
                if (f10 != null) {
                    u6Var.h(3, f10.floatValue());
                }
                Long l11 = this.f119206g;
                if (l11 != null) {
                    u6Var.j(4, l11.longValue());
                }
                C1095a c1095a = this.f119207h;
                if (c1095a != null) {
                    u6Var.l(5, c1095a);
                }
                if (this.f119202c == 0) {
                    u6Var.l(6, this.f119208i);
                }
                super.k(u6Var);
            }

            public final e q() {
                this.f119203d = null;
                this.f119204e = null;
                this.f119205f = null;
                this.f119206g = null;
                this.f119207h = null;
                this.f119202c = -1;
                this.f119208i = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final e l() {
                try {
                    e eVar = (e) super.l();
                    C1095a c1095a = this.f119207h;
                    if (c1095a != null) {
                        eVar.f119207h = c1095a.l();
                    }
                    b bVar = this.f119208i;
                    if (bVar != null) {
                        eVar.f119208i = bVar.l();
                    }
                    return eVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final e e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 8) {
                        int iT = t6Var.t();
                        try {
                            this.f119203d = Integer.valueOf(p(t6Var.n()));
                        } catch (IllegalArgumentException unused) {
                            t6Var.o(iT);
                            n(t6Var, iA);
                        }
                    } else if (iA == 16) {
                        this.f119204e = Long.valueOf(t6Var.p());
                    } else if (iA == 29) {
                        this.f119205f = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                    } else if (iA == 32) {
                        this.f119206g = Long.valueOf(t6Var.p());
                    } else if (iA == 42) {
                        if (this.f119207h == null) {
                            this.f119207h = new C1095a();
                        }
                        t6Var.e(this.f119207h);
                    } else if (iA == 50) {
                        if (this.f119208i == null) {
                            this.f119208i = new b();
                        }
                        t6Var.e(this.f119208i);
                        this.f119202c = 0;
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$f */
        public static final class f extends w6<f> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C1097a[] f119229c;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$f$a, reason: collision with other inner class name */
            public static final class C1097a extends w6<C1097a> implements Cloneable {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static volatile C1097a[] f119230n;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Long f119231c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119232d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public e3.a.y.e f119233e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public C1089a f119234f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public String[] f119235g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public String[] f119236h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public String f119237i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Integer f119238j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public String f119239k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public Integer f119240l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public String[] f119241m;

                public C1097a() {
                    p();
                }

                public static C1097a[] r() {
                    if (f119230n == null) {
                        synchronized (a7.f127704b) {
                            try {
                                if (f119230n == null) {
                                    f119230n = new C1097a[0];
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return f119230n;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Long l10 = this.f119231c;
                    if (l10 != null) {
                        iB += u6.s(1, l10.longValue());
                    }
                    Integer num = this.f119232d;
                    if (num != null) {
                        iB += u6.r(2, num.intValue());
                    }
                    e3.a.y.e eVar = this.f119233e;
                    if (eVar != null) {
                        iB += t2.V(3, eVar);
                    }
                    C1089a c1089a = this.f119234f;
                    if (c1089a != null) {
                        iB += u6.t(4, c1089a);
                    }
                    String[] strArr = this.f119235g;
                    int i10 = 0;
                    if (strArr != null && strArr.length > 0) {
                        int i11 = 0;
                        int iC = 0;
                        int i12 = 0;
                        while (true) {
                            String[] strArr2 = this.f119235g;
                            if (i11 >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i11];
                            if (str != null) {
                                i12++;
                                iC += u6.c(str);
                            }
                            i11++;
                        }
                        iB = iB + iC + i12;
                    }
                    String[] strArr3 = this.f119236h;
                    if (strArr3 != null && strArr3.length > 0) {
                        int i13 = 0;
                        int iC2 = 0;
                        int i14 = 0;
                        while (true) {
                            String[] strArr4 = this.f119236h;
                            if (i13 >= strArr4.length) {
                                break;
                            }
                            String str2 = strArr4[i13];
                            if (str2 != null) {
                                i14++;
                                iC2 += u6.c(str2);
                            }
                            i13++;
                        }
                        iB = iB + iC2 + i14;
                    }
                    String str3 = this.f119237i;
                    if (str3 != null) {
                        iB += u6.u(7, str3);
                    }
                    Integer num2 = this.f119238j;
                    if (num2 != null) {
                        iB += u6.r(8, num2.intValue());
                    }
                    String str4 = this.f119239k;
                    if (str4 != null) {
                        iB += u6.u(9, str4);
                    }
                    Integer num3 = this.f119240l;
                    if (num3 != null) {
                        iB += u6.r(10, num3.intValue());
                    }
                    String[] strArr5 = this.f119241m;
                    if (strArr5 == null || strArr5.length <= 0) {
                        return iB;
                    }
                    int iC3 = 0;
                    int i15 = 0;
                    while (true) {
                        String[] strArr6 = this.f119241m;
                        if (i10 >= strArr6.length) {
                            return iB + iC3 + i15;
                        }
                        String str5 = strArr6[i10];
                        if (str5 != null) {
                            i15++;
                            iC3 += u6.c(str5);
                        }
                        i10++;
                    }
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Long l10 = this.f119231c;
                    if (l10 != null) {
                        u6Var.j(1, l10.longValue());
                    }
                    Integer num = this.f119232d;
                    if (num != null) {
                        u6Var.i(2, num.intValue());
                    }
                    e3.a.y.e eVar = this.f119233e;
                    if (eVar != null) {
                        u6Var.k(3, eVar);
                    }
                    C1089a c1089a = this.f119234f;
                    if (c1089a != null) {
                        u6Var.l(4, c1089a);
                    }
                    String[] strArr = this.f119235g;
                    int i10 = 0;
                    if (strArr != null && strArr.length > 0) {
                        int i11 = 0;
                        while (true) {
                            String[] strArr2 = this.f119235g;
                            if (i11 >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i11];
                            if (str != null) {
                                u6Var.m(5, str);
                            }
                            i11++;
                        }
                    }
                    String[] strArr3 = this.f119236h;
                    if (strArr3 != null && strArr3.length > 0) {
                        int i12 = 0;
                        while (true) {
                            String[] strArr4 = this.f119236h;
                            if (i12 >= strArr4.length) {
                                break;
                            }
                            String str2 = strArr4[i12];
                            if (str2 != null) {
                                u6Var.m(6, str2);
                            }
                            i12++;
                        }
                    }
                    String str3 = this.f119237i;
                    if (str3 != null) {
                        u6Var.m(7, str3);
                    }
                    Integer num2 = this.f119238j;
                    if (num2 != null) {
                        u6Var.i(8, num2.intValue());
                    }
                    String str4 = this.f119239k;
                    if (str4 != null) {
                        u6Var.m(9, str4);
                    }
                    Integer num3 = this.f119240l;
                    if (num3 != null) {
                        u6Var.i(10, num3.intValue());
                    }
                    String[] strArr5 = this.f119241m;
                    if (strArr5 != null && strArr5.length > 0) {
                        while (true) {
                            String[] strArr6 = this.f119241m;
                            if (i10 >= strArr6.length) {
                                break;
                            }
                            String str5 = strArr6[i10];
                            if (str5 != null) {
                                u6Var.m(11, str5);
                            }
                            i10++;
                        }
                    }
                    super.k(u6Var);
                }

                public final C1097a p() {
                    this.f119231c = null;
                    this.f119232d = null;
                    this.f119233e = null;
                    this.f119234f = null;
                    String[] strArr = e7.f129362c;
                    this.f119235g = strArr;
                    this.f119236h = strArr;
                    this.f119237i = null;
                    this.f119238j = null;
                    this.f119239k = null;
                    this.f119240l = null;
                    this.f119241m = strArr;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1097a l() {
                    try {
                        C1097a c1097a = (C1097a) super.l();
                        e3.a.y.e eVar = this.f119233e;
                        if (eVar != null) {
                            c1097a.f119233e = eVar;
                        }
                        C1089a c1089a = this.f119234f;
                        if (c1089a != null) {
                            c1097a.f119234f = c1089a.clone();
                        }
                        String[] strArr = this.f119235g;
                        if (strArr != null && strArr.length > 0) {
                            c1097a.f119235g = (String[]) strArr.clone();
                        }
                        String[] strArr2 = this.f119236h;
                        if (strArr2 != null && strArr2.length > 0) {
                            c1097a.f119236h = (String[]) strArr2.clone();
                        }
                        String[] strArr3 = this.f119241m;
                        if (strArr3 != null && strArr3.length > 0) {
                            c1097a.f119241m = (String[]) strArr3.clone();
                        }
                        return c1097a;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C1097a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        switch (iA) {
                            case 0:
                                break;
                            case 8:
                                this.f119231c = Long.valueOf(t6Var.p());
                                break;
                            case 16:
                                int iT = t6Var.t();
                                try {
                                    this.f119232d = Integer.valueOf(f.p(t6Var.n()));
                                } catch (IllegalArgumentException unused) {
                                    t6Var.o(iT);
                                    n(t6Var, iA);
                                }
                                break;
                            case 26:
                                e3.a.y.e eVarBuild = (e3.a.y.e) t6Var.b(e3.a.y.e.B());
                                e3.a.y.e eVar = this.f119233e;
                                if (eVar != null) {
                                    eVarBuild = eVar.r1().l(eVarBuild).build();
                                }
                                this.f119233e = eVarBuild;
                                break;
                            case 34:
                                if (this.f119234f == null) {
                                    this.f119234f = new C1089a();
                                }
                                t6Var.e(this.f119234f);
                                break;
                            case 42:
                                int iA2 = e7.a(t6Var, 42);
                                String[] strArr = this.f119235g;
                                int length = strArr == null ? 0 : strArr.length;
                                int i10 = iA2 + length;
                                String[] strArr2 = new String[i10];
                                if (length != 0) {
                                    System.arraycopy(strArr, 0, strArr2, 0, length);
                                }
                                while (length < i10 - 1) {
                                    strArr2[length] = t6Var.l();
                                    t6Var.a();
                                    length++;
                                }
                                strArr2[length] = t6Var.l();
                                this.f119235g = strArr2;
                                break;
                            case 50:
                                int iA3 = e7.a(t6Var, 50);
                                String[] strArr3 = this.f119236h;
                                int length2 = strArr3 == null ? 0 : strArr3.length;
                                int i11 = iA3 + length2;
                                String[] strArr4 = new String[i11];
                                if (length2 != 0) {
                                    System.arraycopy(strArr3, 0, strArr4, 0, length2);
                                }
                                while (length2 < i11 - 1) {
                                    strArr4[length2] = t6Var.l();
                                    t6Var.a();
                                    length2++;
                                }
                                strArr4[length2] = t6Var.l();
                                this.f119236h = strArr4;
                                break;
                            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                                this.f119237i = t6Var.l();
                                break;
                            case 64:
                                int iT2 = t6Var.t();
                                try {
                                    this.f119238j = Integer.valueOf(f.q(t6Var.n()));
                                } catch (IllegalArgumentException unused2) {
                                    t6Var.o(iT2);
                                    n(t6Var, iA);
                                }
                                break;
                            case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                                this.f119239k = t6Var.l();
                                break;
                            case 80:
                                this.f119240l = Integer.valueOf(t6Var.n());
                                break;
                            case 90:
                                int iA4 = e7.a(t6Var, 90);
                                String[] strArr5 = this.f119241m;
                                int length3 = strArr5 == null ? 0 : strArr5.length;
                                int i12 = iA4 + length3;
                                String[] strArr6 = new String[i12];
                                if (length3 != 0) {
                                    System.arraycopy(strArr5, 0, strArr6, 0, length3);
                                }
                                while (length3 < i12 - 1) {
                                    strArr6[length3] = t6Var.l();
                                    t6Var.a();
                                    length3++;
                                }
                                strArr6[length3] = t6Var.l();
                                this.f119241m = strArr6;
                                break;
                            default:
                                if (!super.n(t6Var, iA)) {
                                }
                                break;
                        }
                    }
                    return this;
                }
            }

            public f() {
                r();
            }

            public static int p(int i10) {
                if ((i10 < 0 || i10 > 10) && ((i10 < 1000 || i10 > 1001) && ((i10 < 2000 || i10 > 2001) && (i10 < 3000 || i10 > 3002)))) {
                    StringBuilder sb2 = new StringBuilder(49);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum KeyboardEventType");
                    throw new IllegalArgumentException(sb2.toString());
                }
                return i10;
            }

            public static int q(int i10) {
                if (i10 >= 0 && i10 <= 1) {
                    return i10;
                }
                StringBuilder sb2 = new StringBuilder(49);
                sb2.append(i10);
                sb2.append(" is not a valid enum KeyboardInputType");
                throw new IllegalArgumentException(sb2.toString());
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                C1097a[] c1097aArr = this.f119229c;
                if (c1097aArr != null && c1097aArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        C1097a[] c1097aArr2 = this.f119229c;
                        if (i10 >= c1097aArr2.length) {
                            break;
                        }
                        C1097a c1097a = c1097aArr2[i10];
                        if (c1097a != null) {
                            iB += u6.t(2, c1097a);
                        }
                        i10++;
                    }
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                C1097a[] c1097aArr = this.f119229c;
                if (c1097aArr != null && c1097aArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        C1097a[] c1097aArr2 = this.f119229c;
                        if (i10 >= c1097aArr2.length) {
                            break;
                        }
                        C1097a c1097a = c1097aArr2[i10];
                        if (c1097a != null) {
                            u6Var.l(2, c1097a);
                        }
                        i10++;
                    }
                }
                super.k(u6Var);
            }

            public final f r() {
                this.f119229c = C1097a.r();
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final f l() {
                try {
                    f fVar = (f) super.l();
                    C1097a[] c1097aArr = this.f119229c;
                    if (c1097aArr != null && c1097aArr.length > 0) {
                        fVar.f119229c = new C1097a[c1097aArr.length];
                        int i10 = 0;
                        while (true) {
                            C1097a[] c1097aArr2 = this.f119229c;
                            if (i10 >= c1097aArr2.length) {
                                break;
                            }
                            C1097a c1097a = c1097aArr2[i10];
                            if (c1097a != null) {
                                fVar.f119229c[i10] = c1097a.l();
                            }
                            i10++;
                        }
                    }
                    return fVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final f e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 18) {
                        int iA2 = e7.a(t6Var, 18);
                        C1097a[] c1097aArr = this.f119229c;
                        int length = c1097aArr == null ? 0 : c1097aArr.length;
                        int i10 = iA2 + length;
                        C1097a[] c1097aArr2 = new C1097a[i10];
                        if (length != 0) {
                            System.arraycopy(c1097aArr, 0, c1097aArr2, 0, length);
                        }
                        while (length < i10 - 1) {
                            C1097a c1097a = new C1097a();
                            c1097aArr2[length] = c1097a;
                            t6Var.e(c1097a);
                            t6Var.a();
                            length++;
                        }
                        C1097a c1097a2 = new C1097a();
                        c1097aArr2[length] = c1097a2;
                        t6Var.e(c1097a2);
                        this.f119229c = c1097aArr2;
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$g */
        public static final class g extends w6<g> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Integer f119242c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Integer f119243d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Boolean f119244e;

            public g() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Integer num = this.f119242c;
                if (num != null) {
                    iB += u6.r(1, num.intValue());
                }
                Integer num2 = this.f119243d;
                if (num2 != null) {
                    iB += u6.r(2, num2.intValue());
                }
                Boolean bool = this.f119244e;
                if (bool == null) {
                    return iB;
                }
                bool.getClass();
                return iB + u6.q(3) + 1;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Integer num = this.f119242c;
                if (num != null) {
                    u6Var.i(1, num.intValue());
                }
                Integer num2 = this.f119243d;
                if (num2 != null) {
                    u6Var.i(2, num2.intValue());
                }
                Boolean bool = this.f119244e;
                if (bool != null) {
                    u6Var.n(3, bool.booleanValue());
                }
                super.k(u6Var);
            }

            public final g p() {
                this.f119242c = null;
                this.f119243d = null;
                this.f119244e = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final g l() {
                try {
                    return (g) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final g e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 8) {
                        this.f119242c = Integer.valueOf(t6Var.n());
                    } else if (iA == 16) {
                        this.f119243d = Integer.valueOf(t6Var.n());
                    } else if (iA == 24) {
                        this.f119244e = Boolean.valueOf(t6Var.k());
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$h */
        public static final class h extends w6<h> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Integer f119245c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Integer f119246d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f119247e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public C1098a f119248f;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$h$a, reason: collision with other inner class name */
            public static final class C1098a extends w6<C1098a> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.b0.b.EnumC1251a f119249c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119250d;

                public C1098a() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.b0.b.EnumC1251a enumC1251a = this.f119249c;
                    if (enumC1251a != null && enumC1251a != null) {
                        iB += u6.r(1, enumC1251a.i());
                    }
                    Long l10 = this.f119250d;
                    return l10 != null ? iB + u6.s(2, l10.longValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.b0.b.EnumC1251a enumC1251a = this.f119249c;
                    if (enumC1251a != null && enumC1251a != null) {
                        u6Var.i(1, enumC1251a.i());
                    }
                    Long l10 = this.f119250d;
                    if (l10 != null) {
                        u6Var.j(2, l10.longValue());
                    }
                    super.k(u6Var);
                }

                public final C1098a p() {
                    this.f119249c = null;
                    this.f119250d = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1098a l() {
                    try {
                        return (C1098a) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1098a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA != 0) {
                            if (iA == 8) {
                                int iT = t6Var.t();
                                int iN = t6Var.n();
                                switch (iN) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f119249c = e3.a.b0.b.EnumC1251a.b(iN);
                                        break;
                                    default:
                                        t6Var.o(iT);
                                        n(t6Var, iA);
                                        break;
                                }
                            } else if (iA == 16) {
                                this.f119250d = Long.valueOf(t6Var.p());
                            } else if (!super.n(t6Var, iA)) {
                            }
                        }
                    }
                    return this;
                }
            }

            public h() {
                q();
            }

            public static int p(int i10) {
                if ((i10 >= 0 && i10 <= 1) || ((i10 >= 1000 && i10 <= 1008) || ((i10 >= 2000 && i10 <= 2021) || (i10 >= 3000 && i10 <= 3014)))) {
                    return i10;
                }
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append(i10);
                sb2.append(" is not a valid enum UiElement");
                throw new IllegalArgumentException(sb2.toString());
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Integer num = this.f119245c;
                if (num != null) {
                    iB += u6.r(1, num.intValue());
                }
                Integer num2 = this.f119246d;
                if (num2 != null) {
                    iB += u6.r(2, num2.intValue());
                }
                String str = this.f119247e;
                if (str != null) {
                    iB += u6.u(3, str);
                }
                C1098a c1098a = this.f119248f;
                if (c1098a != null) {
                    iB += u6.t(4, c1098a);
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Integer num = this.f119245c;
                if (num != null) {
                    u6Var.i(1, num.intValue());
                }
                Integer num2 = this.f119246d;
                if (num2 != null) {
                    u6Var.i(2, num2.intValue());
                }
                String str = this.f119247e;
                if (str != null) {
                    u6Var.m(3, str);
                }
                C1098a c1098a = this.f119248f;
                if (c1098a != null) {
                    u6Var.l(4, c1098a);
                }
                super.k(u6Var);
            }

            public final h q() {
                this.f119245c = null;
                this.f119246d = null;
                this.f119247e = null;
                this.f119248f = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final h l() {
                try {
                    h hVar = (h) super.l();
                    C1098a c1098a = this.f119248f;
                    if (c1098a != null) {
                        hVar.f119248f = c1098a.l();
                    }
                    return hVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final h e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 8) {
                        int iT = t6Var.t();
                        try {
                            this.f119245c = Integer.valueOf(p(t6Var.n()));
                        } catch (IllegalArgumentException unused) {
                            t6Var.o(iT);
                            n(t6Var, iA);
                        }
                    } else if (iA == 16) {
                        this.f119246d = Integer.valueOf(t6Var.n());
                    } else if (iA == 26) {
                        this.f119247e = t6Var.l();
                    } else if (iA == 34) {
                        if (this.f119248f == null) {
                            this.f119248f = new C1098a();
                        }
                        t6Var.e(this.f119248f);
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$i */
        public static final class i extends w6<i> implements Cloneable {
            public Integer H1;
            public float[] X;
            public float[] Y;
            public float[] Z;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Integer f119251c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public e3.a.w[] f119252d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Integer f119253e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Float f119254f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Float f119255g;

            /* JADX INFO: renamed from: g3, reason: collision with root package name */
            public C1099a[] f119256g3;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Float f119257h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public o f119258i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public e3.a.w[] f119259j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public e3.a.w[] f119260k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public e3.a.w[] f119261l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public e3.a.w[] f119262m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public e3.a.w[] f119263n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public e3.a.w[] f119264o;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Float f119265p0;

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            public Float f119266p1;

            /* JADX INFO: renamed from: p2, reason: collision with root package name */
            public Integer f119267p2;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Integer f119268s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public float[] f119269t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public float[] f119270v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public float[] f119271w;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$i$a, reason: collision with other inner class name */
            public static final class C1099a extends w6<C1099a> implements Cloneable {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static volatile C1099a[] f119272f;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119273c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Integer f119274d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119275e;

                public C1099a() {
                    p();
                }

                public static C1099a[] r() {
                    if (f119272f == null) {
                        synchronized (a7.f127704b) {
                            try {
                                if (f119272f == null) {
                                    f119272f = new C1099a[0];
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return f119272f;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119273c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Integer num2 = this.f119274d;
                    if (num2 != null) {
                        iB += u6.r(2, num2.intValue());
                    }
                    Long l10 = this.f119275e;
                    return l10 != null ? iB + u6.s(3, l10.longValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119273c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Integer num2 = this.f119274d;
                    if (num2 != null) {
                        u6Var.i(2, num2.intValue());
                    }
                    Long l10 = this.f119275e;
                    if (l10 != null) {
                        u6Var.j(3, l10.longValue());
                    }
                    super.k(u6Var);
                }

                public final C1099a p() {
                    this.f119273c = null;
                    this.f119274d = null;
                    this.f119275e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1099a l() {
                    try {
                        return (C1099a) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C1099a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119273c = Integer.valueOf(t6Var.n());
                        } else if (iA == 16) {
                            this.f119274d = Integer.valueOf(t6Var.n());
                        } else if (iA == 24) {
                            this.f119275e = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public i() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Integer num = this.f119251c;
                if (num != null) {
                    iB += u6.r(1, num.intValue());
                }
                e3.a.w[] wVarArr = this.f119252d;
                int i10 = 0;
                if (wVarArr != null && wVarArr.length > 0) {
                    int i11 = 0;
                    while (true) {
                        e3.a.w[] wVarArr2 = this.f119252d;
                        if (i11 >= wVarArr2.length) {
                            break;
                        }
                        e3.a.w wVar = wVarArr2[i11];
                        if (wVar != null) {
                            iB += t2.V(2, wVar);
                        }
                        i11++;
                    }
                }
                Integer num2 = this.f119253e;
                if (num2 != null) {
                    iB += u6.r(3, num2.intValue());
                }
                Float f10 = this.f119254f;
                if (f10 != null) {
                    f10.getClass();
                    iB += u6.q(4) + 4;
                }
                Float f11 = this.f119255g;
                if (f11 != null) {
                    f11.getClass();
                    iB += u6.q(5) + 4;
                }
                Float f12 = this.f119257h;
                if (f12 != null) {
                    f12.getClass();
                    iB += u6.q(6) + 4;
                }
                o oVar = this.f119258i;
                if (oVar != null) {
                    iB += u6.t(7, oVar);
                }
                e3.a.w[] wVarArr3 = this.f119259j;
                if (wVarArr3 != null && wVarArr3.length > 0) {
                    int i12 = 0;
                    while (true) {
                        e3.a.w[] wVarArr4 = this.f119259j;
                        if (i12 >= wVarArr4.length) {
                            break;
                        }
                        e3.a.w wVar2 = wVarArr4[i12];
                        if (wVar2 != null) {
                            iB += t2.V(8, wVar2);
                        }
                        i12++;
                    }
                }
                e3.a.w[] wVarArr5 = this.f119260k;
                if (wVarArr5 != null && wVarArr5.length > 0) {
                    int i13 = 0;
                    while (true) {
                        e3.a.w[] wVarArr6 = this.f119260k;
                        if (i13 >= wVarArr6.length) {
                            break;
                        }
                        e3.a.w wVar3 = wVarArr6[i13];
                        if (wVar3 != null) {
                            iB += t2.V(9, wVar3);
                        }
                        i13++;
                    }
                }
                e3.a.w[] wVarArr7 = this.f119261l;
                if (wVarArr7 != null && wVarArr7.length > 0) {
                    int i14 = 0;
                    while (true) {
                        e3.a.w[] wVarArr8 = this.f119261l;
                        if (i14 >= wVarArr8.length) {
                            break;
                        }
                        e3.a.w wVar4 = wVarArr8[i14];
                        if (wVar4 != null) {
                            iB += t2.V(10, wVar4);
                        }
                        i14++;
                    }
                }
                e3.a.w[] wVarArr9 = this.f119262m;
                if (wVarArr9 != null && wVarArr9.length > 0) {
                    int i15 = 0;
                    while (true) {
                        e3.a.w[] wVarArr10 = this.f119262m;
                        if (i15 >= wVarArr10.length) {
                            break;
                        }
                        e3.a.w wVar5 = wVarArr10[i15];
                        if (wVar5 != null) {
                            iB += t2.V(11, wVar5);
                        }
                        i15++;
                    }
                }
                e3.a.w[] wVarArr11 = this.f119263n;
                if (wVarArr11 != null && wVarArr11.length > 0) {
                    int i16 = 0;
                    while (true) {
                        e3.a.w[] wVarArr12 = this.f119263n;
                        if (i16 >= wVarArr12.length) {
                            break;
                        }
                        e3.a.w wVar6 = wVarArr12[i16];
                        if (wVar6 != null) {
                            iB += t2.V(12, wVar6);
                        }
                        i16++;
                    }
                }
                e3.a.w[] wVarArr13 = this.f119264o;
                if (wVarArr13 != null && wVarArr13.length > 0) {
                    int i17 = 0;
                    while (true) {
                        e3.a.w[] wVarArr14 = this.f119264o;
                        if (i17 >= wVarArr14.length) {
                            break;
                        }
                        e3.a.w wVar7 = wVarArr14[i17];
                        if (wVar7 != null) {
                            iB += t2.V(13, wVar7);
                        }
                        i17++;
                    }
                }
                Integer num3 = this.f119268s;
                if (num3 != null) {
                    iB += u6.r(14, num3.intValue());
                }
                float[] fArr = this.f119269t;
                if (fArr != null && fArr.length > 0) {
                    iB = iB + (fArr.length * 4) + fArr.length;
                }
                float[] fArr2 = this.f119270v;
                if (fArr2 != null && fArr2.length > 0) {
                    iB = iB + (fArr2.length * 4) + (fArr2.length * 2);
                }
                float[] fArr3 = this.f119271w;
                if (fArr3 != null && fArr3.length > 0) {
                    iB = iB + (fArr3.length * 4) + (fArr3.length * 2);
                }
                float[] fArr4 = this.X;
                if (fArr4 != null && fArr4.length > 0) {
                    iB = iB + (fArr4.length * 4) + (fArr4.length * 2);
                }
                float[] fArr5 = this.Y;
                if (fArr5 != null && fArr5.length > 0) {
                    iB = iB + (fArr5.length * 4) + (fArr5.length * 2);
                }
                float[] fArr6 = this.Z;
                if (fArr6 != null && fArr6.length > 0) {
                    iB = iB + (fArr6.length * 4) + (fArr6.length * 2);
                }
                Float f13 = this.f119265p0;
                if (f13 != null) {
                    f13.getClass();
                    iB += u6.q(21) + 4;
                }
                Float f14 = this.f119266p1;
                if (f14 != null) {
                    f14.getClass();
                    iB += u6.q(22) + 4;
                }
                Integer num4 = this.H1;
                if (num4 != null) {
                    iB += u6.r(23, num4.intValue());
                }
                Integer num5 = this.f119267p2;
                if (num5 != null) {
                    iB += u6.r(24, num5.intValue());
                }
                C1099a[] c1099aArr = this.f119256g3;
                if (c1099aArr != null && c1099aArr.length > 0) {
                    while (true) {
                        C1099a[] c1099aArr2 = this.f119256g3;
                        if (i10 >= c1099aArr2.length) {
                            break;
                        }
                        C1099a c1099a = c1099aArr2[i10];
                        if (c1099a != null) {
                            iB += u6.t(25, c1099a);
                        }
                        i10++;
                    }
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Integer num = this.f119251c;
                if (num != null) {
                    u6Var.i(1, num.intValue());
                }
                e3.a.w[] wVarArr = this.f119252d;
                int i10 = 0;
                if (wVarArr != null && wVarArr.length > 0) {
                    int i11 = 0;
                    while (true) {
                        e3.a.w[] wVarArr2 = this.f119252d;
                        if (i11 >= wVarArr2.length) {
                            break;
                        }
                        e3.a.w wVar = wVarArr2[i11];
                        if (wVar != null) {
                            u6Var.k(2, wVar);
                        }
                        i11++;
                    }
                }
                Integer num2 = this.f119253e;
                if (num2 != null) {
                    u6Var.i(3, num2.intValue());
                }
                Float f10 = this.f119254f;
                if (f10 != null) {
                    u6Var.h(4, f10.floatValue());
                }
                Float f11 = this.f119255g;
                if (f11 != null) {
                    u6Var.h(5, f11.floatValue());
                }
                Float f12 = this.f119257h;
                if (f12 != null) {
                    u6Var.h(6, f12.floatValue());
                }
                o oVar = this.f119258i;
                if (oVar != null) {
                    u6Var.l(7, oVar);
                }
                e3.a.w[] wVarArr3 = this.f119259j;
                if (wVarArr3 != null && wVarArr3.length > 0) {
                    int i12 = 0;
                    while (true) {
                        e3.a.w[] wVarArr4 = this.f119259j;
                        if (i12 >= wVarArr4.length) {
                            break;
                        }
                        e3.a.w wVar2 = wVarArr4[i12];
                        if (wVar2 != null) {
                            u6Var.k(8, wVar2);
                        }
                        i12++;
                    }
                }
                e3.a.w[] wVarArr5 = this.f119260k;
                if (wVarArr5 != null && wVarArr5.length > 0) {
                    int i13 = 0;
                    while (true) {
                        e3.a.w[] wVarArr6 = this.f119260k;
                        if (i13 >= wVarArr6.length) {
                            break;
                        }
                        e3.a.w wVar3 = wVarArr6[i13];
                        if (wVar3 != null) {
                            u6Var.k(9, wVar3);
                        }
                        i13++;
                    }
                }
                e3.a.w[] wVarArr7 = this.f119261l;
                if (wVarArr7 != null && wVarArr7.length > 0) {
                    int i14 = 0;
                    while (true) {
                        e3.a.w[] wVarArr8 = this.f119261l;
                        if (i14 >= wVarArr8.length) {
                            break;
                        }
                        e3.a.w wVar4 = wVarArr8[i14];
                        if (wVar4 != null) {
                            u6Var.k(10, wVar4);
                        }
                        i14++;
                    }
                }
                e3.a.w[] wVarArr9 = this.f119262m;
                if (wVarArr9 != null && wVarArr9.length > 0) {
                    int i15 = 0;
                    while (true) {
                        e3.a.w[] wVarArr10 = this.f119262m;
                        if (i15 >= wVarArr10.length) {
                            break;
                        }
                        e3.a.w wVar5 = wVarArr10[i15];
                        if (wVar5 != null) {
                            u6Var.k(11, wVar5);
                        }
                        i15++;
                    }
                }
                e3.a.w[] wVarArr11 = this.f119263n;
                if (wVarArr11 != null && wVarArr11.length > 0) {
                    int i16 = 0;
                    while (true) {
                        e3.a.w[] wVarArr12 = this.f119263n;
                        if (i16 >= wVarArr12.length) {
                            break;
                        }
                        e3.a.w wVar6 = wVarArr12[i16];
                        if (wVar6 != null) {
                            u6Var.k(12, wVar6);
                        }
                        i16++;
                    }
                }
                e3.a.w[] wVarArr13 = this.f119264o;
                if (wVarArr13 != null && wVarArr13.length > 0) {
                    int i17 = 0;
                    while (true) {
                        e3.a.w[] wVarArr14 = this.f119264o;
                        if (i17 >= wVarArr14.length) {
                            break;
                        }
                        e3.a.w wVar7 = wVarArr14[i17];
                        if (wVar7 != null) {
                            u6Var.k(13, wVar7);
                        }
                        i17++;
                    }
                }
                Integer num3 = this.f119268s;
                if (num3 != null) {
                    u6Var.i(14, num3.intValue());
                }
                float[] fArr = this.f119269t;
                if (fArr != null && fArr.length > 0) {
                    int i18 = 0;
                    while (true) {
                        float[] fArr2 = this.f119269t;
                        if (i18 >= fArr2.length) {
                            break;
                        }
                        u6Var.h(15, fArr2[i18]);
                        i18++;
                    }
                }
                float[] fArr3 = this.f119270v;
                if (fArr3 != null && fArr3.length > 0) {
                    int i19 = 0;
                    while (true) {
                        float[] fArr4 = this.f119270v;
                        if (i19 >= fArr4.length) {
                            break;
                        }
                        u6Var.h(16, fArr4[i19]);
                        i19++;
                    }
                }
                float[] fArr5 = this.f119271w;
                if (fArr5 != null && fArr5.length > 0) {
                    int i20 = 0;
                    while (true) {
                        float[] fArr6 = this.f119271w;
                        if (i20 >= fArr6.length) {
                            break;
                        }
                        u6Var.h(17, fArr6[i20]);
                        i20++;
                    }
                }
                float[] fArr7 = this.X;
                if (fArr7 != null && fArr7.length > 0) {
                    int i21 = 0;
                    while (true) {
                        float[] fArr8 = this.X;
                        if (i21 >= fArr8.length) {
                            break;
                        }
                        u6Var.h(18, fArr8[i21]);
                        i21++;
                    }
                }
                float[] fArr9 = this.Y;
                if (fArr9 != null && fArr9.length > 0) {
                    int i22 = 0;
                    while (true) {
                        float[] fArr10 = this.Y;
                        if (i22 >= fArr10.length) {
                            break;
                        }
                        u6Var.h(19, fArr10[i22]);
                        i22++;
                    }
                }
                float[] fArr11 = this.Z;
                if (fArr11 != null && fArr11.length > 0) {
                    int i23 = 0;
                    while (true) {
                        float[] fArr12 = this.Z;
                        if (i23 >= fArr12.length) {
                            break;
                        }
                        u6Var.h(20, fArr12[i23]);
                        i23++;
                    }
                }
                Float f13 = this.f119265p0;
                if (f13 != null) {
                    u6Var.h(21, f13.floatValue());
                }
                Float f14 = this.f119266p1;
                if (f14 != null) {
                    u6Var.h(22, f14.floatValue());
                }
                Integer num4 = this.H1;
                if (num4 != null) {
                    u6Var.i(23, num4.intValue());
                }
                Integer num5 = this.f119267p2;
                if (num5 != null) {
                    u6Var.i(24, num5.intValue());
                }
                C1099a[] c1099aArr = this.f119256g3;
                if (c1099aArr != null && c1099aArr.length > 0) {
                    while (true) {
                        C1099a[] c1099aArr2 = this.f119256g3;
                        if (i10 >= c1099aArr2.length) {
                            break;
                        }
                        C1099a c1099a = c1099aArr2[i10];
                        if (c1099a != null) {
                            u6Var.l(25, c1099a);
                        }
                        i10++;
                    }
                }
                super.k(u6Var);
            }

            public final i p() {
                this.f119251c = null;
                this.f119252d = new e3.a.w[0];
                this.f119253e = null;
                this.f119254f = null;
                this.f119255g = null;
                this.f119257h = null;
                this.f119258i = null;
                this.f119259j = new e3.a.w[0];
                this.f119260k = new e3.a.w[0];
                this.f119261l = new e3.a.w[0];
                this.f119262m = new e3.a.w[0];
                this.f119263n = new e3.a.w[0];
                this.f119264o = new e3.a.w[0];
                this.f119268s = null;
                float[] fArr = e7.f129361b;
                this.f119269t = fArr;
                this.f119270v = fArr;
                this.f119271w = fArr;
                this.X = fArr;
                this.Y = fArr;
                this.Z = fArr;
                this.f119265p0 = null;
                this.f119266p1 = null;
                this.H1 = null;
                this.f119267p2 = null;
                this.f119256g3 = C1099a.r();
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final i l() {
                try {
                    i iVar = (i) super.l();
                    e3.a.w[] wVarArr = this.f119252d;
                    int i10 = 0;
                    if (wVarArr != null && wVarArr.length > 0) {
                        iVar.f119252d = new e3.a.w[wVarArr.length];
                        int i11 = 0;
                        while (true) {
                            e3.a.w[] wVarArr2 = this.f119252d;
                            if (i11 >= wVarArr2.length) {
                                break;
                            }
                            e3.a.w wVar = wVarArr2[i11];
                            if (wVar != null) {
                                iVar.f119252d[i11] = wVar;
                            }
                            i11++;
                        }
                    }
                    o oVar = this.f119258i;
                    if (oVar != null) {
                        iVar.f119258i = oVar.l();
                    }
                    e3.a.w[] wVarArr3 = this.f119259j;
                    if (wVarArr3 != null && wVarArr3.length > 0) {
                        iVar.f119259j = new e3.a.w[wVarArr3.length];
                        int i12 = 0;
                        while (true) {
                            e3.a.w[] wVarArr4 = this.f119259j;
                            if (i12 >= wVarArr4.length) {
                                break;
                            }
                            e3.a.w wVar2 = wVarArr4[i12];
                            if (wVar2 != null) {
                                iVar.f119259j[i12] = wVar2;
                            }
                            i12++;
                        }
                    }
                    e3.a.w[] wVarArr5 = this.f119260k;
                    if (wVarArr5 != null && wVarArr5.length > 0) {
                        iVar.f119260k = new e3.a.w[wVarArr5.length];
                        int i13 = 0;
                        while (true) {
                            e3.a.w[] wVarArr6 = this.f119260k;
                            if (i13 >= wVarArr6.length) {
                                break;
                            }
                            e3.a.w wVar3 = wVarArr6[i13];
                            if (wVar3 != null) {
                                iVar.f119260k[i13] = wVar3;
                            }
                            i13++;
                        }
                    }
                    e3.a.w[] wVarArr7 = this.f119261l;
                    if (wVarArr7 != null && wVarArr7.length > 0) {
                        iVar.f119261l = new e3.a.w[wVarArr7.length];
                        int i14 = 0;
                        while (true) {
                            e3.a.w[] wVarArr8 = this.f119261l;
                            if (i14 >= wVarArr8.length) {
                                break;
                            }
                            e3.a.w wVar4 = wVarArr8[i14];
                            if (wVar4 != null) {
                                iVar.f119261l[i14] = wVar4;
                            }
                            i14++;
                        }
                    }
                    e3.a.w[] wVarArr9 = this.f119262m;
                    if (wVarArr9 != null && wVarArr9.length > 0) {
                        iVar.f119262m = new e3.a.w[wVarArr9.length];
                        int i15 = 0;
                        while (true) {
                            e3.a.w[] wVarArr10 = this.f119262m;
                            if (i15 >= wVarArr10.length) {
                                break;
                            }
                            e3.a.w wVar5 = wVarArr10[i15];
                            if (wVar5 != null) {
                                iVar.f119262m[i15] = wVar5;
                            }
                            i15++;
                        }
                    }
                    e3.a.w[] wVarArr11 = this.f119263n;
                    if (wVarArr11 != null && wVarArr11.length > 0) {
                        iVar.f119263n = new e3.a.w[wVarArr11.length];
                        int i16 = 0;
                        while (true) {
                            e3.a.w[] wVarArr12 = this.f119263n;
                            if (i16 >= wVarArr12.length) {
                                break;
                            }
                            e3.a.w wVar6 = wVarArr12[i16];
                            if (wVar6 != null) {
                                iVar.f119263n[i16] = wVar6;
                            }
                            i16++;
                        }
                    }
                    e3.a.w[] wVarArr13 = this.f119264o;
                    if (wVarArr13 != null && wVarArr13.length > 0) {
                        iVar.f119264o = new e3.a.w[wVarArr13.length];
                        int i17 = 0;
                        while (true) {
                            e3.a.w[] wVarArr14 = this.f119264o;
                            if (i17 >= wVarArr14.length) {
                                break;
                            }
                            e3.a.w wVar7 = wVarArr14[i17];
                            if (wVar7 != null) {
                                iVar.f119264o[i17] = wVar7;
                            }
                            i17++;
                        }
                    }
                    float[] fArr = this.f119269t;
                    if (fArr != null && fArr.length > 0) {
                        iVar.f119269t = (float[]) fArr.clone();
                    }
                    float[] fArr2 = this.f119270v;
                    if (fArr2 != null && fArr2.length > 0) {
                        iVar.f119270v = (float[]) fArr2.clone();
                    }
                    float[] fArr3 = this.f119271w;
                    if (fArr3 != null && fArr3.length > 0) {
                        iVar.f119271w = (float[]) fArr3.clone();
                    }
                    float[] fArr4 = this.X;
                    if (fArr4 != null && fArr4.length > 0) {
                        iVar.X = (float[]) fArr4.clone();
                    }
                    float[] fArr5 = this.Y;
                    if (fArr5 != null && fArr5.length > 0) {
                        iVar.Y = (float[]) fArr5.clone();
                    }
                    float[] fArr6 = this.Z;
                    if (fArr6 != null && fArr6.length > 0) {
                        iVar.Z = (float[]) fArr6.clone();
                    }
                    C1099a[] c1099aArr = this.f119256g3;
                    if (c1099aArr != null && c1099aArr.length > 0) {
                        iVar.f119256g3 = new C1099a[c1099aArr.length];
                        while (true) {
                            C1099a[] c1099aArr2 = this.f119256g3;
                            if (i10 >= c1099aArr2.length) {
                                break;
                            }
                            C1099a c1099a = c1099aArr2[i10];
                            if (c1099a != null) {
                                iVar.f119256g3[i10] = c1099a.l();
                            }
                            i10++;
                        }
                    }
                    return iVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final i e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    switch (iA) {
                        case 0:
                            break;
                        case 8:
                            this.f119251c = Integer.valueOf(t6Var.n());
                            continue;
                        case 18:
                            int iA2 = e7.a(t6Var, 18);
                            e3.a.w[] wVarArr = this.f119252d;
                            int length = wVarArr == null ? 0 : wVarArr.length;
                            int i10 = iA2 + length;
                            e3.a.w[] wVarArr2 = new e3.a.w[i10];
                            if (length != 0) {
                                System.arraycopy(wVarArr, 0, wVarArr2, 0, length);
                            }
                            while (length < i10 - 1) {
                                wVarArr2[length] = (e3.a.w) t6Var.b(e3.a.w.B());
                                t6Var.a();
                                length++;
                            }
                            wVarArr2[length] = (e3.a.w) t6Var.b(e3.a.w.B());
                            this.f119252d = wVarArr2;
                            continue;
                        case 24:
                            this.f119253e = Integer.valueOf(t6Var.n());
                            continue;
                        case 37:
                            this.f119254f = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                            continue;
                        case 45:
                            this.f119255g = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                            continue;
                        case 53:
                            this.f119257h = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                            continue;
                        case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                            if (this.f119258i == null) {
                                this.f119258i = new o();
                            }
                            t6Var.e(this.f119258i);
                            continue;
                        case 66:
                            int iA3 = e7.a(t6Var, 66);
                            e3.a.w[] wVarArr3 = this.f119259j;
                            int length2 = wVarArr3 == null ? 0 : wVarArr3.length;
                            int i11 = iA3 + length2;
                            e3.a.w[] wVarArr4 = new e3.a.w[i11];
                            if (length2 != 0) {
                                System.arraycopy(wVarArr3, 0, wVarArr4, 0, length2);
                            }
                            while (length2 < i11 - 1) {
                                wVarArr4[length2] = (e3.a.w) t6Var.b(e3.a.w.B());
                                t6Var.a();
                                length2++;
                            }
                            wVarArr4[length2] = (e3.a.w) t6Var.b(e3.a.w.B());
                            this.f119259j = wVarArr4;
                            continue;
                        case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                            int iA4 = e7.a(t6Var, 74);
                            e3.a.w[] wVarArr5 = this.f119260k;
                            int length3 = wVarArr5 == null ? 0 : wVarArr5.length;
                            int i12 = iA4 + length3;
                            e3.a.w[] wVarArr6 = new e3.a.w[i12];
                            if (length3 != 0) {
                                System.arraycopy(wVarArr5, 0, wVarArr6, 0, length3);
                            }
                            while (length3 < i12 - 1) {
                                wVarArr6[length3] = (e3.a.w) t6Var.b(e3.a.w.B());
                                t6Var.a();
                                length3++;
                            }
                            wVarArr6[length3] = (e3.a.w) t6Var.b(e3.a.w.B());
                            this.f119260k = wVarArr6;
                            continue;
                        case com.planner5d.library.engine.input.f.b.f160705l0 /* 82 */:
                            int iA5 = e7.a(t6Var, 82);
                            e3.a.w[] wVarArr7 = this.f119261l;
                            int length4 = wVarArr7 == null ? 0 : wVarArr7.length;
                            int i13 = iA5 + length4;
                            e3.a.w[] wVarArr8 = new e3.a.w[i13];
                            if (length4 != 0) {
                                System.arraycopy(wVarArr7, 0, wVarArr8, 0, length4);
                            }
                            while (length4 < i13 - 1) {
                                wVarArr8[length4] = (e3.a.w) t6Var.b(e3.a.w.B());
                                t6Var.a();
                                length4++;
                            }
                            wVarArr8[length4] = (e3.a.w) t6Var.b(e3.a.w.B());
                            this.f119261l = wVarArr8;
                            continue;
                        case 90:
                            int iA6 = e7.a(t6Var, 90);
                            e3.a.w[] wVarArr9 = this.f119262m;
                            int length5 = wVarArr9 == null ? 0 : wVarArr9.length;
                            int i14 = iA6 + length5;
                            e3.a.w[] wVarArr10 = new e3.a.w[i14];
                            if (length5 != 0) {
                                System.arraycopy(wVarArr9, 0, wVarArr10, 0, length5);
                            }
                            while (length5 < i14 - 1) {
                                wVarArr10[length5] = (e3.a.w) t6Var.b(e3.a.w.B());
                                t6Var.a();
                                length5++;
                            }
                            wVarArr10[length5] = (e3.a.w) t6Var.b(e3.a.w.B());
                            this.f119262m = wVarArr10;
                            continue;
                        case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                            int iA7 = e7.a(t6Var, 98);
                            e3.a.w[] wVarArr11 = this.f119263n;
                            int length6 = wVarArr11 == null ? 0 : wVarArr11.length;
                            int i15 = iA7 + length6;
                            e3.a.w[] wVarArr12 = new e3.a.w[i15];
                            if (length6 != 0) {
                                System.arraycopy(wVarArr11, 0, wVarArr12, 0, length6);
                            }
                            while (length6 < i15 - 1) {
                                wVarArr12[length6] = (e3.a.w) t6Var.b(e3.a.w.B());
                                t6Var.a();
                                length6++;
                            }
                            wVarArr12[length6] = (e3.a.w) t6Var.b(e3.a.w.B());
                            this.f119263n = wVarArr12;
                            continue;
                        case com.planner5d.library.engine.input.f.b.f160742x1 /* 106 */:
                            int iA8 = e7.a(t6Var, com.planner5d.library.engine.input.f.b.f160742x1);
                            e3.a.w[] wVarArr13 = this.f119264o;
                            int length7 = wVarArr13 == null ? 0 : wVarArr13.length;
                            int i16 = iA8 + length7;
                            e3.a.w[] wVarArr14 = new e3.a.w[i16];
                            if (length7 != 0) {
                                System.arraycopy(wVarArr13, 0, wVarArr14, 0, length7);
                            }
                            while (length7 < i16 - 1) {
                                wVarArr14[length7] = (e3.a.w) t6Var.b(e3.a.w.B());
                                t6Var.a();
                                length7++;
                            }
                            wVarArr14[length7] = (e3.a.w) t6Var.b(e3.a.w.B());
                            this.f119264o = wVarArr14;
                            continue;
                        case com.planner5d.library.engine.input.f.b.B /* 112 */:
                            this.f119268s = Integer.valueOf(t6Var.n());
                            continue;
                        case 122:
                            int iN = t6Var.n();
                            int iJ = t6Var.j(iN);
                            int i17 = iN / 4;
                            float[] fArr = this.f119269t;
                            int length8 = fArr == null ? 0 : fArr.length;
                            int i18 = i17 + length8;
                            float[] fArr2 = new float[i18];
                            if (length8 != 0) {
                                System.arraycopy(fArr, 0, fArr2, 0, length8);
                            }
                            while (length8 < i18) {
                                fArr2[length8] = Float.intBitsToFloat(t6Var.r());
                                length8++;
                            }
                            this.f119269t = fArr2;
                            t6Var.m(iJ);
                            continue;
                        case 125:
                            int iA9 = e7.a(t6Var, 125);
                            float[] fArr3 = this.f119269t;
                            int length9 = fArr3 == null ? 0 : fArr3.length;
                            int i19 = iA9 + length9;
                            float[] fArr4 = new float[i19];
                            if (length9 != 0) {
                                System.arraycopy(fArr3, 0, fArr4, 0, length9);
                            }
                            while (length9 < i19 - 1) {
                                fArr4[length9] = Float.intBitsToFloat(t6Var.r());
                                t6Var.a();
                                length9++;
                            }
                            fArr4[length9] = Float.intBitsToFloat(t6Var.r());
                            this.f119269t = fArr4;
                            continue;
                        case 130:
                            int iN2 = t6Var.n();
                            int iJ2 = t6Var.j(iN2);
                            int i20 = iN2 / 4;
                            float[] fArr5 = this.f119270v;
                            int length10 = fArr5 == null ? 0 : fArr5.length;
                            int i21 = i20 + length10;
                            float[] fArr6 = new float[i21];
                            if (length10 != 0) {
                                System.arraycopy(fArr5, 0, fArr6, 0, length10);
                            }
                            while (length10 < i21) {
                                fArr6[length10] = Float.intBitsToFloat(t6Var.r());
                                length10++;
                            }
                            this.f119270v = fArr6;
                            t6Var.m(iJ2);
                            continue;
                        case 133:
                            int iA10 = e7.a(t6Var, 133);
                            float[] fArr7 = this.f119270v;
                            int length11 = fArr7 == null ? 0 : fArr7.length;
                            int i22 = iA10 + length11;
                            float[] fArr8 = new float[i22];
                            if (length11 != 0) {
                                System.arraycopy(fArr7, 0, fArr8, 0, length11);
                            }
                            while (length11 < i22 - 1) {
                                fArr8[length11] = Float.intBitsToFloat(t6Var.r());
                                t6Var.a();
                                length11++;
                            }
                            fArr8[length11] = Float.intBitsToFloat(t6Var.r());
                            this.f119270v = fArr8;
                            continue;
                        case 138:
                            int iN3 = t6Var.n();
                            int iJ3 = t6Var.j(iN3);
                            int i23 = iN3 / 4;
                            float[] fArr9 = this.f119271w;
                            int length12 = fArr9 == null ? 0 : fArr9.length;
                            int i24 = i23 + length12;
                            float[] fArr10 = new float[i24];
                            if (length12 != 0) {
                                System.arraycopy(fArr9, 0, fArr10, 0, length12);
                            }
                            while (length12 < i24) {
                                fArr10[length12] = Float.intBitsToFloat(t6Var.r());
                                length12++;
                            }
                            this.f119271w = fArr10;
                            t6Var.m(iJ3);
                            continue;
                        case androidx.media2.widget.f.i.f59775g0 /* 141 */:
                            int iA11 = e7.a(t6Var, androidx.media2.widget.f.i.f59775g0);
                            float[] fArr11 = this.f119271w;
                            int length13 = fArr11 == null ? 0 : fArr11.length;
                            int i25 = iA11 + length13;
                            float[] fArr12 = new float[i25];
                            if (length13 != 0) {
                                System.arraycopy(fArr11, 0, fArr12, 0, length13);
                            }
                            while (length13 < i25 - 1) {
                                fArr12[length13] = Float.intBitsToFloat(t6Var.r());
                                t6Var.a();
                                length13++;
                            }
                            fArr12[length13] = Float.intBitsToFloat(t6Var.r());
                            this.f119271w = fArr12;
                            continue;
                        case 146:
                            int iN4 = t6Var.n();
                            int iJ4 = t6Var.j(iN4);
                            int i26 = iN4 / 4;
                            float[] fArr13 = this.X;
                            int length14 = fArr13 == null ? 0 : fArr13.length;
                            int i27 = i26 + length14;
                            float[] fArr14 = new float[i27];
                            if (length14 != 0) {
                                System.arraycopy(fArr13, 0, fArr14, 0, length14);
                            }
                            while (length14 < i27) {
                                fArr14[length14] = Float.intBitsToFloat(t6Var.r());
                                length14++;
                            }
                            this.X = fArr14;
                            t6Var.m(iJ4);
                            continue;
                        case com.planner5d.library.engine.input.f.b.H1 /* 149 */:
                            int iA12 = e7.a(t6Var, com.planner5d.library.engine.input.f.b.H1);
                            float[] fArr15 = this.X;
                            int length15 = fArr15 == null ? 0 : fArr15.length;
                            int i28 = iA12 + length15;
                            float[] fArr16 = new float[i28];
                            if (length15 != 0) {
                                System.arraycopy(fArr15, 0, fArr16, 0, length15);
                            }
                            while (length15 < i28 - 1) {
                                fArr16[length15] = Float.intBitsToFloat(t6Var.r());
                                t6Var.a();
                                length15++;
                            }
                            fArr16[length15] = Float.intBitsToFloat(t6Var.r());
                            this.X = fArr16;
                            continue;
                        case androidx.media2.widget.f.i.f59793p0 /* 154 */:
                            int iN5 = t6Var.n();
                            int iJ5 = t6Var.j(iN5);
                            int i29 = iN5 / 4;
                            float[] fArr17 = this.Y;
                            int length16 = fArr17 == null ? 0 : fArr17.length;
                            int i30 = i29 + length16;
                            float[] fArr18 = new float[i30];
                            if (length16 != 0) {
                                System.arraycopy(fArr17, 0, fArr18, 0, length16);
                            }
                            while (length16 < i30) {
                                fArr18[length16] = Float.intBitsToFloat(t6Var.r());
                                length16++;
                            }
                            this.Y = fArr18;
                            t6Var.m(iJ5);
                            continue;
                        case androidx.media2.widget.f.i.f59799s0 /* 157 */:
                            int iA13 = e7.a(t6Var, androidx.media2.widget.f.i.f59799s0);
                            float[] fArr19 = this.Y;
                            int length17 = fArr19 == null ? 0 : fArr19.length;
                            int i31 = iA13 + length17;
                            float[] fArr20 = new float[i31];
                            if (length17 != 0) {
                                System.arraycopy(fArr19, 0, fArr20, 0, length17);
                            }
                            while (length17 < i31 - 1) {
                                fArr20[length17] = Float.intBitsToFloat(t6Var.r());
                                t6Var.a();
                                length17++;
                            }
                            fArr20[length17] = Float.intBitsToFloat(t6Var.r());
                            this.Y = fArr20;
                            continue;
                        case 162:
                            int iN6 = t6Var.n();
                            int iJ6 = t6Var.j(iN6);
                            int i32 = iN6 / 4;
                            float[] fArr21 = this.Z;
                            int length18 = fArr21 == null ? 0 : fArr21.length;
                            int i33 = i32 + length18;
                            float[] fArr22 = new float[i33];
                            if (length18 != 0) {
                                System.arraycopy(fArr21, 0, fArr22, 0, length18);
                            }
                            while (length18 < i33) {
                                fArr22[length18] = Float.intBitsToFloat(t6Var.r());
                                length18++;
                            }
                            this.Z = fArr22;
                            t6Var.m(iJ6);
                            continue;
                        case 165:
                            int iA14 = e7.a(t6Var, 165);
                            float[] fArr23 = this.Z;
                            int length19 = fArr23 == null ? 0 : fArr23.length;
                            int i34 = iA14 + length19;
                            float[] fArr24 = new float[i34];
                            if (length19 != 0) {
                                System.arraycopy(fArr23, 0, fArr24, 0, length19);
                            }
                            while (length19 < i34 - 1) {
                                fArr24[length19] = Float.intBitsToFloat(t6Var.r());
                                t6Var.a();
                                length19++;
                            }
                            fArr24[length19] = Float.intBitsToFloat(t6Var.r());
                            this.Z = fArr24;
                            continue;
                        case 173:
                            this.f119265p0 = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                            continue;
                        case 181:
                            this.f119266p1 = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                            continue;
                        case 184:
                            this.H1 = Integer.valueOf(t6Var.n());
                            continue;
                        case 192:
                            this.f119267p2 = Integer.valueOf(t6Var.n());
                            continue;
                        case 202:
                            int iA15 = e7.a(t6Var, 202);
                            C1099a[] c1099aArr = this.f119256g3;
                            int length20 = c1099aArr == null ? 0 : c1099aArr.length;
                            int i35 = iA15 + length20;
                            C1099a[] c1099aArr2 = new C1099a[i35];
                            if (length20 != 0) {
                                System.arraycopy(c1099aArr, 0, c1099aArr2, 0, length20);
                            }
                            while (length20 < i35 - 1) {
                                C1099a c1099a = new C1099a();
                                c1099aArr2[length20] = c1099a;
                                t6Var.e(c1099a);
                                t6Var.a();
                                length20++;
                            }
                            C1099a c1099a2 = new C1099a();
                            c1099aArr2[length20] = c1099a2;
                            t6Var.e(c1099a2);
                            this.f119256g3 = c1099aArr2;
                            continue;
                        default:
                            if (!super.n(t6Var, iA)) {
                            }
                            break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$j */
        public static final class j extends w6<j> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public p[] f119276c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public p f119277d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Float f119278e;

            public j() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                p[] pVarArr = this.f119276c;
                if (pVarArr != null && pVarArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        p[] pVarArr2 = this.f119276c;
                        if (i10 >= pVarArr2.length) {
                            break;
                        }
                        p pVar = pVarArr2[i10];
                        if (pVar != null) {
                            iB += u6.t(1, pVar);
                        }
                        i10++;
                    }
                }
                p pVar2 = this.f119277d;
                if (pVar2 != null) {
                    iB += u6.t(2, pVar2);
                }
                Float f10 = this.f119278e;
                if (f10 == null) {
                    return iB;
                }
                f10.getClass();
                return iB + u6.q(3) + 4;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                p[] pVarArr = this.f119276c;
                if (pVarArr != null && pVarArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        p[] pVarArr2 = this.f119276c;
                        if (i10 >= pVarArr2.length) {
                            break;
                        }
                        p pVar = pVarArr2[i10];
                        if (pVar != null) {
                            u6Var.l(1, pVar);
                        }
                        i10++;
                    }
                }
                p pVar2 = this.f119277d;
                if (pVar2 != null) {
                    u6Var.l(2, pVar2);
                }
                Float f10 = this.f119278e;
                if (f10 != null) {
                    u6Var.h(3, f10.floatValue());
                }
                super.k(u6Var);
            }

            public final j p() {
                this.f119276c = p.r();
                this.f119277d = null;
                this.f119278e = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final j l() {
                try {
                    j jVar = (j) super.l();
                    p[] pVarArr = this.f119276c;
                    if (pVarArr != null && pVarArr.length > 0) {
                        jVar.f119276c = new p[pVarArr.length];
                        int i10 = 0;
                        while (true) {
                            p[] pVarArr2 = this.f119276c;
                            if (i10 >= pVarArr2.length) {
                                break;
                            }
                            p pVar = pVarArr2[i10];
                            if (pVar != null) {
                                jVar.f119276c[i10] = pVar.l();
                            }
                            i10++;
                        }
                    }
                    p pVar2 = this.f119277d;
                    if (pVar2 != null) {
                        jVar.f119277d = pVar2.l();
                    }
                    return jVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final j e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 10) {
                        int iA2 = e7.a(t6Var, 10);
                        p[] pVarArr = this.f119276c;
                        int length = pVarArr == null ? 0 : pVarArr.length;
                        int i10 = iA2 + length;
                        p[] pVarArr2 = new p[i10];
                        if (length != 0) {
                            System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
                        }
                        while (length < i10 - 1) {
                            p pVar = new p();
                            pVarArr2[length] = pVar;
                            t6Var.e(pVar);
                            t6Var.a();
                            length++;
                        }
                        p pVar2 = new p();
                        pVarArr2[length] = pVar2;
                        t6Var.e(pVar2);
                        this.f119276c = pVarArr2;
                    } else if (iA == 18) {
                        if (this.f119277d == null) {
                            this.f119277d = new p();
                        }
                        t6Var.e(this.f119277d);
                    } else if (iA == 29) {
                        this.f119278e = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$k */
        public static final class k extends w6<k> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public e3.a.f0.b f119279c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f119280d;

            public k() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                e3.a.f0.b bVar = this.f119279c;
                if (bVar != null && bVar != null) {
                    iB += u6.r(1, bVar.i());
                }
                String str = this.f119280d;
                if (str != null) {
                    iB += u6.u(2, str);
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                e3.a.f0.b bVar = this.f119279c;
                if (bVar != null && bVar != null) {
                    u6Var.i(1, bVar.i());
                }
                String str = this.f119280d;
                if (str != null) {
                    u6Var.m(2, str);
                }
                super.k(u6Var);
            }

            public final k p() {
                this.f119279c = null;
                this.f119280d = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final k l() {
                try {
                    return (k) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final k e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 8) {
                        int iT = t6Var.t();
                        int iN = t6Var.n();
                        if (iN == 0 || iN == 1 || iN == 2 || iN == 3) {
                            this.f119279c = e3.a.f0.b.b(iN);
                        } else {
                            t6Var.o(iT);
                            n(t6Var, iA);
                        }
                    } else if (iA == 18) {
                        this.f119280d = t6Var.l();
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$l */
        public static final class l extends w6<l> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f119281c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f119282d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f119283e;

            public l() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                String str = this.f119281c;
                if (str != null) {
                    iB += u6.u(1, str);
                }
                String str2 = this.f119282d;
                if (str2 != null) {
                    iB += u6.u(2, str2);
                }
                String str3 = this.f119283e;
                return str3 != null ? iB + u6.u(3, str3) : iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                String str = this.f119281c;
                if (str != null) {
                    u6Var.m(1, str);
                }
                String str2 = this.f119282d;
                if (str2 != null) {
                    u6Var.m(2, str2);
                }
                String str3 = this.f119283e;
                if (str3 != null) {
                    u6Var.m(3, str3);
                }
                super.k(u6Var);
            }

            public final l p() {
                this.f119281c = null;
                this.f119282d = null;
                this.f119283e = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final l l() {
                try {
                    return (l) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final l e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 10) {
                        this.f119281c = t6Var.l();
                    } else if (iA == 18) {
                        this.f119282d = t6Var.l();
                    } else if (iA == 26) {
                        this.f119283e = t6Var.l();
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$m */
        public static final class m extends w6<m> implements Cloneable {
            public Boolean X;
            public Boolean Y;
            public Boolean Z;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Boolean f119284c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Boolean f119285d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Boolean f119286e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Boolean f119287f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Boolean f119288g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Integer f119289h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public C1100a f119290i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Boolean f119291j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Boolean f119292k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Boolean f119293l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Boolean f119294m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Boolean f119295n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Boolean f119296o;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Boolean f119297p0;

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            public Boolean f119298p1;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Boolean f119299s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public b f119300t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Boolean f119301v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public c f119302w;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$m$a, reason: collision with other inner class name */
            public static final class C1100a extends w6<C1100a> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Long f119303c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119304d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119305e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Long f119306f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Long f119307g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Long f119308h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public Boolean f119309i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Boolean f119310j;

                public C1100a() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Long l10 = this.f119303c;
                    int i10 = 3 & 1;
                    if (l10 != null) {
                        iB += u6.s(1, l10.longValue());
                    }
                    Long l11 = this.f119304d;
                    if (l11 != null) {
                        iB += u6.s(2, l11.longValue());
                    }
                    Long l12 = this.f119305e;
                    if (l12 != null) {
                        iB += u6.s(3, l12.longValue());
                    }
                    Long l13 = this.f119306f;
                    if (l13 != null) {
                        iB += u6.s(4, l13.longValue());
                    }
                    Long l14 = this.f119307g;
                    if (l14 != null) {
                        iB += u6.s(5, l14.longValue());
                    }
                    Long l15 = this.f119308h;
                    if (l15 != null) {
                        iB += u6.s(6, l15.longValue());
                    }
                    Boolean bool = this.f119309i;
                    if (bool != null) {
                        bool.getClass();
                        iB += u6.q(7) + 1;
                    }
                    Boolean bool2 = this.f119310j;
                    if (bool2 == null) {
                        return iB;
                    }
                    bool2.getClass();
                    return iB + u6.q(8) + 1;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Long l10 = this.f119303c;
                    if (l10 != null) {
                        u6Var.j(1, l10.longValue());
                    }
                    Long l11 = this.f119304d;
                    if (l11 != null) {
                        u6Var.j(2, l11.longValue());
                    }
                    Long l12 = this.f119305e;
                    if (l12 != null) {
                        u6Var.j(3, l12.longValue());
                    }
                    Long l13 = this.f119306f;
                    if (l13 != null) {
                        u6Var.j(4, l13.longValue());
                    }
                    Long l14 = this.f119307g;
                    if (l14 != null) {
                        u6Var.j(5, l14.longValue());
                    }
                    Long l15 = this.f119308h;
                    if (l15 != null) {
                        u6Var.j(6, l15.longValue());
                    }
                    Boolean bool = this.f119309i;
                    if (bool != null) {
                        u6Var.n(7, bool.booleanValue());
                    }
                    Boolean bool2 = this.f119310j;
                    if (bool2 != null) {
                        u6Var.n(8, bool2.booleanValue());
                    }
                    super.k(u6Var);
                }

                public final C1100a p() {
                    this.f119303c = null;
                    this.f119304d = null;
                    this.f119305e = null;
                    this.f119306f = null;
                    this.f119307g = null;
                    this.f119308h = null;
                    this.f119309i = null;
                    this.f119310j = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1100a l() {
                    try {
                        return (C1100a) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1100a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119303c = Long.valueOf(t6Var.p());
                        } else if (iA == 16) {
                            this.f119304d = Long.valueOf(t6Var.p());
                        } else if (iA == 24) {
                            this.f119305e = Long.valueOf(t6Var.p());
                        } else if (iA == 32) {
                            this.f119306f = Long.valueOf(t6Var.p());
                        } else if (iA == 40) {
                            this.f119307g = Long.valueOf(t6Var.p());
                        } else if (iA == 48) {
                            this.f119308h = Long.valueOf(t6Var.p());
                        } else if (iA == 56) {
                            this.f119309i = Boolean.valueOf(t6Var.k());
                        } else if (iA == 64) {
                            this.f119310j = Boolean.valueOf(t6Var.k());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$m$b */
            public static final class b extends w6<b> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public String f119311c;

                public b() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    String str = this.f119311c;
                    return str != null ? iB + u6.u(1, str) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    String str = this.f119311c;
                    if (str != null) {
                        u6Var.m(1, str);
                    }
                    super.k(u6Var);
                }

                public final b p() {
                    this.f119311c = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final b l() {
                    try {
                        return (b) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final b e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 10) {
                            this.f119311c = t6Var.l();
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$m$c */
            public static final class c extends w6<c> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Boolean f119312c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Boolean f119313d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Boolean f119314e;

                public c() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Boolean bool = this.f119312c;
                    if (bool != null) {
                        bool.getClass();
                        iB += u6.q(1) + 1;
                    }
                    Boolean bool2 = this.f119313d;
                    if (bool2 != null) {
                        bool2.getClass();
                        iB += u6.q(2) + 1;
                    }
                    Boolean bool3 = this.f119314e;
                    if (bool3 == null) {
                        return iB;
                    }
                    bool3.getClass();
                    return iB + u6.q(3) + 1;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Boolean bool = this.f119312c;
                    if (bool != null) {
                        u6Var.n(1, bool.booleanValue());
                    }
                    Boolean bool2 = this.f119313d;
                    if (bool2 != null) {
                        u6Var.n(2, bool2.booleanValue());
                    }
                    Boolean bool3 = this.f119314e;
                    if (bool3 != null) {
                        u6Var.n(3, bool3.booleanValue());
                    }
                    super.k(u6Var);
                }

                public final c p() {
                    this.f119312c = null;
                    this.f119313d = null;
                    this.f119314e = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final c l() {
                    try {
                        return (c) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final c e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119312c = Boolean.valueOf(t6Var.k());
                        } else if (iA == 16) {
                            this.f119313d = Boolean.valueOf(t6Var.k());
                        } else if (iA == 24) {
                            this.f119314e = Boolean.valueOf(t6Var.k());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public m() {
                q();
            }

            public static int p(int i10) {
                if (i10 >= 0 && i10 <= 3) {
                    return i10;
                }
                StringBuilder sb2 = new StringBuilder(54);
                sb2.append(i10);
                sb2.append(" is not a valid enum DaydreamImageAlignment");
                throw new IllegalArgumentException(sb2.toString());
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Boolean bool = this.f119284c;
                if (bool != null) {
                    bool.getClass();
                    iB += u6.q(1) + 1;
                }
                Boolean bool2 = this.f119285d;
                if (bool2 != null) {
                    bool2.getClass();
                    iB += u6.q(2) + 1;
                }
                Boolean bool3 = this.f119286e;
                if (bool3 != null) {
                    bool3.getClass();
                    iB += u6.q(3) + 1;
                }
                Boolean bool4 = this.f119287f;
                if (bool4 != null) {
                    bool4.getClass();
                    iB += u6.q(4) + 1;
                }
                Boolean bool5 = this.f119288g;
                if (bool5 != null) {
                    bool5.getClass();
                    iB += u6.q(5) + 1;
                }
                Integer num = this.f119289h;
                if (num != null) {
                    iB += u6.r(6, num.intValue());
                }
                C1100a c1100a = this.f119290i;
                if (c1100a != null) {
                    iB += u6.t(7, c1100a);
                }
                Boolean bool6 = this.f119291j;
                if (bool6 != null) {
                    bool6.getClass();
                    iB += u6.q(8) + 1;
                }
                Boolean bool7 = this.f119292k;
                if (bool7 != null) {
                    bool7.getClass();
                    iB += u6.q(9) + 1;
                }
                Boolean bool8 = this.f119293l;
                if (bool8 != null) {
                    bool8.getClass();
                    iB += u6.q(10) + 1;
                }
                Boolean bool9 = this.f119294m;
                if (bool9 != null) {
                    bool9.getClass();
                    iB += u6.q(11) + 1;
                }
                Boolean bool10 = this.f119295n;
                if (bool10 != null) {
                    bool10.getClass();
                    iB += u6.q(12) + 1;
                }
                Boolean bool11 = this.f119296o;
                if (bool11 != null) {
                    bool11.getClass();
                    iB += u6.q(13) + 1;
                }
                Boolean bool12 = this.f119299s;
                if (bool12 != null) {
                    bool12.getClass();
                    iB += u6.q(14) + 1;
                }
                b bVar = this.f119300t;
                if (bVar != null) {
                    iB += u6.t(15, bVar);
                }
                Boolean bool13 = this.f119301v;
                if (bool13 != null) {
                    bool13.getClass();
                    iB += u6.q(16) + 1;
                }
                c cVar = this.f119302w;
                if (cVar != null) {
                    iB += u6.t(17, cVar);
                }
                Boolean bool14 = this.X;
                if (bool14 != null) {
                    bool14.getClass();
                    iB += u6.q(18) + 1;
                }
                Boolean bool15 = this.Y;
                if (bool15 != null) {
                    bool15.getClass();
                    iB += u6.q(19) + 1;
                }
                Boolean bool16 = this.Z;
                if (bool16 != null) {
                    bool16.getClass();
                    iB += u6.q(20) + 1;
                }
                Boolean bool17 = this.f119297p0;
                if (bool17 != null) {
                    bool17.getClass();
                    iB += u6.q(21) + 1;
                }
                Boolean bool18 = this.f119298p1;
                if (bool18 != null) {
                    bool18.getClass();
                    iB += u6.q(22) + 1;
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Boolean bool = this.f119284c;
                if (bool != null) {
                    u6Var.n(1, bool.booleanValue());
                }
                Boolean bool2 = this.f119285d;
                if (bool2 != null) {
                    u6Var.n(2, bool2.booleanValue());
                }
                Boolean bool3 = this.f119286e;
                if (bool3 != null) {
                    u6Var.n(3, bool3.booleanValue());
                }
                Boolean bool4 = this.f119287f;
                if (bool4 != null) {
                    u6Var.n(4, bool4.booleanValue());
                }
                Boolean bool5 = this.f119288g;
                if (bool5 != null) {
                    u6Var.n(5, bool5.booleanValue());
                }
                Integer num = this.f119289h;
                if (num != null) {
                    u6Var.i(6, num.intValue());
                }
                C1100a c1100a = this.f119290i;
                if (c1100a != null) {
                    u6Var.l(7, c1100a);
                }
                Boolean bool6 = this.f119291j;
                if (bool6 != null) {
                    u6Var.n(8, bool6.booleanValue());
                }
                Boolean bool7 = this.f119292k;
                if (bool7 != null) {
                    u6Var.n(9, bool7.booleanValue());
                }
                Boolean bool8 = this.f119293l;
                if (bool8 != null) {
                    u6Var.n(10, bool8.booleanValue());
                }
                Boolean bool9 = this.f119294m;
                if (bool9 != null) {
                    u6Var.n(11, bool9.booleanValue());
                }
                Boolean bool10 = this.f119295n;
                if (bool10 != null) {
                    u6Var.n(12, bool10.booleanValue());
                }
                Boolean bool11 = this.f119296o;
                if (bool11 != null) {
                    u6Var.n(13, bool11.booleanValue());
                }
                Boolean bool12 = this.f119299s;
                if (bool12 != null) {
                    u6Var.n(14, bool12.booleanValue());
                }
                b bVar = this.f119300t;
                if (bVar != null) {
                    u6Var.l(15, bVar);
                }
                Boolean bool13 = this.f119301v;
                if (bool13 != null) {
                    u6Var.n(16, bool13.booleanValue());
                }
                c cVar = this.f119302w;
                if (cVar != null) {
                    u6Var.l(17, cVar);
                }
                Boolean bool14 = this.X;
                if (bool14 != null) {
                    u6Var.n(18, bool14.booleanValue());
                }
                Boolean bool15 = this.Y;
                if (bool15 != null) {
                    u6Var.n(19, bool15.booleanValue());
                }
                Boolean bool16 = this.Z;
                if (bool16 != null) {
                    u6Var.n(20, bool16.booleanValue());
                }
                Boolean bool17 = this.f119297p0;
                if (bool17 != null) {
                    u6Var.n(21, bool17.booleanValue());
                }
                Boolean bool18 = this.f119298p1;
                if (bool18 != null) {
                    u6Var.n(22, bool18.booleanValue());
                }
                super.k(u6Var);
            }

            public final m q() {
                this.f119284c = null;
                this.f119285d = null;
                this.f119286e = null;
                this.f119287f = null;
                this.f119288g = null;
                this.f119289h = null;
                this.f119290i = null;
                this.f119291j = null;
                this.f119292k = null;
                this.f119293l = null;
                this.f119294m = null;
                this.f119295n = null;
                this.f119296o = null;
                this.f119299s = null;
                this.f119300t = null;
                this.f119301v = null;
                this.f119302w = null;
                this.X = null;
                this.Y = null;
                this.Z = null;
                this.f119297p0 = null;
                this.f119298p1 = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final m l() {
                try {
                    m mVar = (m) super.l();
                    C1100a c1100a = this.f119290i;
                    if (c1100a != null) {
                        mVar.f119290i = c1100a.l();
                    }
                    b bVar = this.f119300t;
                    if (bVar != null) {
                        mVar.f119300t = bVar.l();
                    }
                    c cVar = this.f119302w;
                    if (cVar != null) {
                        mVar.f119302w = cVar.l();
                    }
                    return mVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final m e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    switch (iA) {
                        case 0:
                            break;
                        case 8:
                            this.f119284c = Boolean.valueOf(t6Var.k());
                            break;
                        case 16:
                            this.f119285d = Boolean.valueOf(t6Var.k());
                            break;
                        case 24:
                            this.f119286e = Boolean.valueOf(t6Var.k());
                            break;
                        case 32:
                            this.f119287f = Boolean.valueOf(t6Var.k());
                            break;
                        case 40:
                            this.f119288g = Boolean.valueOf(t6Var.k());
                            break;
                        case 48:
                            int iT = t6Var.t();
                            try {
                                this.f119289h = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                            break;
                        case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                            if (this.f119290i == null) {
                                this.f119290i = new C1100a();
                            }
                            t6Var.e(this.f119290i);
                            break;
                        case 64:
                            this.f119291j = Boolean.valueOf(t6Var.k());
                            break;
                        case 72:
                            this.f119292k = Boolean.valueOf(t6Var.k());
                            break;
                        case 80:
                            this.f119293l = Boolean.valueOf(t6Var.k());
                            break;
                        case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                            this.f119294m = Boolean.valueOf(t6Var.k());
                            break;
                        case 96:
                            this.f119295n = Boolean.valueOf(t6Var.k());
                            break;
                        case 104:
                            this.f119296o = Boolean.valueOf(t6Var.k());
                            break;
                        case com.planner5d.library.engine.input.f.b.B /* 112 */:
                            this.f119299s = Boolean.valueOf(t6Var.k());
                            break;
                        case 122:
                            if (this.f119300t == null) {
                                this.f119300t = new b();
                            }
                            t6Var.e(this.f119300t);
                            break;
                        case 128:
                            this.f119301v = Boolean.valueOf(t6Var.k());
                            break;
                        case 138:
                            if (this.f119302w == null) {
                                this.f119302w = new c();
                            }
                            t6Var.e(this.f119302w);
                            break;
                        case 144:
                            this.X = Boolean.valueOf(t6Var.k());
                            break;
                        case 152:
                            this.Y = Boolean.valueOf(t6Var.k());
                            break;
                        case 160:
                            this.Z = Boolean.valueOf(t6Var.k());
                            break;
                        case 168:
                            this.f119297p0 = Boolean.valueOf(t6Var.k());
                            break;
                        case 176:
                            this.f119298p1 = Boolean.valueOf(t6Var.k());
                            break;
                        default:
                            if (!super.n(t6Var, iA)) {
                            }
                            break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$n */
        public static final class n extends w6<n> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public d f119315c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public c f119316d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public C1101a f119317e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public b f119318f;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$n$a, reason: collision with other inner class name */
            public static final class C1101a extends w6<C1101a> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Long f119319c;

                public C1101a() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Long l10 = this.f119319c;
                    return l10 != null ? iB + u6.s(1, l10.longValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Long l10 = this.f119319c;
                    if (l10 != null) {
                        u6Var.j(1, l10.longValue());
                    }
                    super.k(u6Var);
                }

                public final C1101a p() {
                    this.f119319c = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1101a l() {
                    try {
                        return (C1101a) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1101a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119319c = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$n$b */
            public static final class b extends w6<b> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.b.c.EnumC1246c f119320c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public e3.a.b.c.EnumC1245b[] f119321d;

                public b() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.b.c.EnumC1246c enumC1246c = this.f119320c;
                    if (enumC1246c != null && enumC1246c != null) {
                        iB += u6.r(1, enumC1246c.i());
                    }
                    e3.a.b.c.EnumC1245b[] enumC1245bArr = this.f119321d;
                    if (enumC1245bArr != null && enumC1245bArr.length > 0) {
                        int i10 = 0;
                        int i11 = 0;
                        int iA = 0;
                        while (true) {
                            e3.a.b.c.EnumC1245b[] enumC1245bArr2 = this.f119321d;
                            if (i11 >= enumC1245bArr2.length) {
                                break;
                            }
                            e3.a.b.c.EnumC1245b enumC1245b = enumC1245bArr2[i11];
                            if (enumC1245b != null) {
                                iA += u6.a(enumC1245b.i());
                            }
                            i11++;
                        }
                        iB += iA;
                        while (true) {
                            e3.a.b.c.EnumC1245b[] enumC1245bArr3 = this.f119321d;
                            if (i10 >= enumC1245bArr3.length) {
                                break;
                            }
                            if (enumC1245bArr3[i10] != null) {
                                iB++;
                            }
                            i10++;
                        }
                    }
                    return iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.b.c.EnumC1246c enumC1246c = this.f119320c;
                    if (enumC1246c != null && enumC1246c != null) {
                        u6Var.i(1, enumC1246c.i());
                    }
                    e3.a.b.c.EnumC1245b[] enumC1245bArr = this.f119321d;
                    if (enumC1245bArr != null && enumC1245bArr.length > 0) {
                        int i10 = 0;
                        while (true) {
                            e3.a.b.c.EnumC1245b[] enumC1245bArr2 = this.f119321d;
                            if (i10 >= enumC1245bArr2.length) {
                                break;
                            }
                            e3.a.b.c.EnumC1245b enumC1245b = enumC1245bArr2[i10];
                            if (enumC1245b != null) {
                                u6Var.i(2, enumC1245b.i());
                            }
                            i10++;
                        }
                    }
                    super.k(u6Var);
                }

                public final b p() {
                    this.f119320c = null;
                    this.f119321d = new e3.a.b.c.EnumC1245b[0];
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final b l() {
                    try {
                        b bVar = (b) super.l();
                        e3.a.b.c.EnumC1245b[] enumC1245bArr = this.f119321d;
                        if (enumC1245bArr != null && enumC1245bArr.length > 0) {
                            bVar.f119321d = enumC1245bArr;
                        }
                        return bVar;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final b e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA != 8) {
                            if (iA != 16) {
                                if (iA != 18) {
                                    if (!super.n(t6Var, iA)) {
                                        break;
                                    }
                                } else {
                                    int iJ = t6Var.j(t6Var.n());
                                    int iT = t6Var.t();
                                    int i10 = 0;
                                    while (t6Var.s() > 0) {
                                        int iN = t6Var.n();
                                        if (iN == 0 || iN == 1 || iN == 2 || iN == 3) {
                                            i10++;
                                        }
                                    }
                                    if (i10 != 0) {
                                        t6Var.o(iT);
                                        e3.a.b.c.EnumC1245b[] enumC1245bArr = this.f119321d;
                                        int length = enumC1245bArr == null ? 0 : enumC1245bArr.length;
                                        e3.a.b.c.EnumC1245b[] enumC1245bArr2 = new e3.a.b.c.EnumC1245b[i10 + length];
                                        if (length != 0) {
                                            System.arraycopy(enumC1245bArr, 0, enumC1245bArr2, 0, length);
                                        }
                                        while (t6Var.s() > 0) {
                                            int iT2 = t6Var.t();
                                            int iN2 = t6Var.n();
                                            if (iN2 == 0 || iN2 == 1 || iN2 == 2 || iN2 == 3) {
                                                enumC1245bArr2[length] = e3.a.b.c.EnumC1245b.b(iN2);
                                                length++;
                                            } else {
                                                t6Var.o(iT2);
                                                n(t6Var, 16);
                                            }
                                        }
                                        this.f119321d = enumC1245bArr2;
                                    }
                                    t6Var.m(iJ);
                                }
                            } else {
                                int iA2 = e7.a(t6Var, 16);
                                e3.a.b.c.EnumC1245b[] enumC1245bArr3 = new e3.a.b.c.EnumC1245b[iA2];
                                int i11 = 0;
                                for (int i12 = 0; i12 < iA2; i12++) {
                                    if (i12 != 0) {
                                        t6Var.a();
                                    }
                                    int iT3 = t6Var.t();
                                    int iN3 = t6Var.n();
                                    if (iN3 == 0 || iN3 == 1 || iN3 == 2 || iN3 == 3) {
                                        enumC1245bArr3[i11] = e3.a.b.c.EnumC1245b.b(iN3);
                                        i11++;
                                    } else {
                                        t6Var.o(iT3);
                                        n(t6Var, iA);
                                    }
                                }
                                if (i11 != 0) {
                                    e3.a.b.c.EnumC1245b[] enumC1245bArr4 = this.f119321d;
                                    int length2 = enumC1245bArr4 == null ? 0 : enumC1245bArr4.length;
                                    if (length2 == 0 && i11 == iA2) {
                                        this.f119321d = enumC1245bArr3;
                                    } else {
                                        e3.a.b.c.EnumC1245b[] enumC1245bArr5 = new e3.a.b.c.EnumC1245b[length2 + i11];
                                        if (length2 != 0) {
                                            System.arraycopy(enumC1245bArr4, 0, enumC1245bArr5, 0, length2);
                                        }
                                        System.arraycopy(enumC1245bArr3, 0, enumC1245bArr5, length2, i11);
                                        this.f119321d = enumC1245bArr5;
                                    }
                                }
                            }
                        } else {
                            int iT4 = t6Var.t();
                            int iN4 = t6Var.n();
                            if (iN4 == 0 || iN4 == 1 || iN4 == 2) {
                                this.f119320c = e3.a.b.c.EnumC1246c.b(iN4);
                            } else {
                                t6Var.o(iT4);
                                n(t6Var, iA);
                            }
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$n$c */
            public static final class c extends w6<c> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Long f119322c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119323d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Long f119324e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Long f119325f;

                public c() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Long l10 = this.f119322c;
                    if (l10 != null) {
                        iB += u6.s(1, l10.longValue());
                    }
                    Long l11 = this.f119323d;
                    if (l11 != null) {
                        iB += u6.s(2, l11.longValue());
                    }
                    Long l12 = this.f119324e;
                    if (l12 != null) {
                        iB += u6.s(3, l12.longValue());
                    }
                    Long l13 = this.f119325f;
                    return l13 != null ? iB + u6.s(4, l13.longValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Long l10 = this.f119322c;
                    if (l10 != null) {
                        u6Var.j(1, l10.longValue());
                    }
                    Long l11 = this.f119323d;
                    if (l11 != null) {
                        u6Var.j(2, l11.longValue());
                    }
                    Long l12 = this.f119324e;
                    if (l12 != null) {
                        u6Var.j(3, l12.longValue());
                    }
                    Long l13 = this.f119325f;
                    if (l13 != null) {
                        u6Var.j(4, l13.longValue());
                    }
                    super.k(u6Var);
                }

                public final c p() {
                    this.f119322c = null;
                    this.f119323d = null;
                    this.f119324e = null;
                    this.f119325f = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final c l() {
                    try {
                        return (c) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final c e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119322c = Long.valueOf(t6Var.p());
                        } else if (iA == 16) {
                            this.f119323d = Long.valueOf(t6Var.p());
                        } else if (iA == 24) {
                            this.f119324e = Long.valueOf(t6Var.p());
                        } else if (iA == 32) {
                            this.f119325f = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$n$d */
            public static final class d extends w6<d> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119326c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119327d;

                public d() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 4) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum PowerStates");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119326c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Long l10 = this.f119327d;
                    return l10 != null ? iB + u6.s(2, l10.longValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119326c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Long l10 = this.f119327d;
                    if (l10 != null) {
                        u6Var.j(2, l10.longValue());
                    }
                    super.k(u6Var);
                }

                public final d q() {
                    this.f119326c = null;
                    this.f119327d = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final d l() {
                    try {
                        return (d) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final d e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            try {
                                this.f119326c = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            this.f119327d = Long.valueOf(t6Var.p());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public n() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                d dVar = this.f119315c;
                if (dVar != null) {
                    iB += u6.t(1, dVar);
                }
                c cVar = this.f119316d;
                if (cVar != null) {
                    iB += u6.t(2, cVar);
                }
                C1101a c1101a = this.f119317e;
                if (c1101a != null) {
                    iB += u6.t(3, c1101a);
                }
                b bVar = this.f119318f;
                if (bVar != null) {
                    iB += u6.t(4, bVar);
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                d dVar = this.f119315c;
                if (dVar != null) {
                    u6Var.l(1, dVar);
                }
                c cVar = this.f119316d;
                if (cVar != null) {
                    u6Var.l(2, cVar);
                }
                C1101a c1101a = this.f119317e;
                if (c1101a != null) {
                    u6Var.l(3, c1101a);
                }
                b bVar = this.f119318f;
                if (bVar != null) {
                    u6Var.l(4, bVar);
                }
                super.k(u6Var);
            }

            public final n p() {
                this.f119315c = null;
                this.f119316d = null;
                this.f119317e = null;
                this.f119318f = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final n l() {
                try {
                    n nVar = (n) super.l();
                    d dVar = this.f119315c;
                    if (dVar != null) {
                        nVar.f119315c = dVar.l();
                    }
                    c cVar = this.f119316d;
                    if (cVar != null) {
                        nVar.f119316d = cVar.l();
                    }
                    C1101a c1101a = this.f119317e;
                    if (c1101a != null) {
                        nVar.f119317e = c1101a.l();
                    }
                    b bVar = this.f119318f;
                    if (bVar != null) {
                        nVar.f119318f = bVar.l();
                    }
                    return nVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final n e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 10) {
                        if (this.f119315c == null) {
                            this.f119315c = new d();
                        }
                        t6Var.e(this.f119315c);
                    } else if (iA == 18) {
                        if (this.f119316d == null) {
                            this.f119316d = new c();
                        }
                        t6Var.e(this.f119316d);
                    } else if (iA == 26) {
                        if (this.f119317e == null) {
                            this.f119317e = new C1101a();
                        }
                        t6Var.e(this.f119317e);
                    } else if (iA == 34) {
                        if (this.f119318f == null) {
                            this.f119318f = new b();
                        }
                        t6Var.e(this.f119318f);
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$o */
        public static final class o extends w6<o> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Integer f119328c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public C1102a[] f119329d;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$o$a, reason: collision with other inner class name */
            public static final class C1102a extends w6<C1102a> implements Cloneable {

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile C1102a[] f119330l;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Integer f119331c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Float f119332d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Integer f119333e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Integer f119334f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Integer f119335g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Integer f119336h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public float[] f119337i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public float[] f119338j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public float[] f119339k;

                public C1102a() {
                    p();
                }

                public static C1102a[] r() {
                    if (f119330l == null) {
                        synchronized (a7.f127704b) {
                            try {
                                if (f119330l == null) {
                                    f119330l = new C1102a[0];
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return f119330l;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Integer num = this.f119331c;
                    if (num != null) {
                        iB += u6.r(1, num.intValue());
                    }
                    Float f10 = this.f119332d;
                    if (f10 != null) {
                        f10.getClass();
                        iB += u6.q(2) + 4;
                    }
                    Integer num2 = this.f119333e;
                    if (num2 != null) {
                        iB += u6.r(3, num2.intValue());
                    }
                    Integer num3 = this.f119334f;
                    if (num3 != null) {
                        iB += u6.r(4, num3.intValue());
                    }
                    Integer num4 = this.f119335g;
                    if (num4 != null) {
                        iB += u6.r(5, num4.intValue());
                    }
                    Integer num5 = this.f119336h;
                    if (num5 != null) {
                        iB += u6.r(6, num5.intValue());
                    }
                    float[] fArr = this.f119337i;
                    if (fArr != null && fArr.length > 0) {
                        iB = iB + (fArr.length * 4) + fArr.length;
                    }
                    float[] fArr2 = this.f119338j;
                    if (fArr2 != null && fArr2.length > 0) {
                        iB = iB + (fArr2.length * 4) + fArr2.length;
                    }
                    float[] fArr3 = this.f119339k;
                    return (fArr3 == null || fArr3.length <= 0) ? iB : iB + (fArr3.length * 4) + fArr3.length;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Integer num = this.f119331c;
                    if (num != null) {
                        u6Var.i(1, num.intValue());
                    }
                    Float f10 = this.f119332d;
                    if (f10 != null) {
                        u6Var.h(2, f10.floatValue());
                    }
                    Integer num2 = this.f119333e;
                    if (num2 != null) {
                        u6Var.i(3, num2.intValue());
                    }
                    Integer num3 = this.f119334f;
                    if (num3 != null) {
                        u6Var.i(4, num3.intValue());
                    }
                    Integer num4 = this.f119335g;
                    if (num4 != null) {
                        int i10 = 4 & 5;
                        u6Var.i(5, num4.intValue());
                    }
                    Integer num5 = this.f119336h;
                    if (num5 != null) {
                        u6Var.i(6, num5.intValue());
                    }
                    float[] fArr = this.f119337i;
                    int i11 = 0;
                    if (fArr != null && fArr.length > 0) {
                        int i12 = 0;
                        while (true) {
                            float[] fArr2 = this.f119337i;
                            if (i12 >= fArr2.length) {
                                break;
                            }
                            u6Var.h(7, fArr2[i12]);
                            i12++;
                        }
                    }
                    float[] fArr3 = this.f119338j;
                    if (fArr3 != null && fArr3.length > 0) {
                        int i13 = 0;
                        while (true) {
                            float[] fArr4 = this.f119338j;
                            if (i13 >= fArr4.length) {
                                break;
                            }
                            u6Var.h(8, fArr4[i13]);
                            i13++;
                        }
                    }
                    float[] fArr5 = this.f119339k;
                    if (fArr5 != null && fArr5.length > 0) {
                        while (true) {
                            float[] fArr6 = this.f119339k;
                            if (i11 >= fArr6.length) {
                                break;
                            }
                            u6Var.h(9, fArr6[i11]);
                            i11++;
                        }
                    }
                    super.k(u6Var);
                }

                public final C1102a p() {
                    this.f119331c = null;
                    this.f119332d = null;
                    this.f119333e = null;
                    this.f119334f = null;
                    this.f119335g = null;
                    this.f119336h = null;
                    float[] fArr = e7.f129361b;
                    this.f119337i = fArr;
                    this.f119338j = fArr;
                    this.f119339k = fArr;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1102a l() {
                    try {
                        C1102a c1102a = (C1102a) super.l();
                        float[] fArr = this.f119337i;
                        if (fArr != null && fArr.length > 0) {
                            c1102a.f119337i = (float[]) fArr.clone();
                        }
                        float[] fArr2 = this.f119338j;
                        if (fArr2 != null && fArr2.length > 0) {
                            c1102a.f119338j = (float[]) fArr2.clone();
                        }
                        float[] fArr3 = this.f119339k;
                        if (fArr3 != null && fArr3.length > 0) {
                            c1102a.f119339k = (float[]) fArr3.clone();
                        }
                        return c1102a;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C1102a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        switch (iA) {
                            case 0:
                                break;
                            case 8:
                                this.f119331c = Integer.valueOf(t6Var.n());
                                break;
                            case 21:
                                this.f119332d = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                                break;
                            case 24:
                                this.f119333e = Integer.valueOf(t6Var.n());
                                break;
                            case 32:
                                this.f119334f = Integer.valueOf(t6Var.n());
                                break;
                            case 40:
                                this.f119335g = Integer.valueOf(t6Var.n());
                                break;
                            case 48:
                                this.f119336h = Integer.valueOf(t6Var.n());
                                break;
                            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                                int iN = t6Var.n();
                                int iJ = t6Var.j(iN);
                                int i10 = iN / 4;
                                float[] fArr = this.f119337i;
                                int length = fArr == null ? 0 : fArr.length;
                                int i11 = i10 + length;
                                float[] fArr2 = new float[i11];
                                if (length != 0) {
                                    System.arraycopy(fArr, 0, fArr2, 0, length);
                                }
                                while (length < i11) {
                                    fArr2[length] = Float.intBitsToFloat(t6Var.r());
                                    length++;
                                }
                                this.f119337i = fArr2;
                                t6Var.m(iJ);
                                break;
                            case 61:
                                int iA2 = e7.a(t6Var, 61);
                                float[] fArr3 = this.f119337i;
                                int length2 = fArr3 == null ? 0 : fArr3.length;
                                int i12 = iA2 + length2;
                                float[] fArr4 = new float[i12];
                                if (length2 != 0) {
                                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                                }
                                while (length2 < i12 - 1) {
                                    fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                                    t6Var.a();
                                    length2++;
                                }
                                fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                                this.f119337i = fArr4;
                                break;
                            case 66:
                                int iN2 = t6Var.n();
                                int iJ2 = t6Var.j(iN2);
                                int i13 = iN2 / 4;
                                float[] fArr5 = this.f119338j;
                                int length3 = fArr5 == null ? 0 : fArr5.length;
                                int i14 = i13 + length3;
                                float[] fArr6 = new float[i14];
                                if (length3 != 0) {
                                    System.arraycopy(fArr5, 0, fArr6, 0, length3);
                                }
                                while (length3 < i14) {
                                    fArr6[length3] = Float.intBitsToFloat(t6Var.r());
                                    length3++;
                                }
                                this.f119338j = fArr6;
                                t6Var.m(iJ2);
                                break;
                            case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                                int iA3 = e7.a(t6Var, 69);
                                float[] fArr7 = this.f119338j;
                                int length4 = fArr7 == null ? 0 : fArr7.length;
                                int i15 = iA3 + length4;
                                float[] fArr8 = new float[i15];
                                if (length4 != 0) {
                                    System.arraycopy(fArr7, 0, fArr8, 0, length4);
                                }
                                while (length4 < i15 - 1) {
                                    fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                                    t6Var.a();
                                    length4++;
                                }
                                fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                                this.f119338j = fArr8;
                                break;
                            case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                                int iN3 = t6Var.n();
                                int iJ3 = t6Var.j(iN3);
                                int i16 = iN3 / 4;
                                float[] fArr9 = this.f119339k;
                                int length5 = fArr9 == null ? 0 : fArr9.length;
                                int i17 = i16 + length5;
                                float[] fArr10 = new float[i17];
                                if (length5 != 0) {
                                    System.arraycopy(fArr9, 0, fArr10, 0, length5);
                                }
                                while (length5 < i17) {
                                    fArr10[length5] = Float.intBitsToFloat(t6Var.r());
                                    length5++;
                                }
                                this.f119339k = fArr10;
                                t6Var.m(iJ3);
                                break;
                            case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                                int iA4 = e7.a(t6Var, 77);
                                float[] fArr11 = this.f119339k;
                                int length6 = fArr11 == null ? 0 : fArr11.length;
                                int i18 = iA4 + length6;
                                float[] fArr12 = new float[i18];
                                if (length6 != 0) {
                                    System.arraycopy(fArr11, 0, fArr12, 0, length6);
                                }
                                while (length6 < i18 - 1) {
                                    fArr12[length6] = Float.intBitsToFloat(t6Var.r());
                                    t6Var.a();
                                    length6++;
                                }
                                fArr12[length6] = Float.intBitsToFloat(t6Var.r());
                                this.f119339k = fArr12;
                                break;
                            default:
                                if (!super.n(t6Var, iA)) {
                                }
                                break;
                        }
                    }
                    return this;
                }
            }

            public o() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Integer num = this.f119328c;
                if (num != null) {
                    iB += u6.r(1, num.intValue());
                }
                C1102a[] c1102aArr = this.f119329d;
                if (c1102aArr != null && c1102aArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        C1102a[] c1102aArr2 = this.f119329d;
                        if (i10 >= c1102aArr2.length) {
                            break;
                        }
                        C1102a c1102a = c1102aArr2[i10];
                        if (c1102a != null) {
                            iB += u6.t(2, c1102a);
                        }
                        i10++;
                    }
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Integer num = this.f119328c;
                if (num != null) {
                    u6Var.i(1, num.intValue());
                }
                C1102a[] c1102aArr = this.f119329d;
                if (c1102aArr != null && c1102aArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        C1102a[] c1102aArr2 = this.f119329d;
                        if (i10 >= c1102aArr2.length) {
                            break;
                        }
                        C1102a c1102a = c1102aArr2[i10];
                        if (c1102a != null) {
                            u6Var.l(2, c1102a);
                        }
                        i10++;
                    }
                }
                super.k(u6Var);
            }

            public final o p() {
                this.f119328c = null;
                this.f119329d = C1102a.r();
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final o l() {
                try {
                    o oVar = (o) super.l();
                    C1102a[] c1102aArr = this.f119329d;
                    if (c1102aArr != null && c1102aArr.length > 0) {
                        oVar.f119329d = new C1102a[c1102aArr.length];
                        int i10 = 0;
                        while (true) {
                            C1102a[] c1102aArr2 = this.f119329d;
                            if (i10 >= c1102aArr2.length) {
                                break;
                            }
                            C1102a c1102a = c1102aArr2[i10];
                            if (c1102a != null) {
                                oVar.f119329d[i10] = c1102a.l();
                            }
                            i10++;
                        }
                    }
                    return oVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final o e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 8) {
                        this.f119328c = Integer.valueOf(t6Var.n());
                    } else if (iA == 18) {
                        int iA2 = e7.a(t6Var, 18);
                        C1102a[] c1102aArr = this.f119329d;
                        int length = c1102aArr == null ? 0 : c1102aArr.length;
                        int i10 = iA2 + length;
                        C1102a[] c1102aArr2 = new C1102a[i10];
                        if (length != 0) {
                            System.arraycopy(c1102aArr, 0, c1102aArr2, 0, length);
                        }
                        while (length < i10 - 1) {
                            C1102a c1102a = new C1102a();
                            c1102aArr2[length] = c1102a;
                            t6Var.e(c1102a);
                            t6Var.a();
                            length++;
                        }
                        C1102a c1102a2 = new C1102a();
                        c1102aArr2[length] = c1102a2;
                        t6Var.e(c1102a2);
                        this.f119329d = c1102aArr2;
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$p */
        public static final class p extends w6<p> implements Cloneable {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static volatile p[] f119340e;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Float f119341c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Float f119342d;

            public p() {
                p();
            }

            public static p[] r() {
                if (f119340e == null) {
                    synchronized (a7.f127704b) {
                        try {
                            if (f119340e == null) {
                                f119340e = new p[0];
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f119340e;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Float f10 = this.f119341c;
                if (f10 != null) {
                    f10.getClass();
                    iB += u6.q(1) + 4;
                }
                Float f11 = this.f119342d;
                if (f11 == null) {
                    return iB;
                }
                f11.getClass();
                return iB + u6.q(2) + 4;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Float f10 = this.f119341c;
                if (f10 != null) {
                    u6Var.h(1, f10.floatValue());
                }
                Float f11 = this.f119342d;
                if (f11 != null) {
                    u6Var.h(2, f11.floatValue());
                }
                super.k(u6Var);
            }

            public final p p() {
                this.f119341c = null;
                this.f119342d = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final p l() {
                try {
                    return (p) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final p e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 13) {
                        this.f119341c = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                    } else if (iA == 21) {
                        this.f119342d = Float.valueOf(Float.intBitsToFloat(t6Var.r()));
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$q */
        public static final class q extends w6<q> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Long f119343c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Integer f119344d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public e3.a.h.EnumC1294h f119345e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public C1089a f119346f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Integer f119347g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public C1089a f119348h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public b f119349i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public c f119350j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Boolean f119351k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public C1103a f119352l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Integer f119353m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public d f119354n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Integer f119355o;

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$q$a, reason: collision with other inner class name */
            public static final class C1103a extends w6<C1103a> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Boolean f119356c;

                public C1103a() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    Boolean bool = this.f119356c;
                    if (bool == null) {
                        return iB;
                    }
                    bool.getClass();
                    return iB + u6.q(1) + 1;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    Boolean bool = this.f119356c;
                    if (bool != null) {
                        u6Var.n(1, bool.booleanValue());
                    }
                    super.k(u6Var);
                }

                public final C1103a p() {
                    this.f119356c = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final C1103a l() {
                    try {
                        return (C1103a) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C1103a e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            this.f119356c = Boolean.valueOf(t6Var.k());
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$q$b */
            public static final class b extends w6<b> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public String f119357c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public String f119358d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public String f119359e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public String f119360f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public String f119361g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Boolean f119362h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public Integer f119363i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public String f119364j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public Integer f119365k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public Integer f119366l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public Integer f119367m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public Integer f119368n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public e3.a.h.d.c f119369o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public Integer f119370s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Integer f119371t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Integer f119372v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public Integer f119373w;

                public b() {
                    q();
                }

                public static int p(int i10) {
                    if (i10 >= 0 && i10 <= 3) {
                        return i10;
                    }
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum ControllerAxis");
                    throw new IllegalArgumentException(sb2.toString());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    String str = this.f119357c;
                    if (str != null) {
                        iB += u6.u(1, str);
                    }
                    String str2 = this.f119358d;
                    if (str2 != null) {
                        iB += u6.u(2, str2);
                    }
                    String str3 = this.f119359e;
                    if (str3 != null) {
                        iB += u6.u(3, str3);
                    }
                    String str4 = this.f119360f;
                    if (str4 != null) {
                        iB += u6.u(4, str4);
                    }
                    String str5 = this.f119361g;
                    if (str5 != null) {
                        iB += u6.u(5, str5);
                    }
                    Integer num = this.f119363i;
                    if (num != null) {
                        iB += u6.r(6, num.intValue());
                    }
                    String str6 = this.f119364j;
                    if (str6 != null) {
                        iB += u6.u(7, str6);
                    }
                    Integer num2 = this.f119365k;
                    if (num2 != null) {
                        iB += u6.r(8, num2.intValue());
                    }
                    Integer num3 = this.f119366l;
                    if (num3 != null) {
                        iB += u6.r(9, num3.intValue());
                    }
                    Integer num4 = this.f119367m;
                    if (num4 != null) {
                        iB += u6.r(10, num4.intValue());
                    }
                    Integer num5 = this.f119368n;
                    if (num5 != null) {
                        iB += u6.r(11, num5.intValue());
                    }
                    e3.a.h.d.c cVar = this.f119369o;
                    if (cVar != null && cVar != null) {
                        iB += u6.r(12, cVar.i());
                    }
                    Integer num6 = this.f119370s;
                    if (num6 != null) {
                        iB += u6.r(13, num6.intValue());
                    }
                    Integer num7 = this.f119371t;
                    if (num7 != null) {
                        iB += u6.r(14, num7.intValue());
                    }
                    Integer num8 = this.f119372v;
                    if (num8 != null) {
                        iB += u6.r(15, num8.intValue());
                    }
                    Boolean bool = this.f119362h;
                    if (bool != null) {
                        bool.getClass();
                        iB += u6.q(16) + 1;
                    }
                    Integer num9 = this.f119373w;
                    return num9 != null ? iB + u6.r(17, num9.intValue()) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    String str = this.f119357c;
                    if (str != null) {
                        u6Var.m(1, str);
                    }
                    String str2 = this.f119358d;
                    if (str2 != null) {
                        u6Var.m(2, str2);
                    }
                    String str3 = this.f119359e;
                    if (str3 != null) {
                        u6Var.m(3, str3);
                    }
                    String str4 = this.f119360f;
                    if (str4 != null) {
                        u6Var.m(4, str4);
                    }
                    String str5 = this.f119361g;
                    if (str5 != null) {
                        u6Var.m(5, str5);
                    }
                    Integer num = this.f119363i;
                    if (num != null) {
                        u6Var.i(6, num.intValue());
                    }
                    String str6 = this.f119364j;
                    if (str6 != null) {
                        u6Var.m(7, str6);
                    }
                    Integer num2 = this.f119365k;
                    if (num2 != null) {
                        u6Var.i(8, num2.intValue());
                    }
                    Integer num3 = this.f119366l;
                    if (num3 != null) {
                        u6Var.i(9, num3.intValue());
                    }
                    Integer num4 = this.f119367m;
                    if (num4 != null) {
                        u6Var.i(10, num4.intValue());
                    }
                    Integer num5 = this.f119368n;
                    if (num5 != null) {
                        u6Var.i(11, num5.intValue());
                    }
                    e3.a.h.d.c cVar = this.f119369o;
                    if (cVar != null && cVar != null) {
                        u6Var.i(12, cVar.i());
                    }
                    Integer num6 = this.f119370s;
                    if (num6 != null) {
                        u6Var.i(13, num6.intValue());
                    }
                    Integer num7 = this.f119371t;
                    if (num7 != null) {
                        u6Var.i(14, num7.intValue());
                    }
                    Integer num8 = this.f119372v;
                    if (num8 != null) {
                        u6Var.i(15, num8.intValue());
                    }
                    Boolean bool = this.f119362h;
                    if (bool != null) {
                        u6Var.n(16, bool.booleanValue());
                    }
                    Integer num9 = this.f119373w;
                    if (num9 != null) {
                        u6Var.i(17, num9.intValue());
                    }
                    super.k(u6Var);
                }

                public final b q() {
                    this.f119357c = null;
                    this.f119358d = null;
                    this.f119359e = null;
                    this.f119360f = null;
                    this.f119361g = null;
                    this.f119362h = null;
                    this.f119363i = null;
                    this.f119364j = null;
                    this.f119365k = null;
                    this.f119366l = null;
                    this.f119367m = null;
                    this.f119368n = null;
                    this.f119369o = null;
                    this.f119370s = null;
                    this.f119371t = null;
                    this.f119372v = null;
                    this.f119373w = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final b l() {
                    try {
                        return (b) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final b e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        switch (iA) {
                            case 0:
                                break;
                            case 10:
                                this.f119357c = t6Var.l();
                                continue;
                            case 18:
                                this.f119358d = t6Var.l();
                                continue;
                            case 26:
                                this.f119359e = t6Var.l();
                                continue;
                            case 34:
                                this.f119360f = t6Var.l();
                                continue;
                            case 42:
                                this.f119361g = t6Var.l();
                                continue;
                            case 48:
                                this.f119363i = Integer.valueOf(t6Var.n());
                                continue;
                            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                                this.f119364j = t6Var.l();
                                continue;
                            case 64:
                                this.f119365k = Integer.valueOf(t6Var.n());
                                continue;
                            case 72:
                                this.f119366l = Integer.valueOf(t6Var.n());
                                continue;
                            case 80:
                                this.f119367m = Integer.valueOf(t6Var.n());
                                continue;
                            case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                                this.f119368n = Integer.valueOf(t6Var.n());
                                continue;
                            case 96:
                                int iT = t6Var.t();
                                int iN = t6Var.n();
                                if (iN == 0 || iN == 1 || iN == 2) {
                                    this.f119369o = e3.a.h.d.c.b(iN);
                                    continue;
                                } else {
                                    t6Var.o(iT);
                                    n(t6Var, iA);
                                }
                                break;
                            case 104:
                                int iT2 = t6Var.t();
                                try {
                                    this.f119370s = Integer.valueOf(p(t6Var.n()));
                                    continue;
                                } catch (IllegalArgumentException unused) {
                                    t6Var.o(iT2);
                                    n(t6Var, iA);
                                }
                                break;
                            case com.planner5d.library.engine.input.f.b.B /* 112 */:
                                this.f119371t = Integer.valueOf(t6Var.n());
                                continue;
                            case 120:
                                this.f119372v = Integer.valueOf(t6Var.n());
                                continue;
                            case 128:
                                this.f119362h = Boolean.valueOf(t6Var.k());
                                continue;
                            case 136:
                                this.f119373w = Integer.valueOf(t6Var.n());
                                continue;
                            default:
                                if (!super.n(t6Var, iA)) {
                                }
                                break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$q$c */
            public static final class c extends w6<c> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.h.e.c f119374c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Long f119375d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public String f119376e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public C1089a f119377f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public f7.a f119378g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public C1104a f119379h;

                /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$q$c$a, reason: collision with other inner class name */
                public static final class C1104a extends w6<C1104a> implements Cloneable {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public e3.a.h.e.b.EnumC1292b f119380c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Boolean f119381d;

                    public C1104a() {
                        p();
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    protected final int b() {
                        int iB = super.b();
                        e3.a.h.e.b.EnumC1292b enumC1292b = this.f119380c;
                        if (enumC1292b != null && enumC1292b != null) {
                            iB += u6.r(1, enumC1292b.i());
                        }
                        Boolean bool = this.f119381d;
                        if (bool != null) {
                            bool.getClass();
                            iB += u6.q(2) + 1;
                        }
                        return iB;
                    }

                    @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                    public final void k(u6 u6Var) throws IOException {
                        e3.a.h.e.b.EnumC1292b enumC1292b = this.f119380c;
                        if (enumC1292b != null && enumC1292b != null) {
                            u6Var.i(1, enumC1292b.i());
                        }
                        Boolean bool = this.f119381d;
                        if (bool != null) {
                            u6Var.n(2, bool.booleanValue());
                        }
                        super.k(u6Var);
                    }

                    public final C1104a p() {
                        this.f119380c = null;
                        this.f119381d = null;
                        this.f129659b = null;
                        this.f127766a = -1;
                        return this;
                    }

                    @Override // com.google.vr.sdk.deps.w6
                    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                    public final C1104a l() {
                        try {
                            return (C1104a) super.l();
                        } catch (CloneNotSupportedException e10) {
                            throw new AssertionError(e10);
                        }
                    }

                    @Override // com.google.vr.sdk.deps.c7
                    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                    public final C1104a e(t6 t6Var) throws IOException {
                        while (true) {
                            int iA = t6Var.a();
                            if (iA != 0) {
                                if (iA == 8) {
                                    int iT = t6Var.t();
                                    int iN = t6Var.n();
                                    switch (iN) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            this.f119380c = e3.a.h.e.b.EnumC1292b.b(iN);
                                            break;
                                        default:
                                            t6Var.o(iT);
                                            n(t6Var, iA);
                                            break;
                                    }
                                } else if (iA == 16) {
                                    this.f119381d = Boolean.valueOf(t6Var.k());
                                } else if (!super.n(t6Var, iA)) {
                                }
                            }
                        }
                        return this;
                    }
                }

                public c() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.h.e.c cVar = this.f119374c;
                    if (cVar != null && cVar != null) {
                        iB += u6.r(1, cVar.i());
                    }
                    Long l10 = this.f119375d;
                    if (l10 != null) {
                        iB += u6.s(2, l10.longValue());
                    }
                    String str = this.f119376e;
                    if (str != null) {
                        iB += u6.u(3, str);
                    }
                    C1089a c1089a = this.f119377f;
                    if (c1089a != null) {
                        iB += u6.t(4, c1089a);
                    }
                    f7.a aVar = this.f119378g;
                    if (aVar != null) {
                        iB += t2.V(5, aVar);
                    }
                    C1104a c1104a = this.f119379h;
                    return c1104a != null ? iB + u6.t(6, c1104a) : iB;
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.h.e.c cVar = this.f119374c;
                    if (cVar != null && cVar != null) {
                        u6Var.i(1, cVar.i());
                    }
                    Long l10 = this.f119375d;
                    if (l10 != null) {
                        u6Var.j(2, l10.longValue());
                    }
                    String str = this.f119376e;
                    if (str != null) {
                        u6Var.m(3, str);
                    }
                    C1089a c1089a = this.f119377f;
                    if (c1089a != null) {
                        u6Var.l(4, c1089a);
                    }
                    f7.a aVar = this.f119378g;
                    if (aVar != null) {
                        u6Var.k(5, aVar);
                    }
                    C1104a c1104a = this.f119379h;
                    if (c1104a != null) {
                        u6Var.l(6, c1104a);
                    }
                    super.k(u6Var);
                }

                public final c p() {
                    this.f119374c = null;
                    this.f119375d = null;
                    this.f119376e = null;
                    this.f119377f = null;
                    this.f119378g = null;
                    this.f119379h = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final c l() {
                    try {
                        c cVar = (c) super.l();
                        C1089a c1089a = this.f119377f;
                        if (c1089a != null) {
                            cVar.f119377f = c1089a.clone();
                        }
                        f7.a aVar = this.f119378g;
                        if (aVar != null) {
                            cVar.f119378g = aVar;
                        }
                        C1104a c1104a = this.f119379h;
                        if (c1104a != null) {
                            cVar.f119379h = c1104a.l();
                        }
                        return cVar;
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final c e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2 || iN == 3) {
                                this.f119374c = e3.a.h.e.c.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (iA == 16) {
                            this.f119375d = Long.valueOf(t6Var.p());
                        } else if (iA == 26) {
                            this.f119376e = t6Var.l();
                        } else if (iA == 34) {
                            if (this.f119377f == null) {
                                this.f119377f = new C1089a();
                            }
                            t6Var.e(this.f119377f);
                        } else if (iA == 42) {
                            f7.a aVarBuild = (f7.a) t6Var.b(f7.a.B());
                            f7.a aVar = this.f119378g;
                            if (aVar != null) {
                                aVarBuild = aVar.r1().l(aVarBuild).build();
                            }
                            this.f119378g = aVarBuild;
                        } else if (iA == 50) {
                            if (this.f119379h == null) {
                                this.f119379h = new C1104a();
                            }
                            t6Var.e(this.f119379h);
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.google.common.logging.nano.a$a$q$d */
            public static final class d extends w6<d> implements Cloneable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public e3.a.h.g.b f119382c;

                public d() {
                    p();
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                protected final int b() {
                    int iB = super.b();
                    e3.a.h.g.b bVar = this.f119382c;
                    return (bVar == null || bVar == null) ? iB : iB + u6.r(1, bVar.i());
                }

                @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
                public final void k(u6 u6Var) throws IOException {
                    e3.a.h.g.b bVar = this.f119382c;
                    if (bVar != null && bVar != null) {
                        u6Var.i(1, bVar.i());
                    }
                    super.k(u6Var);
                }

                public final d p() {
                    this.f119382c = null;
                    this.f129659b = null;
                    this.f127766a = -1;
                    return this;
                }

                @Override // com.google.vr.sdk.deps.w6
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final d l() {
                    try {
                        return (d) super.l();
                    } catch (CloneNotSupportedException e10) {
                        throw new AssertionError(e10);
                    }
                }

                @Override // com.google.vr.sdk.deps.c7
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final d e(t6 t6Var) throws IOException {
                    while (true) {
                        int iA = t6Var.a();
                        if (iA == 0) {
                            break;
                        }
                        if (iA == 8) {
                            int iT = t6Var.t();
                            int iN = t6Var.n();
                            if (iN == 0 || iN == 1 || iN == 2) {
                                this.f119382c = e3.a.h.g.b.b(iN);
                            } else {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                        } else if (!super.n(t6Var, iA)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public q() {
                r();
            }

            public static int p(int i10) {
                if (i10 >= 0 && i10 <= 3) {
                    return i10;
                }
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append(i10);
                sb2.append(" is not a valid enum CompositionType");
                throw new IllegalArgumentException(sb2.toString());
            }

            public static int q(int i10) {
                if ((i10 < 0 || i10 > 8) && ((i10 < 101 || i10 > 129) && ((i10 < 151 || i10 > 153) && ((i10 < 176 || i10 > 192) && ((i10 < 201 || i10 > 203) && ((i10 < 301 || i10 > 301) && ((i10 < 401 || i10 > 402) && ((i10 < 501 || i10 > 503) && ((i10 < 510 || i10 > 515) && (i10 < 520 || i10 > 525)))))))))) {
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append(i10);
                    sb2.append(" is not a valid enum ErrorCode");
                    throw new IllegalArgumentException(sb2.toString());
                }
                return i10;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                Integer num = this.f119344d;
                if (num != null) {
                    iB += u6.r(1, num.intValue());
                }
                e3.a.h.EnumC1294h enumC1294h = this.f119345e;
                if (enumC1294h != null && enumC1294h != null) {
                    iB += u6.r(2, enumC1294h.i());
                }
                C1089a c1089a = this.f119346f;
                if (c1089a != null) {
                    iB += u6.t(3, c1089a);
                }
                Integer num2 = this.f119347g;
                if (num2 != null) {
                    iB += u6.r(4, num2.intValue());
                }
                C1089a c1089a2 = this.f119348h;
                if (c1089a2 != null) {
                    iB += u6.t(5, c1089a2);
                }
                b bVar = this.f119349i;
                if (bVar != null) {
                    iB += u6.t(6, bVar);
                }
                c cVar = this.f119350j;
                if (cVar != null) {
                    iB += u6.t(7, cVar);
                }
                Boolean bool = this.f119351k;
                if (bool != null) {
                    bool.getClass();
                    iB += u6.q(8) + 1;
                }
                C1103a c1103a = this.f119352l;
                if (c1103a != null) {
                    iB += u6.t(9, c1103a);
                }
                Integer num3 = this.f119353m;
                if (num3 != null) {
                    iB += u6.r(10, num3.intValue());
                }
                Long l10 = this.f119343c;
                if (l10 != null) {
                    iB += u6.s(11, l10.longValue());
                }
                d dVar = this.f119354n;
                if (dVar != null) {
                    iB += u6.t(12, dVar);
                }
                Integer num4 = this.f119355o;
                return num4 != null ? iB + u6.r(13, num4.intValue()) : iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                Integer num = this.f119344d;
                if (num != null) {
                    u6Var.i(1, num.intValue());
                }
                e3.a.h.EnumC1294h enumC1294h = this.f119345e;
                if (enumC1294h != null && enumC1294h != null) {
                    u6Var.i(2, enumC1294h.i());
                }
                C1089a c1089a = this.f119346f;
                if (c1089a != null) {
                    u6Var.l(3, c1089a);
                }
                Integer num2 = this.f119347g;
                if (num2 != null) {
                    u6Var.i(4, num2.intValue());
                }
                C1089a c1089a2 = this.f119348h;
                if (c1089a2 != null) {
                    u6Var.l(5, c1089a2);
                }
                b bVar = this.f119349i;
                if (bVar != null) {
                    u6Var.l(6, bVar);
                }
                c cVar = this.f119350j;
                if (cVar != null) {
                    u6Var.l(7, cVar);
                }
                Boolean bool = this.f119351k;
                if (bool != null) {
                    u6Var.n(8, bool.booleanValue());
                }
                C1103a c1103a = this.f119352l;
                if (c1103a != null) {
                    u6Var.l(9, c1103a);
                }
                Integer num3 = this.f119353m;
                if (num3 != null) {
                    u6Var.i(10, num3.intValue());
                }
                Long l10 = this.f119343c;
                if (l10 != null) {
                    u6Var.j(11, l10.longValue());
                }
                d dVar = this.f119354n;
                if (dVar != null) {
                    u6Var.l(12, dVar);
                }
                Integer num4 = this.f119355o;
                if (num4 != null) {
                    u6Var.i(13, num4.intValue());
                }
                super.k(u6Var);
            }

            public final q r() {
                this.f119343c = null;
                this.f119344d = null;
                this.f119345e = null;
                this.f119346f = null;
                this.f119347g = null;
                this.f119348h = null;
                this.f119349i = null;
                this.f119350j = null;
                this.f119351k = null;
                this.f119352l = null;
                this.f119353m = null;
                this.f119354n = null;
                this.f119355o = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final q l() {
                try {
                    q qVar = (q) super.l();
                    C1089a c1089a = this.f119346f;
                    if (c1089a != null) {
                        qVar.f119346f = c1089a.clone();
                    }
                    C1089a c1089a2 = this.f119348h;
                    if (c1089a2 != null) {
                        qVar.f119348h = c1089a2.clone();
                    }
                    b bVar = this.f119349i;
                    if (bVar != null) {
                        qVar.f119349i = bVar.l();
                    }
                    c cVar = this.f119350j;
                    if (cVar != null) {
                        qVar.f119350j = cVar.l();
                    }
                    C1103a c1103a = this.f119352l;
                    if (c1103a != null) {
                        qVar.f119352l = c1103a.l();
                    }
                    d dVar = this.f119354n;
                    if (dVar != null) {
                        qVar.f119354n = dVar.l();
                    }
                    return qVar;
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final q e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    switch (iA) {
                        case 0:
                            break;
                        case 8:
                            int iT = t6Var.t();
                            try {
                                this.f119344d = Integer.valueOf(q(t6Var.n()));
                            } catch (IllegalArgumentException unused) {
                                t6Var.o(iT);
                                n(t6Var, iA);
                            }
                            break;
                        case 16:
                            int iT2 = t6Var.t();
                            int iN = t6Var.n();
                            switch (iN) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                    this.f119345e = e3.a.h.EnumC1294h.b(iN);
                                    break;
                                default:
                                    t6Var.o(iT2);
                                    n(t6Var, iA);
                                    break;
                            }
                            break;
                        case 26:
                            if (this.f119346f == null) {
                                this.f119346f = new C1089a();
                            }
                            t6Var.e(this.f119346f);
                            break;
                        case 32:
                            this.f119347g = Integer.valueOf(t6Var.n());
                            break;
                        case 42:
                            if (this.f119348h == null) {
                                this.f119348h = new C1089a();
                            }
                            t6Var.e(this.f119348h);
                            break;
                        case 50:
                            if (this.f119349i == null) {
                                this.f119349i = new b();
                            }
                            t6Var.e(this.f119349i);
                            break;
                        case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                            if (this.f119350j == null) {
                                this.f119350j = new c();
                            }
                            t6Var.e(this.f119350j);
                            break;
                        case 64:
                            this.f119351k = Boolean.valueOf(t6Var.k());
                            break;
                        case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                            if (this.f119352l == null) {
                                this.f119352l = new C1103a();
                            }
                            t6Var.e(this.f119352l);
                            break;
                        case 80:
                            this.f119353m = Integer.valueOf(t6Var.n());
                            break;
                        case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                            this.f119343c = Long.valueOf(t6Var.p());
                            break;
                        case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                            if (this.f119354n == null) {
                                this.f119354n = new d();
                            }
                            t6Var.e(this.f119354n);
                            break;
                        case 104:
                            int iT3 = t6Var.t();
                            try {
                                this.f119355o = Integer.valueOf(p(t6Var.n()));
                            } catch (IllegalArgumentException unused2) {
                                t6Var.o(iT3);
                                n(t6Var, iA);
                            }
                            break;
                        default:
                            if (!super.n(t6Var, iA)) {
                            }
                            break;
                    }
                }
                return this;
            }
        }

        public C1088a() {
            p();
        }

        public static C1088a s(byte[] bArr) throws b7 {
            return (C1088a) c7.f(new C1088a(), bArr);
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            com.google.common.logging.nano.b.a.C1105a c1105a = this.f119070e;
            if (c1105a != null) {
                int i10 = 5 << 1;
                iB += u6.t(1, c1105a);
            }
            C1089a c1089a = this.f119071f;
            if (c1089a != null) {
                iB += u6.t(2, c1089a);
            }
            Long l10 = this.f119072g;
            if (l10 != null) {
                iB += u6.s(3, l10.longValue());
            }
            C1089a[] c1089aArr = this.f119074h;
            if (c1089aArr != null && c1089aArr.length > 0) {
                int i11 = 0;
                while (true) {
                    C1089a[] c1089aArr2 = this.f119074h;
                    if (i11 >= c1089aArr2.length) {
                        break;
                    }
                    C1089a c1089a2 = c1089aArr2[i11];
                    if (c1089a2 != null) {
                        iB += u6.t(4, c1089a2);
                    }
                    i11++;
                }
            }
            b bVar = this.f119076i;
            if (bVar != null) {
                iB += u6.t(5, bVar);
            }
            k kVar = this.f119078j;
            if (kVar != null) {
                iB += u6.t(6, kVar);
            }
            String str = this.f119080k;
            if (str != null) {
                iB += u6.u(7, str);
            }
            e3.a.l lVar = this.f119082l;
            if (lVar != null && lVar != null) {
                iB += u6.r(8, lVar.i());
            }
            i iVar = this.f119084m;
            if (iVar != null) {
                iB += u6.t(9, iVar);
            }
            e3.a.i0 i0Var = this.f119086n;
            if (i0Var != null) {
                iB += t2.V(10, i0Var);
            }
            e3.a.k kVar2 = this.f119088o;
            if (kVar2 != null) {
                iB += t2.V(11, kVar2);
            }
            e3.a.q qVar = this.f119093s;
            if (qVar != null) {
                iB += t2.V(12, qVar);
            }
            q qVar2 = this.f119094t;
            if (qVar2 != null) {
                iB += u6.t(13, qVar2);
            }
            e3.a.p pVar = this.f119095v;
            if (pVar != null) {
                iB += t2.V(14, pVar);
            }
            e3.a.z zVar = this.f119096w;
            if (zVar != null) {
                iB += t2.V(15, zVar);
            }
            f fVar = this.X;
            if (fVar != null) {
                iB += u6.t(16, fVar);
            }
            l lVar2 = this.Y;
            if (lVar2 != null) {
                iB += u6.t(17, lVar2);
            }
            h hVar = this.Z;
            if (hVar != null) {
                iB += u6.t(18, hVar);
            }
            e3.a.c cVar = this.f119090p0;
            if (cVar != null) {
                iB += t2.V(19, cVar);
            }
            e3.a.e0 e0Var = this.f119091p1;
            if (e0Var != null) {
                iB += t2.V(20, e0Var);
            }
            e3.a.i iVar2 = this.H1;
            if (iVar2 != null) {
                iB += t2.V(21, iVar2);
            }
            m mVar = this.f119092p2;
            if (mVar != null) {
                iB += u6.t(22, mVar);
            }
            e3.a.u uVar = this.f119073g3;
            if (uVar != null) {
                iB += t2.V(23, uVar);
            }
            e3.a.x xVar = this.f119075h3;
            if (xVar != null) {
                iB += t2.V(24, xVar);
            }
            j jVar = this.f119077i3;
            if (jVar != null) {
                iB += u6.t(25, jVar);
            }
            e3.a.j jVar2 = this.f119079j3;
            if (jVar2 != null) {
                iB += t2.V(26, jVar2);
            }
            d dVar = this.f119081k3;
            if (dVar != null) {
                iB += u6.t(27, dVar);
            }
            e eVar = this.f119083l3;
            if (eVar != null) {
                iB += u6.t(28, eVar);
            }
            n nVar = this.f119085m3;
            if (nVar != null) {
                iB += u6.t(29, nVar);
            }
            e3.a.s sVar = this.f119068c;
            if (sVar != null && sVar != null) {
                iB += u6.r(30, sVar.i());
            }
            c cVar2 = this.f119087n3;
            if (cVar2 != null) {
                iB += u6.t(31, cVar2);
            }
            g gVar = this.f119069d;
            if (gVar != null) {
                iB += u6.t(32, gVar);
            }
            e3.a.g gVar2 = this.f119089o3;
            if (gVar2 != null) {
                iB += t2.V(33, gVar2);
            }
            return iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            com.google.common.logging.nano.b.a.C1105a c1105a = this.f119070e;
            if (c1105a != null) {
                u6Var.l(1, c1105a);
            }
            C1089a c1089a = this.f119071f;
            if (c1089a != null) {
                u6Var.l(2, c1089a);
            }
            Long l10 = this.f119072g;
            if (l10 != null) {
                u6Var.j(3, l10.longValue());
            }
            C1089a[] c1089aArr = this.f119074h;
            if (c1089aArr != null && c1089aArr.length > 0) {
                int i10 = 0;
                while (true) {
                    C1089a[] c1089aArr2 = this.f119074h;
                    if (i10 >= c1089aArr2.length) {
                        break;
                    }
                    C1089a c1089a2 = c1089aArr2[i10];
                    if (c1089a2 != null) {
                        u6Var.l(4, c1089a2);
                    }
                    i10++;
                }
            }
            b bVar = this.f119076i;
            if (bVar != null) {
                u6Var.l(5, bVar);
            }
            k kVar = this.f119078j;
            if (kVar != null) {
                u6Var.l(6, kVar);
            }
            String str = this.f119080k;
            if (str != null) {
                u6Var.m(7, str);
            }
            e3.a.l lVar = this.f119082l;
            if (lVar != null && lVar != null) {
                u6Var.i(8, lVar.i());
            }
            i iVar = this.f119084m;
            if (iVar != null) {
                u6Var.l(9, iVar);
            }
            e3.a.i0 i0Var = this.f119086n;
            if (i0Var != null) {
                u6Var.k(10, i0Var);
            }
            e3.a.k kVar2 = this.f119088o;
            if (kVar2 != null) {
                u6Var.k(11, kVar2);
            }
            e3.a.q qVar = this.f119093s;
            if (qVar != null) {
                u6Var.k(12, qVar);
            }
            q qVar2 = this.f119094t;
            if (qVar2 != null) {
                u6Var.l(13, qVar2);
            }
            e3.a.p pVar = this.f119095v;
            if (pVar != null) {
                u6Var.k(14, pVar);
            }
            e3.a.z zVar = this.f119096w;
            if (zVar != null) {
                u6Var.k(15, zVar);
            }
            f fVar = this.X;
            if (fVar != null) {
                u6Var.l(16, fVar);
            }
            l lVar2 = this.Y;
            if (lVar2 != null) {
                u6Var.l(17, lVar2);
            }
            h hVar = this.Z;
            if (hVar != null) {
                u6Var.l(18, hVar);
            }
            e3.a.c cVar = this.f119090p0;
            if (cVar != null) {
                u6Var.k(19, cVar);
            }
            e3.a.e0 e0Var = this.f119091p1;
            if (e0Var != null) {
                u6Var.k(20, e0Var);
            }
            e3.a.i iVar2 = this.H1;
            if (iVar2 != null) {
                u6Var.k(21, iVar2);
            }
            m mVar = this.f119092p2;
            if (mVar != null) {
                u6Var.l(22, mVar);
            }
            e3.a.u uVar = this.f119073g3;
            if (uVar != null) {
                u6Var.k(23, uVar);
            }
            e3.a.x xVar = this.f119075h3;
            if (xVar != null) {
                u6Var.k(24, xVar);
            }
            j jVar = this.f119077i3;
            if (jVar != null) {
                u6Var.l(25, jVar);
            }
            e3.a.j jVar2 = this.f119079j3;
            if (jVar2 != null) {
                u6Var.k(26, jVar2);
            }
            d dVar = this.f119081k3;
            if (dVar != null) {
                u6Var.l(27, dVar);
            }
            e eVar = this.f119083l3;
            if (eVar != null) {
                u6Var.l(28, eVar);
            }
            n nVar = this.f119085m3;
            if (nVar != null) {
                u6Var.l(29, nVar);
            }
            e3.a.s sVar = this.f119068c;
            if (sVar != null && sVar != null) {
                u6Var.i(30, sVar.i());
            }
            c cVar2 = this.f119087n3;
            if (cVar2 != null) {
                u6Var.l(31, cVar2);
            }
            g gVar = this.f119069d;
            if (gVar != null) {
                u6Var.l(32, gVar);
            }
            e3.a.g gVar2 = this.f119089o3;
            if (gVar2 != null) {
                u6Var.k(33, gVar2);
            }
            super.k(u6Var);
        }

        public final C1088a p() {
            this.f119068c = null;
            this.f119069d = null;
            this.f119070e = null;
            this.f119071f = null;
            this.f119072g = null;
            this.f119074h = C1089a.r();
            this.f119076i = null;
            this.f119078j = null;
            this.f119080k = null;
            this.f119082l = null;
            this.f119084m = null;
            this.f119086n = null;
            this.f119088o = null;
            this.f119093s = null;
            this.f119094t = null;
            this.f119095v = null;
            this.f119096w = null;
            this.X = null;
            this.Y = null;
            this.Z = null;
            this.f119090p0 = null;
            this.f119091p1 = null;
            this.H1 = null;
            this.f119092p2 = null;
            this.f119073g3 = null;
            this.f119075h3 = null;
            this.f119077i3 = null;
            this.f119079j3 = null;
            this.f119081k3 = null;
            this.f119083l3 = null;
            this.f119085m3 = null;
            this.f119087n3 = null;
            this.f119089o3 = null;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final C1088a l() {
            try {
                C1088a c1088a = (C1088a) super.l();
                g gVar = this.f119069d;
                if (gVar != null) {
                    c1088a.f119069d = gVar.l();
                }
                com.google.common.logging.nano.b.a.C1105a c1105a = this.f119070e;
                if (c1105a != null) {
                    c1088a.f119070e = c1105a.l();
                }
                C1089a c1089a = this.f119071f;
                if (c1089a != null) {
                    c1088a.f119071f = c1089a.clone();
                }
                C1089a[] c1089aArr = this.f119074h;
                if (c1089aArr != null && c1089aArr.length > 0) {
                    c1088a.f119074h = new C1089a[c1089aArr.length];
                    int i10 = 0;
                    while (true) {
                        C1089a[] c1089aArr2 = this.f119074h;
                        if (i10 >= c1089aArr2.length) {
                            break;
                        }
                        C1089a c1089a2 = c1089aArr2[i10];
                        if (c1089a2 != null) {
                            c1088a.f119074h[i10] = c1089a2.clone();
                        }
                        i10++;
                    }
                }
                b bVar = this.f119076i;
                if (bVar != null) {
                    c1088a.f119076i = bVar.l();
                }
                k kVar = this.f119078j;
                if (kVar != null) {
                    c1088a.f119078j = kVar.l();
                }
                i iVar = this.f119084m;
                if (iVar != null) {
                    c1088a.f119084m = iVar.l();
                }
                e3.a.i0 i0Var = this.f119086n;
                if (i0Var != null) {
                    c1088a.f119086n = i0Var;
                }
                e3.a.k kVar2 = this.f119088o;
                if (kVar2 != null) {
                    c1088a.f119088o = kVar2;
                }
                e3.a.q qVar = this.f119093s;
                if (qVar != null) {
                    c1088a.f119093s = qVar;
                }
                q qVar2 = this.f119094t;
                if (qVar2 != null) {
                    c1088a.f119094t = qVar2.l();
                }
                e3.a.p pVar = this.f119095v;
                if (pVar != null) {
                    c1088a.f119095v = pVar;
                }
                e3.a.z zVar = this.f119096w;
                if (zVar != null) {
                    c1088a.f119096w = zVar;
                }
                f fVar = this.X;
                if (fVar != null) {
                    c1088a.X = fVar.l();
                }
                l lVar = this.Y;
                if (lVar != null) {
                    c1088a.Y = lVar.l();
                }
                h hVar = this.Z;
                if (hVar != null) {
                    c1088a.Z = hVar.l();
                }
                e3.a.c cVar = this.f119090p0;
                if (cVar != null) {
                    c1088a.f119090p0 = cVar;
                }
                e3.a.e0 e0Var = this.f119091p1;
                if (e0Var != null) {
                    c1088a.f119091p1 = e0Var;
                }
                e3.a.i iVar2 = this.H1;
                if (iVar2 != null) {
                    c1088a.H1 = iVar2;
                }
                m mVar = this.f119092p2;
                if (mVar != null) {
                    c1088a.f119092p2 = mVar.l();
                }
                e3.a.u uVar = this.f119073g3;
                if (uVar != null) {
                    c1088a.f119073g3 = uVar;
                }
                e3.a.x xVar = this.f119075h3;
                if (xVar != null) {
                    c1088a.f119075h3 = xVar;
                }
                j jVar = this.f119077i3;
                if (jVar != null) {
                    c1088a.f119077i3 = jVar.l();
                }
                e3.a.j jVar2 = this.f119079j3;
                if (jVar2 != null) {
                    c1088a.f119079j3 = jVar2;
                }
                d dVar = this.f119081k3;
                if (dVar != null) {
                    c1088a.f119081k3 = dVar.l();
                }
                e eVar = this.f119083l3;
                if (eVar != null) {
                    c1088a.f119083l3 = eVar.l();
                }
                n nVar = this.f119085m3;
                if (nVar != null) {
                    c1088a.f119085m3 = nVar.l();
                }
                c cVar2 = this.f119087n3;
                if (cVar2 != null) {
                    c1088a.f119087n3 = cVar2.l();
                }
                e3.a.g gVar2 = this.f119089o3;
                if (gVar2 != null) {
                    c1088a.f119089o3 = gVar2;
                }
                return c1088a;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final C1088a e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                switch (iA) {
                    case 0:
                        break;
                    case 10:
                        if (this.f119070e == null) {
                            this.f119070e = new com.google.common.logging.nano.b.a.C1105a();
                        }
                        t6Var.e(this.f119070e);
                        continue;
                    case 18:
                        if (this.f119071f == null) {
                            this.f119071f = new C1089a();
                        }
                        t6Var.e(this.f119071f);
                        continue;
                    case 24:
                        this.f119072g = Long.valueOf(t6Var.p());
                        continue;
                    case 34:
                        int iA2 = e7.a(t6Var, 34);
                        C1089a[] c1089aArr = this.f119074h;
                        int length = c1089aArr == null ? 0 : c1089aArr.length;
                        int i10 = iA2 + length;
                        C1089a[] c1089aArr2 = new C1089a[i10];
                        if (length != 0) {
                            System.arraycopy(c1089aArr, 0, c1089aArr2, 0, length);
                        }
                        while (length < i10 - 1) {
                            C1089a c1089a = new C1089a();
                            c1089aArr2[length] = c1089a;
                            t6Var.e(c1089a);
                            t6Var.a();
                            length++;
                        }
                        C1089a c1089a2 = new C1089a();
                        c1089aArr2[length] = c1089a2;
                        t6Var.e(c1089a2);
                        this.f119074h = c1089aArr2;
                        continue;
                    case 42:
                        if (this.f119076i == null) {
                            this.f119076i = new b();
                        }
                        t6Var.e(this.f119076i);
                        continue;
                    case 50:
                        if (this.f119078j == null) {
                            this.f119078j = new k();
                        }
                        t6Var.e(this.f119078j);
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                        this.f119080k = t6Var.l();
                        continue;
                    case 64:
                        int iT = t6Var.t();
                        int iN = t6Var.n();
                        if (iN != 11 && iN != 21) {
                            switch (iN) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    t6Var.o(iT);
                                    n(t6Var, iA);
                                    continue;
                            }
                        }
                        this.f119082l = e3.a.l.b(iN);
                        continue;
                    case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                        if (this.f119084m == null) {
                            this.f119084m = new i();
                        }
                        t6Var.e(this.f119084m);
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160705l0 /* 82 */:
                        e3.a.i0 i0VarBuild = (e3.a.i0) t6Var.b(e3.a.i0.B());
                        e3.a.i0 i0Var = this.f119086n;
                        if (i0Var != null) {
                            i0VarBuild = i0Var.r1().l(i0VarBuild).build();
                        }
                        this.f119086n = i0VarBuild;
                        continue;
                    case 90:
                        e3.a.k kVarBuild = (e3.a.k) t6Var.b(e3.a.k.B());
                        e3.a.k kVar = this.f119088o;
                        if (kVar != null) {
                            kVarBuild = kVar.r1().l(kVarBuild).build();
                        }
                        this.f119088o = kVarBuild;
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                        e3.a.q qVarBuild = (e3.a.q) t6Var.b(e3.a.q.B());
                        e3.a.q qVar = this.f119093s;
                        if (qVar != null) {
                            qVarBuild = qVar.r1().l(qVarBuild).build();
                        }
                        this.f119093s = qVarBuild;
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160742x1 /* 106 */:
                        if (this.f119094t == null) {
                            this.f119094t = new q();
                        }
                        t6Var.e(this.f119094t);
                        continue;
                    case 114:
                        e3.a.p pVarBuild = (e3.a.p) t6Var.b(e3.a.p.B());
                        e3.a.p pVar = this.f119095v;
                        if (pVar != null) {
                            pVarBuild = pVar.r1().l(pVarBuild).build();
                        }
                        this.f119095v = pVarBuild;
                        continue;
                    case 122:
                        e3.a.z zVarBuild = (e3.a.z) t6Var.b(e3.a.z.B());
                        e3.a.z zVar = this.f119096w;
                        if (zVar != null) {
                            zVarBuild = zVar.r1().l(zVarBuild).build();
                        }
                        this.f119096w = zVarBuild;
                        continue;
                    case 130:
                        if (this.X == null) {
                            this.X = new f();
                        }
                        t6Var.e(this.X);
                        continue;
                    case 138:
                        if (this.Y == null) {
                            this.Y = new l();
                        }
                        t6Var.e(this.Y);
                        continue;
                    case 146:
                        if (this.Z == null) {
                            this.Z = new h();
                        }
                        t6Var.e(this.Z);
                        continue;
                    case androidx.media2.widget.f.i.f59793p0 /* 154 */:
                        e3.a.c cVarBuild = (e3.a.c) t6Var.b(e3.a.c.B());
                        e3.a.c cVar = this.f119090p0;
                        if (cVar != null) {
                            cVarBuild = cVar.r1().l(cVarBuild).build();
                        }
                        this.f119090p0 = cVarBuild;
                        continue;
                    case 162:
                        e3.a.e0 e0VarBuild = (e3.a.e0) t6Var.b(e3.a.e0.B());
                        e3.a.e0 e0Var = this.f119091p1;
                        if (e0Var != null) {
                            e0VarBuild = e0Var.r1().l(e0VarBuild).build();
                        }
                        this.f119091p1 = e0VarBuild;
                        continue;
                    case 170:
                        e3.a.i iVarBuild = (e3.a.i) t6Var.b(e3.a.i.B());
                        e3.a.i iVar = this.H1;
                        if (iVar != null) {
                            iVarBuild = iVar.r1().l(iVarBuild).build();
                        }
                        this.H1 = iVarBuild;
                        continue;
                    case 178:
                        if (this.f119092p2 == null) {
                            this.f119092p2 = new m();
                        }
                        t6Var.e(this.f119092p2);
                        continue;
                    case 186:
                        e3.a.u uVarBuild = (e3.a.u) t6Var.b(e3.a.u.B());
                        e3.a.u uVar = this.f119073g3;
                        if (uVar != null) {
                            uVarBuild = uVar.r1().l(uVarBuild).build();
                        }
                        this.f119073g3 = uVarBuild;
                        continue;
                    case 194:
                        e3.a.x xVarBuild = (e3.a.x) t6Var.b(e3.a.x.B());
                        e3.a.x xVar = this.f119075h3;
                        if (xVar != null) {
                            xVarBuild = xVar.r1().l(xVarBuild).build();
                        }
                        this.f119075h3 = xVarBuild;
                        continue;
                    case 202:
                        if (this.f119077i3 == null) {
                            this.f119077i3 = new j();
                        }
                        t6Var.e(this.f119077i3);
                        continue;
                    case 210:
                        e3.a.j jVarBuild = (e3.a.j) t6Var.b(e3.a.j.B());
                        e3.a.j jVar = this.f119079j3;
                        if (jVar != null) {
                            jVarBuild = jVar.r1().l(jVarBuild).build();
                        }
                        this.f119079j3 = jVarBuild;
                        continue;
                    case 218:
                        if (this.f119081k3 == null) {
                            this.f119081k3 = new d();
                        }
                        t6Var.e(this.f119081k3);
                        continue;
                    case 226:
                        if (this.f119083l3 == null) {
                            this.f119083l3 = new e();
                        }
                        t6Var.e(this.f119083l3);
                        continue;
                    case 234:
                        if (this.f119085m3 == null) {
                            this.f119085m3 = new n();
                        }
                        t6Var.e(this.f119085m3);
                        continue;
                    case 240:
                        int iT2 = t6Var.t();
                        int iN2 = t6Var.n();
                        if (iN2 != 0 && iN2 != 1 && iN2 != 2 && iN2 != 3) {
                            int i11 = 4 << 4;
                            if (iN2 != 4) {
                                t6Var.o(iT2);
                                n(t6Var, iA);
                            }
                            break;
                        }
                        this.f119068c = e3.a.s.b(iN2);
                        continue;
                    case 250:
                        if (this.f119087n3 == null) {
                            this.f119087n3 = new c();
                        }
                        t6Var.e(this.f119087n3);
                        continue;
                    case 258:
                        if (this.f119069d == null) {
                            this.f119069d = new g();
                        }
                        t6Var.e(this.f119069d);
                        continue;
                    case 266:
                        e3.a.g gVarBuild = (e3.a.g) t6Var.b(e3.a.g.B());
                        e3.a.g gVar = this.f119089o3;
                        if (gVar != null) {
                            gVarBuild = gVar.r1().l(gVarBuild).build();
                        }
                        this.f119089o3 = gVarBuild;
                        continue;
                    default:
                        if (!super.n(t6Var, iA)) {
                        }
                        break;
                }
            }
            return this;
        }
    }
}
