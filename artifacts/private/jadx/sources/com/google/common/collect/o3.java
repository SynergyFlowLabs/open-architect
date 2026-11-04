package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class o3<T> extends a9<T> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f117885d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Comparator<? super T>[] f117886c;

    o3(Comparator<? super T> primary, Comparator<? super T> secondary) {
        this.f117886c = new Comparator[]{primary, secondary};
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(@b9 T left, @b9 T right) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f117886c;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(left, right);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o3) {
            return Arrays.equals(this.f117886c, ((o3) object).f117886c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f117886c);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f117886c) + ")";
    }

    o3(Iterable<? extends Comparator<? super T>> comparators) {
        this.f117886c = (Comparator[]) o7.R(comparators, new Comparator[0]);
    }
}
