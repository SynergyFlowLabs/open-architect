package com.planner5d.library.feed.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.databinding.e0;
import androidx.databinding.l;

/* JADX INFO: loaded from: classes7.dex */
public class d extends c {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @p0
    private static final e0.i f179907q3 = null;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @p0
    private static final SparseIntArray f179908r3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private long f179909p3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f179908r3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.feed.view.c.i.f177629ma, 1);
        sparseIntArray.put(com.planner5d.library.feed.view.c.i.F9, 2);
    }

    public d(@p0 l lVar, @NonNull View view) {
        this(lVar, view, e0.c0(lVar, view, 3, f179907q3, f179908r3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f179909p3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @p0 Object obj) {
        if (com.planner5d.library.feed.view.a.f175307o != i10) {
            return false;
        }
        n1((com.planner5d.library.feed.view.holders.b) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            try {
                this.f179909p3 = 2L;
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

    @Override // com.planner5d.library.feed.view.databinding.c
    public void n1(@p0 com.planner5d.library.feed.view.holders.b bVar) {
        this.f179906o3 = bVar;
    }

    @Override // androidx.databinding.e0
    protected void p() {
        synchronized (this) {
            try {
                this.f179909p3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private d(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (CardView) objArr[0], (TextView) objArr[2], (TextView) objArr[1]);
        this.f179909p3 = -1L;
        this.f179903l3.setTag(null);
        D0(view);
        Z();
    }
}
