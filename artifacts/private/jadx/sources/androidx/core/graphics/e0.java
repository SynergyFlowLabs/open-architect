package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class e0 extends d0 {
    private static final String B = "createFromFamiliesWithDefault";
    private static final int C = -1;
    private static final String D = "sans-serif";

    @Override // androidx.core.graphics.d0
    protected Method C(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(B, cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.d0, androidx.core.graphics.b0, androidx.core.graphics.g0
    @NonNull
    Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // androidx.core.graphics.d0
    protected Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f47747m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f47753s.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
