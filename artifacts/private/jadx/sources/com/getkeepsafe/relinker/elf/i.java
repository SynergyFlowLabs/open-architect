package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class i extends c.d {
    public i(final f parser, final c.b header, final int index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(header.f102880a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f102895a = parser.j(byteBufferAllocate, header.f102883d + ((long) (index * header.f102886g)) + 28);
    }
}
