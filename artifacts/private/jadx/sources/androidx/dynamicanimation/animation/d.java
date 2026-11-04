package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f51022a;

    static class a extends d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FloatProperty f51023b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, FloatProperty floatProperty) {
            super(str);
            this.f51023b = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(T t10) {
            return ((Float) this.f51023b.get(t10)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(T t10, float f10) {
            this.f51023b.setValue(t10, f10);
        }
    }

    public d(String str) {
        this.f51022a = str;
    }

    @w0(24)
    public static <T> d<T> a(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t10);

    public abstract void c(T t10, float f10);
}
