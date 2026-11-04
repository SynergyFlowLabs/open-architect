package io.ably.lib.types;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public class f0 {
    public static e0 a(String str) throws a {
        return (e0) io.ably.lib.util.p.f288250c.r(str, e0.class);
    }

    public static e0 b(byte[] bArr) throws a {
        try {
            return e0.c(io.ably.lib.util.p.f288252e.n(bArr));
        } catch (IOException e10) {
            throw a.c(e10);
        }
    }

    public static byte[] c(e0 e0Var) throws a {
        return io.ably.lib.util.p.f288250c.D(e0Var).getBytes(Charset.forName("UTF-8"));
    }

    public static byte[] d(e0 e0Var) throws a {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        org.msgpack.core.j jVarG = io.ably.lib.util.p.f288251d.g(byteArrayOutputStream);
        try {
            e0Var.h(jVarG);
            jVarG.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw a.c(e10);
        }
    }
}
