package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class h extends c.AbstractC0930c {
    public h(final f parser, final c.b header, final long index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(header.f102880a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j10 = header.f102882c + (index * ((long) header.f102884e));
        this.f102891a = parser.j(byteBufferAllocate, j10);
        this.f102892b = parser.g(byteBufferAllocate, 8 + j10);
        this.f102893c = parser.g(byteBufferAllocate, 16 + j10);
        this.f102894d = parser.g(byteBufferAllocate, j10 + 40);
    }
}
