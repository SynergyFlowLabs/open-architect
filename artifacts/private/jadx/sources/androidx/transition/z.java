package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes3.dex */
class z {

    @androidx.annotation.w0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static <V> PropertyValuesHolder a(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }

    private z() {
    }

    static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return a.a(property, path);
    }
}
