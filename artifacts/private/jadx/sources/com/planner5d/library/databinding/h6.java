package com.planner5d.library.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.planner5d.library.activity.fragment.spaces.view.DocumentStatusView;

/* JADX INFO: loaded from: classes4.dex */
public class h6 extends g6 {

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159089n3 = null;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159090o3 = null;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private long f159091m3;

    public h6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 1, f159089n3, f159090o3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159091m3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            this.f159091m3 = 1L;
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.e0
    protected void p() {
        synchronized (this) {
            try {
                this.f159091m3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private h6(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (DocumentStatusView) objArr[0]);
        this.f159091m3 = -1L;
        this.f159020l3.setTag(null);
        D0(view);
        Z();
    }
}
