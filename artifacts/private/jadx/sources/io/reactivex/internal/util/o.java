package io.reactivex.internal.util;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public enum o implements dj.c<List, Object, List> {
    INSTANCE;

    public static <T> dj.c<List<T>, T, List<T>> k() {
        return INSTANCE;
    }

    @Override // dj.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
