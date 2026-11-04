package androidx.media2.widget;

import android.graphics.Canvas;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.LongSparseArray;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.SubtitleData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class r implements j.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f60195n = "SubtitleTrack";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f60196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f60197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f60198c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f60203h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaFormat f60206k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected j f60208m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray<e> f60199d = new LongSparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LongSparseArray<e> f60200e = new LongSparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ArrayList<b> f60202g = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f60204i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Handler f60205j = new Handler();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f60207l = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f60201f = new c();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f60209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f60210b;

        a(r rVar, long j10) {
            this.f60209a = rVar;
            this.f60210b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f60209a) {
                try {
                    r rVar = r.this;
                    rVar.f60198c = null;
                    rVar.s(true, this.f60210b);
                    r rVar2 = r.this;
                    rVar2.t(rVar2.f60202g);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f60212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f60213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public long[] f60214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f60215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public b f60216e;

        public void a(long j10) {
        }
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f60217c = "CueList";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f60219b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SortedMap<Long, ArrayList<b>> f60218a = new TreeMap();

        class a implements Iterable<Pair<Long, b>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f60220a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f60221b;

            a(long j10, long j11) {
                this.f60220a = j10;
                this.f60221b = j11;
            }

            @Override // java.lang.Iterable
            public Iterator<Pair<Long, b>> iterator() {
                boolean z10 = c.this.f60219b;
                try {
                    c cVar = c.this;
                    return cVar.new b(cVar.f60218a.subMap(Long.valueOf(this.f60220a + 1), Long.valueOf(this.f60221b + 1)));
                } catch (IllegalArgumentException unused) {
                    return c.this.new b(null);
                }
            }
        }

        class b implements Iterator<Pair<Long, b>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f60223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Iterator<b> f60224b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f60225c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private SortedMap<Long, ArrayList<b>> f60226d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Iterator<b> f60227e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Pair<Long, b> f60228f;

            b(SortedMap<Long, ArrayList<b>> sortedMap) {
                if (c.this.f60219b) {
                    Objects.toString(sortedMap);
                }
                this.f60226d = sortedMap;
                this.f60227e = null;
                c();
            }

            private void c() {
                do {
                    try {
                        SortedMap<Long, ArrayList<b>> sortedMap = this.f60226d;
                        if (sortedMap == null) {
                            throw new NoSuchElementException("");
                        }
                        long jLongValue = sortedMap.firstKey().longValue();
                        this.f60223a = jLongValue;
                        this.f60224b = this.f60226d.get(Long.valueOf(jLongValue)).iterator();
                        try {
                            this.f60226d = this.f60226d.tailMap(Long.valueOf(this.f60223a + 1));
                        } catch (IllegalArgumentException unused) {
                            this.f60226d = null;
                        }
                        this.f60225c = false;
                    } catch (NoSuchElementException unused2) {
                        this.f60225c = true;
                        this.f60226d = null;
                        this.f60224b = null;
                        return;
                    }
                    this.f60225c = true;
                    this.f60226d = null;
                    this.f60224b = null;
                    return;
                } while (!this.f60224b.hasNext());
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Pair<Long, b> next() {
                if (this.f60225c) {
                    throw new NoSuchElementException("");
                }
                this.f60228f = new Pair<>(Long.valueOf(this.f60223a), this.f60224b.next());
                Iterator<b> it = this.f60224b;
                this.f60227e = it;
                if (!it.hasNext()) {
                    c();
                }
                return this.f60228f;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f60225c;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f60227e != null) {
                    Pair<Long, b> pair = this.f60228f;
                    if (((b) pair.second).f60213b == ((Long) pair.first).longValue()) {
                        this.f60227e.remove();
                        this.f60227e = null;
                        if (c.this.f60218a.get(this.f60228f.first).size() == 0) {
                            c.this.f60218a.remove(this.f60228f.first);
                        }
                        b bVar = (b) this.f60228f.second;
                        c.this.f(bVar, bVar.f60212a);
                        long[] jArr = bVar.f60214c;
                        if (jArr != null) {
                            for (long j10 : jArr) {
                                c.this.f(bVar, j10);
                            }
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException("");
            }
        }

        c() {
        }

        private boolean b(b bVar, long j10) {
            ArrayList<b> arrayList = this.f60218a.get(Long.valueOf(j10));
            if (arrayList == null) {
                arrayList = new ArrayList<>(2);
                this.f60218a.put(Long.valueOf(j10), arrayList);
            } else if (arrayList.contains(bVar)) {
                return false;
            }
            arrayList.add(bVar);
            return true;
        }

        public void a(b bVar) {
            long j10 = bVar.f60212a;
            if (j10 < bVar.f60213b && b(bVar, j10)) {
                long j11 = bVar.f60212a;
                long[] jArr = bVar.f60214c;
                if (jArr != null) {
                    for (long j12 : jArr) {
                        if (j12 > j11 && j12 < bVar.f60213b) {
                            b(bVar, j12);
                            j11 = j12;
                        }
                    }
                }
                b(bVar, bVar.f60213b);
            }
        }

        public Iterable<Pair<Long, b>> c(long j10, long j11) {
            return new a(j10, j11);
        }

        public long d(long j10) {
            try {
                SortedMap<Long, ArrayList<b>> sortedMapTailMap = this.f60218a.tailMap(Long.valueOf(j10 + 1));
                if (sortedMapTailMap != null) {
                    return sortedMapTailMap.firstKey().longValue();
                }
            } catch (IllegalArgumentException | NoSuchElementException unused) {
            }
            return -1L;
        }

        public void e(b bVar) {
            f(bVar, bVar.f60212a);
            long[] jArr = bVar.f60214c;
            if (jArr != null) {
                for (long j10 : jArr) {
                    f(bVar, j10);
                }
            }
            f(bVar, bVar.f60213b);
        }

        void f(b bVar, long j10) {
            ArrayList<b> arrayList = this.f60218a.get(Long.valueOf(j10));
            if (arrayList != null) {
                arrayList.remove(bVar);
                if (arrayList.size() == 0) {
                    this.f60218a.remove(Long.valueOf(j10));
                }
            }
        }
    }

    interface d {

        public interface a {
            void a(@NonNull d dVar);
        }

        void b(a aVar);

        void c(int i10, int i11);

        void draw(Canvas canvas);

        void onAttachedToWindow();

        void onDetachedFromWindow();

        void setVisible(boolean z10);
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f60230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f60231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f60232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f60233d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f60234e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f60235f = -1;

        e() {
        }

        public void a() {
            e eVar = this.f60232c;
            if (eVar != null) {
                eVar.f60231b = this.f60231b;
                this.f60232c = null;
            }
            e eVar2 = this.f60231b;
            if (eVar2 != null) {
                eVar2.f60232c = eVar;
                this.f60231b = null;
            }
        }

        public void b(LongSparseArray<e> longSparseArray) {
            int iIndexOfKey = longSparseArray.indexOfKey(this.f60235f);
            if (iIndexOfKey >= 0) {
                if (this.f60232c == null) {
                    e eVar = this.f60231b;
                    if (eVar == null) {
                        longSparseArray.removeAt(iIndexOfKey);
                    } else {
                        longSparseArray.setValueAt(iIndexOfKey, eVar);
                    }
                }
                a();
            }
            long j10 = this.f60233d;
            if (j10 >= 0) {
                this.f60232c = null;
                e eVar2 = longSparseArray.get(j10);
                this.f60231b = eVar2;
                if (eVar2 != null) {
                    eVar2.f60232c = this;
                }
                longSparseArray.put(this.f60233d, this);
                this.f60235f = this.f60233d;
            }
        }
    }

    r(MediaFormat mediaFormat) {
        this.f60206k = mediaFormat;
        e();
        this.f60197b = -1L;
    }

    private void m(int i10) {
        e eVarValueAt = this.f60199d.valueAt(i10);
        while (eVarValueAt != null) {
            b bVar = eVarValueAt.f60230a;
            while (bVar != null) {
                this.f60201f.e(bVar);
                b bVar2 = bVar.f60216e;
                bVar.f60216e = null;
                bVar = bVar2;
            }
            this.f60200e.remove(eVarValueAt.f60234e);
            e eVar = eVarValueAt.f60231b;
            eVarValueAt.f60232c = null;
            eVarValueAt.f60231b = null;
            eVarValueAt = eVar;
        }
        this.f60199d.removeAt(i10);
    }

    private synchronized void r(long j10) {
        try {
            this.f60197b = j10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media2.widget.j.a
    public void a() {
        synchronized (this) {
            e();
            this.f60197b = -1L;
        }
        t(this.f60202g);
        this.f60207l = -1L;
        this.f60208m.b(-1L, this);
    }

    @Override // androidx.media2.widget.j.a
    public void b(long j10) {
        synchronized (this) {
            try {
                long j11 = j10 / 1000;
                s(true, j11);
                r(j11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t(this.f60202g);
        n();
    }

    @Override // androidx.media2.widget.j.a
    public void c(long j10) {
        synchronized (this) {
            try {
                long j11 = j10 / 1000;
                s(false, j11);
                r(j11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t(this.f60202g);
        n();
    }

    protected synchronized boolean d(b bVar) {
        long jA;
        try {
            this.f60201f.a(bVar);
            long j10 = bVar.f60215d;
            if (j10 != 0) {
                e eVar = this.f60200e.get(j10);
                if (eVar == null) {
                    eVar = new e();
                    this.f60200e.put(bVar.f60215d, eVar);
                    eVar.f60233d = bVar.f60213b;
                } else {
                    long j11 = eVar.f60233d;
                    long j12 = bVar.f60213b;
                    if (j11 < j12) {
                        eVar.f60233d = j12;
                    }
                }
                bVar.f60216e = eVar.f60230a;
                eVar.f60230a = bVar;
            }
            j jVar = this.f60208m;
            if (jVar != null) {
                try {
                    jA = jVar.a(false, true) / 1000;
                } catch (IllegalStateException unused) {
                    jA = -1;
                }
            } else {
                jA = -1;
            }
            boolean z10 = this.f60203h;
            if (z10 && bVar.f60212a <= jA && bVar.f60213b >= this.f60197b) {
                Runnable runnable = this.f60198c;
                if (runnable != null) {
                    this.f60205j.removeCallbacks(runnable);
                }
                a aVar = new a(this, jA);
                this.f60198c = aVar;
                this.f60205j.postDelayed(aVar, 10L);
                return true;
            }
            if (z10 && bVar.f60213b >= this.f60197b) {
                long j13 = bVar.f60212a;
                long j14 = this.f60207l;
                if (j13 < j14 || j14 < 0) {
                    n();
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected synchronized void e() {
        try {
            if (this.f60204i) {
                this.f60202g.size();
            }
            this.f60202g.clear();
            this.f60196a = -1L;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected void f(long j10) {
        e eVar;
        if (j10 == 0 || j10 == -1 || (eVar = this.f60200e.get(j10)) == null) {
            return;
        }
        eVar.b(this.f60199d);
    }

    protected void finalize() throws Throwable {
        int size = this.f60199d.size();
        while (true) {
            size--;
            if (size < 0) {
                super.finalize();
                return;
            }
            m(size);
        }
    }

    public final MediaFormat g() {
        return this.f60206k;
    }

    public abstract d h();

    public int i() {
        return h() == null ? 3 : 4;
    }

    public void j() {
        if (this.f60203h) {
            j jVar = this.f60208m;
            if (jVar != null) {
                jVar.d(this);
            }
            d dVarH = h();
            if (dVarH != null) {
                dVarH.setVisible(false);
            }
            this.f60203h = false;
        }
    }

    public void k(SubtitleData subtitleData) {
        long jG = subtitleData.g() + 1;
        l(subtitleData.d(), true, jG);
        o(jG, (subtitleData.g() + subtitleData.f()) / 1000);
    }

    protected abstract void l(byte[] bArr, boolean z10, long j10);

    protected void n() {
        if (this.f60208m != null) {
            this.f60207l = this.f60201f.d(this.f60197b);
            j jVar = this.f60208m;
            long j10 = this.f60207l;
            jVar.b(j10 >= 0 ? j10 * 1000 : -1L, this);
        }
    }

    public void o(long j10, long j11) {
        e eVar;
        if (j10 == 0 || j10 == -1 || (eVar = this.f60200e.get(j10)) == null) {
            return;
        }
        eVar.f60233d = j11;
        eVar.b(this.f60199d);
    }

    public synchronized void p(j jVar) {
        try {
            j jVar2 = this.f60208m;
            if (jVar2 == jVar) {
                return;
            }
            if (jVar2 != null) {
                jVar2.d(this);
            }
            this.f60208m = jVar;
            if (jVar != null) {
                jVar.c(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void q() {
        if (this.f60203h) {
            return;
        }
        this.f60203h = true;
        d dVarH = h();
        if (dVarH != null) {
            dVarH.setVisible(true);
        }
        j jVar = this.f60208m;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    protected synchronized void s(boolean z10, long j10) {
        if (z10) {
            e();
        } else {
            try {
                if (this.f60196a > j10) {
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator<Pair<Long, b>> it = this.f60201f.c(this.f60196a, j10).iterator();
        while (it.hasNext()) {
            Pair<Long, b> next = it.next();
            b bVar = (b) next.second;
            if (bVar.f60213b == ((Long) next.first).longValue()) {
                if (this.f60204i) {
                    bVar.toString();
                }
                this.f60202g.remove(bVar);
                if (bVar.f60215d == 0) {
                    it.remove();
                }
            } else if (bVar.f60212a == ((Long) next.first).longValue()) {
                if (this.f60204i) {
                    bVar.toString();
                }
                if (bVar.f60214c != null) {
                    bVar.a(j10);
                }
                this.f60202g.add(bVar);
            } else if (bVar.f60214c != null) {
                bVar.a(j10);
            }
        }
        while (this.f60199d.size() > 0 && this.f60199d.keyAt(0) <= j10) {
            m(0);
        }
        this.f60196a = j10;
    }

    public abstract void t(ArrayList<b> arrayList);
}
