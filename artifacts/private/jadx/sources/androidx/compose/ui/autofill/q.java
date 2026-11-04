package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@kotlin.l(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36998b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Integer, o> f36999a = new LinkedHashMap();

    @NotNull
    public final Map<Integer, o> a() {
        return this.f36999a;
    }

    @Nullable
    public final Unit b(int i10, @NotNull String str) {
        Function1<String, Unit> function1G;
        o oVar = this.f36999a.get(Integer.valueOf(i10));
        if (oVar == null || (function1G = oVar.g()) == null) {
            return null;
        }
        function1G.invoke(str);
        return Unit.f312394a;
    }

    public final void c(@NotNull o oVar) {
        this.f36999a.put(Integer.valueOf(oVar.f()), oVar);
    }
}
