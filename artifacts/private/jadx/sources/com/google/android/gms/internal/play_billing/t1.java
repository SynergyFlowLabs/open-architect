package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f109332a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f109333b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    s1 f109334c;

    public final t1 a(Object obj, Object obj2) {
        int i10 = this.f109333b + 1;
        Object[] objArr = this.f109332a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f109332a = Arrays.copyOf(objArr, l1.a(length, i11));
        }
        y0.b(obj, obj2);
        Object[] objArr2 = this.f109332a;
        int i12 = this.f109333b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f109333b = i12 + 1;
        return this;
    }

    public final u1 b() {
        s1 s1Var = this.f109334c;
        if (s1Var != null) {
            throw s1Var.a();
        }
        t2 t2VarG = t2.g(this.f109333b, this.f109332a, this);
        s1 s1Var2 = this.f109334c;
        if (s1Var2 == null) {
            return t2VarG;
        }
        throw s1Var2.a();
    }
}
