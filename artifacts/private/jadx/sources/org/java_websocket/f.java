package org.java_websocket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Collection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes14.dex */
public interface f {
    void B(ByteBuffer byteBuffer);

    InetSocketAddress D();

    em.d E();

    boolean H();

    <T> T I();

    void J(int i10, String str);

    void b(byte[] bArr);

    String c();

    void close();

    void close(int i10, String str);

    boolean e();

    <T> void f(T t10);

    void g(org.java_websocket.framing.f fVar);

    km.a getProtocol();

    SSLSession getSSLSession() throws IllegalArgumentException;

    boolean i();

    boolean isClosed();

    boolean isOpen();

    void m();

    void n(em.c cVar, ByteBuffer byteBuffer, boolean z10);

    InetSocketAddress q();

    void send(String str);

    boolean t();

    org.java_websocket.drafts.a w();

    void x1(int i10);

    void y(Collection<org.java_websocket.framing.f> collection);
}
