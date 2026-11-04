package com.planner5d.library.services.utility;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nReflectionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionUtils.kt\ncom/planner5d/library/services/utility/ReflectionUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q2 f229711a = new q2();

    private q2() {
    }

    @oj.n
    @Nullable
    public static final Object a(@NotNull Object instance, @NotNull Class<?> objectClass, @NotNull String method) throws Throwable {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(objectClass, "objectClass");
        Intrinsics.checkNotNullParameter(method, "method");
        boolean z10 = true;
        try {
            Method declaredMethod = objectClass.getDeclaredMethod(method, null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(instance, null);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @oj.n
    @Nullable
    public static final Object b(@NotNull Object instance, @NotNull Class<?> objectClass, @NotNull String method, @NotNull Class<?> argType, @NotNull Object arg) throws Throwable {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(objectClass, "objectClass");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argType, "argType");
        Intrinsics.checkNotNullParameter(arg, "arg");
        try {
            Method declaredMethod = objectClass.getDeclaredMethod(method, argType);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(instance, arg);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @oj.n
    @Nullable
    public static final <T> T c(@Nullable Object obj, @NotNull Class<?> objectClass, @NotNull String field) throws Throwable {
        Intrinsics.checkNotNullParameter(objectClass, "objectClass");
        Intrinsics.checkNotNullParameter(field, "field");
        try {
            Field declaredField = objectClass.getDeclaredField(field);
            declaredField.setAccessible(true);
            return (T) declaredField.get(obj);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @oj.n
    @Nullable
    public static final <T> T d(@Nullable Object obj, @NotNull Class<?> objectClass, @NotNull String field) {
        Intrinsics.checkNotNullParameter(objectClass, "objectClass");
        Intrinsics.checkNotNullParameter(field, "field");
        try {
            return (T) c(obj, objectClass, field);
        } catch (Throwable unused) {
            return null;
        }
    }

    @oj.n
    public static final void e(@Nullable Object obj, @NotNull Class<?> objectClass, @NotNull String field, @Nullable Object obj2) throws Throwable {
        Intrinsics.checkNotNullParameter(objectClass, "objectClass");
        Intrinsics.checkNotNullParameter(field, "field");
        try {
            Field declaredField = objectClass.getDeclaredField(field);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @oj.n
    public static final void f(@Nullable Object obj, @NotNull Class<?> objectClass, @NotNull String field, @Nullable Object obj2) {
        Intrinsics.checkNotNullParameter(objectClass, "objectClass");
        Intrinsics.checkNotNullParameter(field, "field");
        try {
            e(obj, objectClass, field, obj2);
        } catch (Throwable unused) {
        }
    }
}
