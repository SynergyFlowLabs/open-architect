package androidx.compose.ui.graphics;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTesterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final k2 f38102a = u.a();

    @NotNull
    public static final o2 a(@NotNull k2 k2Var, @androidx.annotation.x(from = 0.0d) float f10) {
        o2 o2Var = new o2();
        o2Var.b(k2Var, f10);
        return o2Var;
    }

    public static /* synthetic */ o2 b(k2 k2Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        return a(k2Var, f10);
    }
}
