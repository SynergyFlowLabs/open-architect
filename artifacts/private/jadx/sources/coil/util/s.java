package coil.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.m1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDrawableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,96:1\n1#2:97\n219#3:98\n223#3:99\n219#3:105\n223#3:106\n95#4:100\n38#5:101\n49#5:102\n60#5:103\n71#5:104\n*S KotlinDebug\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n*L\n54#1:98\n55#1:99\n89#1:105\n90#1:106\n61#1:100\n63#1:101\n63#1:102\n63#1:103\n63#1:104\n*E\n"})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f87858a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f87859b = 512;

    private s() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.h(config);
    }

    private final boolean c(boolean z10, Bitmap bitmap, coil.size.i iVar, coil.size.h hVar) {
        if (z10) {
            return true;
        }
        return coil.decode.g.c(bitmap.getWidth(), bitmap.getHeight(), coil.size.b.f(iVar) ? bitmap.getWidth() : l.J(iVar.f(), hVar), coil.size.b.f(iVar) ? bitmap.getHeight() : l.J(iVar.e(), hVar), hVar) == 1.0d;
    }

    @m1
    @NotNull
    public final Bitmap a(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull coil.size.i iVar, @NotNull coil.size.h hVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, iVar, hVar)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iX = l.x(drawableMutate);
        if (iX <= 0) {
            iX = 512;
        }
        int iO = l.o(drawableMutate);
        int i10 = iO > 0 ? iO : 512;
        double dC = coil.decode.g.c(iX, i10, coil.size.b.f(iVar) ? iX : l.J(iVar.f(), hVar), coil.size.b.f(iVar) ? i10 : l.J(iVar.e(), hVar), hVar);
        int iK0 = kotlin.math.b.K0(((double) iX) * dC);
        int iK1 = kotlin.math.b.K0(dC * ((double) i10));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iK0, iK1, a.h(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iK0, iK1);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }
}
