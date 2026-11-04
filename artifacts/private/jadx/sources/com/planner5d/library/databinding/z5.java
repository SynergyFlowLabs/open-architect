package com.planner5d.library.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes4.dex */
public class z5 extends y5 {

    @androidx.annotation.p0
    private static final androidx.databinding.e0.i E3 = null;

    @androidx.annotation.p0
    private static final SparseIntArray F3;

    @NonNull
    private final View C3;
    private long D3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.Rd, 6);
        sparseIntArray.put(com.planner5d.library.f.j.Jd, 7);
        sparseIntArray.put(com.planner5d.library.f.j.Ia, 8);
        sparseIntArray.put(com.planner5d.library.f.j.Ja, 9);
        sparseIntArray.put(com.planner5d.library.f.j.Wm, 10);
    }

    public z5(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 11, E3, F3));
    }

    private boolean B1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            try {
                this.D3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    private boolean C1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            try {
                this.D3 |= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // com.planner5d.library.databinding.y5
    public void A1(@androidx.annotation.p0 String str) {
        this.f159982x3 = str;
        synchronized (this) {
            try {
                this.D3 |= 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131440y);
        super.r0();
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.D3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131426k == i10) {
            w1((androidx.lifecycle.w0) obj);
            return true;
        }
        if (com.planner5d.library.a.f131440y == i10) {
            A1((String) obj);
            return true;
        }
        if (com.planner5d.library.a.f131421f == i10) {
            t1((View.OnClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131422g == i10) {
            v1((View.OnLongClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131427l == i10) {
            x1((androidx.lifecycle.w0) obj);
            return true;
        }
        if (com.planner5d.library.a.f131429n == i10) {
            y1((View.OnClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131439x != i10) {
            return false;
        }
        z1((String) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            try {
                this.D3 = 128L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return B1((androidx.lifecycle.w0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return C1((androidx.lifecycle.w0) obj, i11);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x0105  */
    /* JADX WARN: Code duplicated, block: B:74:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        long j11;
        Boolean boolF;
        boolean zBooleanValue;
        long j12;
        int i10;
        boolean zZ0;
        boolean zZ1;
        long j13;
        int i11;
        long j14;
        long j15;
        synchronized (this) {
            j10 = this.D3;
            j11 = 0;
            this.D3 = 0L;
        }
        androidx.lifecycle.w0<Boolean> w0Var = this.f159981w3;
        String str = this.f159982x3;
        View.OnClickListener onClickListener = this.f159984z3;
        View.OnLongClickListener onLongClickListener = this.A3;
        androidx.lifecycle.w0<Boolean> w0Var2 = this.f159980v3;
        View.OnClickListener onClickListener2 = this.B3;
        String str2 = this.f159983y3;
        int i12 = 0;
        if ((j10 & 129) != 0) {
            boolF = w0Var != null ? w0Var.f() : null;
            if (boolF != null) {
                zBooleanValue = boolF.booleanValue();
                j11 = 0;
            }
            j12 = j10 & 131;
            if (j12 != j11) {
                zZ0 = androidx.databinding.e0.z0(w0Var2 != null ? w0Var2.f() : null);
                if (j12 != j11) {
                    if (zZ0) {
                        j10 |= 512;
                    } else {
                        j10 |= 256;
                    }
                }
                if ((j10 & 130) != j11) {
                    if (zZ0) {
                        j15 = PlaybackStateCompat.f9665p2;
                    } else {
                        j15 = PlaybackStateCompat.H1;
                    }
                    j10 |= j15;
                }
                if ((j10 & 130) != j11 || zZ0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            } else {
                i10 = 0;
                zZ0 = false;
            }
            if ((j10 & 512) != j11) {
                if (w0Var != null) {
                    boolF = w0Var.f();
                }
                zZ1 = androidx.databinding.e0.z0(boolF);
            } else {
                zZ1 = false;
            }
            j13 = j10 & 131;
            if (j13 != j11) {
                if (!zZ0) {
                    zZ1 = false;
                }
                if (j13 != j11) {
                    if (zZ1) {
                        j14 = PlaybackStateCompat.f9664p1;
                    } else {
                        j14 = 1024;
                    }
                    j10 |= j14;
                }
                if (!zZ1) {
                    i12 = 8;
                }
            }
            i11 = i12;
            if ((160 & j10) != j11) {
                this.f159970l3.setOnClickListener(onClickListener2);
            }
            if ((j10 & 131) != j11) {
                this.C3.setVisibility(i11);
            }
            if ((136 & j10) != j11) {
                this.f159976r3.setOnClickListener(onClickListener);
            }
            if ((144 & j10) != j11) {
                this.f159976r3.setOnLongClickListener(onLongClickListener);
            }
            if ((j10 & 129) != j11) {
                androidx.databinding.adapters.k.a(this.f159977s3, zBooleanValue);
            }
            if ((j10 & 130) != j11) {
                this.f159977s3.setVisibility(i10);
            }
            if ((192 & j10) != j11) {
                androidx.databinding.adapters.f0.A(this.f159978t3, str2);
            }
            if ((j10 & 132) != j11) {
                androidx.databinding.adapters.f0.A(this.f159979u3, str);
            }
        }
        boolF = null;
        zBooleanValue = false;
        j12 = j10 & 131;
        if (j12 != j11) {
            zZ0 = androidx.databinding.e0.z0(w0Var2 != null ? w0Var2.f() : null);
            if (j12 != j11) {
                if (zZ0) {
                    j10 |= 512;
                } else {
                    j10 |= 256;
                }
            }
            if ((j10 & 130) != j11) {
                if (zZ0) {
                    j15 = PlaybackStateCompat.f9665p2;
                } else {
                    j15 = PlaybackStateCompat.H1;
                }
                j10 |= j15;
            }
            if ((j10 & 130) != j11) {
                i10 = 0;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            zZ0 = false;
        }
        if ((j10 & 512) != j11) {
            if (w0Var != null) {
                boolF = w0Var.f();
            }
            zZ1 = androidx.databinding.e0.z0(boolF);
        } else {
            zZ1 = false;
        }
        j13 = j10 & 131;
        if (j13 != j11) {
            if (!zZ0) {
                zZ1 = false;
            }
            if (j13 != j11) {
                if (zZ1) {
                    j14 = PlaybackStateCompat.f9664p1;
                } else {
                    j14 = 1024;
                }
                j10 |= j14;
            }
            if (!zZ1) {
                i12 = 8;
            }
        }
        i11 = i12;
        if ((160 & j10) != j11) {
            this.f159970l3.setOnClickListener(onClickListener2);
        }
        if ((j10 & 131) != j11) {
            this.C3.setVisibility(i11);
        }
        if ((136 & j10) != j11) {
            this.f159976r3.setOnClickListener(onClickListener);
        }
        if ((144 & j10) != j11) {
            this.f159976r3.setOnLongClickListener(onLongClickListener);
        }
        if ((j10 & 129) != j11) {
            androidx.databinding.adapters.k.a(this.f159977s3, zBooleanValue);
        }
        if ((j10 & 130) != j11) {
            this.f159977s3.setVisibility(i10);
        }
        if ((192 & j10) != j11) {
            androidx.databinding.adapters.f0.A(this.f159978t3, str2);
        }
        if ((j10 & 132) != j11) {
            androidx.databinding.adapters.f0.A(this.f159979u3, str);
        }
    }

    @Override // com.planner5d.library.databinding.y5
    public void t1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f159984z3 = onClickListener;
        synchronized (this) {
            try {
                this.D3 |= 8;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131421f);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y5
    public void v1(@androidx.annotation.p0 View.OnLongClickListener onLongClickListener) {
        this.A3 = onLongClickListener;
        synchronized (this) {
            try {
                this.D3 |= 16;
            } finally {
            }
        }
        e(com.planner5d.library.a.f131422g);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y5
    public void w1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var) {
        a1(0, w0Var);
        this.f159981w3 = w0Var;
        synchronized (this) {
            try {
                this.D3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131426k);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y5
    public void x1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var) {
        a1(1, w0Var);
        this.f159980v3 = w0Var;
        synchronized (this) {
            try {
                this.D3 |= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131427l);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y5
    public void y1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.B3 = onClickListener;
        synchronized (this) {
            try {
                this.D3 |= 32;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131429n);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.y5
    public void z1(@androidx.annotation.p0 String str) {
        this.f159983y3 = str;
        synchronized (this) {
            this.D3 |= 64;
        }
        e(com.planner5d.library.a.f131439x);
        super.r0();
    }

    private z5(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (ImageButton) objArr[5], (FrameLayout) objArr[8], (ImageView) objArr[9], (ImageView) objArr[7], (RoundedCornersLayout) objArr[6], (CircularProgressIndicator) objArr[10], (ConstraintLayout) objArr[0], (AppCompatToggleButton) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.D3 = -1L;
        this.f159970l3.setTag(null);
        View view2 = (View) objArr[1];
        this.C3 = view2;
        view2.setTag(null);
        this.f159976r3.setTag(null);
        this.f159977s3.setTag(null);
        this.f159978t3.setTag(null);
        this.f159979u3.setTag(null);
        D0(view);
        Z();
    }
}
