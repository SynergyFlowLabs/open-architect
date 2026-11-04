package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class j implements androidx.media3.extractor.text.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d> f68972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f68973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f68974c;

    public j(List<d> list) {
        this.f68972a = Collections.unmodifiableList(new ArrayList(list));
        this.f68973b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f68973b;
            jArr[i11] = dVar.f68912b;
            jArr[i11 + 1] = dVar.f68913c;
        }
        long[] jArr2 = this.f68973b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f68974c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // androidx.media3.extractor.text.j
    public long b(int i10) {
        androidx.media3.common.util.a.a(i10 >= 0);
        androidx.media3.common.util.a.a(i10 < this.f68974c.length);
        return this.f68974c[i10];
    }

    @Override // androidx.media3.extractor.text.j
    public int k() {
        return this.f68974c.length;
    }

    @Override // androidx.media3.extractor.text.j
    public int l(long j10) {
        int iJ = k1.j(this.f68974c, j10, false, false);
        if (iJ < this.f68974c.length) {
            return iJ;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.j
    public List<androidx.media3.common.text.a> n(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f68972a.size(); i10++) {
            long[] jArr = this.f68973b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f68972a.get(i10);
                androidx.media3.common.text.a aVar = dVar.f68911a;
                if (aVar.f61379e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: androidx.media3.extractor.text.webvtt.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f68912b, ((d) obj2).f68912b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f68911a.a().t((-1) - i12, 1).a());
        }
        return arrayList;
    }
}
