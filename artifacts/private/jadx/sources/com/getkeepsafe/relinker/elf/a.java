package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class a extends c.a {
    public a(final f parser, final c.b header, long baseOffset, final int index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(header.f102880a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j10 = baseOffset + ((long) (index * 8));
        this.f102875a = parser.j(byteBufferAllocate, j10);
        this.f102876b = parser.j(byteBufferAllocate, j10 + 4);
    }
}
