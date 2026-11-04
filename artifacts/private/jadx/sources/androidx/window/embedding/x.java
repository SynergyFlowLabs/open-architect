package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public class x extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f76352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f76353d;

    @w0(30)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f76354a = new a();

        private a() {
        }

        @androidx.annotation.u
        @NotNull
        public final Rect a(@NotNull WindowMetrics windowMetrics) {
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @jj.e(jj.a.SOURCE)
    public @interface b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x() {
        this(0, 0, 0.0f, 0, 15, null);
        boolean z10 = false;
    }

    public final boolean a(@NotNull WindowMetrics parentMetrics) {
        Intrinsics.checkNotNullParameter(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect rectA = a.f76354a.a(parentMetrics);
        return (this.f76350a == 0 || rectA.width() >= this.f76350a) && (this.f76351b == 0 || Math.min(rectA.width(), rectA.height()) >= this.f76351b);
    }

    public final int b() {
        return this.f76353d;
    }

    public final int c() {
        return this.f76351b;
    }

    public final int d() {
        return this.f76350a;
    }

    public final float e() {
        return this.f76352c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f76350a == xVar.f76350a && this.f76351b == xVar.f76351b && this.f76352c == xVar.f76352c && this.f76353d == xVar.f76353d;
    }

    public int hashCode() {
        return (((((this.f76350a * 31) + this.f76351b) * 31) + Float.hashCode(this.f76352c)) * 31) + this.f76353d;
    }

    public /* synthetic */ x(int i10, int i11, float f10, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0.5f : f10, (i13 & 8) != 0 ? 3 : i12);
    }

    public x(int i10, int i11, float f10, int i12) {
        this.f76350a = i10;
        this.f76351b = i11;
        this.f76352c = f10;
        this.f76353d = i12;
    }
}
