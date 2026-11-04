package q4;

import android.graphics.Bitmap;
import coil.size.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    @NotNull
    String getCacheKey();

    @Nullable
    Object transform(@NotNull Bitmap bitmap, @NotNull i iVar, @NotNull kotlin.coroutines.d<? super Bitmap> dVar);
}
