package androidx.media2.exoplayer.external.source;

import android.os.Handler;
import android.os.Message;
import java.io.IOException;
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

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class l extends h<e> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f56254u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f56255v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f56256w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f56257x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f56258y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f56259z = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final List<e> f56260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Set<d> f56261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private Handler f56262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<e> f56263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<x, e> f56264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<Object, e> f56265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<e> f56266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f56267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f56268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f56269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Set<d> f56270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x0 f56271t;

    private static final class b extends androidx.media2.exoplayer.external.source.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f56272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f56273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f56274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f56275h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.z0[] f56276i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Object[] f56277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final HashMap<Object, Integer> f56278k;

        public b(Collection<e> mediaSourceHolders, x0 shuffleOrder, boolean isAtomic) {
            super(isAtomic, shuffleOrder);
            int size = mediaSourceHolders.size();
            this.f56274g = new int[size];
            this.f56275h = new int[size];
            this.f56276i = new androidx.media2.exoplayer.external.z0[size];
            this.f56277j = new Object[size];
            this.f56278k = new HashMap<>();
            int iR = 0;
            int i10 = 0;
            int i11 = 0;
            for (e eVar : mediaSourceHolders) {
                this.f56276i[i11] = eVar.f56281a.J();
                this.f56275h[i11] = iR;
                this.f56274g[i11] = i10;
                iR += this.f56276i[i11].r();
                i10 += this.f56276i[i11].i();
                Object[] objArr = this.f56277j;
                Object obj = eVar.f56282b;
                objArr[i11] = obj;
                this.f56278k.put(obj, Integer.valueOf(i11));
                i11++;
            }
            this.f56272e = iR;
            this.f56273f = i10;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int B(int childIndex) {
            return this.f56274g[childIndex];
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int C(int childIndex) {
            return this.f56275h[childIndex];
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected androidx.media2.exoplayer.external.z0 F(int childIndex) {
            return this.f56276i[childIndex];
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int i() {
            return this.f56273f;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int r() {
            return this.f56272e;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int u(Object childUid) {
            Integer num = this.f56278k.get(childUid);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int v(int periodIndex) {
            return androidx.media2.exoplayer.external.util.q0.g(this.f56274g, periodIndex + 1, false, false);
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int w(int windowIndex) {
            return androidx.media2.exoplayer.external.util.q0.g(this.f56275h, windowIndex + 1, false, false);
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected Object z(int childIndex) {
            return this.f56277j[childIndex];
        }
    }

    private static final class c extends androidx.media2.exoplayer.external.source.c {
        private c() {
        }

        @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
        @androidx.annotation.p0
        public Object E() {
            return null;
        }

        @Override // androidx.media2.exoplayer.external.source.z
        public void a() throws IOException {
        }

        @Override // androidx.media2.exoplayer.external.source.z
        public void c(x mediaPeriod) {
        }

        @Override // androidx.media2.exoplayer.external.source.z
        public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media2.exoplayer.external.source.c
        protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        }

        @Override // androidx.media2.exoplayer.external.source.c
        protected void t() {
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f56279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f56280b;

        public d(Handler handler, Runnable runnable) {
            this.f56279a = handler;
            this.f56280b = runnable;
        }

        public void a() {
            this.f56279a.post(this.f56280b);
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f56281a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f56284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f56285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f56286f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<z.a> f56283c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f56282b = new Object();

        public e(z mediaSource, boolean useLazyPreparation) {
            this.f56281a = new v(mediaSource, useLazyPreparation);
        }

        public void a(int childIndex, int firstWindowIndexInChild) {
            this.f56284d = childIndex;
            this.f56285e = firstWindowIndexInChild;
            this.f56286f = false;
            this.f56283c.clear();
        }
    }

    private static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f56288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final d f56289c;

        public f(int index, T customData, @androidx.annotation.p0 d onCompletionAction) {
            this.f56287a = index;
            this.f56288b = customData;
            this.f56289c = onCompletionAction;
        }
    }

    public l(z... mediaSources) {
        this(false, mediaSources);
    }

    private void J(int newIndex, e newMediaSourceHolder) {
        if (newIndex > 0) {
            e eVar = this.f56263l.get(newIndex - 1);
            newMediaSourceHolder.a(newIndex, eVar.f56285e + eVar.f56281a.J().r());
        } else {
            newMediaSourceHolder.a(newIndex, 0);
        }
        T(newIndex, 1, newMediaSourceHolder.f56281a.J().r());
        this.f56263l.add(newIndex, newMediaSourceHolder);
        this.f56265n.put(newMediaSourceHolder.f56282b, newMediaSourceHolder);
        B(newMediaSourceHolder, newMediaSourceHolder.f56281a);
        if (q() && this.f56264m.isEmpty()) {
            this.f56266o.add(newMediaSourceHolder);
        } else {
            u(newMediaSourceHolder);
        }
    }

    private void O(int index, Collection<e> mediaSourceHolders) {
        Iterator<e> it = mediaSourceHolders.iterator();
        while (it.hasNext()) {
            J(index, it.next());
            index++;
        }
    }

    @androidx.annotation.b0("this")
    private void P(int index, Collection<z> mediaSources, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable onCompletionAction) {
        boolean z10 = true;
        if ((handler == null) != (onCompletionAction == null)) {
            z10 = false;
        }
        androidx.media2.exoplayer.external.util.a.a(z10);
        Handler handler2 = this.f56262k;
        Iterator<z> it = mediaSources.iterator();
        while (it.hasNext()) {
            androidx.media2.exoplayer.external.util.a.g(it.next());
        }
        ArrayList arrayList = new ArrayList(mediaSources.size());
        Iterator<z> it2 = mediaSources.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.f56268q));
        }
        this.f56260i.addAll(index, arrayList);
        if (handler2 != null && !mediaSources.isEmpty()) {
            handler2.obtainMessage(0, new f(index, arrayList, U(handler, onCompletionAction))).sendToTarget();
            return;
        }
        if (onCompletionAction != null && handler != null) {
            handler.post(onCompletionAction);
        }
    }

    private void T(int startIndex, int childIndexUpdate, int windowOffsetUpdate) {
        while (startIndex < this.f56263l.size()) {
            e eVar = this.f56263l.get(startIndex);
            eVar.f56284d += childIndexUpdate;
            eVar.f56285e += windowOffsetUpdate;
            startIndex++;
        }
    }

    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private d U(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f56261j.add(dVar);
        return dVar;
    }

    private void V() {
        Iterator<e> it = this.f56266o.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f56283c.isEmpty()) {
                u(next);
                it.remove();
            }
        }
    }

    private synchronized void W(Set<d> onCompletionActions) {
        try {
            Iterator<d> it = onCompletionActions.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f56261j.removeAll(onCompletionActions);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void X(e mediaSourceHolder) {
        this.f56266o.add(mediaSourceHolder);
        v(mediaSourceHolder);
    }

    private static Object Y(Object periodUid) {
        return androidx.media2.exoplayer.external.source.a.x(periodUid);
    }

    private static Object b0(Object periodUid) {
        return androidx.media2.exoplayer.external.source.a.y(periodUid);
    }

    private static Object c0(e holder, Object childPeriodUid) {
        return androidx.media2.exoplayer.external.source.a.A(holder.f56282b, childPeriodUid);
    }

    private Handler d0() {
        return (Handler) androidx.media2.exoplayer.external.util.a.g(this.f56262k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean Q(Message msg) {
        int i10 = msg.what;
        if (i10 == 0) {
            f fVar = (f) androidx.media2.exoplayer.external.util.q0.i(msg.obj);
            this.f56271t = this.f56271t.g(fVar.f56287a, ((Collection) fVar.f56288b).size());
            O(fVar.f56287a, (Collection) fVar.f56288b);
            u0(fVar.f56289c);
        } else if (i10 == 1) {
            f fVar2 = (f) androidx.media2.exoplayer.external.util.q0.i(msg.obj);
            int i11 = fVar2.f56287a;
            int iIntValue = ((Integer) fVar2.f56288b).intValue();
            if (i11 == 0 && iIntValue == this.f56271t.getLength()) {
                this.f56271t = this.f56271t.d();
            } else {
                this.f56271t = this.f56271t.f(i11, iIntValue);
            }
            for (int i12 = iIntValue - 1; i12 >= i11; i12--) {
                p0(i12);
            }
            u0(fVar2.f56289c);
        } else if (i10 == 2) {
            f fVar3 = (f) androidx.media2.exoplayer.external.util.q0.i(msg.obj);
            x0 x0Var = this.f56271t;
            int i13 = fVar3.f56287a;
            x0 x0VarF = x0Var.f(i13, i13 + 1);
            this.f56271t = x0VarF;
            this.f56271t = x0VarF.g(((Integer) fVar3.f56288b).intValue(), 1);
            k0(fVar3.f56287a, ((Integer) fVar3.f56288b).intValue());
            u0(fVar3.f56289c);
        } else if (i10 == 3) {
            f fVar4 = (f) androidx.media2.exoplayer.external.util.q0.i(msg.obj);
            this.f56271t = (x0) fVar4.f56288b;
            u0(fVar4.f56289c);
        } else if (i10 == 4) {
            z0();
        } else {
            if (i10 != 5) {
                throw new IllegalStateException();
            }
            W((Set) androidx.media2.exoplayer.external.util.q0.i(msg.obj));
        }
        return true;
    }

    private void h0(e mediaSourceHolder) {
        if (mediaSourceHolder.f56286f && mediaSourceHolder.f56283c.isEmpty()) {
            this.f56266o.remove(mediaSourceHolder);
            C(mediaSourceHolder);
        }
    }

    private void k0(int currentIndex, int newIndex) {
        int iMin = Math.min(currentIndex, newIndex);
        int iMax = Math.max(currentIndex, newIndex);
        int iR = this.f56263l.get(iMin).f56285e;
        List<e> list = this.f56263l;
        list.add(newIndex, list.remove(currentIndex));
        while (iMin <= iMax) {
            e eVar = this.f56263l.get(iMin);
            eVar.f56284d = iMin;
            eVar.f56285e = iR;
            iR += eVar.f56281a.J().r();
            iMin++;
        }
    }

    @androidx.annotation.b0("this")
    private void l0(int currentIndex, int newIndex, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable onCompletionAction) {
        androidx.media2.exoplayer.external.util.a.a((handler == null) == (onCompletionAction == null));
        Handler handler2 = this.f56262k;
        List<e> list = this.f56260i;
        list.add(newIndex, list.remove(currentIndex));
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(currentIndex, Integer.valueOf(newIndex), U(handler, onCompletionAction))).sendToTarget();
        } else {
            if (onCompletionAction == null || handler == null) {
                return;
            }
            handler.post(onCompletionAction);
        }
    }

    private void p0(int index) {
        e eVarRemove = this.f56263l.remove(index);
        this.f56265n.remove(eVarRemove.f56282b);
        int i10 = 1 ^ (-1);
        T(index, -1, -eVarRemove.f56281a.J().r());
        eVarRemove.f56286f = true;
        h0(eVarRemove);
    }

    @androidx.annotation.b0("this")
    private void s0(int fromIndex, int toIndex, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable onCompletionAction) {
        androidx.media2.exoplayer.external.util.a.a((handler == null) == (onCompletionAction == null));
        Handler handler2 = this.f56262k;
        androidx.media2.exoplayer.external.util.q0.G0(this.f56260i, fromIndex, toIndex);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(fromIndex, Integer.valueOf(toIndex), U(handler, onCompletionAction))).sendToTarget();
        } else {
            if (onCompletionAction == null || handler == null) {
                return;
            }
            handler.post(onCompletionAction);
        }
    }

    private void t0() {
        u0(null);
    }

    private void u0(@androidx.annotation.p0 d onCompletionAction) {
        if (!this.f56269r) {
            d0().obtainMessage(4).sendToTarget();
            this.f56269r = true;
        }
        if (onCompletionAction != null) {
            this.f56270s.add(onCompletionAction);
        }
    }

    @androidx.annotation.b0("this")
    private void v0(x0 shuffleOrder, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable onCompletionAction) {
        androidx.media2.exoplayer.external.util.a.a((handler == null) == (onCompletionAction == null));
        Handler handler2 = this.f56262k;
        if (handler2 != null) {
            int iE0 = e0();
            if (shuffleOrder.getLength() != iE0) {
                shuffleOrder = shuffleOrder.d().g(0, iE0);
            }
            handler2.obtainMessage(3, new f(0, shuffleOrder, U(handler, onCompletionAction))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.d();
        }
        this.f56271t = shuffleOrder;
        if (onCompletionAction == null || handler == null) {
            return;
        }
        handler.post(onCompletionAction);
    }

    private void y0(e mediaSourceHolder, androidx.media2.exoplayer.external.z0 timeline) {
        if (mediaSourceHolder == null) {
            throw new IllegalArgumentException();
        }
        if (mediaSourceHolder.f56284d + 1 < this.f56263l.size()) {
            int iR = timeline.r() - (this.f56263l.get(mediaSourceHolder.f56284d + 1).f56285e - mediaSourceHolder.f56285e);
            if (iR != 0) {
                T(mediaSourceHolder.f56284d + 1, 0, iR);
            }
        }
        t0();
    }

    private void z0() {
        this.f56269r = false;
        Set<d> set = this.f56270s;
        this.f56270s = new HashSet();
        s(new b(this.f56263l, this.f56271t, this.f56267p));
        int i10 = 6 >> 5;
        d0().obtainMessage(5, set).sendToTarget();
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        return null;
    }

    public synchronized void F(int index, z mediaSource) {
        P(index, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void G(int index, z mediaSource, Handler handler, Runnable onCompletionAction) {
        try {
            P(index, Collections.singletonList(mediaSource), handler, onCompletionAction);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void H(z mediaSource) {
        F(this.f56260i.size(), mediaSource);
    }

    public synchronized void I(z mediaSource, Handler handler, Runnable onCompletionAction) {
        try {
            G(this.f56260i.size(), mediaSource, handler, onCompletionAction);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void K(int index, Collection<z> mediaSources) {
        P(index, mediaSources, null, null);
    }

    public synchronized void L(int index, Collection<z> mediaSources, Handler handler, Runnable onCompletionAction) {
        try {
            P(index, mediaSources, handler, onCompletionAction);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void M(Collection<z> mediaSources) {
        P(this.f56260i.size(), mediaSources, null, null);
    }

    public synchronized void N(Collection<z> mediaSources, Handler handler, Runnable onCompletionAction) {
        try {
            P(this.f56260i.size(), mediaSources, handler, onCompletionAction);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void R() {
        q0(0, e0());
    }

    public synchronized void S(Handler handler, Runnable onCompletionAction) {
        try {
            r0(0, e0(), handler, onCompletionAction);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public z.a w(e mediaSourceHolder, z.a mediaPeriodId) {
        for (int i10 = 0; i10 < mediaSourceHolder.f56283c.size(); i10++) {
            if (mediaSourceHolder.f56283c.get(i10).f56510d == mediaPeriodId.f56510d) {
                return mediaPeriodId.a(c0(mediaSourceHolder, mediaPeriodId.f56507a));
            }
        }
        return null;
    }

    public synchronized z a0(int index) {
        return this.f56260i.get(index).f56281a;
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        e eVar = (e) androidx.media2.exoplayer.external.util.a.g(this.f56264m.remove(mediaPeriod));
        eVar.f56281a.c(mediaPeriod);
        eVar.f56283c.remove(((u) mediaPeriod).f56445b);
        if (!this.f56264m.isEmpty()) {
            V();
        }
        h0(eVar);
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        Object objB0 = b0(id2.f56507a);
        z.a aVarA = id2.a(Y(id2.f56507a));
        e eVar = this.f56265n.get(objB0);
        if (eVar == null) {
            eVar = new e(new c(), this.f56268q);
            eVar.f56286f = true;
            B(eVar, eVar.f56281a);
        }
        X(eVar);
        eVar.f56283c.add(aVarA);
        u uVarE = eVar.f56281a.e(aVarA, allocator, startPositionUs);
        this.f56264m.put(uVarE, eVar);
        V();
        return uVarE;
    }

    public synchronized int e0() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f56260i.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int y(e mediaSourceHolder, int windowIndex) {
        return windowIndex + mediaSourceHolder.f56285e;
    }

    public synchronized void i0(int currentIndex, int newIndex) {
        try {
            l0(currentIndex, newIndex, null, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void j0(int currentIndex, int newIndex, Handler handler, Runnable onCompletionAction) {
        l0(currentIndex, newIndex, handler, onCompletionAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void z(e mediaSourceHolder, z mediaSource, androidx.media2.exoplayer.external.z0 timeline) {
        y0(mediaSourceHolder, timeline);
    }

    public synchronized z n0(int index) {
        z zVarA0;
        zVarA0 = a0(index);
        s0(index, index + 1, null, null);
        return zVarA0;
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void o() {
        super.o();
        this.f56266o.clear();
    }

    public synchronized z o0(int index, Handler handler, Runnable onCompletionAction) {
        z zVarA0;
        zVarA0 = a0(index);
        s0(index, index + 1, handler, onCompletionAction);
        return zVarA0;
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void p() {
    }

    public synchronized void q0(int fromIndex, int toIndex) {
        s0(fromIndex, toIndex, null, null);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected synchronized void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        try {
            super.r(mediaTransferListener);
            this.f56262k = new Handler(new Handler.Callback(this) { // from class: androidx.media2.exoplayer.external.source.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final l f56234a;

                {
                    this.f56234a = this;
                }

                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    return this.f56234a.Q(message);
                }
            });
            if (this.f56260i.isEmpty()) {
                z0();
            } else {
                this.f56271t = this.f56271t.g(0, this.f56260i.size());
                O(0, this.f56260i);
                t0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void r0(int fromIndex, int toIndex, Handler handler, Runnable onCompletionAction) {
        s0(fromIndex, toIndex, handler, onCompletionAction);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected synchronized void t() {
        try {
            super.t();
            this.f56263l.clear();
            this.f56266o.clear();
            this.f56265n.clear();
            this.f56271t = this.f56271t.d();
            Handler handler = this.f56262k;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f56262k = null;
            }
            this.f56269r = false;
            this.f56270s.clear();
            W(this.f56261j);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void w0(x0 shuffleOrder) {
        try {
            v0(shuffleOrder, null, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void x0(x0 shuffleOrder, Handler handler, Runnable onCompletionAction) {
        try {
            v0(shuffleOrder, handler, onCompletionAction);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public l(boolean isAtomic, z... mediaSources) {
        this(isAtomic, new x0.a(0), mediaSources);
    }

    public l(boolean isAtomic, x0 shuffleOrder, z... mediaSources) {
        this(isAtomic, false, shuffleOrder, mediaSources);
    }

    public l(boolean isAtomic, boolean useLazyPreparation, x0 shuffleOrder, z... mediaSources) {
        for (z zVar : mediaSources) {
            androidx.media2.exoplayer.external.util.a.g(zVar);
        }
        this.f56271t = shuffleOrder.getLength() > 0 ? shuffleOrder.d() : shuffleOrder;
        this.f56264m = new IdentityHashMap();
        this.f56265n = new HashMap();
        this.f56260i = new ArrayList();
        this.f56263l = new ArrayList();
        this.f56270s = new HashSet();
        this.f56261j = new HashSet();
        this.f56266o = new HashSet();
        this.f56267p = isAtomic;
        this.f56268q = useLazyPreparation;
        M(Arrays.asList(mediaSources));
    }
}
