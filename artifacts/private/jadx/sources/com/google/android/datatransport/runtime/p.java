package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class p implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f103586a;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f103587a;

        a(Runnable runnable) {
            this.f103587a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f103587a.run();
            } catch (Exception e10) {
                z5.a.f("Executor", "Background execution failure.", e10);
            }
        }
    }

    p(Executor executor) {
        this.f103586a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f103586a.execute(new a(runnable));
    }
}
