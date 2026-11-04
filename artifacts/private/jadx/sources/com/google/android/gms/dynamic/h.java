package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f107021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f107022b;

    @g6.a
    public static class a extends Exception {
        @g6.a
        public a(@NonNull String str) {
            super(str);
        }

        @g6.a
        public a(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @g6.a
    protected h(@NonNull String str) {
        this.f107021a = str;
    }

    @NonNull
    @g6.a
    protected abstract T a(@NonNull IBinder iBinder);

    @NonNull
    @g6.a
    protected final T b(@NonNull Context context) throws a {
        if (this.f107022b == null) {
            w.r(context);
            Context contextI = com.google.android.gms.common.k.i(context);
            if (contextI == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f107022b = a((IBinder) contextI.getClassLoader().loadClass(this.f107021a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new a("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new a("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new a("Could not instantiate creator.", e12);
            }
        }
        return (T) this.f107022b;
    }
}
