package org.java_websocket.server;

import fm.j;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.java_websocket.f;
import org.java_websocket.g;
import org.java_websocket.h;
import org.java_websocket.i;
import org.java_websocket.k;
import org.java_websocket.l;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e extends org.java_websocket.a implements Runnable {
    private static final int H1 = Runtime.getRuntime().availableProcessors();
    private BlockingQueue<ByteBuffer> X;
    private int Y;
    private final AtomicInteger Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final org.slf4j.c f337927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection<f> f337928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InetSocketAddress f337929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ServerSocketChannel f337930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Selector f337931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<org.java_websocket.drafts.a> f337932o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private k f337933p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f337934p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Thread f337935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f337936t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected List<a> f337937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<i> f337938w;

    public class a extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f337939c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BlockingQueue<i> f337940a = new LinkedBlockingQueue();

        /* JADX INFO: renamed from: org.java_websocket.server.e$a$a, reason: collision with other inner class name */
        class C2418a implements Thread.UncaughtExceptionHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f337942a;

            C2418a(e eVar) {
                this.f337942a = eVar;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                e.this.f337927j.C("Uncaught exception in thread {}: {}", thread.getName(), th2);
            }
        }

        public a() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new C2418a(e.this));
        }

        private void a(i iVar, ByteBuffer byteBuffer) throws InterruptedException {
            try {
                try {
                    iVar.p(byteBuffer);
                } catch (Exception e10) {
                    e.this.f337927j.c("Error while reading from remote connection", e10);
                }
            } finally {
                e.this.L0(byteBuffer);
            }
        }

        public void b(i iVar) throws InterruptedException {
            this.f337940a.put(iVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i iVarTake;
            Throwable th2;
            Throwable e10;
            while (true) {
                try {
                    try {
                        iVarTake = this.f337940a.take();
                        try {
                            a(iVarTake, iVarTake.f337905c.poll());
                        } catch (LinkageError | ThreadDeath | VirtualMachineError e11) {
                            e10 = e11;
                            e.this.f337927j.F("Got fatal error in worker thread {}", getName());
                            e.this.A0(iVarTake, new Exception(e10));
                            return;
                        } catch (Throwable th3) {
                            th2 = th3;
                            e.this.f337927j.C("Uncaught exception in thread {}: {}", getName(), th2);
                            if (iVarTake != null) {
                                e.this.o(iVarTake, new Exception(th2));
                                iVarTake.close();
                                return;
                            }
                            return;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } catch (LinkageError | ThreadDeath | VirtualMachineError e12) {
                    iVarTake = null;
                    e10 = e12;
                } catch (Throwable th4) {
                    iVarTake = null;
                    th2 = th4;
                }
            }
        }
    }

    public e() {
        this(new InetSocketAddress(80), H1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(f fVar, Exception exc) {
        String str;
        this.f337927j.c("Shutdown due to fatal error", exc);
        G0(fVar, exc);
        if (exc.getCause() != null) {
            str = " caused by " + exc.getCause().getClass().getName();
        } else {
            str = "";
        }
        try {
            U0(0, "Got error on server side: " + exc.getClass().getName() + str);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f337927j.c("Interrupt during stop", exc);
            G0(null, e10);
        }
        List<a> list = this.f337937v;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Thread thread = this.f337935s;
        if (thread != null) {
            thread.interrupt();
        }
    }

    private void B0(SelectionKey selectionKey, f fVar, IOException iOException) {
        SelectableChannel selectableChannelChannel;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (fVar != null) {
            fVar.J(1006, iOException.getMessage());
            return;
        }
        if (selectionKey != null && (selectableChannelChannel = selectionKey.channel()) != null && selectableChannelChannel.isOpen()) {
            try {
                selectableChannelChannel.close();
            } catch (IOException unused) {
            }
            this.f337927j.q("Connection closed because of exception", iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.X.size() > this.Z.intValue()) {
            return;
        }
        this.X.put(byteBuffer);
    }

    private ByteBuffer V0() throws InterruptedException {
        return this.X.take();
    }

    private void l0(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, IOException {
        if (!F0(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        SocketChannel socketChannelAccept = this.f337930m.accept();
        if (socketChannelAccept == null) {
            return;
        }
        socketChannelAccept.configureBlocking(false);
        Socket socket = socketChannelAccept.socket();
        socket.setTcpNoDelay(S());
        socket.setKeepAlive(true);
        i iVarA = this.f337933p0.a((g) this, this.f337932o);
        iVarA.N(socketChannelAccept.register(this.f337931n, 1, iVarA));
        try {
            iVarA.M(this.f337933p0.c(socketChannelAccept, iVarA.C()));
            it.remove();
            d0(iVarA);
        } catch (IOException e10) {
            if (iVarA.C() != null) {
                iVarA.C().cancel();
            }
            B0(iVarA.C(), null, e10);
        }
    }

    private void m0() throws InterruptedException, IOException {
        while (!this.f337938w.isEmpty()) {
            i iVarRemove = this.f337938w.remove(0);
            l lVar = (l) iVarRemove.z();
            ByteBuffer byteBufferV0 = V0();
            try {
                if (org.java_websocket.e.c(byteBufferV0, iVarRemove, lVar)) {
                    this.f337938w.add(iVarRemove);
                }
                if (byteBufferV0.hasRemaining()) {
                    iVarRemove.f337905c.put(byteBufferV0);
                    M0(iVarRemove);
                } else {
                    L0(byteBufferV0);
                }
            } catch (IOException e10) {
                L0(byteBufferV0);
                throw e10;
            }
        }
    }

    private void n0(Object obj, Collection<f> collection) {
        ArrayList<f> arrayList;
        String str = obj instanceof String ? (String) obj : null;
        ByteBuffer byteBuffer = obj instanceof ByteBuffer ? (ByteBuffer) obj : null;
        if (str == null && byteBuffer == null) {
            return;
        }
        HashMap map = new HashMap();
        synchronized (collection) {
            try {
                arrayList = new ArrayList(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (f fVar : arrayList) {
            if (fVar != null) {
                org.java_websocket.drafts.a aVarW = fVar.w();
                t0(aVarW, map, str, byteBuffer);
                try {
                    fVar.y(map.get(aVarW));
                } catch (fm.i unused) {
                }
            }
        }
    }

    private boolean o0() {
        synchronized (this) {
            try {
                if (this.f337935s == null) {
                    this.f337935s = Thread.currentThread();
                    return !this.f337936t.get();
                }
                throw new IllegalStateException(getClass().getName() + " can only be started once.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean p0(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, j {
        i iVar = (i) selectionKey.attachment();
        ByteBuffer byteBufferV0 = V0();
        if (iVar.z() == null) {
            selectionKey.cancel();
            B0(selectionKey, iVar, new IOException());
            return false;
        }
        try {
            if (org.java_websocket.e.b(byteBufferV0, iVar, iVar.z()) && byteBufferV0.hasRemaining()) {
                iVar.f337905c.put(byteBufferV0);
                M0(iVar);
                it.remove();
                if ((iVar.z() instanceof l) && ((l) iVar.z()).K4()) {
                    this.f337938w.add(iVar);
                }
            } else {
                L0(byteBufferV0);
            }
            return true;
        } catch (IOException e10) {
            L0(byteBufferV0);
            throw new j(iVar, e10);
        }
    }

    private void q0() {
        Y();
        List<a> list = this.f337937v;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Selector selector = this.f337931n;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e10) {
                this.f337927j.c("IOException during selector.close", e10);
                G0(null, e10);
            }
        }
        ServerSocketChannel serverSocketChannel = this.f337930m;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e11) {
                this.f337927j.c("IOException during server.close", e11);
                G0(null, e11);
            }
        }
    }

    private boolean r0() {
        this.f337935s.setName("WebSocketSelector-" + this.f337935s.getId());
        try {
            ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
            this.f337930m = serverSocketChannelOpen;
            serverSocketChannelOpen.configureBlocking(false);
            ServerSocket serverSocketSocket = this.f337930m.socket();
            serverSocketSocket.setReceiveBufferSize(16384);
            serverSocketSocket.setReuseAddress(R());
            serverSocketSocket.bind(this.f337929l, w0());
            Selector selectorOpen = Selector.open();
            this.f337931n = selectorOpen;
            ServerSocketChannel serverSocketChannel = this.f337930m;
            serverSocketChannel.register(selectorOpen, serverSocketChannel.validOps());
            X();
            Iterator<a> it = this.f337937v.iterator();
            while (it.hasNext()) {
                it.next().start();
            }
            K0();
            return true;
        } catch (IOException e10) {
            A0(null, e10);
            return false;
        }
    }

    private void s0(SelectionKey selectionKey) throws j {
        i iVar = (i) selectionKey.attachment();
        try {
            if (org.java_websocket.e.a(iVar, iVar.z()) && selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        } catch (IOException e10) {
            throw new j(iVar, e10);
        }
    }

    private void t0(org.java_websocket.drafts.a aVar, Map<org.java_websocket.drafts.a, List<org.java_websocket.framing.f>> map, String str, ByteBuffer byteBuffer) {
        if (map.containsKey(aVar)) {
            return;
        }
        List<org.java_websocket.framing.f> listH = str != null ? aVar.h(str, false) : null;
        if (byteBuffer != null) {
            listH = aVar.i(byteBuffer, false);
        }
        if (listH != null) {
            map.put(aVar, listH);
        }
    }

    private Socket y0(f fVar) {
        return ((SocketChannel) ((i) fVar).C().channel()).socket();
    }

    @Override // org.java_websocket.j
    public InetSocketAddress C(f fVar) {
        return (InetSocketAddress) y0(fVar).getRemoteSocketAddress();
    }

    public abstract void C0(f fVar, int i10, String str, boolean z10);

    public void D0(f fVar, int i10, String str) {
    }

    public void E0(f fVar, int i10, String str, boolean z10) {
    }

    protected boolean F0(SelectionKey selectionKey) {
        return true;
    }

    public abstract void G0(f fVar, Exception exc);

    public abstract void H0(f fVar, String str);

    public void I0(f fVar, ByteBuffer byteBuffer) {
    }

    public abstract void J0(f fVar, im.a aVar);

    public abstract void K0();

    protected void M0(i iVar) throws InterruptedException {
        if (iVar.G() == null) {
            List<a> list = this.f337937v;
            iVar.O(list.get(this.Y % list.size()));
            this.Y++;
        }
        iVar.G().b(iVar);
    }

    protected void N0(f fVar) throws InterruptedException {
    }

    protected boolean O0(f fVar) {
        boolean zRemove;
        synchronized (this.f337928k) {
            try {
                if (this.f337928k.contains(fVar)) {
                    zRemove = this.f337928k.remove(fVar);
                } else {
                    this.f337927j.b0("Removing connection which is not in the connections collection! Possible no handshake received! {}", fVar);
                    zRemove = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f337936t.get() && this.f337928k.isEmpty()) {
            this.f337935s.interrupt();
        }
        return zRemove;
    }

    public void P0(int i10) {
        this.f337934p1 = i10;
    }

    @Override // org.java_websocket.a
    public Collection<f> Q() {
        Collection<f> collectionUnmodifiableCollection;
        synchronized (this.f337928k) {
            try {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(this.f337928k));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return collectionUnmodifiableCollection;
    }

    public final void Q0(k kVar) {
        k kVar2 = this.f337933p0;
        if (kVar2 != null) {
            kVar2.close();
        }
        this.f337933p0 = kVar;
    }

    public void R0() {
        if (this.f337935s == null) {
            new Thread(this).start();
            return;
        }
        throw new IllegalStateException(getClass().getName() + " can only be started once.");
    }

    public void S0() throws InterruptedException {
        T0(0);
    }

    public void T0(int i10) throws InterruptedException {
        U0(i10, "");
    }

    public void U0(int i10, String str) throws InterruptedException {
        ArrayList arrayList;
        Selector selector;
        if (this.f337936t.compareAndSet(false, true)) {
            synchronized (this.f337928k) {
                arrayList = new ArrayList(this.f337928k);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).close(1001, str);
            }
            this.f337933p0.close();
            synchronized (this) {
                try {
                    if (this.f337935s != null && (selector = this.f337931n) != null) {
                        selector.wakeup();
                        this.f337935s.join(i10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected boolean c0(f fVar) {
        boolean zAdd;
        if (this.f337936t.get()) {
            fVar.x1(1001);
            return true;
        }
        synchronized (this.f337928k) {
            zAdd = this.f337928k.add(fVar);
        }
        return zAdd;
    }

    @Override // org.java_websocket.j
    public void d(f fVar, int i10, String str, boolean z10) {
        E0(fVar, i10, str, z10);
    }

    protected void d0(f fVar) throws InterruptedException {
        if (this.Z.get() >= (this.f337937v.size() * 2) + 1) {
            return;
        }
        this.Z.incrementAndGet();
        this.X.put(k0());
    }

    public void e0(String str) {
        f0(str, this.f337928k);
    }

    public void f0(String str, Collection<f> collection) {
        if (str == null || collection == null) {
            throw new IllegalArgumentException();
        }
        n0(str, collection);
    }

    public void g0(ByteBuffer byteBuffer) {
        h0(byteBuffer, this.f337928k);
    }

    @Override // org.java_websocket.j
    public final void h(f fVar) {
        i iVar = (i) fVar;
        try {
            iVar.C().interestOps(5);
        } catch (CancelledKeyException unused) {
            iVar.f337904b.clear();
        }
        this.f337931n.wakeup();
    }

    public void h0(ByteBuffer byteBuffer, Collection<f> collection) {
        if (byteBuffer == null || collection == null) {
            throw new IllegalArgumentException();
        }
        n0(byteBuffer, collection);
    }

    public void i0(byte[] bArr) {
        j0(bArr, this.f337928k);
    }

    public void j0(byte[] bArr, Collection<f> collection) {
        if (bArr == null || collection == null) {
            throw new IllegalArgumentException();
        }
        h0(ByteBuffer.wrap(bArr), collection);
    }

    @Override // org.java_websocket.j
    public void k(f fVar, int i10, String str) {
        D0(fVar, i10, str);
    }

    public ByteBuffer k0() {
        return ByteBuffer.allocate(16384);
    }

    @Override // org.java_websocket.j
    public final void o(f fVar, Exception exc) {
        G0(fVar, exc);
    }

    @Override // org.java_websocket.j
    public final void p(f fVar, String str) {
        H0(fVar, str);
    }

    @Override // org.java_websocket.j
    public final void r(f fVar, int i10, String str, boolean z10) {
        this.f337931n.wakeup();
        try {
            if (O0(fVar)) {
                C0(fVar, i10, str, z10);
            }
        } finally {
            try {
                N0(fVar);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        SelectionKey selectionKey;
        if (o0() && r0()) {
            int i10 = 0;
            int i11 = 5;
            while (!this.f337935s.isInterrupted() && i11 != 0) {
                try {
                    try {
                        try {
                            try {
                                if (this.f337936t.get()) {
                                    i10 = 5;
                                }
                                if (this.f337931n.select(i10) == 0 && this.f337936t.get()) {
                                    i11--;
                                }
                                Iterator<SelectionKey> it = this.f337931n.selectedKeys().iterator();
                                selectionKey = null;
                                while (it.hasNext()) {
                                    try {
                                        SelectionKey next = it.next();
                                        try {
                                            if (next.isValid()) {
                                                if (next.isAcceptable()) {
                                                    l0(next, it);
                                                } else if ((!next.isReadable() || p0(next, it)) && next.isWritable()) {
                                                    s0(next);
                                                }
                                            }
                                            selectionKey = next;
                                        } catch (j e10) {
                                            e = e10;
                                            selectionKey = next;
                                            B0(selectionKey, e.a(), e.b());
                                        } catch (IOException e11) {
                                            e = e11;
                                            selectionKey = next;
                                            B0(selectionKey, null, e);
                                        }
                                    } catch (j e12) {
                                        e = e12;
                                    } catch (IOException e13) {
                                        e = e13;
                                    }
                                }
                                m0();
                            } catch (j e14) {
                                e = e14;
                                selectionKey = null;
                            } catch (IOException e15) {
                                e = e15;
                                selectionKey = null;
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        } catch (CancelledKeyException unused2) {
                        } catch (ClosedByInterruptException unused3) {
                            q0();
                            return;
                        }
                    } catch (RuntimeException e16) {
                        A0(null, e16);
                    }
                } catch (Throwable th2) {
                    q0();
                    throw th2;
                }
            }
            q0();
        }
    }

    @Override // org.java_websocket.j
    public InetSocketAddress s(f fVar) {
        return (InetSocketAddress) y0(fVar).getLocalSocketAddress();
    }

    @Override // org.java_websocket.j
    public final void u(f fVar, ByteBuffer byteBuffer) {
        I0(fVar, byteBuffer);
    }

    public InetSocketAddress u0() {
        return this.f337929l;
    }

    public List<org.java_websocket.drafts.a> v0() {
        return Collections.unmodifiableList(this.f337932o);
    }

    public int w0() {
        return this.f337934p1;
    }

    public int x0() {
        ServerSocketChannel serverSocketChannel;
        int port = u0().getPort();
        return (port != 0 || (serverSocketChannel = this.f337930m) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    @Override // org.java_websocket.j
    public final void z(f fVar, im.f fVar2) {
        if (c0(fVar)) {
            J0(fVar, (im.a) fVar2);
        }
    }

    public final h z0() {
        return this.f337933p0;
    }

    public e(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, H1, null);
    }

    public e(InetSocketAddress inetSocketAddress, int i10) {
        this(inetSocketAddress, i10, null);
    }

    public e(InetSocketAddress inetSocketAddress, List<org.java_websocket.drafts.a> list) {
        this(inetSocketAddress, H1, list);
    }

    public e(InetSocketAddress inetSocketAddress, int i10, List<org.java_websocket.drafts.a> list) {
        this(inetSocketAddress, i10, list, new HashSet());
    }

    public e(InetSocketAddress inetSocketAddress, int i10, List<org.java_websocket.drafts.a> list, Collection<f> collection) {
        this.f337927j = org.slf4j.e.k(e.class);
        this.f337936t = new AtomicBoolean(false);
        this.Y = 0;
        this.Z = new AtomicInteger(0);
        this.f337933p0 = new c();
        this.f337934p1 = -1;
        if (inetSocketAddress != null && i10 >= 1 && collection != null) {
            if (list == null) {
                this.f337932o = Collections.EMPTY_LIST;
            } else {
                this.f337932o = list;
            }
            this.f337929l = inetSocketAddress;
            this.f337928k = collection;
            W(false);
            V(false);
            this.f337938w = new LinkedList();
            this.f337937v = new ArrayList(i10);
            this.X = new LinkedBlockingQueue();
            for (int i11 = 0; i11 < i10; i11++) {
                this.f337937v.add(new a());
            }
            return;
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }
}
