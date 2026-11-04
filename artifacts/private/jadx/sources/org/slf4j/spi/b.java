package org.slf4j.spi;

import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public class b implements f, org.slf4j.spi.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static String f339747c = "org.slf4j.spi.b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected org.slf4j.event.a f339748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected org.slf4j.c f339749b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339750a;

        static {
            int[] iArr = new int[org.slf4j.event.e.values().length];
            f339750a = iArr;
            try {
                iArr[org.slf4j.event.e.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339750a[org.slf4j.event.e.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339750a[org.slf4j.event.e.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339750a[org.slf4j.event.e.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339750a[org.slf4j.event.e.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(org.slf4j.c cVar, org.slf4j.event.e eVar) {
        this.f339749b = cVar;
        this.f339748a = new org.slf4j.event.a(eVar, cVar);
    }

    private void q(c cVar, org.slf4j.event.f fVar) {
        fVar.Q();
        fVar.e();
        cVar.f0(null, fVar.c(), fVar.g().n(), u(fVar), fVar.a(), fVar.b());
    }

    private void r(org.slf4j.event.f fVar) {
        Object[] objArrA = fVar.a();
        int length = objArrA == null ? 0 : objArrA.length;
        Throwable thB = fVar.b();
        Object[] objArr = new Object[(thB == null ? 0 : 1) + length];
        if (objArrA != null) {
            System.arraycopy(objArrA, 0, objArr, 0, length);
        }
        if (thB != null) {
            objArr[length] = thB;
        }
        String strU = u(fVar);
        int i10 = a.f339750a[fVar.g().ordinal()];
        if (i10 == 1) {
            this.f339749b.f(strU, objArr);
            return;
        }
        int i11 = 7 << 2;
        if (i10 == 2) {
            this.f339749b.e(strU, objArr);
            return;
        }
        if (i10 == 3) {
            this.f339749b.h(strU, objArr);
        } else if (i10 == 4) {
            this.f339749b.b(strU, objArr);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f339749b.a(strU, objArr);
        }
    }

    private StringBuilder s(List<org.slf4j.event.d> list, StringBuilder sb2) {
        if (list != null && !list.isEmpty()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            for (org.slf4j.event.d dVar : list) {
                sb2.append(dVar.f339590a);
                sb2.append('=');
                sb2.append(dVar.f339591b);
                sb2.append(' ');
            }
        }
        return sb2;
    }

    private StringBuilder t(List<org.slf4j.h> list, StringBuilder sb2) {
        if (list != null && !list.isEmpty()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            Iterator<org.slf4j.h> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
        }
        return sb2;
    }

    private String u(org.slf4j.event.f fVar) {
        return v(fVar.Q(), s(fVar.h(), t(fVar.e(), null)));
    }

    private String v(String str, StringBuilder sb2) {
        if (sb2 == null) {
            return str;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // org.slf4j.spi.f
    public void a(String str) {
        this.f339748a.r(str);
        p(this.f339748a);
    }

    @Override // org.slf4j.spi.a
    public void b(String str) {
        this.f339748a.q(str);
    }

    @Override // org.slf4j.spi.f
    public f c(Throwable th2) {
        this.f339748a.s(th2);
        return this;
    }

    @Override // org.slf4j.spi.f
    public f d(String str, Supplier<Object> supplier) {
        this.f339748a.m(str, supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.f
    public f e(Object obj) {
        this.f339748a.k(obj);
        return this;
    }

    @Override // org.slf4j.spi.f
    public f f(Supplier<String> supplier) {
        this.f339748a.r(supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.f
    public void g(String str, Object obj) {
        this.f339748a.r(str);
        this.f339748a.k(obj);
        p(this.f339748a);
    }

    @Override // org.slf4j.spi.f
    public void h() {
        p(this.f339748a);
    }

    @Override // org.slf4j.spi.f
    public void i(String str, Object obj, Object obj2) {
        this.f339748a.r(str);
        this.f339748a.k(obj);
        this.f339748a.k(obj2);
        p(this.f339748a);
    }

    @Override // org.slf4j.spi.f
    public void j(Supplier<String> supplier) {
        if (supplier == null) {
            a(null);
        } else {
            a(supplier.get());
        }
    }

    @Override // org.slf4j.spi.f
    public void k(String str, Object... objArr) {
        this.f339748a.r(str);
        this.f339748a.l(objArr);
        p(this.f339748a);
    }

    @Override // org.slf4j.spi.f
    public f l(Supplier<?> supplier) {
        this.f339748a.k(supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.f
    public f m(org.slf4j.h hVar) {
        this.f339748a.n(hVar);
        return this;
    }

    @Override // org.slf4j.spi.f
    public f n(String str) {
        this.f339748a.r(str);
        return this;
    }

    @Override // org.slf4j.spi.f
    public f o(String str, Object obj) {
        this.f339748a.m(str, obj);
        return this;
    }

    protected void p(org.slf4j.event.f fVar) {
        if (fVar.c() == null) {
            b(f339747c);
        }
        org.slf4j.c cVar = this.f339749b;
        if (cVar instanceof e) {
            ((e) cVar).a(fVar);
        } else if (cVar instanceof c) {
            q((c) cVar, fVar);
        } else {
            r(fVar);
        }
    }
}
