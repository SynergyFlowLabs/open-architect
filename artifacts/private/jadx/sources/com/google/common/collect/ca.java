package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
interface ca<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
