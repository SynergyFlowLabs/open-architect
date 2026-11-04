package androidx.compose.foundation.lazy;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r0 implements q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17705c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17707b;

    public r0(int i10, int i11) {
        this.f17706a = i10;
        this.f17707b = i11;
    }

    @Override // androidx.compose.foundation.lazy.q0
    public int a() {
        return this.f17707b;
    }

    @Override // androidx.compose.foundation.lazy.q0
    public int getIndex() {
        return this.f17706a;
    }
}
