package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.k;

/* JADX INFO: loaded from: classes2.dex */
public class c extends androidx.constraintlayout.core.state.f {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private k.c f44284q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f44285r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f44286s0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44287a;

        static {
            int[] iArr = new int[k.c.values().length];
            f44287a = iArr;
            try {
                iArr[k.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44287a[k.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 7 >> 3;
                f44287a[k.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44287a[k.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44287a[k.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44287a[k.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(k kVar) {
        super(kVar, k.d.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.f
    public androidx.constraintlayout.core.widgets.j R0() {
        if (this.f44286s0 == null) {
            this.f44286s0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.f44286s0;
    }

    public void U0(k.c cVar) {
        this.f44284q0 = cVar;
    }

    @Override // androidx.constraintlayout.core.state.f, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
        R0();
        int i10 = a.f44287a[this.f44284q0.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        this.f44286s0.v2(i11);
        this.f44286s0.w2(this.f44285r0);
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a e0(int i10) {
        this.f44285r0 = i10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a f0(Object obj) {
        e0(this.f44278m0.g(obj));
        return this;
    }
}
