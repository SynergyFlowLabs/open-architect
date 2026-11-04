package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.qb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qb<MessageType extends qb<MessageType, BuilderType>, BuilderType extends mb<MessageType, BuilderType>> extends ba<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected wd zzc = wd.a();

    protected static zb A(zb zbVar) {
        int size = zbVar.size();
        return zbVar.f(size + size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(qb qbVar, boolean z10) {
        byte bByteValue = ((Byte) qbVar.D(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = gd.a().b(qbVar.getClass()).d(qbVar);
        if (z10) {
            qbVar.D(2, true != zD ? null : qbVar, null);
        }
        return zD;
    }

    private final int j(jd jdVar) {
        return gd.a().b(getClass()).b(this);
    }

    static qb s(Class cls) {
        Map map = zzd;
        qb qbVar = (qb) map.get(cls);
        if (qbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qbVar = (qb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (qbVar != null) {
            return qbVar;
        }
        qb qbVar2 = (qb) ((qb) ce.h(cls)).D(6, null, null);
        if (qbVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, qbVar2);
        return qbVar2;
    }

    protected static void t(Class cls, qb qbVar) {
        qbVar.l();
        zzd.put(cls, qbVar);
    }

    protected static Object u(yc ycVar, String str, Object[] objArr) {
        return new id(ycVar, str, objArr);
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

    protected static xb w() {
        return rb.i();
    }

    protected static yb x() {
        return mc.i();
    }

    protected static yb y(yb ybVar) {
        int size = ybVar.size();
        return ybVar.f(size + size);
    }

    protected static zb z() {
        return hd.i();
    }

    protected abstract Object D(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.yc
    public final /* synthetic */ xc b() {
        return (mb) D(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean c() {
        return C(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final /* synthetic */ yc d() {
        return (qb) D(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.yc
    public final int e() {
        if (k()) {
            int iJ = j(null);
            if (iJ >= 0) {
                return iJ;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iJ).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iJ);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iJ2 = j(null);
        if (iJ2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iJ2;
            return iJ2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iJ2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iJ2);
        throw new IllegalStateException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return gd.a().b(getClass()).j(this, (qb) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.yc
    public final void f(wa waVar) throws IOException {
        gd.a().b(getClass()).f(this, xa.M(waVar));
    }

    @Override // com.google.android.gms.internal.measurement.ba
    final int h(jd jdVar) {
        if (k()) {
            int iB = jdVar.b(this);
            if (iB >= 0) {
                return iB;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iB);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iB2 = jdVar.b(this);
        if (iB2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iB2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iB2);
        throw new IllegalStateException(sb3.toString());
    }

    public final int hashCode() {
        if (k()) {
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

    final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final qb m() {
        return (qb) D(4, null, null);
    }

    final int n() {
        return gd.a().b(getClass()).e(this);
    }

    protected final void o() {
        gd.a().b(getClass()).h(this);
        l();
    }

    protected final mb p() {
        return (mb) D(5, null, null);
    }

    public final mb q() {
        mb mbVar = (mb) D(5, null, null);
        mbVar.s(this);
        return mbVar;
    }

    final void r(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return ad.a(this, super.toString());
    }
}
