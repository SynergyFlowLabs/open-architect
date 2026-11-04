package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x1 implements androidx.compose.runtime.saveable.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40952c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.runtime.saveable.v f40953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40954b;

    public x1(@NotNull androidx.compose.runtime.saveable.v vVar, @NotNull Function0<Unit> function0) {
        this.f40953a = vVar;
        this.f40954b = function0;
    }

    @Override // androidx.compose.runtime.saveable.v
    public boolean a(@NotNull Object obj) {
        return this.f40953a.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public androidx.compose.runtime.saveable.v.a b(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        return this.f40953a.b(str, function0);
    }

    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public Map<String, List<Object>> c() {
        return this.f40953a.c();
    }

    public final void d() {
        this.f40954b.invoke();
    }

    @Override // androidx.compose.runtime.saveable.v
    @Nullable
    public Object f(@NotNull String str) {
        return this.f40953a.f(str);
    }
}
