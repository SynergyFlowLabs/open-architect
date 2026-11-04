package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
final class z2 {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = g2.f109126a;
            }
        } else {
            if (!(iterable instanceof y2)) {
                return false;
            }
            comparator2 = ((y2) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
