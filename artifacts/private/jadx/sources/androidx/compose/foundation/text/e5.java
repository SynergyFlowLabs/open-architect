package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f19193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.f f19194b;

    public e5(@NotNull androidx.compose.ui.text.f fVar) {
        this.f19193a = fVar;
        this.f19194b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.f.e d(kotlin.jvm.internal.i1.a aVar, androidx.compose.ui.text.f.e eVar, androidx.compose.ui.text.c3 c3Var, androidx.compose.ui.text.f.e eVar2) {
        androidx.compose.ui.text.f.e eVar3;
        androidx.compose.ui.text.f.e eVar4;
        if (aVar.f312744a && (eVar2.h() instanceof androidx.compose.ui.text.c3) && eVar2.i() == eVar.i() && eVar2.g() == eVar.g()) {
            eVar3 = new androidx.compose.ui.text.f.e(c3Var == null ? new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65535, (DefaultConstructorMarker) null) : c3Var, eVar2.i(), eVar2.g());
            eVar4 = eVar2;
        } else {
            eVar3 = eVar2;
            eVar4 = eVar3;
        }
        aVar.f312744a = Intrinsics.areEqual(eVar, eVar4);
        return eVar3;
    }

    @NotNull
    public final androidx.compose.ui.text.f b() {
        return this.f19194b;
    }

    public final void c(@NotNull final androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar, @Nullable final androidx.compose.ui.text.c3 c3Var) {
        final kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        this.f19194b = this.f19193a.s(new Function1() { // from class: androidx.compose.foundation.text.d5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e5.d(aVar, eVar, c3Var, (androidx.compose.ui.text.f.e) obj);
            }
        });
    }

    public final void e(@NotNull androidx.compose.ui.text.f fVar) {
        this.f19194b = fVar;
    }
}
