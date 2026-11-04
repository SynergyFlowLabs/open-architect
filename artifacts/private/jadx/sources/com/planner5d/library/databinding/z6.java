package com.planner5d.library.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.EnhancedRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class z6 extends y6 {

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f160023t3 = null;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f160024u3 = null;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f160025q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NonNull
    private final ImageView f160026r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f160027s3;

    public z6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 3, f160023t3, f160024u3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f160027s3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131431p == i10) {
            r1((View.OnClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131434s == i10) {
            s1((View.OnClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131438w == i10) {
            t1((com.planner5d.library.activity.fragment.list.l1.j) obj);
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
            try {
                this.f160027s3 = 16L;
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

    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        boolean z10;
        Drawable drawableB;
        long j11;
        int i10;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        synchronized (this) {
            j10 = this.f160027s3;
            this.f160027s3 = 0L;
        }
        View.OnClickListener onClickListener = this.f159989p3;
        View.OnClickListener onClickListener2 = this.f159988o3;
        com.planner5d.library.activity.fragment.list.l1.j jVar = this.f159986m3;
        EnhancedRecyclerView.e eVar = this.f159987n3;
        int i11 = 0;
        int iP = ((j10 & 20) == 0 || jVar == null) ? 0 : jVar.p();
        long j12 = j10 & 24;
        Resources resources = null;
        if (j12 != 0) {
            z10 = eVar == EnhancedRecyclerView.e.GRID;
            if (j12 != 0) {
                j10 |= z10 ? 1344L : 672L;
            }
            drawableB = j.a.b(this.f160026r3.getContext(), z10 ? com.planner5d.library.f.h.Hb : com.planner5d.library.f.h.Fb);
        } else {
            z10 = false;
            drawableB = null;
        }
        long j13 = j10 & 256;
        int i12 = j13 != 0 ? com.planner5d.library.f.g.Nh : 0;
        long j14 = j10 & 128;
        if (j14 != 0) {
            i10 = com.planner5d.library.f.g.Th;
            j11 = 20;
        } else {
            j11 = 20;
            i10 = 0;
        }
        if ((j10 & 416) != 0) {
            resources = getRoot().getContext().getResources();
            dimensionPixelSize = (j13 == 0 || resources == null) ? 0 : resources.getDimensionPixelSize(i12);
            dimensionPixelSize2 = (j14 == 0 || resources == null) ? 0 : resources.getDimensionPixelSize(i10);
        } else {
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
        }
        if ((32 & j10) != 0) {
            int i13 = com.planner5d.library.f.g.f167420zh;
            if (resources != null) {
                dimensionPixelSize3 = resources.getDimensionPixelSize(i13);
            } else {
                dimensionPixelSize3 = 0;
            }
        } else {
            dimensionPixelSize3 = 0;
        }
        long j15 = 24 & j10;
        if (j15 != 0) {
            i11 = z10 ? 0 : dimensionPixelSize3;
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        } else {
            dimensionPixelSize = 0;
        }
        if ((18 & j10) != 0) {
            this.f159985l3.setOnClickListener(onClickListener2);
        }
        if ((j10 & j11) != 0) {
            this.f159985l3.setText(iP);
        }
        if (j15 != 0) {
            float f10 = i11;
            androidx.databinding.adapters.j0.n(this.f160025q3, f10);
            androidx.databinding.adapters.j0.k(this.f160025q3, f10);
            androidx.databinding.adapters.j0.j(this.f160025q3, dimensionPixelSize);
            androidx.databinding.adapters.p.a(this.f160026r3, drawableB);
        }
        if ((j10 & 17) != 0) {
            this.f160026r3.setOnClickListener(onClickListener);
        }
    }

    @Override // com.planner5d.library.databinding.y6
    public void q1(@androidx.annotation.p0 EnhancedRecyclerView.e eVar) {
        this.f159987n3 = eVar;
        synchronized (this) {
            try {
                this.f160027s3 |= 8;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131417b);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y6
    public void r1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f159989p3 = onClickListener;
        synchronized (this) {
            try {
                this.f160027s3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131431p);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y6
    public void s1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f159988o3 = onClickListener;
        synchronized (this) {
            this.f160027s3 |= 2;
        }
        e(com.planner5d.library.a.f131434s);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y6
    public void t1(@androidx.annotation.p0 com.planner5d.library.activity.fragment.list.l1.j jVar) {
        this.f159986m3 = jVar;
        synchronized (this) {
            this.f160027s3 |= 4;
        }
        e(com.planner5d.library.a.f131438w);
        super.r0();
    }

    private z6(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[1]);
        this.f160027s3 = -1L;
        this.f159985l3.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f160025q3 = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f160026r3 = imageView;
        imageView.setTag(null);
        D0(view);
        Z();
    }
}
