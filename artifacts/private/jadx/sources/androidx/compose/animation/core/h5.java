package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h5<V extends w> implements y4<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12997d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ z4<V> f12998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f13000c;

    private h5(float f10, float f11, y yVar) {
        this.f12998a = new z4<>(yVar);
        this.f12999b = f10;
        this.f13000c = f11;
    }

    @Override // androidx.compose.animation.core.y4, androidx.compose.animation.core.u4
    public boolean b() {
        return this.f12998a.b();
    }

    @Override // androidx.compose.animation.core.u4
    public long c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f12998a.c(v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V e(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f12998a.e(v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f12998a.g(j10, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f12998a.i(j10, v10, v11, v12);
    }

    public final float n() {
        return this.f12999b;
    }

    public final float o() {
        return this.f13000c;
    }

    public /* synthetic */ h5(float f10, float f11, w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : wVar);
    }

    public h5(float f10, float f11, @Nullable V v10) {
        this(f10, f11, v4.f(v10, f10, f11));
    }
}
