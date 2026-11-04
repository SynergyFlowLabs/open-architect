package org.slf4j.helpers;

/* JADX INFO: loaded from: classes14.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f339646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f339647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Throwable f339648c;

    public o(String str, Object[] objArr, Throwable th2) {
        this.f339646a = str;
        this.f339647b = objArr;
        this.f339648c = th2;
    }

    public static Throwable d(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    public static o e(String str, Object[] objArr, Throwable th2) {
        if (th2 != null) {
            return new o(str, objArr, th2);
        }
        if (objArr == null || objArr.length == 0) {
            return new o(str, objArr, th2);
        }
        Throwable thD = d(objArr);
        return thD != null ? new o(str, i.u(objArr), thD) : new o(str, objArr);
    }

    public static o f(org.slf4j.event.f fVar) {
        return e(fVar.Q(), fVar.a(), fVar.b());
    }

    public static Object[] g(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }

    public Object[] a() {
        return this.f339647b;
    }

    public String b() {
        return this.f339646a;
    }

    public Throwable c() {
        return this.f339648c;
    }

    public o(String str, Object[] objArr) {
        this(str, objArr, null);
    }
}
