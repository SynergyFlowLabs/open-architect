package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public abstract class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38514b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function1<? super l, Unit> f38515a;

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar);

    @Nullable
    public Function1<l, Unit> b() {
        return this.f38515a;
    }

    public final void c() {
        Function1<l, Unit> function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(@Nullable Function1<? super l, Unit> function1) {
        this.f38515a = function1;
    }

    private l() {
    }
}
