package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class e implements m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40427b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f40428a;

    public e(@NotNull f fVar) {
        this.f40428a = fVar;
    }

    @Override // androidx.compose.ui.platform.m1
    @NotNull
    public ClipboardManager a() {
        return this.f40428a.a();
    }

    @Override // androidx.compose.ui.platform.m1
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super k1> dVar) {
        return this.f40428a.b();
    }

    @Override // androidx.compose.ui.platform.m1
    @Nullable
    public Object c(@Nullable k1 k1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f40428a.U3(k1Var);
        return Unit.f312394a;
    }

    public e(@NotNull Context context) {
        this(new f(context));
    }
}
