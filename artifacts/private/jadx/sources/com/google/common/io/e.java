package com.google.common.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
@z7.f("Implement it normally")
public interface e<T> {
    @z7.a
    boolean a(byte[] buf, int off, int len) throws IOException;

    @f0
    T getResult();
}
