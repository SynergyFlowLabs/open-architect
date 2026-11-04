package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f47853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f47854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f47855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f47856d;

    public p(@NonNull PointF pointF, float f10, @NonNull PointF pointF2, float f11) {
        this.f47853a = (PointF) androidx.core.util.t.m(pointF, "start == null");
        this.f47854b = f10;
        this.f47855c = (PointF) androidx.core.util.t.m(pointF2, "end == null");
        this.f47856d = f11;
    }

    @NonNull
    public PointF a() {
        return this.f47855c;
    }

    public float b() {
        return this.f47856d;
    }

    @NonNull
    public PointF c() {
        return this.f47853a;
    }

    public float d() {
        return this.f47854b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f47854b, pVar.f47854b) == 0 && Float.compare(this.f47856d, pVar.f47856d) == 0 && this.f47853a.equals(pVar.f47853a) && this.f47855c.equals(pVar.f47855c);
    }

    public int hashCode() {
        int iHashCode = this.f47853a.hashCode() * 31;
        float f10 = this.f47854b;
        int iFloatToIntBits = (((iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f47855c.hashCode()) * 31;
        float f11 = this.f47856d;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f47853a + ", startFraction=" + this.f47854b + ", end=" + this.f47855c + ", endFraction=" + this.f47856d + AbstractJsonLexerKt.END_OBJ;
    }
}
