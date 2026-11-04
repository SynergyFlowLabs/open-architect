package androidx.core.os;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    @w0(29)
    static class a {
        private a() {
        }

        static <T extends Parcelable> List<T> a(@NonNull Parcel parcel, @NonNull List<T> list, @androidx.annotation.p0 ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }

        static void b(@NonNull Parcel parcel, boolean z10) {
            parcel.writeBoolean(z10);
        }
    }

    @w0(30)
    static class b {
        private b() {
        }

        static Parcelable.Creator<?> a(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    @w0(33)
    static class c {
        private c() {
        }

        static <T> T[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        static <V, K> HashMap<K, V> c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        static <T> void d(@NonNull Parcel parcel, @NonNull List<? super T> list, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        static <K, V> void e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        static <T extends Parcelable> T f(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        static <T> T[] g(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        static <T> Parcelable.Creator<T> h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        static <T> List<T> i(@NonNull Parcel parcel, @NonNull List<T> list, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        static <T extends Serializable> T j(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        static <T> SparseArray<T> k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    private x() {
    }

    @e.a({"ArrayReturn", "NullableCollection"})
    @androidx.annotation.p0
    public static <T> Object[] a(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.a(parcel, classLoader, cls) : parcel.readArray(classLoader);
    }

    @e.a({"ConcreteCollection", "NullableCollection"})
    @androidx.annotation.p0
    public static <T> ArrayList<T> b(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.b(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    public static boolean c(@NonNull Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @e.a({"ConcreteCollection", "NullableCollection"})
    @androidx.annotation.p0
    public static <K, V> HashMap<K, V> d(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<? extends K> cls, @NonNull Class<? extends V> cls2) {
        return Build.VERSION.SDK_INT >= 34 ? c.c(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    public static <T> void e(@NonNull Parcel parcel, @NonNull List<? super T> list, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <K, V> void f(@NonNull Parcel parcel, @NonNull Map<? super K, ? super V> map, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<K> cls, @NonNull Class<V> cls2) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @androidx.annotation.p0
    public static <T extends Parcelable> T g(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) c.f(parcel, classLoader, cls);
        }
        T t10 = (T) parcel.readParcelable(classLoader);
        if (t10 == null || cls.isInstance(t10)) {
            return t10;
        }
        throw new BadParcelableException("Parcelable " + t10.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e.a({"ArrayReturn", "NullableCollection"})
    @androidx.annotation.p0
    @Deprecated
    public static <T> T[] h(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T[]) c.g(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i10 = 0; i10 < tArr.length; i10++) {
            try {
                tArr2[i10] = cls.cast(tArr[i10]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException("Parcelable at index " + i10 + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
            }
        }
        return tArr2;
    }

    @e.a({"ArrayReturn", "NullableCollection"})
    @androidx.annotation.p0
    public static <T> Parcelable[] i(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) c.g(parcel, classLoader, cls) : parcel.readParcelableArray(classLoader);
    }

    @w0(30)
    @androidx.annotation.p0
    public static <T> Parcelable.Creator<T> j(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.h(parcel, classLoader, cls) : (Parcelable.Creator<T>) b.a(parcel, classLoader);
    }

    @NonNull
    @w0(api = 29)
    public static <T> List<T> k(@NonNull Parcel parcel, @NonNull List<T> list, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.i(parcel, list, classLoader, cls) : a.a(parcel, list, classLoader);
    }

    @androidx.annotation.p0
    public static <T extends Serializable> T l(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) c.j(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @androidx.annotation.p0
    public static <T> SparseArray<T> m(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.k(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    public static void n(@NonNull Parcel parcel, boolean z10) {
        a.b(parcel, z10);
    }
}
