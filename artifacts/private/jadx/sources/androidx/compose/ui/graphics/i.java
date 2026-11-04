package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidImageBitmap.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidImageBitmap.android.kt\nandroidx/compose/ui/graphics/AndroidImageBitmap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
public final class i implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bitmap f37795b;

    public i(@NotNull Bitmap bitmap) {
        this.f37795b = bitmap;
    }

    @Override // androidx.compose.ui.graphics.t1
    public void a(@NotNull int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        Bitmap bitmapB = j.b(this);
        boolean z10 = false;
        if (bitmapB.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapB = bitmapB.copy(Bitmap.Config.ARGB_8888, false);
            z10 = true;
        }
        Bitmap bitmap = bitmapB;
        bitmap.getPixels(iArr, i14, i15, i10, i11, i12, i13);
        if (z10) {
            bitmap.recycle();
        }
    }

    @Override // androidx.compose.ui.graphics.t1
    public void b() {
        this.f37795b.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.t1
    public boolean c() {
        return this.f37795b.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.t1
    public int d() {
        Bitmap.Config config = this.f37795b.getConfig();
        Intrinsics.checkNotNull(config);
        return j.f(config);
    }

    @Override // androidx.compose.ui.graphics.t1
    @NotNull
    public androidx.compose.ui.graphics.colorspace.c f() {
        b0 b0Var = b0.f37528a;
        return b0.a(this.f37795b);
    }

    @NotNull
    public final Bitmap g() {
        return this.f37795b;
    }

    @Override // androidx.compose.ui.graphics.t1
    public int getHeight() {
        return this.f37795b.getHeight();
    }

    @Override // androidx.compose.ui.graphics.t1
    public int getWidth() {
        return this.f37795b.getWidth();
    }
}
