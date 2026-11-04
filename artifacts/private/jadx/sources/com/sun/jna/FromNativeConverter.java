package com.sun.jna;

/* JADX INFO: loaded from: classes13.dex */
public interface FromNativeConverter {
    Object fromNative(Object obj, FromNativeContext fromNativeContext);

    Class<?> nativeType();
}
