package coil.request;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Drawable f87646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f87647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Throwable f87648c;

    public f(@Nullable Drawable drawable, @NotNull i iVar, @NotNull Throwable th2) {
        super(null);
        this.f87646a = drawable;
        this.f87647b = iVar;
        this.f87648c = th2;
    }

    public static /* synthetic */ f d(f fVar, Drawable drawable, i iVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = fVar.a();
        }
        if ((i10 & 2) != 0) {
            iVar = fVar.b();
        }
        if ((i10 & 4) != 0) {
            th2 = fVar.f87648c;
        }
        return fVar.c(drawable, iVar, th2);
    }

    @Override // coil.request.j
    @Nullable
    public Drawable a() {
        return this.f87646a;
    }

    @Override // coil.request.j
    @NotNull
    public i b() {
        return this.f87647b;
    }

    @NotNull
    public final f c(@Nullable Drawable drawable, @NotNull i iVar, @NotNull Throwable th2) {
        return new f(drawable, iVar, th2);
    }

    @NotNull
    public final Throwable e() {
        return this.f87648c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(a(), fVar.a()) && Intrinsics.areEqual(b(), fVar.b()) && Intrinsics.areEqual(this.f87648c, fVar.f87648c);
    }

    public int hashCode() {
        Drawable drawableA = a();
        return ((((drawableA != null ? drawableA.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.f87648c.hashCode();
    }
}
