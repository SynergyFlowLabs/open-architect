package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes14.dex */
public class l {
    private l() {
    }

    public static <T> T a(Enumeration<T> enumeration, int i10) {
        j.g(i10);
        while (enumeration.hasMoreElements()) {
            i10--;
            if (i10 == -1) {
                return enumeration.nextElement();
            }
            enumeration.nextElement();
        }
        throw new IndexOutOfBoundsException("Entry does not exist: " + i10);
    }

    public static <E> List<E> b(Enumeration<? extends E> enumeration) {
        return w.e0(new org.apache.commons.collections4.iterators.r(enumeration));
    }

    public static List<String> c(StringTokenizer stringTokenizer) {
        ArrayList arrayList = new ArrayList(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return arrayList;
    }
}
