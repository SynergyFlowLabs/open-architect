package androidx.core.view;

import android.view.ViewStructure;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48844a;

    @androidx.annotation.w0(23)
    private static class a {
        private a() {
        }

        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private j2(@NonNull ViewStructure viewStructure) {
        this.f48844a = viewStructure;
    }

    @NonNull
    @androidx.annotation.w0(23)
    public static j2 f(@NonNull ViewStructure viewStructure) {
        return new j2(viewStructure);
    }

    public void a(@NonNull String str) {
        a.a((ViewStructure) this.f48844a, str);
    }

    public void b(@NonNull CharSequence charSequence) {
        a.b((ViewStructure) this.f48844a, charSequence);
    }

    public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.c((ViewStructure) this.f48844a, i10, i11, i12, i13, i14, i15);
    }

    public void d(@NonNull CharSequence charSequence) {
        a.d((ViewStructure) this.f48844a, charSequence);
    }

    @NonNull
    @androidx.annotation.w0(23)
    public ViewStructure e() {
        return (ViewStructure) this.f48844a;
    }
}
