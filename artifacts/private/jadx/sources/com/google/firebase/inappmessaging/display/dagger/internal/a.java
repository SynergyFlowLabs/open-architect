package com.google.firebase.inappmessaging.display.dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f122172a = 1073741824;

    private a() {
    }

    private static int a(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    static <T> HashSet<T> c(int i10) {
        return new HashSet<>(a(i10));
    }

    public static <K, V> LinkedHashMap<K, V> d(int i10) {
        return new LinkedHashMap<>(a(i10));
    }

    public static <T> List<T> e(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }
}
