package ni;

import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.time.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nGMTDateParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GMTDateParser.kt\nio/ktor/util/date/GMTDateParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,134:1\n1#2:135\n1069#3,2:136\n*S KotlinDebug\n*F\n+ 1 GMTDateParser.kt\nio/ktor/util/date/GMTDateParser\n*L\n93#1:136,2\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f333365b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f333366c = 's';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f333367d = 'm';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f333368e = 'h';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f333369f = 'd';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f333370g = 'M';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f333371h = 'Y';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f333372i = 'z';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char f333373j = '*';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f333374a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f333374a = pattern;
        if (pattern.length() <= 0) {
            throw new IllegalStateException("Date parser pattern shouldn't be empty.");
        }
    }

    private final void a(e eVar, char c10, String str) {
        if (c10 != '*') {
            if (c10 == 'M') {
                eVar.k(h.f333375b.b(str));
                return;
            }
            if (c10 == 'Y') {
                eVar.m(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c10 == 'd') {
                eVar.h(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c10 == 'h') {
                eVar.i(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c10 == 'm') {
                eVar.j(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c10 == 's') {
                eVar.l(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c10 == 'z') {
                if (!Intrinsics.areEqual(str, m.f337525a)) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (str.charAt(i10) != c10) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    @NotNull
    public final GMTDate b(@NotNull String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        e eVar = new e();
        boolean z10 = true | false;
        char cCharAt = this.f333374a.charAt(0);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < this.f333374a.length()) {
            try {
                if (this.f333374a.charAt(i11) == cCharAt) {
                    i11++;
                } else {
                    int i13 = (i12 + i11) - i10;
                    String strSubstring = dateString.substring(i12, i13);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    a(eVar, cCharAt, strSubstring);
                    try {
                        cCharAt = this.f333374a.charAt(i11);
                        i10 = i11;
                        i11++;
                        i12 = i13;
                    } catch (Throwable unused) {
                        i12 = i13;
                        throw new g(dateString, i12, this.f333374a);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i12 < dateString.length()) {
            String strSubstring2 = dateString.substring(i12);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            a(eVar, cCharAt, strSubstring2);
        }
        return eVar.a();
    }
}
