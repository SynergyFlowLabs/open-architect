package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import rx.internal.operators.OperatorReplay;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    @NonNull
    public static <T, E extends j<T>> ArrayList<T> a(@NonNull ArrayList<E> arrayList) {
        OperatorReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            unboundedReplayBuffer.add(arrayList.get(i10).freeze());
        }
        return unboundedReplayBuffer;
    }

    @NonNull
    public static <T, E extends j<T>> ArrayList<T> b(@NonNull E[] eArr) {
        OperatorReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            unboundedReplayBuffer.add(e10.freeze());
        }
        return unboundedReplayBuffer;
    }

    @NonNull
    public static <T, E extends j<T>> ArrayList<T> c(@NonNull Iterable<E> iterable) {
        OperatorReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            unboundedReplayBuffer.add(it.next().freeze());
        }
        return unboundedReplayBuffer;
    }
}
