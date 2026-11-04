package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.q3;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t extends androidx.compose.ui.a0.d implements androidx.compose.ui.modifier.j, androidx.compose.ui.layout.i, androidx.compose.ui.node.g0 {

    @NotNull
    public static final b X = new b(null);
    public static final int Y = 8;

    @NotNull
    private static final a Z = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private u f17581s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private q f17582t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f17583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private q3 f17584w;

    public static final class a implements androidx.compose.ui.layout.i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f17585a;

        a() {
        }

        @Override // androidx.compose.ui.layout.i.a
        public boolean a() {
            return this.f17585a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17586a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17586a = iArr;
        }
    }

    public static final class d implements androidx.compose.ui.layout.i.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<q.a> f17588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17589c;

        d(kotlin.jvm.internal.i1.h<q.a> hVar, int i10) {
            this.f17588b = hVar;
            this.f17589c = i10;
        }

        @Override // androidx.compose.ui.layout.i.a
        public boolean a() {
            return t.this.y9(this.f17588b.f312751a, this.f17589c);
        }
    }

    public t(@NotNull u uVar, @NotNull q qVar, boolean z10, @NotNull q3 q3Var) {
        this.f17581s = uVar;
        this.f17582t = qVar;
        this.f17583v = z10;
        this.f17584w = q3Var;
    }

    private final boolean A9(int i10) {
        androidx.compose.ui.layout.i.b.a aVar = androidx.compose.ui.layout.i.b.f39357b;
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.a()) || androidx.compose.ui.layout.i.b.j(i10, aVar.d())) {
            return this.f17584w == q3.Horizontal;
        }
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.e()) || androidx.compose.ui.layout.i.b.j(i10, aVar.f())) {
            return this.f17584w == q3.Vertical;
        }
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.c()) || androidx.compose.ui.layout.i.b.j(i10, aVar.b())) {
            return false;
        }
        r.c();
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final q.a x9(q.a aVar, int i10) {
        int iF = aVar.f();
        int iE = aVar.e();
        if (z9(i10)) {
            iE++;
        } else {
            iF--;
        }
        return this.f17582t.a(iF, iE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y9(q.a aVar, int i10) {
        if (A9(i10)) {
            return false;
        }
        if (z9(i10)) {
            return aVar.e() < this.f17581s.a() - 1;
        }
        return aVar.f() > 0;
    }

    private final boolean z9(int i10) {
        androidx.compose.ui.layout.i.b.a aVar = androidx.compose.ui.layout.i.b.f39357b;
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.c())) {
            return false;
        }
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.b())) {
            return true;
        }
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.a())) {
            return this.f17583v;
        }
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.d())) {
            return !this.f17583v;
        }
        if (androidx.compose.ui.layout.i.b.j(i10, aVar.e())) {
            int i11 = c.f17586a[androidx.compose.ui.node.k.t(this).ordinal()];
            if (i11 == 1) {
                return this.f17583v;
            }
            if (i11 == 2) {
                return !this.f17583v;
            }
            throw new kotlin.k0();
        }
        if (!androidx.compose.ui.layout.i.b.j(i10, aVar.f())) {
            r.c();
            throw new kotlin.a0();
        }
        int i12 = c.f17586a[androidx.compose.ui.node.k.t(this).ordinal()];
        if (i12 == 1) {
            return !this.f17583v;
        }
        if (i12 == 2) {
            return this.f17583v;
        }
        throw new kotlin.k0();
    }

    public final void C9(@NotNull u uVar, @NotNull q qVar, boolean z10, @NotNull q3 q3Var) {
        this.f17581s = uVar;
        this.f17582t = qVar;
        this.f17583v = z10;
        this.f17584w = q3Var;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.lazy.layout.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.B9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.i
    @Nullable
    public <T> T t5(int i10, @NotNull Function1<? super androidx.compose.ui.layout.i.a, ? extends T> function1) {
        if (this.f17581s.a() > 0 && this.f17581s.b() && a9()) {
            int iE = z9(i10) ? this.f17581s.e() : this.f17581s.d();
            kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
            hVar.f312751a = (T) this.f17582t.a(iE, iE);
            int iB = kotlin.ranges.r.B(this.f17581s.c() * 2, this.f17581s.a());
            T tInvoke = null;
            int i11 = 0;
            int i12 = 5 ^ 0;
            while (tInvoke == null && y9((q.a) hVar.f312751a, i10) && i11 < iB) {
                T t10 = (T) x9((q.a) hVar.f312751a, i10);
                this.f17582t.e((q.a) hVar.f312751a);
                hVar.f312751a = t10;
                i11++;
                androidx.compose.ui.node.j0.d(this);
                tInvoke = function1.invoke(new d(hVar, i10));
            }
            this.f17582t.e((q.a) hVar.f312751a);
            androidx.compose.ui.node.j0.d(this);
            return tInvoke;
        }
        return function1.invoke(Z);
    }

    @Override // androidx.compose.ui.modifier.j
    @NotNull
    public androidx.compose.ui.modifier.i x1() {
        return androidx.compose.ui.modifier.k.d(TuplesKt.to(androidx.compose.ui.layout.j.a(), this));
    }
}
