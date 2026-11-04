package kotlin;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    @m2(markerClass = {s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final char a(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            return (char) i10;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i10);
    }

    private static final int b(char c10) {
        return c10;
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    public static /* synthetic */ void c(char c10) {
    }
}
