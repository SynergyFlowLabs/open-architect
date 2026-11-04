package xd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f390621a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f390622b = Pattern.compile("^([0-9]+|.{3,})$");

    private boolean a(String[] strArr) {
        for (String str : strArr) {
            if (this.f390622b.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private String c(String str) {
        return str.trim();
    }

    private String[] d(String str) {
        return str.replaceAll("[_\"\\-;:,.]+", " ").split("\\s");
    }

    public String[] b(String str, boolean z10) {
        String[] strArr;
        synchronized (this.f390621a) {
            try {
                String[] strArrD = d(str);
                this.f390621a.clear();
                for (String str2 : strArrD) {
                    String strC = c(str2);
                    if (!strC.isEmpty()) {
                        this.f390621a.add(strC);
                    }
                }
                strArr = (String[]) this.f390621a.toArray(new String[0]);
                if (z10 && !a(strArr)) {
                    strArr = new String[0];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strArr;
    }
}
