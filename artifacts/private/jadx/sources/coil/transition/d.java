package coil.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends coil.target.c {

    public static final class a {
        @l0
        @Deprecated
        public static void a(@NotNull d dVar, @Nullable Drawable drawable) {
            d.super.onError(drawable);
        }

        @l0
        @Deprecated
        public static void b(@NotNull d dVar, @Nullable Drawable drawable) {
            d.super.onStart(drawable);
        }

        @l0
        @Deprecated
        public static void c(@NotNull d dVar, @NotNull Drawable drawable) {
            d.super.onSuccess(drawable);
        }
    }

    @Nullable
    Drawable f();

    @NotNull
    View getView();
}
