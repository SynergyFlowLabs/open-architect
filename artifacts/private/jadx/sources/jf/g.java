package jf;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final hf.c f307435a;

    public g(@NotNull hf.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f307435a = builder;
    }

    @Override // jf.e
    @NotNull
    public kf.b k() {
        hf.c cVar = this.f307435a;
        k kVar = new k(0.0f, 0.0f);
        k kVar2 = new k(510.0f, 0.0f);
        kf.e eVar = kf.e.Orange;
        hf.b bVarD = cVar.b(kVar, kVar2, eVar).d("210", 250, 85);
        hf.c cVar2 = this.f307435a;
        k kVar3 = new k(510.0f, 0.0f);
        k kVar4 = new k(510.0f, 510.0f);
        kf.e eVar2 = kf.e.Blue;
        hf.b bVarB = cVar2.b(kVar3, kVar4, eVar2);
        hf.b bVarC = this.f307435a.b(new k(510.0f, 510.0f), new k(0.0f, 510.0f), eVar).c("122", 400, 0);
        return this.f307435a.a(bVarD, bVarC, 200, 600, eVar2).a(bVarB, this.f307435a.b(new k(0.0f, 510.0f), new k(0.0f, 0.0f), eVar2), 250, 600, eVar).d();
    }
}
