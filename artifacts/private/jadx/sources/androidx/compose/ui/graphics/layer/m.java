package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.ui.graphics.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap b(Image image) {
        Image.Plane[] planes = image.getPlanes();
        Intrinsics.checkNotNull(planes);
        Image.Plane plane = planes[0];
        int width = image.getWidth() * image.getHeight();
        int[] iArr = new int[width];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i10 = 0; i10 < width; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = s0.t(s0.c(i11 & 255, (i11 >> 8) & 255, (i11 >> 16) & 255, (i11 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
