package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.z3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@Deprecated
public final class l extends h<e> {
    private static final int H1 = 3;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f65092g3 = 5;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f65093h3 = 6;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final androidx.media3.common.k0 f65094i3 = new androidx.media3.common.k0.c().M(Uri.EMPTY).a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f65095p0 = 1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f65096p1 = 2;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f65097p2 = 4;
    private boolean X;
    private Set<d> Y;
    private u1 Z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final List<e> f65098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Set<d> f65099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private Handler f65100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<e> f65101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final IdentityHashMap<s0, e> f65102o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map<Object, e> f65103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set<e> f65104t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f65105v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f65106w;

    private static final class b extends androidx.media3.exoplayer.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f65107h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f65108i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int[] f65109j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int[] f65110k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final z3[] f65111l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Object[] f65112m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final HashMap<Object, Integer> f65113n;

        public b(Collection<e> collection, u1 u1Var, boolean z10) {
            super(z10, u1Var);
            int size = collection.size();
            this.f65109j = new int[size];
            this.f65110k = new int[size];
            this.f65111l = new z3[size];
            this.f65112m = new Object[size];
            this.f65113n = new HashMap<>();
            int iV = 0;
            int iM = 0;
            int i10 = 0;
            for (e eVar : collection) {
                this.f65111l[i10] = eVar.f65116a.T0();
                this.f65110k[i10] = iV;
                this.f65109j[i10] = iM;
                iV += this.f65111l[i10].v();
                iM += this.f65111l[i10].m();
                Object[] objArr = this.f65112m;
                Object obj = eVar.f65117b;
                objArr[i10] = obj;
                this.f65113n.put(obj, Integer.valueOf(i10));
                i10++;
            }
            this.f65107h = iV;
            this.f65108i = iM;
        }

