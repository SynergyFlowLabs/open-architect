package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
final class i2 implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final s1 f120101f = new s1(i2.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f120102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.a("queue")
    private final Deque<Runnable> f120103b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @a8.a("queue")
    private c f120104c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.a("queue")
    private long f120105d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @r9.j
    private final b f120106e = new b(this, null);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f120107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f120108b;

        a(final i2 this$0, final Runnable val$task) {
            this.f120107a = val$task;
            this.f120108b = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f120107a.run();
        }

        public String toString() {
            return this.f120107a.toString();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        Runnable f120109a;

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005b  */
        /* JADX WARN: Code duplicated, block: B:53:0x004c A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        
            if (r1 == false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        
            r9.f120109a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        
            com.google.common.util.concurrent.i2.f120101f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f120109a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        
            r9.f120109a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
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
            L4:
                com.google.common.util.concurrent.i2 r2 = com.google.common.util.concurrent.i2.this     // Catch: java.lang.Throwable -> L6e
                r8 = 4
                java.util.Deque r2 = com.google.common.util.concurrent.i2.a(r2)     // Catch: java.lang.Throwable -> L6e
                r8 = 6
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L6e
                if (r0 != 0) goto L3a
                com.google.common.util.concurrent.i2 r0 = com.google.common.util.concurrent.i2.this     // Catch: java.lang.Throwable -> L2a
                r8 = 1
                com.google.common.util.concurrent.i2$c r0 = com.google.common.util.concurrent.i2.b(r0)     // Catch: java.lang.Throwable -> L2a
                r8 = 2
                com.google.common.util.concurrent.i2$c r3 = com.google.common.util.concurrent.i2.c.RUNNING     // Catch: java.lang.Throwable -> L2a
                if (r0 != r3) goto L2d
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r8 = 1
                if (r1 == 0) goto L5a
            L1f:
                r8 = 2
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r8 = 1
                r9.interrupt()
                r8 = 3
                goto L5a
            L2a:
                r9 = move-exception
                r8 = 0
                goto L9e
            L2d:
                r8 = 3
                com.google.common.util.concurrent.i2 r0 = com.google.common.util.concurrent.i2.this     // Catch: java.lang.Throwable -> L2a
                com.google.common.util.concurrent.i2.d(r0)     // Catch: java.lang.Throwable -> L2a
                com.google.common.util.concurrent.i2 r0 = com.google.common.util.concurrent.i2.this     // Catch: java.lang.Throwable -> L2a
                com.google.common.util.concurrent.i2.c(r0, r3)     // Catch: java.lang.Throwable -> L2a
                r0 = 5
                r0 = 1
            L3a:
                r8 = 4
                com.google.common.util.concurrent.i2 r3 = com.google.common.util.concurrent.i2.this     // Catch: java.lang.Throwable -> L2a
                java.util.Deque r3 = com.google.common.util.concurrent.i2.a(r3)     // Catch: java.lang.Throwable -> L2a
                r8 = 4
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L2a
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L2a
                r9.f120109a = r3     // Catch: java.lang.Throwable -> L2a
                if (r3 != 0) goto L5b
                com.google.common.util.concurrent.i2 r9 = com.google.common.util.concurrent.i2.this     // Catch: java.lang.Throwable -> L2a
                r8 = 3
                com.google.common.util.concurrent.i2$c r0 = com.google.common.util.concurrent.i2.c.IDLE     // Catch: java.lang.Throwable -> L2a
                r8 = 6
                com.google.common.util.concurrent.i2.c(r9, r0)     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r8 = 2
                if (r1 == 0) goto L5a
                goto L1f
            L5a:
                return
            L5b:
                r8 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L6e
                r1 = r1 | r2
                r8 = 5
                r2 = 0
                r8 = 4
                java.lang.Runnable r3 = r9.f120109a     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
                r8 = 3
                r3.run()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            L6b:
                r9.f120109a = r2     // Catch: java.lang.Throwable -> L6e
                goto L4
            L6e:
                r9 = move-exception
                r8 = 3
                goto La2
            L71:
                r0 = move-exception
                r8 = 5
                goto L9b
            L74:
                r3 = move-exception
                com.google.common.util.concurrent.s1 r4 = com.google.common.util.concurrent.i2.e()     // Catch: java.lang.Throwable -> L71
                r8 = 5
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L71
                r8 = 2
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L71
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
                r6.<init>()     // Catch: java.lang.Throwable -> L71
                r8 = 2
                java.lang.String r7 = "Exception while executing runnable "
                r8 = 0
                r6.append(r7)     // Catch: java.lang.Throwable -> L71
                java.lang.Runnable r7 = r9.f120109a     // Catch: java.lang.Throwable -> L71
                r6.append(r7)     // Catch: java.lang.Throwable -> L71
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L71
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L71
                r8 = 5
                goto L6b
            L9b:
                r9.f120109a = r2     // Catch: java.lang.Throwable -> L6e
                throw r0     // Catch: java.lang.Throwable -> L6e
            L9e:
                r8 = 4
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r8 = 3
                throw r9     // Catch: java.lang.Throwable -> L6e
            La2:
                r8 = 2
                if (r1 == 0) goto Lad
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r8 = 1
                r0.interrupt()
            Lad:
                r8 = 4
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.i2.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (i2.this.f120103b) {
                    try {
                        i2.this.f120104c = c.IDLE;
                        throw e10;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f120109a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + i2.this.f120104c + "}";
        }

        /* synthetic */ b(i2 i2Var, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    i2(Executor executor) {
        this.f120102a = (Executor) com.google.common.base.j0.E(executor);
    }

    static /* synthetic */ long d(i2 i2Var) {
        long j10 = i2Var.f120105d;
        i2Var.f120105d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable task) {
        c cVar;
        boolean z10;
        com.google.common.base.j0.E(task);
        synchronized (this.f120103b) {
            try {
                c cVar2 = this.f120104c;
                if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                    long j10 = this.f120105d;
                    a aVar = new a(this, task);
                    this.f120103b.add(aVar);
                    c cVar3 = c.QUEUING;
                    this.f120104c = cVar3;
                    try {
                        this.f120102a.execute(this.f120106e);
                        if (this.f120104c != cVar3) {
                            return;
                        }
                        synchronized (this.f120103b) {
                            try {
                                if (this.f120105d == j10 && this.f120104c == cVar3) {
                                    this.f120104c = cVar;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        synchronized (this.f120103b) {
                            try {
                                c cVar4 = this.f120104c;
                                if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                    z10 = false;
                                } else if (this.f120103b.removeLastOccurrence(aVar)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!(th3 instanceof RejectedExecutionException) || z10) {
                                    throw th3;
                                }
                                return;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
                this.f120103b.add(task);
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f120102a + "}";
    }
}
