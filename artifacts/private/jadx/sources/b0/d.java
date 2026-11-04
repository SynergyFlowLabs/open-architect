package b0;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77486f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f77487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f77488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<g, Unit> f77489e;

    public /* synthetic */ d(Object obj, String str, int i10, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, (i11 & 4) != 0 ? 0 : i10, function1);
    }

    @NotNull
    public final String b() {
        return this.f77487c;
    }

    public final int c() {
        return this.f77488d;
    }

    @NotNull
    public final Function1<g, Unit> d() {
        return this.f77489e;
    }

    @NotNull
    public String toString() {
        return "TextContextMenuItem(key=" + a() + ", label=\"" + this.f77487c + "\", leadingIcon=" + this.f77488d + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Object obj, @NotNull String str, int i10, @NotNull Function1<? super g, Unit> function1) {
        super(obj);
        this.f77487c = str;
        this.f77488d = i10;
        this.f77489e = function1;
    }
}
