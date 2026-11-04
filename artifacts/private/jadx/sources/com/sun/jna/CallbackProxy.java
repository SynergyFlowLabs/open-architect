package com.sun.jna;

/* JADX INFO: loaded from: classes13.dex */
public interface CallbackProxy extends Callback {
    Object callback(Object[] objArr);

    Class<?>[] getParameterTypes();

    Class<?> getReturnType();
}
