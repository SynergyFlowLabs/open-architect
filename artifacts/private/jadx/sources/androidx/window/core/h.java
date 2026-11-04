package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class h<T> extends g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f76277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f76278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g.b f76279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f76280e;

    public h(@NotNull T value, @NotNull String tag, @NotNull g.b verificationMode, @NotNull f logger) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f76277b = value;
        this.f76278c = tag;
        this.f76279d = verificationMode;
        this.f76280e = logger;
    }

    @Override // androidx.window.core.g
    @NotNull
    public T a() {
        return this.f76277b;
    }

    @Override // androidx.window.core.g
    @NotNull
    public g<T> c(@NotNull String message, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return condition.invoke(this.f76277b).booleanValue() ? this : new e(this.f76277b, this.f76278c, message, this.f76280e, this.f76279d);
    }

    @NotNull
    public final f d() {
        return this.f76280e;
    }

    @NotNull
    public final String e() {
        return this.f76278c;
    }

    @NotNull
    public final T f() {
        return this.f76277b;
    }

    @NotNull
    public final g.b g() {
        return this.f76279d;
    }
}
