package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class l3 extends c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Unsafe f109189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f109190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f109191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f109192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f109193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f109194f;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            f109191c = unsafe.objectFieldOffset(n3.class.getDeclaredField("c"));
            f109190b = unsafe.objectFieldOffset(n3.class.getDeclaredField("b"));
            f109192d = unsafe.objectFieldOffset(n3.class.getDeclaredField(androidx.media3.exoplayer.upstream.h.f65998l));
            f109193e = unsafe.objectFieldOffset(m3.class.getDeclaredField(androidx.media3.exoplayer.upstream.h.f65998l));
            f109194f = unsafe.objectFieldOffset(m3.class.getDeclaredField("b"));
            f109189a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    private l3() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final f3 a(n3 n3Var, f3 f3Var) {
        f3 f3Var2;
        do {
            f3Var2 = n3Var.f109234b;
            if (f3Var == f3Var2) {
                break;
            }
        } while (!e(n3Var, f3Var2, f3Var));
        return f3Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final m3 b(n3 n3Var, m3 m3Var) {
        m3 m3Var2;
        do {
            m3Var2 = n3Var.f109235c;
            if (m3Var == m3Var2) {
                break;
            }
        } while (!g(n3Var, m3Var2, m3Var));
        return m3Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final void c(m3 m3Var, @fj.a m3 m3Var2) {
        f109189a.putObject(m3Var, f109194f, m3Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final void d(m3 m3Var, Thread thread) {
        f109189a.putObject(m3Var, f109193e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean e(n3 n3Var, @fj.a f3 f3Var, f3 f3Var2) {
        return r3.a(f109189a, n3Var, f109190b, f3Var, f3Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean f(n3 n3Var, @fj.a Object obj, Object obj2) {
        return r3.a(f109189a, n3Var, f109192d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean g(n3 n3Var, @fj.a m3 m3Var, @fj.a m3 m3Var2) {
        return r3.a(f109189a, n3Var, f109191c, m3Var, m3Var2);
    }

    /* synthetic */ l3(s3 s3Var) {
        super(null);
    }
}
