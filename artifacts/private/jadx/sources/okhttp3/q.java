package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f334749a = a.f334751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final q f334750b = new a.C2376a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f334751a = new a();

        /* JADX INFO: renamed from: okhttp3.q$a$a, reason: collision with other inner class name */
        private static final class C2376a implements q {
            @Override // okhttp3.q
            @NotNull
            public List<InetAddress> a(@NotNull String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return ArraysKt.toList(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    @NotNull
    List<InetAddress> a(@NotNull String str) throws UnknownHostException;
}
