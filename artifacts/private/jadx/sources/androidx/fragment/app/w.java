package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.collection.h3;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h3<ClassLoader, h3<String, Class<?>>> f52019a = new h3<>();

    static boolean b(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    private static Class<?> c(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        h3<ClassLoader, h3<String, Class<?>>> h3Var = f52019a;
        h3<String, Class<?>> h3Var2 = h3Var.get(classLoader);
        if (h3Var2 == null) {
            h3Var2 = new h3<>();
            h3Var.put(classLoader, h3Var2);
        }
        Class<?> cls = h3Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        h3Var2.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends Fragment> d(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    @NonNull
    public Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return d(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }
}
