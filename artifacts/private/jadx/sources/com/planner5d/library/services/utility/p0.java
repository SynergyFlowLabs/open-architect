package com.planner5d.library.services.utility;

import android.content.Context;
import android.graphics.Color;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public class p0 implements z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f229695e = Pattern.compile("[^\\w(),]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected w1 f229696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected fg.e<a> f229697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.model.manager.u1> f229698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1 f229699d = new a1();

    public interface a {
        void a(String str, @fj.h Exception exc);
    }

    @ij.a
    public p0() {
    }

    private String i(Date date, int i10) {
        if (date == null) {
            return null;
        }
        return DateFormat.getDateInstance(i10, this.f229696a.a()).format(date);
    }

    @fj.g
    private String n(@fj.g Context context, @fj.g Date date, int i10, int i11) {
        Locale localeA = this.f229696a.a();
        return String.format("%s, %s", i0.e(date) ? context.getString(o2.q.Cb) : DateFormat.getDateInstance(i10, localeA).format(date), DateFormat.getTimeInstance(i11, localeA).format(date));
    }

    private Currency p(String str) {
        if (str == null) {
            this.f229698c.get().b("currency_code", AbstractJsonLexerKt.NULL, new Exception("Empty currency_code"));
            return Currency.getInstance(Locale.getDefault());
        }
        try {
            return Currency.getInstance(str);
        } catch (IllegalArgumentException e10) {
            this.f229698c.get().b("currency_code", str, e10);
            return Currency.getInstance(Locale.getDefault());
        }
    }

    public String A(float f10) {
        return y0.f229846d.get().format(f10);
    }

    public String B(float f10, String str) {
        Currency currencyP = p(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setMaximumFractionDigits(2);
        currencyInstance.setCurrency(currencyP);
        return currencyInstance.format(f10);
    }

    public String C(float f10, String str) {
        Currency currencyP = p(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setMaximumFractionDigits(2);
        currencyInstance.setCurrency(currencyP);
        String strTrim = currencyInstance.format(0.0d).replace("0.00", "").trim();
        return currencyInstance.format(f10).replace(strTrim, " " + strTrim + " ").trim();
    }

    @e.a({"StringFormatInvalid"})
    public String D(Context context, long j10) {
        long j11 = (j10 / 1000) / 60;
        long j12 = j11 / 60;
        long j13 = j12 / 24;
        return j13 > 0 ? context.getString(o2.q.en, Long.valueOf(j13), Long.valueOf(j12 % 24)) : context.getString(o2.q.fn, Long.valueOf(j12), Long.valueOf(j11 % 60));
    }

    public String E(Date date) {
        return i(date, 3);
    }

    public String F(Date date) {
        return y0.f229852j.get().format(date);
    }

    public long G(String str) throws ParseException {
        SimpleDateFormat simpleDateFormatI = y0.f229847e.i();
        simpleDateFormatI.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormatI.parse(str);
        if (date != null) {
            return date.getTime();
        }
        throw new ParseException("Could not parse " + str, 0);
    }

    @Override // com.planner5d.library.services.utility.z0
    public JSONObject a(InputStream inputStream) throws JSONException, IOException {
        return this.f229699d.a(inputStream);
    }

    @fj.g
    public String b(@fj.g Context context, int i10) {
        int i11;
        float f10;
        float f11;
        if (i10 >= 1048576) {
            i11 = o2.q.Ob;
            f10 = i10;
            f11 = 1048576.0f;
        } else {
            i11 = o2.q.Nb;
            f10 = i10;
            f11 = 1024.0f;
        }
        return context.getString(i11, String.format(this.f229696a.a(), "%.1f", Float.valueOf(f10 / f11)));
    }

    public int c(String str, double d10) {
        try {
            int iZ = z(str);
            if (iZ == 0) {
                return iZ;
            }
            return (((int) Math.min(255.0d, Math.max(0.0d, d10 * 255.0d))) << 24) | (iZ & 16777215);
        } catch (IllegalArgumentException e10) {
            this.f229697b.get().a(str, e10);
            return 0;
        }
    }

    public String d(int i10) {
        return String.format("#%06X", Integer.valueOf(16777215 & i10));
    }

    public String e(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.replaceAll("[^\\w#(),]", "").trim();
        if (strTrim.isEmpty() || "none".equals(strTrim) || AbstractJsonLexerKt.NULL.equals(strTrim)) {
            return null;
        }
        int i10 = 3 | 1;
        if (strTrim.startsWith("rgb")) {
            String[] strArrSplit = strTrim.split("\\(")[1].split("\\)")[0].split(",");
            if (strArrSplit.length != 3) {
                fg.e<a> eVar = this.f229697b;
                if (eVar != null) {
                    eVar.get().a(strTrim, null);
                }
                return null;
            }
            strTrim = "#" + String.format("%02x", Integer.valueOf(strArrSplit[0].trim())) + String.format("%02x", Integer.valueOf(strArrSplit[1].trim())) + String.format("%02x", Integer.valueOf(strArrSplit[2].trim()));
        }
        String str2 = "#" + strTrim.replace("#", "");
        if (str2.length() == 2) {
            str2 = str2 + "00000";
        } else if (str2.length() == 3) {
            str2 = str2 + "0000";
        } else if (str2.length() == 4) {
            str2 = "#" + str2.charAt(1) + str2.charAt(1) + str2.charAt(2) + str2.charAt(2) + str2.charAt(3) + str2.charAt(3);
        } else if (str2.length() == 5) {
            str2 = str2 + "00";
        } else if (str2.length() == 6) {
            str2 = str2 + com.facebook.appevents.p.f99189d0;
        }
        return str2.toUpperCase();
    }

    public String f(Date date) {
        return y0.f229847e.get().format(date);
    }

    public Date g(String str) {
        try {
            return y0.f229847e.get().parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    public String h(Date date) {
        return i(date, 2);
    }

    public String j(Date date) {
        return y0.f229851i.get().format(date);
    }

    public String k(Date date) {
        return y0.f229850h.get().format(date);
    }

    public String l(Date date) {
        return y0.f229849g.get().format(date);
    }

    public String m(Context context, Date date) {
        if (date == null) {
            return null;
        }
        return n(context, date, 3, 3);
    }

    public String o(Date date) {
        return y0.f229848f.get().format(date);
    }

    public JSONObject q(String str) throws JSONException, IOException {
        return r(str == null ? null : str.getBytes(Charset.defaultCharset()));
    }

    public JSONObject r(byte[] bArr) throws JSONException, IOException {
        if (bArr != null) {
            return a(new ByteArrayInputStream(bArr));
        }
        throw new IOException("Null byte array data supplied");
    }

    public Object s(InputStream inputStream) throws JSONException, IOException {
        return this.f229699d.i(inputStream);
    }

    public Object t(byte[] bArr) throws JSONException, IOException {
        if (bArr != null) {
            return s(new ByteArrayInputStream(bArr));
        }
        throw new IOException("Null byte array data supplied");
    }

    @fj.g
    public String u(int i10) {
        String str;
        if (!Locale.getDefault().equals(Locale.US)) {
            return String.valueOf(i10);
        }
        int i11 = i10 % 100;
        int i12 = i10 % 10;
        if (i12 == 1 && i11 != 11) {
            str = "%dst";
        } else if (i12 != 2 || i11 == 12) {
            str = (i12 != 3 || i11 == 13) ? "%dth" : "%drd";
        } else {
            str = "%dnd";
        }
        return String.format(str, Integer.valueOf(i10));
    }

    @fj.g
    public String v(@fj.g Context context, @fj.g Date date) {
        return n(context, date, 1, 3);
    }

    public String w(long j10) {
        long jMax = Math.max(j10 / 1000, 1L);
        DecimalFormat decimalFormat = y0.f229853k.get();
        return decimalFormat.format(jMax / 3600) + ":" + decimalFormat.format((jMax / 60) % 60) + ":" + decimalFormat.format(jMax % 60);
    }

    public String x(float f10) {
        return y0.f229845c.get().format(f10);
    }

    public String y(int i10) {
        return y0.f229845c.get().format(i10);
    }

    @androidx.annotation.l1
    public int z(@fj.h String str) throws IllegalArgumentException {
        if (str == null) {
            return 0;
        }
        String strTrim = f229695e.matcher(str).replaceAll("").trim();
        if (!strTrim.isEmpty() && !"none".equals(strTrim) && !AbstractJsonLexerKt.NULL.equals(strTrim)) {
            if (strTrim.startsWith("rgb")) {
                String[] strArrSplit = strTrim.split("\\(")[1].split("\\)")[0].split(",");
                if (strArrSplit.length == 3) {
                    return Color.rgb(Integer.parseInt(strArrSplit[0].trim()), Integer.parseInt(strArrSplit[1].trim()), Integer.parseInt(strArrSplit[2].trim()));
                }
                fg.e<a> eVar = this.f229697b;
                if (eVar != null) {
                    eVar.get().a(strTrim, null);
                }
                return 0;
            }
            int length = strTrim.length();
            if (length > 6) {
                return 0;
            }
            if (length != 3) {
                return (Integer.parseInt(strTrim, 16) << (24 - (length * 4))) | (-16777216);
            }
            return Color.parseColor("#" + strTrim.charAt(0) + strTrim.charAt(0) + strTrim.charAt(1) + strTrim.charAt(1) + strTrim.charAt(2) + strTrim.charAt(2));
        }
        return 0;
    }
}
