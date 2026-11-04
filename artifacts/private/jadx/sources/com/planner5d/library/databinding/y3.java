package com.planner5d.library.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public class y3 extends x3 {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159962r3 = null;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159963s3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    private final TextView f159964p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private long f159965q3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f159963s3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.Jd, 3);
    }

    public y3(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 4, f159962r3, f159963s3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159965q3 != 0;
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
            this.f159965q3 = 2L;
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.planner5d.library.databinding.x3
    public void n1(@androidx.annotation.p0 jc.a aVar) {
        this.f159904o3 = aVar;
        synchronized (this) {
            this.f159965q3 |= 1;
        }
        e(com.planner5d.library.a.f131430o);
        super.r0();
    }

    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        String strJ;
        String strA;
        synchronized (this) {
            try {
                j10 = this.f159965q3;
                this.f159965q3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jc.a aVar = this.f159904o3;
        long j11 = j10 & 3;
        if (j11 == 0 || aVar == null) {
            strJ = null;
            strA = null;
        } else {
            strJ = aVar.j();
            strA = aVar.a();
        }
        if (j11 != 0) {
            androidx.databinding.adapters.f0.A(this.f159964p3, strA);
            androidx.databinding.adapters.f0.A(this.f159903n3, strJ);
        }
    }

    private y3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[3], (CardView) objArr[0], (TextView) objArr[1]);
        this.f159965q3 = -1L;
        this.f159902m3.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f159964p3 = textView;
        textView.setTag(null);
        this.f159903n3.setTag(null);
        D0(view);
        Z();
    }
}
