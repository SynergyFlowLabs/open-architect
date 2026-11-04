package fd;

import android.os.Bundle;
import com.planner5d.library.services.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final f f275144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final int f275145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public final boolean f275146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public final boolean f275147d;

    public g(@NotNull f product, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f275144a = product;
        this.f275145b = i10;
        this.f275146c = z10;
        this.f275147d = i10 > 0;
    }

    public final boolean a() {
        return this.f275144a.p();
    }

    public final boolean b() {
        String strC;
        i iVarK = this.f275144a.k();
        return (iVarK == null || (strC = iVarK.c()) == null || !StringsKt.V2(strC, r.trial.f224891a, false, 2, null)) ? false : true;
    }

    @NotNull
    public final Bundle c() {
        return new com.planner5d.library.services.utility.i().h(r.product, this.f275144a.s()).m(r.canPurchase, this.f275146c).f(r.purchased, this.f275145b).a();
    }

    public g(@Nullable Bundle bundle) {
        this(new com.planner5d.library.services.utility.j(bundle));
    }

    private g(com.planner5d.library.services.utility.j jVar) {
        this(new f(jVar.h(r.product, Bundle.EMPTY)), jVar.c(r.purchased, 0), jVar.f(r.canPurchase, false));
    }
}
