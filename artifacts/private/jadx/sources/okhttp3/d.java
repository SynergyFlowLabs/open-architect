package okhttp3;

import androidx.collection.g3;
import java.util.concurrent.TimeUnit;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final b f333769n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final d f333770o = new a().g().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final d f333771p = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f333772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f333773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f333774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f333775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f333776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f333777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f333778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f333779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f333780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f333781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f333782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f333783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private String f333784m;

    @SourceDebugExtension({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f333785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f333786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f333787c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f333788d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f333789e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f333790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f333791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f333792h;

        private final int b(long j10) {
            if (j10 > g3.f12256c) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        @NotNull
        public final d a() {
            return new d(this.f333785a, this.f333786b, this.f333787c, -1, false, false, false, this.f333788d, this.f333789e, this.f333790f, this.f333791g, this.f333792h, null, null);
        }

        @NotNull
        public final a c() {
            this.f333792h = true;
            return this;
        }

        @NotNull
        public final a d(int i10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f333787c = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i10).toString());
        }

        @NotNull
        public final a e(int i10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f333788d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        @NotNull
        public final a f(int i10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f333789e = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i10).toString());
        }

        @NotNull
        public final a g() {
            this.f333785a = true;
            return this;
        }

        @NotNull
        public final a h() {
            this.f333786b = true;
            return this;
        }

        @NotNull
        public final a i() {
            this.f333791g = true;
            return this;
        }

        @NotNull
        public final a j() {
            this.f333790f = true;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (StringsKt.U2(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        static /* synthetic */ int b(b bVar, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return bVar.a(str, str2, i10);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004f  */
        /* JADX WARN: Code duplicated, block: B:17:0x006e  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:37:0x0105  */
        /* JADX WARN: Code duplicated, block: B:39:0x010d  */
        /* JADX WARN: Code duplicated, block: B:41:0x0119  */
        /* JADX WARN: Code duplicated, block: B:43:0x0121  */
        /* JADX WARN: Code duplicated, block: B:44:0x0127  */
        /* JADX WARN: Code duplicated, block: B:46:0x012f  */
        /* JADX WARN: Code duplicated, block: B:47:0x0137  */
        /* JADX WARN: Code duplicated, block: B:49:0x013f  */
        /* JADX WARN: Code duplicated, block: B:50:0x0148  */
        /* JADX WARN: Code duplicated, block: B:52:0x0152  */
        /* JADX WARN: Code duplicated, block: B:53:0x015b  */
        /* JADX WARN: Code duplicated, block: B:55:0x0163  */
        /* JADX WARN: Code duplicated, block: B:56:0x016b  */
        /* JADX WARN: Code duplicated, block: B:58:0x0175  */
        /* JADX WARN: Code duplicated, block: B:59:0x017b  */
        /* JADX WARN: Code duplicated, block: B:61:0x0184  */
        /* JADX WARN: Code duplicated, block: B:62:0x0191  */
        /* JADX WARN: Code duplicated, block: B:64:0x019b  */
        /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
        @oj.n
        @NotNull
        public final d c(@NotNull u uVar) {
            int iA;
            int iA2;
            boolean z10;
            String string;
            int i10;
            String str;
            String string2;
            u headers = uVar;
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            boolean z11 = true;
            boolean z12 = true;
            int i11 = 0;
            String str2 = null;
            boolean z13 = false;
            boolean z14 = false;
            int iK0 = -1;
            int iK1 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int iK2 = -1;
            int iK3 = -1;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            while (i11 < size) {
                String strN = headers.n(i11);
                String strW = headers.w(i11);
                if (StringsKt.N1(strN, com.google.common.net.d.f119471a, z11)) {
                    if (str2 == null) {
                        str2 = strW;
                    }
                    iA = 0;
                    while (iA < strW.length()) {
                        iA2 = a(strW, "=,;", iA);
                        String strSubstring = strW.substring(iA, iA2);
                        z10 = z11;
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = StringsKt.E5(strSubstring).toString();
                        if (iA2 != strW.length()) {
                            i10 = size;
                            if (strW.charAt(iA2) == ',' && strW.charAt(iA2) != ';') {
                                int iJ = jk.f.J(strW, iA2 + 1);
                                if (iJ >= strW.length() || strW.charAt(iJ) != '\"') {
                                    str = strW;
                                    iA = a(str, ",;", iJ);
                                    String strSubstring2 = str.substring(iJ, iA);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = StringsKt.E5(strSubstring2).toString();
                                } else {
                                    int i12 = iJ + 1;
                                    String str3 = strW;
                                    int iQ3 = StringsKt.q3(str3, '\"', i12, false, 4, null);
                                    str = str3;
                                    String strSubstring3 = str.substring(i12, iQ3);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iA = iQ3 + 1;
                                    string2 = strSubstring3;
                                }
                            }
                            if (StringsKt.N1(io.ktor.client.utils.d.f295392f, string, z10)) {
                                z11 = z10;
                                z13 = z11;
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295393g, string, z10)) {
                                z11 = z10;
                                z14 = z11;
                            } else {
                                if (StringsKt.N1(io.ktor.client.utils.d.f295388b, string, z10)) {
                                    iK0 = jk.f.k0(string2, -1);
                                } else if (StringsKt.N1(io.ktor.client.utils.d.f295399m, string, z10)) {
                                    iK1 = jk.f.k0(string2, -1);
                                } else if (StringsKt.N1(io.ktor.client.utils.d.f295397k, string, z10)) {
                                    z11 = z10;
                                    z15 = z11;
                                } else if (StringsKt.N1("public", string, z10)) {
                                    z11 = z10;
                                    z16 = z11;
                                } else if (StringsKt.N1(io.ktor.client.utils.d.f295395i, string, z10)) {
                                    z11 = z10;
                                    z17 = z11;
                                } else if (StringsKt.N1(io.ktor.client.utils.d.f295391e, string, z10)) {
                                    iK2 = jk.f.k0(string2, Integer.MAX_VALUE);
                                } else if (StringsKt.N1(io.ktor.client.utils.d.f295389c, string, z10)) {
                                    iK3 = jk.f.k0(string2, -1);
                                } else if (StringsKt.N1(io.ktor.client.utils.d.f295390d, string, z10)) {
                                    z11 = z10;
                                    z18 = z11;
                                } else if (StringsKt.N1(io.ktor.client.utils.d.f295394h, string, z10)) {
                                    z11 = z10;
                                    z19 = z11;
                                } else if (StringsKt.N1("immutable", string, z10)) {
                                    z11 = z10;
                                    z20 = z11;
                                }
                                z11 = z10;
                            }
                            strW = str;
                            size = i10;
                        } else {
                            i10 = size;
                        }
                        str = strW;
                        iA = iA2 + 1;
                        string2 = null;
                        if (StringsKt.N1(io.ktor.client.utils.d.f295392f, string, z10)) {
                            z11 = z10;
                            z13 = z11;
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295393g, string, z10)) {
                            z11 = z10;
                            z14 = z11;
                        } else {
                            if (StringsKt.N1(io.ktor.client.utils.d.f295388b, string, z10)) {
                                iK0 = jk.f.k0(string2, -1);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295399m, string, z10)) {
                                iK1 = jk.f.k0(string2, -1);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295397k, string, z10)) {
                                z11 = z10;
                                z15 = z11;
                            } else if (StringsKt.N1("public", string, z10)) {
                                z11 = z10;
                                z16 = z11;
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295395i, string, z10)) {
                                z11 = z10;
                                z17 = z11;
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295391e, string, z10)) {
                                iK2 = jk.f.k0(string2, Integer.MAX_VALUE);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295389c, string, z10)) {
                                iK3 = jk.f.k0(string2, -1);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295390d, string, z10)) {
                                z11 = z10;
                                z18 = z11;
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295394h, string, z10)) {
                                z11 = z10;
                                z19 = z11;
                            } else if (StringsKt.N1("immutable", string, z10)) {
                                z11 = z10;
                                z20 = z11;
                            }
                            z11 = z10;
                        }
                        strW = str;
                        size = i10;
                    }
                    i11++;
                    headers = uVar;
                    z11 = z11;
                    size = size;
                } else {
                    if (StringsKt.N1(strN, com.google.common.net.d.f119487e, z11)) {
                    }
                    i11++;
                    headers = uVar;
                    z11 = z11;
                    size = size;
                }
                z12 = false;
                iA = 0;
                while (iA < strW.length()) {
                    iA2 = a(strW, "=,;", iA);
                    String strSubstring4 = strW.substring(iA, iA2);
                    z10 = z11;
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt.E5(strSubstring4).toString();
                    if (iA2 != strW.length()) {
                        i10 = size;
                        if (strW.charAt(iA2) == ',') {
                        }
                        if (StringsKt.N1(io.ktor.client.utils.d.f295392f, string, z10)) {
                            z11 = z10;
                            z13 = z11;
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295393g, string, z10)) {
                            z11 = z10;
                            z14 = z11;
                        } else {
                            if (StringsKt.N1(io.ktor.client.utils.d.f295388b, string, z10)) {
                                iK0 = jk.f.k0(string2, -1);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295399m, string, z10)) {
                                iK1 = jk.f.k0(string2, -1);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295397k, string, z10)) {
                                z11 = z10;
                                z15 = z11;
                            } else if (StringsKt.N1("public", string, z10)) {
                                z11 = z10;
                                z16 = z11;
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295395i, string, z10)) {
                                z11 = z10;
                                z17 = z11;
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295391e, string, z10)) {
                                iK2 = jk.f.k0(string2, Integer.MAX_VALUE);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295389c, string, z10)) {
                                iK3 = jk.f.k0(string2, -1);
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295390d, string, z10)) {
                                z11 = z10;
                                z18 = z11;
                            } else if (StringsKt.N1(io.ktor.client.utils.d.f295394h, string, z10)) {
                                z11 = z10;
                                z19 = z11;
                            } else if (StringsKt.N1("immutable", string, z10)) {
                                z11 = z10;
                                z20 = z11;
                            }
                            z11 = z10;
                        }
                        strW = str;
                        size = i10;
                    } else {
                        i10 = size;
                    }
                    str = strW;
                    iA = iA2 + 1;
                    string2 = null;
                    if (StringsKt.N1(io.ktor.client.utils.d.f295392f, string, z10)) {
                        z11 = z10;
                        z13 = z11;
                    } else if (StringsKt.N1(io.ktor.client.utils.d.f295393g, string, z10)) {
                        z11 = z10;
                        z14 = z11;
                    } else {
                        if (StringsKt.N1(io.ktor.client.utils.d.f295388b, string, z10)) {
                            iK0 = jk.f.k0(string2, -1);
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295399m, string, z10)) {
                            iK1 = jk.f.k0(string2, -1);
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295397k, string, z10)) {
                            z11 = z10;
                            z15 = z11;
                        } else if (StringsKt.N1("public", string, z10)) {
                            z11 = z10;
                            z16 = z11;
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295395i, string, z10)) {
                            z11 = z10;
                            z17 = z11;
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295391e, string, z10)) {
                            iK2 = jk.f.k0(string2, Integer.MAX_VALUE);
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295389c, string, z10)) {
                            iK3 = jk.f.k0(string2, -1);
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295390d, string, z10)) {
                            z11 = z10;
                            z18 = z11;
                        } else if (StringsKt.N1(io.ktor.client.utils.d.f295394h, string, z10)) {
                            z11 = z10;
                            z19 = z11;
                        } else if (StringsKt.N1("immutable", string, z10)) {
                            z11 = z10;
                            z20 = z11;
                        }
                        z11 = z10;
                    }
                    strW = str;
                    size = i10;
                }
                i11++;
                headers = uVar;
                z11 = z11;
                size = size;
            }
            return new d(z13, z14, iK0, iK1, z15, z16, z17, iK2, iK3, z18, z19, z20, !z12 ? null : str2, null);
        }

        private b() {
        }
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    @oj.n
    @NotNull
    public static final d v(@NotNull u uVar) {
        return f333769n.c(uVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "immutable", imports = {}))
    @oj.i(name = "-deprecated_immutable")
    public final boolean a() {
        return this.f333783l;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "maxAgeSeconds", imports = {}))
    @oj.i(name = "-deprecated_maxAgeSeconds")
    public final int b() {
        return this.f333774c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "maxStaleSeconds", imports = {}))
    @oj.i(name = "-deprecated_maxStaleSeconds")
    public final int c() {
        return this.f333779h;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "minFreshSeconds", imports = {}))
    @oj.i(name = "-deprecated_minFreshSeconds")
    public final int d() {
        return this.f333780i;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "mustRevalidate", imports = {}))
    @oj.i(name = "-deprecated_mustRevalidate")
    public final boolean e() {
        return this.f333778g;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "noCache", imports = {}))
    @oj.i(name = "-deprecated_noCache")
    public final boolean f() {
        return this.f333772a;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "noStore", imports = {}))
    @oj.i(name = "-deprecated_noStore")
    public final boolean g() {
        return this.f333773b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "noTransform", imports = {}))
    @oj.i(name = "-deprecated_noTransform")
    public final boolean h() {
        return this.f333782k;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "onlyIfCached", imports = {}))
    @oj.i(name = "-deprecated_onlyIfCached")
    public final boolean i() {
        return this.f333781j;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "sMaxAgeSeconds", imports = {}))
    @oj.i(name = "-deprecated_sMaxAgeSeconds")
    public final int j() {
        return this.f333775d;
    }

    @oj.i(name = "immutable")
    public final boolean k() {
        return this.f333783l;
    }

    public final boolean l() {
        return this.f333776e;
    }

    public final boolean m() {
        return this.f333777f;
    }

    @oj.i(name = "maxAgeSeconds")
    public final int n() {
        return this.f333774c;
    }

    @oj.i(name = "maxStaleSeconds")
    public final int o() {
        return this.f333779h;
    }

    @oj.i(name = "minFreshSeconds")
    public final int p() {
        return this.f333780i;
    }

    @oj.i(name = "mustRevalidate")
    public final boolean q() {
        return this.f333778g;
    }

    @oj.i(name = "noCache")
    public final boolean r() {
        return this.f333772a;
    }

    @oj.i(name = "noStore")
    public final boolean s() {
        return this.f333773b;
    }

    @oj.i(name = "noTransform")
    public final boolean t() {
        return this.f333782k;
    }

    @NotNull
    public String toString() {
        String string = this.f333784m;
        if (string == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f333772a) {
                sb2.append("no-cache, ");
            }
            if (this.f333773b) {
                sb2.append("no-store, ");
            }
            if (this.f333774c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f333774c);
                sb2.append(", ");
            }
            if (this.f333775d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f333775d);
                sb2.append(", ");
            }
            if (this.f333776e) {
                sb2.append("private, ");
            }
            if (this.f333777f) {
                sb2.append("public, ");
            }
            if (this.f333778g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f333779h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f333779h);
                sb2.append(", ");
            }
            if (this.f333780i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f333780i);
                sb2.append(", ");
            }
            if (this.f333781j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f333782k) {
                sb2.append("no-transform, ");
            }
            if (this.f333783l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            this.f333784m = string;
        }
        return string;
    }

    @oj.i(name = "onlyIfCached")
    public final boolean u() {
        return this.f333781j;
    }

    @oj.i(name = "sMaxAgeSeconds")
    public final int w() {
        return this.f333775d;
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f333772a = z10;
        this.f333773b = z11;
        this.f333774c = i10;
        this.f333775d = i11;
        this.f333776e = z12;
        this.f333777f = z13;
        this.f333778g = z14;
        this.f333779h = i12;
        this.f333780i = i13;
        this.f333781j = z15;
        this.f333782k = z16;
        this.f333783l = z17;
        this.f333784m = str;
    }
}
