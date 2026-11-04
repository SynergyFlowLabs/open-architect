package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.l;
import org.apache.commons.lang3.time.m;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f307037a = "UTC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeZone f307038b = TimeZone.getTimeZone(f307037a);

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String b(Date date) {
        return d(date, false, f307038b);
    }

    public static String c(Date date, boolean z10) {
        return d(date, z10, f307038b);
    }

    public static String d(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        f(sb2, gregorianCalendar.get(1), 4);
        char c10 = l.f335457d;
        sb2.append(l.f335457d);
        f(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append(l.f335457d);
        f(sb2, gregorianCalendar.get(5), 2);
        sb2.append(org.locationtech.jts.geom.l.f338158h);
        f(sb2, gregorianCalendar.get(11), 2);
        sb2.append(AbstractJsonLexerKt.COLON);
        f(sb2, gregorianCalendar.get(12), 2);
        sb2.append(AbstractJsonLexerKt.COLON);
        f(sb2, gregorianCalendar.get(13), 2);
        if (z10) {
            sb2.append('.');
            f(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            if (offset >= 0) {
                c10 = '+';
            }
            sb2.append(c10);
            f(sb2, iAbs, 2);
            sb2.append(AbstractJsonLexerKt.COLON);
            f(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private static int e(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void f(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append(org.locationtech.jts.geom.l.f338160j);
        }
        sb2.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:19:0x0056, B:21:0x0066, B:22:0x0068, B:24:0x0074, B:25:0x0077, B:27:0x007d, B:31:0x0087, B:36:0x0097, B:38:0x009f, B:49:0x00d7, B:51:0x00dd, B:53:0x00e3, B:77:0x0196, B:57:0x00ed, B:58:0x0108, B:59:0x0109, B:63:0x0125, B:65:0x0132, B:68:0x013b, B:70:0x015a, B:73:0x016b, B:74:0x0191, B:76:0x0194, B:62:0x0114, B:79:0x01c7, B:80:0x01ce, B:42:0x00b7, B:43:0x00ba), top: B:91:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:19:0x0056, B:21:0x0066, B:22:0x0068, B:24:0x0074, B:25:0x0077, B:27:0x007d, B:31:0x0087, B:36:0x0097, B:38:0x009f, B:49:0x00d7, B:51:0x00dd, B:53:0x00e3, B:77:0x0196, B:57:0x00ed, B:58:0x0108, B:59:0x0109, B:63:0x0125, B:65:0x0132, B:68:0x013b, B:70:0x015a, B:73:0x016b, B:74:0x0191, B:76:0x0194, B:62:0x0114, B:79:0x01c7, B:80:0x01ce, B:42:0x00b7, B:43:0x00ba), top: B:91:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:19:0x0056, B:21:0x0066, B:22:0x0068, B:24:0x0074, B:25:0x0077, B:27:0x007d, B:31:0x0087, B:36:0x0097, B:38:0x009f, B:49:0x00d7, B:51:0x00dd, B:53:0x00e3, B:77:0x0196, B:57:0x00ed, B:58:0x0108, B:59:0x0109, B:63:0x0125, B:65:0x0132, B:68:0x013b, B:70:0x015a, B:73:0x016b, B:74:0x0191, B:76:0x0194, B:62:0x0114, B:79:0x01c7, B:80:0x01ce, B:42:0x00b7, B:43:0x00ba), top: B:91:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0194 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:19:0x0056, B:21:0x0066, B:22:0x0068, B:24:0x0074, B:25:0x0077, B:27:0x007d, B:31:0x0087, B:36:0x0097, B:38:0x009f, B:49:0x00d7, B:51:0x00dd, B:53:0x00e3, B:77:0x0196, B:57:0x00ed, B:58:0x0108, B:59:0x0109, B:63:0x0125, B:65:0x0132, B:68:0x013b, B:70:0x015a, B:73:0x016b, B:74:0x0191, B:76:0x0194, B:62:0x0114, B:79:0x01c7, B:80:0x01ce, B:42:0x00b7, B:43:0x00ba), top: B:91:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c7 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:19:0x0056, B:21:0x0066, B:22:0x0068, B:24:0x0074, B:25:0x0077, B:27:0x007d, B:31:0x0087, B:36:0x0097, B:38:0x009f, B:49:0x00d7, B:51:0x00dd, B:53:0x00e3, B:77:0x0196, B:57:0x00ed, B:58:0x0108, B:59:0x0109, B:63:0x0125, B:65:0x0132, B:68:0x013b, B:70:0x015a, B:73:0x016b, B:74:0x0191, B:76:0x0194, B:62:0x0114, B:79:0x01c7, B:80:0x01ce, B:42:0x00b7, B:43:0x00ba), top: B:91:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0114, please report this as an issue */
    public static Date g(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i10;
        int i11;
        int i12;
        int iH;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i13 = index + 4;
            int iH2 = h(str, index, i13);
            if (a(str, i13, l.f335457d)) {
                i13 = index + 5;
            }
            int i14 = i13 + 2;
            int iH3 = h(str, i13, i14);
            if (a(str, i14, l.f335457d)) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int iH4 = h(str, i14, i15);
            boolean zA = a(str, i15, org.locationtech.jts.geom.l.f338158h);
            if (!zA && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iH2, iH3 - 1, iH4);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i16 = i14 + 5;
                int iH5 = h(str, i14 + 3, i16);
                if (a(str, i16, AbstractJsonLexerKt.COLON)) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                int iH6 = h(str, i16, i17);
                if (a(str, i17, AbstractJsonLexerKt.COLON)) {
                    i17 = i16 + 3;
                }
                if (str.length() <= i17 || (cCharAt2 = str.charAt(i17)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i15 = i17;
                    i10 = iH5;
                    i11 = iH6;
                } else {
                    int i18 = i17 + 2;
                    iH = h(str, i17, i18);
                    if (iH > 59 && iH < 63) {
                        iH = 59;
                    }
                    if (a(str, i18, '.')) {
                        int i19 = i17 + 3;
                        int iE = e(str, i17 + 4);
                        int iMin = Math.min(iE, i17 + 6);
                        int iH7 = h(str, i19, iMin);
                        int i20 = iMin - i19;
                        if (i20 == 1) {
                            iH7 *= 100;
                        } else if (i20 == 2) {
                            iH7 *= 10;
                        }
                        i10 = iH5;
                        i15 = iE;
                        i11 = iH6;
                        i12 = iH7;
                    } else {
                        i10 = iH5;
                        i15 = i18;
                        i11 = iH6;
                        i12 = 0;
                    }
                }
                if (str.length() > i15) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i15);
                if (cCharAt == 'Z') {
                    timeZone = f307038b;
                    length = i15 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i15);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i15 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = f307038b;
                    } else {
                        String str3 = m.f337525a + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iH2);
                gregorianCalendar2.set(2, iH3 - 1);
                gregorianCalendar2.set(5, iH4);
                gregorianCalendar2.set(11, i10);
                gregorianCalendar2.set(12, i11);
                gregorianCalendar2.set(13, iH);
                gregorianCalendar2.set(14, i12);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i10 = 0;
            i11 = 0;
            i12 = 0;
            iH = 0;
            if (str.length() > i15) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i15);
            if (cCharAt == 'Z') {
                timeZone = f307038b;
                length = i15 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i15);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i15 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = f307038b;
                } else {
                    timeZone = f307038b;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iH2);
            gregorianCalendar3.set(2, iH3 - 1);
            gregorianCalendar3.set(5, iH4);
            gregorianCalendar3.set(11, i10);
            gregorianCalendar3.set(12, i11);
            gregorianCalendar3.set(13, iH);
            gregorianCalendar3.set(14, i12);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e10) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e10.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e10.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e10);
            throw parseException;
        }
    }

    private static int h(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
