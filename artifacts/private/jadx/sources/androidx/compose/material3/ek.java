package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@af
public final class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ek f27370a = new ek();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ll f27371b = new ll();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27372c = 0;

    private ek() {
    }

    public static /* synthetic */ ll c(ek ekVar, androidx.compose.ui.window.u uVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uVar = androidx.compose.ui.window.u.Inherit;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return ekVar.b(uVar, z10, z11);
    }

    @NotNull
    public final ll a() {
        return f27371b;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "'isFocusable' param is no longer used. Use value without this parameter.", replaceWith = @kotlin.b1(expression = "properties", imports = {}))
    @NotNull
    public final ll b(@NotNull androidx.compose.ui.window.u uVar, boolean z10, boolean z11) {
        return new ll(uVar, z11, false, 4, (DefaultConstructorMarker) null);
    }
}
