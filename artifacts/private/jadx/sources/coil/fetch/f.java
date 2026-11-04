package coil.fetch;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f87353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final coil.decode.e f87355c;

    public f(@NotNull Drawable drawable, boolean z10, @NotNull coil.decode.e eVar) {
        super(null);
        this.f87353a = drawable;
        this.f87354b = z10;
        this.f87355c = eVar;
    }

    public static /* synthetic */ f b(f fVar, Drawable drawable, boolean z10, coil.decode.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = fVar.f87353a;
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.f87354b;
        }
        if ((i10 & 4) != 0) {
            eVar = fVar.f87355c;
        }
        return fVar.a(drawable, z10, eVar);
    }

    @NotNull
    public final f a(@NotNull Drawable drawable, boolean z10, @NotNull coil.decode.e eVar) {
        return new f(drawable, z10, eVar);
    }

    @NotNull
    public final coil.decode.e c() {
        return this.f87355c;
    }

    @NotNull
    public final Drawable d() {
        return this.f87353a;
    }

    public final boolean e() {
        return this.f87354b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f87353a, fVar.f87353a) && this.f87354b == fVar.f87354b && this.f87355c == fVar.f87355c;
    }

    public int hashCode() {
        return (((this.f87353a.hashCode() * 31) + Boolean.hashCode(this.f87354b)) * 31) + this.f87355c.hashCode();
    }
}
