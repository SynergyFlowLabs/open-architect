package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"ClassVerificationFailure"})
public final class e {
    @w0(26)
    @NotNull
    public static final Icon a(@NotNull Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    @w0(26)
    @NotNull
    public static final Icon b(@NotNull Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @w0(26)
    @NotNull
    public static final Icon c(@NotNull Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @w0(26)
    @NotNull
    public static final Icon d(@NotNull byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
