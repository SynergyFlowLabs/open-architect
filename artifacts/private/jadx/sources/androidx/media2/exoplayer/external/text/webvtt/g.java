package androidx.media2.exoplayer.external.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g extends androidx.media2.exoplayer.external.text.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f57019t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f57020u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f57021v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f57022w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f57023x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f57024y = "NOTE";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f57025z = "STYLE";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f f57026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x f57027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e.b f57028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a f57029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<d> f57030s;

    public g() {
        super("WebvttDecoder");
        this.f57026o = new f();
        this.f57027p = new x();
        this.f57028q = new e.b();
        this.f57029r = new a();
        this.f57030s = new ArrayList();
    }

    private static int B(x parsableWebvttData) {
        int i10 = -1;
        int iC = 0;
        while (i10 == -1) {
            iC = parsableWebvttData.c();
            String strN = parsableWebvttData.n();
            if (strN == null) {
                i10 = 0;
            } else if (f57025z.equals(strN)) {
                i10 = 2;
            } else {
                i10 = strN.startsWith(f57024y) ? 1 : 3;
            }
        }
        parsableWebvttData.Q(iC);
        return i10;
    }

    private static void C(x parsableWebvttData) {
        while (!TextUtils.isEmpty(parsableWebvttData.n())) {
        }
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected androidx.media2.exoplayer.external.text.e y(byte[] bytes, int length, boolean reset) throws androidx.media2.exoplayer.external.text.g {
        this.f57027p.O(bytes, length);
        this.f57028q.c();
        this.f57030s.clear();
        try {
            h.e(this.f57027p);
            while (!TextUtils.isEmpty(this.f57027p.n())) {
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                int iB = B(this.f57027p);
                if (iB == 0) {
                    return new i(arrayList);
                }
                if (iB == 1) {
                    C(this.f57027p);
                } else if (iB == 2) {
                    if (!arrayList.isEmpty()) {
                        throw new androidx.media2.exoplayer.external.text.g("A style block was found after the first cue.");
                    }
                    this.f57027p.n();
                    this.f57030s.addAll(this.f57029r.d(this.f57027p));
                } else if (iB == 3 && this.f57026o.h(this.f57027p, this.f57028q, this.f57030s)) {
                    arrayList.add(this.f57028q.a());
                    this.f57028q.c();
                }
            }
        } catch (k0 e10) {
            throw new androidx.media2.exoplayer.external.text.g(e10);
        }
    }
}
