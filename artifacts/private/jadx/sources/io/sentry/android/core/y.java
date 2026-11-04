package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class y implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f304617a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f304618a;

        static {
            int[] iArr = new int[y7.values().length];
            f304618a = iArr;
            try {
                iArr[y7.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f304618a[y7.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f304618a[y7.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f304618a[y7.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f304618a[y7.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public y() {
        this("Sentry");
    }

    private int e(@NotNull y7 y7Var) {
        int i10 = a.f304618a[y7Var.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 != 2) {
            return i10 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull y7 y7Var, @NotNull String str, @Nullable Throwable th2) {
        if (a.f304618a[y7Var.ordinal()] != 4) {
            return;
        }
        Log.wtf(this.f304617a, str, th2);
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull y7 y7Var, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            a(y7Var, String.format(str, objArr), th2);
            return;
        }
        a(y7Var, str, th2);
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull y7 y7Var, @NotNull String str, @Nullable Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(y7Var), this.f304617a, str);
        } else {
            Log.println(e(y7Var), this.f304617a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable y7 y7Var) {
        return true;
    }

    public y(@NotNull String str) {
        this.f304617a = str;
    }
}
