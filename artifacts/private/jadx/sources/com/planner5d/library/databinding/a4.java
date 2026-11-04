package com.planner5d.library.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public class a4 extends z3 {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f158703r3 = null;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f158704s3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private long f158705q3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f158704s3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.Jd, 2);
        sparseIntArray.put(com.planner5d.library.f.j.Ad, 3);
    }

    public a4(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 4, f158703r3, f158704s3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f158705q3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131430o != i10) {
            return false;
        }
        n1((jc.a) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            this.f158705q3 = 2L;
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.planner5d.library.databinding.z3
    public void n1(@androidx.annotation.p0 jc.a aVar) {
        this.f160018p3 = aVar;
        synchronized (this) {
            this.f158705q3 |= 1;
        }
        e(com.planner5d.library.a.f131430o);
        super.r0();
    }

    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        synchronized (this) {
            try {
                j10 = this.f158705q3;
                this.f158705q3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jc.a aVar = this.f160018p3;
        long j11 = j10 & 3;
        String strJ = (j11 == 0 || aVar == null) ? null : aVar.j();
        if (j11 != 0) {
            androidx.databinding.adapters.f0.A(this.f160017o3, strJ);
        }
    }

    private a4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[3], (ImageView) objArr[2], (CardView) objArr[0], (TextView) objArr[1]);
        this.f158705q3 = -1L;
        this.f160016n3.setTag(null);
        this.f160017o3.setTag(null);
        D0(view);
        Z();
    }
}
