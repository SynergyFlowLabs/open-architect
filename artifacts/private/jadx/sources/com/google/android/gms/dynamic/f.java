package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.y;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
@y
@g6.a
public final class f<T> extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f107020a;

    private f(Object obj) {
        this.f107020a = obj;
    }

    @NonNull
    @g6.a
    public static <T> T n(@NonNull d dVar) {
        if (dVar instanceof f) {
            return (T) ((f) dVar).f107020a;
        }
        IBinder iBinderAsBinder = dVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        w.r(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    @NonNull
    @g6.a
    public static <T> d p(@NonNull T t10) {
        return new f(t10);
    }
}
