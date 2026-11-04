package com.planner5d.library.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class r6 extends q6 {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159601r3 = null;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159602s3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159603p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private long f159604q3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f159602s3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.tv, 2);
        sparseIntArray.put(com.planner5d.library.f.j.Jt, 3);
    }

    public r6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 4, f159601r3, f159602s3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159604q3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131432q != i10) {
            return false;
        }
        n1((View.OnClickListener) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            this.f159604q3 = 2L;
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.planner5d.library.databinding.q6
    public void n1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f159576o3 = onClickListener;
        synchronized (this) {
            this.f159604q3 |= 1;
        }
        e(com.planner5d.library.a.f131432q);
        super.r0();
    }

    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        synchronized (this) {
            j10 = this.f159604q3;
            this.f159604q3 = 0L;
        }
        View.OnClickListener onClickListener = this.f159576o3;
        if ((j10 & 3) != 0) {
            this.f159573l3.setOnClickListener(onClickListener);
            this.f159603p3.setOnClickListener(onClickListener);
        }
    }

    private r6(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[2]);
        this.f159604q3 = -1L;
        this.f159573l3.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f159603p3 = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        Z();
    }
}
