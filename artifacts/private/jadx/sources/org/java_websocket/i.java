package org.java_websocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes14.dex */
public class i implements f {
    static final /* synthetic */ boolean H1 = false;
    public static final int Z = 80;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f337901p0 = 443;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f337902p1 = 16384;
    private final Object X;
    private Object Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.slf4j.c f337903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f337904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f337905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f337906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SelectionKey f337907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteChannel f337908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.java_websocket.server.e.a f337909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f337910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile em.d f337911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<org.java_websocket.drafts.a> f337912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.java_websocket.drafts.a f337913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private em.e f337914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f337915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private im.a f337916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f337917o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Integer f337918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Boolean f337919t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f337920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f337921w;

    public i(j jVar, List<org.java_websocket.drafts.a> list) {
        this(jVar, (org.java_websocket.drafts.a) null);
        this.f337914l = em.e.SERVER;
        if (list != null && !list.isEmpty()) {
            this.f337912j = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f337912j = arrayList;
        arrayList.add(new org.java_websocket.drafts.b());
    }

    private void K(im.f fVar) {
        this.f337903a.b0("open using draft: {}", this.f337913k);
        this.f337911i = em.d.OPEN;
        Q();
        try {
            this.f337906d.z(this, fVar);
        } catch (RuntimeException e10) {
            this.f337906d.o(this, e10);
        }
    }

    private void L(Collection<org.java_websocket.framing.f> collection) {
        if (!isOpen()) {
            throw new fm.i();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (org.java_websocket.framing.f fVar : collection) {
            this.f337903a.b0("send frame: {}", fVar);
            arrayList.add(this.f337913k.g(fVar));
        }
        S(arrayList);
    }

    private void R(ByteBuffer byteBuffer) {
        this.f337903a.k("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
        this.f337904b.add(byteBuffer);
        this.f337906d.h(this);
    }

    private void S(List<ByteBuffer> list) {
        synchronized (this.X) {
            try {
                Iterator<ByteBuffer> it = list.iterator();
                while (it.hasNext()) {
                    R(it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l(RuntimeException runtimeException) {
        R(x(500));
        v(-1, runtimeException.getMessage(), false);
    }

    private void o(fm.c cVar) {
        R(x(404));
        v(cVar.a(), cVar.getMessage(), false);
    }

    private void r(ByteBuffer byteBuffer) {
        try {
            for (org.java_websocket.framing.f fVar : this.f337913k.x(byteBuffer)) {
                this.f337903a.b0("matched frame: {}", fVar);
                this.f337913k.r(this, fVar);
            }
        } catch (fm.g e10) {
            if (e10.b() == Integer.MAX_VALUE) {
                this.f337903a.c("Closing due to invalid size of frame", e10);
                this.f337906d.o(this, e10);
            }
            d(e10);
        } catch (fm.c e11) {
            this.f337903a.c("Closing due to invalid data in frame", e11);
            this.f337906d.o(this, e11);
            d(e11);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e12) {
            this.f337903a.j("Got fatal error during frame processing");
            throw e12;
        } catch (Error e13) {
            this.f337903a.j("Closing web socket due to an error during frame processing");
            this.f337906d.o(this, new Exception(e13));
            close(1011, "Got error " + e13.getClass().getName());
        }
    }

    private boolean s(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.f337915m.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f337915m.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f337915m.capacity() + byteBuffer.remaining());
                this.f337915m.flip();
                byteBufferAllocate.put(this.f337915m);
                this.f337915m = byteBufferAllocate;
            }
            this.f337915m.put(byteBuffer);
            this.f337915m.flip();
            byteBuffer2 = this.f337915m;
        }
        byteBuffer2.mark();
        try {
            try {
                em.e eVar = this.f337914l;
                if (eVar != em.e.SERVER) {
                    if (eVar == em.e.CLIENT) {
                        this.f337913k.w(eVar);
                        im.f fVarY = this.f337913k.y(byteBuffer2);
                        if (!(fVarY instanceof im.h)) {
                            this.f337903a.J("Closing due to protocol error: wrong http function");
                            v(1002, "wrong http function", false);
                            return false;
                        }
                        im.h hVar = (im.h) fVarY;
                        if (this.f337913k.a(this.f337916n, hVar) == em.b.MATCHED) {
                            try {
                                this.f337906d.G(this, this.f337916n, hVar);
                                K(hVar);
                                return true;
                            } catch (fm.c e10) {
                                this.f337903a.q("Closing due to invalid data exception. Possible handshake rejection", e10);
                                v(e10.a(), e10.getMessage(), false);
                                return false;
                            } catch (RuntimeException e11) {
                                this.f337903a.c("Closing since client was never connected", e11);
                                this.f337906d.o(this, e11);
                                v(-1, e11.getMessage(), false);
                                return false;
                            }
                        }
                        this.f337903a.b0("Closing due to protocol error: draft {} refuses handshake", this.f337913k);
                        close(1002, "draft " + this.f337913k + " refuses handshake");
                    }
                    return false;
                }
                org.java_websocket.drafts.a aVar = this.f337913k;
                if (aVar != null) {
                    im.f fVarY2 = aVar.y(byteBuffer2);
                    if (!(fVarY2 instanceof im.a)) {
                        this.f337903a.J("Closing due to protocol error: wrong http function");
                        v(1002, "wrong http function", false);
                        return false;
                    }
                    im.a aVar2 = (im.a) fVarY2;
                    if (this.f337913k.b(aVar2) == em.b.MATCHED) {
                        K(aVar2);
                        return true;
                    }
                    this.f337903a.J("Closing due to protocol error: the handshake did finally not match");
                    close(1002, "the handshake did finally not match");
                    return false;
                }
                Iterator<org.java_websocket.drafts.a> it = this.f337912j.iterator();
                while (it.hasNext()) {
                    org.java_websocket.drafts.a aVarF = it.next().f();
                    try {
                        aVarF.w(this.f337914l);
                        byteBuffer2.reset();
                        im.f fVarY3 = aVarF.y(byteBuffer2);
                        if (!(fVarY3 instanceof im.a)) {
                            this.f337903a.J("Closing due to wrong handshake");
                            o(new fm.c(1002, "wrong http function"));
                            return false;
                        }
                        im.a aVar3 = (im.a) fVarY3;
                        if (aVarF.b(aVar3) == em.b.MATCHED) {
                            this.f337920v = aVar3.c();
                            try {
                                S(aVarF.j(aVarF.q(aVar3, this.f337906d.F(this, aVarF, aVar3))));
                                this.f337913k = aVarF;
                                K(aVar3);
                                return true;
                            } catch (fm.c e12) {
                                this.f337903a.q("Closing due to wrong handshake. Possible handshake rejection", e12);
                                o(e12);
                                return false;
                            } catch (RuntimeException e13) {
                                this.f337903a.c("Closing due to internal server error", e13);
                                this.f337906d.o(this, e13);
                                l(e13);
                                return false;
                            }
                        }
                    } catch (fm.f unused) {
                    }
                }
                if (this.f337913k == null) {
                    this.f337903a.J("Closing due to protocol error: no draft matches");
                    o(new fm.c(1002, "no draft matches"));
                }
                return false;
            } catch (fm.f e14) {
                this.f337903a.q("Closing due to invalid handshake", e14);
                d(e14);
            }
        } catch (fm.b e15) {
            if (this.f337915m.capacity() == 0) {
                byteBuffer2.reset();
                int iA = e15.a();
                if (iA == 0) {
                    iA = byteBuffer2.capacity() + 16;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iA);
                this.f337915m = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.f337915m;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.f337915m;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
    }

    private ByteBuffer x(int i10) {
        String str = i10 != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(org.java_websocket.util.c.a("HTTP/1.1 " + str + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    long A() {
        return this.f337921w;
    }

    @Override // org.java_websocket.f
    public void B(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        L(this.f337913k.i(byteBuffer, this.f337914l == em.e.CLIENT));
    }

    public SelectionKey C() {
        return this.f337907e;
    }

    @Override // org.java_websocket.f
    public InetSocketAddress D() {
        return this.f337906d.s(this);
    }

    @Override // org.java_websocket.f
    public em.d E() {
        return this.f337911i;
    }

    public j F() {
        return this.f337906d;
    }

    public org.java_websocket.server.e.a G() {
        return this.f337909g;
    }

    @Override // org.java_websocket.f
    public boolean H() {
        return !this.f337904b.isEmpty();
    }

    @Override // org.java_websocket.f
    public <T> T I() {
        return (T) this.Y;
    }

    @Override // org.java_websocket.f
    public void J(int i10, String str) {
        j(i10, str, false);
    }

    public void M(ByteChannel byteChannel) {
        this.f337908f = byteChannel;
    }

    public void N(SelectionKey selectionKey) {
        this.f337907e = selectionKey;
    }

    public void O(org.java_websocket.server.e.a aVar) {
        this.f337909g = aVar;
    }

    public void P(im.b bVar) throws fm.f {
        this.f337916n = this.f337913k.p(bVar);
        this.f337920v = bVar.c();
        try {
            this.f337906d.j(this, this.f337916n);
            S(this.f337913k.j(this.f337916n));
        } catch (fm.c unused) {
            throw new fm.f("Handshake data rejected by client.");
        } catch (RuntimeException e10) {
            this.f337903a.c("Exception in startHandshake", e10);
            this.f337906d.o(this, e10);
            throw new fm.f("rejected because of " + e10);
        }
    }

    public void Q() {
        this.f337921w = System.nanoTime();
    }

    public synchronized void a(int i10, String str, boolean z10) {
        try {
            em.d dVar = this.f337911i;
            em.d dVar2 = em.d.CLOSING;
            if (dVar == dVar2 || this.f337911i == em.d.CLOSED) {
                return;
            }
            if (this.f337911i == em.d.OPEN) {
                if (i10 == 1006) {
                    this.f337911i = dVar2;
                    v(i10, str, false);
                    return;
                }
                if (this.f337913k.n() != em.a.NONE) {
                    try {
                        if (!z10) {
                            try {
                                this.f337906d.k(this, i10, str);
                            } catch (RuntimeException e10) {
                                this.f337906d.o(this, e10);
                            }
                        }
                        if (isOpen()) {
                            org.java_websocket.framing.b bVar = new org.java_websocket.framing.b();
                            bVar.t(str);
                            bVar.s(i10);
                            bVar.j();
                            g(bVar);
                        }
                    } catch (fm.c e11) {
                        this.f337903a.c("generated frame is invalid", e11);
                        this.f337906d.o(this, e11);
                        v(1006, "generated frame is invalid", false);
                    }
                }
                v(i10, str, z10);
            } else if (i10 == -3) {
                v(-3, str, true);
            } else if (i10 == 1002) {
                v(i10, str, z10);
            } else {
                v(-1, str, false);
            }
            this.f337911i = em.d.CLOSING;
            this.f337915m = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.java_websocket.f
    public void b(byte[] bArr) {
        B(ByteBuffer.wrap(bArr));
    }

    @Override // org.java_websocket.f
    public String c() {
        return this.f337920v;
    }

    @Override // org.java_websocket.f
    public void close(int i10, String str) {
        a(i10, str, false);
    }

    public void d(fm.c cVar) {
        a(cVar.a(), cVar.getMessage(), false);
    }

    @Override // org.java_websocket.f
    public boolean e() {
        return this.f337910h;
    }

    @Override // org.java_websocket.f
    public <T> void f(T t10) {
        this.Y = t10;
    }

    @Override // org.java_websocket.f
    public void g(org.java_websocket.framing.f fVar) {
        L(Collections.singletonList(fVar));
    }

    @Override // org.java_websocket.f
    public km.a getProtocol() {
        org.java_websocket.drafts.a aVar = this.f337913k;
        if (aVar == null) {
            int i10 = 4 ^ 0;
            return null;
        }
        if (aVar instanceof org.java_websocket.drafts.b) {
            return ((org.java_websocket.drafts.b) aVar).Q();
        }
        throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
    }

    @Override // org.java_websocket.f
    public SSLSession getSSLSession() {
        if (i()) {
            return ((jm.a) this.f337908f).a().getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    public void h() {
        if (this.f337919t == null) {
            throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
        }
        j(this.f337918s.intValue(), this.f337917o, this.f337919t.booleanValue());
    }

    @Override // org.java_websocket.f
    public boolean i() {
        return this.f337908f instanceof jm.a;
    }

    @Override // org.java_websocket.f
    public boolean isClosed() {
        return this.f337911i == em.d.CLOSED;
    }

    @Override // org.java_websocket.f
    public boolean isOpen() {
        return this.f337911i == em.d.OPEN;
    }

    public synchronized void j(int i10, String str, boolean z10) {
        try {
            if (this.f337911i == em.d.CLOSED) {
                return;
            }
            if (this.f337911i == em.d.OPEN && i10 == 1006) {
                this.f337911i = em.d.CLOSING;
            }
            SelectionKey selectionKey = this.f337907e;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f337908f;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e10) {
                    if (e10.getMessage() == null || !e10.getMessage().equals("Broken pipe")) {
                        this.f337903a.c("Exception during channel.close()", e10);
                        this.f337906d.o(this, e10);
                    } else {
                        this.f337903a.q("Caught IOException: Broken pipe during closeConnection()", e10);
                    }
                }
            }
            try {
                this.f337906d.r(this, i10, str, z10);
            } catch (RuntimeException e11) {
                this.f337906d.o(this, e11);
            }
            org.java_websocket.drafts.a aVar = this.f337913k;
            if (aVar != null) {
                aVar.v();
            }
            this.f337916n = null;
            this.f337911i = em.d.CLOSED;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected void k(int i10, boolean z10) {
        j(i10, "", z10);
    }

    @Override // org.java_websocket.f
    public void m() throws NullPointerException {
        org.java_websocket.framing.h hVarV = this.f337906d.v(this);
        if (hVarV == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        g(hVarV);
    }

    @Override // org.java_websocket.f
    public void n(em.c cVar, ByteBuffer byteBuffer, boolean z10) {
        L(this.f337913k.e(cVar, byteBuffer, z10));
    }

    public void p(ByteBuffer byteBuffer) {
        this.f337903a.k("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        if (this.f337911i != em.d.NOT_YET_CONNECTED) {
            if (this.f337911i == em.d.OPEN) {
                r(byteBuffer);
            }
        } else if (s(byteBuffer) && !t() && !isClosed()) {
            if (byteBuffer.hasRemaining()) {
                r(byteBuffer);
            } else if (this.f337915m.hasRemaining()) {
                r(this.f337915m);
            }
        }
    }

    @Override // org.java_websocket.f
    public InetSocketAddress q() {
        return this.f337906d.C(this);
    }

    @Override // org.java_websocket.f, io.ably.lib.network.s
    public void send(String str) {
        boolean z10;
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        org.java_websocket.drafts.a aVar = this.f337913k;
        if (this.f337914l == em.e.CLIENT) {
            z10 = true;
            int i10 = 5 << 1;
        } else {
            z10 = false;
        }
        L(aVar.h(str, z10));
    }

    @Override // org.java_websocket.f
    public boolean t() {
        return this.f337911i == em.d.CLOSING;
    }

    public String toString() {
        return super.toString();
    }

    public void u() {
        if (this.f337911i == em.d.NOT_YET_CONNECTED) {
            int i10 = 4 ^ (-1);
            k(-1, true);
            return;
        }
        if (this.f337910h) {
            j(this.f337918s.intValue(), this.f337917o, this.f337919t.booleanValue());
            return;
        }
        if (this.f337913k.n() == em.a.NONE) {
            k(1000, true);
            return;
        }
        if (this.f337913k.n() != em.a.ONEWAY) {
            k(1006, true);
        } else if (this.f337914l == em.e.SERVER) {
            k(1006, true);
        } else {
            k(1000, true);
        }
    }

    public synchronized void v(int i10, String str, boolean z10) {
        if (this.f337910h) {
            return;
        }
        this.f337918s = Integer.valueOf(i10);
        this.f337917o = str;
        this.f337919t = Boolean.valueOf(z10);
        this.f337910h = true;
        this.f337906d.h(this);
        try {
            this.f337906d.d(this, i10, str, z10);
        } catch (RuntimeException e10) {
            this.f337903a.c("Exception in onWebsocketClosing", e10);
            this.f337906d.o(this, e10);
        }
        org.java_websocket.drafts.a aVar = this.f337913k;
        if (aVar != null) {
            aVar.v();
        }
        this.f337916n = null;
    }

    @Override // org.java_websocket.f
    public org.java_websocket.drafts.a w() {
        return this.f337913k;
    }

    @Override // org.java_websocket.f
    public void x1(int i10) {
        a(i10, "", false);
    }

    @Override // org.java_websocket.f
    public void y(Collection<org.java_websocket.framing.f> collection) {
        L(collection);
    }

    public ByteChannel z() {
        return this.f337908f;
    }

    @Override // org.java_websocket.f
    public void close() {
        x1(1000);
    }

    public i(j jVar, org.java_websocket.drafts.a aVar) {
        this.f337903a = org.slf4j.e.k(i.class);
        this.f337910h = false;
        this.f337911i = em.d.NOT_YET_CONNECTED;
        this.f337913k = null;
        this.f337915m = ByteBuffer.allocate(0);
        this.f337916n = null;
        this.f337917o = null;
        this.f337918s = null;
        this.f337919t = null;
        this.f337920v = null;
        this.f337921w = System.nanoTime();
        this.X = new Object();
        if (jVar != null && (aVar != null || this.f337914l != em.e.SERVER)) {
            this.f337904b = new LinkedBlockingQueue();
            this.f337905c = new LinkedBlockingQueue();
            this.f337906d = jVar;
            this.f337914l = em.e.CLIENT;
            if (aVar != null) {
                this.f337913k = aVar.f();
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }
}
