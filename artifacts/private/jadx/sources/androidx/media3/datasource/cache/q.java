package androidx.media3.datasource.cache;

import androidx.media3.common.util.b1;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class q implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f62436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet<i> f62437b = new TreeSet<>(new Comparator() { // from class: androidx.media3.datasource.cache.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return q.h((i) obj, (i) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f62438c;

    public q(long j10) {
        this.f62436a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(i iVar, i iVar2) {
        long j10 = iVar.f62375f;
        long j11 = iVar2.f62375f;
        if (j10 - j11 == 0) {
            return iVar.compareTo(iVar2);
        }
        return j10 < j11 ? -1 : 1;
    }

    private void i(a aVar, long j10) {
        while (this.f62438c + j10 > this.f62436a && !this.f62437b.isEmpty()) {
            aVar.c(this.f62437b.first());
        }
    }

    @Override // androidx.media3.datasource.cache.d
    public boolean a() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.d
    public void b(a aVar, String str, long j10, long j11) {
        if (j11 != -1) {
            i(aVar, j11);
        }
    }

    @Override // androidx.media3.datasource.cache.d
    public void c() {
    }

    @Override // androidx.media3.datasource.cache.a.b
    public void d(a aVar, i iVar, i iVar2) {
        f(aVar, iVar);
        e(aVar, iVar2);
    }

    @Override // androidx.media3.datasource.cache.a.b
    public void e(a aVar, i iVar) {
        this.f62437b.add(iVar);
        this.f62438c += iVar.f62372c;
        i(aVar, 0L);
    }

    @Override // androidx.media3.datasource.cache.a.b
    public void f(a aVar, i iVar) {
        this.f62437b.remove(iVar);
        this.f62438c -= iVar.f62372c;
    }
}
