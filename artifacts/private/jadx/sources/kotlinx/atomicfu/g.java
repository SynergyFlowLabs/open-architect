package kotlinx.atomicfu;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f[] f313476a;

    public g(int i10) {
        f[] fVarArr = new f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fVarArr[i11] = d.c(0);
        }
        this.f313476a = fVarArr;
    }

    public static /* synthetic */ void c() {
    }

    @NotNull
    public final f a(int i10) {
        return this.f313476a[i10];
    }

    public final int b() {
        return this.f313476a.length;
    }
}
