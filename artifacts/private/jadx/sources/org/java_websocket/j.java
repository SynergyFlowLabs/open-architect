package org.java_websocket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public interface j {
    void A(f fVar, org.java_websocket.framing.f fVar2);

    InetSocketAddress C(f fVar);

    im.i F(f fVar, org.java_websocket.drafts.a aVar, im.a aVar2) throws fm.c;

    void G(f fVar, im.a aVar, im.h hVar) throws fm.c;

    void d(f fVar, int i10, String str, boolean z10);

    void h(f fVar);

    void j(f fVar, im.a aVar) throws fm.c;

    void k(f fVar, int i10, String str);

    void o(f fVar, Exception exc);

    void p(f fVar, String str);

    void r(f fVar, int i10, String str, boolean z10);

    InetSocketAddress s(f fVar);

    void u(f fVar, ByteBuffer byteBuffer);

    org.java_websocket.framing.h v(f fVar);

    void x(f fVar, org.java_websocket.framing.f fVar2);

    void z(f fVar, im.f fVar2);
}
