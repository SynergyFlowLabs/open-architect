package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f76272a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ g b(a aVar, Object obj, String str, b bVar, f fVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                bVar = c.f76263a.a();
            }
            if ((i10 & 4) != 0) {
                fVar = androidx.window.core.a.f76258a;
            }
            return aVar.a(obj, str, bVar, fVar);
        }

        @NotNull
        public final <T> g<T> a(@NotNull T t10, @NotNull String tag, @NotNull b verificationMode, @NotNull f logger) {
            Intrinsics.checkNotNullParameter(t10, "<this>");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new h(t10, tag, verificationMode, logger);
        }

        private a() {
        }
    }

    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    @Nullable
    public abstract T a();

    @NotNull
    protected final String b(@NotNull Object value, @NotNull String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + " value: " + value;
    }

    @NotNull
    public abstract g<T> c(@NotNull String str, @NotNull Function1<? super T, Boolean> function1);
}
