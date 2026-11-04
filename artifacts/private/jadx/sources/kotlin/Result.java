package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@e1(version = "1.3")
public final class Result<T> implements Serializable {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f312392a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.internal.f
        @oj.i(name = com.facebook.login.v.L)
        private final <T> Object a(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return Result.m785constructorimpl(ResultKt.createFailure(exception));
        }

        @kotlin.internal.f
        @oj.i(name = "success")
        private final <T> Object b(T t10) {
            return Result.m785constructorimpl(t10);
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final Throwable f312393a;

        public b(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f312393a = exception;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && Intrinsics.areEqual(this.f312393a, ((b) obj).f312393a);
        }

        public int hashCode() {
            return this.f312393a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.f312393a + ')';
        }
    }

    @a1
    private /* synthetic */ Result(Object obj) {
        this.f312392a = obj;
    }

    public static final /* synthetic */ Result a(Object obj) {
        return new Result(obj);
    }

    public static boolean b(Object obj, Object obj2) {
        if ((obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).j())) {
            return true;
        }
        return false;
    }

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @a1
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m785constructorimpl(@Nullable Object obj) {
        return obj;
    }

    @Nullable
    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f312393a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final T e(Object obj) {
        if (m786isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    @a1
    public static /* synthetic */ void f() {
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    @NotNull
    public static String i(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m786isFailureimpl(Object obj) {
        return obj instanceof b;
    }

    public boolean equals(Object obj) {
        return b(this.f312392a, obj);
    }

    public int hashCode() {
        return g(this.f312392a);
    }

    public final /* synthetic */ Object j() {
        return this.f312392a;
    }

    @NotNull
    public String toString() {
        return i(this.f312392a);
    }
}
