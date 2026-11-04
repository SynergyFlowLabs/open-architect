package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class d extends c.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f102896m;

    public d(final boolean bigEndian, final f parser) throws IOException {
        this.f102880a = bigEndian;
        this.f102896m = parser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f102881b = parser.f(byteBufferAllocate, 16L);
        this.f102882c = parser.j(byteBufferAllocate, 28L);
        this.f102883d = parser.j(byteBufferAllocate, 32L);
        this.f102884e = parser.f(byteBufferAllocate, 42L);
        this.f102885f = parser.f(byteBufferAllocate, 44L);
        this.f102886g = parser.f(byteBufferAllocate, 46L);
        this.f102887h = parser.f(byteBufferAllocate, 48L);
        this.f102888i = parser.f(byteBufferAllocate, 50L);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.a a(final long baseOffset, final int index) throws IOException {
        return new a(this.f102896m, this, baseOffset, index);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.AbstractC0930c b(final long index) throws IOException {
        return new g(this.f102896m, this, index);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.d c(final int index) throws IOException {
        return new i(this.f102896m, this, index);
    }
}
