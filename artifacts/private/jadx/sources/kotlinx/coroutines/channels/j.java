package kotlinx.coroutines.channels;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum j {
    SUSPEND,
    DROP_OLDEST,
    DROP_LATEST;


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f313782e = kotlin.enums.c.c(k());

    static {
        int i10 = 3 & 1;
    }

    @NotNull
    public static kotlin.enums.a<j> l() {
        return f313782e;
    }
}
