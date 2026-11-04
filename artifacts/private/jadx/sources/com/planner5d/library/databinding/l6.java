package com.planner5d.library.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class l6 extends k6 {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f159302v3 = null;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f159303w3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NonNull
    private final View f159304t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private long f159305u3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f159303w3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.Vs, 6);
        sparseIntArray.put(com.planner5d.library.f.j.Nd, 7);
    }

    public l6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 8, f159302v3, f159303w3));
    }

    private boolean o1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            try {
                this.f159305u3 |= 1;
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
            try {
                this.f159305u3 |= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f159305u3 != 0;
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
                this.f159305u3 = 8L;
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

    @Override // com.planner5d.library.databinding.k6
    public void n1(@androidx.annotation.p0 com.planner5d.library.activity.fragment.list.holders.c0.a aVar) {
        this.f159247s3 = aVar;
        synchronized (this) {
            this.f159305u3 |= 4;
        }
        e(com.planner5d.library.a.f131420e);
        super.r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        long j11;
        boolean zZ0;
        int i10;
        long j12;
        String str;
        String strE;
        Boolean boolF;
        View.OnLongClickListener onLongClickListener;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        boolean z10;
        int i11;
        boolean zZ1;
        boolean zBooleanValue;
        androidx.lifecycle.w0<Boolean> w0VarG;
        int i12;
        View.OnLongClickListener onLongClickListenerB;
        View.OnClickListener onClickListenerA;
        View.OnClickListener onClickListenerD;
        String strF;
        synchronized (this) {
            j10 = this.f159305u3;
            this.f159305u3 = 0L;
        }
        com.planner5d.library.activity.fragment.list.holders.c0.a aVar = this.f159247s3;
        androidx.lifecycle.w0<Boolean> w0VarG2 = null;
        int i13 = 0;
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
                    strE = aVar.e();
                    onLongClickListenerB = aVar.b();
                    onClickListenerA = aVar.a();
                    onClickListenerD = aVar.d();
                    strF = aVar.f();
                } else {
                    strE = null;
                    onLongClickListenerB = null;
                    onClickListenerA = null;
                    onClickListenerD = null;
                    strF = null;
                }
                Object[] objArr = onClickListenerD != null;
                if (j13 != 0) {
                    j10 |= objArr != false ? PlaybackStateCompat.f9664p1 : 1024L;
                }
                i12 = objArr != false ? 0 : 4;
            } else {
                i12 = 0;
                strE = null;
                onLongClickListenerB = null;
                onClickListenerA = null;
                onClickListenerD = null;
                strF = null;
            }
            androidx.lifecycle.w0<Boolean> w0VarH = aVar != null ? aVar.h() : null;
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
            str = strF;
            z10 = zBooleanValue;
            onClickListener2 = onClickListenerD;
            i11 = i12;
            onLongClickListener = onLongClickListenerB;
            onClickListener = onClickListenerA;
            j12 = 12;
        } else {
            j11 = 15;
            zZ0 = false;
            i10 = 0;
            j12 = 12;
            str = null;
            strE = null;
            boolF = null;
            onLongClickListener = null;
            onClickListener = null;
            onClickListener2 = null;
            z10 = false;
            i11 = 0;
        }
        if ((j10 & 32) != 0) {
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
                i13 = 8;
            }
        }
        if ((j10 & j12) != 0) {
            this.f159240l3.setOnClickListener(onClickListener2);
            this.f159240l3.setVisibility(i11);
            this.f159242n3.setOnClickListener(onClickListener);
            this.f159242n3.setOnLongClickListener(onLongClickListener);
            androidx.databinding.adapters.f0.A(this.f159245q3, strE);
            androidx.databinding.adapters.f0.A(this.f159246r3, str);
        }
        if ((j10 & j11) != 0) {
            this.f159304t3.setVisibility(i13);
        }
        if ((j10 & 13) != 0) {
            androidx.databinding.adapters.k.a(this.f159243o3, z10);
        }
        if ((j10 & 14) != 0) {
            this.f159243o3.setVisibility(i10);
        }
    }

    private l6(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (ImageButton) objArr[5], (ImageView) objArr[7], (ConstraintLayout) objArr[0], (AppCompatToggleButton) objArr[2], (Space) objArr[6], (TextView) objArr[4], (TextView) objArr[3]);
        this.f159305u3 = -1L;
        this.f159240l3.setTag(null);
        View view2 = (View) objArr[1];
        this.f159304t3 = view2;
        view2.setTag(null);
        this.f159242n3.setTag(null);
        this.f159243o3.setTag(null);
        this.f159245q3.setTag(null);
        this.f159246r3.setTag(null);
        D0(view);
        Z();
    }
}
