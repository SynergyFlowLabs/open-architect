package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@kotlin.l(level = kotlin.n.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
public final class p2 extends u2 implements androidx.compose.ui.a0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40702e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f40703d;

    public final class a implements androidx.compose.ui.a0.c {
        public a() {
        }
    }

    public p2(@NotNull Function1<? super t2, Unit> function1) {
        super(function1);
        this.f40703d = new a();
    }

    @NotNull
    public final a i() {
        return this.f40703d;
    }
}
