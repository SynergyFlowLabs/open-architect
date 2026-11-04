package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends RippleDrawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f24735e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static Method f24736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f24737g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private q0 f24739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f24740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24741d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @w0(23)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f24742a = new b();

        private b() {
        }

        public final void a(@NotNull RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    public b0(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f24738a = z10;
    }

    private final long a(long j10, float f10) {
        return q0.w(j10, kotlin.ranges.r.A(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        long jA = a(j10, f10);
        q0 q0Var = this.f24739b;
        if (!(q0Var == null ? false : q0.y(q0Var.M(), jA))) {
            this.f24739b = q0.n(jA);
            setColor(ColorStateList.valueOf(s0.t(jA)));
        }
    }

    public final void c(int i10) {
        Integer num = this.f24740c;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f24740c = Integer.valueOf(i10);
        b.f24742a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @NotNull
    public Rect getDirtyBounds() {
        if (!this.f24738a) {
            this.f24741d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f24741d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f24741d;
    }
}
