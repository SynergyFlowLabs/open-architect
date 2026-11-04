package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f52097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final PointF[] f52098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f52099c;

    public enum a {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public e(@NotNull a type, @NotNull PointF[] points, float f10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f52097a = type;
        this.f52098b = points;
        this.f52099c = f10;
    }

    @NotNull
    public final PointF[] a() {
        return this.f52098b;
    }

    @NotNull
    public final a b() {
        return this.f52097a;
    }

    public final float c() {
        return this.f52099c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        e eVar = (e) obj;
        return this.f52097a == eVar.f52097a && Arrays.equals(this.f52098b, eVar.f52098b) && this.f52099c == eVar.f52099c;
    }

    public int hashCode() {
        return (((this.f52097a.hashCode() * 31) + Arrays.hashCode(this.f52098b)) * 31) + Float.hashCode(this.f52099c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PathSegment(type=");
        sb2.append(this.f52097a);
        sb2.append(", points=");
        String string = Arrays.toString(this.f52098b);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        sb2.append(", weight=");
        sb2.append(this.f52099c);
        sb2.append(')');
        return sb2.toString();
    }
}
