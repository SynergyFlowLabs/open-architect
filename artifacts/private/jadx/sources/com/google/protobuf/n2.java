package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
@y
public interface n2 extends o2 {

    public interface a extends o2, Cloneable {
        n2 B1();

        @x
        a F3(byte[] data) throws t1;

        boolean F6(InputStream input) throws IOException;

        @x
        /* JADX INFO: renamed from: Ig */
        a rl(z input, v0 extensionRegistry) throws IOException;

        @x
        /* JADX INFO: renamed from: N7 */
        a wl(byte[] data, int off, int len) throws t1;

        @x
        a Nh(u data) throws t1;

        @x
        a Qh(z input) throws IOException;

        @x
        a T9(n2 other);

        @x
        /* JADX INFO: renamed from: Va */
        a xl(byte[] data, int off, int len, v0 extensionRegistry) throws t1;

        boolean Vb(InputStream input, v0 extensionRegistry) throws IOException;

        @x
        a Yh(u data, v0 extensionRegistry) throws t1;

        n2 build();

        @x
        a cc(byte[] data, v0 extensionRegistry) throws t1;

        @x
        a clear();

        /* JADX INFO: renamed from: clone */
        a mo8clone();

        @x
        a u2(InputStream input) throws IOException;

        @x
        a ze(InputStream input, v0 extensionRegistry) throws IOException;
    }

    a G1();

    byte[] H0();

    void Nb(b0 output) throws IOException;

    f3<? extends n2> W7();

    void g2(OutputStream output) throws IOException;

    a r1();

    u u1();

    int w1();

    void writeTo(OutputStream output) throws IOException;
}
