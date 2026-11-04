package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
@s9.b
public final class f<T> extends c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @s9.b
    private final T f130065b;

    private f(T t10) {
        this.f130065b = t10;
    }

    public static <T> T s(c cVar, Class<T> cls) {
        if (cVar == null) {
            return null;
        }
        if (cVar instanceof f) {
            return ((f) cVar).f130065b;
        }
        IBinder iBinderAsBinder = cVar.asBinder();
        Field field = null;
        for (Field field2 : iBinderAsBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
        }
        if (field == null) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        field.setAccessible(true);
        try {
            Object obj = field.get(iBinderAsBinder);
            if (obj == null) {
                return null;
            }
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
            throw new IllegalArgumentException("remoteBinder is the wrong class.");
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("remoteBinder is the wrong class.", e11);
        } catch (NullPointerException e12) {
            throw new IllegalArgumentException("Binder object is null.", e12);
        }
    }

    public static <T> c u(T t10) {
        return new f(t10);
    }
}
