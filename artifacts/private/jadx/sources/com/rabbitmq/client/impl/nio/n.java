package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.impl.o0;
import com.rabbitmq.client.impl.s0;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final org.slf4j.c f265579d = org.slf4j.e.k(n.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f265580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f265581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f265582c;

    public n(r rVar, o oVar) {
        this.f265581b = rVar;
        this.f265580a = oVar;
        this.f265582c = rVar.e();
    }

    private ExecutorService g() {
        return this.f265581b.g();
    }

    private ThreadFactory k() {
        return this.f265581b.k();
    }

    protected void d(final w wVar, final Throwable th2) {
        f(new Runnable() { // from class: com.rabbitmq.client.impl.nio.k
            @Override // java.lang.Runnable
            public final void run() {
                wVar.e().b1(th2);
            }
        }, wVar.e().toString());
    }

    protected void e(final w wVar) {
        f(new Runnable() { // from class: com.rabbitmq.client.impl.nio.m
            @Override // java.lang.Runnable
            public final void run() {
                wVar.e().w0();
            }
        }, wVar.e().toString());
    }

    protected void f(Runnable runnable, String str) {
        ExecutorService executorService = this.f265582c;
        if (executorService != null) {
            executorService.execute(runnable);
            return;
        }
        if (g() != null) {
            g().execute(runnable);
            return;
        }
        o0.b(k(), runnable, "rabbitmq-connection-shutdown-" + str).start();
    }

    protected void h(final w wVar) {
        if (j(wVar)) {
            f(new Runnable() { // from class: com.rabbitmq.client.impl.nio.l
                @Override // java.lang.Runnable
                public final void run() {
                    wVar.e().U0();
                }
            }, wVar.e().toString());
        } else {
            try {
                wVar.a();
            } catch (IOException unused) {
            }
        }
    }

    protected void i(w wVar, Throwable th2) {
        if (j(wVar)) {
            d(wVar, th2);
        } else {
            try {
                wVar.a();
            } catch (IOException unused) {
            }
        }
    }

    protected boolean j(w wVar) {
        return wVar.e().isOpen();
    }

    @Override // java.lang.Runnable
    public void run() {
        int iSelectNow;
        b0 b0VarPoll;
        o oVar = this.f265580a;
        t tVar = oVar.f265589f;
        Selector selector = tVar.f265604a;
        Set<x> set = tVar.f265605b;
        ByteBuffer byteBuffer = oVar.f265587d;
        t tVar2 = oVar.f265590g;
        Selector selector2 = tVar2.f265604a;
        Set<x> set2 = tVar2.f265605b;
        boolean z10 = false;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                for (SelectionKey selectionKey : selector.keys()) {
                    w wVar = (w) selectionKey.attachment();
                    if (wVar.e() != null && wVar.e().m0() > 0 && System.currentTimeMillis() - wVar.f() > wVar.e().m0() * 2000) {
                        try {
                            try {
                                h(wVar);
                            } catch (Throwable th2) {
                                selectionKey.cancel();
                                throw th2;
                            }
                        } catch (Exception unused) {
                            f265579d.w("Error after heartbeat failure of connection {}", wVar.e());
                        }
                        selectionKey.cancel();
                    }
                }
                if (!z10 && set.isEmpty() && set2.isEmpty()) {
                    iSelectNow = selector.select(1000L);
                    if (selector.keys().size() == 0 && this.f265580a.a()) {
                        return;
                    }
                } else {
                    iSelectNow = selector.selectNow();
                }
                Iterator<x> it = set.iterator();
                while (it.hasNext()) {
                    x next = it.next();
                    it.remove();
                    int i10 = next.f265631b;
                    try {
                        if (next.f265630a.d().isOpen()) {
                            next.f265630a.d().register(selector, i10, next.f265630a);
                        }
                    } catch (Exception e10) {
                        f265579d.v("Error while registering socket channel for read: {}", e10.getMessage());
                    }
                }
                if (iSelectNow > 0) {
                    Iterator<SelectionKey> it2 = selector.selectedKeys().iterator();
                    while (it2.hasNext()) {
                        SelectionKey next2 = it2.next();
                        it2.remove();
                        if (next2.isValid() && next2.isReadable()) {
                            w wVar2 = (w) next2.attachment();
                            try {
                                try {
                                    if (!wVar2.d().isOpen()) {
                                        next2.cancel();
                                    } else if (wVar2.e() != null) {
                                        wVar2.h();
                                        while (wVar2.b()) {
                                            s0 s0VarB = wVar2.f265629n.b();
                                            if (s0VarB != null) {
                                                try {
                                                    if (!wVar2.e().d1(s0VarB) || (wVar2.e().o1() && !wVar2.e().g1())) {
                                                    }
                                                    e(wVar2);
                                                    next2.cancel();
                                                    break;
                                                } catch (Throwable th3) {
                                                    i(wVar2, th3);
                                                    next2.cancel();
                                                }
                                            }
                                        }
                                        wVar2.m(System.currentTimeMillis());
                                    }
                                } catch (Exception e11) {
                                    f265579d.p("Error during reading frames", e11);
                                    i(wVar2, e11);
                                    next2.cancel();
                                }
                                byteBuffer.clear();
                            } catch (Throwable th4) {
                                byteBuffer.clear();
                                throw th4;
                            }
                        }
                    }
                }
                int iSelectNow2 = selector2.selectNow();
                Iterator<x> it3 = set2.iterator();
                boolean z11 = false;
                while (it3.hasNext()) {
                    x next3 = it3.next();
                    it3.remove();
                    int i11 = next3.f265631b;
                    try {
                        if (next3.f265630a.d().isOpen()) {
                            next3.f265630a.d().register(selector2, i11, next3.f265630a);
                            z11 = true;
                        }
                    } catch (Exception e12) {
                        f265579d.v("Error while registering socket channel for write: {}", e12.getMessage());
                    }
                }
                if (iSelectNow2 > 0) {
                    Iterator<SelectionKey> it4 = selector2.selectedKeys().iterator();
                    while (it4.hasNext()) {
                        SelectionKey next4 = it4.next();
                        it4.remove();
                        w wVar3 = (w) next4.attachment();
                        if (next4.isValid() && next4.isWritable()) {
                            try {
                                try {
                                    if (wVar3.d().isOpen()) {
                                        wVar3.i();
                                        int size = wVar3.g().size();
                                        DataOutputStream dataOutputStream = wVar3.f265628m;
                                        for (int i12 = 0; i12 <= size && (b0VarPoll = wVar3.g().poll()) != null; i12++) {
                                            b0VarPoll.a(dataOutputStream);
                                        }
                                        dataOutputStream.flush();
                                        wVar3.g().isEmpty();
                                    } else {
                                        next4.cancel();
                                    }
                                } catch (Exception e13) {
                                    i(wVar3, e13);
                                }
                                wVar3.c();
                                next4.cancel();
                            } catch (Throwable th5) {
                                wVar3.c();
                                next4.cancel();
                                throw th5;
                            }
                        }
                    }
                }
                z10 = z11;
            } catch (Exception e14) {
                f265579d.c("Error in NIO loop", e14);
                return;
            }
        }
    }
}
