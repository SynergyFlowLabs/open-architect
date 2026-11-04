package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
@y
public interface q2 extends r2 {

    public interface a extends r2, Cloneable {
        q2 B1();

        @x
        a Ch(u data, v0 extensionRegistry) throws t1;

        @x
        a F3(byte[] data) throws t1;

        boolean F6(InputStream input) throws IOException;

        @x
        /* JADX INFO: renamed from: N7 */
        a y3(byte[] data, int off, int len) throws t1;

        @x
        /* JADX INFO: renamed from: Ng */
        a g3(z input, v0 extensionRegistry) throws IOException;

        @x
        a Ra(InputStream input, v0 extensionRegistry) throws IOException;

        @x
        a Re(u data) throws t1;

        @x
        a Se(z input) throws IOException;

        q2 build();

        @x
        a clear();

        /* JADX INFO: renamed from: clone */
        a mo6clone();

        @x
        a i8(q2 other);

        @x
        a jf(byte[] data, int off, int len, v0 extensionRegistry) throws t1;

        boolean lk(InputStream input, v0 extensionRegistry) throws IOException;

        @x
        a sh(byte[] data, v0 extensionRegistry) throws t1;

        @x
        a u2(InputStream input) throws IOException;
    }

    a G1();

    byte[] H0();

    h3<? extends q2> W7();

    void X7(b0 output) throws IOException;

    void g2(OutputStream output) throws IOException;

    a r1();

    u u1();

    int w1();

    void writeTo(OutputStream output) throws IOException;
}
