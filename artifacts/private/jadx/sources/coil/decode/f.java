package coil.decode;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f87159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87160b;

    public f(@NotNull Drawable drawable, boolean z10) {
        this.f87159a = drawable;
        this.f87160b = z10;
    }

    public static /* synthetic */ f b(f fVar, Drawable drawable, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = fVar.f87159a;
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.f87160b;
        }
        return fVar.a(drawable, z10);
    }

    @NotNull
    public final f a(@NotNull Drawable drawable, boolean z10) {
        return new f(drawable, z10);
    }

    @NotNull
    public final Drawable c() {
        return this.f87159a;
    }

    public final boolean d() {
        return this.f87160b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f87159a, fVar.f87159a) && this.f87160b == fVar.f87160b;
    }

    public int hashCode() {
        return (this.f87159a.hashCode() * 31) + Boolean.hashCode(this.f87160b);
    }
}
