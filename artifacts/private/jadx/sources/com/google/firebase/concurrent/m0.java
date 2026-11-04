package com.google.firebase.concurrent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
final class m0 implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f120891f = Logger.getLogger(m0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f120892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private final Deque<Runnable> f120893b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private c f120894c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private long f120895d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f120896e = new b(this, null);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f120897a;

        a(Runnable runnable) {
            this.f120897a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f120897a.run();
        }

        public String toString() {
            return this.f120897a.toString();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        Runnable f120899a;

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0046 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            r9.f120899a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        
            com.google.firebase.concurrent.m0.f120891f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f120899a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
        
            r9.f120899a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r9 = this;
                java.lang.String r8 = "Androeed.ru"
                r0 = 0
                r1 = r0
                r1 = r0
            L5:
                com.google.firebase.concurrent.m0 r2 = com.google.firebase.concurrent.m0.this     // Catch: java.lang.Throwable -> L62
                java.util.Deque r2 = com.google.firebase.concurrent.m0.a(r2)     // Catch: java.lang.Throwable -> L62
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L62
                if (r0 != 0) goto L33
                com.google.firebase.concurrent.m0 r0 = com.google.firebase.concurrent.m0.this     // Catch: java.lang.Throwable -> L25
                com.google.firebase.concurrent.m0$c r0 = com.google.firebase.concurrent.m0.b(r0)     // Catch: java.lang.Throwable -> L25
                r8 = 3
                com.google.firebase.concurrent.m0$c r3 = com.google.firebase.concurrent.m0.c.RUNNING     // Catch: java.lang.Throwable -> L25
                if (r0 != r3) goto L27
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
                if (r1 == 0) goto L51
            L1c:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r8 = 7
                r9.interrupt()
                goto L51
            L25:
                r9 = move-exception
                goto L8c
            L27:
                com.google.firebase.concurrent.m0 r0 = com.google.firebase.concurrent.m0.this     // Catch: java.lang.Throwable -> L25
                com.google.firebase.concurrent.m0.d(r0)     // Catch: java.lang.Throwable -> L25
                com.google.firebase.concurrent.m0 r0 = com.google.firebase.concurrent.m0.this     // Catch: java.lang.Throwable -> L25
                com.google.firebase.concurrent.m0.c(r0, r3)     // Catch: java.lang.Throwable -> L25
                r0 = 5
                r0 = 1
            L33:
                r8 = 3
                com.google.firebase.concurrent.m0 r3 = com.google.firebase.concurrent.m0.this     // Catch: java.lang.Throwable -> L25
                java.util.Deque r3 = com.google.firebase.concurrent.m0.a(r3)     // Catch: java.lang.Throwable -> L25
                r8 = 2
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L25
                r8 = 6
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L25
                r9.f120899a = r3     // Catch: java.lang.Throwable -> L25
                if (r3 != 0) goto L52
                com.google.firebase.concurrent.m0 r9 = com.google.firebase.concurrent.m0.this     // Catch: java.lang.Throwable -> L25
                com.google.firebase.concurrent.m0$c r0 = com.google.firebase.concurrent.m0.c.IDLE     // Catch: java.lang.Throwable -> L25
                com.google.firebase.concurrent.m0.c(r9, r0)     // Catch: java.lang.Throwable -> L25
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
                if (r1 == 0) goto L51
                goto L1c
            L51:
                return
            L52:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L62
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f120899a     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L66
                r8 = 0
                r3.run()     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L66
            L5f:
                r9.f120899a = r2     // Catch: java.lang.Throwable -> L62
                goto L5
            L62:
                r9 = move-exception
                goto L8e
            L64:
                r0 = move-exception
                goto L88
            L66:
                r3 = move-exception
                r8 = 2
                java.util.logging.Logger r4 = com.google.firebase.concurrent.m0.e()     // Catch: java.lang.Throwable -> L64
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L64
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
                r6.<init>()     // Catch: java.lang.Throwable -> L64
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L64
                r8 = 4
                java.lang.Runnable r7 = r9.f120899a     // Catch: java.lang.Throwable -> L64
                r6.append(r7)     // Catch: java.lang.Throwable -> L64
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L64
                r8 = 2
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L64
                r8 = 2
                goto L5f
            L88:
                r9.f120899a = r2     // Catch: java.lang.Throwable -> L62
                r8 = 3
                throw r0     // Catch: java.lang.Throwable -> L62
            L8c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
                throw r9     // Catch: java.lang.Throwable -> L62
            L8e:
                if (r1 == 0) goto L98
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r8 = 3
                r0.interrupt()
            L98:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.m0.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (m0.this.f120893b) {
                    try {
                        m0.this.f120894c = c.IDLE;
                        throw e10;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f120899a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + m0.this.f120894c + "}";
        }

        /* synthetic */ b(m0 m0Var, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    m0(Executor executor) {
        this.f120892a = (Executor) com.google.android.gms.common.internal.w.r(executor);
    }

    static /* synthetic */ long d(m0 m0Var) {
        long j10 = m0Var.f120895d;
        m0Var.f120895d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        com.google.android.gms.common.internal.w.r(runnable);
        synchronized (this.f120893b) {
            try {
                c cVar2 = this.f120894c;
                if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                    long j10 = this.f120895d;
                    a aVar = new a(runnable);
                    this.f120893b.add(aVar);
                    c cVar3 = c.QUEUING;
                    this.f120894c = cVar3;
                    try {
                        this.f120892a.execute(this.f120896e);
                        if (this.f120894c != cVar3) {
                            return;
                        }
                        synchronized (this.f120893b) {
                            try {
                                if (this.f120895d == j10 && this.f120894c == cVar3) {
                                    this.f120894c = cVar;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return;
                    } catch (Error | RuntimeException e10) {
                        synchronized (this.f120893b) {
                            try {
                                c cVar4 = this.f120894c;
                                if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                    z10 = false;
                                } else if (this.f120893b.removeLastOccurrence(aVar)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!(e10 instanceof RejectedExecutionException) || z10) {
                                    throw e10;
                                }
                                return;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
                this.f120893b.add(runnable);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f120892a + "}";
    }
}
