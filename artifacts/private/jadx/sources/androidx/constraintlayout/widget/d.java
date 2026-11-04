package androidx.constraintlayout.widget;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45815c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45816d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45817e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45818f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45819g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45820h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f45821i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f45822j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f45823k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45824l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f45825m = 25;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f45826n = new String(new char[25]).replace((char) 0, ' ');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.constraintlayout.core.f f45827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConstraintLayout f45828b;

    public d(ConstraintLayout constraintLayout) {
        this.f45827a = new androidx.constraintlayout.core.f();
        a(constraintLayout);
    }

    private String c(d dVar, int i10) {
        String str = h(i10) + " -> " + dVar.h(i10);
        String str2 = f45826n + g(i10);
        return "CL Perf: " + (str2.substring(str2.length() - f45825m) + " = ") + str;
    }

    private String d(DecimalFormat decimalFormat, d dVar, int i10) {
        int i11 = 5 >> 7;
        String str = f(decimalFormat, h(i10) * 1.0E-6f, 7) + " -> " + f(decimalFormat, dVar.h(i10) * 1.0E-6f, 7) + "ms";
        String str2 = f45826n + g(i10);
        return "CL Perf: " + (str2.substring(str2.length() - f45825m) + " = ") + str;
    }

    private String f(DecimalFormat decimalFormat, float f10, int i10) {
        String str = new String(new char[i10]).replace((char) 0, ' ') + decimalFormat.format(f10);
        return str.substring(str.length() - i10);
    }

    private String i(int i10) {
        String string = Long.toString(h(i10));
        String str = f45826n + g(i10);
        return "CL Perf: " + (str.substring(str.length() - f45825m) + " = ") + string;
    }

    private String j(DecimalFormat decimalFormat, int i10) {
        String strF = f(decimalFormat, h(i10) * 1.0E-6f, 7);
        String str = f45826n + g(i10);
        return "CL Perf: " + (str.substring(str.length() - f45825m) + " = ") + strF;
    }

    @e.a({"LogConditional"})
    private void k(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        j(decimalFormat, 5);
        j(decimalFormat, 7);
        j(decimalFormat, 6);
        i(1);
        i(2);
        i(3);
        i(4);
        i(8);
        i(9);
        i(10);
    }

    public void a(ConstraintLayout constraintLayout) {
        constraintLayout.fillMetrics(this.f45827a);
        this.f45828b = constraintLayout;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        return new d(this);
    }

    public void e() {
        ConstraintLayout constraintLayout = this.f45828b;
        if (constraintLayout != null) {
            constraintLayout.fillMetrics(null);
        }
    }

    String g(int i10) {
        switch (i10) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }

    public long h(int i10) {
        switch (i10) {
            case 1:
                return this.f45827a.M;
            case 2:
                return this.f45827a.Q;
            case 3:
                return this.f45827a.P;
            case 4:
                return this.f45827a.N;
            case 5:
                return this.f45827a.f43375a;
            case 6:
                return this.f45827a.O;
            case 7:
                return this.f45827a.f43376b;
            case 8:
                return this.f45827a.T;
            case 9:
                return this.f45827a.S;
            case 10:
                return this.f45827a.U;
            default:
                return 0L;
        }
    }

    public void l(String str) {
        k(str);
    }

    @e.a({"LogConditional"})
    public void m(String str, d dVar) {
        if (dVar == null) {
            k(str);
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        d(decimalFormat, dVar, 5);
        d(decimalFormat, dVar, 7);
        d(decimalFormat, dVar, 6);
        c(dVar, 1);
        c(dVar, 2);
        c(dVar, 3);
        c(dVar, 4);
        c(dVar, 8);
        c(dVar, 9);
        c(dVar, 10);
    }

    public void n() {
        this.f45827a.b();
    }

    public d(d dVar) {
        androidx.constraintlayout.core.f fVar = new androidx.constraintlayout.core.f();
        this.f45827a = fVar;
        fVar.a(dVar.f45827a);
    }
}
