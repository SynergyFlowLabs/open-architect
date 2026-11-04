package kotlinx.coroutines.reactive;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
enum i {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    LAST("awaitLast"),
    SINGLE("awaitSingle"),
    SINGLE_OR_DEFAULT("awaitSingleOrDefault");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f315260h = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315261a;

    i(String str) {
        this.f315261a = str;
    }

    @NotNull
    public static kotlin.enums.a<i> l() {
        return f315260h;
    }

    @NotNull
    public final String n() {
        return this.f315261a;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f315261a;
    }
}
