package com.facebook.internal.instrument.crashshield;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.l1;
import com.facebook.g0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f99890a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Object> f99891b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f99892c;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f99893a;

        a(Throwable th2) {
            this.f99893a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.e(this)) {
                return;
            }
            try {
                throw new RuntimeException(this.f99893a);
            } catch (Throwable th2) {
                b.c(th2, this);
            }
        }
    }

    private b() {
    }

    @n
    @l1
    public static final void a() {
        f99892c = false;
    }

    @n
    public static final void b() {
        f99892c = true;
    }

    @n
    public static final void c(@Nullable Throwable th2, @NotNull Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        if (f99892c) {
            f99891b.add(o10);
            g0 g0Var = g0.f99617a;
            if (g0.s()) {
                o5.b bVar = o5.b.f333541a;
                o5.b.c(th2);
                o5.c.a aVar = o5.c.a.f333560a;
                o5.c.a.b(th2, o5.c.EnumC2344c.CrashShield).g();
            }
            i(th2);
        }
    }

    @n
    @l1
    public static final boolean d() {
        return false;
    }

    @n
    public static final boolean e(@NotNull Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        return f99891b.contains(o10);
    }

    @n
    public static final void f(@Nullable Object obj) {
    }

    @n
    public static final void g() {
        h();
    }

    @n
    public static final void h() {
        f99891b.clear();
    }

    @n
    @l1
    public static final void i(@Nullable Throwable th2) {
        if (d()) {
            new Handler(Looper.getMainLooper()).post(new a(th2));
        }
    }
}
