package androidx.media2.exoplayer.external.text.ssa;

import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.text.c;
import androidx.media2.exoplayer.external.text.e;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f56808t = "SsaDecoder";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f56809u = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f56810v = "Format: ";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f56811w = "Dialogue: ";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f56812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f56813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f56814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f56815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f56816s;

    public a() {
        this(null);
    }

    private void B(String dialogueLine, List<androidx.media2.exoplayer.external.text.b> cues, q cueTimesUs) {
        long jF;
        if (this.f56813p == 0) {
            String strValueOf = String.valueOf(dialogueLine);
            p.l(f56808t, strValueOf.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strValueOf) : new String("Skipping dialogue line before complete format: "));
            return;
        }
        String[] strArrSplit = dialogueLine.substring(10).split(",", this.f56813p);
        if (strArrSplit.length != this.f56813p) {
            p.l(f56808t, dialogueLine.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(dialogueLine) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long jF2 = F(strArrSplit[this.f56814q]);
        if (jF2 == -9223372036854775807L) {
            p.l(f56808t, dialogueLine.length() != 0 ? "Skipping invalid timing: ".concat(dialogueLine) : new String("Skipping invalid timing: "));
            return;
        }
        String str = strArrSplit[this.f56815r];
        if (str.trim().isEmpty()) {
            jF = -9223372036854775807L;
        } else {
            jF = F(str);
            if (jF == -9223372036854775807L) {
                p.l(f56808t, dialogueLine.length() != 0 ? "Skipping invalid timing: ".concat(dialogueLine) : new String("Skipping invalid timing: "));
                return;
            }
        }
        cues.add(new androidx.media2.exoplayer.external.text.b(strArrSplit[this.f56816s].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        cueTimesUs.a(jF2);
        if (jF != -9223372036854775807L) {
            cues.add(androidx.media2.exoplayer.external.text.b.f56537o);
            cueTimesUs.a(jF);
        }
    }

    private void C(x data, List<androidx.media2.exoplayer.external.text.b> cues, q cueTimesUs) {
        while (true) {
            String strN = data.n();
            if (strN == null) {
                return;
            }
            if (!this.f56812o && strN.startsWith(f56810v)) {
                D(strN);
            } else if (strN.startsWith(f56811w)) {
                B(strN, cues, cueTimesUs);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    private void D(String formatLine) {
        String[] strArrSplit = TextUtils.split(formatLine.substring(8), ",");
        this.f56813p = strArrSplit.length;
        this.f56814q = -1;
        this.f56815r = -1;
        this.f56816s = -1;
        for (int i10 = 0; i10 < this.f56813p; i10++) {
            String strV0 = q0.V0(strArrSplit[i10].trim());
            strV0.getClass();
            switch (strV0) {
                case "end":
                    this.f56815r = i10;
                    break;
                case "text":
                    this.f56816s = i10;
                    break;
                case "start":
                    this.f56814q = i10;
                    break;
            }
        }
        if (this.f56814q == -1 || this.f56815r == -1 || this.f56816s == -1) {
            this.f56813p = 0;
        }
    }

    private void E(x data) {
        String strN;
        do {
            strN = data.n();
            if (strN == null) {
                return;
            }
        } while (!strN.startsWith("[Events]"));
    }

    public static long F(String timeString) {
        Matcher matcher = f56809u.matcher(timeString);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        int i10 = 3 << 4;
        return (Long.parseLong(matcher.group(1)) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected e y(byte[] bytes, int length, boolean reset) {
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        x xVar = new x(bytes, length);
        if (!this.f56812o) {
            E(xVar);
        }
        C(xVar, arrayList, qVar);
        androidx.media2.exoplayer.external.text.b[] bVarArr = new androidx.media2.exoplayer.external.text.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, qVar.d());
    }

    public a(@p0 List<byte[]> initializationData) {
        super(f56808t);
        if (initializationData == null || initializationData.isEmpty()) {
            this.f56812o = false;
            return;
        }
        this.f56812o = true;
        String strC = q0.C(initializationData.get(0));
        androidx.media2.exoplayer.external.util.a.a(strC.startsWith(f56810v));
        D(strC);
        E(new x(initializationData.get(1)));
    }
}
