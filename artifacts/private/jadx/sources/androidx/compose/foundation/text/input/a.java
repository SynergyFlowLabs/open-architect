package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.b4;
import androidx.compose.ui.text.h3;
import androidx.compose.ui.text.input.a0;
import androidx.compose.ui.text.input.p0;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,243:1\n672#2,7:244\n*S KotlinDebug\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n*L\n212#1:244,7\n*E\n"})
final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0.e f19393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b4 f19394c = new b4(a0.f41798b.a(), (Boolean) null, 0, 0, (p0) null, (Boolean) null, (y0.f) null, okhttp3.internal.ws.g.f334652s, (DefaultConstructorMarker) null);

    public a(@NotNull y0.e eVar) {
        this.f19393b = eVar;
    }

    private final y0.e a() {
        return this.f19393b;
    }

    public static /* synthetic */ a c(a aVar, y0.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = aVar.f19393b;
        }
        return aVar.b(eVar);
    }

    @NotNull
    public final a b(@NotNull y0.e eVar) {
        return new a(eVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f19393b, ((a) obj).f19393b);
    }

    public int hashCode() {
        return this.f19393b.hashCode();
    }

    @Override // androidx.compose.foundation.text.input.c
    public void q0(@NotNull j jVar) {
        j.a aVarM = jVar.m();
        for (int i10 = 0; i10 < aVarM.a(); i10++) {
            long jC = aVarM.c(i10);
            aVarM.b(i10);
            if (!w3.h(jC)) {
                jVar.C(w3.l(jC), w3.k(jC), h3.g(x3.e(jVar.e(), jC), this.f19393b));
            }
        }
    }

    @Override // androidx.compose.foundation.text.input.c
    @NotNull
    public b4 r0() {
        return this.f19394c;
    }

    @NotNull
    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.f19393b + ')';
    }
}
