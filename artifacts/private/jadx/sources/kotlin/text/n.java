package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum n implements f {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f313373k = kotlin.enums.c.c(l());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f313374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f313375b;

    static {
        int i10 = 4 >> 2;
        int i11 = (4 & 0) >> 5;
    }

    n(int i10, int i11) {
        this.f313374a = i10;
        this.f313375b = i11;
    }

    @NotNull
    public static kotlin.enums.a<n> n() {
        return f313373k;
    }

    @Override // kotlin.text.f
    public int getValue() {
        return this.f313374a;
    }

    @Override // kotlin.text.f
    public int k() {
        return this.f313375b;
    }

    /* synthetic */ n(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? i10 : i11);
    }
}
