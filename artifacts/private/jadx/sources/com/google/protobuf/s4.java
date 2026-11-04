package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class s4 {
    private s4() {
    }

    public static u a(ByteBuffer buffer) {
        return u.D0(buffer);
    }

    public static u b(byte[] buffer) {
        return u.E0(buffer);
    }

    public static u c(byte[] buffer, int offset, int length) {
        return u.F0(buffer, offset, length);
    }

    public static void d(u bytes, t output) throws IOException {
        bytes.G0(output);
    }
}
