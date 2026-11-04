package io.sentry.android.core.util;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private volatile T f304558a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2205a<T> f304559b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC2205a<T> {
        @Nullable
        T a(@NotNull Context context);
    }

    public a(@NotNull InterfaceC2205a<T> interfaceC2205a) {
        this.f304559b = interfaceC2205a;
    }

    @Nullable
    public T a(@NotNull Context context) {
        if (this.f304558a == null) {
            synchronized (this) {
                try {
                    if (this.f304558a == null) {
                        this.f304558a = this.f304559b.a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f304558a;
    }

    public void b() {
        synchronized (this) {
            try {
                this.f304558a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(@Nullable T t10) {
        synchronized (this) {
            try {
                this.f304558a = t10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
