package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class s0 extends g0 {
    private static final int N3 = 1;
    private static final int O3 = 2;
    private static final int P3 = 4;
    private static final int Q3 = 8;
    public static final int R3 = 0;
    public static final int S3 = 1;
    ArrayList<g0> I3;
    private boolean J3;
    int K3;
    boolean L3;
    private int M3;

    class a extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f75762a;

        a(g0 g0Var) {
            this.f75762a = g0Var;
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            this.f75762a.B0();
            g0Var.u0(this);
        }
    }

    class b extends o0 {
        b() {
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
            s0.this.I3.remove(g0Var);
            if (s0.this.d0()) {
                return;
            }
            s0.this.p0(g0.k.f75679c, false);
            s0 s0Var = s0.this;
            s0Var.f75633h3 = true;
            s0Var.p0(g0.k.f75678b, false);
        }
    }

    static class c extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s0 f75765a;

        c(s0 s0Var) {
            this.f75765a = s0Var;
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
            s0 s0Var = this.f75765a;
            if (!s0Var.L3) {
                s0Var.L0();
                this.f75765a.L3 = true;
            }
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            s0 s0Var = this.f75765a;
            int i10 = s0Var.K3 - 1;
            s0Var.K3 = i10;
            if (i10 == 0) {
                s0Var.L3 = false;
                s0Var.w();
            }
            g0Var.u0(this);
        }
    }

    public s0() {
        this.I3 = new ArrayList<>();
        this.J3 = true;
        this.L3 = false;
        this.M3 = 0;
    }

    private void T0(@NonNull g0 g0Var) {
        this.I3.add(g0Var);
        g0Var.f75656v = this;
    }

    private int X0(long j10) {
        for (int i10 = 1; i10 < this.I3.size(); i10++) {
            if (this.I3.get(i10).f75653r3 > j10) {
                return i10 - 1;
            }
        }
        return this.I3.size() - 1;
    }

    private void i1() {
        c cVar = new c(this);
        Iterator<g0> it = this.I3.iterator();
        while (it.hasNext()) {
            it.next().c(cVar);
        }
        this.K3 = this.I3.size();
    }

    @Override // androidx.transition.g0
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected void B0() {
        if (this.I3.isEmpty()) {
            L0();
            w();
            return;
        }
        i1();
        if (this.J3) {
            Iterator<g0> it = this.I3.iterator();
            while (it.hasNext()) {
                it.next().B0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.I3.size(); i10++) {
            this.I3.get(i10 - 1).c(new a(this.I3.get(i10)));
        }
        g0 g0Var = this.I3.get(0);
        if (g0Var != null) {
            g0Var.B0();
        }
    }

    @Override // androidx.transition.g0
    void C0(boolean z10) {
        super.C0(z10);
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).C0(z10);
        }
    }

    @Override // androidx.transition.g0
    @NonNull
    public g0 D(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.I3.size(); i11++) {
            this.I3.get(i11).D(i10, z10);
        }
        return super.D(i10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.g0
    @androidx.annotation.w0(34)
    void D0(long j10, long j11) {
        long j12;
        long jA0 = a0();
        long j13 = 0;
        if (this.f75656v != null) {
            if (j10 < 0 && j11 < 0) {
                return;
            }
            if (j10 > jA0 && j11 > jA0) {
                return;
            }
        }
        boolean z10 = j10 < j11;
        if ((j10 >= 0 && j11 < 0) || (j10 <= jA0 && j11 > jA0)) {
            this.f75633h3 = false;
            p0(g0.k.f75677a, z10);
        }
        if (!this.J3) {
            int iX0 = X0(j11);
            if (j10 >= j11) {
                while (true) {
                    if (iX0 < this.I3.size()) {
                        g0 g0Var = this.I3.get(iX0);
                        long j14 = g0Var.f75653r3;
                        j12 = j13;
                        long j15 = j10 - j14;
                        if (j15 < j12) {
                            break;
                        }
                        g0Var.D0(j15, j11 - j14);
                        iX0++;
                        j13 = j12;
                    }
                }
            } else {
                j12 = 0;
                while (iX0 >= 0) {
                    g0 g0Var2 = this.I3.get(iX0);
                    long j16 = g0Var2.f75653r3;
                    long j17 = j10 - j16;
                    g0Var2.D0(j17, j11 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        iX0--;
                    }
                }
            }
            if (this.f75656v != null) {
                if ((j10 > jA0 || j11 > jA0) && (j10 >= 0 || j11 < j12)) {
                    return;
                }
                if (j10 > jA0) {
                    this.f75633h3 = true;
                }
                p0(g0.k.f75678b, z10);
            }
        }
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).D0(j10, j11);
        }
        j12 = j13;
        if (this.f75656v != null) {
            if (j10 > jA0) {
                return;
            } else {
                return;
            }
            if (j10 > jA0) {
                this.f75633h3 = true;
            }
            p0(g0.k.f75678b, z10);
        }
    }

    @Override // androidx.transition.g0
    @NonNull
    public g0 E(@NonNull View view, boolean z10) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).E(view, z10);
        }
        return super.E(view, z10);
    }

    @Override // androidx.transition.g0
    @NonNull
    public g0 F(@NonNull Class<?> cls, boolean z10) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).F(cls, z10);
        }
        return super.F(cls, z10);
    }

    @Override // androidx.transition.g0
    public void F0(@androidx.annotation.p0 g0.f fVar) {
        super.F0(fVar);
        this.M3 |= 8;
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).F0(fVar);
        }
    }

    @Override // androidx.transition.g0
    @NonNull
    public g0 G(@NonNull String str, boolean z10) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).G(str, z10);
        }
        return super.G(str, z10);
    }

    @Override // androidx.transition.g0
    public void I0(@androidx.annotation.p0 w wVar) {
        super.I0(wVar);
        this.M3 |= 4;
        if (this.I3 != null) {
            for (int i10 = 0; i10 < this.I3.size(); i10++) {
                this.I3.get(i10).I0(wVar);
            }
        }
    }

    @Override // androidx.transition.g0
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void J(ViewGroup viewGroup) {
        super.J(viewGroup);
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).J(viewGroup);
        }
    }

    @Override // androidx.transition.g0
    public void J0(@androidx.annotation.p0 q0 q0Var) {
        super.J0(q0Var);
        this.M3 |= 2;
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).J0(q0Var);
        }
    }

    @Override // androidx.transition.g0
    String M0(String str) {
        String strM0 = super.M0(str);
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM0);
            sb2.append("\n");
            sb2.append(this.I3.get(i10).M0(str + "  "));
            strM0 = sb2.toString();
        }
        return strM0;
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public s0 c(@NonNull g0.j jVar) {
        return (s0) super.c(jVar);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public s0 d(@androidx.annotation.d0 int i10) {
        for (int i11 = 0; i11 < this.I3.size(); i11++) {
            this.I3.get(i11).d(i10);
        }
        return (s0) super.d(i10);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public s0 e(@NonNull View view) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).e(view);
        }
        return (s0) super.e(view);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public s0 f(@NonNull Class<?> cls) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).f(cls);
        }
        return (s0) super.f(cls);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public s0 g(@NonNull String str) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).g(str);
        }
        return (s0) super.g(str);
    }

    @NonNull
    public s0 S0(@NonNull g0 g0Var) {
        T0(g0Var);
        long j10 = this.f75626c;
        if (j10 >= 0) {
            g0Var.E0(j10);
        }
        if ((this.M3 & 1) != 0) {
            g0Var.G0(N());
        }
        if ((this.M3 & 2) != 0) {
            g0Var.J0(S());
        }
        if ((this.M3 & 4) != 0) {
            g0Var.I0(Q());
        }
        if ((this.M3 & 8) != 0) {
            g0Var.F0(M());
        }
        return this;
    }

    public int U0() {
        return !this.J3 ? 1 : 0;
    }

    @androidx.annotation.p0
    public g0 V0(int i10) {
        if (i10 < 0 || i10 >= this.I3.size()) {
            return null;
        }
        return this.I3.get(i10);
    }

    public int W0() {
        return this.I3.size();
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public s0 u0(@NonNull g0.j jVar) {
        return (s0) super.u0(jVar);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public s0 v0(@androidx.annotation.d0 int i10) {
        for (int i11 = 0; i11 < this.I3.size(); i11++) {
            this.I3.get(i11).v0(i10);
        }
        return (s0) super.v0(i10);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public s0 w0(@NonNull View view) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).w0(view);
        }
        return (s0) super.w0(view);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public s0 x0(@NonNull Class<?> cls) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).x0(cls);
        }
        return (s0) super.x0(cls);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public s0 y0(@NonNull String str) {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            this.I3.get(i10).y0(str);
        }
        return (s0) super.y0(str);
    }

    @Override // androidx.transition.g0
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        super.cancel();
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).cancel();
        }
    }

    @Override // androidx.transition.g0
    boolean d0() {
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            if (this.I3.get(i10).d0()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public s0 d1(@NonNull g0 g0Var) {
        this.I3.remove(g0Var);
        g0Var.f75656v = null;
        return this;
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.I3.get(i10).e0()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public s0 E0(long j10) {
        ArrayList<g0> arrayList;
        super.E0(j10);
        if (this.f75626c >= 0 && (arrayList = this.I3) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.I3.get(i10).E0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public s0 G0(@androidx.annotation.p0 TimeInterpolator timeInterpolator) {
        this.M3 |= 1;
        ArrayList<g0> arrayList = this.I3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.I3.get(i10).G0(timeInterpolator);
            }
        }
        return (s0) super.G0(timeInterpolator);
    }

    @NonNull
    public s0 g1(int i10) {
        if (i10 == 0) {
            this.J3 = true;
            return this;
        }
        if (i10 == 1) {
            this.J3 = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public s0 K0(long j10) {
        return (s0) super.K0(j10);
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        if (h0(u0Var.f75776b)) {
            for (g0 g0Var : this.I3) {
                if (g0Var.h0(u0Var.f75776b)) {
                    g0Var.l(u0Var);
                    u0Var.f75777c.add(g0Var);
                }
            }
        }
    }

    @Override // androidx.transition.g0
    void o(u0 u0Var) {
        super.o(u0Var);
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).o(u0Var);
        }
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        if (h0(u0Var.f75776b)) {
            for (g0 g0Var : this.I3) {
                if (g0Var.h0(u0Var.f75776b)) {
                    g0Var.p(u0Var);
                    u0Var.f75777c.add(g0Var);
                }
            }
        }
    }

    @Override // androidx.transition.g0
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void r0(@androidx.annotation.p0 View view) {
        super.r0(view);
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).r0(view);
        }
    }

    @Override // androidx.transition.g0
    @NonNull
    /* JADX INFO: renamed from: s */
    public g0 clone() {
        s0 s0Var = (s0) super.clone();
        s0Var.I3 = new ArrayList<>();
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0Var.T0(this.I3.get(i10).clone());
        }
        return s0Var;
    }

    @Override // androidx.transition.g0
    @androidx.annotation.w0(34)
    void t0() {
        this.f75651p3 = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.I3.size(); i10++) {
            g0 g0Var = this.I3.get(i10);
            g0Var.c(bVar);
            g0Var.t0();
            long jA0 = g0Var.a0();
            if (this.J3) {
                this.f75651p3 = Math.max(this.f75651p3, jA0);
            } else {
                long j10 = this.f75651p3;
                g0Var.f75653r3 = j10;
                this.f75651p3 = j10 + jA0;
            }
        }
    }

    @Override // androidx.transition.g0
    void u(@NonNull ViewGroup viewGroup, @NonNull v0 v0Var, @NonNull v0 v0Var2, @NonNull ArrayList<u0> arrayList, @NonNull ArrayList<u0> arrayList2) {
        long jV = V();
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            g0 g0Var = this.I3.get(i10);
            if (jV > 0 && (this.J3 || i10 == 0)) {
                long jV2 = g0Var.V();
                if (jV2 > 0) {
                    g0Var.K0(jV2 + jV);
                } else {
                    g0Var.K0(jV);
                }
            }
            g0Var.u(viewGroup, v0Var, v0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.g0
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void z0(@androidx.annotation.p0 View view) {
        super.z0(view);
        int size = this.I3.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I3.get(i10).z0(view);
        }
    }

    public s0(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I3 = new ArrayList<>();
        this.J3 = true;
        this.L3 = false;
        this.M3 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75572i);
        g1(androidx.core.content.res.n.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
