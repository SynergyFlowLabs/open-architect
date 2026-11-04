package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f38263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final float[] f38264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f38265c;

    public enum a {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f38274i = kotlin.enums.c.c(k());

        static {
            int i10 = 6 >> 0;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f38274i;
        }
    }

    public v2(@NotNull a aVar, @NotNull float[] fArr, float f10) {
        this.f38263a = aVar;
        this.f38264b = fArr;
        this.f38265c = f10;
    }

    @NotNull
    public final float[] a() {
        return this.f38264b;
    }

    @NotNull
    public final a b() {
        return this.f38263a;
    }

    public final float c() {
        return this.f38265c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v2.class == obj.getClass()) {
            v2 v2Var = (v2) obj;
            if (this.f38263a == v2Var.f38263a && Arrays.equals(this.f38264b, v2Var.f38264b) && this.f38265c == v2Var.f38265c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f38263a.hashCode() * 31) + Arrays.hashCode(this.f38264b)) * 31) + Float.hashCode(this.f38265c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PathSegment(type=");
        sb2.append(this.f38263a);
        sb2.append(", points=");
        String string = Arrays.toString(this.f38264b);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(", weight=");
        sb2.append(this.f38265c);
        sb2.append(')');
        return sb2.toString();
    }
}
