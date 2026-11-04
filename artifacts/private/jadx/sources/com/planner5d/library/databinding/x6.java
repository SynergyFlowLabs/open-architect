package com.planner5d.library.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public class x6 extends w6 {

    @androidx.annotation.p0
    private static final androidx.databinding.e0.i F3 = null;

    @androidx.annotation.p0
    private static final SparseIntArray G3;

    @NonNull
    private final View C3;

    @NonNull
    private final ImageView D3;
    private long E3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.Jd, 8);
        sparseIntArray.put(com.planner5d.library.f.j.f168200l4, 9);
    }

    public x6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 10, F3, G3));
    }

    private boolean F1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            this.E3 |= 1;
        }
        return true;
    }

    private boolean G1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            try {
                this.E3 |= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // com.planner5d.library.databinding.w6
    public void A1(@androidx.annotation.p0 Boolean bool) {
        this.f159870t3 = bool;
        synchronized (this) {
            try {
                this.E3 |= 16;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131435t);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.w6
    public void B1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f159876z3 = onClickListener;
        synchronized (this) {
            this.E3 |= 256;
        }
        e(com.planner5d.library.a.f131436u);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.w6
    public void C1(@androidx.annotation.p0 View.OnLongClickListener onLongClickListener) {
        this.A3 = onLongClickListener;
        synchronized (this) {
            try {
                this.E3 |= 128;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131437v);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.w6
    public void D1(@androidx.annotation.p0 String str) {
        this.f159875y3 = str;
        synchronized (this) {
            this.E3 |= 64;
        }
        e(com.planner5d.library.a.f131439x);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.w6
    public void E1(@androidx.annotation.p0 String str) {
        this.f159874x3 = str;
        synchronized (this) {
            try {
                this.E3 |= 4;
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
                return this.E3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131426k == i10) {
            x1((androidx.lifecycle.w0) obj);
            return true;
        }
        if (com.planner5d.library.a.f131440y == i10) {
            E1((String) obj);
            return true;
        }
        if (com.planner5d.library.a.f131425j == i10) {
            w1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131427l == i10) {
            y1((androidx.lifecycle.w0) obj);
            return true;
        }
        if (com.planner5d.library.a.f131435t == i10) {
            A1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131429n == i10) {
            z1((View.OnClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131439x == i10) {
            D1((String) obj);
            return true;
        }
        if (com.planner5d.library.a.f131437v == i10) {
            C1((View.OnLongClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131436u != i10) {
            return false;
        }
        B1((View.OnClickListener) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            this.E3 = 512L;
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return F1((androidx.lifecycle.w0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return G1((androidx.lifecycle.w0) obj, i11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0162  */
    /* JADX WARN: Code duplicated, block: B:103:0x0173  */
    /* JADX WARN: Code duplicated, block: B:106:0x017e  */
    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0196  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        long j11;
        Boolean boolF;
        boolean zBooleanValue;
        long j12;
        int i10;
        boolean zZ0;
        long j13;
        boolean zZ1;
        boolean zZ2;
        boolean zZ3;
        boolean z10;
        long j14;
        int i11;
        int i12;
        long j15;
        int i13;
        long j16;
        long j17;
        long j18;
        long j19;
        synchronized (this) {
            j10 = this.E3;
            j11 = 0;
            this.E3 = 0L;
        }
        androidx.lifecycle.w0<Boolean> w0Var = this.f159873w3;
        String str = this.f159874x3;
        Boolean bool = this.f159871u3;
        androidx.lifecycle.w0<Boolean> w0Var2 = this.f159872v3;
        Boolean bool2 = this.f159870t3;
        View.OnClickListener onClickListener = this.B3;
        String str2 = this.f159875y3;
        View.OnLongClickListener onLongClickListener = this.A3;
        View.OnClickListener onClickListener2 = this.f159876z3;
        int i14 = 0;
        if ((j10 & 513) != 0) {
            boolF = w0Var != null ? w0Var.f() : null;
            if (boolF != null) {
                zBooleanValue = boolF.booleanValue();
                j11 = 0;
            }
            j12 = j10 & 515;
            if (j12 != j11) {
                zZ0 = androidx.databinding.e0.z0(w0Var2 != null ? w0Var2.f() : null);
                if (j12 != j11) {
                    if (zZ0) {
                        j10 |= PlaybackStateCompat.f9652h3;
                    } else {
                        j10 |= 16384;
                    }
                }
                if ((j10 & 514) != j11) {
                    if (zZ0) {
                        j19 = 8388608;
                    } else {
                        j19 = PlaybackStateCompat.f9662o3;
                    }
                    j10 |= j19;
                }
                if ((j10 & 514) != j11 || zZ0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            } else {
                i10 = 0;
                zZ0 = false;
            }
            j13 = j10 & 536;
            if (j13 != j11) {
                zZ1 = androidx.databinding.e0.z0(bool2);
                if (j13 != j11) {
                    if (zZ1) {
                        j10 |= 2099200;
                    } else {
                        j10 |= 1049600;
                    }
                }
            } else {
                zZ1 = false;
            }
            if ((j10 & PlaybackStateCompat.f9652h3) != j11) {
                if (w0Var != null) {
                    boolF = w0Var.f();
                }
                zZ2 = androidx.databinding.e0.z0(boolF);
            } else {
                zZ2 = false;
            }
            if ((j10 & 2099200) != j11) {
                zZ3 = androidx.databinding.e0.z0(bool);
                if ((j10 & PlaybackStateCompat.f9664p1) != j11) {
                    z10 = !zZ3;
                } else {
                    z10 = false;
                }
            } else {
                zZ3 = false;
                z10 = false;
            }
            j14 = j10 & 536;
            if (j14 != j11) {
                if (!zZ1) {
                    z10 = false;
                }
                if (!zZ1) {
                    zZ3 = false;
                }
                if (j14 != j11) {
                    if (z10) {
                        j18 = PlaybackStateCompat.f9656l3;
                    } else {
                        j18 = PlaybackStateCompat.f9655k3;
                    }
                    j10 |= j18;
                }
                if ((j10 & 536) != j11) {
                    if (zZ3) {
                        j17 = PlaybackStateCompat.f9665p2;
                    } else {
                        j17 = PlaybackStateCompat.H1;
                    }
                    j10 |= j17;
                }
                if (z10) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (zZ3) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            j15 = j10 & 515;
            if (j15 != j11) {
                if (!zZ0) {
                    zZ2 = false;
                }
                if (j15 != j11) {
                    if (zZ2) {
                        j16 = PlaybackStateCompat.f9654j3;
                    } else {
                        j16 = PlaybackStateCompat.f9653i3;
                    }
                    j10 |= j16;
                }
                if (!zZ2) {
                    i14 = 8;
                }
            }
            i13 = i14;
            if ((j10 & 536) != j11) {
                this.f159862l3.setVisibility(i12);
                this.D3.setVisibility(i11);
            }
            if ((544 & j10) != j11) {
                this.f159864n3.setOnClickListener(onClickListener);
            }
            if ((j10 & 515) != j11) {
                this.C3.setVisibility(i13);
            }
            if ((768 & j10) != j11) {
                this.f159866p3.setOnClickListener(onClickListener2);
            }
            if ((640 & j10) != j11) {
                this.f159866p3.setOnLongClickListener(onLongClickListener);
            }
            if ((j10 & 513) != j11) {
                androidx.databinding.adapters.k.a(this.f159867q3, zBooleanValue);
            }
            if ((j10 & 514) != j11) {
                this.f159867q3.setVisibility(i10);
            }
            if ((576 & j10) != j11) {
                androidx.databinding.adapters.f0.A(this.f159868r3, str2);
            }
            if ((j10 & 516) != j11) {
                androidx.databinding.adapters.f0.A(this.f159869s3, str);
            }
        }
        boolF = null;
        zBooleanValue = false;
        j12 = j10 & 515;
        if (j12 != j11) {
            zZ0 = androidx.databinding.e0.z0(w0Var2 != null ? w0Var2.f() : null);
            if (j12 != j11) {
                if (zZ0) {
                    j10 |= PlaybackStateCompat.f9652h3;
                } else {
                    j10 |= 16384;
                }
            }
            if ((j10 & 514) != j11) {
                if (zZ0) {
                    j19 = 8388608;
                } else {
                    j19 = PlaybackStateCompat.f9662o3;
                }
                j10 |= j19;
            }
            if ((j10 & 514) != j11) {
                i10 = 0;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            zZ0 = false;
        }
        j13 = j10 & 536;
        if (j13 != j11) {
            zZ1 = androidx.databinding.e0.z0(bool2);
            if (j13 != j11) {
                if (zZ1) {
                    j10 |= 2099200;
                } else {
                    j10 |= 1049600;
                }
            }
        } else {
            zZ1 = false;
        }
        if ((j10 & PlaybackStateCompat.f9652h3) != j11) {
            if (w0Var != null) {
                boolF = w0Var.f();
            }
            zZ2 = androidx.databinding.e0.z0(boolF);
        } else {
            zZ2 = false;
        }
        if ((j10 & 2099200) != j11) {
            zZ3 = androidx.databinding.e0.z0(bool);
            if ((j10 & PlaybackStateCompat.f9664p1) != j11) {
                z10 = !zZ3;
            } else {
                z10 = false;
            }
        } else {
            zZ3 = false;
            z10 = false;
        }
        j14 = j10 & 536;
        if (j14 != j11) {
            if (!zZ1) {
                z10 = false;
            }
            if (!zZ1) {
                zZ3 = false;
            }
            if (j14 != j11) {
                if (z10) {
                    j18 = PlaybackStateCompat.f9656l3;
                } else {
                    j18 = PlaybackStateCompat.f9655k3;
                }
                j10 |= j18;
            }
            if ((j10 & 536) != j11) {
                if (zZ3) {
                    j17 = PlaybackStateCompat.f9665p2;
                } else {
                    j17 = PlaybackStateCompat.H1;
                }
                j10 |= j17;
            }
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            if (zZ3) {
                i11 = 0;
            } else {
                i11 = 8;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        j15 = j10 & 515;
        if (j15 != j11) {
            if (!zZ0) {
                zZ2 = false;
            }
            if (j15 != j11) {
                if (zZ2) {
                    j16 = PlaybackStateCompat.f9654j3;
                } else {
                    j16 = PlaybackStateCompat.f9653i3;
                }
                j10 |= j16;
            }
            if (!zZ2) {
                i14 = 8;
            }
        }
        i13 = i14;
        if ((j10 & 536) != j11) {
            this.f159862l3.setVisibility(i12);
            this.D3.setVisibility(i11);
        }
        if ((544 & j10) != j11) {
            this.f159864n3.setOnClickListener(onClickListener);
        }
        if ((j10 & 515) != j11) {
            this.C3.setVisibility(i13);
        }
        if ((768 & j10) != j11) {
            this.f159866p3.setOnClickListener(onClickListener2);
        }
        if ((640 & j10) != j11) {
            this.f159866p3.setOnLongClickListener(onLongClickListener);
        }
        if ((j10 & 513) != j11) {
            androidx.databinding.adapters.k.a(this.f159867q3, zBooleanValue);
        }
        if ((j10 & 514) != j11) {
            this.f159867q3.setVisibility(i10);
        }
        if ((576 & j10) != j11) {
            androidx.databinding.adapters.f0.A(this.f159868r3, str2);
        }
        if ((j10 & 516) != j11) {
            androidx.databinding.adapters.f0.A(this.f159869s3, str);
        }
    }

    @Override // com.planner5d.library.databinding.w6
    public void w1(@androidx.annotation.p0 Boolean bool) {
        this.f159871u3 = bool;
        synchronized (this) {
            try {
                this.E3 |= 8;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131425j);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.w6
    public void x1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var) {
        a1(0, w0Var);
        this.f159873w3 = w0Var;
        synchronized (this) {
            try {
                this.E3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131426k);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.w6
    public void y1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var) {
        a1(1, w0Var);
        this.f159872v3 = w0Var;
        synchronized (this) {
            this.E3 |= 2;
        }
        e(com.planner5d.library.a.f131427l);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.w6
    public void z1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.B3 = onClickListener;
        synchronized (this) {
            try {
                this.E3 |= 32;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131429n);
        super.r0();
    }

    private x6(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (ImageView) objArr[5], (View) objArr[9], (ImageButton) objArr[7], (ShapeableImageView) objArr[8], (ConstraintLayout) objArr[0], (AppCompatToggleButton) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.E3 = -1L;
        this.f159862l3.setTag(null);
        this.f159864n3.setTag(null);
        View view2 = (View) objArr[1];
        this.C3 = view2;
        view2.setTag(null);
        ImageView imageView = (ImageView) objArr[6];
        this.D3 = imageView;
        imageView.setTag(null);
        this.f159866p3.setTag(null);
        this.f159867q3.setTag(null);
        this.f159868r3.setTag(null);
        this.f159869s3.setTag(null);
        D0(view);
        Z();
    }
}
