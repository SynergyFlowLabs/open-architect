package com.planner5d.library.feed.view.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.databinding.adapters.f0;
import androidx.databinding.adapters.p;
import androidx.databinding.e0;
import androidx.databinding.l;
import com.planner5d.library.widget.ProfileIconView;

/* JADX INFO: loaded from: classes7.dex */
public class b extends a {

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @p0
    private static final e0.i f179900t3 = null;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @p0
    private static final SparseIntArray f179901u3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f179902s3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f179901u3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.feed.view.c.i.C4, 4);
        sparseIntArray.put(com.planner5d.library.feed.view.c.i.f177633n1, 5);
    }

    public b(@p0 l lVar, @NonNull View view) {
        this(lVar, view, e0.c0(lVar, view, 6, f179900t3, f179901u3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f179902s3 != 0;
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
        n1((jc.e) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            try {
                this.f179902s3 = 2L;
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

    @Override // com.planner5d.library.feed.view.databinding.a
    public void n1(@p0 jc.e eVar) {
        this.f179899r3 = eVar;
        synchronized (this) {
            try {
                this.f179902s3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.feed.view.a.f175307o);
        super.r0();
    }

    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        Drawable drawableB;
        String str;
        String strI;
        boolean zK;
        String strO;
        synchronized (this) {
            try {
                j10 = this.f179902s3;
                this.f179902s3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jc.e eVar = this.f179899r3;
        long j11 = j10 & 3;
        String str2 = null;
        if (j11 != 0) {
            if (eVar != null) {
                zK = eVar.k();
                strI = eVar.i();
                strO = eVar.o();
            } else {
                strI = null;
                zK = false;
                strO = null;
            }
            if (j11 != 0) {
                j10 |= zK ? 8L : 4L;
            }
            str = strO;
            drawableB = j.a.b(this.f179895n3.getContext(), zK ? com.planner5d.library.feed.view.c.g.f177089a8 : com.planner5d.library.feed.view.c.g.T9);
            str2 = strI;
        } else {
            drawableB = null;
            str = null;
        }
        if ((j10 & 3) != 0) {
            f0.A(this.f179893l3, str2);
            p.a(this.f179895n3, drawableB);
            f0.A(this.f179898q3, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private b(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[3], (ProfileIconView) objArr[5], (ImageView) objArr[1], (ImageView) objArr[4], (CardView) objArr[0], (TextView) objArr[2]);
        int i10 = 5 ^ 1;
        int i11 = (6 & 0) | 2;
        this.f179902s3 = -1L;
        this.f179893l3.setTag(null);
        this.f179895n3.setTag(null);
        this.f179897p3.setTag(null);
        this.f179898q3.setTag(null);
        D0(view);
        Z();
    }
}
