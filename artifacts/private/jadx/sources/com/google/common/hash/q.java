package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
public interface q {
    r a(int expectedInputSize);

    p b(byte[] input);

    p c(int input);

    <T> p d(@h0 T instance, n<? super T> funnel);

    p e(long input);

    p f(CharSequence input, Charset charset);

    p g(CharSequence input);

    int h();

    r i();

    p j(ByteBuffer input);

    p k(byte[] input, int off, int len);
}
