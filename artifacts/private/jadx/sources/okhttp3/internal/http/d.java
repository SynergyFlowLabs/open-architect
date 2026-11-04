package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;
import okio.b1;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f334179a = a.f334181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f334180b = 100;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f334181a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f334182b = 100;

        private a() {
        }
    }

    @NotNull
    okhttp3.internal.connection.f C0();

    @NotNull
    b1 a(@NotNull f0 f0Var) throws IOException;

    @NotNull
    z0 b(@NotNull d0 d0Var, long j10) throws IOException;

    void c() throws IOException;

    void cancel();

    void d() throws IOException;

    long e(@NotNull f0 f0Var) throws IOException;

    void f(@NotNull d0 d0Var) throws IOException;

    @Nullable
    f0.a g(boolean z10) throws IOException;

    @NotNull
    u h() throws IOException;
}
