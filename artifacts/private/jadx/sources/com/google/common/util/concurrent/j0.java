package com.google.common.util.concurrent;

import com.google.common.collect.h6;
import com.google.common.collect.x7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b(emulated = true)
abstract class j0<V, C> extends t<V, C> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @a8.b
    @fj.a
    private List<b<V>> f120118t;

    static final class a<V> extends j0<V, List<V>> {
        a(h6<? extends t1<? extends V>> futures, boolean allMustSucceed) {
            super(futures, allMustSucceed);
            U();
        }

        @Override // com.google.common.util.concurrent.j0
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public List<V> Z(List<b<V>> values) {
            ArrayList arrayListU = x7.u(values.size());
            Iterator<b<V>> it = values.iterator();
            while (it.hasNext()) {
                b<V> next = it.next();
                arrayListU.add(next != null ? next.f120119a : null);
            }
            return Collections.unmodifiableList(arrayListU);
        }
    }

    private static final class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d2
        final V f120119a;

        b(@d2 V value) {
            this.f120119a = value;
        }
    }

    j0(h6<? extends t1<? extends V>> futures, boolean allMustSucceed) {
        super(futures, allMustSucceed, true);
        List<b<V>> listU = futures.isEmpty() ? Collections.EMPTY_LIST : x7.u(futures.size());
        for (int i10 = 0; i10 < futures.size(); i10++) {
            listU.add(null);
        }
        this.f120118t = listU;
    }

    @Override // com.google.common.util.concurrent.t
    final void P(int index, @d2 V returnValue) {
        List<b<V>> list = this.f120118t;
        if (list != null) {
            list.set(index, new b<>(returnValue));
        }
    }

    @Override // com.google.common.util.concurrent.t
    final void S() {
        List<b<V>> list = this.f120118t;
        if (list != null) {
            B(Z(list));
        }
    }

    @Override // com.google.common.util.concurrent.t
    void Y(t.a reason) {
        super.Y(reason);
        this.f120118t = null;
    }

    abstract C Z(List<b<V>> values);
}
