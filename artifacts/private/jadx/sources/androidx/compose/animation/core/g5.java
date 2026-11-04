package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
public final class g5<V extends w> implements x4<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12986b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12987a;

    public g5() {
        this(0, 1, null);
    }

    @Override // androidx.compose.animation.core.x4
    public int a() {
        return 0;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return v12;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return j10 < ((long) k()) * 1000000 ? v10 : v11;
    }

    @Override // androidx.compose.animation.core.x4
    public int k() {
        return this.f12987a;
    }

    public g5(int i10) {
        this.f12987a = i10;
    }

    public /* synthetic */ g5(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
