package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f48268a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f48269b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f48270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f48271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f48272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f48273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f48274g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f48275h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f48276i = 2;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f48277b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f48278a;

        private a(boolean z10) {
            this.f48278a = z10;
        }

        @Override // androidx.core.text.m.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = m.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA == 1) {
                        if (!this.f48278a) {
                            return 1;
                        }
                    }
                    i10++;
                    z10 = z10;
                } else if (this.f48278a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f48278a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f48279a = new b();

        private b() {
        }

        @Override // androidx.core.text.m.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = m.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f48280a;

        d(c cVar) {
            this.f48280a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f48280a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // androidx.core.text.l
        public boolean isRtl(char[] cArr, int i10, int i11) {
            return isRtl(CharBuffer.wrap(cArr), i10, i11);
        }

        @Override // androidx.core.text.l
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f48280a == null ? a() : b(charSequence, i10, i11);
        }
    }

    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f48281b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f48281b = z10;
        }

        @Override // androidx.core.text.m.d
        protected boolean a() {
            return this.f48281b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f48282b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.m.d
        protected boolean a() {
            return n.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f48279a;
        f48270c = new e(bVar, false);
        f48271d = new e(bVar, true);
        f48272e = new e(a.f48277b, false);
        f48273f = f.f48282b;
    }

    private m() {
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
