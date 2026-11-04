package m0;

import androidx.compose.runtime.d2;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@d2
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f322701c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function1<Object, Unit> f322702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function1<Object, Unit> f322703b;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Function1<Object, Unit> a() {
        return this.f322702a;
    }

    @Nullable
    public final Function1<Object, Unit> b() {
        return this.f322703b;
    }

    public a(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        this.f322702a = function1;
        this.f322703b = function2;
    }

    public /* synthetic */ a(Function1 function1, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function2);
    }
}
