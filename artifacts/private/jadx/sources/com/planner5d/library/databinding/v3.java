package com.planner5d.library.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public class v3 extends u3 {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159812q3 = null;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159813r3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private long f159814p3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f159813r3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.tv, 1);
        sparseIntArray.put(com.planner5d.library.f.j.Et, 2);
    }

    public v3(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 3, f159812q3, f159813r3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159814p3 != 0;
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
            try {
                this.f159814p3 = 2L;
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

    @Override // com.planner5d.library.databinding.u3
    public void n1(@androidx.annotation.p0 jc.a aVar) {
        this.f159759o3 = aVar;
    }

    @Override // androidx.databinding.e0
    protected void p() {
        synchronized (this) {
            try {
                this.f159814p3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private v3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (CardView) objArr[0], (TextView) objArr[2], (TextView) objArr[1]);
        this.f159814p3 = -1L;
        this.f159756l3.setTag(null);
        D0(view);
        Z();
    }
}
