package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.android.x;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nWordIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordIterator.android.kt\nandroidx/compose/ui/text/android/selection/WordIterator\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,377:1\n118#2,4:378\n118#2,4:382\n118#2,4:386\n*S KotlinDebug\n*F\n+ 1 WordIterator.android.kt\nandroidx/compose/ui/text/android/selection/WordIterator\n*L\n44#1:378,4\n47#1:382,4\n323#1:386,4\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f41430e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41431f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41432g = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f41433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final BreakIterator f41436d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private a() {
        }
    }

    public h(@NotNull CharSequence charSequence, int i10, int i11, @Nullable Locale locale) {
        this.f41433a = charSequence;
        if (!(i10 >= 0 && i10 <= charSequence.length())) {
            x0.a.e("input start index is outside the CharSequence");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            x0.a.e("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f41436d = wordInstance;
        this.f41434b = Math.max(0, i10 - 50);
        this.f41435c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new x(charSequence, i10, i11));
    }

    private final void a(int i10) {
        int i11 = this.f41434b;
        boolean z10 = false;
        if (i10 <= this.f41435c && i11 <= i10) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("Invalid offset: " + i10 + ". Valid range is [" + this.f41434b + " , " + this.f41435c + AbstractJsonLexerKt.END_LIST);
        }
    }

    private final int b(int i10, boolean z10) {
        a(i10);
        if (m(i10)) {
            return (!k(i10) || (i(i10) && z10)) ? r(i10) : i10;
        }
        if (i(i10)) {
            return r(i10);
        }
        return -1;
    }

    private final int d(int i10, boolean z10) {
        a(i10);
        if (i(i10)) {
            return (!k(i10) || (m(i10) && z10)) ? q(i10) : i10;
        }
        if (m(i10)) {
            return q(i10);
        }
        return -1;
    }

    private final boolean i(int i10) {
        int i11 = this.f41434b + 1;
        if (i10 <= this.f41435c && i11 <= i10) {
            if (Character.isLetterOrDigit(Character.codePointBefore(this.f41433a, i10))) {
                return true;
            }
            int i12 = i10 - 1;
            if (Character.isSurrogate(this.f41433a.charAt(i12))) {
                return true;
            }
            if (androidx.emoji2.text.f.q()) {
                androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
                if (fVarC.i() == 1 && fVarC.h(this.f41433a, i12) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean k(int i10) {
        a(i10);
        return this.f41436d.isBoundary(i10) && !(m(i10) && m(i10 + (-1)) && m(i10 + 1)) && (i10 <= 0 || i10 >= this.f41433a.length() - 1 || !(l(i10) || l(i10 + 1)));
    }

    private final boolean l(int i10) {
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.f41433a.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.areEqual(unicodeBlockOf, unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.f41433a.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.areEqual(Character.UnicodeBlock.of(this.f41433a.charAt(i10)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.f41433a.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean m(int i10) {
        int i11 = this.f41434b;
        if (i10 < this.f41435c && i11 <= i10) {
            if (Character.isLetterOrDigit(Character.codePointAt(this.f41433a, i10)) || Character.isSurrogate(this.f41433a.charAt(i10))) {
                return true;
            }
            if (androidx.emoji2.text.f.q()) {
                androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
                if (fVarC.i() == 1 && fVarC.h(this.f41433a, i10) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean o(int i10) {
        return !n(i10) && j(i10);
    }

    private final boolean p(int i10) {
        return n(i10) && !j(i10);
    }

    @NotNull
    public final CharSequence c() {
        return this.f41433a;
    }

    public final int e(int i10) {
        return d(i10, true);
    }

    public final int f(int i10) {
        return b(i10, true);
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !p(i10)) {
            i10 = r(i10);
        }
        return i10;
    }

    public final int h(int i10) {
        a(i10);
        while (i10 != -1 && !o(i10)) {
            i10 = q(i10);
        }
        return i10;
    }

    public final boolean j(int i10) {
        int i11 = this.f41434b + 1;
        if (i10 > this.f41435c || i11 > i10) {
            return false;
        }
        return f41430e.a(Character.codePointBefore(this.f41433a, i10));
    }

    public final boolean n(int i10) {
        int i11 = this.f41434b;
        if (i10 >= this.f41435c || i11 > i10) {
            return false;
        }
        return f41430e.a(Character.codePointAt(this.f41433a, i10));
    }

    public final int q(int i10) {
        a(i10);
        int iFollowing = this.f41436d.following(i10);
        return (m(iFollowing + (-1)) && m(iFollowing) && !l(iFollowing)) ? q(iFollowing) : iFollowing;
    }

    public final int r(int i10) {
        a(i10);
        int iPreceding = this.f41436d.preceding(i10);
        return (m(iPreceding) && i(iPreceding) && !l(iPreceding)) ? r(iPreceding) : iPreceding;
    }
}
