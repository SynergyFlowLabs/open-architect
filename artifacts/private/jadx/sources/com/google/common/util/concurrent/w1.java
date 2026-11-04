package com.google.common.util.concurrent;

import com.google.common.collect.e9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
final class w1<L> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s1 f120340b = new s1(w1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b<L>> f120341a = Collections.synchronizedList(new ArrayList());

    interface a<L> {
        void call(L listener);
    }

    private static final class b<L> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final L f120342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f120343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.a("this")
        final Queue<a<L>> f120344c = e9.d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a8.a("this")
        final Queue<Object> f120345d = e9.d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @a8.a("this")
        boolean f120346e;

        b(L l10, Executor executor) {
            this.f120342a = (L) com.google.common.base.j0.E(l10);
            this.f120343b = (Executor) com.google.common.base.j0.E(executor);
        }

        synchronized void a(a<L> event, Object label) {
            this.f120344c.add(event);
            this.f120345d.add(label);
        }

        void b() throws Exception {
            boolean z10;
            synchronized (this) {
                try {
                    if (this.f120346e) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.f120346e = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                try {
                    this.f120343b.execute(this);
                } catch (Exception e10) {
                    synchronized (this) {
                        try {
                            this.f120346e = false;
                            w1.f120340b.a().log(Level.SEVERE, "Exception while running callbacks for " + this.f120342a + " on " + this.f120343b, (Throwable) e10);
                            throw e10;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x006d */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        
            r2.call(r10.f120342a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        
            com.google.common.util.concurrent.w1.f120340b.a().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r10.f120342a + " " + r3, (java.lang.Throwable) r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r10 = this;
            L0:
                r0 = 0
                r9 = r0
                r1 = 1
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L34
                boolean r2 = r10.f120346e     // Catch: java.lang.Throwable -> L25
                r9 = 6
                com.google.common.base.j0.g0(r2)     // Catch: java.lang.Throwable -> L25
                r9 = 3
                java.util.Queue<com.google.common.util.concurrent.w1$a<L>> r2 = r10.f120344c     // Catch: java.lang.Throwable -> L25
                r9 = 5
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L25
                r9 = 4
                com.google.common.util.concurrent.w1$a r2 = (com.google.common.util.concurrent.w1.a) r2     // Catch: java.lang.Throwable -> L25
                java.util.Queue<java.lang.Object> r3 = r10.f120345d     // Catch: java.lang.Throwable -> L25
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L25
                if (r2 != 0) goto L2b
                r9 = 1
                r10.f120346e = r0     // Catch: java.lang.Throwable -> L25
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L22
                return
            L22:
                r1 = move-exception
                r2 = r0
                goto L66
            L25:
                r2 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                r1 = r8
                goto L66
            L2b:
                r9 = 6
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L25
                L r4 = r10.f120342a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
                r9 = 3
                r2.call(r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
                goto L0
            L34:
                r2 = move-exception
                r9 = 4
                goto L6f
            L37:
                r2 = move-exception
                com.google.common.util.concurrent.s1 r4 = com.google.common.util.concurrent.w1.a()     // Catch: java.lang.Throwable -> L34
                r9 = 6
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L34
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L34
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
                r6.<init>()     // Catch: java.lang.Throwable -> L34
                java.lang.String r7 = "Exception while executing callback: "
                r9 = 6
                r6.append(r7)     // Catch: java.lang.Throwable -> L34
                L r7 = r10.f120342a     // Catch: java.lang.Throwable -> L34
                r6.append(r7)     // Catch: java.lang.Throwable -> L34
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L34
                r9 = 4
                r6.append(r3)     // Catch: java.lang.Throwable -> L34
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L34
                r9 = 1
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L34
                r9 = 6
                goto L0
            L66:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L6d
                throw r1     // Catch: java.lang.Throwable -> L68
            L68:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L6f
            L6d:
                r1 = move-exception
                goto L66
            L6f:
                if (r1 == 0) goto L79
                monitor-enter(r10)
                r10.f120346e = r0     // Catch: java.lang.Throwable -> L76
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
                goto L79
            L76:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
                throw r0
            L79:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.w1.b.run():void");
        }
    }

    w1() {
    }

    private void f(a<L> event, Object label) {
        com.google.common.base.j0.F(event, androidx.core.app.w.I0);
        com.google.common.base.j0.F(label, com.google.firebase.messaging.e.f.f123534d);
        synchronized (this.f120341a) {
            try {
                Iterator<b<L>> it = this.f120341a.iterator();
                while (it.hasNext()) {
                    it.next().a(event, label);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(L listener, Executor executor) {
        com.google.common.base.j0.F(listener, com.google.android.gms.common.internal.z.a.f106673a);
        com.google.common.base.j0.F(executor, "executor");
        this.f120341a.add(new b<>(listener, executor));
    }

    public void c() throws Exception {
        for (int i10 = 0; i10 < this.f120341a.size(); i10++) {
            this.f120341a.get(i10).b();
        }
    }

    public void d(a<L> event) {
        f(event, event);
    }

    public void e(a<L> event, String label) {
        f(event, label);
    }
}
