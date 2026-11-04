package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public interface k extends Closeable, Flushable {
    void P0(byte[] bArr, int i10, int i11) throws IOException;

    void P9(int i10) throws IOException;

    h c4(int i10) throws IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
