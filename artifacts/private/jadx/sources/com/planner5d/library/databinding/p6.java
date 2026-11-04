package com.planner5d.library.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class p6 extends o6 {

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159513t3 = null;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159514u3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159515r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f159516s3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f159514u3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.uv, 2);
        sparseIntArray.put(com.planner5d.library.f.j.O6, 3);
        sparseIntArray.put(com.planner5d.library.f.j.tv, 4);
        sparseIntArray.put(com.planner5d.library.f.j.Jt, 5);
    }

    public p6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 6, f159513t3, f159514u3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159516s3 != 0;
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
            try {
                this.f159516s3 = 2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.planner5d.library.databinding.o6
    public void n1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f159465q3 = onClickListener;
        synchronized (this) {
            try {
                this.f159516s3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131432q);
        super.r0();
    }

    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        synchronized (this) {
            try {
                j10 = this.f159516s3;
                this.f159516s3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        View.OnClickListener onClickListener = this.f159465q3;
        if ((j10 & 3) != 0) {
            this.f159461m3.setOnClickListener(onClickListener);
            this.f159515r3.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private p6(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (View) objArr[3], (CardView) objArr[1], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[2]);
        int i10 = 6 & 2;
        this.f159516s3 = -1L;
        this.f159461m3.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f159515r3 = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        Z();
    }
}
