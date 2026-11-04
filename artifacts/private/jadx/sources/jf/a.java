package jf;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final hf.c f307430a;

    public a(@NotNull hf.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f307430a = builder;
    }

    @Override // jf.e
    @NotNull
    public kf.b k() {
        hf.c cVar = this.f307430a;
        k kVar = new k(0.0f, 0.0f);
        k kVar2 = new k(337.0f, 0.0f);
        kf.e eVar = kf.e.Yellow;
        hf.b bVarD = cVar.b(kVar, kVar2, eVar).d("210", 168, 85);
        hf.b bVarC = hf.c.c(this.f307430a, new k(337.0f, 0.0f), new k(500.0f, 153.0f), null, 4, null);
        hf.b bVarC2 = hf.c.c(this.f307430a, new k(500.0f, 153.0f), new k(500.0f, 500.0f), null, 4, null);
        hf.c cVar2 = this.f307430a;
        k kVar3 = new k(500.0f, 500.0f);
        k kVar4 = new k(0.0f, 500.0f);
        kf.e eVar2 = kf.e.Orange;
        hf.b bVarC3 = cVar2.b(kVar3, kVar4, eVar2).c("122", 400, 0);
        hf.c cVar3 = this.f307430a;
        k kVar5 = new k(0.0f, 500.0f);
        k kVar6 = new k(0.0f, 0.0f);
        kf.e eVar3 = kf.e.Blue;
        hf.b bVarB = cVar3.b(kVar5, kVar6, eVar3);
        return this.f307430a.a(bVarD, bVarC3, 250, 600, eVar3).a(bVarC2, bVarB, 430, 680, eVar2).a(bVarC, bVarB, 269, 518, eVar).d();
    }
}
