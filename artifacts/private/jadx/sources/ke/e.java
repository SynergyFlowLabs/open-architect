package ke;

import android.graphics.Bitmap;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface e {

    public static final class a extends RuntimeException {
        public a(@Nullable String str) {
            super(str);
        }
    }

    @Nullable
    Object a(@NotNull Uri uri, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws a;

    @Nullable
    Object b(@NotNull Bitmap bitmap, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws a;
}
