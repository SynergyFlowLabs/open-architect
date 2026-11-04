package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.impl.o0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final org.slf4j.c f265583h = org.slf4j.e.k(o.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f265584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f265585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f265586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ByteBuffer f265587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ByteBuffer f265588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    t f265589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    t f265590g;

    public o(v vVar, r rVar) {
        this.f265584a = vVar;
        this.f265585b = rVar.g();
        this.f265586c = rVar.k();
        i iVar = new i(rVar, null);
        this.f265587d = rVar.d().a(iVar);
        this.f265588e = rVar.d().d(iVar);
    }

    private void c() {
        ExecutorService executorService = this.f265585b;
        if (executorService == null) {
            o0.b(this.f265586c, new n(this.f265584a.f265609d, this), "rabbitmq-nio").start();
        } else {
            executorService.submit(new n(this.f265584a.f265609d, this));
        }
    }

    protected boolean a() {
        int size = this.f265589f.f265605b.size();
        if (size != 0) {
            return false;
        }
        this.f265584a.b();
        try {
            if (size != this.f265589f.f265605b.size()) {
                this.f265584a.c();
                return false;
            }
            try {
                this.f265589f.f265604a.close();
            } catch (IOException e10) {
                f265583h.w("Could not close read selector: {}", e10.getMessage());
            }
            try {
                this.f265590g.f265604a.close();
            } catch (IOException e11) {
                f265583h.w("Could not close write selector: {}", e11.getMessage());
            }
            this.f265589f = null;
            this.f265590g = null;
            this.f265584a.c();
            return true;
        } catch (Throwable th2) {
            this.f265584a.c();
            throw th2;
        }
    }

    void b() throws IOException {
        if (this.f265589f == null) {
            this.f265589f = new t(Selector.open());
            this.f265590g = new t(Selector.open());
            c();
        }
    }
}
