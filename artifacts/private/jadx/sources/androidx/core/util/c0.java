package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f48371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f48372b;

    @w0(21)
    private static final class a {
        private a() {
        }

        @NonNull
        static SizeF a(@NonNull c0 c0Var) {
            t.l(c0Var);
            return new SizeF(c0Var.b(), c0Var.a());
        }

        @NonNull
        static c0 b(@NonNull SizeF sizeF) {
            t.l(sizeF);
            return new c0(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public c0(float f10, float f11) {
        this.f48371a = t.d(f10, "width");
        this.f48372b = t.d(f11, "height");
    }

    @NonNull
    @w0(21)
    public static c0 d(@NonNull SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f48372b;
    }

    public float b() {
        return this.f48371a;
    }

    @NonNull
    @w0(21)
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f48371a == this.f48371a && c0Var.f48372b == this.f48372b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f48372b) ^ Float.floatToIntBits(this.f48371a);
    }

    @NonNull
    public String toString() {
        return this.f48371a + "x" + this.f48372b;
    }
}
