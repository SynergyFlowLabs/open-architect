package com.sun.jna;

/* JADX INFO: loaded from: classes13.dex */
public interface TypeMapper {
    FromNativeConverter getFromNativeConverter(Class<?> cls);

    ToNativeConverter getToNativeConverter(Class<?> cls);
}
