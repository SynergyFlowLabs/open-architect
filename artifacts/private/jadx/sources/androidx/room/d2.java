package androidx.room;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d2 f74742a = new d2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f74743b = "room_master_table";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f74744c = "room_master_table";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f74745d = "id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f74746e = "identity_hash";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f74747f = "42";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f74748g = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f74749h = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    private d2() {
    }

    @oj.n
    @NotNull
    public static final String a(@NotNull String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