        @Override // androidx.media3.exoplayer.a
        protected int A(int i10) {
            return androidx.media3.common.util.k1.m(this.f65109j, i10 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.a
        protected int B(int i10) {
            return androidx.media3.common.util.k1.m(this.f65110k, i10 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.a
        protected Object E(int i10) {
            return this.f65112m[i10];
        }

        @Override // androidx.media3.exoplayer.a
        protected int G(int i10) {
            return this.f65109j[i10];
        }

        @Override // androidx.media3.exoplayer.a
        protected int H(int i10) {
            return this.f65110k[i10];
        }

        @Override // androidx.media3.exoplayer.a
        protected z3 K(int i10) {
            return this.f65111l[i10];
        }

        @Override // androidx.media3.common.z3
        public int m() {
            return this.f65108i;
        }

        @Override // androidx.media3.common.z3
        public int v() {
            return this.f65107h;
        }

        @Override // androidx.media3.exoplayer.a
        protected int z(Object obj) {
            Integer num = this.f65113n.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    private static final class c extends androidx.media3.exoplayer.source.a {
        private c() {
        }

        @Override // androidx.media3.exoplayer.source.t0
        public void a() {
        }

        @Override // androidx.media3.exoplayer.source.t0
        public androidx.media3.common.k0 g() {
            return l.f65094i3;
        }

        @Override // androidx.media3.exoplayer.source.a
        protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        }

        @Override // androidx.media3.exoplayer.source.t0
        public void l(s0 s0Var) {
        }

        @Override // androidx.media3.exoplayer.source.a
        protected void l0() {
        }

        @Override // androidx.media3.exoplayer.source.t0
        public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f65114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f65115b;

        public d(Handler handler, Runnable runnable) {
            this.f65114a = handler;
            this.f65115b = runnable;
        }

        public void a() {
            this.f65114a.post(this.f65115b);
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f65116a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f65119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f65120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f65121f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<t0.b> f65118c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f65117b = new Object();

        public e(t0 t0Var, boolean z10) {
            this.f65116a = new g0(t0Var, z10);
        }

        public void a(int i10, int i11) {
            this.f65119d = i10;
            this.f65120e = i11;
            this.f65121f = false;
            this.f65118c.clear();
        }
    }

    private static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f65123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final d f65124c;

        public f(int i10, T t10, @androidx.annotation.p0 d dVar) {
            this.f65122a = i10;
            this.f65123b = t10;
            this.f65124c = dVar;
        }
    }

    public l(t0... t0VarArr) {
        this(false, t0VarArr);
    }

    private void J0(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.f65101n.get(i10 - 1);
            eVar.a(i10, eVar2.f65120e + eVar2.f65116a.T0().v());
        } else {
            eVar.a(i10, 0);
        }
        S0(i10, 1, eVar.f65116a.T0().v());
        this.f65101n.add(i10, eVar);
        this.f65103s.put(eVar.f65117b, eVar);
        B0(eVar, eVar.f65116a);
        if (f0() && this.f65102o.isEmpty()) {
            this.f65104t.add(eVar);
        } else {
            v0(eVar);
        }
    }

    private void O0(int i10, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            J0(i10, it.next());
            i10++;
        }
    }

    @androidx.annotation.b0("this")
    private void P0(int i10, Collection<t0> collection, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        androidx.media3.common.util.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f65100m;
        Iterator<t0> it = collection.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.a.g(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<t0> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.f65106w));
        }
        this.f65098k.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new f(i10, arrayList, T0(handler, runnable))).sendToTarget();
            return;
        }
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void S0(int i10, int i11, int i12) {
        while (i10 < this.f65101n.size()) {
            e eVar = this.f65101n.get(i10);
            eVar.f65119d += i11;
            eVar.f65120e += i12;
            i10++;
        }
    }

    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private d T0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f65099l.add(dVar);
        return dVar;
    }

    private void U0() {
        Iterator<e> it = this.f65104t.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f65118c.isEmpty()) {
                v0(next);
                it.remove();
            }
        }
    }

    private synchronized void V0(Set<d> set) {
        try {
            Iterator<d> it = set.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f65099l.removeAll(set);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void W0(e eVar) {
        this.f65104t.add(eVar);
        w0(eVar);
    }

    private static Object X0(Object obj) {
        return androidx.media3.exoplayer.a.C(obj);
    }

    private static Object a1(Object obj) {
        return androidx.media3.exoplayer.a.D(obj);
    }

    private static Object b1(e eVar, Object obj) {
        return androidx.media3.exoplayer.a.F(eVar.f65117b, obj);
    }

    private Handler c1() {
        return (Handler) androidx.media3.common.util.a.g(this.f65100m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean f1(Message message) {
        switch (message.what) {
            case 1:
                f fVar = (f) androidx.media3.common.util.k1.o(message.obj);
                this.Z = this.Z.g(fVar.f65122a, ((Collection) fVar.f65123b).size());
                O0(fVar.f65122a, (Collection) fVar.f65123b);
                t1(fVar.f65124c);
                return true;
            case 2:
                f fVar2 = (f) androidx.media3.common.util.k1.o(message.obj);
                int i10 = fVar2.f65122a;
                int iIntValue = ((Integer) fVar2.f65123b).intValue();
                if (i10 == 0 && iIntValue == this.Z.getLength()) {
                    this.Z = this.Z.d();
                } else {
                    this.Z = this.Z.f(i10, iIntValue);
                }
                for (int i11 = iIntValue - 1; i11 >= i10; i11--) {
                    o1(i11);
                }
                t1(fVar2.f65124c);
                return true;
            case 3:
                f fVar3 = (f) androidx.media3.common.util.k1.o(message.obj);
                u1 u1Var = this.Z;
                int i12 = fVar3.f65122a;
                u1 u1VarF = u1Var.f(i12, i12 + 1);
                this.Z = u1VarF;
                this.Z = u1VarF.g(((Integer) fVar3.f65123b).intValue(), 1);
                j1(fVar3.f65122a, ((Integer) fVar3.f65123b).intValue());
                t1(fVar3.f65124c);
                return true;
            case 4:
                f fVar4 = (f) androidx.media3.common.util.k1.o(message.obj);
                this.Z = (u1) fVar4.f65123b;
                t1(fVar4.f65124c);
                return true;
            case 5:
                y1();
                return true;
            case 6:
                V0((Set) androidx.media3.common.util.k1.o(message.obj));
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    private void g1(e eVar) {
        if (eVar.f65121f && eVar.f65118c.isEmpty()) {
            this.f65104t.remove(eVar);
            C0(eVar);
        }
    }

    private void j1(int i10, int i11) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iV = this.f65101n.get(iMin).f65120e;
        List<e> list = this.f65101n;
        list.add(i11, list.remove(i10));
        while (iMin <= iMax) {
            e eVar = this.f65101n.get(iMin);
            eVar.f65119d = iMin;
            eVar.f65120e = iV;
            iV += eVar.f65116a.T0().v();
            iMin++;
        }
    }

    @androidx.annotation.b0("this")
    private void k1(int i10, int i11, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        androidx.media3.common.util.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f65100m;
        List<e> list = this.f65098k;
        list.add(i11, list.remove(i10));
        if (handler2 != null) {
            handler2.obtainMessage(3, new f(i10, Integer.valueOf(i11), T0(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void o1(int i10) {
        e eVarRemove = this.f65101n.remove(i10);
        this.f65103s.remove(eVarRemove.f65117b);
        S0(i10, -1, -eVarRemove.f65116a.T0().v());
        eVarRemove.f65121f = true;
        g1(eVarRemove);
    }

    @androidx.annotation.b0("this")
    private void r1(int i10, int i11, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        androidx.media3.common.util.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f65100m;
        androidx.media3.common.util.k1.T1(this.f65098k, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i10, Integer.valueOf(i11), T0(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void s1() {
        t1(null);
    }

    private void t1(@androidx.annotation.p0 d dVar) {
        if (!this.X) {
            c1().obtainMessage(5).sendToTarget();
            this.X = true;
        }
        if (dVar != null) {
            this.Y.add(dVar);
        }
    }

    @androidx.annotation.b0("this")
    private void u1(u1 u1Var, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        Handler handler2 = this.f65100m;
        if (handler2 != null) {
            int iD1 = d1();
            if (u1Var.getLength() != iD1) {
                u1Var = u1Var.d().g(0, iD1);
            }
            handler2.obtainMessage(4, new f(0, u1Var, T0(handler, runnable))).sendToTarget();
            return;
        }
        if (u1Var.getLength() > 0) {
            u1Var = u1Var.d();
        }
        this.Z = u1Var;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void x1(e eVar, z3 z3Var) {
        if (eVar.f65119d + 1 < this.f65101n.size()) {
            int iV = z3Var.v() - (this.f65101n.get(eVar.f65119d + 1).f65120e - eVar.f65120e);
            if (iV != 0) {
                S0(eVar.f65119d + 1, 0, iV);
            }
        }
        s1();
    }

    private void y1() {
        this.X = false;
        Set<d> set = this.Y;
        this.Y = new HashSet();
        k0(new b(this.f65101n, this.Z, this.f65105v));
        c1().obtainMessage(6, set).sendToTarget();
    }

    public synchronized void F0(int i10, t0 t0Var) {
        try {
            P0(i10, Collections.singletonList(t0Var), null, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void G0(int i10, t0 t0Var, Handler handler, Runnable runnable) {
        P0(i10, Collections.singletonList(t0Var), handler, runnable);
    }

    public synchronized void H0(t0 t0Var) {
        try {
            F0(this.f65098k.size(), t0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void I0(t0 t0Var, Handler handler, Runnable runnable) {
        try {
            G0(this.f65098k.size(), t0Var, handler, runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void K0(int i10, Collection<t0> collection) {
        try {
            P0(i10, collection, null, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void L0(int i10, Collection<t0> collection, Handler handler, Runnable runnable) {
        try {
            P0(i10, collection, handler, runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void M0(Collection<t0> collection) {
        P0(this.f65098k.size(), collection, null, null);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean N() {
        return false;
    }

    public synchronized void N0(Collection<t0> collection, Handler handler, Runnable runnable) {
        try {
            P0(this.f65098k.size(), collection, handler, runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void Q0() {
        try {
            p1(0, d1());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void R0(Handler handler, Runnable runnable) {
        q1(0, d1(), handler, runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public t0.b x0(e eVar, t0.b bVar) {
        for (int i10 = 0; i10 < eVar.f65118c.size(); i10++) {
            if (eVar.f65118c.get(i10).f65470d == bVar.f65470d) {
                return bVar.a(b1(eVar, bVar.f65467a));
            }
        }
        return null;
    }

    public synchronized t0 Z0(int i10) {
        return this.f65098k.get(i10).f65116a;
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void a0() {
        super.a0();
        this.f65104t.clear();
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void d0() {
    }

    public synchronized int d1() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f65098k.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public int z0(e eVar, int i10) {
        return i10 + eVar.f65120e;
    }

    @Override // androidx.media3.exoplayer.source.t0
    public androidx.media3.common.k0 g() {
        return f65094i3;
    }

    public synchronized void h1(int i10, int i11) {
        k1(i10, i11, null, null);
    }

    public synchronized void i1(int i10, int i11, Handler handler, Runnable runnable) {
        try {
            k1(i10, i11, handler, runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected synchronized void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        try {
            super.j0(r1Var);
            this.f65100m = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.k
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f65089a.f1(message);
                }
            });
            if (this.f65098k.isEmpty()) {
                y1();
            } else {
                this.Z = this.Z.g(0, this.f65098k.size());
                O0(0, this.f65098k);
                s1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        e eVar = (e) androidx.media3.common.util.a.g(this.f65102o.remove(s0Var));
        eVar.f65116a.l(s0Var);
        eVar.f65118c.remove(((f0) s0Var).f65016a);
        if (!this.f65102o.isEmpty()) {
            U0();
        }
        g1(eVar);
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected synchronized void l0() {
        try {
            super.l0();
            this.f65101n.clear();
            this.f65104t.clear();
            this.f65103s.clear();
            this.Z = this.Z.d();
            Handler handler = this.f65100m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f65100m = null;
            }
            this.X = false;
            this.Y.clear();
            V0(this.f65099l);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void A0(e eVar, t0 t0Var, z3 z3Var) {
        x1(eVar, z3Var);
    }

    public synchronized t0 m1(int i10) {
        t0 t0VarZ0;
        t0VarZ0 = Z0(i10);
        r1(i10, i10 + 1, null, null);
        return t0VarZ0;
    }

    public synchronized t0 n1(int i10, Handler handler, Runnable runnable) {
        t0 t0VarZ0;
        t0VarZ0 = Z0(i10);
        r1(i10, i10 + 1, handler, runnable);
        return t0VarZ0;
    }

    public synchronized void p1(int i10, int i11) {
        r1(i10, i11, null, null);
    }

    public synchronized void q1(int i10, int i11, Handler handler, Runnable runnable) {
        try {
            r1(i10, i11, handler, runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized z3 u() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new b(this.f65098k, this.Z.getLength() != this.f65098k.size() ? this.Z.d().g(0, this.f65098k.size()) : this.Z, this.f65105v);
    }

    public synchronized void v1(u1 u1Var) {
        try {
            u1(u1Var, null, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void w1(u1 u1Var, Handler handler, Runnable runnable) {
        try {
            u1(u1Var, handler, runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        Object objA1 = a1(bVar.f65467a);
        t0.b bVarA = bVar.a(X0(bVar.f65467a));
        e eVar = this.f65103s.get(objA1);
        if (eVar == null) {
            eVar = new e(new c(), this.f65106w);
            eVar.f65121f = true;
            B0(eVar, eVar.f65116a);
        }
        W0(eVar);
        eVar.f65118c.add(bVarA);
        f0 f0VarX = eVar.f65116a.x(bVarA, bVar2, j10);
        this.f65102o.put(f0VarX, eVar);
        U0();
        return f0VarX;
    }

    public l(boolean z10, t0... t0VarArr) {
        this(z10, new u1.a(0), t0VarArr);
    }

    public l(boolean z10, u1 u1Var, t0... t0VarArr) {
        this(z10, false, u1Var, t0VarArr);
    }

    public l(boolean z10, boolean z11, u1 u1Var, t0... t0VarArr) {
        for (t0 t0Var : t0VarArr) {
            androidx.media3.common.util.a.g(t0Var);
        }
        this.Z = u1Var.getLength() > 0 ? u1Var.d() : u1Var;
        this.f65102o = new IdentityHashMap<>();
        this.f65103s = new HashMap();
        this.f65098k = new ArrayList();
        this.f65101n = new ArrayList();
        this.Y = new HashSet();
        this.f65099l = new HashSet();
        this.f65104t = new HashSet();
        this.f65105v = z10;
        this.f65106w = z11;
        M0(Arrays.asList(t0VarArr));
    }
}
