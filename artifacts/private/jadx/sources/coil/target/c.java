package coil.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a {
        @l0
        @Deprecated
        public static void a(@NotNull c cVar, @Nullable Drawable drawable) {
            c.super.onError(drawable);
        }

        @l0
        @Deprecated
        public static void b(@NotNull c cVar, @Nullable Drawable drawable) {
            c.super.onStart(drawable);
        }

        @l0
        @Deprecated
        public static void c(@NotNull c cVar, @NotNull Drawable drawable) {
            c.super.onSuccess(drawable);
        }
    }

    @l0
    default void onError(@Nullable Drawable drawable) {
    }

    @l0
    default void onStart(@Nullable Drawable drawable) {
    }

    @l0
    default void onSuccess(@NotNull Drawable drawable) {
    }
}
