package mg;

import io.ably.lib.types.n;
import io.ably.lib.types.r;
import io.ably.lib.util.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f332657b = c.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.ably.lib.realtime.a f332658a;

    public a(@NotNull io.ably.lib.realtime.a aVar) {
        this.f332658a = aVar;
    }

    @Override // mg.c
    public long V() throws io.ably.lib.types.a {
        return this.f332658a.E();
    }

    @Override // mg.c
    @NotNull
    public io.ably.lib.realtime.c a(@NotNull String str) throws io.ably.lib.types.a {
        if (this.f332658a.f287533j.containsKey(str)) {
            return this.f332658a.f287533j.get(str);
        }
        k.d(f332657b, "attachChannel(): channel not found: " + str);
        throw io.ably.lib.types.a.a(new r("Channel not found: " + str, 404));
    }

    @Override // mg.c
    @NotNull
    public n b() {
        return this.f332658a.f287674a;
    }

    @Override // mg.c
    @NotNull
    public io.ably.lib.transport.b getConnectionManager() {
        return this.f332658a.f287532i.f287618i;
    }
}
