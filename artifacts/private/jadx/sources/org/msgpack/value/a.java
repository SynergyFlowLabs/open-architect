package org.msgpack.value;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface a extends x, Iterable<x> {
    x Z2(int i10);

    x get(int i10);

    List<x> h1();

    @Override // java.lang.Iterable
    Iterator<x> iterator();

    int size();
}
