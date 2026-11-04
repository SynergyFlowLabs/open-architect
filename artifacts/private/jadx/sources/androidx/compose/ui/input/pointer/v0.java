package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class v0 extends h {
    public static final int Z = 8;

    @NotNull
    private final String Y;

    public /* synthetic */ v0(x xVar, boolean z10, androidx.compose.ui.node.s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : sVar);
    }

    @Override // androidx.compose.ui.input.pointer.h
    public boolean H9(int i10) {
        r0.a aVar = r0.f39113b;
        return r0.i(i10, aVar.c()) || r0.i(i10, aVar.a());
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
            zVarG9.a(xVar);
        }
    }

    public v0(@NotNull x xVar, boolean z10, @Nullable androidx.compose.ui.node.s sVar) {
        super(xVar, z10, sVar);
        this.Y = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
