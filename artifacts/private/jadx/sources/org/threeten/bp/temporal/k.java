package org.threeten.bp.temporal;

import org.threeten.bp.r;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final l<r> f340420a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final l<org.threeten.bp.chrono.j> f340421b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final l<m> f340422c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final l<r> f340423d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final l<s> f340424e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final l<org.threeten.bp.g> f340425f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final l<org.threeten.bp.i> f340426g = new g();

    class a implements l<r> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(org.threeten.bp.temporal.f fVar) {
            return (r) fVar.d(this);
        }
    }

    class b implements l<org.threeten.bp.chrono.j> {
        b() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.chrono.j a(org.threeten.bp.temporal.f fVar) {
            return (org.threeten.bp.chrono.j) fVar.d(this);
        }
    }

    class c implements l<m> {
        c() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(org.threeten.bp.temporal.f fVar) {
            return (m) fVar.d(this);
        }
    }

    class d implements l<r> {
        d() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(org.threeten.bp.temporal.f fVar) {
            r rVar = (r) fVar.d(k.f340420a);
            return rVar != null ? rVar : (r) fVar.d(k.f340424e);
        }
    }

    class e implements l<s> {
        e() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340346n3;
            if (fVar.q(aVar)) {
                return s.X(fVar.l(aVar));
            }
            return null;
        }
    }

    class f implements l<org.threeten.bp.g> {
        f() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.g a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.H1;
            if (fVar.q(aVar)) {
                return org.threeten.bp.g.E0(fVar.t(aVar));
            }
            return null;
        }
    }

    class g implements l<org.threeten.bp.i> {
        g() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.i a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340330f;
            if (fVar.q(aVar)) {
                return org.threeten.bp.i.h0(fVar.t(aVar));
            }
            return null;
        }
    }

    private k() {
    }

    public static final l<org.threeten.bp.chrono.j> a() {
        return f340421b;
    }

    public static final l<org.threeten.bp.g> b() {
        return f340425f;
    }

    public static final l<org.threeten.bp.i> c() {
        return f340426g;
    }

    public static final l<s> d() {
        return f340424e;
    }

    public static final l<m> e() {
        return f340422c;
    }

    public static final l<r> f() {
        return f340423d;
    }

    public static final l<r> g() {
        return f340420a;
    }
}
