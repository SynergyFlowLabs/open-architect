package coil.compose;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@k7
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87051d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f87052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f87053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final coil.j f87054c;

    public h(@Nullable Object obj, @NotNull m mVar, @NotNull coil.j jVar) {
        this.f87052a = obj;
        this.f87053b = mVar;
        this.f87054c = jVar;
    }

    @NotNull
    public final coil.j a() {
        return this.f87054c;
    }

    @Nullable
    public final Object b() {
        return this.f87052a;
    }

    @NotNull
    public final m c() {
        return this.f87053b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f87053b.b(this.f87052a, hVar.f87052a) && Intrinsics.areEqual(this.f87054c, hVar.f87054c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f87053b.c(this.f87052a) * 31) + this.f87054c.hashCode();
    }
}
