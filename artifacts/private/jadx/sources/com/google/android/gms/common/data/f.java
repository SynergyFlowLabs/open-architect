package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @g6.a
    protected final DataHolder f106383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g6.a
    protected int f106384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f106385c;

    @g6.a
    public f(@NonNull DataHolder dataHolder, int i10) {
        this.f106383a = (DataHolder) w.r(dataHolder);
        n(i10);
    }

    @g6.a
    protected void a(@NonNull String str, @NonNull CharArrayBuffer charArrayBuffer) {
        this.f106383a.U2(str, this.f106384b, this.f106385c, charArrayBuffer);
    }

    @g6.a
    protected boolean b(@NonNull String str) {
        return this.f106383a.b2(str, this.f106384b, this.f106385c);
    }

    @NonNull
    @g6.a
    protected byte[] c(@NonNull String str) {
        return this.f106383a.e2(str, this.f106384b, this.f106385c);
    }

    @g6.a
    protected int d() {
        return this.f106384b;
    }

    @g6.a
    protected double e(@NonNull String str) {
        return this.f106383a.B2(str, this.f106384b, this.f106385c);
    }

    @g6.a
    public boolean equals(@p0 Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (u.b(Integer.valueOf(fVar.f106384b), Integer.valueOf(this.f106384b)) && u.b(Integer.valueOf(fVar.f106385c), Integer.valueOf(this.f106385c)) && fVar.f106383a == this.f106383a) {
                return true;
            }
        }
        return false;
    }

    @g6.a
    protected float f(@NonNull String str) {
        return this.f106383a.D2(str, this.f106384b, this.f106385c);
    }

    @g6.a
    protected int g(@NonNull String str) {
        return this.f106383a.f2(str, this.f106384b, this.f106385c);
    }

    @g6.a
    protected long h(@NonNull String str) {
        return this.f106383a.n2(str, this.f106384b, this.f106385c);
    }

    @g6.a
    public int hashCode() {
        return u.c(Integer.valueOf(this.f106384b), Integer.valueOf(this.f106385c), this.f106383a);
    }

    @NonNull
    @g6.a
    protected String i(@NonNull String str) {
        return this.f106383a.q2(str, this.f106384b, this.f106385c);
    }

    @g6.a
    public boolean j(@NonNull String str) {
        return this.f106383a.u2(str);
    }

    @g6.a
    protected boolean k(@NonNull String str) {
        return this.f106383a.z2(str, this.f106384b, this.f106385c);
    }

    @g6.a
    public boolean l() {
        return !this.f106383a.isClosed();
    }

    @p0
    @g6.a
    protected Uri m(@NonNull String str) {
        String strQ2 = this.f106383a.q2(str, this.f106384b, this.f106385c);
        if (strQ2 == null) {
            return null;
        }
        return Uri.parse(strQ2);
    }

    protected final void n(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f106383a.getCount()) {
            z10 = true;
        }
        w.x(z10);
        this.f106384b = i10;
        this.f106385c = this.f106383a.s2(i10);
    }
}
