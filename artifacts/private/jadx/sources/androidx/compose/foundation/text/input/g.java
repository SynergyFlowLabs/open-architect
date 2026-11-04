package androidx.compose.foundation.text.input;

import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,243:1\n97#2,4:244\n*S KotlinDebug\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n*L\n226#1:244,4\n*E\n"})
final class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19400b;

    public g(int i10) {
        this.f19400b = i10;
        if (!(i10 >= 0)) {
            androidx.compose.foundation.internal.e.g("maxLength must be at least zero");
        }
    }

    private final int a() {
        return this.f19400b;
    }

    public static /* synthetic */ g c(g gVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = gVar.f19400b;
        }
        return gVar.b(i10);
    }

    @NotNull
    public final g b(int i10) {
        return new g(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f19400b == ((g) obj).f19400b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19400b);
    }

    @Override // androidx.compose.foundation.text.input.c
    public void p0(@NotNull e0 e0Var) {
        b0.F1(e0Var, this.f19400b);
    }

    @Override // androidx.compose.foundation.text.input.c
    public void q0(@NotNull j jVar) {
        if (jVar.r() > this.f19400b) {
            jVar.H();
        }
    }

    @NotNull
    public String toString() {
        return "InputTransformation.maxLength(" + this.f19400b + ')';
    }
}
