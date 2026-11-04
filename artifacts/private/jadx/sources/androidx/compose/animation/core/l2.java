package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class l2<T> implements k0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13137b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13138a;

    public l2() {
        this(0, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof l2) && ((l2) obj).f13138a == this.f13138a;
    }

    public final int h() {
        return this.f13138a;
    }

    public int hashCode() {
        return this.f13138a;
    }

    public l2(int i10) {
        this.f13138a = i10;
    }

    public /* synthetic */ l2(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // androidx.compose.animation.core.y0, androidx.compose.animation.core.o
    @NotNull
    public <V extends w> x4<V> a(@NotNull z3<T, V> z3Var) {
        return new g5(this.f13138a);
    }
}
