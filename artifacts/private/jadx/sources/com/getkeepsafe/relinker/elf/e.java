package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class e extends c.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f102897m;

    public e(final boolean bigEndian, final f parser) throws IOException {
        this.f102880a = bigEndian;
        this.f102897m = parser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f102881b = parser.f(byteBufferAllocate, 16L);
        this.f102882c = parser.g(byteBufferAllocate, 32L);
        this.f102883d = parser.g(byteBufferAllocate, 40L);
        this.f102884e = parser.f(byteBufferAllocate, 54L);
        this.f102885f = parser.f(byteBufferAllocate, 56L);
        this.f102886g = parser.f(byteBufferAllocate, 58L);
        this.f102887h = parser.f(byteBufferAllocate, 60L);
        this.f102888i = parser.f(byteBufferAllocate, 62L);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.a a(final long baseOffset, final int index) throws IOException {
        return new b(this.f102897m, this, baseOffset, index);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.AbstractC0930c b(final long index) throws IOException {
        return new h(this.f102897m, this, index);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.d c(final int index) throws IOException {
        return new j(this.f102897m, this, index);
    }
}
