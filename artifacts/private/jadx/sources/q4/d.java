package q4;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.t0;
import coil.decode.g;
import coil.size.h;
import coil.size.i;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRoundedCornersTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,132:1\n95#2:133\n43#2,2:134\n45#2:137\n1#3:136\n57#4:138\n57#4:139\n*S KotlinDebug\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n*L\n58#1:133\n59#1:134,2\n59#1:137\n106#1:138\n107#1:139\n*E\n"})
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f350247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f350248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f350249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f350250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f350251e;

    public d() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    private final Pair<Integer, Integer> a(Bitmap bitmap, i iVar) {
        if (coil.size.b.f(iVar)) {
            return TuplesKt.to(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        coil.size.c cVarA = iVar.a();
        coil.size.c cVarB = iVar.b();
        if ((cVarA instanceof coil.size.c.a) && (cVarB instanceof coil.size.c.a)) {
            return TuplesKt.to(Integer.valueOf(((coil.size.c.a) cVarA).f87767a), Integer.valueOf(((coil.size.c.a) cVarB).f87767a));
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        coil.size.c cVarF = iVar.f();
        int i10 = cVarF instanceof coil.size.c.a ? ((coil.size.c.a) cVarF).f87767a : Integer.MIN_VALUE;
        coil.size.c cVarE = iVar.e();
        double dC = g.c(width, height, i10, cVarE instanceof coil.size.c.a ? ((coil.size.c.a) cVarE).f87767a : Integer.MIN_VALUE, h.FILL);
        return TuplesKt.to(Integer.valueOf(kotlin.math.b.K0(((double) bitmap.getWidth()) * dC)), Integer.valueOf(kotlin.math.b.K0(dC * ((double) bitmap.getHeight()))));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f350247a == dVar.f350247a && this.f350248b == dVar.f350248b && this.f350249c == dVar.f350249c && this.f350250d == dVar.f350250d;
    }

    @Override // q4.e
    @NotNull
    public String getCacheKey() {
        return this.f350251e;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f350247a) * 31) + Float.hashCode(this.f350248b)) * 31) + Float.hashCode(this.f350249c)) * 31) + Float.hashCode(this.f350250d);
    }

    @Override // q4.e
    @Nullable
    public Object transform(@NotNull Bitmap bitmap, @NotNull i iVar, @NotNull kotlin.coroutines.d<? super Bitmap> dVar) {
        Paint paint = new Paint(3);
        Pair<Integer, Integer> pairA = a(bitmap, iVar);
        int iIntValue = pairA.component1().intValue();
        int iIntValue2 = pairA.component2().intValue();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, coil.util.a.d(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fC = (float) g.c(bitmap.getWidth(), bitmap.getHeight(), iIntValue, iIntValue2, h.FILL);
        float f10 = 2;
        matrix.setTranslate((iIntValue - (bitmap.getWidth() * fC)) / f10, (iIntValue2 - (bitmap.getHeight() * fC)) / f10);
        matrix.preScale(fC, fC);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f11 = this.f350247a;
        float f12 = this.f350248b;
        float f13 = this.f350250d;
        float f14 = this.f350249c;
        float[] fArr = {f11, f11, f12, f12, f13, f13, f14, f14};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public d(@t0 float f10, @t0 float f11, @t0 float f12, @t0 float f13) {
        this.f350247a = f10;
        this.f350248b = f11;
        this.f350249c = f12;
        this.f350250d = f13;
        if (f10 < 0.0f || f11 < 0.0f || f12 < 0.0f || f13 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.f350251e = d.class.getName() + l.f335457d + f10 + AbstractJsonLexerKt.COMMA + f11 + AbstractJsonLexerKt.COMMA + f12 + AbstractJsonLexerKt.COMMA + f13;
    }

    public /* synthetic */ d(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }

    public d(@t0 float f10) {
        this(f10, f10, f10, f10);
    }
}
