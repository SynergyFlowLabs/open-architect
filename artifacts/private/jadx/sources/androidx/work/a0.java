package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.lifecycle.w0;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes3.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    public static final b.c f76489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    public static final b.C0773b f76490b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f76491a;

            public a(@NonNull Throwable exception) {
                this.f76491a = exception;
            }

            @NonNull
            public Throwable a() {
                return this.f76491a;
            }

            @NonNull
            public String toString() {
                return "FAILURE (" + this.f76491a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: androidx.work.a0$b$b, reason: collision with other inner class name */
        public static final class C0773b extends b {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0773b() {
            }
        }

        public static final class c extends b {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        @b1({b1.a.LIBRARY_GROUP})
        b() {
        }
    }

    static {
        f76489a = new b.c();
        f76490b = new b.C0773b();
    }

    @NonNull
    t1<b.c> getResult();

    @NonNull
    w0<b> getState();
}
