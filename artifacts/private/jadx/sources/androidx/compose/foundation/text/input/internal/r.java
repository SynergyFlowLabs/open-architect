package androidx.compose.foundation.text.input.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.foundation.text.s3, Unit> f19769a;

    private /* synthetic */ r(Function1 function1) {
        this.f19769a = function1;
    }

    public static final /* synthetic */ r a(Function1 function1) {
        return new r(function1);
    }

    @NotNull
    public static Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> b(@NotNull Function1<? super androidx.compose.foundation.text.s3, Unit> function1) {
        return function1;
    }

    public static boolean c(Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function1, Object obj) {
        return (obj instanceof r) && Intrinsics.areEqual(function1, ((r) obj).h());
    }

    public static final boolean d(Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function1, Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function2) {
        return Intrinsics.areEqual(function1, function2);
    }

    public static int f(Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function1) {
        return function1.hashCode();
    }

    public static String g(Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function1) {
        return "ClipboardKeyCommandsHandler(handler=" + function1 + ')';
    }

    @NotNull
    public final Function1<androidx.compose.foundation.text.s3, Unit> e() {
        return this.f19769a;
    }

    public boolean equals(Object obj) {
        return c(this.f19769a, obj);
    }

    public final /* synthetic */ Function1 h() {
        return this.f19769a;
    }

    public int hashCode() {
        return f(this.f19769a);
    }

    public String toString() {
        return g(this.f19769a);
    }
}
