package kotlinx.atomicfu;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b[] f313471a;

    public c(int i10) {
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bVarArr[i11] = d.a(false);
        }
        this.f313471a = bVarArr;
    }

    public static /* synthetic */ void c() {
    }

    @NotNull
    public final b a(int i10) {
        return this.f313471a[i10];
    }

    public final int b() {
        return this.f313471a.length;
    }
}
