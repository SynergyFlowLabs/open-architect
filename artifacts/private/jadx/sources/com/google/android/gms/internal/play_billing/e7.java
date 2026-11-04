package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.a7;
import com.google.android.gms.internal.play_billing.e7;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e7<MessageType extends e7<MessageType, BuilderType>, BuilderType extends a7<MessageType, BuilderType>> extends n5<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected g9 zzc = g9.c();

    protected static final boolean B(e7 e7Var, boolean z10) {
        byte bByteValue = ((Byte) e7Var.m(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = p8.a().b(e7Var.getClass()).d(e7Var);
        if (z10) {
            e7Var.m(2, true != zD ? null : e7Var, null);
        }
        return zD;
    }

    private static e7 k(e7 e7Var, byte[] bArr, int i10, int i11, p6 p6Var) throws l7 {
        if (i11 == 0) {
            return e7Var;
        }
        e7 e7VarR = e7Var.r();
        try {
            s8 s8VarB = p8.a().b(e7VarR.getClass());
            s8VarB.h(e7VarR, bArr, 0, i11, new r5(p6Var));
            s8VarB.b(e7VarR);
            return e7VarR;
        } catch (e9 e10) {
            throw e10.a();
        } catch (l7 e11) {
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof l7) {
                throw ((l7) e12.getCause());
            }
            throw new l7(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new l7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final int l(s8 s8Var) {
        return p8.a().b(getClass()).c(this);
    }

    static e7 q(Class cls) {
        Map map = zzb;
        e7 e7Var = (e7) map.get(cls);
        if (e7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e7Var = (e7) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (e7Var != null) {
            return e7Var;
        }
        e7 e7Var2 = (e7) ((e7) m9.j(cls)).m(6, null, null);
        if (e7Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, e7Var2);
        return e7Var2;
    }

    protected static e7 s(e7 e7Var, byte[] bArr, p6 p6Var) throws l7 {
        e7 e7VarK = k(e7Var, bArr, 0, bArr.length, p6Var);
        if (e7VarK == null || B(e7VarK, true)) {
            return e7VarK;
        }
        throw new e9(e7VarK).a();
    }

    protected static h7 t() {
        return f7.i();
    }

    protected static i7 u() {
        return q8.i();
    }

    static Object v(Method method, Object obj, Object... objArr) {
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

    protected static Object w(h8 h8Var, String str, Object[] objArr) {
        return new r8(h8Var, str, objArr);
    }

    protected static void z(Class cls, e7 e7Var) {
        e7Var.y();
        zzb.put(cls, e7Var);
    }

    final void A(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.play_billing.h8
    public final void a(k6 k6Var) throws IOException {
        p8.a().b(getClass()).e(this, l6.L(k6Var));
    }

    @Override // com.google.android.gms.internal.play_billing.i8
    public final boolean b() {
        return B(this, true);
    }

    @Override // com.google.android.gms.internal.play_billing.h8
    public final int d() {
        if (j()) {
            int iL = l(null);
            if (iL >= 0) {
                return iL;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iL);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iL2 = l(null);
        if (iL2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iL2;
            return iL2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iL2);
    }

    @Override // com.google.android.gms.internal.play_billing.h8
    public final /* synthetic */ g8 e() {
        return (a7) m(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p8.a().b(getClass()).g(this, (e7) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.i8
    public final /* synthetic */ h8 f() {
        return (e7) m(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.n5
    final int g(s8 s8Var) {
        if (j()) {
            int iC = s8Var.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iC);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iC2 = s8Var.c(this);
        if (iC2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iC2);
    }

    public final int hashCode() {
        if (j()) {
            return n();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iN = n();
        this.zza = iN;
        return iN;
    }

    final boolean j() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object m(int i10, Object obj, Object obj2);

    final int n() {
        return p8.a().b(getClass()).a(this);
    }

    protected final a7 o() {
        return (a7) m(5, null, null);
    }

    public final a7 p() {
        a7 a7Var = (a7) m(5, null, null);
        a7Var.l(this);
        return a7Var;
    }

    final e7 r() {
        return (e7) m(4, null, null);
    }

    public final String toString() {
        return j8.a(this, super.toString());
    }

    protected final void x() {
        p8.a().b(getClass()).b(this);
        y();
    }

    final void y() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
