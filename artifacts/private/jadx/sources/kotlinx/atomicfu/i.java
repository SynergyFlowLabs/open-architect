package kotlinx.atomicfu;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h[] f313481a;

    public i(int i10) {
        h[] hVarArr = new h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            hVarArr[i11] = d.e(0L);
        }
        this.f313481a = hVarArr;
    }

    public static /* synthetic */ void c() {
    }

    @NotNull
    public final h a(int i10) {
        return this.f313481a[i10];
    }

    public final int b() {
        return this.f313481a.length;
    }
}
