package io.ktor.client.request.forms;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.io.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final byte[] f295289a = ui.u.m("\r\n", null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(c0 c0Var, io.ktor.utils.io.p pVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objY = io.ktor.utils.io.t.y(pVar, c0Var, dVar);
        return objY == kotlin.coroutines.intrinsics.b.l() ? objY : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 32; i10++) {
            String string = Integer.toString(kotlin.random.f.f312895a.l(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
        }
        return StringsKt.X8(sb2.toString(), 70);
    }
}
