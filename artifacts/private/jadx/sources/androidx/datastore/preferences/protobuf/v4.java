package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class v4 {
    private v4() {
    }

    public static u a(ByteBuffer buffer) {
        return u.E0(buffer);
    }

    public static u b(byte[] buffer) {
        return u.F0(buffer);
    }

    public static u c(byte[] buffer, int offset, int length) {
        return u.G0(buffer, offset, length);
    }

    public static void d(u bytes, t output) throws IOException {
        bytes.H0(output);
    }
}
