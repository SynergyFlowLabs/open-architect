package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40382a;

    @w0(23)
    private static class a {
        private a() {
        }

        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        static void e(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
            viewStructure.setId(i10, str, str2, str3);
        }

        static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void g(ViewStructure viewStructure, float f10, int i10, int i11, int i12) {
            viewStructure.setTextStyle(f10, i10, i11, i12);
        }
    }

    private d(ViewStructure viewStructure) {
        this.f40382a = viewStructure;
    }

    @w0(23)
    public static d i(ViewStructure viewStructure) {
        return new d(viewStructure);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.f40382a);
    }

    public void b(String str) {
        a.b((ViewStructure) this.f40382a, str);
    }

    public void c(CharSequence charSequence) {
        a.c((ViewStructure) this.f40382a, charSequence);
    }

    public void d(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.d((ViewStructure) this.f40382a, i10, i11, i12, i13, i14, i15);
    }

    public void e(int i10, String str, String str2, String str3) {
        a.e((ViewStructure) this.f40382a, i10, str, str2, str3);
    }

    public void f(CharSequence charSequence) {
        a.f((ViewStructure) this.f40382a, charSequence);
    }

    public void g(float f10, int i10, int i11, int i12) {
        a.g((ViewStructure) this.f40382a, f10, i10, i11, i12);
    }

    @w0(23)
    public ViewStructure h() {
        return (ViewStructure) this.f40382a;
    }
}
