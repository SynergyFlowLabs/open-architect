package jf;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final hf.c f307434a;

    public f(@NotNull hf.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f307434a = builder;
    }

    @Override // jf.e
    @NotNull
    public kf.b k() {
        hf.b bVarD = hf.c.c(this.f307434a, new k(10.0f, 23.0f), new k(147.0f, -93.0f), null, 4, null).d("s/2012", 87, 70);
        hf.c.c(this.f307434a, new k(147.0f, -93.0f), new k(373.0f, -93.0f), null, 4, null).d("s/2012", com.rabbitmq.client.impl.k.b.p.f265340a, 70);
        hf.c.c(this.f307434a, new k(373.0f, -93.0f), new k(510.0f, 23.0f), null, 4, null).d("s/2012", 87, 70);
        hf.c cVar = this.f307434a;
        k kVar = new k(510.0f, 23.0f);
        k kVar2 = new k(510.0f, 310.0f);
        kf.e eVar = kf.e.Blue;
        cVar.b(kVar, kVar2, eVar);
        hf.b bVarC = hf.c.c(this.f307434a, new k(510.0f, 310.0f), new k(10.0f, 310.0f), null, 4, null).c("122", 400, 0);
        this.f307434a.b(new k(10.0f, 310.0f), new k(10.0f, 23.0f), eVar);
        return this.f307434a.a(bVarD, bVarC, 120, 600, eVar).d();
    }
}
