package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Canvas f37542a = new Canvas();

    @NotNull
    public static final k0 a(@NotNull t1 t1Var) {
        b bVar = new b();
        bVar.U(new Canvas(j.b(t1Var)));
        return bVar;
    }

    @NotNull
    public static final k0 b(@NotNull Canvas canvas) {
        b bVar = new b();
        bVar.U(canvas);
        return bVar;
    }

    @NotNull
    public static final Canvas d(@NotNull k0 k0Var) {
        Intrinsics.checkNotNull(k0Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((b) k0Var).S();
    }
}
