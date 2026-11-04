package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes3.dex */
class v {

    @androidx.annotation.w0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static <T, V> ObjectAnimator a(T t10, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
        }
    }

    private v() {
    }

    static <T> ObjectAnimator a(T t10, Property<T, PointF> property, Path path) {
        return a.a(t10, property, path);
    }
}
