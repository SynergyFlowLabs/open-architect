package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.core.state.k;

/* JADX INFO: loaded from: classes2.dex */
public class g extends androidx.constraintlayout.core.state.f {
    private static final String F0 = "spansrespectwidgetorder";
    private static final String G0 = "subgridbycolrow";
    private String A0;
    private String B0;
    private String C0;
    private String D0;
    private int E0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private androidx.constraintlayout.core.utils.b f44305q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f44306r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f44307s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f44308t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f44309u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f44310v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f44311w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f44312x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f44313y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private float f44314z0;

    public g(@NonNull k kVar, @NonNull k.d dVar) {
        super(kVar, dVar);
        this.f44306r0 = 0;
        this.f44307s0 = 0;
        this.f44308t0 = 0;
        this.f44309u0 = 0;
        if (dVar == k.d.ROW) {
            this.f44311w0 = 1;
        } else {
            if (dVar == k.d.COLUMN) {
                this.f44312x0 = 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.f
    @NonNull
    public androidx.constraintlayout.core.widgets.j R0() {
        if (this.f44305q0 == null) {
            this.f44305q0 = new androidx.constraintlayout.core.utils.b();
        }
        return this.f44305q0;
    }

    @Override // androidx.constraintlayout.core.state.f
    public void T0(@p0 androidx.constraintlayout.core.widgets.j jVar) {
        if (jVar instanceof androidx.constraintlayout.core.utils.b) {
            this.f44305q0 = (androidx.constraintlayout.core.utils.b) jVar;
        } else {
            this.f44305q0 = null;
        }
    }

    @p0
    public String U0() {
        return this.B0;
    }

    public int V0() {
        return this.f44312x0;
    }

    public int W0() {
        return this.E0;
    }

    public float X0() {
        return this.f44313y0;
    }

    public int Y0() {
        return this.f44310v0;
    }

    public int Z0() {
        return this.f44309u0;
    }

    public int a1() {
        return this.f44307s0;
    }

    @Override // androidx.constraintlayout.core.state.f, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
        R0();
        this.f44305q0.s3(this.f44310v0);
        int i10 = this.f44311w0;
        if (i10 != 0) {
            this.f44305q0.u3(i10);
        }
        int i11 = this.f44312x0;
        if (i11 != 0) {
            this.f44305q0.o3(i11);
        }
        float f10 = this.f44313y0;
        if (f10 != 0.0f) {
            this.f44305q0.r3(f10);
        }
        float f11 = this.f44314z0;
        if (f11 != 0.0f) {
            this.f44305q0.x3(f11);
        }
        String str = this.A0;
        if (str != null && !str.isEmpty()) {
            this.f44305q0.t3(this.A0);
        }
        String str2 = this.B0;
        if (str2 != null && !str2.isEmpty()) {
            this.f44305q0.n3(this.B0);
        }
        String str3 = this.C0;
        if (str3 != null && !str3.isEmpty()) {
            this.f44305q0.w3(this.C0);
        }
        String str4 = this.D0;
        if (str4 != null && !str4.isEmpty()) {
            this.f44305q0.v3(this.D0);
        }
        this.f44305q0.q3(this.E0);
        this.f44305q0.H2(this.f44306r0);
        this.f44305q0.E2(this.f44307s0);
        this.f44305q0.I2(this.f44308t0);
        this.f44305q0.D2(this.f44309u0);
        Q0();
    }

    public int b1() {
        return this.f44306r0;
    }

    public int c1() {
        return this.f44308t0;
    }

    @p0
    public String d1() {
        return this.A0;
    }

    public int e1() {
        return this.f44311w0;
    }

    @p0
    public String f1() {
        return this.D0;
    }

    @p0
    public String g1() {
        return this.C0;
    }

    public float h1() {
        return this.f44314z0;
    }

    public void i1(@NonNull String str) {
        this.B0 = str;
    }

    public void j1(int i10) {
        if (super.S0() == k.d.ROW) {
            return;
        }
        this.f44312x0 = i10;
    }

    public void k1(int i10) {
        this.E0 = i10;
    }

    public void l1(@NonNull String str) {
        if (!str.isEmpty()) {
            String[] strArrSplit = str.split("\\|");
            this.E0 = 0;
            for (String str2 : strArrSplit) {
                String lowerCase = str2.toLowerCase();
                lowerCase.getClass();
                if (lowerCase.equals(G0)) {
                    this.E0 |= 1;
                } else if (lowerCase.equals(F0)) {
                    this.E0 |= 2;
                }
            }
        }
    }

    public void m1(float f10) {
        this.f44313y0 = f10;
    }

    public void n1(int i10) {
        this.f44310v0 = i10;
    }

    public void o1(int i10) {
        this.f44309u0 = i10;
    }

    public void p1(int i10) {
        this.f44307s0 = i10;
    }

    public void q1(int i10) {
        this.f44306r0 = i10;
    }

    public void r1(int i10) {
        this.f44308t0 = i10;
    }

    public void s1(@NonNull String str) {
        this.A0 = str;
    }

    public void t1(int i10) {
        if (super.S0() == k.d.COLUMN) {
            return;
        }
        this.f44311w0 = i10;
    }

    public void u1(@NonNull String str) {
        this.D0 = str;
    }

    public void v1(@NonNull String str) {
        this.C0 = str;
    }

    public void w1(float f10) {
        this.f44314z0 = f10;
    }
}
