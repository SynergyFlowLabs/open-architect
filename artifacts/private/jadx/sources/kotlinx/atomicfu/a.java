package kotlinx.atomicfu;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j<T>[] f313466a;

    public a(int i10) {
        j<T>[] jVarArr = new j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jVarArr[i11] = d.g(null);
        }
        this.f313466a = jVarArr;
    }

    public static /* synthetic */ void c() {
    }

    @NotNull
    public final j<T> a(int i10) {
        return this.f313466a[i10];
    }

    public final int b() {
        return this.f313466a.length;
    }
}
