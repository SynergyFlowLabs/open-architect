package kotlinx.coroutines.rx2;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
enum f {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    LAST("awaitLast"),
    SINGLE("awaitSingle");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f315342g = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315343a;

    f(String str) {
        this.f315343a = str;
    }

    @NotNull
    public static kotlin.enums.a<f> l() {
        return f315342g;
    }

    @NotNull
    public final String n() {
        return this.f315343a;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f315343a;
    }
}
