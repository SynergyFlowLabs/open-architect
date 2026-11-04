package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,425:1\n78#2:426\n111#2,2:427\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n*L\n275#1:426\n275#1:427,2\n*E\n"})
public final class v4 implements androidx.compose.foundation.text.input.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21687d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f21688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f21689c = androidx.compose.runtime.e6.b(-1);

    public v4(@NotNull Function0<Unit> function0) {
        this.f21688b = function0;
    }

    private final void d(int i10) {
        this.f21689c.j(i10);
    }

    public final int a() {
        return this.f21689c.m1();
    }

    @NotNull
    public final Function0<Unit> b() {
        return this.f21688b;
    }

    public final void c() {
        d(-1);
    }

    @Override // androidx.compose.foundation.text.input.c
    public void q0(@NotNull androidx.compose.foundation.text.input.j jVar) {
        if (jVar.m().a() != 1 || androidx.compose.ui.text.w3.j(jVar.m().c(0)) != 1 || jVar.y()) {
            d(-1);
            return;
        }
        int iL = androidx.compose.ui.text.w3.l(jVar.m().c(0));
        if (a() != iL) {
            this.f21688b.invoke();
            d(iL);
        }
    }
}
