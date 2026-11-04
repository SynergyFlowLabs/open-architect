package androidx.core.content;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class j0 {

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static a f47539b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0384a f47540a = new C0384a();

        /* JADX INFO: renamed from: androidx.core.content.j0$a$a, reason: collision with other inner class name */
        private static class C0384a {
            C0384a() {
            }

            public void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        @Deprecated
        public static a b() {
            if (f47539b == null) {
                f47539b = new a();
            }
            return f47539b;
        }

        @Deprecated
        public void a(@NonNull SharedPreferences.Editor editor) {
            this.f47540a.a(editor);
        }
    }

    private j0() {
    }
}
