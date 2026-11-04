package com.planner5d.library.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public class t5 extends s5 {

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159707x3 = null;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159708y3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159709v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private long f159710w3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f159708y3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.M5, 3);
        int i10 = 7 ^ 4;
        sparseIntArray.put(com.planner5d.library.f.j.Nl, 4);
        sparseIntArray.put(com.planner5d.library.f.j.Ft, 5);
        sparseIntArray.put(com.planner5d.library.f.j.Tx, 6);
    }

    public t5(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 7, f159707x3, f159708y3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159710w3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131419d == i10) {
            r1((Contest) obj);
            return true;
        }
        if (com.planner5d.library.a.f131428m == i10) {
            s1((com.planner5d.library.model.manager.n1) obj);
            return true;
        }
        if (com.planner5d.library.a.f131433r == i10) {
            t1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131417b != i10) {
            return false;
        }
        q1((EnhancedRecyclerView.e) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            this.f159710w3 = 16L;
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[PHI: r12
      0x00b7: PHI (r12v1 android.content.res.Resources) = (r12v0 android.content.res.Resources), (r12v4 android.content.res.Resources), (r12v4 android.content.res.Resources) binds: [B:39:0x00a0, B:41:0x00ae, B:42:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        String strB;
        String strB2;
        boolean zZ0;
        boolean z10;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        com.planner5d.library.model.a0 a0VarC;
        com.planner5d.library.model.a0 a0VarG;
        synchronized (this) {
            j10 = this.f159710w3;
            this.f159710w3 = 0L;
        }
        Contest contest = this.f159653s3;
        com.planner5d.library.model.manager.n1 n1Var = this.f159652r3;
        Boolean bool = this.f159655u3;
        EnhancedRecyclerView.e eVar = this.f159654t3;
        Resources resources = null;
        if ((j10 & 19) == 0) {
            strB = null;
            strB2 = null;
        } else {
            if (contest != null) {
                a0VarG = contest.G();
                a0VarC = contest.C();
            } else {
                a0VarC = null;
                a0VarG = null;
            }
            if (n1Var != null) {
                strB2 = n1Var.b(getRoot().getContext(), a0VarG, "");
                strB = n1Var.b(getRoot().getContext(), a0VarC, "");
            } else {
                strB = null;
                strB2 = null;
            }
        }
        long j11 = j10 & 20;
        int i10 = 0;
        if (j11 != 0) {
            zZ0 = androidx.databinding.e0.z0(bool);
            if (j11 != 0) {
                j10 = zZ0 ? j10 | 256 : j10 | 128;
            }
        } else {
            zZ0 = false;
        }
        long j12 = j10 & 24;
        if (j12 != 0) {
            z10 = eVar == EnhancedRecyclerView.e.GRID;
            if (j12 != 0) {
                j10 |= z10 ? 1088L : 544L;
            }
        } else {
            z10 = false;
        }
        long j13 = 512 & j10;
        int i11 = j13 != 0 ? com.planner5d.library.f.g.Gh : 0;
        if ((j10 & 800) != 0) {
            resources = getRoot().getContext().getResources();
            if (j13 == 0 || resources == null) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(i11);
            }
        } else {
            dimensionPixelSize = 0;
        }
        if ((j10 & 32) != 0) {
            int i12 = com.planner5d.library.f.g.f167420zh;
            if (resources != null) {
                dimensionPixelSize2 = resources.getDimensionPixelSize(i12);
            } else {
                dimensionPixelSize2 = 0;
            }
        } else {
            dimensionPixelSize2 = 0;
        }
        if ((256 & j10) != 0) {
            int i13 = com.planner5d.library.f.g.Lh;
            if (resources != null) {
                dimensionPixelSize3 = resources.getDimensionPixelSize(i13);
            } else {
                dimensionPixelSize3 = 0;
            }
        } else {
            dimensionPixelSize3 = 0;
        }
        long j14 = j10 & 24;
        if (j14 != 0) {
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
        long j15 = 20 & j10;
        if (j15 != 0 && zZ0) {
            i10 = dimensionPixelSize3;
        }
        int i14 = i10;
        if (j14 != 0) {
            float f10 = dimensionPixelSize2;
            androidx.databinding.adapters.j0.n(this.f159709v3, f10);
            androidx.databinding.adapters.j0.k(this.f159709v3, f10);
            androidx.databinding.adapters.j0.j(this.f159709v3, dimensionPixelSize);
        }
        if (j15 != 0) {
            androidx.databinding.adapters.j0.o(this.f159709v3, i14);
        }
        if ((j10 & 19) != 0) {
            androidx.databinding.adapters.f0.A(this.f159648n3, strB2);
            androidx.databinding.adapters.f0.A(this.f159650p3, strB);
        }
    }

    @Override // com.planner5d.library.databinding.s5
    public void q1(@androidx.annotation.p0 EnhancedRecyclerView.e eVar) {
        this.f159654t3 = eVar;
        synchronized (this) {
            this.f159710w3 |= 8;
        }
        e(com.planner5d.library.a.f131417b);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.s5
    public void r1(@androidx.annotation.p0 Contest contest) {
        this.f159653s3 = contest;
        synchronized (this) {
            this.f159710w3 |= 1;
        }
        e(com.planner5d.library.a.f131419d);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.s5
    public void s1(@androidx.annotation.p0 com.planner5d.library.model.manager.n1 n1Var) {
        this.f159652r3 = n1Var;
        synchronized (this) {
            try {
                this.f159710w3 |= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131428m);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.s5
    public void t1(@androidx.annotation.p0 Boolean bool) {
        this.f159655u3 = bool;
        synchronized (this) {
            try {
                this.f159710w3 |= 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131433r);
        super.r0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private t5(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (CardView) objArr[3], (ImageView) objArr[4], (TextView) objArr[2], (ImageView) objArr[5], (TextView) objArr[1], (ButtonTextView) objArr[6]);
        int i10 = 2 >> 0;
        this.f159710w3 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f159709v3 = frameLayout;
        frameLayout.setTag(null);
        this.f159648n3.setTag(null);
        this.f159650p3.setTag(null);
        D0(view);
        Z();
    }
}
