package com.planner5d.library.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public class v6 extends u6 {

    @androidx.annotation.p0
    private static final androidx.databinding.e0.i L3 = null;

    @androidx.annotation.p0
    private static final SparseIntArray M3;

    @NonNull
    private final View H3;

    @NonNull
    private final ImageView I3;

    @NonNull
    private final ImageView J3;
    private long K3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.fn, 10);
        sparseIntArray.put(com.planner5d.library.f.j.f168016dc, 11);
        sparseIntArray.put(com.planner5d.library.f.j.Jd, 12);
        sparseIntArray.put(com.planner5d.library.f.j.f168200l4, 13);
    }

    public v6(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 14, L3, M3));
    }

    private boolean J1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            try {
                this.K3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    private boolean K1(androidx.lifecycle.w0<Boolean> w0Var, int i10) {
        if (i10 != com.planner5d.library.a.f131416a) {
            return false;
        }
        synchronized (this) {
            try {
                this.K3 |= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // com.planner5d.library.databinding.u6
    public void A1(@androidx.annotation.p0 Boolean bool) {
        this.f159776x3 = bool;
        synchronized (this) {
            try {
                this.K3 |= 64;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131425j);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void B1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var) {
        a1(0, w0Var);
        this.f159778z3 = w0Var;
        synchronized (this) {
            this.K3 |= 1;
        }
        e(com.planner5d.library.a.f131426k);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void C1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var) {
        a1(1, w0Var);
        this.f159777y3 = w0Var;
        synchronized (this) {
            this.K3 |= 2;
        }
        e(com.planner5d.library.a.f131427l);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void D1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.E3 = onClickListener;
        synchronized (this) {
            this.K3 |= 256;
        }
        e(com.planner5d.library.a.f131429n);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void E1(@androidx.annotation.p0 Boolean bool) {
        this.f159775w3 = bool;
        synchronized (this) {
            this.K3 |= 128;
        }
        e(com.planner5d.library.a.f131435t);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void F1(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.C3 = onClickListener;
        synchronized (this) {
            try {
                this.K3 |= 1024;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131436u);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void G1(@androidx.annotation.p0 View.OnLongClickListener onLongClickListener) {
        this.D3 = onLongClickListener;
        synchronized (this) {
            try {
                this.K3 |= 512;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131437v);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void H1(@androidx.annotation.p0 String str) {
        this.B3 = str;
        synchronized (this) {
            try {
                this.K3 |= 8;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131439x);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void I1(@androidx.annotation.p0 String str) {
        this.A3 = str;
        synchronized (this) {
            try {
                this.K3 |= 32;
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
                return this.K3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131423h == i10) {
            y1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131439x == i10) {
            H1((String) obj);
            return true;
        }
        if (com.planner5d.library.a.f131424i == i10) {
            z1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131426k == i10) {
            B1((androidx.lifecycle.w0) obj);
            return true;
        }
        if (com.planner5d.library.a.f131440y == i10) {
            I1((String) obj);
            return true;
        }
        if (com.planner5d.library.a.f131425j == i10) {
            A1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131427l == i10) {
            C1((androidx.lifecycle.w0) obj);
            return true;
        }
        if (com.planner5d.library.a.f131435t == i10) {
            E1((Boolean) obj);
            return true;
        }
        if (com.planner5d.library.a.f131429n == i10) {
            D1((View.OnClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131437v == i10) {
            G1((View.OnLongClickListener) obj);
            return true;
        }
        if (com.planner5d.library.a.f131436u != i10) {
            return false;
        }
        F1((View.OnClickListener) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            try {
                this.K3 = PlaybackStateCompat.f9664p1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return J1((androidx.lifecycle.w0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return K1((androidx.lifecycle.w0) obj, i11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01da  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:114:0x0202  */
    /* JADX WARN: Code duplicated, block: B:116:0x0206  */
    /* JADX WARN: Code duplicated, block: B:117:0x0209  */
    /* JADX WARN: Code duplicated, block: B:118:0x020e  */
    /* JADX WARN: Code duplicated, block: B:121:0x021a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x021d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0223  */
    /* JADX WARN: Code duplicated, block: B:128:0x022c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0233  */
    /* JADX WARN: Code duplicated, block: B:132:0x0236 A[PHI: r35
      0x0236: PHI (r35v8 long) = (r35v7 long), (r35v13 long) binds: [B:120:0x0218, B:129:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x023e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0240  */
    /* JADX WARN: Code duplicated, block: B:138:0x0244 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0246  */
    /* JADX WARN: Code duplicated, block: B:141:0x024c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0253  */
    /* JADX WARN: Code duplicated, block: B:147:0x025f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0274  */
    /* JADX WARN: Code duplicated, block: B:153:0x0281  */
    /* JADX WARN: Code duplicated, block: B:156:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0297  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:174:0x02db  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0170  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x018a  */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0197  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01cd  */
    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        long j11;
        Drawable drawableB;
        String str;
        Drawable drawable;
        boolean zZ0;
        boolean zZ1;
        Boolean boolF;
        boolean zBooleanValue;
        long j12;
        int i10;
        boolean zZ2;
        long j13;
        boolean zZ3;
        boolean zZ4;
        boolean zZ5;
        boolean z10;
        long j14;
        int i11;
        int i12;
        long j15;
        int i13;
        long j16;
        int i14;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        synchronized (this) {
            j10 = this.K3;
            this.K3 = 0L;
        }
        Boolean bool = this.G3;
        String str2 = this.B3;
        Boolean bool2 = this.F3;
        androidx.lifecycle.w0<Boolean> w0Var = this.f159778z3;
        String str3 = this.A3;
        Boolean bool3 = this.f159776x3;
        androidx.lifecycle.w0<Boolean> w0Var2 = this.f159777y3;
        Boolean bool4 = this.f159775w3;
        View.OnClickListener onClickListener = this.E3;
        View.OnLongClickListener onLongClickListener = this.D3;
        View.OnClickListener onClickListener2 = this.C3;
        long j22 = j10 & 2052;
        int i15 = 0;
        if (j22 != 0) {
            zZ0 = androidx.databinding.e0.z0(bool);
            if (j22 != 0) {
                j10 = zZ0 ? j10 | 8590098432L : j10 | 4295049216L;
            }
            Drawable drawableB2 = zZ0 ? j.a.b(this.f159764l3.getContext(), com.planner5d.library.f.h.f167668mb) : null;
            String string = zZ0 ? this.f159764l3.getResources().getString(com.planner5d.library.f.s.f169095f0) : this.f159764l3.getResources().getString(com.planner5d.library.f.s.Q3);
            drawableB = zZ0 ? j.a.b(this.f159764l3.getContext(), com.planner5d.library.f.h.F5) : j.a.b(this.f159764l3.getContext(), com.planner5d.library.f.h.I5);
            drawable = drawableB2;
            j11 = j10;
            str = string;
        } else {
            bool = bool;
            j11 = j10;
            drawableB = null;
            str = null;
            drawable = null;
            zZ0 = false;
        }
        long j23 = j11 & 2068;
        if (j23 != r4) {
            zZ1 = androidx.databinding.e0.z0(bool2);
            if (j23 != r4) {
                j11 = zZ1 ? j11 | 536870912 : j11 | 268435456;
            }
        } else {
            zZ1 = false;
        }
        if ((j11 & 2049) != r4) {
            boolF = w0Var != null ? w0Var.f() : null;
            if (boolF != null) {
                long j24 = j11;
                zBooleanValue = boolF.booleanValue();
                j11 = j24;
            }
            j12 = j11 & 2051;
            if (j12 != r4) {
                zZ2 = androidx.databinding.e0.z0(w0Var2 != null ? w0Var2.f() : null);
                if (j12 != r4) {
                    if (zZ2) {
                        j11 |= PlaybackStateCompat.f9656l3;
                    } else {
                        j11 |= PlaybackStateCompat.f9655k3;
                    }
                }
                if ((j11 & 2050) != r4) {
                    if (zZ2) {
                        j21 = 34359738368L;
                    } else {
                        j21 = 17179869184L;
                    }
                    j11 |= j21;
                }
                if ((j11 & 2050) != 0 || zZ2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            } else {
                i10 = 0;
                zZ2 = false;
            }
            j13 = j11 & 2240;
            if (j13 != r4) {
                zZ3 = androidx.databinding.e0.z0(bool4);
                if (j13 != r4) {
                    if (zZ3) {
                        j11 |= 2105344;
                    } else {
                        j11 |= 1052672;
                    }
                }
            } else {
                zZ3 = false;
            }
            if ((j11 & 268435456) != r4) {
                zZ0 = androidx.databinding.e0.z0(bool);
                if ((j11 & 2052) != r4) {
                    if (zZ0) {
                        j11 |= 8590098432L;
                    } else {
                        j11 |= 4295049216L;
                    }
                }
            }
            if ((j11 & PlaybackStateCompat.f9656l3) != r4) {
                if (w0Var != null) {
                    boolF = w0Var.f();
                }
                zZ4 = androidx.databinding.e0.z0(boolF);
            } else {
                zZ4 = false;
            }
            if ((j11 & 2105344) != r4) {
                zZ5 = androidx.databinding.e0.z0(bool3);
                if ((j11 & PlaybackStateCompat.f9665p2) != r4) {
                    z10 = !zZ5;
                } else {
                    z10 = false;
                }
            } else {
                zZ5 = false;
                z10 = false;
            }
            j14 = j11 & 2240;
            if (j14 != r4) {
                if (!zZ3) {
                    z10 = false;
                }
                if (!zZ3) {
                    zZ5 = false;
                }
                if (j14 != r4) {
                    if (z10) {
                        j20 = 2147483648L;
                    } else {
                        j20 = org.apache.commons.io.k.f336695f;
                    }
                    j11 |= j20;
                }
                if ((j11 & 2240) != r4) {
                    if (zZ5) {
                        j19 = 33554432;
                    } else {
                        j19 = 16777216;
                    }
                    j11 |= j19;
                }
                if (z10) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (zZ5) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            j15 = j11 & 2051;
            if (j15 == r4) {
                i13 = 0;
            } else {
                if (!zZ2) {
                    zZ4 = false;
                }
                if (j15 != r4) {
                    if (zZ4) {
                        j18 = 134217728;
                    } else {
                        j18 = 67108864;
                    }
                    j11 |= j18;
                }
                if (zZ4) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
            }
            j16 = j11 & 2068;
            if (j16 != r4) {
                if (zZ1) {
                    zZ0 = true;
                }
                if (j16 != r4) {
                    if (zZ0) {
                        j17 = 8388608;
                    } else {
                        j17 = PlaybackStateCompat.f9662o3;
                    }
                    j11 |= j17;
                }
                if (!zZ0) {
                    i15 = 8;
                }
            }
            i14 = i15;
            if ((j11 & 2052) != r4) {
                androidx.databinding.adapters.j0.b(this.f159764l3, drawableB);
                androidx.databinding.adapters.f0.A(this.f159764l3, str);
                androidx.databinding.adapters.f0.k(this.f159764l3, drawable);
            }
            if ((j11 & 2068) != r4) {
                this.f159764l3.setVisibility(i14);
            }
            if ((j11 & 2304) != r4) {
                this.f159766n3.setOnClickListener(onClickListener);
            }
            if ((j11 & 2051) != r4) {
                this.H3.setVisibility(i13);
            }
            if ((j11 & 2240) != r4) {
                this.I3.setVisibility(i12);
                this.J3.setVisibility(i11);
            }
            if ((j11 & 3072) != r4) {
                this.f159771s3.setOnClickListener(onClickListener2);
            }
            if ((j11 & 2560) != r4) {
                this.f159771s3.setOnLongClickListener(onLongClickListener);
            }
            if ((j11 & 2049) != r4) {
                androidx.databinding.adapters.k.a(this.f159772t3, zBooleanValue);
            }
            if ((j11 & 2050) != r4) {
                this.f159772t3.setVisibility(i10);
            }
            if ((j11 & 2056) != r4) {
                androidx.databinding.adapters.f0.A(this.f159773u3, str2);
            }
            if ((j11 & 2080) != r4) {
                androidx.databinding.adapters.f0.A(this.f159774v3, str3);
            }
        }
        boolF = null;
        zBooleanValue = false;
        j12 = j11 & 2051;
        if (j12 != r4) {
            zZ2 = androidx.databinding.e0.z0(w0Var2 != null ? w0Var2.f() : null);
            if (j12 != r4) {
                if (zZ2) {
                    j11 |= PlaybackStateCompat.f9656l3;
                } else {
                    j11 |= PlaybackStateCompat.f9655k3;
                }
            }
            if ((j11 & 2050) != r4) {
                if (zZ2) {
                    j21 = 34359738368L;
                } else {
                    j21 = 17179869184L;
                }
                j11 |= j21;
            }
            if ((j11 & 2050) != 0) {
                i10 = 0;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            zZ2 = false;
        }
        j13 = j11 & 2240;
        if (j13 != r4) {
            zZ3 = androidx.databinding.e0.z0(bool4);
            if (j13 != r4) {
                if (zZ3) {
                    j11 |= 2105344;
                } else {
                    j11 |= 1052672;
                }
            }
        } else {
            zZ3 = false;
        }
        if ((j11 & 268435456) != r4) {
            zZ0 = androidx.databinding.e0.z0(bool);
            if ((j11 & 2052) != r4) {
                if (zZ0) {
                    j11 |= 8590098432L;
                } else {
                    j11 |= 4295049216L;
                }
            }
        }
        if ((j11 & PlaybackStateCompat.f9656l3) != r4) {
            if (w0Var != null) {
                boolF = w0Var.f();
            }
            zZ4 = androidx.databinding.e0.z0(boolF);
        } else {
            zZ4 = false;
        }
        if ((j11 & 2105344) != r4) {
            zZ5 = androidx.databinding.e0.z0(bool3);
            if ((j11 & PlaybackStateCompat.f9665p2) != r4) {
                z10 = !zZ5;
            } else {
                z10 = false;
            }
        } else {
            zZ5 = false;
            z10 = false;
        }
        j14 = j11 & 2240;
        if (j14 != r4) {
            if (!zZ3) {
                z10 = false;
            }
            if (!zZ3) {
                zZ5 = false;
            }
            if (j14 != r4) {
                if (z10) {
                    j20 = 2147483648L;
                } else {
                    j20 = org.apache.commons.io.k.f336695f;
                }
                j11 |= j20;
            }
            if ((j11 & 2240) != r4) {
                if (zZ5) {
                    j19 = 33554432;
                } else {
                    j19 = 16777216;
                }
                j11 |= j19;
            }
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            if (zZ5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        j15 = j11 & 2051;
        if (j15 == r4) {
            i13 = 0;
        } else {
            if (!zZ2) {
                zZ4 = false;
            }
            if (j15 != r4) {
                if (zZ4) {
                    j18 = 134217728;
                } else {
                    j18 = 67108864;
                }
                j11 |= j18;
            }
            if (zZ4) {
                i13 = 0;
            } else {
                i13 = 8;
            }
        }
        j16 = j11 & 2068;
        if (j16 != r4) {
            if (zZ1) {
                zZ0 = true;
            }
            if (j16 != r4) {
                if (zZ0) {
                    j17 = 8388608;
                } else {
                    j17 = PlaybackStateCompat.f9662o3;
                }
                j11 |= j17;
            }
            if (!zZ0) {
                i15 = 8;
            }
        }
        i14 = i15;
        if ((j11 & 2052) != r4) {
            androidx.databinding.adapters.j0.b(this.f159764l3, drawableB);
            androidx.databinding.adapters.f0.A(this.f159764l3, str);
            androidx.databinding.adapters.f0.k(this.f159764l3, drawable);
        }
        if ((j11 & 2068) != r4) {
            this.f159764l3.setVisibility(i14);
        }
        if ((j11 & 2304) != r4) {
            this.f159766n3.setOnClickListener(onClickListener);
        }
        if ((j11 & 2051) != r4) {
            this.H3.setVisibility(i13);
        }
        if ((j11 & 2240) != r4) {
            this.I3.setVisibility(i12);
            this.J3.setVisibility(i11);
        }
        if ((j11 & 3072) != r4) {
            this.f159771s3.setOnClickListener(onClickListener2);
        }
        if ((j11 & 2560) != r4) {
            this.f159771s3.setOnLongClickListener(onLongClickListener);
        }
        if ((j11 & 2049) != r4) {
            androidx.databinding.adapters.k.a(this.f159772t3, zBooleanValue);
        }
        if ((j11 & 2050) != r4) {
            this.f159772t3.setVisibility(i10);
        }
        if ((j11 & 2056) != r4) {
            androidx.databinding.adapters.f0.A(this.f159773u3, str2);
        }
        if ((j11 & 2080) != r4) {
            androidx.databinding.adapters.f0.A(this.f159774v3, str3);
        }
    }

    @Override // com.planner5d.library.databinding.u6
    public void y1(@androidx.annotation.p0 Boolean bool) {
        this.G3 = bool;
        synchronized (this) {
            try {
                this.K3 |= 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131423h);
        super.r0();
    }

    @Override // com.planner5d.library.databinding.u6
    public void z1(@androidx.annotation.p0 Boolean bool) {
        this.F3 = bool;
        synchronized (this) {
            try {
                this.K3 |= 16;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131424i);
        super.r0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private v6(androidx.databinding.l lVar, View view, Object[] objArr) {
        ButtonTextView buttonTextView = (ButtonTextView) objArr[6];
        View view2 = (View) objArr[13];
        ImageButton imageButton = (ImageButton) objArr[9];
        Object obj = objArr[11];
        s6 s6VarA = obj != null ? s6.a((View) obj) : null;
        ImageView imageView = (ImageView) objArr[12];
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) objArr[2];
        Object obj2 = objArr[10];
        super(lVar, view, 2, buttonTextView, view2, imageButton, s6VarA, imageView, roundedCornersLayout, obj2 != null ? t6.a((View) obj2) : null, (ConstraintLayout) objArr[0], (AppCompatToggleButton) objArr[3], (TextView) objArr[8], (TextView) objArr[7]);
        this.K3 = -1L;
        this.f159764l3.setTag(null);
        this.f159766n3.setTag(null);
        this.f159769q3.setTag(null);
        View view3 = (View) objArr[1];
        this.H3 = view3;
        view3.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.I3 = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[5];
        this.J3 = imageView3;
        imageView3.setTag(null);
        this.f159771s3.setTag(null);
        this.f159772t3.setTag(null);
        this.f159773u3.setTag(null);
        this.f159774v3.setTag(null);
        D0(view);
        Z();
    }
}
