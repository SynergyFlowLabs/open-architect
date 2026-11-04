package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.m2;
import androidx.compose.runtime.k7;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
final class a implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.lazy.layout.i1.b f16632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f16635f;

    public a() {
        this(0, 1, null);
    }

    private final int d(f0 f0Var, boolean z10) {
        return z10 ? ((v) CollectionsKt.last((List) f0Var.h())).getIndex() + 1 : ((v) CollectionsKt.first((List) f0Var.h())).getIndex() - 1;
    }

    private final void f(f0 f0Var, int i10, boolean z10) {
        if (i10 == -1 || f0Var.h().isEmpty() || i10 == d(f0Var, z10)) {
            return;
        }
        h();
    }

    private final void h() {
        this.f16631b = -1;
        androidx.compose.foundation.lazy.layout.i1.b bVar = this.f16632c;
        if (bVar != null) {
            bVar.cancel();
        }
        this.f16632c = null;
    }

    @Override // androidx.compose.foundation.lazy.t0
    public void a(@NotNull m2 m2Var, int i10) {
        int iE = m2Var.e() == -1 ? this.f16630a : m2Var.e();
        for (int i11 = 0; i11 < iE; i11++) {
            m2Var.d(i10 + i11);
        }
    }

    @Override // androidx.compose.foundation.lazy.t0
    public void e(@NotNull s0 s0Var, float f10, @NotNull f0 f0Var) {
        androidx.compose.foundation.lazy.layout.i1.b bVar;
        androidx.compose.foundation.lazy.layout.i1.b bVar2;
        if (!f0Var.h().isEmpty()) {
            boolean z10 = f10 < 0.0f;
            int iD = d(f0Var, z10);
            if (iD >= 0 && iD < f0Var.c()) {
                if (iD != this.f16631b) {
                    if (this.f16633d != z10) {
                        h();
                    }
                    this.f16633d = z10;
                    this.f16631b = iD;
                    this.f16632c = s0.b(s0Var, iD, null, 2, null);
                }
                if (z10) {
                    v vVar = (v) CollectionsKt.last((List) f0Var.h());
                    if (((vVar.getOffset() + vVar.getSize()) + f0Var.g()) - f0Var.e() < (-f10) && (bVar2 = this.f16632c) != null) {
                        bVar2.c();
                    }
                } else if (f0Var.d() - ((v) CollectionsKt.first((List) f0Var.h())).getOffset() < f10 && (bVar = this.f16632c) != null) {
                    bVar.c();
                }
            }
        }
        this.f16635f = f10;
    }

    @Override // androidx.compose.foundation.lazy.t0
    public void g(@NotNull s0 s0Var, @NotNull f0 f0Var) {
        f(f0Var, this.f16631b, this.f16633d);
        int iC = f0Var.c();
        int i10 = this.f16634e;
        if (i10 != -1 && this.f16635f != 0.0f && i10 != iC && !f0Var.h().isEmpty()) {
            int iD = d(f0Var, this.f16635f < 0.0f);
            if (iD >= 0 && iD < iC) {
                this.f16631b = iD;
                this.f16632c = s0.b(s0Var, iD, null, 2, null);
            }
        }
        this.f16634e = iC;
    }

    public a(int i10) {
        this.f16630a = i10;
        this.f16631b = -1;
        this.f16634e = -1;
    }

    public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
