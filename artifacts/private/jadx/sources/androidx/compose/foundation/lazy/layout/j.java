package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class j implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f17438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f17439b;

    public /* synthetic */ j(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public int a(@NotNull androidx.compose.ui.unit.d dVar, int i10) {
        return dVar.g6(this.f17439b);
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public int b(@NotNull androidx.compose.ui.unit.d dVar, int i10) {
        return dVar.g6(this.f17438a);
    }

    public final float c() {
        return this.f17438a;
    }

    public final float d() {
        return this.f17439b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (androidx.compose.ui.unit.h.x(jVar.f17438a, this.f17438a) && androidx.compose.ui.unit.h.x(jVar.f17439b, this.f17439b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (androidx.compose.ui.unit.h.D(this.f17438a) * 31) + androidx.compose.ui.unit.h.D(this.f17439b);
    }

    private j(float f10, float f11) {
        this.f17438a = f10;
        this.f17439b = f11;
    }
}
