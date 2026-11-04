package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48799a = "LayoutInflaterCompatHC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f48800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f48801c;

    static class a implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0 f48802a;

        a(i0 i0Var) {
            this.f48802a = i0Var;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f48802a.onCreateView(null, str, context, attributeSet);
        }

        @NonNull
        public String toString() {
            return getClass().getName() + "{" + this.f48802a + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f48802a.onCreateView(view, str, context, attributeSet);
        }
    }

    private h0() {
    }

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f48801c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f48800b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f48801c = true;
        }
        Field field = f48800b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                Objects.toString(layoutInflater);
            }
        }
    }

    @Deprecated
    public static i0 b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f48802a;
        }
        return null;
    }

    @Deprecated
    public static void c(@NonNull LayoutInflater layoutInflater, @NonNull i0 i0Var) {
        layoutInflater.setFactory2(new a(i0Var));
    }

    public static void d(@NonNull LayoutInflater layoutInflater, @NonNull LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
