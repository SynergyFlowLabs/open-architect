package io.sentry;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f306610c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f306611d = 599;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f306612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f306613b;

    public r0(int i10, int i11) {
        this.f306612a = i10;
        this.f306613b = i11;
    }

    public boolean a(int i10) {
        return i10 >= this.f306612a && i10 <= this.f306613b;
    }

    public r0(int i10) {
        this.f306612a = i10;
        this.f306613b = i10;
    }
}
