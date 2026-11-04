package g0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f275396a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f275397b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f275398c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f275399d = 33;

    public static final int a(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    @NotNull
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> b() {
        return m.f275388c.a();
    }

    @NotNull
    public static final Object[] c(@Nullable Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i10) {
        return (i10 - 1) & (-32);
    }
}
