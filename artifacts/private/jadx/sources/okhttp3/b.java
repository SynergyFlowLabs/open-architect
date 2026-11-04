package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f333660a = a.f333663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final b f333661b = new a.C2350a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final b f333662c = new kk.a(null, 1, 0 == true ? 1 : 0);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f333663a = new a();

        /* JADX INFO: renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        private static final class C2350a implements b {
            @Override // okhttp3.b
            @Nullable
            public d0 a(@Nullable h0 h0Var, @NotNull f0 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }

        private a() {
        }
    }

    @Nullable
    d0 a(@Nullable h0 h0Var, @NotNull f0 f0Var) throws IOException;
}
