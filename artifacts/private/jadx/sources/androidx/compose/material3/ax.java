package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class ax {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f26145j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.e f26153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private vd f26154i;

    public ax() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ax b(ax axVar, androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = axVar.f26146a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = axVar.f26147b;
        }
        if ((i10 & 4) != 0) {
            eVar3 = axVar.f26148c;
        }
        if ((i10 & 8) != 0) {
            eVar4 = axVar.f26149d;
        }
        if ((i10 & 16) != 0) {
            eVar5 = axVar.f26150e;
        }
        androidx.compose.foundation.shape.e eVar6 = eVar5;
        androidx.compose.foundation.shape.e eVar7 = eVar3;
        return axVar.a(eVar, eVar2, eVar7, eVar4, eVar6);
    }

    public static /* synthetic */ ax d(ax axVar, androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, androidx.compose.foundation.shape.e eVar6, androidx.compose.foundation.shape.e eVar7, androidx.compose.foundation.shape.e eVar8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = axVar.f26146a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = axVar.f26147b;
        }
        if ((i10 & 4) != 0) {
            eVar3 = axVar.f26148c;
        }
        if ((i10 & 8) != 0) {
            eVar4 = axVar.f26149d;
        }
        if ((i10 & 16) != 0) {
            eVar5 = axVar.f26150e;
        }
        if ((i10 & 32) != 0) {
            eVar6 = axVar.f26151f;
        }
        if ((i10 & 64) != 0) {
            eVar7 = axVar.f26152g;
        }
        if ((i10 & 128) != 0) {
            eVar8 = axVar.f26153h;
        }
        androidx.compose.foundation.shape.e eVar9 = eVar7;
        androidx.compose.foundation.shape.e eVar10 = eVar8;
        androidx.compose.foundation.shape.e eVar11 = eVar5;
        androidx.compose.foundation.shape.e eVar12 = eVar6;
        return axVar.c(eVar, eVar2, eVar3, eVar4, eVar11, eVar12, eVar9, eVar10);
    }

    @NotNull
    public final ax a(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.e eVar2, @NotNull androidx.compose.foundation.shape.e eVar3, @NotNull androidx.compose.foundation.shape.e eVar4, @NotNull androidx.compose.foundation.shape.e eVar5) {
        return new ax(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    @NotNull
    public final ax c(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.e eVar2, @NotNull androidx.compose.foundation.shape.e eVar3, @NotNull androidx.compose.foundation.shape.e eVar4, @NotNull androidx.compose.foundation.shape.e eVar5, @NotNull androidx.compose.foundation.shape.e eVar6, @NotNull androidx.compose.foundation.shape.e eVar7, @NotNull androidx.compose.foundation.shape.e eVar8) {
        return new ax(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    @Nullable
    public final vd e() {
        return this.f26154i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return Intrinsics.areEqual(this.f26146a, axVar.f26146a) && Intrinsics.areEqual(this.f26147b, axVar.f26147b) && Intrinsics.areEqual(this.f26148c, axVar.f26148c) && Intrinsics.areEqual(this.f26149d, axVar.f26149d) && Intrinsics.areEqual(this.f26150e, axVar.f26150e) && Intrinsics.areEqual(this.f26151f, axVar.f26151f) && Intrinsics.areEqual(this.f26152g, axVar.f26152g) && Intrinsics.areEqual(this.f26153h, axVar.f26153h);
    }

    @NotNull
    public final androidx.compose.foundation.shape.e f() {
        return this.f26153h;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e g() {
        return this.f26150e;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e h() {
        return this.f26152g;
    }

    public int hashCode() {
        return (((((((((((((this.f26146a.hashCode() * 31) + this.f26147b.hashCode()) * 31) + this.f26148c.hashCode()) * 31) + this.f26149d.hashCode()) * 31) + this.f26150e.hashCode()) * 31) + this.f26151f.hashCode()) * 31) + this.f26152g.hashCode()) * 31) + this.f26153h.hashCode();
    }

    @NotNull
    public final androidx.compose.foundation.shape.e i() {
        return this.f26146a;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e j() {
        return this.f26149d;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e k() {
        return this.f26151f;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e l() {
        return this.f26148c;
    }

    @NotNull
    public final androidx.compose.foundation.shape.e m() {
        return this.f26147b;
    }

    public final void n(@Nullable vd vdVar) {
        this.f26154i = vdVar;
    }

    @NotNull
    public String toString() {
        return "Shapes(extraSmall=" + this.f26146a + ", small=" + this.f26147b + ", medium=" + this.f26148c + ", large=" + this.f26149d + ", largeIncreased=" + this.f26151f + ", extraLarge=" + this.f26150e + ", extralargeIncreased=" + this.f26152g + ", extraExtraLarge=" + this.f26153h + ')';
    }

    public ax(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.e eVar2, @NotNull androidx.compose.foundation.shape.e eVar3, @NotNull androidx.compose.foundation.shape.e eVar4, @NotNull androidx.compose.foundation.shape.e eVar5, @NotNull androidx.compose.foundation.shape.e eVar6, @NotNull androidx.compose.foundation.shape.e eVar7, @NotNull androidx.compose.foundation.shape.e eVar8) {
        this.f26146a = eVar;
        this.f26147b = eVar2;
        this.f26148c = eVar3;
        this.f26149d = eVar4;
        this.f26150e = eVar5;
        this.f26151f = eVar6;
        this.f26152g = eVar7;
        this.f26153h = eVar8;
    }

    public /* synthetic */ ax(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, androidx.compose.foundation.shape.e eVar6, androidx.compose.foundation.shape.e eVar7, androidx.compose.foundation.shape.e eVar8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? yw.f34847a.n() : eVar, (i10 & 2) != 0 ? yw.f34847a.r() : eVar2, (i10 & 4) != 0 ? yw.f34847a.q() : eVar3, (i10 & 8) != 0 ? yw.f34847a.o() : eVar4, (i10 & 16) != 0 ? yw.f34847a.l() : eVar5, (i10 & 32) != 0 ? yw.f34847a.p() : eVar6, (i10 & 64) != 0 ? yw.f34847a.m() : eVar7, (i10 & 128) != 0 ? yw.f34847a.k() : eVar8);
    }

    public /* synthetic */ ax(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? yw.f34847a.n() : eVar, (i10 & 2) != 0 ? yw.f34847a.r() : eVar2, (i10 & 4) != 0 ? yw.f34847a.q() : eVar3, (i10 & 8) != 0 ? yw.f34847a.o() : eVar4, (i10 & 16) != 0 ? yw.f34847a.l() : eVar5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ax(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.e eVar2, @NotNull androidx.compose.foundation.shape.e eVar3, @NotNull androidx.compose.foundation.shape.e eVar4, @NotNull androidx.compose.foundation.shape.e eVar5) {
        yw ywVar = yw.f34847a;
        this(eVar, eVar2, eVar3, eVar4, eVar5, ywVar.p(), ywVar.m(), ywVar.k());
    }
}
