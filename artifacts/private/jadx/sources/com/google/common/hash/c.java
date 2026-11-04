package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
abstract class c implements q {
    c() {
    }

    @Override // com.google.common.hash.q
    public r a(int expectedInputSize) {
        com.google.common.base.j0.k(expectedInputSize >= 0, "expectedInputSize must be >= 0 but was %s", expectedInputSize);
        return i();
    }

    @Override // com.google.common.hash.q
    public p b(byte[] input) {
        return k(input, 0, input.length);
    }

    @Override // com.google.common.hash.q
    public p c(int input) {
        return a(4).b(input).n();
    }

    @Override // com.google.common.hash.q
    public <T> p d(@h0 T instance, n<? super T> funnel) {
        return i().o(instance, funnel).n();
    }

    @Override // com.google.common.hash.q
    public p e(long input) {
        return a(8).c(input).n();
    }

    @Override // com.google.common.hash.q
    public p f(CharSequence input, Charset charset) {
        return i().m(input, charset).n();
    }

    @Override // com.google.common.hash.q
    public p g(CharSequence input) {
        return a(input.length() * 2).j(input).n();
    }

    @Override // com.google.common.hash.q
    public p j(ByteBuffer input) {
        return a(input.remaining()).l(input).n();
    }

    @Override // com.google.common.hash.q
    public p k(byte[] input, int off, int len) {
        com.google.common.base.j0.f0(off, off + len, input.length);
        return a(len).k(input, off, len).n();
    }
}
