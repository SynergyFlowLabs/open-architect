package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    public static final class C1904a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f275322a;

        public C1904a(T t10) {
            this.f275322a = t10;
        }

        public final T a() {
            return this.f275322a;
        }
    }

    @NotNull
    public abstract Intent createIntent(@NotNull Context context, I i10);

    @Nullable
    public C1904a<O> getSynchronousResult(@NotNull Context context, I i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O parseResult(int i10, @Nullable Intent intent);
}
