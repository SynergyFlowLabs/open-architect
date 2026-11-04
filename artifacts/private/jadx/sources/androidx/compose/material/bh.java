package androidx.compose.material;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.o2
@kotlin.l(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
public final class bh<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22223d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f22224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f22225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f22226c;

    public bh(T t10, T t11, float f10) {
        this.f22224a = t10;
        this.f22225b = t11;
        this.f22226c = f10;
    }

    public final float a() {
        return this.f22226c;
    }

    public final T b() {
        return this.f22224a;
    }

    public final T c() {
        return this.f22225b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        if (Intrinsics.areEqual(this.f22224a, bhVar.f22224a) && Intrinsics.areEqual(this.f22225b, bhVar.f22225b) && this.f22226c == bhVar.f22226c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f22224a;
        int iHashCode = (t10 != null ? t10.hashCode() : 0) * 31;
        T t11 = this.f22225b;
        return ((iHashCode + (t11 != null ? t11.hashCode() : 0)) * 31) + Float.hashCode(this.f22226c);
    }

    @NotNull
    public String toString() {
        return "SwipeProgress(from=" + this.f22224a + ", to=" + this.f22225b + ", fraction=" + this.f22226c + ')';
    }
}
