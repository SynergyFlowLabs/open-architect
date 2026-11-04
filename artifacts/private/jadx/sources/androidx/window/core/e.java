package androidx.window.core;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class e<T> extends g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f76265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f76266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f76267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f76268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final g.b f76269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final j f76270g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76271a;

        static {
            int[] iArr = new int[g.b.values().length];
            iArr[g.b.STRICT.ordinal()] = 1;
            iArr[g.b.LOG.ordinal()] = 2;
            iArr[g.b.QUIET.ordinal()] = 3;
            f76271a = iArr;
        }
    }

    public e(@NotNull T value, @NotNull String tag, @NotNull String message, @NotNull f logger, @NotNull g.b verificationMode) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f76265b = value;
        this.f76266c = tag;
        this.f76267d = message;
        this.f76268e = logger;
        this.f76269f = verificationMode;
        j jVar = new j(b(value, message));
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        Object[] array = ArraysKt.drop(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        jVar.setStackTrace((StackTraceElement[]) array);
        this.f76270g = jVar;
    }

    @Override // androidx.window.core.g
    @Nullable
    public T a() throws j {
        int i10 = a.f76271a[this.f76269f.ordinal()];
        if (i10 == 1) {
            throw this.f76270g;
        }
        if (i10 == 2) {
            this.f76268e.a(this.f76266c, b(this.f76265b, this.f76267d));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new k0();
    }

    @Override // androidx.window.core.g
    @NotNull
    public g<T> c(@NotNull String message, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }

    @NotNull
    public final j d() {
        return this.f76270g;
    }

    @NotNull
    public final f e() {
        return this.f76268e;
    }

    @NotNull
    public final String f() {
        return this.f76267d;
    }

    @NotNull
    public final String g() {
        return this.f76266c;
    }

    @NotNull
    public final T h() {
        return this.f76265b;
    }

    @NotNull
    public final g.b i() {
        return this.f76269f;
    }
}
