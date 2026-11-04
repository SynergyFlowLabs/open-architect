package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a implements y.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f74113i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f74114j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f74115k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f74116l = "AHT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.core.util.s.a<b> f74117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f74118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<b> f74119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0727a f74120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f74121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f74122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final y f74123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f74124h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0727a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        RecyclerView.g0 d(int i10);

        void e(int i10, int i11);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11, Object obj);
    }

    static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f74125e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f74126f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f74127g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f74128h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f74129i = 30;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f74132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f74133d;

        b(int i10, int i11, int i12, Object obj) {
            this.f74130a = i10;
            this.f74131b = i11;
            this.f74133d = i12;
            this.f74132c = obj;
        }

        String a() {
            int i10 = this.f74130a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f74130a;
            if (i10 != bVar.f74130a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f74133d - this.f74131b) == 1 && this.f74133d == bVar.f74131b && this.f74131b == bVar.f74133d) {
                return true;
            }
            if (this.f74133d == bVar.f74133d && this.f74131b == bVar.f74131b) {
                Object obj2 = this.f74132c;
                if (obj2 != null) {
                    if (!obj2.equals(bVar.f74132c)) {
                        return false;
                    }
                } else if (bVar.f74132c != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f74130a * 31) + this.f74131b) * 31) + this.f74133d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f74131b + "c:" + this.f74133d + ",p:" + this.f74132c + "]";
        }
    }

    a(InterfaceC0727a interfaceC0727a) {
        this(interfaceC0727a, false);
    }

    private int A(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f74119c.size() - 1; size >= 0; size--) {
            b bVar = this.f74119c.get(size);
            int i14 = bVar.f74130a;
            if (i14 == 8) {
                int i15 = bVar.f74131b;
                int i16 = bVar.f74133d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f74131b = i15 + 1;
                            bVar.f74133d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f74131b = i15 - 1;
                            bVar.f74133d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f74133d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f74133d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f74131b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f74131b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f74131b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f74133d;
                    } else if (i14 == 2) {
                        i10 += bVar.f74133d;
                    }
                } else if (i11 == 1) {
                    bVar.f74131b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f74131b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f74119c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f74119c.get(size2);
            if (bVar2.f74130a == 8) {
                int i18 = bVar2.f74133d;
                if (i18 == bVar2.f74131b || i18 < 0) {
                    this.f74119c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f74133d <= 0) {
                this.f74119c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    private void d(b bVar) {
        w(bVar);
    }

    private void e(b bVar) {
        w(bVar);
    }

    private void g(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f74131b;
        int i11 = bVar.f74133d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f74120d.d(i12) != null || i(i12)) {
                if (b11 == 0) {
                    l(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    w(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f74133d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private void h(b bVar) {
        int i10 = bVar.f74131b;
        int i11 = bVar.f74133d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f74120d.d(i10) != null || i(i10)) {
                if (b10 == 0) {
                    l(a(4, i13, i12, bVar.f74132c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    w(a(4, i13, i12, bVar.f74132c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f74133d) {
            Object obj = bVar.f74132c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private boolean i(int i10) {
        int size = this.f74119c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f74119c.get(i11);
            int i12 = bVar.f74130a;
            if (i12 == 8) {
                if (o(bVar.f74133d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f74131b;
                int i14 = bVar.f74133d + i13;
                while (i13 < i14) {
                    if (o(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    private void l(b bVar) {
        int i10;
        int i11 = bVar.f74130a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iA = A(bVar.f74131b, i11);
        int i12 = bVar.f74131b;
        int i13 = bVar.f74130a;
        int i14 = 2 >> 2;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i15 = 1;
        for (int i16 = 1; i16 < bVar.f74133d; i16++) {
            int iA2 = A(bVar.f74131b + (i10 * i16), bVar.f74130a);
            int i17 = bVar.f74130a;
            if (i17 != 2) {
                if (i17 == 4 && iA2 == iA + 1) {
                    i15++;
                } else {
                    b bVarA = a(i17, iA, i15, bVar.f74132c);
                    m(bVarA, i12);
                    b(bVarA);
                    if (bVar.f74130a == 4) {
                        i12 += i15;
                    }
                    i15 = 1;
                    iA = iA2;
                }
            } else if (iA2 == iA) {
                i15++;
            } else {
                b bVarA2 = a(i17, iA, i15, bVar.f74132c);
                m(bVarA2, i12);
                b(bVarA2);
                if (bVar.f74130a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                iA = iA2;
            }
        }
        Object obj = bVar.f74132c;
        b(bVar);
        if (i15 > 0) {
            b bVarA3 = a(bVar.f74130a, iA, i15, obj);
            m(bVarA3, i12);
            b(bVarA3);
        }
    }

    private void w(b bVar) {
        this.f74119c.add(bVar);
        int i10 = bVar.f74130a;
        if (i10 == 1) {
            this.f74120d.e(bVar.f74131b, bVar.f74133d);
            return;
        }
        if (i10 == 2) {
            this.f74120d.g(bVar.f74131b, bVar.f74133d);
            return;
        }
        if (i10 == 4) {
            this.f74120d.h(bVar.f74131b, bVar.f74133d, bVar.f74132c);
        } else {
            if (i10 == 8) {
                this.f74120d.a(bVar.f74131b, bVar.f74133d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    @Override // androidx.recyclerview.widget.y.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVarAcquire = this.f74117a.acquire();
        if (bVarAcquire == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarAcquire.f74130a = i10;
        bVarAcquire.f74131b = i11;
        bVarAcquire.f74133d = i12;
        bVarAcquire.f74132c = obj;
        return bVarAcquire;
    }

    @Override // androidx.recyclerview.widget.y.a
    public void b(b bVar) {
        if (this.f74122f) {
            return;
        }
        bVar.f74132c = null;
        this.f74117a.a(bVar);
    }

    a c(b... bVarArr) {
        Collections.addAll(this.f74118b, bVarArr);
        return this;
    }

    public int f(int i10) {
        int size = this.f74118b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f74118b.get(i11);
            int i12 = bVar.f74130a;
            boolean z10 = false | true;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f74131b;
                    if (i13 <= i10) {
                        int i14 = bVar.f74133d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f74131b;
                    if (i15 == i10) {
                        i10 = bVar.f74133d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f74133d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f74131b <= i10) {
                i10 += bVar.f74133d;
            }
        }
        return i10;
    }

    void j() {
        int size = this.f74119c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f74120d.c(this.f74119c.get(i10));
        }
        y(this.f74119c);
        this.f74124h = 0;
    }

    void k() {
        j();
        int size = this.f74118b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f74118b.get(i10);
            int i11 = bVar.f74130a;
            if (i11 == 1) {
                this.f74120d.c(bVar);
                this.f74120d.e(bVar.f74131b, bVar.f74133d);
            } else if (i11 != 2) {
                int i12 = 5 | 4;
                if (i11 == 4) {
                    this.f74120d.c(bVar);
                    this.f74120d.h(bVar.f74131b, bVar.f74133d, bVar.f74132c);
                } else if (i11 == 8) {
                    this.f74120d.c(bVar);
                    this.f74120d.a(bVar.f74131b, bVar.f74133d);
                }
            } else {
                this.f74120d.c(bVar);
                this.f74120d.f(bVar.f74131b, bVar.f74133d);
            }
            Runnable runnable = this.f74121e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f74118b);
        this.f74124h = 0;
    }

    void m(b bVar, int i10) {
        this.f74120d.b(bVar);
        int i11 = bVar.f74130a;
        if (i11 == 2) {
            this.f74120d.f(i10, bVar.f74133d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f74120d.h(i10, bVar.f74133d, bVar.f74132c);
        }
    }

    int n(int i10) {
        return o(i10, 0);
    }

    int o(int i10, int i11) {
        int size = this.f74119c.size();
        while (i11 < size) {
            b bVar = this.f74119c.get(i11);
            int i12 = bVar.f74130a;
            if (i12 == 8) {
                int i13 = bVar.f74131b;
                if (i13 == i10) {
                    i10 = bVar.f74133d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f74133d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f74131b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f74133d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f74133d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean p(int i10) {
        return (this.f74124h & i10) != 0;
    }

    boolean q() {
        return this.f74118b.size() > 0;
    }

    boolean r() {
        return (this.f74119c.isEmpty() || this.f74118b.isEmpty()) ? false : true;
    }

    boolean s(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f74118b.add(a(4, i10, i11, obj));
        this.f74124h |= 4;
        return this.f74118b.size() == 1;
    }

    boolean t(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f74118b.add(a(1, i10, i11, null));
        this.f74124h |= 1;
        return this.f74118b.size() == 1;
    }

    boolean u(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f74118b.add(a(8, i10, i11, null));
        this.f74124h |= 8;
        return this.f74118b.size() == 1;
    }

    boolean v(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f74118b.add(a(2, i10, i11, null));
        this.f74124h |= 2;
        return this.f74118b.size() == 1;
    }

    void x() {
        this.f74123g.b(this.f74118b);
        int size = this.f74118b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f74118b.get(i10);
            int i11 = bVar.f74130a;
            if (i11 == 1) {
                d(bVar);
            } else if (i11 != 2) {
                int i12 = 2 >> 4;
                if (i11 == 4) {
                    h(bVar);
                } else if (i11 == 8) {
                    e(bVar);
                }
            } else {
                g(bVar);
            }
            Runnable runnable = this.f74121e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f74118b.clear();
    }

    void y(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    void z() {
        y(this.f74118b);
        y(this.f74119c);
        this.f74124h = 0;
    }

    a(InterfaceC0727a interfaceC0727a, boolean z10) {
        this.f74117a = new androidx.core.util.s.b(30);
        this.f74118b = new ArrayList<>();
        this.f74119c = new ArrayList<>();
        this.f74124h = 0;
        this.f74120d = interfaceC0727a;
        this.f74122f = z10;
        this.f74123g = new y(this);
    }
}
