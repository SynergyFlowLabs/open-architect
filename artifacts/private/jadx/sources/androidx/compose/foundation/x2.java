package androidx.compose.foundation;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
final class x2 implements androidx.compose.ui.draw.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u2 f21893a;

    public x2(@NotNull u2 u2Var) {
        this.f21893a = u2Var;
    }

    @Override // androidx.compose.ui.draw.m
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        this.f21893a.a(cVar);
    }

    @NotNull
    public final u2 a() {
        return this.f21893a;
    }
}
