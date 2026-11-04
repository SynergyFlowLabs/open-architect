package androidx.compose.material3;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@kotlin.l(message = "Not necessary with the introduction of Slider state")
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,3223:1\n85#2:3224\n117#2,2:3225\n85#2:3227\n117#2,2:3228\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n*L\n2686#1:3224\n2686#1:3225,2\n2694#1:3227\n2694#1:3228,2\n*E\n"})
public final class o00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31217c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f31218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f31219b;

    /* JADX WARN: Multi-variable type inference failed */
    public o00() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final kotlin.ranges.f<Float> a() {
        return (kotlin.ranges.f) this.f31218a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final float[] b() {
        return (float[]) this.f31219b.getValue();
    }

    public final void c(@NotNull kotlin.ranges.f<Float> fVar) {
        this.f31218a.setValue(fVar);
    }

    public final void d(@NotNull float[] fArr) {
        this.f31219b.setValue(fArr);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return Intrinsics.areEqual(a(), o00Var.a()) && Arrays.equals(b(), o00Var.b());
    }

    public int hashCode() {
        return (a().hashCode() * 31) + Arrays.hashCode(b());
    }

    public o00(@NotNull kotlin.ranges.f<Float> fVar, @NotNull float[] fArr) {
        this.f31218a = androidx.compose.runtime.d7.g(fVar, null, 2, null);
        this.f31219b = androidx.compose.runtime.d7.g(fArr, null, 2, null);
    }

    public /* synthetic */ o00(kotlin.ranges.f fVar, float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? kotlin.ranges.r.e(0.0f, 1.0f) : fVar, (i10 & 2) != 0 ? new float[0] : fArr);
    }
}
