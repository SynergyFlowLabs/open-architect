package androidx.compose.ui.modifier;

import androidx.compose.runtime.k7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@k7
public abstract class c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39618b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<T> f39619a;

    public /* synthetic */ c(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    @NotNull
    public final Function0<T> a() {
        return this.f39619a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(Function0<? extends T> function0) {
        this.f39619a = function0;
    }
}
