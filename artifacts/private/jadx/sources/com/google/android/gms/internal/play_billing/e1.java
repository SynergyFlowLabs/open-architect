package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class e1 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e1 f109106b = new e1();

    private e1() {
        super("");
    }

    @Override // com.google.android.gms.internal.play_billing.h1
    public final int b(h1 h1Var) {
        return h1Var == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.play_billing.h1
    final void c(StringBuilder sb2) {
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.play_billing.h1, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return b((h1) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.h1
    final void d(StringBuilder sb2) {
        sb2.append("+∞)");
    }

    @Override // com.google.android.gms.internal.play_billing.h1
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
