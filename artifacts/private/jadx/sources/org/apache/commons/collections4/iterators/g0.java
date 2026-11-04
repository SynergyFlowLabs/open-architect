package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class g0<E> implements Iterator<List<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f335799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, E> f335800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f335801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f335802d;

    public g0(Collection<? extends E> collection) {
        if (collection == null) {
            throw new NullPointerException("The collection must not be null");
        }
        this.f335799a = new int[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        this.f335801c = zArr;
        Arrays.fill(zArr, false);
        this.f335800b = new HashMap();
        Iterator<? extends E> it = collection.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            this.f335800b.put(Integer.valueOf(i10), it.next());
            this.f335799a[i10 - 1] = i10;
            i10++;
        }
        this.f335802d = new ArrayList(collection);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<E> next() {
        int[] iArr;
        int i10;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            iArr = this.f335799a;
            if (i12 >= iArr.length) {
                break;
            }
            boolean z10 = this.f335801c[i12];
            if (((z10 && i12 < iArr.length - 1 && iArr[i12] > iArr[i12 + 1]) || (!z10 && i12 > 0 && iArr[i12] > iArr[i12 - 1])) && (i10 = iArr[i12]) > i13) {
                i14 = i12;
                i13 = i10;
            }
            i12++;
        }
        if (i13 == -1) {
            List<E> list = this.f335802d;
            this.f335802d = null;
            return list;
        }
        boolean[] zArr = this.f335801c;
        boolean z11 = zArr[i14];
        int i15 = z11 ? 1 : -1;
        int i16 = iArr[i14];
        int i17 = i15 + i14;
        iArr[i14] = iArr[i17];
        iArr[i17] = i16;
        zArr[i14] = zArr[i17];
        zArr[i17] = z11;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int[] iArr2 = this.f335799a;
            if (i11 >= iArr2.length) {
                List<E> list2 = this.f335802d;
                this.f335802d = arrayList;
                return list2;
            }
            int i18 = iArr2[i11];
            if (i18 > i13) {
                boolean[] zArr2 = this.f335801c;
                zArr2[i11] = !zArr2[i11];
            }
            arrayList.add(this.f335800b.get(Integer.valueOf(i18)));
            i11++;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335802d != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
