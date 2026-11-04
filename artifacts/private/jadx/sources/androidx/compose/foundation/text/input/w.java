package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.y7;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f20334a = 100;

    private static final boolean a(androidx.compose.foundation.text.input.internal.undo.d dVar) {
        return Intrinsics.areEqual(dVar.f(), "\n") || Intrinsics.areEqual(dVar.f(), "\r\n");
    }

    @Nullable
    public static final androidx.compose.foundation.text.input.internal.undo.d b(@NotNull androidx.compose.foundation.text.input.internal.undo.d dVar, @NotNull androidx.compose.foundation.text.input.internal.undo.d dVar2) {
        if (!dVar.b() || !dVar2.b() || dVar2.j() < dVar.j() || dVar2.j() - dVar.j() >= y7.a() || a(dVar) || a(dVar2) || dVar.i() != dVar2.i()) {
            return null;
        }
        if (dVar.i() == androidx.compose.foundation.text.input.internal.undo.b.Insert && dVar.d() + dVar.f().length() == dVar2.d()) {
            return new androidx.compose.foundation.text.input.internal.undo.d(dVar.d(), "", dVar.f() + dVar2.f(), dVar.g(), dVar2.e(), dVar.j(), false, 64, null);
        }
        if (dVar.i() == androidx.compose.foundation.text.input.internal.undo.b.Delete && dVar.c() == dVar2.c() && (dVar.c() == androidx.compose.foundation.text.input.internal.undo.a.Start || dVar.c() == androidx.compose.foundation.text.input.internal.undo.a.End)) {
            if (dVar.d() == dVar2.d() + dVar2.h().length()) {
                return new androidx.compose.foundation.text.input.internal.undo.d(dVar2.d(), dVar2.h() + dVar.h(), "", dVar.g(), dVar2.e(), dVar.j(), false, 64, null);
            }
            if (dVar.d() == dVar2.d()) {
                return new androidx.compose.foundation.text.input.internal.undo.d(dVar.d(), dVar.h() + dVar2.h(), "", dVar.g(), dVar2.e(), dVar.j(), false, 64, null);
            }
        }
        return null;
    }

    public static final void c(@NotNull v vVar, @NotNull l lVar, @NotNull l lVar2, @NotNull j.a aVar, boolean z10) {
        if (aVar.a() > 1) {
            vVar.h(new androidx.compose.foundation.text.input.internal.undo.d(0, lVar.toString(), lVar2.toString(), lVar.h(), lVar2.h(), 0L, false, 32, null));
            return;
        }
        if (aVar.a() == 1) {
            long jB = aVar.b(0);
            long jC = aVar.c(0);
            if (w3.h(jB) && w3.h(jC)) {
                return;
            }
            vVar.h(new androidx.compose.foundation.text.input.internal.undo.d(w3.l(jB), x3.e(lVar, jB), x3.e(lVar2, jC), lVar.h(), lVar2.h(), 0L, z10, 32, null));
        }
    }

    public static /* synthetic */ void d(v vVar, l lVar, l lVar2, j.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        c(vVar, lVar, lVar2, aVar, z10);
    }
}
