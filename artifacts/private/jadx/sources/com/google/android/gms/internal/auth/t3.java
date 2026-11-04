package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.r3;
import com.google.android.gms.internal.auth.t3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t3<MessageType extends t3<MessageType, BuilderType>, BuilderType extends r3<MessageType, BuilderType>> extends n2<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected b6 zzc = b6.a();

    static t3 b(Class cls) {
        Map map = zzb;
        t3 t3Var = (t3) map.get(cls);
        if (t3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t3Var = (t3) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t3Var != null) {
            return t3Var;
        }
        t3 t3Var2 = (t3) ((t3) k6.e(cls)).o(6, null, null);
        if (t3Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, t3Var2);
        return t3Var2;
    }

    protected static t3 d(t3 t3Var, byte[] bArr) throws a4 {
        byte bByteValue;
        t3 t3VarP = p(t3Var, bArr, 0, bArr.length, j3.f107670c);
        if (t3VarP != null && (bByteValue = ((Byte) t3VarP.o(1, null, null)).byteValue()) != 1) {
            if (bByteValue != 0) {
                boolean zG = f5.a().b(t3VarP.getClass()).g(t3VarP);
                t3VarP.o(2, true != zG ? null : t3VarP, null);
                if (zG) {
                }
            }
            a4 a4VarA = new y5(t3VarP).a();
            a4VarA.e(t3VarP);
            throw a4VarA;
        }
        return t3VarP;
    }

    protected static x3 e() {
        return g5.i();
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object g(w4 w4Var, String str, Object[] objArr) {
        return new h5(w4Var, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void k(Class cls, t3 t3Var) {
        t3Var.i();
        zzb.put(cls, t3Var);
    }

    private static t3 p(t3 t3Var, byte[] bArr, int i10, int i11, j3 j3Var) throws a4 {
        t3 t3VarC = t3Var.c();
        try {
            i5 i5VarB = f5.a().b(t3VarC.getClass());
            i5VarB.e(t3VarC, bArr, 0, i11, new q2(j3Var));
            i5VarB.b(t3VarC);
            return t3VarC;
        } catch (a4 e10) {
            e10.e(t3VarC);
            throw e10;
        } catch (y5 e11) {
            a4 a4VarA = e11.a();
            a4VarA.e(t3VarC);
            throw a4VarA;
        } catch (IOException e12) {
            if (e12.getCause() instanceof a4) {
                throw ((a4) e12.getCause());
            }
            a4 a4Var = new a4(e12);
            a4Var.e(t3VarC);
            throw a4Var;
        } catch (IndexOutOfBoundsException unused) {
            a4 a4VarF = a4.f();
            a4VarF.e(t3VarC);
            throw a4VarF;
        }
    }

    final int a() {
        return f5.a().b(getClass()).c(this);
    }

    final t3 c() {
        return (t3) o(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return f5.a().b(getClass()).d(this, (t3) obj);
        }
        return false;
    }

    protected final void h() {
        f5.a().b(getClass()).b(this);
        i();
    }

    public final int hashCode() {
        if (n()) {
            return a();
        }
        int iA = this.zza;
        if (iA == 0) {
            iA = a();
            this.zza = iA;
        }
        return iA;
    }

    final void i() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.auth.x4
    public final /* synthetic */ w4 j() {
        return (t3) o(6, null, null);
    }

    final void l(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object o(int i10, Object obj, Object obj2);

    public final String toString() {
        return y4.a(this, super.toString());
    }
}
