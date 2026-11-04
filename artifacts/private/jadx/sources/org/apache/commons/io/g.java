package org.apache.commons.io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ReferenceQueue<Object> f336547a = new ReferenceQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Collection<b> f336548b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<String> f336549c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f336550d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Thread f336551e;

    private final class a extends Thread {
        a() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                if (g.this.f336550d && g.this.f336548b.size() <= 0) {
                    return;
                }
                try {
                    b bVar = (b) g.this.f336547a.remove();
                    g.this.f336548b.remove(bVar);
                    if (!bVar.a()) {
                        g.this.f336549c.add(bVar.b());
                    }
                    bVar.clear();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    private static final class b extends PhantomReference<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f336553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f336554b;

        b(String str, h hVar, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f336553a = str;
            this.f336554b = hVar == null ? h.f336555b : hVar;
        }

        public boolean a() {
            return this.f336554b.b(new File(this.f336553a));
        }

        public String b() {
            return this.f336553a;
        }
    }

    private synchronized void a(String str, Object obj, h hVar) {
        try {
            if (this.f336550d) {
                throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
            }
            if (this.f336551e == null) {
                a aVar = new a();
                this.f336551e = aVar;
                aVar.start();
            }
            this.f336548b.add(new b(str, hVar, obj, this.f336547a));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        try {
            this.f336550d = true;
            Thread thread = this.f336551e;
            if (thread != null) {
                synchronized (thread) {
                    try {
                        this.f336551e.interrupt();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public List<String> c() {
        return this.f336549c;
    }

    public int d() {
        return this.f336548b.size();
    }

    public void e(File file, Object obj) {
        f(file, obj, null);
    }

    public void f(File file, Object obj, h hVar) {
        if (file == null) {
            throw new NullPointerException("The file must not be null");
        }
        a(file.getPath(), obj, hVar);
    }

    public void g(String str, Object obj) {
        h(str, obj, null);
    }

    public void h(String str, Object obj, h hVar) {
        if (str == null) {
            throw new NullPointerException("The path must not be null");
        }
        a(str, obj, hVar);
    }
}
