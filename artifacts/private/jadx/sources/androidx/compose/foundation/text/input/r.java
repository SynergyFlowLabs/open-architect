package androidx.compose.foundation.text.input;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import androidx.compose.ui.text.y0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,781:1\n1282#2,6:782\n172#3,8:788\n172#3,8:796\n172#3,8:804\n519#4:812\n1#5:813\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n*L\n661#1:782,6\n681#1:788,8\n705#1:796,8\n727#1:804,8\n744#1:812\n*E\n"})
public final class r {
    public static final void c(@NotNull p pVar) {
        j jVarA = pVar.A();
        try {
            k.b(jVarA, 0, jVarA.r());
            k.g(jVarA);
            pVar.d(jVarA);
        } finally {
            pVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> d(w3 w3Var, androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> dVar) {
        if (dVar == null || dVar.R() == 0) {
            return (w3Var == null || w3.h(w3Var.r())) ? CollectionsKt.emptyList() : CollectionsKt.listOf(new androidx.compose.ui.text.f.e(new c3(0L, 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null), w3.l(w3Var.r()), w3.k(w3Var.r())));
        }
        return CollectionsKt.toList(dVar.q());
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final p e(@Nullable final String str, final long j10, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            j10 = x3.a(str.length());
        }
        if (m0.l0()) {
            m0.A0(1125389485, i10, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:660)");
        }
        Object[] objArr = new Object[0];
        p.b bVar = p.b.f20312a;
        int i12 = 2 ^ 1;
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(str)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.L(j10)) || (i10 & 48) == 32);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.text.input.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.f(str, j10);
                }
            };
            c0Var.Y(objI0);
        }
        p pVar = (p) androidx.compose.runtime.saveable.i.j(objArr, bVar, (Function0) objI0, c0Var, 48);
        if (m0.l0()) {
            m0.z0();
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p f(String str, long j10) {
        return new p(str, j10, (DefaultConstructorMarker) null);
    }

    public static final void g(@NotNull p pVar, @NotNull String str) {
        j jVarA = pVar.A();
        try {
            jVarA.C(0, jVarA.r(), str);
            k.g(jVarA);
            pVar.d(jVarA);
        } finally {
            pVar.k();
        }
    }

    public static final void h(@NotNull p pVar, @NotNull String str) {
        j jVarA = pVar.A();
        try {
            jVarA.C(0, jVarA.r(), str);
            k.h(jVarA);
            pVar.d(jVarA);
            pVar.k();
        } catch (Throwable th2) {
            pVar.k();
            throw th2;
        }
    }

    @NotNull
    public static final j i(@NotNull p pVar) {
        j jVar = new j(pVar.t(), null, null, null, 14, null);
        jVar.I(true);
        return jVar;
    }
}
