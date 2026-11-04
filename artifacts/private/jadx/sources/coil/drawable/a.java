package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.l1;
import androidx.annotation.w0;
import coil.decode.g;
import coil.size.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.ranges.r;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCrossfadeDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 Collections.kt\ncoil/util/-Collections\n*L\n1#1,277:1\n1#2:278\n30#3,7:279\n30#3,7:286\n30#3,7:293\n30#3,7:300\n12#4,4:307\n12#4,4:311\n*S KotlinDebug\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n*L\n71#1:279,7\n79#1:286,7\n93#1:293,7\n100#1:300,7\n211#1:307,4\n266#1:311,4\n*E\n"})
public final class a extends Drawable implements Drawable.Callback, androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final C0817a f87299m = new C0817a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f87300n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f87301o = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f87302s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f87303t = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f87304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f87305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f87307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<androidx.vectordrawable.graphics.drawable.b.a> f87308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f87309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f87310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f87311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f87312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f87313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Drawable f87314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Drawable f87315l;

    /* JADX INFO: renamed from: coil.drawable.a$a, reason: collision with other inner class name */
    public static final class C0817a {
        public /* synthetic */ C0817a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0817a() {
        }
    }

    @j
    public a(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(drawable, drawable2, null, 0, false, false, 60, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.intValue() != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(java.lang.Integer r3, java.lang.Integer r4) {
        /*
            r2 = this;
            java.lang.String r1 = "Androeed.ru"
            boolean r2 = r2.f87307d
            r1 = 2
            r0 = -1
            r1 = 4
            if (r2 != 0) goto L20
            if (r3 != 0) goto Ld
            r1 = 5
            goto L14
        Ld:
            int r2 = r3.intValue()
            r1 = 2
            if (r2 == r0) goto L1f
        L14:
            if (r4 != 0) goto L17
            goto L20
        L17:
            r1 = 4
            int r2 = r4.intValue()
            r1 = 2
            if (r2 != r0) goto L20
        L1f:
            return r0
        L20:
            if (r3 == 0) goto L27
            int r2 = r3.intValue()
            goto L29
        L27:
            r2 = r0
            r2 = r0
        L29:
            if (r4 == 0) goto L30
            r1 = 3
            int r0 = r4.intValue()
        L30:
            int r2 = java.lang.Math.max(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.drawable.a.a(java.lang.Integer, java.lang.Integer):int");
    }

    private final void j() {
        this.f87313j = 2;
        this.f87314k = null;
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f87308e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(this);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean b(@NotNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        return this.f87308e.remove(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c(@NotNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f87308e.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        this.f87308e.clear();
    }

    public final int d() {
        return this.f87305b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Drawable drawable;
        int i10 = this.f87313j;
        if (i10 == 0) {
            Drawable drawable2 = this.f87314k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f87312i);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        if (i10 == 2) {
            Drawable drawable3 = this.f87315l;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f87312i);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f87311h) / ((double) this.f87305b);
        double dG = r.G(dUptimeMillis, 0.0d, 1.0d);
        int i11 = this.f87312i;
        int i12 = (int) (dG * ((double) i11));
        if (this.f87306c) {
            i11 -= i12;
        }
        boolean z10 = dUptimeMillis >= 1.0d;
        if (!z10 && (drawable = this.f87314k) != null) {
            drawable.setAlpha(i11);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave3);
                throw th2;
            }
        }
        Drawable drawable4 = this.f87315l;
        if (drawable4 != null) {
            drawable4.setAlpha(i12);
            int iSave4 = canvas.save();
            try {
                drawable4.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave4);
                throw th3;
            }
        }
        if (z10) {
            j();
        } else {
            invalidateSelf();
        }
    }

    @Nullable
    public final Drawable e() {
        return this.f87315l;
    }

    public final boolean f() {
        return this.f87306c;
    }

    public final boolean g() {
        return this.f87307d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f87312i;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i10 = this.f87313j;
        if (i10 == 0) {
            Drawable drawable2 = this.f87314k;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i10 != 1) {
            if (i10 == 2 && (drawable = this.f87315l) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.f87315l;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.f87314k;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f87310g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f87309f;
    }

    @Override // android.graphics.drawable.Drawable
    @l(message = "Deprecated in Java")
    public int getOpacity() {
        Drawable drawable = this.f87314k;
        Drawable drawable2 = this.f87315l;
        int i10 = this.f87313j;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @NotNull
    public final h h() {
        return this.f87304a;
    }

    @Nullable
    public final Drawable i() {
        return this.f87314k;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f87313j == 1;
    }

    @l1
    public final void k(@NotNull Drawable drawable, @NotNull Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dC = g.c(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f87304a);
        double d10 = 2;
        int iK0 = kotlin.math.b.K0((((double) iWidth) - (((double) intrinsicWidth) * dC)) / d10);
        int iK1 = kotlin.math.b.K0((((double) iHeight) - (dC * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + iK0, rect.top + iK1, rect.right - iK0, rect.bottom - iK1);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect rect) {
        Drawable drawable = this.f87314k;
        if (drawable != null) {
            k(drawable, rect);
        }
        Drawable drawable2 = this.f87315l;
        if (drawable2 != null) {
            k(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f87314k;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f87315l;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NotNull int[] iArr) {
        Drawable drawable = this.f87314k;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f87315l;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 >= 0 && i10 < 256) {
            this.f87312i = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Drawable drawable = this.f87314k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f87315l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f87314k;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f87315l;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @w0(29)
    public void setTintBlendMode(@Nullable BlendMode blendMode) {
        Drawable drawable = this.f87314k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f87315l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f87314k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f87315l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        Drawable drawable = this.f87314k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f87315l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f87314k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f87315l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f87313j != 0) {
            return;
        }
        this.f87313j = 1;
        this.f87311h = SystemClock.uptimeMillis();
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f87308e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).c(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f87314k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f87315l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f87313j != 2) {
            j();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @j
    public a(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull h hVar) {
        this(drawable, drawable2, hVar, 0, false, false, 56, null);
    }

    @j
    public a(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull h hVar, int i10) {
        this(drawable, drawable2, hVar, i10, false, false, 48, null);
    }

    @j
    public a(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull h hVar, int i10, boolean z10) {
        this(drawable, drawable2, hVar, i10, z10, false, 32, null);
    }

    public /* synthetic */ a(Drawable drawable, Drawable drawable2, h hVar, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, drawable2, (i11 & 4) != 0 ? h.FIT : hVar, (i11 & 8) != 0 ? 100 : i10, (i11 & 16) != 0 ? true : z10, (i11 & 32) != 0 ? false : z11);
    }

    @j
    public a(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull h hVar, int i10, boolean z10, boolean z11) {
        this.f87304a = hVar;
        this.f87305b = i10;
        this.f87306c = z10;
        this.f87307d = z11;
        this.f87308e = new ArrayList();
        this.f87309f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f87310g = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f87312i = 255;
        this.f87314k = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f87315l = drawableMutate;
        if (i10 > 0) {
            Drawable drawable3 = this.f87314k;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawableMutate != null) {
                drawableMutate.setCallback(this);
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }
}
