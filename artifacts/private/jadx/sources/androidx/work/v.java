package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f77443a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile v f77444b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f77445c = "WM-";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f77446d = 23;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f77447e = 20;

    public static class a extends v {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f77448f;

        public a(int loggingLevel) {
            super(loggingLevel);
            this.f77448f = loggingLevel;
        }

        @Override // androidx.work.v
        public void a(@NonNull String tag, @NonNull String message) {
        }

        @Override // androidx.work.v
        public void b(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
        }

        @Override // androidx.work.v
        public void c(@NonNull String tag, @NonNull String message) {
        }

        @Override // androidx.work.v
        public void d(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
        }

        @Override // androidx.work.v
        public void f(@NonNull String tag, @NonNull String message) {
        }

        @Override // androidx.work.v
        public void g(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
        }

        @Override // androidx.work.v
        public void j(@NonNull String tag, @NonNull String message) {
        }

        @Override // androidx.work.v
        public void k(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
        }

        @Override // androidx.work.v
        public void l(@NonNull String tag, @NonNull String message) {
        }

        @Override // androidx.work.v
        public void m(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
        }
    }

    public v(int loggingLevel) {
    }

    @NonNull
    public static v e() {
        v vVar;
        synchronized (f77443a) {
            try {
                if (f77444b == null) {
                    f77444b = new a(3);
                }
                vVar = f77444b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public static void h(@NonNull v logger) {
        synchronized (f77443a) {
            try {
                f77444b = logger;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static String i(@NonNull String tag) {
        int length = tag.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(f77445c);
        int i10 = f77447e;
        if (length >= i10) {
            sb2.append(tag.substring(0, i10));
        } else {
            sb2.append(tag);
        }
        return sb2.toString();
    }

    public abstract void a(@NonNull String tag, @NonNull String message);

    public abstract void b(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void c(@NonNull String tag, @NonNull String message);

    public abstract void d(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void f(@NonNull String tag, @NonNull String message);

    public abstract void g(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void j(@NonNull String tag, @NonNull String message);

    public abstract void k(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void l(@NonNull String tag, @NonNull String message);

    public abstract void m(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);
}
