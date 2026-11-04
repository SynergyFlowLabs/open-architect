package androidx.compose.runtime.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35985b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35986a;

    public j0() {
        this(0, 1, null);
    }

    public final int a() {
        return this.f35986a;
    }

    public final void b(int i10) {
        this.f35986a = i10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.f35986a);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public j0(int i10) {
        this.f35986a = i10;
    }

    public /* synthetic */ j0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
