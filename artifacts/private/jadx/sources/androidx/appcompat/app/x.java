package androidx.appcompat.app;

import android.content.res.Resources;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f10387a = "ResourcesFlusher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f10388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Class<?> f10390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Field f10392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f10393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Field f10394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f10395i;

    private x() {
    }

    static void a(@NonNull Resources resources) {
    }

    @w0(21)
    private static void b(@NonNull Resources resources) {
        Map map;
        if (!f10389c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f10388b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10389c = true;
        }
        Field field = f10388b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @w0(23)
    private static void c(@NonNull Resources resources) {
        Object obj;
        if (!f10389c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f10388b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10389c = true;
        }
        Field field = f10388b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    @w0(24)
    private static void d(@NonNull Resources resources) {
        Object obj;
        if (!f10395i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f10394h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10395i = true;
        }
        Field field = f10394h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f10389c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f10388b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f10389c = true;
        }
        Field field2 = f10388b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f10391e) {
            try {
                f10390d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f10391e = true;
        }
        Class<?> cls = f10390d;
        if (cls == null) {
            return;
        }
        if (!f10393g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f10392f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f10393g = true;
        }
        Field field = f10392f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
