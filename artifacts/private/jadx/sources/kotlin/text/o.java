package kotlin.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f313376a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Regex f313377b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f313377b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private o() {
    }
}
