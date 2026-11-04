package org.java_websocket.client;

import em.c;
import im.d;
import im.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.java_websocket.f;
import org.java_websocket.i;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b extends org.java_websocket.a implements Runnable, f {
    private CountDownLatch X;
    private CountDownLatch Y;
    private int Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected URI f337820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f337821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Socket f337822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SocketFactory f337823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private OutputStream f337824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Proxy f337825o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private org.java_websocket.client.a f337826p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Thread f337827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Thread f337828t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private org.java_websocket.drafts.a f337829v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f337830w;

    class a implements org.java_websocket.client.a {
        a() {
        }

        @Override // org.java_websocket.client.a
        public InetAddress a(URI uri) throws UnknownHostException {
            return InetAddress.getByName(uri.getHost());
        }
    }

    /* JADX INFO: renamed from: org.java_websocket.client.b$b, reason: collision with other inner class name */
    private class RunnableC2417b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f337832a;

        RunnableC2417b(b bVar) {
            this.f337832a = bVar;
        }

        private void a() {
            try {
                if (b.this.f337822l != null) {
                    b.this.f337822l.close();
                }
            } catch (IOException e10) {
                b.this.o(this.f337832a, e10);
            }
        }

        private void b() throws IOException {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBufferTake = b.this.f337821k.f337904b.take();
                    b.this.f337824n.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                    b.this.f337824n.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : b.this.f337821k.f337904b) {
                        b.this.f337824n.write(byteBuffer.array(), 0, byteBuffer.limit());
                        b.this.f337824n.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3, types: [org.java_websocket.client.b] */
        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    b();
                } catch (IOException e10) {
                    b.this.n0(e10);
                }
                a();
                this = b.this;
                ((b) this).f337827s = null;
            } catch (Throwable th2) {
                this.a();
                b.this.f337827s = null;
                throw th2;
            }
        }
    }

    public b(URI uri) {
        this(uri, new org.java_websocket.drafts.b());
    }

    private void A0() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread == this.f337827s || threadCurrentThread == this.f337828t) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        }
        try {
            g0();
            Thread thread = this.f337827s;
            if (thread != null) {
                thread.interrupt();
                this.f337827s = null;
            }
            Thread thread2 = this.f337828t;
            if (thread2 != null) {
                thread2.interrupt();
                this.f337828t = null;
            }
            this.f337829v.v();
            Socket socket = this.f337822l;
            if (socket != null) {
                socket.close();
                this.f337822l = null;
            }
            this.X = new CountDownLatch(1);
            this.Y = new CountDownLatch(1);
            this.f337821k = new i(this, this.f337829v);
        } catch (Exception e10) {
            r0(e10);
            this.f337821k.J(1006, e10.getMessage());
        }
    }

    private void B0() throws fm.f {
        String rawPath = this.f337820j.getRawPath();
        String rawQuery = this.f337820j.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int iK0 = k0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f337820j.getHost());
        sb2.append((iK0 == 80 || iK0 == 443) ? "" : ":" + iK0);
        String string = sb2.toString();
        d dVar = new d();
        dVar.d(rawPath);
        dVar.a(com.google.common.net.d.f119547w, string);
        Map<String, String> map = this.f337830w;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dVar.a(entry.getKey(), entry.getValue());
            }
        }
        this.f337821k.P(dVar);
    }

    private void G0() throws NoSuchAlgorithmException, IOException, KeyManagementException {
        SSLSocketFactory socketFactory;
        SocketFactory socketFactory2 = this.f337823m;
        if (socketFactory2 instanceof SSLSocketFactory) {
            socketFactory = (SSLSocketFactory) socketFactory2;
        } else {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        }
        this.f337822l = socketFactory.createSocket(this.f337822l, this.f337820j.getHost(), k0(), true);
    }

    private int k0() {
        int port = this.f337820j.getPort();
        String scheme = this.f337820j.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
        } else {
            if (!"ws".equals(scheme)) {
                throw new IllegalArgumentException("unknown scheme: " + scheme);
            }
            if (port == -1) {
                return 80;
            }
        }
        return port;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(IOException iOException) {
        if (iOException instanceof SSLException) {
            r0(iOException);
        }
        this.f337821k.u();
    }

    private boolean w0() throws IOException {
        if (this.f337825o != Proxy.NO_PROXY) {
            this.f337822l = new Socket(this.f337825o);
            return true;
        }
        SocketFactory socketFactory = this.f337823m;
        if (socketFactory != null) {
            this.f337822l = socketFactory.createSocket();
            return false;
        }
        Socket socket = this.f337822l;
        if (socket == null) {
            this.f337822l = new Socket(this.f337825o);
            return true;
        }
        if (socket.isClosed()) {
            throw new IOException();
        }
        return false;
    }

    @Override // org.java_websocket.f
    public void B(ByteBuffer byteBuffer) {
        this.f337821k.B(byteBuffer);
    }

    @Override // org.java_websocket.j
    public InetSocketAddress C(f fVar) {
        Socket socket = this.f337822l;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    public void C0(org.java_websocket.client.a aVar) {
        this.f337826p0 = aVar;
    }

    @Override // org.java_websocket.f
    public InetSocketAddress D() {
        return this.f337821k.D();
    }

    public void D0(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.f337825o = proxy;
    }

    @Override // org.java_websocket.f
    public em.d E() {
        return this.f337821k.E();
    }

    @Deprecated
    public void E0(Socket socket) {
        if (this.f337822l != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.f337822l = socket;
    }

    public void F0(SocketFactory socketFactory) {
        this.f337823m = socketFactory;
    }

    @Override // org.java_websocket.f
    public boolean H() {
        return this.f337821k.H();
    }

    @Override // org.java_websocket.f
    public <T> T I() {
        return (T) this.f337821k.I();
    }

    @Override // org.java_websocket.f
    public void J(int i10, String str) {
        this.f337821k.J(i10, str);
    }

    @Override // org.java_websocket.a
    protected Collection<f> Q() {
        return Collections.singletonList(this.f337821k);
    }

    public void a() {
        if (this.f337828t != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.f337828t = thread;
        thread.setName("WebSocketConnectReadThread-" + this.f337828t.getId());
        this.f337828t.start();
    }

    @Override // org.java_websocket.f
    public void b(byte[] bArr) {
        this.f337821k.b(bArr);
    }

    @Override // org.java_websocket.f
    public String c() {
        return this.f337820j.getPath();
    }

    @Override // org.java_websocket.f
    public void close() {
        if (this.f337827s != null) {
            this.f337821k.x1(1000);
        }
    }

    @Override // org.java_websocket.j
    public void d(f fVar, int i10, String str, boolean z10) {
        q0(i10, str, z10);
    }

    @Override // org.java_websocket.f
    public boolean e() {
        return this.f337821k.e();
    }

    public void e0(String str, String str2) {
        if (this.f337830w == null) {
            this.f337830w = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.f337830w.put(str, str2);
    }

    @Override // org.java_websocket.f
    public <T> void f(T t10) {
        this.f337821k.f(t10);
    }

    public void f0() {
        this.f337830w = null;
    }

    @Override // org.java_websocket.f
    public void g(org.java_websocket.framing.f fVar) {
        this.f337821k.g(fVar);
    }

    public void g0() throws InterruptedException {
        close();
        this.Y.await();
    }

    @Override // org.java_websocket.f
    public km.a getProtocol() {
        return this.f337821k.getProtocol();
    }

    @Override // org.java_websocket.f
    public SSLSession getSSLSession() {
        if (i()) {
            return ((SSLSocket) this.f337822l).getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override // org.java_websocket.j
    public final void h(f fVar) {
    }

    public boolean h0() throws InterruptedException {
        a();
        this.X.await();
        return this.f337821k.isOpen();
    }

    @Override // org.java_websocket.f
    public boolean i() {
        return this.f337822l instanceof SSLSocket;
    }

    public boolean i0(long j10, TimeUnit timeUnit) throws InterruptedException {
        a();
        return this.X.await(j10, timeUnit) && this.f337821k.isOpen();
    }

    @Override // org.java_websocket.f
    public boolean isClosed() {
        return this.f337821k.isClosed();
    }

    @Override // org.java_websocket.f
    public boolean isOpen() {
        return this.f337821k.isOpen();
    }

    public f j0() {
        return this.f337821k;
    }

    @Override // org.java_websocket.j
    public void k(f fVar, int i10, String str) {
        p0(i10, str);
    }

    public Socket l0() {
        return this.f337822l;
    }

    @Override // org.java_websocket.f
    public void m() {
        this.f337821k.m();
    }

    public URI m0() {
        return this.f337820j;
    }

    @Override // org.java_websocket.f
    public void n(c cVar, ByteBuffer byteBuffer, boolean z10) {
        this.f337821k.n(cVar, byteBuffer, z10);
    }

    @Override // org.java_websocket.j
    public final void o(f fVar, Exception exc) {
        r0(exc);
    }

    public abstract void o0(int i10, String str, boolean z10);

    @Override // org.java_websocket.j
    public final void p(f fVar, String str) {
        s0(str);
    }

    public void p0(int i10, String str) {
    }

    @Override // org.java_websocket.f
    public InetSocketAddress q() {
        return this.f337821k.q();
    }

    public void q0(int i10, String str, boolean z10) {
    }

    @Override // org.java_websocket.j
    public final void r(f fVar, int i10, String str, boolean z10) {
        Y();
        Thread thread = this.f337827s;
        if (thread != null) {
            thread.interrupt();
        }
        o0(i10, str, z10);
        this.X.countDown();
        this.Y.countDown();
    }

    public abstract void r0(Exception exc);

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            boolean zW0 = w0();
            this.f337822l.setTcpNoDelay(S());
            this.f337822l.setReuseAddress(R());
            if (!this.f337822l.isConnected()) {
                this.f337822l.connect(this.f337826p0 == null ? InetSocketAddress.createUnresolved(this.f337820j.getHost(), k0()) : new InetSocketAddress(this.f337826p0.a(this.f337820j), k0()), this.Z);
            }
            if (zW0 && "wss".equals(this.f337820j.getScheme())) {
                G0();
            }
            Socket socket = this.f337822l;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                v0(sSLParameters);
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.f337822l.getInputStream();
            this.f337824n = this.f337822l.getOutputStream();
            B0();
            Thread thread = new Thread(new RunnableC2417b(this));
            this.f337827s = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!t() && !isClosed() && (i10 = inputStream.read(bArr)) != -1) {
                try {
                    this.f337821k.p(ByteBuffer.wrap(bArr, 0, i10));
                } catch (IOException e10) {
                    n0(e10);
                } catch (RuntimeException e11) {
                    r0(e11);
                    this.f337821k.J(1006, e11.getMessage());
                }
            }
            this.f337821k.u();
            this.f337828t = null;
        } catch (Exception e12) {
            o(this.f337821k, e12);
            this.f337821k.J(-1, e12.getMessage());
        } catch (InternalError e13) {
            if (!(e13.getCause() instanceof InvocationTargetException) || !(e13.getCause().getCause() instanceof IOException)) {
                throw e13;
            }
            IOException iOException = (IOException) e13.getCause().getCause();
            o(this.f337821k, iOException);
            this.f337821k.J(-1, iOException.getMessage());
        }
    }

    @Override // org.java_websocket.j
    public InetSocketAddress s(f fVar) {
        Socket socket = this.f337822l;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    public abstract void s0(String str);

    public void send(String str) {
        this.f337821k.send(str);
    }

    @Override // org.java_websocket.f
    public boolean t() {
        return this.f337821k.t();
    }

    public void t0(ByteBuffer byteBuffer) {
    }

    @Override // org.java_websocket.j
    public final void u(f fVar, ByteBuffer byteBuffer) {
        t0(byteBuffer);
    }

    public abstract void u0(h hVar);

    protected void v0(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    @Override // org.java_websocket.f
    public org.java_websocket.drafts.a w() {
        return this.f337829v;
    }

    public void x0() {
        A0();
        a();
    }

    @Override // org.java_websocket.f
    public void x1(int i10) {
        this.f337821k.x1(i10);
    }

    @Override // org.java_websocket.f
    public void y(Collection<org.java_websocket.framing.f> collection) {
        this.f337821k.y(collection);
    }

    public boolean y0() throws InterruptedException {
        A0();
        return h0();
    }

    @Override // org.java_websocket.j
    public final void z(f fVar, im.f fVar2) {
        X();
        u0((h) fVar2);
        this.X.countDown();
    }

    public String z0(String str) {
        Map<String, String> map = this.f337830w;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    public b(URI uri, org.java_websocket.drafts.a aVar) {
        this(uri, aVar, null, 0);
    }

    public b(URI uri, Map<String, String> map) {
        this(uri, new org.java_websocket.drafts.b(), map);
    }

    @Override // org.java_websocket.f
    public void close(int i10, String str) {
        this.f337821k.close(i10, str);
    }

    public b(URI uri, org.java_websocket.drafts.a aVar, Map<String, String> map) {
        this(uri, aVar, map, 0);
    }

    public b(URI uri, org.java_websocket.drafts.a aVar, Map<String, String> map, int i10) {
        this.f337820j = null;
        this.f337821k = null;
        this.f337822l = null;
        this.f337823m = null;
        this.f337825o = Proxy.NO_PROXY;
        this.X = new CountDownLatch(1);
        this.Y = new CountDownLatch(1);
        this.Z = 0;
        this.f337826p0 = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (aVar != null) {
            this.f337820j = uri;
            this.f337829v = aVar;
            this.f337826p0 = new a();
            if (map != null) {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                this.f337830w = treeMap;
                treeMap.putAll(map);
            }
            this.Z = i10;
            W(false);
            V(false);
            this.f337821k = new i(this, aVar);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }
}
