package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class w extends h {
    public static final int Z = 8;

    @NotNull
    private final String Y;

    public /* synthetic */ w(x xVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i10 & 2) != 0 ? false : z10);
    }

    @Override // androidx.compose.ui.input.pointer.h
    public boolean H9(int i10) {
        r0.a aVar = r0.f39113b;
        return (r0.i(i10, aVar.c()) || r0.i(i10, aVar.a())) ? false : true;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public String R4() {
        return this.Y;
    }

    @Override // androidx.compose.ui.input.pointer.h
    public void x9(@Nullable x xVar) {
        z zVarG9 = G9();
        if (zVarG9 != null) {
            zVarG9.b(xVar);
        }
    }

    public w(@NotNull x xVar, boolean z10) {
        super(xVar, z10, null, 4, null);
        this.Y = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
