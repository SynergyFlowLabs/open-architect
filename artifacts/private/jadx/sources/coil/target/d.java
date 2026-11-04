package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface d<T extends View> extends c {

    public static final class a {
        @l0
        @Deprecated
        public static <T extends View> void a(@NotNull d<T> dVar, @Nullable Drawable drawable) {
            d.super.onError(drawable);
        }

        @l0
        @Deprecated
        public static <T extends View> void b(@NotNull d<T> dVar, @Nullable Drawable drawable) {
            d.super.onStart(drawable);
        }

        @l0
        @Deprecated
        public static <T extends View> void c(@NotNull d<T> dVar, @NotNull Drawable drawable) {
            d.super.onSuccess(drawable);
        }
    }

    @NotNull
    T getView();
}
