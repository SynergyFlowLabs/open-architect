package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.t;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f51327a;

    @w0(19)
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f51328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f51329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f51330c = true;

        a(TextView textView) {
            this.f51328a = textView;
            this.f51329b = new d(textView);
        }

        @NonNull
        private InputFilter[] g(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f51329b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f51329b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> h(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        private InputFilter[] i(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayH = h(inputFilterArr);
            if (sparseArrayH.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayH.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayH.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        @p0
        private TransformationMethod k(@p0 TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void l() {
            this.f51328a.setFilters(a(this.f51328a.getFilters()));
        }

        @NonNull
        private TransformationMethod m(@p0 TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @NonNull
        InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return !this.f51330c ? i(inputFilterArr) : g(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f51330c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z10) {
            if (z10) {
                e();
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z10) {
            this.f51330c = z10;
            e();
            l();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            this.f51328a.setTransformationMethod(f(this.f51328a.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @p0
        TransformationMethod f(@p0 TransformationMethod transformationMethod) {
            return this.f51330c ? m(transformationMethod) : k(transformationMethod);
        }

        @b1({b1.a.LIBRARY})
        void j(boolean z10) {
            this.f51330c = z10;
        }
    }

    static class b {
        b() {
        }

        @NonNull
        InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        void c(boolean z10) {
        }

        void d(boolean z10) {
        }

        void e() {
        }

        @p0
        TransformationMethod f(@p0 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @w0(19)
    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f51331a;

        c(TextView textView) {
            this.f51331a = new a(textView);
        }

        private boolean g() {
            return !androidx.emoji2.text.f.q();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @NonNull
        InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return g() ? inputFilterArr : this.f51331a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f51331a.b();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z10) {
            if (g()) {
                return;
            }
            this.f51331a.c(z10);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z10) {
            if (g()) {
                this.f51331a.j(z10);
            } else {
                this.f51331a.d(z10);
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            if (g()) {
                return;
            }
            this.f51331a.e();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @p0
        TransformationMethod f(@p0 TransformationMethod transformationMethod) {
            return g() ? transformationMethod : this.f51331a.f(transformationMethod);
        }
    }

    public f(@NonNull TextView textView) {
        this(textView, true);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f51327a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f51327a.b();
    }

    public void c(boolean z10) {
        this.f51327a.c(z10);
    }

    public void d(boolean z10) {
        this.f51327a.d(z10);
    }

    public void e() {
        this.f51327a.e();
    }

    @p0
    public TransformationMethod f(@p0 TransformationMethod transformationMethod) {
        return this.f51327a.f(transformationMethod);
    }

    public f(@NonNull TextView textView, boolean z10) {
        t.m(textView, "textView cannot be null");
        if (z10) {
            this.f51327a = new a(textView);
        } else {
            this.f51327a = new c(textView);
        }
    }
}
