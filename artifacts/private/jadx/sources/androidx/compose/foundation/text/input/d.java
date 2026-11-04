package androidx.compose.foundation.text.input;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<CharSequence, CharSequence, CharSequence> f19399b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> function2) {
        this.f19399b = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d c(d dVar, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function2 = dVar.f19399b;
        }
        return dVar.b(function2);
    }

    @NotNull
    public final Function2<CharSequence, CharSequence, CharSequence> a() {
        return this.f19399b;
    }

    @NotNull
    public final d b(@NotNull Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> function2) {
        return new d(function2);
    }

    @NotNull
    public final Function2<CharSequence, CharSequence, CharSequence> d() {
        return this.f19399b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f19399b, ((d) obj).f19399b);
    }

    public int hashCode() {
        return this.f19399b.hashCode();
    }

    @Override // androidx.compose.foundation.text.input.c
    public void q0(@NotNull j jVar) {
        l lVarR = j.R(jVar, 0L, null, null, null, 15, null);
        CharSequence charSequenceInvoke = this.f19399b.invoke(jVar.u(), lVarR);
        if (charSequenceInvoke == lVarR) {
            return;
        }
        if (charSequenceInvoke == jVar.u()) {
            jVar.H();
        } else {
            jVar.P(charSequenceInvoke);
        }
    }

    @NotNull
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.f19399b + ')';
    }
}
