package coil.decode;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "GifDecodeUtils")
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final okio.o f87191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final okio.o f87192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final okio.o f87193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final okio.o f87194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final okio.o f87195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final okio.o f87196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final okio.o f87197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final okio.o f87198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final okio.o f87199i;

    static {
        okio.o.a aVar = okio.o.f335046d;
        f87191a = aVar.l("GIF87a");
        f87192b = aVar.l("GIF89a");
        f87193c = aVar.l("RIFF");
        f87194d = aVar.l("WEBP");
        f87195e = aVar.l("VP8X");
        f87196f = aVar.l("ftyp");
        f87197g = aVar.l("msf1");
        f87198h = aVar.l("hevc");
        f87199i = aVar.l("hevx");
    }

    public static final boolean a(@NotNull g gVar, @NotNull okio.n nVar) {
        if (d(gVar, nVar)) {
            return nVar.u3(8L, f87197g) || nVar.u3(8L, f87198h) || nVar.u3(8L, f87199i);
        }
        return false;
    }

    public static final boolean b(@NotNull g gVar, @NotNull okio.n nVar) {
        return e(gVar, nVar) && nVar.u3(12L, f87195e) && nVar.request(17L) && ((byte) (nVar.n().I(16L) & 2)) > 0;
    }

    public static final boolean c(@NotNull g gVar, @NotNull okio.n nVar) {
        if (!nVar.u3(0L, f87192b) && !nVar.u3(0L, f87191a)) {
            return false;
        }
        return true;
    }

    public static final boolean d(@NotNull g gVar, @NotNull okio.n nVar) {
        return nVar.u3(4L, f87196f);
    }

    public static final boolean e(@NotNull g gVar, @NotNull okio.n nVar) {
        return nVar.u3(0L, f87193c) && nVar.u3(8L, f87194d);
    }
}
