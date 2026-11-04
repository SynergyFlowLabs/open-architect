package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final e3 f109107b = new e3(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f109108a;

    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    e3(Throwable th2) {
        th2.getClass();
        this.f109108a = th2;
    }
}
