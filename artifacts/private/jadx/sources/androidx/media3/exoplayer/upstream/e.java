package androidx.media3.exoplayer.upstream;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e implements androidx.media3.datasource.cache.a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f65849f = "CachedRegionTracker";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65850g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f65851h = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.cache.a f65852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f65853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.extractor.g f65854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TreeSet<a> f65855d = new TreeSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f65856e = new a(0, 0);

    private static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f65857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f65858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f65859c;

        public a(long j10, long j11) {
            this.f65857a = j10;
            this.f65858b = j11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return k1.u(this.f65857a, aVar.f65857a);
        }
    }

    public e(androidx.media3.datasource.cache.a aVar, String str, androidx.media3.extractor.g gVar) {
        this.f65852a = aVar;
        this.f65853b = str;
        this.f65854c = gVar;
        synchronized (this) {
            try {
                Iterator<androidx.media3.datasource.cache.i> itDescendingIterator = aVar.d(str, this).descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    h(itDescendingIterator.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void h(androidx.media3.datasource.cache.i iVar) {
        long j10 = iVar.f62371b;
        a aVar = new a(j10, iVar.f62372c + j10);
        a aVarFloor = this.f65855d.floor(aVar);
        a aVarCeiling = this.f65855d.ceiling(aVar);
        boolean zI = i(aVarFloor, aVar);
        if (i(aVar, aVarCeiling)) {
            if (zI) {
                aVarFloor.f65858b = aVarCeiling.f65858b;
                aVarFloor.f65859c = aVarCeiling.f65859c;
            } else {
                aVar.f65858b = aVarCeiling.f65858b;
                aVar.f65859c = aVarCeiling.f65859c;
                this.f65855d.add(aVar);
            }
            this.f65855d.remove(aVarCeiling);
            return;
        }
        if (!zI) {
            int iBinarySearch = Arrays.binarySearch(this.f65854c.f67331f, aVar.f65858b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            aVar.f65859c = iBinarySearch;
            this.f65855d.add(aVar);
            return;
        }
        aVarFloor.f65858b = aVar.f65858b;
        int i10 = aVarFloor.f65859c;
        while (true) {
            androidx.media3.extractor.g gVar = this.f65854c;
            if (i10 >= gVar.f67329d - 1) {
                break;
            }
            int i11 = i10 + 1;
            if (gVar.f67331f[i11] > aVarFloor.f65858b) {
                break;
            } else {
                i10 = i11;
            }
        }
        aVarFloor.f65859c = i10;
    }

    private boolean i(@p0 a aVar, @p0 a aVar2) {
        return (aVar == null || aVar2 == null || aVar.f65858b != aVar2.f65857a) ? false : true;
    }

    @Override // androidx.media3.datasource.cache.a.b
    public void d(androidx.media3.datasource.cache.a aVar, androidx.media3.datasource.cache.i iVar, androidx.media3.datasource.cache.i iVar2) {
    }

    @Override // androidx.media3.datasource.cache.a.b
    public synchronized void e(androidx.media3.datasource.cache.a aVar, androidx.media3.datasource.cache.i iVar) {
        h(iVar);
    }

    @Override // androidx.media3.datasource.cache.a.b
    public synchronized void f(androidx.media3.datasource.cache.a aVar, androidx.media3.datasource.cache.i iVar) {
        try {
            long j10 = iVar.f62371b;
            a aVar2 = new a(j10, iVar.f62372c + j10);
            a aVarFloor = this.f65855d.floor(aVar2);
            if (aVarFloor == null) {
                z.d(f65849f, "Removed a span we were not aware of");
                return;
            }
            this.f65855d.remove(aVarFloor);
            long j11 = aVarFloor.f65857a;
            long j12 = aVar2.f65857a;
            if (j11 < j12) {
                a aVar3 = new a(j11, j12);
                int iBinarySearch = Arrays.binarySearch(this.f65854c.f67331f, aVar3.f65858b);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                aVar3.f65859c = iBinarySearch;
                this.f65855d.add(aVar3);
            }
            long j13 = aVarFloor.f65858b;
            long j14 = aVar2.f65858b;
            if (j13 > j14) {
                a aVar4 = new a(j14 + 1, j13);
                aVar4.f65859c = aVarFloor.f65859c;
                this.f65855d.add(aVar4);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int g(long j10) {
        int i10;
        try {
            a aVar = this.f65856e;
            aVar.f65857a = j10;
            a aVarFloor = this.f65855d.floor(aVar);
            if (aVarFloor != null) {
                long j11 = aVarFloor.f65858b;
                if (j10 <= j11 && (i10 = aVarFloor.f65859c) != -1) {
                    androidx.media3.extractor.g gVar = this.f65854c;
                    if (i10 == gVar.f67329d - 1) {
                        if (j11 == gVar.f67331f[i10] + ((long) gVar.f67330e[i10])) {
                            return -2;
                        }
                    }
                    return (int) ((gVar.f67333h[i10] + ((gVar.f67332g[i10] * (j11 - gVar.f67331f[i10])) / ((long) gVar.f67330e[i10]))) / 1000);
                }
            }
            return -1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void j() {
        this.f65852a.j(this.f65853b, this);
    }
}
