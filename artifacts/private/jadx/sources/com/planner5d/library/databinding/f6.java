package com.planner5d.library.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class f6 extends e6 {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f158970v3 = null;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f158971w3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158972s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NonNull
    private final View f158973t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private long f158974u3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f158971w3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.Vs, 7);
    }

    public f6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 8, f158970v3, f158971w3));
    }

    private boolean o1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            try {
                this.f158974u3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    private boolean p1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            this.f158974u3 |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f158974u3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131420e != i10) {
            return false;
        }
        n1((com.planner5d.library.activity.fragment.list.holders.c0.a) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            try {
                this.f158974u3 = 8L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return o1((androidx.lifecycle.w0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return p1((androidx.lifecycle.w0) obj, i11);
    }

    @Override // com.planner5d.library.databinding.e6
    public void n1(@androidx.annotation.p0 com.planner5d.library.activity.fragment.list.holders.c0.a aVar) {
        this.f158911r3 = aVar;
        synchronized (this) {
            try {
                this.f158974u3 |= 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131420e);
        super.r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        long j11;
        long j12;
        boolean zZ0;
        int iC;
        int i10;
        boolean z10;
        int i11;
        int i12;
        String str;
        Boolean boolF;
        View.OnLongClickListener onLongClickListener;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        View.OnClickListener onClickListener3;
        String str2;
        boolean zZ1;
        boolean zBooleanValue;
        androidx.lifecycle.w0<Boolean> w0VarG;
        int i13;
        int i14;
        String strE;
        View.OnLongClickListener onLongClickListenerB;
        View.OnClickListener onClickListenerA;
        View.OnClickListener onClickListenerD;
        View.OnClickListener onClickListenerA2;
        String strF;
        synchronized (this) {
            j10 = this.f158974u3;
            this.f158974u3 = 0L;
        }
        com.planner5d.library.activity.fragment.list.holders.c0.a aVar = this.f158911r3;
        androidx.lifecycle.w0<Boolean> w0VarG2 = null;
        int i15 = 0;
        if ((j10 & 15) != 0) {
            if ((j10 & 13) != 0) {
                w0VarG = aVar != null ? aVar.g() : null;
                a1(0, w0VarG);
                boolF = w0VarG != null ? w0VarG.f() : null;
                zBooleanValue = boolF != null ? boolF.booleanValue() : false;
            } else {
                zBooleanValue = false;
                w0VarG = null;
                boolF = null;
            }
            long j13 = j10 & 12;
            j11 = 15;
            if (j13 != 0) {
                if (aVar != null) {
                    iC = aVar.c();
                    strE = aVar.e();
                    onLongClickListenerB = aVar.b();
                    onClickListenerA = aVar.a();
                    onClickListenerD = aVar.d();
                    onClickListenerA2 = aVar.a();
                    strF = aVar.f();
                } else {
                    iC = 0;
                    strE = null;
                    onLongClickListenerB = null;
                    onClickListenerA = null;
                    onClickListenerD = null;
                    onClickListenerA2 = null;
                    strF = null;
                }
                Object[] objArr = strE != null;
                Object[] objArr2 = onClickListenerD != null;
                if (j13 != 0) {
                    j10 |= objArr != false ? PlaybackStateCompat.f9664p1 : 1024L;
                }
                if ((j10 & 12) != 0) {
                    j10 |= objArr2 != false ? PlaybackStateCompat.f9665p2 : PlaybackStateCompat.H1;
                }
                i13 = objArr != false ? 0 : 8;
                i14 = objArr2 != false ? 0 : 4;
            } else {
                iC = 0;
                i13 = 0;
                i14 = 0;
                strE = null;
                onLongClickListenerB = null;
                onClickListenerA = null;
                onClickListenerD = null;
                onClickListenerA2 = null;
                strF = null;
            }
            androidx.lifecycle.w0<Boolean> w0VarH = aVar != null ? aVar.h() : null;
            j12 = 32;
            a1(1, w0VarH);
            zZ0 = androidx.databinding.e0.z0(w0VarH != null ? w0VarH.f() : null);
            if ((j10 & 15) != 0) {
                j10 = zZ0 ? j10 | 32 : j10 | 16;
            }
            if ((j10 & 14) != 0) {
                j10 |= zZ0 ? 128L : 64L;
            }
            i10 = ((j10 & 14) == 0 || zZ0) ? 0 : 8;
            w0VarG2 = w0VarG;
            z10 = zBooleanValue;
            i11 = i13;
            str = strE;
            onLongClickListener = onLongClickListenerB;
            i12 = i14;
            onClickListener = onClickListenerA;
            onClickListener2 = onClickListenerD;
            onClickListener3 = onClickListenerA2;
            str2 = strF;
        } else {
            j11 = 15;
            j12 = 32;
            zZ0 = false;
            iC = 0;
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            str = null;
            boolF = null;
            onLongClickListener = null;
            onClickListener = null;
            onClickListener2 = null;
            onClickListener3 = null;
            str2 = null;
        }
        if ((j10 & j12) != 0) {
            if (aVar != null) {
                w0VarG2 = aVar.g();
            }
            androidx.lifecycle.w0<Boolean> w0Var = w0VarG2;
            a1(0, w0Var);
            if (w0Var != null) {
                boolF = w0Var.f();
            }
            zZ1 = androidx.databinding.e0.z0(boolF);
        } else {
            zZ1 = false;
        }
        long j14 = j10 & j11;
        if (j14 != 0) {
            if (!zZ0) {
                zZ1 = false;
            }
            if (j14 != 0) {
                j10 |= zZ1 ? 512L : 256L;
            }
            if (!zZ1) {
                i15 = 8;
            }
        }
        if ((j10 & 12) != 0) {
            this.f158905l3.setOnClickListener(onClickListener2);
            this.f158905l3.setVisibility(i12);
            this.f158906m3.setOnClickListener(onClickListener);
            this.f158972s3.setOnClickListener(onClickListener3);
            this.f158972s3.setOnLongClickListener(onLongClickListener);
            androidx.databinding.adapters.f0.A(this.f158909p3, str);
            this.f158909p3.setVisibility(i11);
            androidx.databinding.adapters.f0.A(this.f158910q3, str2);
            if (androidx.databinding.e0.x() >= 21) {
                this.f158906m3.setImageTintList(androidx.databinding.adapters.l.a(iC));
            }
        }
        if ((j10 & j11) != 0) {
            this.f158973t3.setVisibility(i15);
        }
        if ((j10 & 13) != 0) {
            androidx.databinding.adapters.k.a(this.f158907n3, z10);
        }
        if ((j10 & 14) != 0) {
            this.f158907n3.setVisibility(i10);
        }
    }

    private f6(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (ImageButton) objArr[6], (AppCompatImageView) objArr[3], (AppCompatToggleButton) objArr[2], (Space) objArr[7], (TextView) objArr[5], (TextView) objArr[4]);
        this.f158974u3 = -1L;
        this.f158905l3.setTag(null);
        this.f158906m3.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f158972s3 = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[1];
        this.f158973t3 = view2;
        view2.setTag(null);
        this.f158907n3.setTag(null);
        this.f158909p3.setTag(null);
        this.f158910q3.setTag(null);
        D0(view);
        Z();
    }
}
