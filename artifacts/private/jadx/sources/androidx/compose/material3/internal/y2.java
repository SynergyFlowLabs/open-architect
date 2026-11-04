package androidx.compose.material3.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/MapDraggableAnchors\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1#2:869\n*E\n"})
final class y2<T> implements b2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<T, Float> f29251a;

    public y2(@NotNull Map<T, Float> map) {
        this.f29251a = map;
    }

    @Override // androidx.compose.material3.internal.b2
    @Nullable
    public T a(float f10, boolean z10) {
        T next;
        Iterator<T> it = this.f29251a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f11 = z10 ? fFloatValue - f10 : f10 - fFloatValue;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f12 = z10 ? fFloatValue2 - f10 : f10 - fFloatValue2;
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.b2
    @Nullable
    public T b(float f10) {
        T next;
        Iterator<T> it = this.f29251a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f10 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.b2
    public float c(T t10) {
        Float f10 = this.f29251a.get(t10);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.b2
    public boolean d(T t10) {
        return this.f29251a.containsKey(t10);
    }

    @Override // androidx.compose.material3.internal.b2
    public float e() {
        Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) this.f29251a.values());
        if (fMinOrNull != null) {
            return fMinOrNull.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y2) {
            return Intrinsics.areEqual(this.f29251a, ((y2) obj).f29251a);
        }
        return false;
    }

    @Override // androidx.compose.material3.internal.b2
    public float f() {
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) this.f29251a.values());
        if (fMaxOrNull != null) {
            return fMaxOrNull.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.b2
    public int getSize() {
        return this.f29251a.size();
    }

    public int hashCode() {
        return this.f29251a.hashCode() * 31;
    }

    @NotNull
    public String toString() {
        return "MapDraggableAnchors(" + this.f29251a + ')';
    }
}
