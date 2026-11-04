package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@k
@com.google.common.annotations.a
public interface r extends i0 {
    @Override // com.google.common.hash.i0
    @z7.a
    r a(float f10);

    @Override // com.google.common.hash.i0
    @z7.a
    r b(int i10);

    @Override // com.google.common.hash.i0
    @z7.a
    r c(long l10);

    @Override // com.google.common.hash.i0
    @z7.a
    r d(double d10);

    @Override // com.google.common.hash.i0
    @z7.a
    r e(short s10);

    @Override // com.google.common.hash.i0
    @z7.a
    r f(boolean b10);

    @Override // com.google.common.hash.i0
    @z7.a
    r g(byte b10);

    @Override // com.google.common.hash.i0
    @z7.a
    r h(byte[] bytes);

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.i0
    @z7.a
    r i(char c10);

    @Override // com.google.common.hash.i0
    @z7.a
    r j(CharSequence charSequence);

    @Override // com.google.common.hash.i0
    @z7.a
    r k(byte[] bytes, int off, int len);

    @Override // com.google.common.hash.i0
    @z7.a
    r l(ByteBuffer bytes);

    @Override // com.google.common.hash.i0
    @z7.a
    r m(CharSequence charSequence, Charset charset);

    p n();

    @z7.a
    <T> r o(@h0 T instance, n<? super T> funnel);
}
