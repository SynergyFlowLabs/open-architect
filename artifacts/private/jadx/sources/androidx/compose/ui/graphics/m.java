package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f38032c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f38030a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f38031b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f38032c = iArr3;
        }
    }

    @NotNull
    public static final h2 a() {
        return new l();
    }

    @NotNull
    public static final h2 b(@NotNull Paint paint) {
        return new l(paint);
    }

    public static final float c(@NotNull Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean d(@NotNull Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long e(@NotNull Paint paint) {
        return s0.b(paint.getColor());
    }

    public static final int f(@NotNull Paint paint) {
        return !paint.isFilterBitmap() ? l1.f37840b.d() : l1.f37840b.b();
    }

    public static final int g(@NotNull Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f38031b[strokeCap.ordinal()];
        if (i10 == 1) {
            return u3.f38256b.a();
        }
        if (i10 != 2) {
            return i10 != 3 ? u3.f38256b.a() : u3.f38256b.c();
        }
        return u3.f38256b.b();
    }

    public static final int h(@NotNull Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f38032c[strokeJoin.ordinal()];
        if (i10 == 1) {
            return v3.f38275b.b();
        }
        if (i10 != 2) {
            return i10 != 3 ? v3.f38275b.b() : v3.f38275b.c();
        }
        return v3.f38275b.a();
    }

    public static final float i(@NotNull Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float j(@NotNull Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int k(@NotNull Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : a.f38030a[style.ordinal()]) == 1 ? j2.f37801b.b() : j2.f37801b.a();
    }

    @NotNull
    public static final Paint l() {
        return new Paint(7);
    }

    public static final void m(@NotNull Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void n(@NotNull Paint paint, boolean z10) {
        paint.setAntiAlias(z10);
    }

    public static final void o(@NotNull Paint paint, int i10) {
        e4.f37760a.a(paint, i10);
    }

    public static final void p(@NotNull Paint paint, long j10) {
        paint.setColor(s0.t(j10));
    }

    public static final void q(@NotNull Paint paint, @Nullable r0 r0Var) {
        paint.setColorFilter(r0Var != null ? d.e(r0Var) : null);
    }

    public static final void r(@NotNull Paint paint, int i10) {
        paint.setFilterBitmap(!l1.h(i10, l1.f37840b.d()));
    }

    public static final void s(@NotNull Paint paint, @Nullable l2 l2Var) {
        o oVar = (o) l2Var;
        paint.setPathEffect(oVar != null ? oVar.a() : null);
    }

    public static final void t(@NotNull Paint paint, @Nullable Shader shader) {
        paint.setShader(shader);
    }

    public static final void u(@NotNull Paint paint, int i10) {
        Paint.Cap cap;
        u3.a aVar = u3.f38256b;
        if (u3.g(i10, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (u3.g(i10, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = u3.g(i10, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void v(@NotNull Paint paint, int i10) {
        Paint.Join join;
        v3.a aVar = v3.f38275b;
        if (v3.g(i10, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (v3.g(i10, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = v3.g(i10, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void w(@NotNull Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void x(@NotNull Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void y(@NotNull Paint paint, int i10) {
        paint.setStyle(j2.f(i10, j2.f37801b.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
