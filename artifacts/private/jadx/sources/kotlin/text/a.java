package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum a {
    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f313252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f313253b;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f313244o3 = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C2265a f313223c = new C2265a(null);

    /* JADX INFO: renamed from: kotlin.text.a$a, reason: collision with other inner class name */
    public static final class C2265a {
        public /* synthetic */ C2265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(int i10) {
            if (i10 >= 0 && i10 < 17) {
                return a.o().get(i10);
            }
            if (18 <= i10 && i10 < 31) {
                return a.o().get(i10 - 1);
            }
            throw new IllegalArgumentException("Category #" + i10 + " is not defined.");
        }

        private C2265a() {
        }
    }

    static {
        int i10 = 3 << 5;
    }

    a(int i10, String str) {
        this.f313252a = i10;
        this.f313253b = str;
    }

    @NotNull
    public static kotlin.enums.a<a> o() {
        return f313244o3;
    }

    public final boolean l(char c10) {
        if (Character.getType(c10) != this.f313252a) {
            return false;
        }
        int i10 = 7 & 1;
        return true;
    }

    @NotNull
    public final String n() {
        return this.f313253b;
    }

    public final int p() {
        return this.f313252a;
    }
}
