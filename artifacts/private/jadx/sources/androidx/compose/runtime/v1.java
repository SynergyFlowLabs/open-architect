package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36722a = 0;

    public static final class a implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f36723a;

        public a(Function0<Unit> function0) {
            this.f36723a = function0;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f36723a.invoke();
        }
    }

    @NotNull
    public final u1 a(@NotNull Function0<Unit> function0) {
        return new a(function0);
    }
}
