package com.google.common.reflect;

import com.google.common.base.j0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes5.dex */
@d
abstract class m<T> {
    m() {
    }

    final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        j0.u(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
