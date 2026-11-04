package androidx.compose.ui.platform;

import android.graphics.Rect;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40287a = 0;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static abstract class a implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40288c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected String f40289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final int[] f40290b = new int[2];

        @Nullable
        protected final int[] c(int i10, int i11) {
            if (i10 < 0 || i11 < 0 || i10 == i11) {
                return null;
            }
            int[] iArr = this.f40290b;
            iArr[0] = i10;
            iArr[1] = i11;
            return iArr;
        }

        @NotNull
        protected final String d() {
            String str = this.f40289a;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("text");
            return null;
        }

        public void e(@NotNull String str) {
            f(str);
        }

        protected final void f(@NotNull String str) {
            this.f40289a = str;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.b$b, reason: collision with other inner class name */
    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static class C0315b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f40291e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f40292f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private static C0315b f40293g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private BreakIterator f40294d;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final C0315b a(@NotNull Locale locale) {
                if (C0315b.f40293g == null) {
                    C0315b.f40293g = new C0315b(locale, null);
                }
                C0315b c0315b = C0315b.f40293g;
                Intrinsics.checkNotNull(c0315b, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return c0315b;
            }

            private a() {
            }
        }

        public /* synthetic */ C0315b(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final void i(Locale locale) {
            this.f40294d = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] a(int i10) {
            int length = d().length();
            if (length <= 0 || i10 >= length) {
                return null;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            do {
                BreakIterator breakIterator = this.f40294d;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f40294d;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    int iFollowing = breakIterator2.following(i10);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return c(i10, iFollowing);
                }
                BreakIterator breakIterator3 = this.f40294d;
                if (breakIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator3 = null;
                }
                i10 = breakIterator3.following(i10);
            } while (i10 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] b(int i10) {
            int length = d().length();
            if (length > 0 && i10 > 0) {
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = this.f40294d;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator = null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f40294d;
                        if (breakIterator2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("impl");
                            breakIterator2 = null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return c(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = this.f40294d;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator3 = null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.b.a
        public void e(@NotNull String str) {
            super.e(str);
            BreakIterator breakIterator = this.f40294d;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        private C0315b(Locale locale) {
            i(locale);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class c extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private static c f40297g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.compose.ui.text.p3 f40300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f40295e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f40296f = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.ui.text.style.i f40298h = androidx.compose.ui.text.style.i.Rtl;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.ui.text.style.i f40299i = androidx.compose.ui.text.style.i.Ltr;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final c a() {
                if (c.f40297g == null) {
                    c.f40297g = new c(null);
                }
                c cVar = c.f40297g;
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return cVar;
            }

            private a() {
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int i(int i10, androidx.compose.ui.text.style.i iVar) {
            androidx.compose.ui.text.p3 p3Var = this.f40300d;
            androidx.compose.ui.text.p3 p3Var2 = null;
            if (p3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                p3Var = null;
            }
            int iV = p3Var.v(i10);
            androidx.compose.ui.text.p3 p3Var3 = this.f40300d;
            if (p3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                p3Var3 = null;
            }
            if (iVar != p3Var3.z(iV)) {
                androidx.compose.ui.text.p3 p3Var4 = this.f40300d;
                if (p3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    p3Var2 = p3Var4;
                }
                return p3Var2.v(i10);
            }
            androidx.compose.ui.text.p3 p3Var5 = this.f40300d;
            if (p3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                p3Var5 = null;
            }
            return androidx.compose.ui.text.p3.q(p3Var5, i10, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] a(int i10) {
            int iR;
            if (d().length() <= 0 || i10 >= d().length()) {
                return null;
            }
            if (i10 < 0) {
                androidx.compose.ui.text.p3 p3Var = this.f40300d;
                if (p3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var = null;
                }
                iR = p3Var.r(0);
            } else {
                androidx.compose.ui.text.p3 p3Var2 = this.f40300d;
                if (p3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var2 = null;
                }
                int iR2 = p3Var2.r(i10);
                iR = i(iR2, f40298h) == i10 ? iR2 : iR2 + 1;
            }
            androidx.compose.ui.text.p3 p3Var3 = this.f40300d;
            if (p3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                p3Var3 = null;
            }
            if (iR >= p3Var3.o()) {
                return null;
            }
            return c(i(iR, f40298h), i(iR, f40299i) + 1);
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] b(int i10) {
            int iR;
            if (d().length() <= 0 || i10 <= 0) {
                return null;
            }
            if (i10 > d().length()) {
                androidx.compose.ui.text.p3 p3Var = this.f40300d;
                if (p3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var = null;
                }
                iR = p3Var.r(d().length());
            } else {
                androidx.compose.ui.text.p3 p3Var2 = this.f40300d;
                if (p3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var2 = null;
                }
                int iR2 = p3Var2.r(i10);
                iR = i(iR2, f40299i) + 1 == i10 ? iR2 : iR2 - 1;
            }
            if (iR < 0) {
                return null;
            }
            return c(i(iR, f40298h), i(iR, f40299i) + 1);
        }

        public final void j(@NotNull String str, @NotNull androidx.compose.ui.text.p3 p3Var) {
            f(str);
            this.f40300d = p3Var;
        }

        private c() {
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAccessibilityIterators.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityIterators.android.kt\nandroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,530:1\n62#2:531\n62#2:533\n26#3:532\n26#3:534\n*S KotlinDebug\n*F\n+ 1 AccessibilityIterators.android.kt\nandroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator\n*L\n455#1:531\n490#1:533\n455#1:532\n490#1:534\n*E\n"})
    public static final class d extends a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private static d f40303i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.compose.ui.text.p3 f40306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.compose.ui.semantics.u f40307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private Rect f40308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final a f40301g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f40302h = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.ui.text.style.i f40304j = androidx.compose.ui.text.style.i.Rtl;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.ui.text.style.i f40305k = androidx.compose.ui.text.style.i.Ltr;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final d a() {
                if (d.f40303i == null) {
                    d.f40303i = new d(null);
                }
                d dVar = d.f40303i;
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return dVar;
            }

            private a() {
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int i(int i10, androidx.compose.ui.text.style.i iVar) {
            androidx.compose.ui.text.p3 p3Var = this.f40306d;
            androidx.compose.ui.text.p3 p3Var2 = null;
            if (p3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                p3Var = null;
            }
            int iV = p3Var.v(i10);
            androidx.compose.ui.text.p3 p3Var3 = this.f40306d;
            if (p3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                p3Var3 = null;
            }
            if (iVar != p3Var3.z(iV)) {
                androidx.compose.ui.text.p3 p3Var4 = this.f40306d;
                if (p3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    p3Var2 = p3Var4;
                }
                return p3Var2.v(i10);
            }
            androidx.compose.ui.text.p3 p3Var5 = this.f40306d;
            if (p3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                p3Var5 = null;
            }
            return androidx.compose.ui.text.p3.q(p3Var5, i10, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] a(int i10) {
            int iO;
            androidx.compose.ui.text.p3 p3Var = null;
            if (d().length() <= 0 || i10 >= d().length()) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.u uVar = this.f40307e;
                if (uVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    uVar = null;
                }
                n0.j jVarM = uVar.m();
                int iRound = Math.round(jVarM.j() - jVarM.B());
                int iU = kotlin.ranges.r.u(0, i10);
                androidx.compose.ui.text.p3 p3Var2 = this.f40306d;
                if (p3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var2 = null;
                }
                int iR = p3Var2.r(iU);
                androidx.compose.ui.text.p3 p3Var3 = this.f40306d;
                if (p3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var3 = null;
                }
                float fW = p3Var3.w(iR) + iRound;
                androidx.compose.ui.text.p3 p3Var4 = this.f40306d;
                if (p3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var4 = null;
                }
                androidx.compose.ui.text.p3 p3Var5 = this.f40306d;
                if (p3Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var5 = null;
                }
                if (fW < p3Var4.w(p3Var5.o() - 1)) {
                    androidx.compose.ui.text.p3 p3Var6 = this.f40306d;
                    if (p3Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        p3Var = p3Var6;
                    }
                    iO = p3Var.s(fW);
                } else {
                    androidx.compose.ui.text.p3 p3Var7 = this.f40306d;
                    if (p3Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        p3Var = p3Var7;
                    }
                    iO = p3Var.o();
                }
                return c(iU, i(iO - 1, f40305k) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] b(int i10) {
            int iS;
            androidx.compose.ui.text.p3 p3Var = null;
            if (d().length() <= 0 || i10 <= 0) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.u uVar = this.f40307e;
                if (uVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    uVar = null;
                }
                n0.j jVarM = uVar.m();
                int iRound = Math.round(jVarM.j() - jVarM.B());
                int iB = kotlin.ranges.r.B(d().length(), i10);
                androidx.compose.ui.text.p3 p3Var2 = this.f40306d;
                if (p3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var2 = null;
                }
                int iR = p3Var2.r(iB);
                androidx.compose.ui.text.p3 p3Var3 = this.f40306d;
                if (p3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    p3Var3 = null;
                }
                float fW = p3Var3.w(iR) - iRound;
                if (fW > 0.0f) {
                    androidx.compose.ui.text.p3 p3Var4 = this.f40306d;
                    if (p3Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        p3Var = p3Var4;
                    }
                    iS = p3Var.s(fW);
                } else {
                    iS = 0;
                }
                if (iB == d().length() && iS < iR) {
                    iS++;
                }
                return c(i(iS, f40304j), iB);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void j(@NotNull String str, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull androidx.compose.ui.semantics.u uVar) {
            f(str);
            this.f40306d = p3Var;
            this.f40307e = uVar;
        }

        private d() {
            this.f40308f = new Rect();
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f40309d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f40310e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private static e f40311f;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final e a() {
                if (e.f40311f == null) {
                    e.f40311f = new e(null);
                }
                e eVar = e.f40311f;
                Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return eVar;
            }

            private a() {
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean i(int i10) {
            if (i10 <= 0 || d().charAt(i10 - 1) == '\n') {
                return false;
            }
            return i10 == d().length() || d().charAt(i10) == '\n';
        }

        private final boolean j(int i10) {
            return d().charAt(i10) != '\n' && (i10 == 0 || d().charAt(i10 - 1) == '\n');
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] a(int i10) {
            int length = d().length();
            if (length > 0 && i10 < length) {
                if (i10 < 0) {
                    i10 = 0;
                }
                while (i10 < length && d().charAt(i10) == '\n' && !j(i10)) {
                    i10++;
                }
                if (i10 >= length) {
                    return null;
                }
                int i11 = i10 + 1;
                while (i11 < length && !i(i11)) {
                    i11++;
                }
                return c(i10, i11);
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] b(int i10) {
            int length = d().length();
            if (length <= 0 || i10 <= 0) {
                return null;
            }
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !i(i10)) {
                i10--;
            }
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            while (i11 > 0 && !j(i11)) {
                i11--;
            }
            return c(i11, i10);
        }

        private e() {
        }
    }

    public interface f {
        @Nullable
        int[] a(int i10);

        @Nullable
        int[] b(int i10);
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f40312e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f40313f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private static g f40314g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private BreakIterator f40315d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final g a(@NotNull Locale locale) {
                if (g.f40314g == null) {
                    g.f40314g = new g(locale, null);
                }
                g gVar = g.f40314g;
                Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return gVar;
            }

            private a() {
            }
        }

        public /* synthetic */ g(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final boolean i(int i10) {
            return i10 > 0 && j(i10 + (-1)) && (i10 == d().length() || !j(i10));
        }

        private final boolean j(int i10) {
            if (i10 < 0 || i10 >= d().length()) {
                return false;
            }
            return Character.isLetterOrDigit(d().codePointAt(i10));
        }

        private final boolean k(int i10) {
            return j(i10) && (i10 == 0 || !j(i10 - 1));
        }

        private final void l(Locale locale) {
            this.f40315d = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] a(int i10) {
            if (d().length() > 0 && i10 < d().length()) {
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!j(i10) && !k(i10)) {
                    BreakIterator breakIterator = this.f40315d;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator = null;
                    }
                    i10 = breakIterator.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator2 = this.f40315d;
                if (breakIterator2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1 || !i(iFollowing)) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.b.f
        @Nullable
        public int[] b(int i10) {
            int length = d().length();
            if (length <= 0 || i10 <= 0) {
                return null;
            }
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
                BreakIterator breakIterator = this.f40315d;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f40315d;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(i10);
            if (iPreceding == -1 || !k(iPreceding)) {
                return null;
            }
            return c(iPreceding, i10);
        }

        @Override // androidx.compose.ui.platform.b.a
        public void e(@NotNull String str) {
            super.e(str);
            BreakIterator breakIterator = this.f40315d;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        private g(Locale locale) {
            l(locale);
        }
    }
}
