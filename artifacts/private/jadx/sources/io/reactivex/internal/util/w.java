package io.reactivex.internal.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class w<T> implements dj.o<List<T>, List<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<? super T> f303514a;

    public w(Comparator<? super T> comparator) {
        this.f303514a = comparator;
    }

    @Override // dj.o
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<T> apply(List<T> list) throws Exception {
        Collections.sort(list, this.f303514a);
        return list;
    }
}
