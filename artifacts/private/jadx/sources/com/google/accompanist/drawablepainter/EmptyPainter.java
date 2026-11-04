package com.google.accompanist.drawablepainter;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.drawscope.f;
import kotlin.jvm.internal.Intrinsics;
import n0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
public final class EmptyPainter extends androidx.compose.ui.graphics.painter.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final EmptyPainter f103072g = new EmptyPainter();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f103073h = 0;

    private EmptyPainter() {
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return n.f332724b.a();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
    }
}
