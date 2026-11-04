package com.rabbitmq.client.impl.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes13.dex */
public class j {
    static int a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int i10 = readableByteChannel.read(byteBuffer);
        if (i10 >= 0) {
            return i10;
        }
        throw new IOException("I/O thread: reached EOF");
    }
}
