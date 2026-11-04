package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class s7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20988d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.ui.unit.q> f20991c;

    public s7(int i10, int i11, @NotNull Function0<androidx.compose.ui.unit.q> function0) {
        this.f20989a = i10;
        this.f20990b = i11;
        this.f20991c = function0;
    }

    public final int a() {
        return this.f20990b;
    }

    @NotNull
    public final Function0<androidx.compose.ui.unit.q> b() {
        return this.f20991c;
    }

    public final int c() {
        return this.f20989a;
    }
}
