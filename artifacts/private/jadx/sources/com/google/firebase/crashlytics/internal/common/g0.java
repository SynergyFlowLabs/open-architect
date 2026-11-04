package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
class g0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f121051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.k f121052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f121053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f121054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f121055e = new AtomicBoolean(false);

    interface a {
        void a(com.google.firebase.crashlytics.internal.settings.k kVar, Thread thread, Throwable th2);
    }

    public g0(a aVar, com.google.firebase.crashlytics.internal.settings.k kVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.a aVar2) {
        this.f121051a = aVar;
        this.f121052b = kVar;
        this.f121053c = uncaughtExceptionHandler;
        this.f121054d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            com.google.firebase.crashlytics.internal.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            com.google.firebase.crashlytics.internal.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f121054d.c()) {
            return true;
        }
        com.google.firebase.crashlytics.internal.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f121055e.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:602)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:628)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f121055e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f121051a.a(this.f121052b, thread, th2);
                } else {
                    com.google.firebase.crashlytics.internal.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f121053c != null) {
                    com.google.firebase.crashlytics.internal.g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f121053c.uncaughtException(thread, th2);
                } else {
                    com.google.firebase.crashlytics.internal.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e10) {
                com.google.firebase.crashlytics.internal.g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f121053c == null) {
                    com.google.firebase.crashlytics.internal.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.f121055e.set(false);
        } catch (Throwable th3) {
            if (this.f121053c != null) {
                com.google.firebase.crashlytics.internal.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f121053c.uncaughtException(thread, th2);
            } else {
                com.google.firebase.crashlytics.internal.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f121055e.set(false);
            throw th3;
        }
    }
}
