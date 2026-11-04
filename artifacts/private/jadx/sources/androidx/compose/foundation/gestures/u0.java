package androidx.compose.foundation.gestures;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1751:1\n97#2,4:1752\n13524#3,3:1756\n13524#3,3:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n*L\n1571#1:1752,4\n1587#1:1756,3\n1600#1:1759,3\n*E\n"})
final class u0<T> implements t2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<T> f15123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final float[] f15124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15125c;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(@NotNull List<? extends T> list, @NotNull float[] fArr) {
        this.f15123a = list;
        this.f15124b = fArr;
        if (!(list.size() == fArr.length)) {
            androidx.compose.foundation.internal.e.g("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + ArraysKt.toList(fArr));
        }
        this.f15125c = fArr.length;
    }

    @Override // androidx.compose.foundation.gestures.t2
    @Nullable
    public T a(float f10, boolean z10) {
        float[] fArr = this.f15124b;
        int length = fArr.length;
        int i10 = -1;
        int i11 = 0;
        float f11 = Float.POSITIVE_INFINITY;
        int i12 = 0;
        while (i11 < length) {
            float f12 = fArr[i11];
            int i13 = i12 + 1;
            float f13 = z10 ? f12 - f10 : f10 - f12;
            if (f13 < 0.0f) {
                f13 = Float.POSITIVE_INFINITY;
            }
            if (f13 <= f11) {
                i10 = i12;
                f11 = f13;
            }
            i11++;
            i12 = i13;
        }
        return this.f15123a.get(i10);
    }

    @Override // androidx.compose.foundation.gestures.t2
    @Nullable
    public T b(float f10) {
        float[] fArr = this.f15124b;
        int length = fArr.length;
        int i10 = -1;
        float f11 = Float.POSITIVE_INFINITY;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1;
            float fAbs = Math.abs(f10 - fArr[i11]);
            if (fAbs <= f11) {
                i10 = i12;
                f11 = fAbs;
            }
            i11++;
            i12 = i13;
        }
        return this.f15123a.get(i10);
    }

    @Override // androidx.compose.foundation.gestures.t2
    public float c(T t10) {
        int iIndexOf = this.f15123a.indexOf(t10);
        float[] fArr = this.f15124b;
        return (iIndexOf < 0 || iIndexOf >= fArr.length) ? ((Number) k.f14681b.invoke(Integer.valueOf(iIndexOf))).floatValue() : fArr[iIndexOf];
    }

    @Override // androidx.compose.foundation.gestures.t2
    public boolean d(T t10) {
        return this.f15123a.indexOf(t10) != -1;
    }

    @Override // androidx.compose.foundation.gestures.t2
    @Nullable
    public T e(int i10) {
        return (T) CollectionsKt.getOrNull(this.f15123a, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.areEqual(this.f15123a, u0Var.f15123a) && Arrays.equals(this.f15124b, u0Var.f15124b) && getSize() == u0Var.getSize();
    }

    @Override // androidx.compose.foundation.gestures.t2
    public float f() {
        Float fMaxOrNull = ArraysKt.maxOrNull(this.f15124b);
        if (fMaxOrNull != null) {
            return fMaxOrNull.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.t2
    public float g(int i10) {
        float[] fArr = this.f15124b;
        return (i10 < 0 || i10 >= fArr.length) ? ((Number) k.f14681b.invoke(Integer.valueOf(i10))).floatValue() : fArr[i10];
    }

    @Override // androidx.compose.foundation.gestures.t2
    public int getSize() {
        return this.f15125c;
    }

    @Override // androidx.compose.foundation.gestures.t2
    public float h() {
        Float fMinOrNull = ArraysKt.minOrNull(this.f15124b);
        if (fMinOrNull != null) {
            return fMinOrNull.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return (((this.f15123a.hashCode() * 31) + Arrays.hashCode(this.f15124b)) * 31) + getSize();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e(i10));
            sb3.append('=');
            sb3.append(g(i10));
            sb2.append(sb3.toString());
            if (i10 < getSize() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("})");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
