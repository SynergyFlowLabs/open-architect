package androidx.media3.extractor.avi;

import androidx.media3.common.util.o0;

/* JADX INFO: loaded from: classes3.dex */
final class c implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67077e = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67081d;

    private c(int i10, int i11, int i12, int i13) {
        this.f67078a = i10;
        this.f67079b = i11;
        this.f67080c = i12;
        this.f67081d = i13;
    }

    public static c b(o0 o0Var) {
        int iW = o0Var.w();
        o0Var.b0(8);
        int iW2 = o0Var.w();
        int iW3 = o0Var.w();
        o0Var.b0(4);
        int iW4 = o0Var.w();
        o0Var.b0(12);
        return new c(iW, iW2, iW3, iW4);
    }

    public boolean a() {
        return (this.f67079b & 16) == 16;
    }

    @Override // androidx.media3.extractor.avi.a
    public int c() {
        return b.f67053x;
    }
}
