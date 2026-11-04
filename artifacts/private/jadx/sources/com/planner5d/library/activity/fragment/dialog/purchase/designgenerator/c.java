package com.planner5d.library.activity.fragment.dialog.purchase.designgenerator;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f132542i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fd.f f132543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k3 f132544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k3 f132545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f132546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k3 f132547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f132548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f132549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f132550h;

    public c(@NotNull fd.f product, @NotNull k3 title, @NotNull k3 description, int i10, @NotNull k3 price, boolean z10, boolean z11, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f132543a = product;
        this.f132544b = title;
        this.f132545c = description;
        this.f132546d = i10;
        this.f132547e = price;
        this.f132548f = z10;
        this.f132549g = z11;
        this.f132550h = action;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c j(c cVar, fd.f fVar, k3 k3Var, k3 k3Var2, int i10, k3 k3Var3, boolean z10, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = cVar.f132543a;
        }
        if ((i11 & 2) != 0) {
            k3Var = cVar.f132544b;
        }
        if ((i11 & 4) != 0) {
            k3Var2 = cVar.f132545c;
        }
        if ((i11 & 8) != 0) {
            i10 = cVar.f132546d;
        }
        if ((i11 & 16) != 0) {
            k3Var3 = cVar.f132547e;
        }
        if ((i11 & 32) != 0) {
            z10 = cVar.f132548f;
        }
        if ((i11 & 64) != 0) {
            z11 = cVar.f132549g;
        }
        if ((i11 & 128) != 0) {
            function0 = cVar.f132550h;
        }
        boolean z12 = z11;
        Function0 function1 = function0;
        k3 k3Var4 = k3Var3;
        boolean z13 = z10;
        return cVar.i(fVar, k3Var, k3Var2, i10, k3Var4, z13, z12, function1);
    }

    @NotNull
    public final fd.f a() {
        return this.f132543a;
    }

    @NotNull
    public final k3 b() {
        return this.f132544b;
    }

    @NotNull
    public final k3 c() {
        return this.f132545c;
    }

    public final int d() {
        return this.f132546d;
    }

    @NotNull
    public final k3 e() {
        return this.f132547e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f132543a, cVar.f132543a) && Intrinsics.areEqual(this.f132544b, cVar.f132544b) && Intrinsics.areEqual(this.f132545c, cVar.f132545c) && this.f132546d == cVar.f132546d && Intrinsics.areEqual(this.f132547e, cVar.f132547e) && this.f132548f == cVar.f132548f && this.f132549g == cVar.f132549g && Intrinsics.areEqual(this.f132550h, cVar.f132550h);
    }

    public final boolean f() {
        return this.f132548f;
    }

    public final boolean g() {
        return this.f132549g;
    }

    @NotNull
    public final Function0<Unit> h() {
        return this.f132550h;
    }

    public int hashCode() {
        return (((((((((((((this.f132543a.hashCode() * 31) + this.f132544b.hashCode()) * 31) + this.f132545c.hashCode()) * 31) + Integer.hashCode(this.f132546d)) * 31) + this.f132547e.hashCode()) * 31) + Boolean.hashCode(this.f132548f)) * 31) + Boolean.hashCode(this.f132549g)) * 31) + this.f132550h.hashCode();
    }

    @NotNull
    public final c i(@NotNull fd.f product, @NotNull k3 title, @NotNull k3 description, int i10, @NotNull k3 price, boolean z10, boolean z11, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(action, "action");
        return new c(product, title, description, i10, price, z10, z11, action);
    }

    @NotNull
    public final Function0<Unit> k() {
        return this.f132550h;
    }

    @NotNull
    public final k3 l() {
        return this.f132545c;
    }

    public final boolean m() {
        return this.f132548f;
    }

    public final int n() {
        return this.f132546d;
    }

    @NotNull
    public final k3 o() {
        return this.f132547e;
    }

    @NotNull
    public final fd.f p() {
        return this.f132543a;
    }

    public final boolean q() {
        return this.f132549g;
    }

    @NotNull
    public final k3 r() {
        return this.f132544b;
    }

    @NotNull
    public String toString() {
        return "DesignGeneratorPurchaseItemUiState(product=" + this.f132543a + ", title=" + this.f132544b + ", description=" + this.f132545c + ", numberOfImages=" + this.f132546d + ", price=" + this.f132547e + ", mostPopular=" + this.f132548f + ", selected=" + this.f132549g + ", action=" + this.f132550h + ")";
    }

    public /* synthetic */ c(fd.f fVar, k3 k3Var, k3 k3Var2, int i10, k3 k3Var3, boolean z10, boolean z11, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, k3Var, k3Var2, i10, k3Var3, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? false : z11, function0);
    }
}
