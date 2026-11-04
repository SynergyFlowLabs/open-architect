package androidx.compose.ui.text.style;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42236d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f42239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f42235c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final q f42237e = new q(1.0f, 0.0f);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final q a() {
            return q.f42237e;
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public static /* synthetic */ q c(q qVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = qVar.f42238a;
        }
        if ((i10 & 2) != 0) {
            f11 = qVar.f42239b;
        }
        return qVar.b(f10, f11);
    }

    @NotNull
    public final q b(float f10, float f11) {
        return new q(f10, f11);
    }

    public final float d() {
        return this.f42238a;
    }

    public final float e() {
        return this.f42239b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f42238a == qVar.f42238a && this.f42239b == qVar.f42239b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f42238a) * 31) + Float.hashCode(this.f42239b);
    }

    @NotNull
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f42238a + ", skewX=" + this.f42239b + ')';
    }

    public q(float f10, float f11) {
        this.f42238a = f10;
        this.f42239b = f11;
    }

    public /* synthetic */ q(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
