package io.sentry;

import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<T> f303891a;

    private a4(@NotNull Class<T> cls) {
        this.f303891a = cls;
    }

    @NotNull
    public static <T> a4<T> a(@NotNull Class<T> cls) {
        return new a4<>(cls);
    }

    @NotNull
    public T b() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.f303891a.getDeclaredConstructor(null).newInstance(null);
    }
}
