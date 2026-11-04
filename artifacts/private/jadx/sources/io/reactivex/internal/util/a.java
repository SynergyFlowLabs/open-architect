package io.reactivex.internal.util;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes11.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f303471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f303472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f303473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f303474d;

    /* JADX INFO: renamed from: io.reactivex.internal.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC2195a<T> extends dj.r<T> {
        @Override // dj.r
        boolean test(T t10);
    }

    public a(int i10) {
        this.f303471a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f303472b = objArr;
        this.f303473c = objArr;
    }

    public <U> boolean a(i0<? super U> i0Var) {
        Object[] objArr;
        Object[] objArr2 = this.f303472b;
        int i10 = this.f303471a;
        while (true) {
            if (objArr2 == null) {
                return false;
            }
            for (int i11 = 0; i11 < i10 && (objArr = objArr2[i11]) != null; i11++) {
                if (q.d(objArr, i0Var)) {
                    return true;
                }
            }
            objArr2 = objArr2[i10];
        }
    }

    public <U> boolean b(org.reactivestreams.v<? super U> vVar) {
        Object[] objArr = this.f303472b;
        int i10 = this.f303471a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr2 = objArr[i11];
                if (objArr2 == null) {
                    break;
                }
                if (q.e(objArr2, vVar)) {
                    return true;
                }
            }
            objArr = objArr[i10];
        }
    }

    public void c(T t10) {
        int i10 = this.f303471a;
        int i11 = this.f303474d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f303473c[i10] = objArr;
            this.f303473c = objArr;
            i11 = 0;
        }
        this.f303473c[i11] = t10;
        this.f303474d = i11 + 1;
    }

    public void d(InterfaceC2195a<? super T> interfaceC2195a) {
        int i10 = this.f303471a;
        loop0: for (Object[] objArr = this.f303472b; objArr != null; objArr = (Object[]) objArr[i10]) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null) {
                    break;
                } else {
                    if (interfaceC2195a.test(obj)) {
                        break loop0;
                    }
                }
            }
        }
    }

    public <S> void e(S s10, dj.d<? super S, ? super T> dVar) throws Exception {
        Object[] objArr = this.f303472b;
        int i10 = this.f303471a;
        while (true) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null || dVar.test(s10, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i10];
        }
    }

    public void f(T t10) {
        this.f303472b[0] = t10;
    }
}
