package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@af
public final class oc implements androidx.compose.ui.graphics.q3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f31343b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31344a;

    public /* synthetic */ oc(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public final long a() {
        return this.f31344a;
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public androidx.compose.ui.graphics.f2 mo0createOutlinePq9zytI(long j10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar) {
        androidx.compose.ui.graphics.k2 k2VarA = androidx.compose.ui.graphics.u.a();
        float fS7 = dVar.S7(androidx.compose.ui.unit.l.p(this.f31344a));
        float fS8 = dVar.S7(androidx.compose.ui.unit.l.m(this.f31344a));
        k2VarA.A(0.0f, 0.0f);
        float f10 = 2;
        k2VarA.F(fS7 / f10, 0.0f);
        k2VarA.F(0.0f, fS8);
        k2VarA.F((-fS7) / f10, 0.0f);
        k2VarA.close();
        return new androidx.compose.ui.graphics.f2.a(k2VarA);
    }

    private oc(long j10) {
        this.f31344a = j10;
    }

    public /* synthetic */ oc(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u80.f33535a.d() : j10, null);
    }
}
