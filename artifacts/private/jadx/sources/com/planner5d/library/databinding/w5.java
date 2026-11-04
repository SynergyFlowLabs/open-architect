package com.planner5d.library.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public class w5 extends v5 {

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159858u3 = null;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159859v3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159860s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private long f159861t3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f159859v3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.R5, 1);
        sparseIntArray.put(com.planner5d.library.f.j.Nl, 2);
        sparseIntArray.put(com.planner5d.library.f.j.tv, 3);
        sparseIntArray.put(com.planner5d.library.f.j.Et, 4);
        sparseIntArray.put(com.planner5d.library.f.j.lt, 5);
    }

    public w5(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 6, f159858u3, f159859v3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159861t3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131433r == i10) {
            p1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131417b != i10) {
            return false;
        }
        o1((EnhancedRecyclerView.e) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            try {
                this.f159861t3 = 4L;
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

    @Override // com.planner5d.library.databinding.v5
    public void o1(@androidx.annotation.p0 EnhancedRecyclerView.e eVar) {
        this.f159823q3 = eVar;
        synchronized (this) {
            this.f159861t3 |= 2;
        }
        e(com.planner5d.library.a.f131417b);
        super.r0();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        boolean zZ0;
        boolean z10;
        long j11;
        Resources resources;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        long j12;
        long j13;
        int i10;
        int i11;
        synchronized (this) {
            j10 = this.f159861t3;
            this.f159861t3 = 0L;
        }
        Boolean bool = this.f159824r3;
        EnhancedRecyclerView.e eVar = this.f159823q3;
        long j14 = j10 & 5;
        int i12 = 0;
        if (j14 != 0) {
            zZ0 = androidx.databinding.e0.z0(bool);
            if (j14 != 0) {
                j10 = zZ0 ? j10 | 64 : j10 | 32;
            }
        } else {
            zZ0 = false;
        }
        long j15 = j10 & 6;
        if (j15 != 0) {
            z10 = eVar == EnhancedRecyclerView.e.GRID;
            if (j15 != 0) {
                j10 |= z10 ? 272L : 136L;
            }
        } else {
            z10 = false;
        }
        long j16 = 128 & j10;
        int i13 = j16 != 0 ? com.planner5d.library.f.g.Gh : 0;
        if ((j10 & 200) != 0) {
            j11 = 0;
            resources = getRoot().getContext().getResources();
            if (j16 != 0 && resources != null) {
                dimensionPixelSize = resources.getDimensionPixelSize(i13);
            }
            if ((8 & j10) != j11) {
                i11 = com.planner5d.library.f.g.f167420zh;
                if (resources != null) {
                    dimensionPixelSize2 = resources.getDimensionPixelSize(i11);
                } else {
                    dimensionPixelSize2 = 0;
                }
            } else {
                dimensionPixelSize2 = 0;
            }
            if ((64 & j10) != j11) {
                i10 = com.planner5d.library.f.g.Lh;
                if (resources != null) {
                    dimensionPixelSize3 = resources.getDimensionPixelSize(i10);
                } else {
                    dimensionPixelSize3 = 0;
                }
            } else {
                dimensionPixelSize3 = 0;
            }
            j12 = j10 & 6;
            if (j12 != j11) {
                if (z10) {
                    dimensionPixelSize2 = 0;
                }
                if (z10) {
                    dimensionPixelSize = 0;
                }
            } else {
                dimensionPixelSize = 0;
                dimensionPixelSize2 = 0;
            }
            j13 = j10 & 5;
            if (j13 != j11 && zZ0) {
                i12 = dimensionPixelSize3;
            }
            if (j12 != j11) {
                float f10 = dimensionPixelSize2;
                androidx.databinding.adapters.j0.n(this.f159860s3, f10);
                androidx.databinding.adapters.j0.k(this.f159860s3, f10);
                androidx.databinding.adapters.j0.j(this.f159860s3, dimensionPixelSize);
            }
            if (j13 != j11) {
                androidx.databinding.adapters.j0.o(this.f159860s3, i12);
            }
        }
        j11 = 0;
        resources = null;
        dimensionPixelSize = 0;
        if ((8 & j10) != j11) {
            i11 = com.planner5d.library.f.g.f167420zh;
            if (resources != null) {
                dimensionPixelSize2 = resources.getDimensionPixelSize(i11);
            } else {
                dimensionPixelSize2 = 0;
            }
        } else {
            dimensionPixelSize2 = 0;
        }
        if ((64 & j10) != j11) {
            i10 = com.planner5d.library.f.g.Lh;
            if (resources != null) {
                dimensionPixelSize3 = resources.getDimensionPixelSize(i10);
            } else {
                dimensionPixelSize3 = 0;
            }
        } else {
            dimensionPixelSize3 = 0;
        }
        j12 = j10 & 6;
        if (j12 != j11) {
            if (z10) {
                dimensionPixelSize2 = 0;
            }
            if (z10) {
                dimensionPixelSize = 0;
            }
        } else {
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
        }
        j13 = j10 & 5;
        if (j13 != j11) {
            i12 = dimensionPixelSize3;
        }
        if (j12 != j11) {
            float f11 = dimensionPixelSize2;
            androidx.databinding.adapters.j0.n(this.f159860s3, f11);
            androidx.databinding.adapters.j0.k(this.f159860s3, f11);
            androidx.databinding.adapters.j0.j(this.f159860s3, dimensionPixelSize);
        }
        if (j13 != j11) {
            androidx.databinding.adapters.j0.o(this.f159860s3, i12);
        }
    }

    @Override // com.planner5d.library.databinding.v5
    public void p1(@androidx.annotation.p0 Boolean bool) {
        this.f159824r3 = bool;
        synchronized (this) {
            this.f159861t3 |= 1;
        }
        e(com.planner5d.library.a.f131433r);
        super.r0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private w5(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (CardView) objArr[1], (ImageView) objArr[2], (ButtonTextView) objArr[5], (TextView) objArr[4], (TextView) objArr[3]);
        int i10 = 0 & 3;
        this.f159861t3 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f159860s3 = frameLayout;
        frameLayout.setTag(null);
        D0(view);
        Z();
    }
}
