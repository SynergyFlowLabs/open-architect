package androidx.compose.foundation.gestures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class u2<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15126c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<T> f15127a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private float[] f15128b;

    public u2() {
        float[] fArr = new float[5];
        for (int i10 = 0; i10 < 5; i10++) {
            fArr[i10] = Float.NaN;
        }
        this.f15128b = fArr;
    }

    private final void d() {
        float[] fArrCopyOf = Arrays.copyOf(this.f15128b, this.f15127a.size() + 2);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this.f15128b = fArrCopyOf;
    }

    public final void a(T t10, float f10) {
        this.f15127a.add(t10);
        if (this.f15128b.length < this.f15127a.size()) {
            d();
        }
        this.f15128b[this.f15127a.size() - 1] = f10;
    }

    @NotNull
    public final List<T> b() {
        return this.f15127a;
    }

    @NotNull
    public final float[] c() {
        return ArraysKt.copyOfRange(this.f15128b, 0, this.f15127a.size());
    }

    @NotNull
    public final List<T> e() {
        return this.f15127a;
    }

    @NotNull
    public final float[] f() {
        return this.f15128b;
    }

    public final void g(@NotNull float[] fArr) {
        this.f15128b = fArr;
    }
}
