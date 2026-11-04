package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@kotlin.l(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/ResistanceConfig\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,881:1\n65#2,10:882\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/ResistanceConfig\n*L\n695#1:882,10\n*E\n"})
public final class sd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24938d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f24939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f24940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f24941c;

    public sd(float f10, float f11, float f12) {
        this.f24939a = f10;
        this.f24940b = f11;
        this.f24941c = f12;
    }

    public final float a(float f10) {
        float f11 = f10 < 0.0f ? this.f24940b : this.f24941c;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f24939a;
        float f13 = f10 / f12;
        if (f13 < -1.0f) {
            f13 = -1.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        return (f12 / f11) * ((float) Math.sin((f13 * 3.1415927f) / 2));
    }

    public final float b() {
        return this.f24939a;
    }

    public final float c() {
        return this.f24941c;
    }

    public final float d() {
        return this.f24940b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        return this.f24939a == sdVar.f24939a && this.f24940b == sdVar.f24940b && this.f24941c == sdVar.f24941c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f24939a) * 31) + Float.hashCode(this.f24940b)) * 31) + Float.hashCode(this.f24941c);
    }

    @NotNull
    public String toString() {
        return "ResistanceConfig(basis=" + this.f24939a + ", factorAtMin=" + this.f24940b + ", factorAtMax=" + this.f24941c + ')';
    }

    public /* synthetic */ sd(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? 10.0f : f11, (i10 & 4) != 0 ? 10.0f : f12);
    }
}
