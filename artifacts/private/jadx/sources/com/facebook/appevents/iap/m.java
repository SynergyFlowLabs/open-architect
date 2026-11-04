package com.facebook.appevents.iap;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f98989a = new m();

    private m() {
    }

    @n
    @Nullable
    public static final Class<?> a(@NotNull String className) {
        if (com.facebook.internal.instrument.crashshield.b.e(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, m.class);
            return null;
        }
    }

    @n
    @Nullable
    public static final Class<?> b(@NotNull Context context, @NotNull String className) {
        if (com.facebook.internal.instrument.crashshield.b.e(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, m.class);
            return null;
        }
    }

    @n
    @Nullable
    public static final Method c(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... args) {
        if (com.facebook.internal.instrument.crashshield.b.e(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, m.class);
            return null;
        }
    }

    @n
    @Nullable
    public static final Method d(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... args) {
        if (com.facebook.internal.instrument.crashshield.b.e(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, m.class);
            return null;
        }
    }

    @n
    @Nullable
    public static final Object e(@NotNull Class<?> clazz, @NotNull Method method, @Nullable Object obj, @NotNull Object... args) {
        if (com.facebook.internal.instrument.crashshield.b.e(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, m.class);
            return null;
        }
    }
}
