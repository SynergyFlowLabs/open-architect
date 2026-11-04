package okhttp3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f334738a = a.f334740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final n f334739b = new a.C2375a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f334740a = new a();

        /* JADX INFO: renamed from: okhttp3.n$a$a, reason: collision with other inner class name */
        private static final class C2375a implements n {
            @Override // okhttp3.n
            @NotNull
            public List<m> a(@NotNull v url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }

            @Override // okhttp3.n
            public void b(@NotNull v url, @NotNull List<m> cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }

        private a() {
        }
    }

    @NotNull
    List<m> a(@NotNull v vVar);

    void b(@NotNull v vVar, @NotNull List<m> list);
}
