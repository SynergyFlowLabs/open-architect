package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    @w0(33)
    static class a {
        private a() {
        }

        static <T> T a(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        static <T> T[] b(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        static <T> ArrayList<T> c(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        static <T extends Serializable> T d(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        static <T> SparseArray<T> e(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    private d() {
    }

    @v0(expression = "bundle.getBinder(key)")
    @androidx.annotation.p0
    @Deprecated
    public static IBinder a(@NonNull Bundle bundle, @androidx.annotation.p0 String str) {
        return bundle.getBinder(str);
    }

    @androidx.annotation.p0
    public static <T> T b(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t10 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @e.a({"ArrayReturn", "NullableCollection"})
    @androidx.annotation.p0
    public static Parcelable[] c(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) a.b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    @e.a({"ConcreteCollection", "NullableCollection"})
    @androidx.annotation.p0
    public static <T> ArrayList<T> d(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    @androidx.annotation.p0
    public static <T extends Serializable> T e(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.d(bundle, str, cls);
        }
        T t10 = (T) bundle.getSerializable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @androidx.annotation.p0
    public static <T> SparseArray<T> f(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.e(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }

    @v0(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void g(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @androidx.annotation.p0 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
