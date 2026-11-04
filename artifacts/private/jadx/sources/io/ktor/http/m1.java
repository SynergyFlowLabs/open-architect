package io.ktor.http;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m1 {
    @NotNull
    public static final List<l1> a() {
        l1.a aVar = l1.f295939c;
        return CollectionsKt.listOf((Object[]) new l1[]{aVar.g(), aVar.S(), aVar.I(), aVar.C(), aVar.h(), aVar.b(), aVar.x(), aVar.w(), aVar.O(), aVar.D(), aVar.u(), aVar.v(), aVar.t(), aVar.l(), aVar.P(), aVar.B(), aVar.a0(), aVar.R(), aVar.T(), aVar.G(), aVar.e(), aVar.W(), aVar.F(), aVar.k(), aVar.z(), aVar.s(), aVar.y(), aVar.J(), aVar.L(), aVar.f(), aVar.n(), aVar.q(), aVar.H(), aVar.E(), aVar.M(), aVar.Y(), aVar.N(), aVar.i(), aVar.X(), aVar.r(), aVar.j(), aVar.U(), aVar.Z(), aVar.V(), aVar.K(), aVar.p(), aVar.A(), aVar.d(), aVar.Q(), aVar.m(), aVar.c0(), aVar.b0(), aVar.o()});
    }

    public static final boolean b(@NotNull l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        int iH0 = l1Var.H0();
        return 200 <= iH0 && iH0 < 300;
    }
}
